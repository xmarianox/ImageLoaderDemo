package la.funka.imageloaderdemo;

import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.view.SimpleDraweeView;
import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    private ImageView imageViewPicasso;
    private ImageView imageViewGlide;
    private SimpleDraweeView imageViewFresco;

    private String IMAGE_URL = "https://cdn-images-1.medium.com/max/2000/1*OcwUXOIUGgTF-NV7Ux9PCQ.jpeg";
    private String GIF_URL = "http://www.catgifpage.com/gifs/247.gif";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Fresco necesita ser inicializado
        Fresco.initialize(this);

        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        // GET Views
        imageViewPicasso = (ImageView) findViewById(R.id.imagePicasso);
        imageViewGlide   = (ImageView) findViewById(R.id.imageGlide);
        imageViewFresco  = (SimpleDraweeView) findViewById(R.id.imageFresco);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);

        //
        //Fresco

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Picasso implementacion basica
                Picasso.with(MainActivity.this)
                        .load(IMAGE_URL)
                        .fit()
                        .centerCrop()
                        .into(imageViewPicasso);

                // Glide implementacion basica
                Glide.with(MainActivity.this)
                        .load(IMAGE_URL)
                        .diskCacheStrategy(DiskCacheStrategy.ALL) // Cache
                        .centerCrop()
                        .into(imageViewGlide);

                // Fresco Example
                Uri uri = Uri.parse(IMAGE_URL);
                imageViewFresco.setImageURI(uri);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

# Implementación de las 3 libs de Image Loader
=======


## Picasso
=======
![Picasso Icon](https://github.com/square/picasso/blob/master/website/static/sample.png)

A powerful image downloading and caching library for Android

For more information please see [the website][1]

Download
--------

Download [the latest JAR][2] or grab via Gradle:
```groovy
compile 'com.squareup.picasso:picasso:2.5.2'
```
or Maven:
```xml
<dependency>
  <groupId>com.squareup.picasso</groupId>
  <artifactId>picasso</artifactId>
  <version>2.5.2</version>
</dependency>
```

ProGuard
--------

If you are using ProGuard you might need to add the following option:
```
-dontwarn com.squareup.okhttp.**
```


## Glide
=======
![Glide Icon](https://github.com/bumptech/glide/blob/master/static/glide_logo.png)

Glide is a fast and efficient open source media management and image loading framework for Android that wraps media
decoding, memory and disk caching, and resource pooling into a simple and easy to use interface.

Download
--------
You can download a jar from GitHub's [releases page][1].

Or use Gradle:

```gradle
repositories {
    mavenCentral()
}

dependencies {
    compile 'com.github.bumptech.glide:glide:3.6.1'
    compile 'com.android.support:support-v4:19.1.0'
}
```

Or Maven:

```xml
<dependency>
    <groupId>com.github.bumptech.glide</groupId>
    <artifactId>glide</artifactId>
    <version>3.6.1</version>
</dependency>
<dependency>
    <groupId>com.google.android</groupId>
    <artifactId>support-v4</artifactId>
    <version>r7</version>
</dependency>
```

Proguard
--------
Depending on your proguard config and usage, you may need to include the following lines in your proguard.cfg:

```pro
-keep public class * implements com.bumptech.glide.module.GlideModule
-keep public enum com.bumptech.glide.load.resource.bitmap.ImageHeaderParser$** {
    **[] $VALUES;
    public *;
}
```


## Fresco
=======
![Fresco Icon](http://frescolib.org/static/fresco-hero-logo.png)

Fresco is a powerful system for displaying images in Android applications.

Fresco takes care of image loading and display, so you don't have to. It will load images from the network, local storage, or local resources, and display a placeholder until the image has arrived. It has two levels of cache; one in memory and another in internal storage.

In Android 4.x and lower, Fresco puts images in a special region of Android memory. This lets your application run faster - and suffer the dreaded `OutOfMemoryError` much less often.

Fresco also supports:

* streaming of progressive JPEGs
* display of animated GIFs and WebPs
* extensive customization of image loading and display
* and much more!

Find out more at our [website](http://frescolib.org/index.html).

## Using Fresco in your application

If you are building with Gradle, simply add the following line to the `dependencies` section of your `build.gradle` file:

```groovy
compile 'com.facebook.fresco:fresco:0.8.0+'
```


## Desarrollada por:

- Mariano  [@xsincrueldadx](https://twitter.com/xsincrueldadx)


## License

    Copyright 2014 Subte.io

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
# Supabase
-keep class io.github.supabase.** { *; }
-keep interface io.github.supabase.** { *; }

# Serialization
-keepattributes *Annotation*, InnerClasses
-dontnote kotlinx.serialization.SerializationKt
-keep,includedescriptorclasses class kotlinx.serialization.** { *; }

# ML Kit
-keep class com.google.mlkit.** { *; }

# Camera
-keep class androidx.camera.** { *; }

package androidx.media;

import defpackage.f51;
import defpackage.h51;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(f51 f51Var) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        h51 h51VarH = audioAttributesCompat.a;
        if (f51Var.e(1)) {
            h51VarH = f51Var.h();
        }
        audioAttributesCompat.a = (AudioAttributesImpl) h51VarH;
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, f51 f51Var) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        f51Var.getClass();
        AudioAttributesImpl audioAttributesImpl = audioAttributesCompat.a;
        f51Var.i(1);
        f51Var.k(audioAttributesImpl);
    }
}

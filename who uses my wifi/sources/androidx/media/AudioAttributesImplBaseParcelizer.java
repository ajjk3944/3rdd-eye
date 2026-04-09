package androidx.media;

import defpackage.f51;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(f51 f51Var) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.a = f51Var.f(audioAttributesImplBase.a, 1);
        audioAttributesImplBase.b = f51Var.f(audioAttributesImplBase.b, 2);
        audioAttributesImplBase.c = f51Var.f(audioAttributesImplBase.c, 3);
        audioAttributesImplBase.d = f51Var.f(audioAttributesImplBase.d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, f51 f51Var) {
        f51Var.getClass();
        f51Var.j(audioAttributesImplBase.a, 1);
        f51Var.j(audioAttributesImplBase.b, 2);
        f51Var.j(audioAttributesImplBase.c, 3);
        f51Var.j(audioAttributesImplBase.d, 4);
    }
}

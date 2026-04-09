package androidx.media;

import android.media.AudioAttributes;
import defpackage.f51;
import defpackage.g51;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(f51 f51Var) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.a = (AudioAttributes) f51Var.g(audioAttributesImplApi21.a, 1);
        audioAttributesImplApi21.b = f51Var.f(audioAttributesImplApi21.b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, f51 f51Var) {
        f51Var.getClass();
        AudioAttributes audioAttributes = audioAttributesImplApi21.a;
        f51Var.i(1);
        ((g51) f51Var).e.writeParcelable(audioAttributes, 0);
        f51Var.j(audioAttributesImplApi21.b, 2);
    }
}

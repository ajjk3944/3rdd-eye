package androidx.media;

import android.media.AudioAttributes;
import v7.a;

/* loaded from: classes.dex */
public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(a aVar) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.f1534a = (AudioAttributes) aVar.g(audioAttributesImplApi21.f1534a, 1);
        audioAttributesImplApi21.f1535b = aVar.f(audioAttributesImplApi21.f1535b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, a aVar) {
        aVar.getClass();
        aVar.k(audioAttributesImplApi21.f1534a, 1);
        aVar.j(audioAttributesImplApi21.f1535b, 2);
    }
}

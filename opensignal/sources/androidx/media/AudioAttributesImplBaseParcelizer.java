package androidx.media;

import v7.a;

/* loaded from: classes.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(a aVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f1536a = aVar.f(audioAttributesImplBase.f1536a, 1);
        audioAttributesImplBase.f1537b = aVar.f(audioAttributesImplBase.f1537b, 2);
        audioAttributesImplBase.f1538c = aVar.f(audioAttributesImplBase.f1538c, 3);
        audioAttributesImplBase.f1539d = aVar.f(audioAttributesImplBase.f1539d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, a aVar) {
        aVar.getClass();
        aVar.j(audioAttributesImplBase.f1536a, 1);
        aVar.j(audioAttributesImplBase.f1537b, 2);
        aVar.j(audioAttributesImplBase.f1538c, 3);
        aVar.j(audioAttributesImplBase.f1539d, 4);
    }
}

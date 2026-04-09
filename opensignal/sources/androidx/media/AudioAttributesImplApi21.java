package androidx.media;

import android.media.AudioAttributes;

/* loaded from: classes.dex */
public class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* renamed from: a, reason: collision with root package name */
    public AudioAttributes f1534a;

    /* renamed from: b, reason: collision with root package name */
    public int f1535b = -1;

    public final boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplApi21) {
            return this.f1534a.equals(((AudioAttributesImplApi21) obj).f1534a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1534a.hashCode();
    }

    public final String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f1534a;
    }
}

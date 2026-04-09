package r3;

import android.media.AudioAttributes;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class n {
    public static AudioAttributes a(AudioAttributes.Builder builder) {
        return builder.build();
    }

    public static AudioAttributes.Builder b() {
        return new AudioAttributes.Builder();
    }

    public static AudioAttributes.Builder c(AudioAttributes.Builder builder, int i4) {
        return builder.setContentType(i4);
    }

    public static AudioAttributes.Builder d(AudioAttributes.Builder builder, int i4) {
        return builder.setUsage(i4);
    }
}

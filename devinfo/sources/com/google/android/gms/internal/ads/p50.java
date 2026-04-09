package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;
import android.os.Build;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class p50 {

    /* renamed from: b, reason: collision with root package name */
    public static final p50 f14899b = new p50();

    /* renamed from: a, reason: collision with root package name */
    public AudioAttributes f14900a;

    static {
        String str = bq0.f9768a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
    }

    public final AudioAttributes a() {
        if (this.f14900a == null) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(0).setFlags(0).setUsage(1);
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 29) {
                usage.setAllowedCapturePolicy(1);
                usage.setHapticChannelsMuted(true);
            }
            if (i4 >= 32) {
                usage.setSpatializationBehavior(0);
                usage.setIsContentSpatialized(false);
            }
            this.f14900a = usage.build();
        }
        return this.f14900a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p50.class != obj.getClass()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return -436042064;
    }
}

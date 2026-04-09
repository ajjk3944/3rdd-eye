package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;
import android.os.Build;

/* renamed from: com.google.android.gms.internal.ads.Sj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0729Sj {

    /* renamed from: b, reason: collision with root package name */
    public static final C0729Sj f11224b = new C0729Sj();

    /* renamed from: a, reason: collision with root package name */
    public AudioAttributes f11225a;

    static {
        String str = Vt.f12096a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
    }

    public final AudioAttributes a() {
        if (this.f11225a == null) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(0).setFlags(0).setUsage(1);
            int i = Build.VERSION.SDK_INT;
            if (i >= 29) {
                usage.setAllowedCapturePolicy(1);
                usage.setHapticChannelsMuted(true);
            }
            if (i >= 32) {
                usage.setSpatializationBehavior(0);
                usage.setIsContentSpatialized(false);
            }
            this.f11225a = usage.build();
        }
        return this.f11225a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0729Sj.class != obj.getClass()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return -436042064;
    }
}

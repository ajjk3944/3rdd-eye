package y9;

import android.media.AudioAttributes;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public static final b f25910b = new b();

    /* renamed from: a, reason: collision with root package name */
    public AudioAttributes f25911a;

    public final AudioAttributes a() {
        if (this.f25911a == null) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(0).setFlags(0).setUsage(1);
            if (qb.v.f20828a >= 29) {
                usage.setAllowedCapturePolicy(1);
            }
            this.f25911a = usage.build();
        }
        return this.f25911a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return 15699889;
    }
}

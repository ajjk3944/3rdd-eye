package defpackage;

import java.util.Locale;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class sr1 {
    public static final sr1 d = new sr1(1.0f, 1.0f);
    public final float a;
    public final float b;
    public final int c;

    static {
        String str = v23.a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public sr1(float f, float f2) {
        zt0.D(f > 0.0f);
        zt0.D(f2 > 0.0f);
        this.a = f;
        this.b = f2;
        this.c = Math.round(f * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && sr1.class == obj.getClass()) {
            sr1 sr1Var = (sr1) obj;
            if (this.a == sr1Var.a && this.b == sr1Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.b) + ((Float.floatToRawIntBits(this.a) + 527) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.a), Float.valueOf(this.b)};
        String str = v23.a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }
}

package androidx.media3.common;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class l0 extends u0 {

    /* renamed from: r, reason: collision with root package name */
    public static final String f1716r;

    /* renamed from: x, reason: collision with root package name */
    public static final ab.c f1717x;

    /* renamed from: g, reason: collision with root package name */
    public final float f1718g;

    static {
        int i10 = a5.d0.f105a;
        f1716r = Integer.toString(1, 36);
        f1717x = new ab.c(11);
    }

    public l0() {
        this.f1718g = -1.0f;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l0) {
            return this.f1718g == ((l0) obj).f1718g;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f1718g)});
    }

    public l0(float f10) {
        a5.a.d("percent must be in the range of [0, 100]", f10 >= 0.0f && f10 <= 100.0f);
        this.f1718g = f10;
    }
}

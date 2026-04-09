package androidx.media3.common;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class v0 extends u0 {
    public static final ab.c B;

    /* renamed from: x, reason: collision with root package name */
    public static final String f1808x;

    /* renamed from: y, reason: collision with root package name */
    public static final String f1809y;

    /* renamed from: g, reason: collision with root package name */
    public final int f1810g;

    /* renamed from: r, reason: collision with root package name */
    public final float f1811r;

    static {
        int i10 = a5.d0.f105a;
        f1808x = Integer.toString(1, 36);
        f1809y = Integer.toString(2, 36);
        B = new ab.c(13);
    }

    public v0(int i10) {
        a5.a.d("maxStars must be a positive integer", i10 > 0);
        this.f1810g = i10;
        this.f1811r = -1.0f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return this.f1810g == v0Var.f1810g && this.f1811r == v0Var.f1811r;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f1810g), Float.valueOf(this.f1811r)});
    }

    public v0(int i10, float f10) {
        boolean z10 = false;
        a5.a.d("maxStars must be a positive integer", i10 > 0);
        if (f10 >= 0.0f && f10 <= i10) {
            z10 = true;
        }
        a5.a.d("starRating is out of range [0, maxStars]", z10);
        this.f1810g = i10;
        this.f1811r = f10;
    }
}

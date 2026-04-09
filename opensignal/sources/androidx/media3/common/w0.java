package androidx.media3.common;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class w0 extends u0 {
    public static final ab.c B;

    /* renamed from: x, reason: collision with root package name */
    public static final String f1818x;

    /* renamed from: y, reason: collision with root package name */
    public static final String f1819y;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f1820g;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f1821r;

    static {
        int i10 = a5.d0.f105a;
        f1818x = Integer.toString(1, 36);
        f1819y = Integer.toString(2, 36);
        B = new ab.c(14);
    }

    public w0() {
        this.f1820g = false;
        this.f1821r = false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        return this.f1821r == w0Var.f1821r && this.f1820g == w0Var.f1820g;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f1820g), Boolean.valueOf(this.f1821r)});
    }

    public w0(boolean z10) {
        this.f1820g = true;
        this.f1821r = z10;
    }
}

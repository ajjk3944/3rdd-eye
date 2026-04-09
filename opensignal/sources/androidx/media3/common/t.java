package androidx.media3.common;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class t extends u0 {
    public static final ab.c B;

    /* renamed from: x, reason: collision with root package name */
    public static final String f1796x;

    /* renamed from: y, reason: collision with root package name */
    public static final String f1797y;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f1798g;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f1799r;

    static {
        int i10 = a5.d0.f105a;
        f1796x = Integer.toString(1, 36);
        f1797y = Integer.toString(2, 36);
        B = new ab.c(5);
    }

    public t() {
        this.f1798g = false;
        this.f1799r = false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f1799r == tVar.f1799r && this.f1798g == tVar.f1798g;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f1798g), Boolean.valueOf(this.f1799r)});
    }

    public t(boolean z10) {
        this.f1798g = true;
        this.f1799r = z10;
    }
}

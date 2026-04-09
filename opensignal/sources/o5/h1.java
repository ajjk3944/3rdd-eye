package o5;

/* loaded from: classes.dex */
public final class h1 implements androidx.media3.common.i {

    /* renamed from: r, reason: collision with root package name */
    public static final h1 f18956r = new h1(new androidx.media3.common.b1[0]);

    /* renamed from: x, reason: collision with root package name */
    public static final String f18957x;

    /* renamed from: a, reason: collision with root package name */
    public final int f18958a;

    /* renamed from: d, reason: collision with root package name */
    public final oe.u0 f18959d;

    /* renamed from: g, reason: collision with root package name */
    public int f18960g;

    static {
        int i10 = a5.d0.f105a;
        f18957x = Integer.toString(0, 36);
    }

    public h1(androidx.media3.common.b1... b1VarArr) {
        oe.u0 u0VarM = oe.h0.m(b1VarArr);
        this.f18959d = u0VarM;
        this.f18958a = b1VarArr.length;
        int i10 = 0;
        while (i10 < u0VarM.f19385r) {
            int i11 = i10 + 1;
            for (int i12 = i11; i12 < u0VarM.f19385r; i12++) {
                if (((androidx.media3.common.b1) u0VarM.get(i10)).equals(u0VarM.get(i12))) {
                    a5.a.n("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i10 = i11;
        }
    }

    public final androidx.media3.common.b1 a(int i10) {
        return (androidx.media3.common.b1) this.f18959d.get(i10);
    }

    public final int b(androidx.media3.common.b1 b1Var) {
        int iIndexOf = this.f18959d.indexOf(b1Var);
        if (iIndexOf >= 0) {
            return iIndexOf;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h1.class != obj.getClass()) {
            return false;
        }
        h1 h1Var = (h1) obj;
        return this.f18958a == h1Var.f18958a && this.f18959d.equals(h1Var.f18959d);
    }

    public final int hashCode() {
        if (this.f18960g == 0) {
            this.f18960g = this.f18959d.hashCode();
        }
        return this.f18960g;
    }
}

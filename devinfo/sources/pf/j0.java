package pf;

import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class j0 {
    public static final i0 Companion = new i0();

    /* renamed from: d, reason: collision with root package name */
    public static final il.a[] f31854d;

    /* renamed from: a, reason: collision with root package name */
    public final n0 f31855a;

    /* renamed from: b, reason: collision with root package name */
    public final f1 f31856b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f31857c;

    static {
        ml.p pVar = ml.p.f29436a;
        f31854d = new il.a[]{null, null, new ml.h(z.f31929a)};
    }

    public /* synthetic */ j0(int i4, n0 n0Var, f1 f1Var, Map map) {
        if (1 != (i4 & 1)) {
            ml.k.a(i4, 1, h0.f31833a.d());
            throw null;
        }
        this.f31855a = n0Var;
        if ((i4 & 2) == 0) {
            this.f31856b = null;
        } else {
            this.f31856b = f1Var;
        }
        if ((i4 & 4) == 0) {
            this.f31857c = null;
        } else {
            this.f31857c = map;
        }
    }

    public static j0 a(j0 j0Var, n0 n0Var, f1 f1Var, Map map, int i4) {
        if ((i4 & 1) != 0) {
            n0Var = j0Var.f31855a;
        }
        if ((i4 & 2) != 0) {
            f1Var = j0Var.f31856b;
        }
        if ((i4 & 4) != 0) {
            map = j0Var.f31857c;
        }
        j0Var.getClass();
        nk.k.e(n0Var, "sessionDetails");
        return new j0(n0Var, f1Var, map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return nk.k.a(this.f31855a, j0Var.f31855a) && nk.k.a(this.f31856b, j0Var.f31856b) && nk.k.a(this.f31857c, j0Var.f31857c);
    }

    public final int hashCode() {
        int iHashCode = this.f31855a.hashCode() * 31;
        f1 f1Var = this.f31856b;
        int iHashCode2 = (iHashCode + (f1Var == null ? 0 : f1Var.hashCode())) * 31;
        Map map = this.f31857c;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        return "SessionData(sessionDetails=" + this.f31855a + ", backgroundTime=" + this.f31856b + ", processDataMap=" + this.f31857c + ')';
    }

    public j0(n0 n0Var, f1 f1Var, Map map) {
        nk.k.e(n0Var, "sessionDetails");
        this.f31855a = n0Var;
        this.f31856b = f1Var;
        this.f31857c = map;
    }
}

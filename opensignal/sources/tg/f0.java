package tg;

import java.util.Map;

/* loaded from: classes.dex */
public final class f0 {
    public static final e0 Companion = new e0();

    /* renamed from: d, reason: collision with root package name */
    public static final gu.a[] f22773d;

    /* renamed from: a, reason: collision with root package name */
    public final j0 f22774a;

    /* renamed from: b, reason: collision with root package name */
    public final d1 f22775b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f22776c;

    static {
        ku.c1 c1Var = ku.c1.f14534a;
        f22773d = new gu.a[]{null, null, new ku.g0(w.f22861a)};
    }

    public /* synthetic */ f0(int i10, j0 j0Var, d1 d1Var, Map map) {
        if (1 != (i10 & 1)) {
            ku.p0.f(i10, 1, d0.f22759a.getDescriptor());
            throw null;
        }
        this.f22774a = j0Var;
        if ((i10 & 2) == 0) {
            this.f22775b = null;
        } else {
            this.f22775b = d1Var;
        }
        if ((i10 & 4) == 0) {
            this.f22776c = null;
        } else {
            this.f22776c = map;
        }
    }

    public static f0 a(f0 f0Var, j0 j0Var, d1 d1Var, Map map, int i10) {
        if ((i10 & 1) != 0) {
            j0Var = f0Var.f22774a;
        }
        if ((i10 & 2) != 0) {
            d1Var = f0Var.f22775b;
        }
        if ((i10 & 4) != 0) {
            map = f0Var.f22776c;
        }
        f0Var.getClass();
        br.l.e(j0Var, "sessionDetails");
        return new f0(j0Var, d1Var, map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return br.l.a(this.f22774a, f0Var.f22774a) && br.l.a(this.f22775b, f0Var.f22775b) && br.l.a(this.f22776c, f0Var.f22776c);
    }

    public final int hashCode() {
        int iHashCode = this.f22774a.hashCode() * 31;
        d1 d1Var = this.f22775b;
        int iHashCode2 = (iHashCode + (d1Var == null ? 0 : Long.hashCode(d1Var.f22760a))) * 31;
        Map map = this.f22776c;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        return "SessionData(sessionDetails=" + this.f22774a + ", backgroundTime=" + this.f22775b + ", processDataMap=" + this.f22776c + ')';
    }

    public f0(j0 j0Var, d1 d1Var, Map map) {
        br.l.e(j0Var, "sessionDetails");
        this.f22774a = j0Var;
        this.f22775b = d1Var;
        this.f22776c = map;
    }
}

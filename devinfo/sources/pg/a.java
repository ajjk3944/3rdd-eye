package pg;

import je.u;
import p1.s;
import yj.q;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f31933a;

    /* renamed from: b, reason: collision with root package name */
    public final long f31934b;

    /* renamed from: c, reason: collision with root package name */
    public final long f31935c;

    /* renamed from: d, reason: collision with root package name */
    public final long f31936d;

    /* renamed from: e, reason: collision with root package name */
    public final long f31937e;

    /* renamed from: f, reason: collision with root package name */
    public final long f31938f;
    public final long g;

    /* renamed from: h, reason: collision with root package name */
    public final long f31939h;

    /* renamed from: i, reason: collision with root package name */
    public s f31940i;

    public a(long j, long j8, long j9, long j10, long j11, long j12, long j13, long j14) {
        this.f31933a = j;
        this.f31934b = j8;
        this.f31935c = j9;
        this.f31936d = j10;
        this.f31937e = j11;
        this.f31938f = j12;
        this.g = j13;
        this.f31939h = j14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.c(this.f31933a, aVar.f31933a) && s.c(this.f31934b, aVar.f31934b) && s.c(this.f31935c, aVar.f31935c) && s.c(this.f31936d, aVar.f31936d) && s.c(this.f31937e, aVar.f31937e) && s.c(this.f31938f, aVar.f31938f) && s.c(this.g, aVar.g) && s.c(this.f31939h, aVar.f31939h);
    }

    public final int hashCode() {
        int i4 = s.f31019i;
        return q.a(this.f31939h) + a0.g.f(a0.g.f(a0.g.f(a0.g.f(a0.g.f(a0.g.f(q.a(this.f31933a) * 31, 31, this.f31934b), 31, this.f31935c), 31, this.f31936d), 31, this.f31937e), 31, this.f31938f), 31, this.g);
    }

    public final String toString() {
        String strI = s.i(this.f31933a);
        String strI2 = s.i(this.f31934b);
        String strI3 = s.i(this.f31935c);
        String strI4 = s.i(this.f31936d);
        String strI5 = s.i(this.f31937e);
        String strI6 = s.i(this.f31938f);
        String strI7 = s.i(this.g);
        String strI8 = s.i(this.f31939h);
        StringBuilder sbO = r5.c.o("AppColors(textPrimary=", strI, ", textPrimaryInverse=", strI2, ", textSecondary=");
        u.B(sbO, strI3, ", textSecondaryInverse=", strI4, ", topAppBarBackground=");
        u.B(sbO, strI5, ", background=", strI6, ", dialogBackground=");
        return a0.g.p(sbO, strI7, ", commonDivider=", strI8, ")");
    }
}

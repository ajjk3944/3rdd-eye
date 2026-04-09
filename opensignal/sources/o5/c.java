package o5;

/* loaded from: classes.dex */
public final class c implements x0 {

    /* renamed from: a, reason: collision with root package name */
    public final x0 f18894a;

    /* renamed from: d, reason: collision with root package name */
    public boolean f18895d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ d f18896g;

    public c(d dVar, x0 x0Var) {
        this.f18896g = dVar;
        this.f18894a = x0Var;
    }

    @Override // o5.x0
    public final void a() {
        this.f18894a.a();
    }

    @Override // o5.x0
    public final boolean b() {
        return !this.f18896g.a() && this.f18894a.b();
    }

    @Override // o5.x0
    public final int h(long j) {
        if (this.f18896g.a()) {
            return -3;
        }
        return this.f18894a.h(j);
    }

    @Override // o5.x0
    public final int j(io.sentry.internal.debugmeta.c cVar, c5.g gVar, int i10) {
        d dVar = this.f18896g;
        if (dVar.a()) {
            return -3;
        }
        if (this.f18895d) {
            gVar.f3295d = 4;
            return -4;
        }
        int iJ = this.f18894a.j(cVar, gVar, i10);
        if (iJ != -5) {
            long j = dVar.f18912y;
            if (j == Long.MIN_VALUE || ((iJ != -4 || gVar.f3308y < j) && !(iJ == -3 && dVar.m() == Long.MIN_VALUE && !gVar.f3307x))) {
                return iJ;
            }
            gVar.p();
            gVar.f3295d = 4;
            this.f18895d = true;
            return -4;
        }
        androidx.media3.common.r rVar = (androidx.media3.common.r) cVar.f12354g;
        rVar.getClass();
        int i11 = rVar.Y;
        int i12 = rVar.X;
        if (i12 == 0 && i11 == 0) {
            return -5;
        }
        if (dVar.f18911x != 0) {
            i12 = 0;
        }
        if (dVar.f18912y != Long.MIN_VALUE) {
            i11 = 0;
        }
        androidx.media3.common.q qVarA = rVar.a();
        qVarA.A = i12;
        qVarA.B = i11;
        cVar.f12354g = new androidx.media3.common.r(qVarA);
        return -5;
    }
}

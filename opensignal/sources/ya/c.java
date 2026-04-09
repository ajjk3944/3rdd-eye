package ya;

import com.google.android.exoplayer2.Format;

/* loaded from: classes.dex */
public final class c implements s0 {

    /* renamed from: a, reason: collision with root package name */
    public final s0 f26039a;

    /* renamed from: d, reason: collision with root package name */
    public boolean f26040d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ d f26041g;

    public c(d dVar, s0 s0Var) {
        this.f26041g = dVar;
        this.f26039a = s0Var;
    }

    @Override // ya.s0
    public final void a() {
        this.f26039a.a();
    }

    @Override // ya.s0
    public final boolean b() {
        return !this.f26041g.a() && this.f26039a.b();
    }

    @Override // ya.s0
    public final int h(long j) {
        if (this.f26041g.a()) {
            return -3;
        }
        return this.f26039a.h(j);
    }

    @Override // ya.s0
    public final int j(io.sentry.internal.debugmeta.c cVar, z9.d dVar, int i10) {
        d dVar2 = this.f26041g;
        if (dVar2.a()) {
            return -3;
        }
        if (this.f26040d) {
            dVar.f3295d = 4;
            return -4;
        }
        int iJ = this.f26039a.j(cVar, dVar, i10);
        if (iJ != -5) {
            long j = dVar2.f26046x;
            if (j == Long.MIN_VALUE || ((iJ != -4 || dVar.f26793y < j) && !(iJ == -3 && dVar2.m() == Long.MIN_VALUE && !dVar.f26792x))) {
                return iJ;
            }
            dVar.p();
            dVar.f3295d = 4;
            this.f26040d = true;
            return -4;
        }
        Format format = (Format) cVar.f12354g;
        format.getClass();
        int i11 = format.Y;
        int i12 = format.X;
        if (i12 == 0 && i11 == 0) {
            return -5;
        }
        if (dVar2.f26046x != Long.MIN_VALUE) {
            i11 = 0;
        }
        com.google.android.exoplayer2.g0 g0VarD = format.d();
        g0VarD.A = i12;
        g0VarD.B = i11;
        cVar.f12354g = new Format(g0VarD);
        return -5;
    }
}

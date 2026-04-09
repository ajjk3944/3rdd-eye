package p5;

import o5.e0;
import o5.w0;
import o5.x0;

/* loaded from: classes.dex */
public final class g implements x0 {

    /* renamed from: a, reason: collision with root package name */
    public final i f20270a;

    /* renamed from: d, reason: collision with root package name */
    public final w0 f20271d;

    /* renamed from: g, reason: collision with root package name */
    public final int f20272g;

    /* renamed from: r, reason: collision with root package name */
    public boolean f20273r;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ i f20274x;

    public g(i iVar, i iVar2, w0 w0Var, int i10) {
        this.f20274x = iVar;
        this.f20270a = iVar2;
        this.f20271d = w0Var;
        this.f20272g = i10;
    }

    @Override // o5.x0
    public final boolean b() {
        i iVar = this.f20274x;
        return !iVar.w() && this.f20271d.q(iVar.S);
    }

    public final void c() {
        if (this.f20273r) {
            return;
        }
        i iVar = this.f20274x;
        e0 e0Var = iVar.B;
        int[] iArr = iVar.f20276d;
        int i10 = this.f20272g;
        e0Var.b(iArr[i10], iVar.f20277g[i10], 0, null, iVar.P);
        this.f20273r = true;
    }

    @Override // o5.x0
    public final int h(long j) throws Throwable {
        i iVar = this.f20274x;
        if (iVar.w()) {
            return 0;
        }
        boolean z10 = iVar.S;
        w0 w0Var = this.f20271d;
        int iO = w0Var.o(j, z10);
        a aVar = iVar.R;
        if (aVar != null) {
            iO = Math.min(iO, aVar.e(this.f20272g + 1) - w0Var.m());
        }
        w0Var.y(iO);
        if (iO > 0) {
            c();
        }
        return iO;
    }

    @Override // o5.x0
    public final int j(io.sentry.internal.debugmeta.c cVar, c5.g gVar, int i10) {
        i iVar = this.f20274x;
        if (iVar.w()) {
            return -3;
        }
        a aVar = iVar.R;
        w0 w0Var = this.f20271d;
        if (aVar != null && aVar.e(this.f20272g + 1) <= w0Var.m()) {
            return -3;
        }
        c();
        return w0Var.v(cVar, gVar, i10, iVar.S);
    }

    @Override // o5.x0
    public final void a() {
    }
}

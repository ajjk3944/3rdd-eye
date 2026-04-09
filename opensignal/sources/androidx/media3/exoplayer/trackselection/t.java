package androidx.media3.exoplayer.trackselection;

import a5.d0;
import oe.s0;

/* loaded from: classes.dex */
public final class t extends s {
    public final boolean B;
    public final boolean D;
    public final int E;
    public final int F;
    public final int G;
    public final int H;
    public final boolean I;
    public final boolean J;
    public final int K;
    public final boolean L;
    public final boolean M;
    public final int N;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f1924x;

    /* renamed from: y, reason: collision with root package name */
    public final l f1925y;

    /* JADX WARN: Removed duplicated region for block: B:31:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public t(int r6, androidx.media3.common.b1 r7, int r8, androidx.media3.exoplayer.trackselection.l r9, int r10, int r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.trackselection.t.<init>(int, androidx.media3.common.b1, int, androidx.media3.exoplayer.trackselection.l, int, int, boolean):void");
    }

    public static int c(t tVar, t tVar2) {
        oe.a0 a0VarB = oe.a0.f19295a.c(tVar.D, tVar2.D).a(tVar.H, tVar2.H).c(tVar.I, tVar2.I).c(tVar.f1924x, tVar2.f1924x).c(tVar.B, tVar2.B).b(Integer.valueOf(tVar.G), Integer.valueOf(tVar2.G), s0.f19373g);
        boolean z10 = tVar.L;
        oe.a0 a0VarC = a0VarB.c(z10, tVar2.L);
        boolean z11 = tVar.M;
        oe.a0 a0VarC2 = a0VarC.c(z11, tVar2.M);
        if (z10 && z11) {
            a0VarC2 = a0VarC2.a(tVar.N, tVar2.N);
        }
        return a0VarC2.e();
    }

    @Override // androidx.media3.exoplayer.trackselection.s
    public final int a() {
        return this.K;
    }

    @Override // androidx.media3.exoplayer.trackselection.s
    public final boolean b(s sVar) {
        t tVar = (t) sVar;
        if (!this.J && !d0.a(this.f1923r.H, tVar.f1923r.H)) {
            return false;
        }
        if (this.f1925y.Z) {
            return true;
        }
        return this.L == tVar.L && this.M == tVar.M;
    }
}

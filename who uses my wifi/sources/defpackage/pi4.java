package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class pi4 implements li4 {
    public final li4 a;
    public final long b;

    public pi4(li4 li4Var, long j) {
        this.a = li4Var;
        this.b = j;
    }

    @Override // defpackage.li4
    public final int a(mr2 mr2Var, vw3 vw3Var, int i) {
        int iA = this.a.a(mr2Var, vw3Var, i);
        if (iA != -4) {
            return iA;
        }
        vw3Var.g += this.b;
        return -4;
    }

    @Override // defpackage.li4
    public final boolean d() {
        return this.a.d();
    }

    @Override // defpackage.li4
    public final int f(long j) {
        return this.a.f(j - this.b);
    }

    @Override // defpackage.li4
    public final void h() {
        this.a.h();
    }
}

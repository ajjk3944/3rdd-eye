package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class yf3 implements sd3, ll3, ks2, pj {
    public final Object f;

    public /* synthetic */ yf3(Object obj) {
        this.f = obj;
    }

    public static yf3 b(byte[] bArr) {
        return new yf3(v34.a(bArr));
    }

    public static yf3 d(int i) {
        return new yf3(v34.a(hw3.a(i)));
    }

    @Override // defpackage.ll3
    public /* synthetic */ Object a() {
        return (lj4) this.f;
    }

    @Override // defpackage.ks2
    /* renamed from: c */
    public /* synthetic */ void mo12c(Object obj) {
        int i = ya4.g0;
        ((zt1) obj).B(((dc4) this.f).e);
    }

    @Override // defpackage.pj
    public Object f(gi4 gi4Var) {
        mr2 mr2Var = (mr2) this.f;
        if (gi4Var.c() || gi4Var.d) {
            return gi4Var;
        }
        Exception excA = gi4Var.a();
        if (!(excA instanceof y4)) {
            return gi4Var;
        }
        int i = ((y4) excA).f.f;
        if (i == 43001 || i == 43002 || i == 43003 || i == 17) {
            return ((xb4) mr2Var.h).h();
        }
        if (i == 43000) {
            Exception exc = new Exception("Failed to get app set ID due to an internal error. Please try again later.");
            gi4 gi4Var2 = new gi4();
            gi4Var2.d(exc);
            return gi4Var2;
        }
        if (i != 15) {
            return gi4Var;
        }
        Exception exc2 = new Exception("The operation to get app set ID timed out. Please try again later.");
        gi4 gi4Var3 = new gi4();
        gi4Var3.d(exc2);
        return gi4Var3;
    }

    @Override // defpackage.sd3
    public void j(int i, long j, String str) {
        ((gb4) this.f).m.e(i, System.currentTimeMillis() - j, null, null, str);
    }

    @Override // defpackage.sd3
    public void o(int i, long j) {
        ((gb4) this.f).m.b(i, System.currentTimeMillis() - j);
    }

    public yf3() {
        this.f = dn3.m(new Object[]{1, 5}, 2);
    }
}

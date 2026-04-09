package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class el2 implements p13 {
    public final h83 a;
    public final a83 b;
    public final fn2 c;
    public final qn2 d;
    public final h73 e;
    public final rm2 f;
    public final po2 g;
    public final sn2 h;
    public final sp2 i;
    public final gm2 j;
    public final xv2 k;

    public el2(ko1 ko1Var) {
        this.a = (h83) ko1Var.a;
        this.b = (a83) ko1Var.b;
        this.c = (fn2) ko1Var.c;
        this.d = (qn2) ko1Var.d;
        this.e = (h73) ko1Var.e;
        this.f = (rm2) ko1Var.f;
        this.g = (po2) ko1Var.g;
        this.h = (sn2) ko1Var.h;
        this.i = (sp2) ko1Var.i;
        this.j = (gm2) ko1Var.j;
        this.k = (xv2) ko1Var.k;
    }

    public void a() {
        this.d.e();
        this.h.I0(this);
    }

    public final void b() {
        xv2 xv2Var;
        sn3 sn3Var = this.b.C0;
        if (sn3Var == null || sn3Var.isEmpty() || (xv2Var = this.k) == null) {
            return;
        }
        if (!((Boolean) tw1.e.c.a(mz1.m8)).booleanValue() || sn3Var.isEmpty()) {
            return;
        }
        vm3 vm3VarListIterator = sn3Var.listIterator(0);
        while (vm3VarListIterator.hasNext()) {
            yv2 yv2Var = (yv2) vm3VarListIterator.next();
            int[] iArr = yv2Var.b;
            int length = iArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (iArr[i] == 1) {
                    long j = yv2Var.a;
                    hg4.C.k.getClass();
                    xv2Var.a(1, j, System.currentTimeMillis());
                    break;
                }
                i++;
            }
        }
    }

    @Override // defpackage.p13
    public final void n() {
        this.i.j();
    }
}

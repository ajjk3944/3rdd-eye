package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class qf1 implements cg1 {
    public final /* synthetic */ int a;
    public final long b;
    public final Object c;

    public /* synthetic */ qf1(Object obj, long j, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
    }

    @Override // defpackage.cg1
    public final long a() {
        switch (this.a) {
        }
        return this.b;
    }

    @Override // defpackage.cg1
    public final bg1 b(long j) {
        int i = this.a;
        int i2 = 1;
        Object obj = this.c;
        switch (i) {
            case 0:
                rf1 rf1Var = (rf1) obj;
                vq2 vq2Var = rf1Var.k;
                vq2Var.getClass();
                String str = v23.a;
                long jMax = Math.max(0L, Math.min((rf1Var.e * j) / 1000000, rf1Var.j - 1));
                long[] jArr = (long[]) vq2Var.g;
                int iP = v23.p(jArr, jMax, false);
                long j2 = iP == -1 ? 0L : jArr[iP];
                long[] jArr2 = (long[]) vq2Var.h;
                long j3 = iP != -1 ? jArr2[iP] : 0L;
                int i3 = rf1Var.e;
                long j4 = (j2 * 1000000) / i3;
                long j5 = this.b;
                dg1 dg1Var = new dg1(j4, j3 + j5);
                if (j4 == j || iP == jArr.length - 1) {
                    return new bg1(dg1Var, dg1Var);
                }
                int i4 = iP + 1;
                return new bg1(dg1Var, new dg1((jArr[i4] * 1000000) / i3, j5 + jArr2[i4]));
            case 1:
                return (bg1) obj;
            default:
                og1 og1Var = (og1) obj;
                bg1 bg1VarA = og1Var.i[0].a(j);
                while (true) {
                    sg1[] sg1VarArr = og1Var.i;
                    if (i2 >= sg1VarArr.length) {
                        return bg1VarA;
                    }
                    bg1 bg1VarA2 = sg1VarArr[i2].a(j);
                    if (bg1VarA2.a.b < bg1VarA.a.b) {
                        bg1VarA = bg1VarA2;
                    }
                    i2++;
                }
        }
    }

    @Override // defpackage.cg1
    public final boolean d() {
        switch (this.a) {
            case 0:
                return true;
            case 1:
                return false;
            default:
                return true;
        }
    }

    public qf1(long j, long j2) {
        this.a = 1;
        this.b = j;
        dg1 dg1Var = j2 == 0 ? dg1.c : new dg1(0L, j2);
        this.c = new bg1(dg1Var, dg1Var);
    }
}

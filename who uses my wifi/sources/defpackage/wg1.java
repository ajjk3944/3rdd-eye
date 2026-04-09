package defpackage;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class wg1 implements lf1 {
    public final /* synthetic */ int a;
    public final kz2 b;
    public final eg1 c;

    public wg1(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new kz2(4);
                this.c = new eg1("image/heif", -1, -1);
                break;
            case 2:
                this.b = new kz2(4);
                this.c = new eg1("image/webp", -1, -1);
                break;
            default:
                this.b = new kz2(4);
                this.c = new eg1("image/avif", -1, -1);
                break;
        }
    }

    @Override // defpackage.lf1
    public final boolean b(mf1 mf1Var) throws EOFException, InterruptedIOException {
        switch (this.a) {
            case 0:
                df1 df1Var = (df1) mf1Var;
                df1Var.e(4, false);
                kz2 kz2Var = this.b;
                kz2Var.y(4);
                df1Var.B(kz2Var.a, 0, 4, false);
                if (kz2Var.P() == 1718909296) {
                    kz2Var.y(4);
                    df1Var.B(kz2Var.a, 0, 4, false);
                    if (kz2Var.P() == 1635150182) {
                    }
                }
                break;
            case 1:
                df1 df1Var2 = (df1) mf1Var;
                df1Var2.e(4, false);
                kz2 kz2Var2 = this.b;
                kz2Var2.y(4);
                df1Var2.B(kz2Var2.a, 0, 4, false);
                if (kz2Var2.P() == 1718909296) {
                    kz2Var2.y(4);
                    df1Var2.B(kz2Var2.a, 0, 4, false);
                    if (kz2Var2.P() == 1751476579) {
                    }
                }
                break;
            default:
                kz2 kz2Var3 = this.b;
                kz2Var3.y(4);
                df1 df1Var3 = (df1) mf1Var;
                df1Var3.B(kz2Var3.a, 0, 4, false);
                if (kz2Var3.P() == 1380533830) {
                    df1Var3.e(4, false);
                    kz2Var3.y(4);
                    df1Var3.B(kz2Var3.a, 0, 4, false);
                    if (kz2Var3.P() == 1464156752) {
                    }
                }
                break;
        }
        return false;
    }

    @Override // defpackage.lf1
    public final int c(mf1 mf1Var, pf1 pf1Var) {
        switch (this.a) {
        }
        return this.c.c(mf1Var, pf1Var);
    }

    @Override // defpackage.lf1
    public final void e(long j, long j2) {
        switch (this.a) {
            case 0:
                this.c.e(j, j2);
                break;
            case 1:
                this.c.e(j, j2);
                break;
            default:
                this.c.e(j, j2);
                break;
        }
    }

    @Override // defpackage.lf1
    public final void f(nf1 nf1Var) {
        switch (this.a) {
            case 0:
                this.c.f(nf1Var);
                break;
            case 1:
                this.c.f(nf1Var);
                break;
            default:
                this.c.f(nf1Var);
                break;
        }
    }
}

package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class wj1 extends ck1 {
    public rf1 n;
    public cj1 o;

    @Override // defpackage.ck1
    public final void a(boolean z) {
        super.a(z);
        if (z) {
            this.n = null;
            this.o = null;
        }
    }

    @Override // defpackage.ck1
    public final long b(kz2 kz2Var) {
        byte[] bArr = kz2Var.a;
        if (bArr[0] != -1) {
            return -1L;
        }
        int i = (bArr[2] & 255) >> 4;
        if (i == 6) {
            kz2Var.G(4);
            kz2Var.o();
        } else if (i == 7) {
            i = 7;
            kz2Var.G(4);
            kz2Var.o();
        }
        int iO = i41.O(i, kz2Var);
        kz2Var.E(0);
        return iO;
    }

    @Override // defpackage.ck1
    public final boolean c(kz2 kz2Var, long j, l92 l92Var) {
        byte[] bArr = kz2Var.a;
        rf1 rf1Var = this.n;
        if (rf1Var == null) {
            rf1 rf1Var2 = new rf1(17, bArr);
            this.n = rf1Var2;
            gg4 gg4Var = new gg4(rf1Var2.b(Arrays.copyOfRange(bArr, 9, kz2Var.c), null));
            gg4Var.d("audio/ogg");
            l92Var.f = new ph4(gg4Var);
            return true;
        }
        byte b = bArr[0];
        if ((b & 127) != 3) {
            if (b != -1) {
                return true;
            }
            cj1 cj1Var = this.o;
            if (cj1Var != null) {
                cj1Var.f = j;
                l92Var.g = cj1Var;
            }
            ((ph4) l92Var.f).getClass();
            return false;
        }
        vq2 vq2VarB = ob1.B(kz2Var);
        rf1 rf1Var3 = new rf1(rf1Var.a, rf1Var.b, rf1Var.c, rf1Var.d, rf1Var.e, rf1Var.g, rf1Var.h, rf1Var.j, vq2VarB, rf1Var.l);
        this.n = rf1Var3;
        cj1 cj1Var2 = new cj1();
        cj1Var2.h = rf1Var3;
        cj1Var2.i = vq2VarB;
        cj1Var2.f = -1L;
        cj1Var2.g = -1L;
        this.o = cj1Var2;
        return true;
    }
}

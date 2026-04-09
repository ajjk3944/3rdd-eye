package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class bk1 extends ck1 {
    public static final byte[] o = {79, 112, 117, 115, 72, 101, 97, 100};
    public static final byte[] p = {79, 112, 117, 115, 84, 97, 103, 115};
    public boolean n;

    public static boolean e(kz2 kz2Var, byte[] bArr) {
        if (kz2Var.B() < 8) {
            return false;
        }
        int i = kz2Var.b;
        byte[] bArr2 = new byte[8];
        kz2Var.H(bArr2, 0, 8);
        kz2Var.E(i);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // defpackage.ck1
    public final void a(boolean z) {
        super.a(z);
        if (z) {
            this.n = false;
        }
    }

    @Override // defpackage.ck1
    public final long b(kz2 kz2Var) {
        byte[] bArr = kz2Var.a;
        return (this.i * ou1.V(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0)) / 1000000;
    }

    @Override // defpackage.ck1
    public final boolean c(kz2 kz2Var, long j, l92 l92Var) {
        if (e(kz2Var, o)) {
            byte[] bArrCopyOf = Arrays.copyOf(kz2Var.a, kz2Var.c);
            int i = bArrCopyOf[9] & 255;
            ArrayList arrayListH = ou1.H(bArrCopyOf);
            if (((ph4) l92Var.f) == null) {
                gg4 gg4Var = new gg4();
                gg4Var.d("audio/ogg");
                gg4Var.e("audio/opus");
                gg4Var.D = i;
                gg4Var.E = 48000;
                gg4Var.o = arrayListH;
                l92Var.f = new ph4(gg4Var);
                return true;
            }
        } else {
            if (!e(kz2Var, p)) {
                ((ph4) l92Var.f).getClass();
                return false;
            }
            ((ph4) l92Var.f).getClass();
            if (!this.n) {
                this.n = true;
                kz2Var.G(8);
                wn1 wn1VarA = pu1.A(xm3.n((String[]) pu1.v(kz2Var, false, false).g));
                if (wn1VarA != null) {
                    ph4 ph4Var = (ph4) l92Var.f;
                    ph4Var.getClass();
                    gg4 gg4Var2 = new gg4(ph4Var);
                    gg4Var2.j = wn1VarA.b(((ph4) l92Var.f).k);
                    l92Var.f = new ph4(gg4Var2);
                    return true;
                }
            }
        }
        return true;
    }
}

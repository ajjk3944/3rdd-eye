package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ff1 implements of1 {
    public static final int[] h = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};
    public static final l92 i = new l92((ef1) us0.h);
    public static final l92 j = new l92((ef1) ts0.g);
    public sn3 f;
    public final us0 g = new us0();

    @Override // defpackage.of1
    public final synchronized lf1[] a() {
        return d(Uri.EMPTY, new HashMap());
    }

    public final void b(int i2, ArrayList arrayList) {
        us0 us0Var = this.g;
        switch (i2) {
            case 0:
                arrayList.add(new yl1());
                break;
            case 1:
                arrayList.add(new am1());
                break;
            case 2:
                arrayList.add(new bm1());
                break;
            case 3:
                arrayList.add(new mg1());
                break;
            case 4:
                lf1 lf1VarK = i.K(0);
                if (lf1VarK == null) {
                    arrayList.add(new ah1());
                    break;
                } else {
                    arrayList.add(lf1VarK);
                    break;
                }
            case 5:
                arrayList.add(new ch1());
                break;
            case 6:
                arrayList.add(new oi1(new ki1(), 0, us0Var));
                break;
            case 7:
                arrayList.add(new si1());
                break;
            case 8:
                arrayList.add(new jj1(us0Var, 0, sn3.j));
                arrayList.add(new nj1(us0Var, 0));
                break;
            case 9:
                arrayList.add(new xj1());
                break;
            case 10:
                arrayList.add(new zm1());
                break;
            case 11:
                if (this.f == null) {
                    vm3 vm3Var = xm3.g;
                    this.f = sn3.j;
                }
                x13 x13Var = new x13();
                sn3 sn3Var = this.f;
                dm1 dm1Var = new dm1();
                dm1Var.a = sn3Var;
                arrayList.add(new gn1(us0Var, x13Var, dm1Var));
                break;
            case 12:
                nn1 nn1Var = new nn1();
                nn1Var.c = 0;
                nn1Var.d = -1L;
                nn1Var.f = -1;
                nn1Var.g = -1L;
                arrayList.add(nn1Var);
                break;
            case 14:
                arrayList.add(new xg1(2));
                break;
            case 15:
                lf1 lf1VarK2 = j.K(new Object[0]);
                if (lf1VarK2 != null) {
                    arrayList.add(lf1VarK2);
                    break;
                }
                break;
            case 16:
                arrayList.add(new og1(us0Var));
                break;
            case 17:
                arrayList.add(new xg1(1));
                break;
            case 18:
                arrayList.add(new wg1(2));
                break;
            case 19:
                arrayList.add(new xg1(0));
                break;
            case 20:
                arrayList.add(new wg1(1));
                break;
            case zy1.zzm /* 21 */:
                arrayList.add(new wg1(0));
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01d6 A[PHI: r18
  0x01d6: PHI (r18v2 int) = (r18v0 int), (r18v1 int), (r18v1 int) binds: [B:125:0x01d4, B:128:0x01e2, B:131:0x01ec] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0049  */
    @Override // defpackage.of1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized defpackage.lf1[] d(android.net.Uri r26, java.util.Map r27) {
        /*
            Method dump skipped, instructions count: 1032
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ff1.d(android.net.Uri, java.util.Map):lf1[]");
    }
}

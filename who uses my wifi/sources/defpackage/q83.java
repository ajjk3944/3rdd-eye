package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class q83 {
    public final a83 a;
    public final c83 b;
    public final eb3 c;
    public final bb3 d;
    public final da3 e;
    public final gj2 f;

    public q83(eb3 eb3Var, bb3 bb3Var, a83 a83Var, c83 c83Var, gj2 gj2Var, da3 da3Var) {
        this.a = a83Var;
        this.b = c83Var;
        this.c = eb3Var;
        this.d = bb3Var;
        this.f = gj2Var;
        this.e = da3Var;
    }

    public final void a(ArrayList arrayList, ao2 ao2Var) {
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            String str = (String) obj;
            a83 a83Var = this.a;
            if (a83Var.i0) {
                String str2 = this.b.b;
                bb3 bb3Var = this.d;
                bb3Var.getClass();
                hg4.C.k.getClass();
                wo1 wo1Var = new wo1(System.currentTimeMillis(), str2, str, 2);
                jz2 jz2Var = bb3Var.a;
                jz2Var.getClass();
                jz2Var.a(new mr2(jz2Var, wo1Var, 4, false));
            } else {
                da3 da3Var = this.e;
                this.c.b(str, a83Var.x0, da3Var, ao2Var);
            }
        }
    }

    public final void b(int i, ArrayList arrayList) {
        n70 n70VarR;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            String str = (String) obj;
            if (((Boolean) tw1.e.c.a(mz1.Pa)).booleanValue() && gj2.b(str)) {
                n70VarR = this.f.a(str, sv1.f.e);
            } else {
                n70VarR = pu1.r(str);
            }
            t3 t3Var = new t3(this, i, 14);
            n70VarR.c(new jq3(n70VarR, t3Var, 0), md2.a);
        }
    }
}

package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class e9 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10743a;

    /* renamed from: b, reason: collision with root package name */
    public final List f10744b;

    /* renamed from: c, reason: collision with root package name */
    public final u2[] f10745c;

    /* renamed from: d, reason: collision with root package name */
    public final be1 f10746d;

    public e9(int i4, List list) {
        this.f10743a = i4;
        switch (i4) {
            case 1:
                this.f10744b = list;
                this.f10745c = new u2[list.size()];
                be1 be1Var = new be1(new fk0(6, this));
                this.f10746d = be1Var;
                be1Var.J(3);
                break;
            default:
                this.f10744b = list;
                this.f10745c = new u2[list.size()];
                this.f10746d = new be1(new mx0(5, this));
                break;
        }
    }

    public final void a(z1 z1Var, h9 h9Var) {
        switch (this.f10743a) {
            case 0:
                int i4 = 0;
                while (true) {
                    u2[] u2VarArr = this.f10745c;
                    if (i4 >= u2VarArr.length) {
                        break;
                    } else {
                        h9Var.a();
                        h9Var.b();
                        u2 u2VarM = z1Var.m(h9Var.f11776d, 3);
                        mx1 mx1Var = (mx1) this.f10744b.get(i4);
                        String str = mx1Var.f14052m;
                        boolean z3 = true;
                        if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                            z3 = false;
                        }
                        mq0.Z(z3, "Invalid closed caption MIME type provided: %s", str);
                        String str2 = mx1Var.f14042a;
                        if (str2 == null) {
                            h9Var.b();
                            str2 = h9Var.f11777e;
                        }
                        lw1 lw1Var = new lw1();
                        lw1Var.f13652a = str2;
                        lw1Var.d("video/mp2t");
                        lw1Var.e(str);
                        lw1Var.f13656e = mx1Var.f14046e;
                        lw1Var.f13655d = mx1Var.f14045d;
                        lw1Var.I = mx1Var.J;
                        lw1Var.f13664o = mx1Var.f14055p;
                        u2VarM.f(new mx1(lw1Var));
                        u2VarArr[i4] = u2VarM;
                        i4++;
                    }
                }
                break;
            default:
                int i10 = 0;
                while (true) {
                    u2[] u2VarArr2 = this.f10745c;
                    if (i10 >= u2VarArr2.length) {
                        break;
                    } else {
                        h9Var.a();
                        h9Var.b();
                        u2 u2VarM2 = z1Var.m(h9Var.f11776d, 3);
                        mx1 mx1Var2 = (mx1) this.f10744b.get(i10);
                        String str3 = mx1Var2.f14052m;
                        boolean z10 = true;
                        if (!"application/cea-608".equals(str3) && !"application/cea-708".equals(str3)) {
                            z10 = false;
                        }
                        mq0.Z(z10, "Invalid closed caption MIME type provided: %s", str3);
                        lw1 lw1Var2 = new lw1();
                        h9Var.b();
                        lw1Var2.f13652a = h9Var.f11777e;
                        lw1Var2.d("video/mp2t");
                        lw1Var2.e(str3);
                        lw1Var2.f13656e = mx1Var2.f14046e;
                        lw1Var2.f13655d = mx1Var2.f14045d;
                        lw1Var2.I = mx1Var2.J;
                        lw1Var2.f13664o = mx1Var2.f14055p;
                        u2VarM2.f(new mx1(lw1Var2));
                        u2VarArr2[i10] = u2VarM2;
                        i10++;
                    }
                }
                break;
        }
    }

    public void b(long j, sk0 sk0Var) {
        if (sk0Var.B() < 9) {
            return;
        }
        int iB = sk0Var.b();
        int iB2 = sk0Var.b();
        int iK = sk0Var.K();
        if (iB == 434 && iB2 == 1195456820 && iK == 3) {
            this.f10746d.K(j, sk0Var);
        }
    }
}

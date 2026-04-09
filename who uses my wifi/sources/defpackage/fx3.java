package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class fx3 {
    public static final zw3 a;
    public static final zw3 b;
    public static final rw3 c;

    static {
        xw3 xw3Var = xw3.f;
        xw3 xw3Var2 = xw3.d;
        yw3 yw3Var = yw3.b;
        try {
            mc2 mc2Var = new mc2(25);
            mc2Var.i(32);
            mc2Var.o(16);
            mc2Var.j = yw3Var;
            mc2Var.i = xw3Var2;
            a = mc2Var.A();
            try {
                mc2 mc2Var2 = new mc2(25);
                mc2Var2.i(32);
                mc2Var2.o(32);
                mc2Var2.j = yw3Var;
                mc2Var2.i = xw3Var2;
                mc2Var2.A();
                try {
                    mc2 mc2Var3 = new mc2(25);
                    mc2Var3.i(64);
                    mc2Var3.o(32);
                    mc2Var3.j = yw3Var;
                    mc2Var3.i = xw3Var;
                    mc2Var3.A();
                    try {
                        mc2 mc2Var4 = new mc2(25);
                        mc2Var4.i(64);
                        mc2Var4.o(64);
                        mc2Var4.j = yw3Var;
                        mc2Var4.i = xw3Var;
                        b = mc2Var4.A();
                        try {
                            jr3 jr3Var = new jr3(3);
                            jr3Var.b(32);
                            jr3Var.g(16);
                            jr3Var.i = gs3.k;
                            c = jr3Var.l();
                        } catch (Exception e) {
                            throw new rg(e);
                        }
                    } catch (Exception e2) {
                        throw new rg(e2);
                    }
                } catch (Exception e3) {
                    throw new rg(e3);
                }
            } catch (Exception e4) {
                throw new rg(e4);
            }
        } catch (Exception e5) {
            throw new rg(e5);
        }
    }
}

package defpackage;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class a90 {
    public static final l92 a = l92.D("w", "h", "ip", "op", "fr", "v", "layers", "assets", "fonts", "chars", "markers");
    public static final l92 b = l92.D("id", "layers", "w", "h", "p", "u");
    public static final l92 c = l92.D("list");
    public static final l92 d = l92.D("cm", "tm", "dr");

    public static u80 a(j40 j40Var) throws NumberFormatException {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float fC = l41.c();
        l80 l80Var = new l80();
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        jx0 jx0Var = new jx0();
        u80 u80Var = new u80();
        j40Var.c();
        float fL = 0.0f;
        int iL = 0;
        int iL2 = 0;
        float fL2 = 0.0f;
        float fL3 = 0.0f;
        while (j40Var.i()) {
            float f7 = fC;
            switch (j40Var.q(a)) {
                case 0:
                    f = fL;
                    iL = (int) j40Var.l();
                    fC = f7;
                    fL = f;
                    break;
                case 1:
                    f = fL;
                    iL2 = (int) j40Var.l();
                    fC = f7;
                    fL = f;
                    break;
                case 2:
                    f = fL;
                    fL2 = (float) j40Var.l();
                    fC = f7;
                    fL = f;
                    break;
                case 3:
                    f = fL;
                    fL3 = ((float) j40Var.l()) - 0.01f;
                    fC = f7;
                    fL = f;
                    break;
                case 4:
                    fL = (float) j40Var.l();
                    fC = f7;
                    break;
                case 5:
                    f = fL;
                    f2 = fL2;
                    f3 = fL3;
                    String[] strArrSplit = j40Var.n().split("\\.");
                    int i = Integer.parseInt(strArrSplit[0]);
                    int i2 = Integer.parseInt(strArrSplit[1]);
                    int i3 = Integer.parseInt(strArrSplit[2]);
                    if (i < 4 || (i <= 4 && (i2 < 4 || (i2 <= 4 && i3 < 0)))) {
                        u80Var.a("Lottie only supports bodymovin >= 4.4.0");
                    }
                    fC = f7;
                    fL2 = f2;
                    fL3 = f3;
                    fL = f;
                    break;
                case 6:
                    f = fL;
                    f2 = fL2;
                    f3 = fL3;
                    j40Var.a();
                    int i4 = 0;
                    while (j40Var.i()) {
                        f50 f50VarA = g50.a(j40Var, u80Var);
                        if (f50VarA.e == 3) {
                            i4++;
                        }
                        arrayList.add(f50VarA);
                        l80Var.e(f50VarA.d, f50VarA);
                        if (i4 > 4) {
                            j80.b("You have " + i4 + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
                        }
                    }
                    j40Var.f();
                    fC = f7;
                    fL2 = f2;
                    fL3 = f3;
                    fL = f;
                    break;
                case 7:
                    f = fL;
                    f2 = fL2;
                    f3 = fL3;
                    j40Var.a();
                    while (j40Var.i()) {
                        ArrayList arrayList3 = new ArrayList();
                        l80 l80Var2 = new l80();
                        j40Var.c();
                        String strN = null;
                        String strN2 = null;
                        String strN3 = null;
                        int iM = 0;
                        int iM2 = 0;
                        while (j40Var.i()) {
                            int iQ = j40Var.q(b);
                            if (iQ == 0) {
                                strN = j40Var.n();
                            } else if (iQ == 1) {
                                j40Var.a();
                                while (j40Var.i()) {
                                    f50 f50VarA2 = g50.a(j40Var, u80Var);
                                    l80Var2.e(f50VarA2.d, f50VarA2);
                                    arrayList3.add(f50VarA2);
                                }
                                j40Var.f();
                            } else if (iQ == 2) {
                                iM = j40Var.m();
                            } else if (iQ == 3) {
                                iM2 = j40Var.m();
                            } else if (iQ == 4) {
                                strN2 = j40Var.n();
                            } else if (iQ != 5) {
                                j40Var.r();
                                j40Var.s();
                            } else {
                                strN3 = j40Var.n();
                            }
                        }
                        j40Var.g();
                        if (strN2 != null) {
                            map2.put(strN, new l90(iM, iM2, strN, strN2, strN3));
                        } else {
                            map.put(strN, arrayList3);
                        }
                    }
                    j40Var.f();
                    fC = f7;
                    fL2 = f2;
                    fL3 = f3;
                    fL = f;
                    break;
                case 8:
                    f = fL;
                    f2 = fL2;
                    float f8 = fL3;
                    j40Var.c();
                    while (j40Var.i()) {
                        if (j40Var.q(c) != 0) {
                            j40Var.r();
                            j40Var.s();
                        } else {
                            j40Var.a();
                            while (j40Var.i()) {
                                l92 l92Var = kv.a;
                                j40Var.c();
                                String strN4 = null;
                                String strN5 = null;
                                String strN6 = null;
                                while (j40Var.i()) {
                                    int iQ2 = j40Var.q(kv.a);
                                    if (iQ2 != 0) {
                                        float f9 = f8;
                                        if (iQ2 == 1) {
                                            strN5 = j40Var.n();
                                        } else if (iQ2 == 2) {
                                            strN6 = j40Var.n();
                                        } else if (iQ2 != 3) {
                                            j40Var.r();
                                            j40Var.s();
                                        } else {
                                            j40Var.l();
                                        }
                                        f8 = f9;
                                    } else {
                                        strN4 = j40Var.n();
                                    }
                                }
                                j40Var.g();
                                map3.put(strN5, new gv(strN4, strN5, strN6));
                                f8 = f8;
                            }
                            j40Var.f();
                        }
                    }
                    f3 = f8;
                    j40Var.g();
                    fC = f7;
                    fL2 = f2;
                    fL3 = f3;
                    fL = f;
                    break;
                case 9:
                    f = fL;
                    f2 = fL2;
                    f4 = fL3;
                    j40Var.a();
                    while (j40Var.i()) {
                        l92 l92Var2 = jv.a;
                        ArrayList arrayList4 = new ArrayList();
                        j40Var.c();
                        double dL = 0.0d;
                        String strN7 = null;
                        String strN8 = null;
                        char cCharAt = 0;
                        while (j40Var.i()) {
                            int iQ3 = j40Var.q(jv.a);
                            if (iQ3 == 0) {
                                cCharAt = j40Var.n().charAt(0);
                            } else if (iQ3 == 1) {
                                j40Var.l();
                            } else if (iQ3 == 2) {
                                dL = j40Var.l();
                            } else if (iQ3 == 3) {
                                strN7 = j40Var.n();
                            } else if (iQ3 == 4) {
                                strN8 = j40Var.n();
                            } else if (iQ3 != 5) {
                                j40Var.r();
                                j40Var.s();
                            } else {
                                j40Var.c();
                                while (j40Var.i()) {
                                    if (j40Var.q(jv.b) != 0) {
                                        j40Var.r();
                                        j40Var.s();
                                    } else {
                                        j40Var.a();
                                        while (j40Var.i()) {
                                            arrayList4.add((av0) fj.a(j40Var, u80Var));
                                        }
                                        j40Var.f();
                                    }
                                }
                                j40Var.g();
                            }
                        }
                        j40Var.g();
                        iv ivVar = new iv(arrayList4, cCharAt, dL, strN7, strN8);
                        jx0Var.c(ivVar.hashCode(), ivVar);
                    }
                    j40Var.f();
                    f3 = f4;
                    fC = f7;
                    fL2 = f2;
                    fL3 = f3;
                    fL = f;
                    break;
                case 10:
                    j40Var.a();
                    while (j40Var.i()) {
                        j40Var.c();
                        String strN9 = null;
                        float fL4 = 0.0f;
                        float fL5 = 0.0f;
                        while (j40Var.i()) {
                            int iQ4 = j40Var.q(d);
                            if (iQ4 != 0) {
                                f5 = fL;
                                if (iQ4 == 1) {
                                    f6 = fL2;
                                    fL3 = fL3;
                                    fL4 = (float) j40Var.l();
                                } else if (iQ4 != 2) {
                                    j40Var.r();
                                    j40Var.s();
                                } else {
                                    f6 = fL2;
                                    fL3 = fL3;
                                    fL5 = (float) j40Var.l();
                                }
                                fL = f5;
                                fL2 = f6;
                            } else {
                                f5 = fL;
                                strN9 = j40Var.n();
                            }
                            fL = f5;
                        }
                        j40Var.g();
                        arrayList2.add(new hb0(strN9, fL4, fL5));
                        fL3 = fL3;
                        fL2 = fL2;
                        fL = fL;
                    }
                    f = fL;
                    f2 = fL2;
                    f4 = fL3;
                    j40Var.f();
                    f3 = f4;
                    fC = f7;
                    fL2 = f2;
                    fL3 = f3;
                    fL = f;
                    break;
                default:
                    j40Var.r();
                    j40Var.s();
                    f = fL;
                    f2 = fL2;
                    f3 = fL3;
                    fC = f7;
                    fL2 = f2;
                    fL3 = f3;
                    fL = f;
                    break;
            }
        }
        float f10 = fC;
        float f11 = fL;
        Rect rect = new Rect(0, 0, (int) (iL * f10), (int) (iL2 * f10));
        float fC2 = l41.c();
        u80Var.k = rect;
        u80Var.l = fL2;
        u80Var.m = fL3;
        u80Var.n = f11;
        u80Var.j = arrayList;
        u80Var.i = l80Var;
        u80Var.c = map;
        u80Var.d = map2;
        u80Var.e = fC2;
        u80Var.h = jx0Var;
        u80Var.f = map3;
        u80Var.g = arrayList2;
        return u80Var;
    }
}

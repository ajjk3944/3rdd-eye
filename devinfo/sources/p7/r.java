package p7;

import android.graphics.Rect;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.HashMap;
import x.o0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static final km.n f31440a = km.n.q("w", "h", "ip", "op", "fr", "v", "layers", "assets", "fonts", "chars", "markers");

    /* renamed from: b, reason: collision with root package name */
    public static final km.n f31441b = km.n.q(FacebookMediationAdapter.KEY_ID, "layers", "w", "h", "p", "u");

    /* renamed from: c, reason: collision with root package name */
    public static final km.n f31442c = km.n.q("list");

    /* renamed from: d, reason: collision with root package name */
    public static final km.n f31443d = km.n.q("cm", "tm", "dr");

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0045. Please report as an issue. */
    public static f7.j a(q7.b bVar) throws androidx.datastore.preferences.protobuf.l, NumberFormatException, EOFException {
        f7.j jVar;
        float f10;
        f7.j jVar2;
        f7.j jVar3;
        int i4;
        float f11;
        f7.j jVar4;
        float f12;
        float f13;
        int i10;
        float fC = r7.j.c();
        x.o oVar = new x.o((Object) null);
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        o0 o0Var = new o0(0);
        f7.j jVar5 = new f7.j();
        bVar.e();
        int iY = 0;
        int iY2 = 0;
        float fY = 0.0f;
        float fY2 = 0.0f;
        float fY3 = 0.0f;
        while (bVar.v()) {
            switch (bVar.L(f31440a)) {
                case 0:
                    jVar = jVar5;
                    iY = (int) bVar.y();
                    jVar5 = jVar;
                    break;
                case 1:
                    jVar = jVar5;
                    iY2 = (int) bVar.y();
                    jVar5 = jVar;
                    break;
                case 2:
                    jVar = jVar5;
                    fY2 = (float) bVar.y();
                    jVar5 = jVar;
                    break;
                case 3:
                    f10 = fC;
                    jVar2 = jVar5;
                    fY = ((float) bVar.y()) - 0.01f;
                    jVar5 = jVar2;
                    fC = f10;
                    break;
                case 4:
                    f10 = fC;
                    jVar2 = jVar5;
                    fY3 = (float) bVar.y();
                    jVar5 = jVar2;
                    fC = f10;
                    break;
                case 5:
                    f10 = fC;
                    jVar3 = jVar5;
                    i4 = iY2;
                    f11 = fY2;
                    String[] strArrSplit = bVar.E().split("\\.");
                    int i11 = Integer.parseInt(strArrSplit[0]);
                    int i12 = Integer.parseInt(strArrSplit[1]);
                    int i13 = Integer.parseInt(strArrSplit[2]);
                    if (i11 < 4 || (i11 <= 4 && (i12 < 4 || (i12 <= 4 && i13 < 0)))) {
                        jVar3.a("Lottie only supports bodymovin >= 4.4.0");
                    }
                    jVar5 = jVar3;
                    iY2 = i4;
                    fY2 = f11;
                    fC = f10;
                    break;
                case 6:
                    f10 = fC;
                    f7.j jVar6 = jVar5;
                    i4 = iY2;
                    f11 = fY2;
                    bVar.c();
                    int i14 = 0;
                    while (bVar.v()) {
                        f7.j jVar7 = jVar6;
                        n7.d dVarA = q.a(bVar, jVar7);
                        if (dVarA.f29807e == 3) {
                            i14++;
                        }
                        arrayList.add(dVarA);
                        oVar.i(dVarA, dVarA.f29806d);
                        if (i14 > 4) {
                            r7.d.b("You have " + i14 + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
                        }
                        jVar6 = jVar7;
                    }
                    jVar3 = jVar6;
                    bVar.g();
                    jVar5 = jVar3;
                    iY2 = i4;
                    fY2 = f11;
                    fC = f10;
                    break;
                case 7:
                    f10 = fC;
                    i4 = iY2;
                    f11 = fY2;
                    bVar.c();
                    while (bVar.v()) {
                        ArrayList arrayList3 = new ArrayList();
                        x.o oVar2 = new x.o((Object) null);
                        bVar.e();
                        String strE = null;
                        String strE2 = null;
                        String strE3 = null;
                        int iA = 0;
                        int iA2 = 0;
                        while (bVar.v()) {
                            int iL = bVar.L(f31441b);
                            if (iL != 0) {
                                if (iL == 1) {
                                    bVar.c();
                                    while (bVar.v()) {
                                        n7.d dVarA2 = q.a(bVar, jVar5);
                                        oVar2.i(dVarA2, dVarA2.f29806d);
                                        arrayList3.add(dVarA2);
                                        jVar5 = jVar5;
                                    }
                                    jVar4 = jVar5;
                                    bVar.g();
                                } else if (iL == 2) {
                                    iA = bVar.A();
                                } else if (iL == 3) {
                                    iA2 = bVar.A();
                                } else if (iL == 4) {
                                    strE2 = bVar.E();
                                } else if (iL != 5) {
                                    bVar.N();
                                    bVar.O();
                                    jVar4 = jVar5;
                                } else {
                                    strE3 = bVar.E();
                                }
                                jVar5 = jVar4;
                            } else {
                                strE = bVar.E();
                            }
                        }
                        f7.j jVar8 = jVar5;
                        bVar.m();
                        if (strE2 != null) {
                            map2.put(strE, new f7.z(iA, strE, strE2, iA2, strE3));
                        } else {
                            map.put(strE, arrayList3);
                        }
                        jVar5 = jVar8;
                    }
                    bVar.g();
                    jVar3 = jVar5;
                    jVar5 = jVar3;
                    iY2 = i4;
                    fY2 = f11;
                    fC = f10;
                    break;
                case 8:
                    f10 = fC;
                    i4 = iY2;
                    float f14 = fY2;
                    bVar.e();
                    while (bVar.v()) {
                        if (bVar.L(f31442c) != 0) {
                            bVar.N();
                            bVar.O();
                        } else {
                            bVar.c();
                            while (bVar.v()) {
                                km.n nVar = k.f31425a;
                                bVar.e();
                                String strE4 = null;
                                String strE5 = null;
                                String strE6 = null;
                                while (bVar.v()) {
                                    int iL2 = bVar.L(k.f31425a);
                                    if (iL2 != 0) {
                                        float f15 = f14;
                                        if (iL2 == 1) {
                                            strE5 = bVar.E();
                                        } else if (iL2 == 2) {
                                            strE6 = bVar.E();
                                        } else if (iL2 != 3) {
                                            bVar.N();
                                            bVar.O();
                                        } else {
                                            bVar.y();
                                        }
                                        f14 = f15;
                                    } else {
                                        strE4 = bVar.E();
                                    }
                                }
                                bVar.m();
                                map3.put(strE5, new k7.c(strE4, strE5, strE6));
                                f14 = f14;
                            }
                            bVar.g();
                        }
                    }
                    f11 = f14;
                    bVar.m();
                    jVar3 = jVar5;
                    jVar5 = jVar3;
                    iY2 = i4;
                    fY2 = f11;
                    fC = f10;
                    break;
                case 9:
                    f10 = fC;
                    i4 = iY2;
                    f12 = fY2;
                    bVar.c();
                    while (bVar.v()) {
                        km.n nVar2 = j.f31423a;
                        ArrayList arrayList4 = new ArrayList();
                        bVar.e();
                        double dY = 0.0d;
                        char cCharAt = 0;
                        String strE7 = null;
                        String strE8 = null;
                        while (bVar.v()) {
                            int iL3 = bVar.L(j.f31423a);
                            if (iL3 == 0) {
                                cCharAt = bVar.E().charAt(0);
                            } else if (iL3 == 1) {
                                bVar.y();
                            } else if (iL3 == 2) {
                                dY = bVar.y();
                            } else if (iL3 == 3) {
                                strE7 = bVar.E();
                            } else if (iL3 == 4) {
                                strE8 = bVar.E();
                            } else if (iL3 != 5) {
                                bVar.N();
                                bVar.O();
                            } else {
                                bVar.e();
                                while (bVar.v()) {
                                    if (bVar.L(j.f31424b) != 0) {
                                        bVar.N();
                                        bVar.O();
                                    } else {
                                        bVar.c();
                                        while (bVar.v()) {
                                            arrayList4.add((m7.m) g.a(bVar, jVar5));
                                        }
                                        bVar.g();
                                    }
                                }
                                bVar.m();
                            }
                        }
                        bVar.m();
                        k7.d dVar = new k7.d(arrayList4, cCharAt, dY, strE7, strE8);
                        o0Var.e(dVar.hashCode(), dVar);
                    }
                    bVar.g();
                    f11 = f12;
                    jVar3 = jVar5;
                    jVar5 = jVar3;
                    iY2 = i4;
                    fY2 = f11;
                    fC = f10;
                    break;
                case 10:
                    bVar.c();
                    while (bVar.v()) {
                        bVar.e();
                        String strE9 = null;
                        float fY4 = 0.0f;
                        float fY5 = 0.0f;
                        while (bVar.v()) {
                            int iL4 = bVar.L(f31443d);
                            if (iL4 != 0) {
                                f13 = fC;
                                if (iL4 == 1) {
                                    i10 = iY2;
                                    fY2 = fY2;
                                    fY4 = (float) bVar.y();
                                } else if (iL4 != 2) {
                                    bVar.N();
                                    bVar.O();
                                } else {
                                    i10 = iY2;
                                    fY2 = fY2;
                                    fY5 = (float) bVar.y();
                                }
                                iY2 = i10;
                            } else {
                                f13 = fC;
                                strE9 = bVar.E();
                            }
                            fC = f13;
                        }
                        bVar.m();
                        arrayList2.add(new k7.h(strE9, fY4, fY5));
                        fY2 = fY2;
                        iY2 = iY2;
                        fC = fC;
                    }
                    f10 = fC;
                    i4 = iY2;
                    f12 = fY2;
                    bVar.g();
                    f11 = f12;
                    jVar3 = jVar5;
                    jVar5 = jVar3;
                    iY2 = i4;
                    fY2 = f11;
                    fC = f10;
                    break;
                default:
                    bVar.N();
                    bVar.O();
                    f10 = fC;
                    jVar3 = jVar5;
                    i4 = iY2;
                    f11 = fY2;
                    jVar5 = jVar3;
                    iY2 = i4;
                    fY2 = f11;
                    fC = f10;
                    break;
            }
        }
        float f16 = fC;
        f7.j jVar9 = jVar5;
        Rect rect = new Rect(0, 0, (int) (iY * f16), (int) (iY2 * f16));
        float fC2 = r7.j.c();
        jVar9.f23758k = rect;
        jVar9.f23759l = fY2;
        jVar9.f23760m = fY;
        jVar9.f23761n = fY3;
        jVar9.j = arrayList;
        jVar9.f23757i = oVar;
        jVar9.f23752c = map;
        jVar9.f23753d = map2;
        jVar9.f23754e = fC2;
        jVar9.f23756h = o0Var;
        jVar9.f23755f = map3;
        jVar9.g = arrayList2;
        return jVar9;
    }
}

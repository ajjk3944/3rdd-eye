package c9;

import android.graphics.Rect;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.HashMap;
import u.j0;

/* loaded from: classes.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    public static final io.sentry.internal.debugmeta.c f3437a = io.sentry.internal.debugmeta.c.v("w", "h", "ip", "op", "fr", "v", "layers", "assets", "fonts", "chars", "markers");

    /* renamed from: b, reason: collision with root package name */
    public static final io.sentry.internal.debugmeta.c f3438b = io.sentry.internal.debugmeta.c.v("id", "layers", "w", "h", "p", "u");

    /* renamed from: c, reason: collision with root package name */
    public static final io.sentry.internal.debugmeta.c f3439c = io.sentry.internal.debugmeta.c.v("list");

    /* renamed from: d, reason: collision with root package name */
    public static final io.sentry.internal.debugmeta.c f3440d = io.sentry.internal.debugmeta.c.v("cm", "tm", "dr");

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0045. Please report as an issue. */
    public static r8.h a(d9.c cVar) throws androidx.datastore.preferences.protobuf.m, NumberFormatException, EOFException {
        r8.h hVar;
        float f10;
        r8.h hVar2;
        r8.h hVar3;
        int i10;
        float f11;
        r8.h hVar4;
        float f12;
        float f13;
        int i11;
        float fC = e9.j.c();
        u.o oVar = new u.o((Object) null);
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        j0 j0Var = new j0(0);
        r8.h hVar5 = new r8.h();
        cVar.f();
        int iG = 0;
        int iG2 = 0;
        float fG = 0.0f;
        float fG2 = 0.0f;
        float fG3 = 0.0f;
        while (cVar.w()) {
            switch (cVar.Z(f3437a)) {
                case 0:
                    hVar = hVar5;
                    iG = (int) cVar.G();
                    hVar5 = hVar;
                    break;
                case 1:
                    hVar = hVar5;
                    iG2 = (int) cVar.G();
                    hVar5 = hVar;
                    break;
                case 2:
                    hVar = hVar5;
                    fG2 = (float) cVar.G();
                    hVar5 = hVar;
                    break;
                case 3:
                    f10 = fC;
                    hVar2 = hVar5;
                    fG = ((float) cVar.G()) - 0.01f;
                    hVar5 = hVar2;
                    fC = f10;
                    break;
                case 4:
                    f10 = fC;
                    hVar2 = hVar5;
                    fG3 = (float) cVar.G();
                    hVar5 = hVar2;
                    fC = f10;
                    break;
                case g4.j.STRING_FIELD_NUMBER /* 5 */:
                    f10 = fC;
                    hVar3 = hVar5;
                    i10 = iG2;
                    f11 = fG2;
                    String[] strArrSplit = cVar.R().split("\\.");
                    int i12 = Integer.parseInt(strArrSplit[0]);
                    int i13 = Integer.parseInt(strArrSplit[1]);
                    int i14 = Integer.parseInt(strArrSplit[2]);
                    if (i12 < 4 || (i12 <= 4 && (i13 < 4 || (i13 <= 4 && i14 < 0)))) {
                        hVar3.a("Lottie only supports bodymovin >= 4.4.0");
                    }
                    hVar5 = hVar3;
                    iG2 = i10;
                    fG2 = f11;
                    fC = f10;
                    break;
                case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                    f10 = fC;
                    r8.h hVar6 = hVar5;
                    i10 = iG2;
                    f11 = fG2;
                    cVar.b();
                    int i15 = 0;
                    while (cVar.w()) {
                        r8.h hVar7 = hVar6;
                        a9.h hVarA = t.a(cVar, hVar7);
                        if (hVarA.f252e == a9.f.IMAGE) {
                            i15++;
                        }
                        arrayList.add(hVarA);
                        oVar.e(hVarA, hVarA.f251d);
                        if (i15 > 4) {
                            e9.c.b("You have " + i15 + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
                        }
                        hVar6 = hVar7;
                    }
                    hVar3 = hVar6;
                    cVar.h();
                    hVar5 = hVar3;
                    iG2 = i10;
                    fG2 = f11;
                    fC = f10;
                    break;
                case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                    f10 = fC;
                    i10 = iG2;
                    f11 = fG2;
                    cVar.b();
                    while (cVar.w()) {
                        ArrayList arrayList3 = new ArrayList();
                        u.o oVar2 = new u.o((Object) null);
                        cVar.f();
                        String strR = null;
                        String strR2 = null;
                        String strR3 = null;
                        int iL = 0;
                        int iL2 = 0;
                        while (cVar.w()) {
                            int iZ = cVar.Z(f3438b);
                            if (iZ != 0) {
                                if (iZ == 1) {
                                    cVar.b();
                                    while (cVar.w()) {
                                        a9.h hVarA2 = t.a(cVar, hVar5);
                                        oVar2.e(hVarA2, hVarA2.f251d);
                                        arrayList3.add(hVarA2);
                                        hVar5 = hVar5;
                                    }
                                    hVar4 = hVar5;
                                    cVar.h();
                                } else if (iZ == 2) {
                                    iL = cVar.L();
                                } else if (iZ == 3) {
                                    iL2 = cVar.L();
                                } else if (iZ == 4) {
                                    strR2 = cVar.R();
                                } else if (iZ != 5) {
                                    cVar.f0();
                                    cVar.i0();
                                    hVar4 = hVar5;
                                } else {
                                    strR3 = cVar.R();
                                }
                                hVar5 = hVar4;
                            } else {
                                strR = cVar.R();
                            }
                        }
                        r8.h hVar8 = hVar5;
                        cVar.i();
                        if (strR2 != null) {
                            map2.put(strR, new r8.x(iL, iL2, strR, strR2, strR3));
                        } else {
                            map.put(strR, arrayList3);
                        }
                        hVar5 = hVar8;
                    }
                    cVar.h();
                    hVar3 = hVar5;
                    hVar5 = hVar3;
                    iG2 = i10;
                    fG2 = f11;
                    fC = f10;
                    break;
                case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                    f10 = fC;
                    i10 = iG2;
                    float f14 = fG2;
                    cVar.f();
                    while (cVar.w()) {
                        if (cVar.Z(f3439c) != 0) {
                            cVar.f0();
                            cVar.i0();
                        } else {
                            cVar.b();
                            while (cVar.w()) {
                                io.sentry.internal.debugmeta.c cVar2 = k.f3419a;
                                cVar.f();
                                String strR4 = null;
                                String strR5 = null;
                                String strR6 = null;
                                while (cVar.w()) {
                                    int iZ2 = cVar.Z(k.f3419a);
                                    if (iZ2 != 0) {
                                        float f15 = f14;
                                        if (iZ2 == 1) {
                                            strR5 = cVar.R();
                                        } else if (iZ2 == 2) {
                                            strR6 = cVar.R();
                                        } else if (iZ2 != 3) {
                                            cVar.f0();
                                            cVar.i0();
                                        } else {
                                            cVar.G();
                                        }
                                        f14 = f15;
                                    } else {
                                        strR4 = cVar.R();
                                    }
                                }
                                cVar.i();
                                map3.put(strR5, new x8.d(strR4, strR5, strR6));
                                f14 = f14;
                            }
                            cVar.h();
                        }
                    }
                    f11 = f14;
                    cVar.i();
                    hVar3 = hVar5;
                    hVar5 = hVar3;
                    iG2 = i10;
                    fG2 = f11;
                    fC = f10;
                    break;
                case 9:
                    f10 = fC;
                    i10 = iG2;
                    f12 = fG2;
                    cVar.b();
                    while (cVar.w()) {
                        io.sentry.internal.debugmeta.c cVar3 = j.f3417a;
                        ArrayList arrayList4 = new ArrayList();
                        cVar.f();
                        double dG = 0.0d;
                        char cCharAt = 0;
                        String strR7 = null;
                        String strR8 = null;
                        while (cVar.w()) {
                            int iZ3 = cVar.Z(j.f3417a);
                            if (iZ3 == 0) {
                                cCharAt = cVar.R().charAt(0);
                            } else if (iZ3 == 1) {
                                cVar.G();
                            } else if (iZ3 == 2) {
                                dG = cVar.G();
                            } else if (iZ3 == 3) {
                                strR7 = cVar.R();
                            } else if (iZ3 == 4) {
                                strR8 = cVar.R();
                            } else if (iZ3 != 5) {
                                cVar.f0();
                                cVar.i0();
                            } else {
                                cVar.f();
                                while (cVar.w()) {
                                    if (cVar.Z(j.f3418b) != 0) {
                                        cVar.f0();
                                        cVar.i0();
                                    } else {
                                        cVar.b();
                                        while (cVar.w()) {
                                            arrayList4.add((z8.r) g.a(cVar, hVar5));
                                        }
                                        cVar.h();
                                    }
                                }
                                cVar.i();
                            }
                        }
                        cVar.i();
                        x8.e eVar = new x8.e(arrayList4, cCharAt, dG, strR7, strR8);
                        j0Var.d(eVar.hashCode(), eVar);
                    }
                    cVar.h();
                    f11 = f12;
                    hVar3 = hVar5;
                    hVar5 = hVar3;
                    iG2 = i10;
                    fG2 = f11;
                    fC = f10;
                    break;
                case 10:
                    cVar.b();
                    while (cVar.w()) {
                        cVar.f();
                        String strR9 = null;
                        float fG4 = 0.0f;
                        float fG5 = 0.0f;
                        while (cVar.w()) {
                            int iZ4 = cVar.Z(f3440d);
                            if (iZ4 != 0) {
                                f13 = fC;
                                if (iZ4 == 1) {
                                    i11 = iG2;
                                    fG2 = fG2;
                                    fG4 = (float) cVar.G();
                                } else if (iZ4 != 2) {
                                    cVar.f0();
                                    cVar.i0();
                                } else {
                                    i11 = iG2;
                                    fG2 = fG2;
                                    fG5 = (float) cVar.G();
                                }
                                iG2 = i11;
                            } else {
                                f13 = fC;
                                strR9 = cVar.R();
                            }
                            fC = f13;
                        }
                        cVar.i();
                        arrayList2.add(new x8.i(strR9, fG4, fG5));
                        fG2 = fG2;
                        iG2 = iG2;
                        fC = fC;
                    }
                    f10 = fC;
                    i10 = iG2;
                    f12 = fG2;
                    cVar.h();
                    f11 = f12;
                    hVar3 = hVar5;
                    hVar5 = hVar3;
                    iG2 = i10;
                    fG2 = f11;
                    fC = f10;
                    break;
                default:
                    cVar.f0();
                    cVar.i0();
                    f10 = fC;
                    hVar3 = hVar5;
                    i10 = iG2;
                    f11 = fG2;
                    hVar5 = hVar3;
                    iG2 = i10;
                    fG2 = f11;
                    fC = f10;
                    break;
            }
        }
        float f16 = fC;
        r8.h hVar9 = hVar5;
        Rect rect = new Rect(0, 0, (int) (iG * f16), (int) (iG2 * f16));
        float fC2 = e9.j.c();
        hVar9.k = rect;
        hVar9.f21332l = fG2;
        hVar9.f21333m = fG;
        hVar9.f21334n = fG3;
        hVar9.j = arrayList;
        hVar9.f21331i = oVar;
        hVar9.f21325c = map;
        hVar9.f21326d = map2;
        hVar9.f21327e = fC2;
        hVar9.f21330h = j0Var;
        hVar9.f21328f = map3;
        hVar9.f21329g = arrayList2;
        return hVar9;
    }
}

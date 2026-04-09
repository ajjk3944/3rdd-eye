package s2;

import android.graphics.Rect;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.singular.sdk.internal.SingularParamsBase;
import i2.C4430C;
import i2.C4448h;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import m0.C5313f;
import n2.C5349c;
import n2.C5350d;
import n2.C5354h;
import q2.e;
import t2.AbstractC5601b;
import u2.C5624c;
import u2.C5629h;

/* compiled from: LottieCompositionMoshiParser.java */
/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC5601b.a f46010a = AbstractC5601b.a.a("w", "h", "ip", "op", "fr", "v", "layers", "assets", "fonts", "chars", "markers");

    /* renamed from: b, reason: collision with root package name */
    public static final AbstractC5601b.a f46011b = AbstractC5601b.a.a(FacebookMediationAdapter.KEY_ID, "layers", "w", "h", SingularParamsBase.Constants.PLATFORM_KEY, SingularParamsBase.Constants.IDENTIFIER_UNIQUE_ID_KEY);

    /* renamed from: c, reason: collision with root package name */
    public static final AbstractC5601b.a f46012c = AbstractC5601b.a.a("list");

    /* renamed from: d, reason: collision with root package name */
    public static final AbstractC5601b.a f46013d = AbstractC5601b.a.a("cm", "tm", "dr");

    public static C4448h a(t2.c cVar) throws IOException, NumberFormatException {
        float f10;
        ArrayList arrayList;
        float f11;
        float fC = C5629h.c();
        C5313f<q2.e> c5313f = new C5313f<>();
        ArrayList arrayList2 = new ArrayList();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        ArrayList arrayList3 = new ArrayList();
        m0.j<C5350d> jVar = new m0.j<>();
        C4448h c4448h = new C4448h();
        cVar.c();
        float fA = 0.0f;
        int iB = 0;
        int iB2 = 0;
        float fA2 = 0.0f;
        float fA3 = 0.0f;
        while (cVar.l()) {
            switch (cVar.k0(f46010a)) {
                case 0:
                    iB = cVar.B();
                    break;
                case 1:
                    iB2 = cVar.B();
                    break;
                case 2:
                    f10 = fC;
                    fA2 = (float) cVar.A();
                    fC = f10;
                    break;
                case 3:
                    f10 = fC;
                    fA = ((float) cVar.A()) - 0.01f;
                    fC = f10;
                    break;
                case 4:
                    f10 = fC;
                    fA3 = (float) cVar.A();
                    fC = f10;
                    break;
                case 5:
                    f10 = fC;
                    arrayList = arrayList3;
                    f11 = fA;
                    String[] strArrSplit = cVar.D().split("\\.");
                    int i = Integer.parseInt(strArrSplit[0]);
                    int i10 = Integer.parseInt(strArrSplit[1]);
                    int i11 = Integer.parseInt(strArrSplit[2]);
                    if (i < 4 || (i <= 4 && (i10 < 4 || (i10 <= 4 && i11 < 0)))) {
                        c4448h.a("Lottie only supports bodymovin >= 4.4.0");
                    }
                    fA = f11;
                    arrayList3 = arrayList;
                    fC = f10;
                    break;
                case 6:
                    f10 = fC;
                    arrayList = arrayList3;
                    f11 = fA;
                    cVar.a();
                    int i12 = 0;
                    while (cVar.l()) {
                        q2.e eVarA = u.a(cVar, c4448h);
                        if (eVarA.f45378e == e.a.IMAGE) {
                            i12++;
                        }
                        arrayList2.add(eVarA);
                        c5313f.i(eVarA.f45377d, eVarA);
                        if (i12 > 4) {
                            C5624c.b("You have " + i12 + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
                        }
                    }
                    cVar.d();
                    fA = f11;
                    arrayList3 = arrayList;
                    fC = f10;
                    break;
                case 7:
                    f10 = fC;
                    arrayList = arrayList3;
                    f11 = fA;
                    cVar.a();
                    while (cVar.l()) {
                        ArrayList arrayList4 = new ArrayList();
                        C5313f c5313f2 = new C5313f();
                        cVar.c();
                        String strD = null;
                        String strD2 = null;
                        String strD3 = null;
                        int iB3 = 0;
                        int iB4 = 0;
                        while (cVar.l()) {
                            int iK0 = cVar.k0(f46011b);
                            if (iK0 == 0) {
                                strD = cVar.D();
                            } else if (iK0 == 1) {
                                cVar.a();
                                while (cVar.l()) {
                                    q2.e eVarA2 = u.a(cVar, c4448h);
                                    c5313f2.i(eVarA2.f45377d, eVarA2);
                                    arrayList4.add(eVarA2);
                                }
                                cVar.d();
                            } else if (iK0 == 2) {
                                iB3 = cVar.B();
                            } else if (iK0 == 3) {
                                iB4 = cVar.B();
                            } else if (iK0 == 4) {
                                strD2 = cVar.D();
                            } else if (iK0 != 5) {
                                cVar.m0();
                                cVar.p0();
                            } else {
                                strD3 = cVar.D();
                            }
                        }
                        cVar.e();
                        if (strD2 != null) {
                            map2.put(strD, new C4430C(strD, iB3, strD2, iB4, strD3));
                        } else {
                            map.put(strD, arrayList4);
                        }
                    }
                    cVar.d();
                    fA = f11;
                    arrayList3 = arrayList;
                    fC = f10;
                    break;
                case 8:
                    f10 = fC;
                    f11 = fA;
                    cVar.c();
                    while (cVar.l()) {
                        if (cVar.k0(f46012c) != 0) {
                            cVar.m0();
                            cVar.p0();
                        } else {
                            cVar.a();
                            while (cVar.l()) {
                                AbstractC5601b.a aVar = m.f45992a;
                                cVar.c();
                                String strD4 = null;
                                String strD5 = null;
                                String strD6 = null;
                                while (cVar.l()) {
                                    int iK02 = cVar.k0(m.f45992a);
                                    if (iK02 != 0) {
                                        ArrayList arrayList5 = arrayList3;
                                        if (iK02 == 1) {
                                            strD5 = cVar.D();
                                        } else if (iK02 == 2) {
                                            strD6 = cVar.D();
                                        } else if (iK02 != 3) {
                                            cVar.m0();
                                            cVar.p0();
                                        } else {
                                            cVar.A();
                                        }
                                        arrayList3 = arrayList5;
                                    } else {
                                        strD4 = cVar.D();
                                    }
                                }
                                cVar.e();
                                map3.put(strD5, new C5349c(strD4, strD5, strD6));
                                arrayList3 = arrayList3;
                            }
                            cVar.d();
                        }
                    }
                    arrayList = arrayList3;
                    cVar.e();
                    fA = f11;
                    arrayList3 = arrayList;
                    fC = f10;
                    break;
                case 9:
                    f10 = fC;
                    f11 = fA;
                    cVar.a();
                    while (cVar.l()) {
                        AbstractC5601b.a aVar2 = l.f45990a;
                        ArrayList arrayList6 = new ArrayList();
                        cVar.c();
                        double dA = 0.0d;
                        String strD7 = null;
                        String strD8 = null;
                        char cCharAt = 0;
                        while (cVar.l()) {
                            int iK03 = cVar.k0(l.f45990a);
                            if (iK03 == 0) {
                                cCharAt = cVar.D().charAt(0);
                            } else if (iK03 == 1) {
                                cVar.A();
                            } else if (iK03 == 2) {
                                dA = cVar.A();
                            } else if (iK03 == 3) {
                                strD7 = cVar.D();
                            } else if (iK03 == 4) {
                                strD8 = cVar.D();
                            } else if (iK03 != 5) {
                                cVar.m0();
                                cVar.p0();
                            } else {
                                cVar.c();
                                while (cVar.l()) {
                                    if (cVar.k0(l.f45991b) != 0) {
                                        cVar.m0();
                                        cVar.p0();
                                    } else {
                                        cVar.a();
                                        while (cVar.l()) {
                                            arrayList6.add((p2.p) C5562h.a(cVar, c4448h));
                                        }
                                        cVar.d();
                                    }
                                }
                                cVar.e();
                            }
                        }
                        cVar.e();
                        C5350d c5350d = new C5350d(arrayList6, cCharAt, dA, strD7, strD8);
                        jVar.e(c5350d.hashCode(), c5350d);
                    }
                    cVar.d();
                    arrayList = arrayList3;
                    fA = f11;
                    arrayList3 = arrayList;
                    fC = f10;
                    break;
                case 10:
                    cVar.a();
                    while (cVar.l()) {
                        cVar.c();
                        String strD9 = null;
                        float fA4 = 0.0f;
                        float fA5 = 0.0f;
                        while (cVar.l()) {
                            int iK04 = cVar.k0(f46013d);
                            if (iK04 != 0) {
                                float f12 = fC;
                                if (iK04 == 1) {
                                    fA4 = (float) cVar.A();
                                } else if (iK04 != 2) {
                                    cVar.m0();
                                    cVar.p0();
                                } else {
                                    fA5 = (float) cVar.A();
                                }
                                fC = f12;
                            } else {
                                strD9 = cVar.D();
                            }
                        }
                        float f13 = fC;
                        cVar.e();
                        arrayList3.add(new C5354h(strD9, fA4, fA5));
                        fA = fA;
                        fC = f13;
                    }
                    f10 = fC;
                    f11 = fA;
                    cVar.d();
                    arrayList = arrayList3;
                    fA = f11;
                    arrayList3 = arrayList;
                    fC = f10;
                    break;
                default:
                    cVar.m0();
                    cVar.p0();
                    f10 = fC;
                    arrayList = arrayList3;
                    f11 = fA;
                    fA = f11;
                    arrayList3 = arrayList;
                    fC = f10;
                    break;
            }
        }
        float f14 = fC;
        Rect rect = new Rect(0, 0, (int) (iB * f14), (int) (iB2 * f14));
        float fC2 = C5629h.c();
        c4448h.f38354k = rect;
        c4448h.f38355l = fA2;
        c4448h.f38356m = fA;
        c4448h.f38357n = fA3;
        c4448h.f38353j = arrayList2;
        c4448h.i = c5313f;
        c4448h.f38347c = map;
        c4448h.f38348d = map2;
        c4448h.f38349e = fC2;
        c4448h.f38352h = jVar;
        c4448h.f38350f = map3;
        c4448h.f38351g = arrayList3;
        return c4448h;
    }
}

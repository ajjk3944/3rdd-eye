package com.ui.wifiman.model.speedtest.result;

import S8.g;
import S8.l;
import W7.a;
import Xb.c;
import Zg.AbstractC3689v;
import b8.EnumC4076c;
import com.ui.wifiman.model.speedtest.result.b;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import pd.s;
import rd.b;
import ua.InterfaceC8153a;
import wa.InterfaceC8290a;
import xa.InterfaceC8439a;

/* loaded from: classes4.dex */
public interface d {

    public static final class a {

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u00040\u0001¨\u0006\u0005"}, d2 = {"com/ui/wifiman/model/speedtest/result/d$a$a", "Lcom/google/gson/reflect/a;", "Ljava/util/ArrayList;", "Lcom/ui/wifiman/model/speedtest/result/b$b$b$b$a;", "Lkotlin/collections/ArrayList;", "app-model_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* renamed from: com.ui.wifiman.model.speedtest.result.d$a$a, reason: collision with other inner class name */
        public static final class C1435a extends com.google.gson.reflect.a<ArrayList<b.AbstractC1432b.AbstractC1433b.C1434b.Provider>> {
            C1435a() {
            }
        }

        public static Xb.c a(d dVar, b.c receiver, long j10) {
            String strB;
            String strD;
            String strC;
            Integer numValueOf;
            String strA;
            String strD2;
            b.a.EnumC2104a enumC2104aE;
            String str;
            String str2;
            String str3;
            String strL;
            String str4;
            String str5;
            String str6;
            Integer num;
            AbstractC6492s.i(receiver, "$receiver");
            b.AbstractC1432b abstractC1432bC = receiver.c();
            if (abstractC1432bC instanceof b.AbstractC1432b.AbstractC1433b.C1434b) {
                String serverAddress = ((b.AbstractC1432b.AbstractC1433b.C1434b) receiver.c()).e().getServerAddress();
                String name = ((b.AbstractC1432b.AbstractC1433b.C1434b) receiver.c()).e().getName();
                String url = ((b.AbstractC1432b.AbstractC1433b.C1434b) receiver.c()).e().getUrl();
                String serverCity = ((b.AbstractC1432b.AbstractC1433b.C1434b) receiver.c()).e().getServerCity();
                String serverCountry = ((b.AbstractC1432b.AbstractC1433b.C1434b) receiver.c()).e().getServerCountry();
                List listF = ((b.AbstractC1432b.AbstractC1433b.C1434b) receiver.c()).f();
                if (listF.isEmpty()) {
                    listF = null;
                }
                strA = serverAddress;
                strD2 = name;
                enumC2104aE = null;
                str4 = null;
                str6 = null;
                str5 = null;
                num = null;
                str = url;
                str2 = serverCity;
                str3 = serverCountry;
                strL = listF != null ? l(dVar, listF) : null;
            } else if (abstractC1432bC instanceof b.AbstractC1432b.AbstractC1433b.a) {
                strA = ((b.AbstractC1432b.AbstractC1433b.a) receiver.c()).a();
                strD2 = ((b.AbstractC1432b.AbstractC1433b.a) receiver.c()).d();
                enumC2104aE = null;
                str4 = null;
                str = null;
                str2 = null;
                str3 = null;
                str6 = null;
                str5 = null;
                num = null;
                strL = null;
            } else {
                if (abstractC1432bC instanceof b.AbstractC1432b.a) {
                    String strA2 = ((b.AbstractC1432b.a) receiver.c()).a();
                    String strB2 = ((b.AbstractC1432b.a) receiver.c()).b();
                    strB = ((b.AbstractC1432b.a) receiver.c()).b();
                    InterfaceC8439a.d dVarF = ((b.AbstractC1432b.a) receiver.c()).f();
                    if (dVarF == null || (strD = dVarF.mo3getId2jxHnRY()) == null) {
                        strD = ((b.AbstractC1432b.a) receiver.c()).d();
                    }
                    strC = ((b.AbstractC1432b.a) receiver.c()).c();
                    g gVarG = ((b.AbstractC1432b.a) receiver.c()).g();
                    numValueOf = gVarG != null ? Integer.valueOf(gVarG.a()) : null;
                    enumC2104aE = ((b.AbstractC1432b.a) receiver.c()).e();
                    strA = strA2;
                    strD2 = strB2;
                    str = null;
                } else {
                    if (!(abstractC1432bC instanceof b.AbstractC1432b.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    String strA3 = ((b.AbstractC1432b.c) receiver.c()).a();
                    String strB3 = ((b.AbstractC1432b.c) receiver.c()).b();
                    strB = ((b.AbstractC1432b.c) receiver.c()).b();
                    InterfaceC8439a.d dVarE = ((b.AbstractC1432b.c) receiver.c()).e();
                    if (dVarE == null || (strD = dVarE.mo3getId2jxHnRY()) == null) {
                        strD = ((b.AbstractC1432b.c) receiver.c()).d();
                    }
                    strC = ((b.AbstractC1432b.c) receiver.c()).c();
                    g gVarF = ((b.AbstractC1432b.c) receiver.c()).f();
                    numValueOf = gVarF != null ? Integer.valueOf(gVarF.a()) : null;
                    strA = strA3;
                    strD2 = strB3;
                    enumC2104aE = null;
                    str = null;
                }
                str2 = str;
                str3 = str2;
                strL = str3;
                str4 = strB;
                str5 = strD;
                str6 = strC;
                num = numValueOf;
            }
            Long lD = receiver.d();
            c.d dVarH = h(dVar, receiver.g());
            Integer numF = receiver.f();
            Integer numE = receiver.e();
            Long lA = receiver.a();
            Long lH = receiver.h();
            c.EnumC0918c enumC0918cG = g(dVar, k(dVar, receiver.c()));
            c.a aVarF = enumC2104aE != null ? f(dVar, enumC2104aE) : null;
            ArrayList arrayListB = receiver.b();
            ArrayList arrayListI = receiver.i();
            b.AbstractC1432b abstractC1432bC2 = receiver.c();
            b.AbstractC1432b.AbstractC1433b abstractC1433b = abstractC1432bC2 instanceof b.AbstractC1432b.AbstractC1433b ? (b.AbstractC1432b.AbstractC1433b) abstractC1432bC2 : null;
            String strB4 = abstractC1433b != null ? abstractC1433b.b() : null;
            b.AbstractC1432b abstractC1432bC3 = receiver.c();
            b.AbstractC1432b.AbstractC1433b abstractC1433b2 = abstractC1432bC3 instanceof b.AbstractC1432b.AbstractC1433b ? (b.AbstractC1432b.AbstractC1433b) abstractC1432bC3 : null;
            return new Xb.c(lD, j10, dVarH, numF, numE, lA, arrayListB, lH, arrayListI, enumC0918cG, strA, str4, strD2, str, str2, str3, (Integer) null, (Integer) null, str6, str5, num, aVarF, strL, strB4, abstractC1433b2 != null ? abstractC1433b2.c() : null);
        }

        public static Xb.d b(d dVar, com.ui.wifiman.model.speedtest.result.b receiver) {
            W7.a aVarC;
            W7.a aVarB;
            AbstractC6492s.i(receiver, "$receiver");
            Xb.b bVar = new Xb.b(receiver.f(), receiver.c(), receiver.i(), receiver.h());
            long jF = receiver.f();
            EnumC4076c enumC4076cD = receiver.d();
            String strH = receiver.j().h();
            Float fValueOf = receiver.j().i() != null ? Float.valueOf(r2.a()) : null;
            String strA = receiver.j().a();
            S8.c cVarB = receiver.j().b();
            Integer numC = receiver.j().c();
            S8.d dVarD = receiver.j().d();
            W7.b bVarE = receiver.j().e();
            Integer numValueOf = (bVarE == null || (aVarB = bVarE.b()) == null) ? null : Integer.valueOf(aVarB.d());
            W7.b bVarE2 = receiver.j().e();
            Integer numValueOf2 = (bVarE2 == null || (aVarC = bVarE2.c()) == null) ? null : Integer.valueOf(aVarC.d());
            W7.f fVarF = receiver.j().f();
            Integer numValueOf3 = fVarF != null ? Integer.valueOf(fVarF.b()) : null;
            W7.f fVarG = receiver.j().g();
            Xb.a aVar = new Xb.a(jF, enumC4076cD, strH, (String) null, strA, receiver.j().j(), numValueOf3, fVarG != null ? Integer.valueOf(fVarG.b()) : null, cVarB, numC, dVarD, numValueOf, numValueOf2, fValueOf, receiver.e());
            List listG = receiver.g();
            ArrayList arrayList = new ArrayList(AbstractC3689v.w(listG, 10));
            Iterator it = listG.iterator();
            while (it.hasNext()) {
                arrayList.add(dVar.c((b.c) it.next(), receiver.f()));
            }
            return new Xb.d(bVar, aVar, arrayList);
        }

        public static b.AbstractC1432b c(d dVar, Xb.c receiver, InterfaceC8290a productCatalog) {
            List listL;
            InterfaceC8439a.d dVar2;
            InterfaceC8439a.d dVar3;
            AbstractC6492s.i(receiver, "$receiver");
            AbstractC6492s.i(productCatalog, "productCatalog");
            int i10 = b.f43154a[receiver.f().ordinal()];
            if (i10 == 1) {
                b.AbstractC1432b.AbstractC1433b.C1434b.Provider provider = new b.AbstractC1432b.AbstractC1433b.C1434b.Provider(receiver.w(), receiver.x(), receiver.q(), receiver.p(), receiver.o());
                String strY = receiver.y();
                if (strY == null || (listL = e(dVar, strY)) == null) {
                    listL = AbstractC3689v.l();
                }
                return new b.AbstractC1432b.AbstractC1433b.C1434b(provider, listL, receiver.i(), receiver.j());
            }
            if (i10 == 2) {
                return new b.AbstractC1432b.AbstractC1433b.a(receiver.w(), receiver.o(), receiver.i(), receiver.j());
            }
            if (i10 == 3) {
                String strW = receiver.w();
                String strO = receiver.o();
                String strS = receiver.s();
                String strV = receiver.v();
                String strS2 = receiver.s();
                if (strS2 != null) {
                    dVar2 = (InterfaceC8439a.d) productCatalog.c(InterfaceC8153a.C2195a.c(strS2));
                    if (dVar2 == null) {
                        dVar2 = (InterfaceC8439a.d) productCatalog.d(strS2);
                    }
                } else {
                    dVar2 = null;
                }
                Integer numZ = receiver.z();
                g gVarA = numZ != null ? g.f20381b.a(numZ.intValue()) : null;
                c.a aVarC = receiver.c();
                return new b.AbstractC1432b.a(strO, strW, strV, dVar2, strS, gVarA, aVarC != null ? j(dVar, aVarC) : null);
            }
            if (i10 != 4) {
                throw new IllegalStateException("unknown enpoint type");
            }
            String strW2 = receiver.w();
            String strO2 = receiver.o();
            String strS3 = receiver.s();
            String strV2 = receiver.v();
            String strS4 = receiver.s();
            if (strS4 != null) {
                InterfaceC8439a.d dVar4 = (InterfaceC8439a.d) productCatalog.c(InterfaceC8153a.C2195a.c(strS4));
                if (dVar4 == null) {
                    dVar4 = (InterfaceC8439a.d) productCatalog.d(strS4);
                }
                dVar3 = dVar4;
            } else {
                dVar3 = null;
            }
            Integer numZ2 = receiver.z();
            return new b.AbstractC1432b.c(strO2, strW2, strV2, dVar3, strS3, numZ2 != null ? g.f20381b.a(numZ2.intValue()) : null);
        }

        public static b.c d(d dVar, Xb.c receiver, InterfaceC8290a productCatalog) {
            AbstractC6492s.i(receiver, "$receiver");
            AbstractC6492s.i(productCatalog, "productCatalog");
            long jH = receiver.h();
            s sVarI = i(dVar, receiver.A());
            Integer numL = receiver.l();
            Integer numK = receiver.k();
            Long lD = receiver.d();
            Long lC = receiver.C();
            return new b.c(Long.valueOf(jH), sVarI, dVar.g(receiver, productCatalog), numL, numK, lD, receiver.e(), lC, receiver.D());
        }

        private static List e(d dVar, String str) {
            com.google.gson.e eVar = new com.google.gson.e();
            Type typeD = new C1435a().d();
            AbstractC6492s.h(typeD, "getType(...)");
            Object objJ = eVar.j(str, typeD);
            AbstractC6492s.h(objJ, "fromJson(...)");
            return (List) objJ;
        }

        private static c.a f(d dVar, b.a.EnumC2104a enumC2104a) {
            int i10 = b.f43158e[enumC2104a.ordinal()];
            if (i10 == 1) {
                return c.a.PHONE_IOS;
            }
            if (i10 == 2) {
                return c.a.PHONE_ANDROID;
            }
            if (i10 == 3) {
                return c.a.TABLE_IOS;
            }
            if (i10 == 4) {
                return c.a.TABLET_ANDROID;
            }
            throw new NoWhenBranchMatchedException();
        }

        private static c.EnumC0918c g(d dVar, com.ui.wifiman.model.speedtest.result.a aVar) {
            int i10 = b.f43157d[aVar.ordinal()];
            if (i10 == 1) {
                return c.EnumC0918c.INTERNET;
            }
            if (i10 == 2) {
                return c.EnumC0918c.INTERNET_ISP;
            }
            if (i10 == 3) {
                return c.EnumC0918c.LOCAL_SERVER;
            }
            if (i10 == 4) {
                return c.EnumC0918c.WIFIMAN_APP;
            }
            throw new NoWhenBranchMatchedException();
        }

        private static c.d h(d dVar, s sVar) {
            int i10 = b.f43155b[sVar.ordinal()];
            if (i10 == 1) {
                return c.d.INTERNET;
            }
            if (i10 == 2) {
                return c.d.APP_TO_APP;
            }
            if (i10 == 3) {
                return c.d.LOCAL;
            }
            if (i10 == 4) {
                return c.d.CONSOLE;
            }
            throw new NoWhenBranchMatchedException();
        }

        private static s i(d dVar, c.d dVar2) {
            int i10 = b.f43156c[dVar2.ordinal()];
            if (i10 == 1) {
                return s.INTERNET;
            }
            if (i10 == 2) {
                return s.APP_TO_APP;
            }
            if (i10 == 3) {
                return s.LOCAL;
            }
            if (i10 == 4) {
                return s.CONSOLE;
            }
            throw new NoWhenBranchMatchedException();
        }

        private static b.a.EnumC2104a j(d dVar, c.a aVar) {
            int i10 = b.f43159f[aVar.ordinal()];
            if (i10 == 1) {
                return b.a.EnumC2104a.PHONE_IOS;
            }
            if (i10 != 2 && i10 != 3) {
                if (i10 == 4) {
                    return b.a.EnumC2104a.TABLET_ANDROID;
                }
                throw new NoWhenBranchMatchedException();
            }
            return b.a.EnumC2104a.PHONE_ANDROID;
        }

        private static com.ui.wifiman.model.speedtest.result.a k(d dVar, b.AbstractC1432b abstractC1432b) {
            if (abstractC1432b instanceof b.AbstractC1432b.AbstractC1433b.C1434b) {
                return com.ui.wifiman.model.speedtest.result.a.INTERNET;
            }
            if (abstractC1432b instanceof b.AbstractC1432b.AbstractC1433b.a) {
                return com.ui.wifiman.model.speedtest.result.a.INTERNET_ISP;
            }
            if (abstractC1432b instanceof b.AbstractC1432b.c) {
                return com.ui.wifiman.model.speedtest.result.a.LOCAL_SERVER;
            }
            if (abstractC1432b instanceof b.AbstractC1432b.a) {
                return com.ui.wifiman.model.speedtest.result.a.WIFIMAN_APP;
            }
            throw new NoWhenBranchMatchedException();
        }

        private static String l(d dVar, List list) {
            String strS = new com.google.gson.e().s(list);
            AbstractC6492s.h(strS, "toJson(...)");
            return strS;
        }

        public static com.ui.wifiman.model.speedtest.result.b m(d dVar, Xb.d receiver, InterfaceC8290a productCatalog) {
            g gVarA;
            l lVarA;
            l lVarA2;
            long j10;
            List list;
            W7.b bVar;
            AbstractC6492s.i(receiver, "$receiver");
            AbstractC6492s.i(productCatalog, "productCatalog");
            long jD = receiver.b().d();
            String strC = receiver.b().c();
            String strF = receiver.b().f();
            long jE = receiver.b().e();
            EnumC4076c enumC4076cJ = receiver.a().j();
            List listH = receiver.a().h();
            if (listH == null) {
                listH = AbstractC3689v.l();
            }
            List list2 = listH;
            String strP = receiver.a().p();
            String strC2 = receiver.a().c();
            S8.c cVarR = receiver.a().r();
            Integer numE = receiver.a().e();
            S8.d dVarS = receiver.a().s();
            Float fT = receiver.a().t();
            if (fT != null) {
                gVarA = g.f20381b.a((int) fT.floatValue());
            } else {
                gVarA = null;
            }
            S8.a aVarI = receiver.a().i();
            Integer numN = receiver.a().n();
            if (numN != null) {
                lVarA = l.f20404f.a(numN.intValue());
            } else {
                lVarA = null;
            }
            Integer numO = receiver.a().o();
            if (numO != null) {
                lVarA2 = l.f20404f.a(numO.intValue());
            } else {
                lVarA2 = null;
            }
            if (receiver.a().k() == null || receiver.a().l() == null) {
                j10 = jE;
                list = list2;
                bVar = null;
            } else {
                a.C0878a c0878a = W7.a.f23676b;
                Integer numK = receiver.a().k();
                AbstractC6492s.f(numK);
                list = list2;
                W7.a aVarD = c0878a.d(numK.intValue());
                Integer numL = receiver.a().l();
                AbstractC6492s.f(numL);
                j10 = jE;
                bVar = new W7.b(aVarD, c0878a.d(numL.intValue()));
            }
            b.d dVar2 = new b.d(strP, gVarA, strC2, aVarI, lVarA, cVarR, lVarA2, numE, dVarS, bVar);
            List listC = receiver.c();
            ArrayList arrayList = new ArrayList(AbstractC3689v.w(listC, 10));
            Iterator it = listC.iterator();
            while (it.hasNext()) {
                arrayList.add(dVar.d((Xb.c) it.next(), productCatalog));
            }
            return new com.ui.wifiman.model.speedtest.result.b(jD, strC, strF, enumC4076cJ, j10, list, dVar2, arrayList);
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f43154a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f43155b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f43156c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f43157d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ int[] f43158e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ int[] f43159f;

        static {
            int[] iArr = new int[c.EnumC0918c.values().length];
            try {
                iArr[c.EnumC0918c.INTERNET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c.EnumC0918c.INTERNET_ISP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c.EnumC0918c.WIFIMAN_APP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[c.EnumC0918c.LOCAL_SERVER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f43154a = iArr;
            int[] iArr2 = new int[s.values().length];
            try {
                iArr2[s.INTERNET.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[s.APP_TO_APP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[s.LOCAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[s.CONSOLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            f43155b = iArr2;
            int[] iArr3 = new int[c.d.values().length];
            try {
                iArr3[c.d.INTERNET.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[c.d.APP_TO_APP.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[c.d.LOCAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[c.d.CONSOLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            f43156c = iArr3;
            int[] iArr4 = new int[com.ui.wifiman.model.speedtest.result.a.values().length];
            try {
                iArr4[com.ui.wifiman.model.speedtest.result.a.INTERNET.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr4[com.ui.wifiman.model.speedtest.result.a.INTERNET_ISP.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[com.ui.wifiman.model.speedtest.result.a.LOCAL_SERVER.ordinal()] = 3;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr4[com.ui.wifiman.model.speedtest.result.a.WIFIMAN_APP.ordinal()] = 4;
            } catch (NoSuchFieldError unused16) {
            }
            f43157d = iArr4;
            int[] iArr5 = new int[b.a.EnumC2104a.values().length];
            try {
                iArr5[b.a.EnumC2104a.PHONE_IOS.ordinal()] = 1;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr5[b.a.EnumC2104a.PHONE_ANDROID.ordinal()] = 2;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr5[b.a.EnumC2104a.TABLE_IOS.ordinal()] = 3;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr5[b.a.EnumC2104a.TABLET_ANDROID.ordinal()] = 4;
            } catch (NoSuchFieldError unused20) {
            }
            f43158e = iArr5;
            int[] iArr6 = new int[c.a.values().length];
            try {
                iArr6[c.a.PHONE_IOS.ordinal()] = 1;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr6[c.a.PHONE_ANDROID.ordinal()] = 2;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr6[c.a.TABLE_IOS.ordinal()] = 3;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr6[c.a.TABLET_ANDROID.ordinal()] = 4;
            } catch (NoSuchFieldError unused24) {
            }
            f43159f = iArr6;
        }
    }

    Xb.c c(b.c cVar, long j10);

    b.c d(Xb.c cVar, InterfaceC8290a interfaceC8290a);

    b.AbstractC1432b g(Xb.c cVar, InterfaceC8290a interfaceC8290a);
}

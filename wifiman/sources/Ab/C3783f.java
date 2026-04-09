package ab;

import Ca.a;
import Zg.AbstractC3682n;
import Zg.AbstractC3689v;
import Zg.U;
import ab.C3781d;
import com.ui.product.firmware.UiFirmwareBoard;
import com.ui.product.firmware.UiFirmwarePlatform;
import com.ui.uidb.UiDB;
import com.ui.uidb.api.ApiProduct;
import com.ui.uidb.api.ApiProductCompliance;
import com.ui.uidb.api.ApiProductUisp;
import com.ui.uidb.product.UiDBProduct$Factory$InvalidProduct;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.text.t;
import mh.InterfaceC6835l;
import sh.AbstractC7978m;
import ua.InterfaceC8153a;
import va.C8203a;
import va.C8204b;
import zi.AbstractC8783m;
import zi.InterfaceC8780j;

/* renamed from: ab.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3783f {

    /* renamed from: a, reason: collision with root package name */
    private final C3778a f25905a = new C3778a();

    /* renamed from: b, reason: collision with root package name */
    private final C3779b f25906b = new C3779b();

    /* renamed from: c, reason: collision with root package name */
    private final C3780c f25907c = new C3780c();

    /* renamed from: ab.f$a */
    static final class a implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final a f25908a = new a();

        a() {
        }

        public final String a(String it) {
            AbstractC6492s.i(it, "it");
            return InterfaceC8153a.d.c(it);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return InterfaceC8153a.d.a(a((String) obj));
        }
    }

    private final Map b(ApiProduct apiProduct) {
        LinkedHashMap linkedHashMap = null;
        if (apiProduct.getBtle() != null) {
            ArrayList arrayList = new ArrayList();
            if (apiProduct.getBtle().getFactory() != null) {
                try {
                    UUID uuidFromString = UUID.fromString(apiProduct.getBtle().getFactory());
                    AbstractC6492s.h(uuidFromString, "fromString(...)");
                    arrayList.add(new C8203a(C8204b.c(uuidFromString), va.c.FACTORY, null));
                } catch (IllegalArgumentException unused) {
                    throw new UiDBProduct$Factory$InvalidProduct("Factory BTLE service is not in UUID format: " + apiProduct.getBtle().getFactory(), null, 2, null);
                }
            }
            if (apiProduct.getBtle().getConfigured() != null) {
                try {
                    UUID uuidFromString2 = UUID.fromString(apiProduct.getBtle().getConfigured());
                    AbstractC6492s.h(uuidFromString2, "fromString(...)");
                    arrayList.add(new C8203a(C8204b.c(uuidFromString2), va.c.CONFIGURED, null));
                } catch (IllegalArgumentException unused2) {
                    throw new UiDBProduct$Factory$InvalidProduct("Configured BTLE service is not in UUID format: " + apiProduct.getBtle().getConfigured(), null, 2, null);
                }
            }
            if (arrayList.isEmpty()) {
                arrayList = null;
            }
            if (arrayList != null) {
                linkedHashMap = new LinkedHashMap(AbstractC7978m.d(U.d(AbstractC3689v.w(arrayList, 10)), 16));
                for (Object obj : arrayList) {
                    linkedHashMap.put(C8204b.a(((C8203a) obj).a()), obj);
                }
            }
        }
        return linkedHashMap;
    }

    private final Ca.a c(ApiProduct apiProduct) {
        List listA;
        List listG;
        List listD;
        ApiProductCompliance compliance = apiProduct.getCompliance();
        if (compliance == null) {
            return null;
        }
        String modelName = compliance.getModelName();
        String str = (modelName == null || t.m0(modelName)) ? null : modelName;
        String productName = compliance.getProductName();
        String str2 = (productName == null || t.m0(productName)) ? null : productName;
        String fcc = compliance.getFcc();
        if (fcc == null || t.m0(fcc)) {
            fcc = null;
        }
        a.g gVar = new a.g(fcc, compliance.getRfCmFcc(), compliance.q());
        if (gVar.a() == null && gVar.c() == null && ((listD = gVar.d()) == null || listD.isEmpty())) {
            gVar = null;
        }
        String icEmi = compliance.getIcEmi();
        if (icEmi == null || t.m0(icEmi)) {
            icEmi = null;
        }
        String ic2 = compliance.getIc();
        if (ic2 == null || t.m0(ic2)) {
            ic2 = null;
        }
        a.c cVar = new a.c(icEmi, ic2, compliance.getRfCmIc(), compliance.b());
        a.c cVar2 = (cVar.c() == null && cVar.a() == null && cVar.d() == null && ((listG = cVar.g()) == null || listG.isEmpty())) ? null : cVar;
        a.C0109a c0109a = new a.C0109a(compliance.getRcm());
        a.C0109a c0109a2 = c0109a.a() != null ? c0109a : null;
        String anatel = compliance.getAnatel();
        if (anatel == null || t.m0(anatel)) {
            anatel = null;
        }
        a.b bVar = new a.b(anatel);
        a.b bVar2 = bVar.a() != null ? bVar : null;
        List jrf = compliance.getJrf();
        if (jrf == null || jrf.isEmpty()) {
            jrf = null;
        }
        List jrf2 = compliance.getJrf();
        if (jrf2 == null || jrf2.isEmpty()) {
            jrf2 = null;
        }
        String wifi = compliance.getWifi();
        if (wifi == null || t.m0(wifi)) {
            wifi = null;
        }
        a.d dVar = new a.d(jrf, jrf2, wifi);
        List listC = dVar.c();
        if ((listC == null || listC.isEmpty()) && (((listA = dVar.a()) == null || listA.isEmpty()) && dVar.d() == null)) {
            dVar = null;
        }
        String ncc = compliance.getNcc();
        if (ncc == null || t.m0(ncc)) {
            ncc = null;
        }
        a.f fVar = new a.f(ncc);
        a.f fVar2 = fVar.a() != null ? fVar : null;
        String kc2 = compliance.getKc();
        if (kc2 == null || t.m0(kc2)) {
            kc2 = null;
        }
        a.e eVar = new a.e(kc2);
        return new Ca.a(str, str2, gVar, cVar2, c0109a2, bVar2, dVar, fVar2, eVar.a() != null ? eVar : null, compliance.getIndoorOnly());
    }

    private final Set d(ApiProduct apiProduct) {
        HashSet hashSet = new HashSet();
        List<String> guids = apiProduct.getGuids();
        if (guids != null) {
            for (String str : guids) {
                try {
                    hashSet.add(UUID.fromString(str));
                } catch (IllegalArgumentException unused) {
                    throw new UiDBProduct$Factory$InvalidProduct("GUID is not in UUID format: " + str, null, 2, null);
                }
            }
        }
        return hashSet;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.util.Set e(com.ui.uidb.api.ApiProduct r11, java.lang.String r12, com.ui.uidb.UiDB.b r13) {
        /*
            r10 = this;
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.Map r11 = r11.getImage()
            if (r11 == 0) goto L89
            java.util.Set r11 = r11.entrySet()
            java.util.Iterator r11 = r11.iterator()
        L13:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L89
            java.lang.Object r1 = r11.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            boolean r3 = kotlin.text.t.m0(r2)
            if (r3 != 0) goto L13
            boolean r3 = kotlin.text.t.m0(r1)
            if (r3 != 0) goto L13
            java.lang.String r5 = ab.C3781d.a.C0988a.a(r1)
            int r1 = r2.hashCode()
            r3 = -1879416016(0xffffffff8ffa6330, float:-2.4690109E-29)
            if (r1 == r3) goto L6a
            r3 = -951467409(0xffffffffc749c26f, float:-51650.434)
            if (r1 == r3) goto L5d
            r3 = 1544803905(0x5c13d641, float:1.6644958E17)
            if (r1 == r3) goto L4f
            goto L73
        L4f:
            java.lang.String r1 = "default"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L59
            goto L73
        L59:
            ab.d$a$b$b r1 = ab.C3781d.a.b.C0990b.f25870b
        L5b:
            r7 = r1
            goto L7c
        L5d:
            java.lang.String r1 = "topology"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L67
            goto L73
        L67:
            ab.d$a$b$d r1 = ab.C3781d.a.b.C0991d.f25874b
            goto L5b
        L6a:
            java.lang.String r1 = "nopadding"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L79
        L73:
            ab.d$a$b$e r1 = new ab.d$a$b$e
            r1.<init>(r2)
            goto L5b
        L79:
            ab.d$a$b$c r1 = ab.C3781d.a.b.c.f25872b
            goto L5b
        L7c:
            ab.d$a r1 = new ab.d$a
            r9 = 0
            r4 = r1
            r6 = r12
            r8 = r13
            r4.<init>(r5, r6, r7, r8, r9)
            r0.add(r1)
            goto L13
        L89:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ab.C3783f.e(com.ui.uidb.api.ApiProduct, java.lang.String, com.ui.uidb.UiDB$b):java.util.Set");
    }

    private final C3781d.b f(ApiProduct apiProduct) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        List shortnames = apiProduct.getShortnames();
        if (shortnames == null) {
            n(apiProduct, "shortnames");
            throw new KotlinNothingValueException();
        }
        Iterator it = shortnames.iterator();
        while (it.hasNext()) {
            linkedHashSet.add((String) it.next());
        }
        ApiProductUisp uisp = apiProduct.getUisp();
        if (uisp != null) {
            List legacyLookup = uisp.getLegacyLookup();
            if (legacyLookup == null) {
                n(apiProduct, "uisp", "nameLegacy");
                throw new KotlinNothingValueException();
            }
            Iterator it2 = legacyLookup.iterator();
            while (it2.hasNext()) {
                linkedHashSet.add((String) it2.next());
            }
        }
        List lookupTriplets = apiProduct.getLookupTriplets();
        if (lookupTriplets == null) {
            n(apiProduct, "triplets");
            throw new KotlinNothingValueException();
        }
        List<ApiProduct.Triplet> list = lookupTriplets;
        ArrayList arrayList = new ArrayList(AbstractC3689v.w(list, 10));
        for (ApiProduct.Triplet triplet : list) {
            String modelV1 = triplet.getModelV1();
            String str = null;
            if (modelV1 == null || t.m0(modelV1)) {
                modelV1 = null;
            }
            String modelV2 = triplet.getModelV2();
            if (modelV2 == null || t.m0(modelV2)) {
                modelV2 = null;
            }
            String productName = triplet.getProductName();
            if (productName != null && !t.m0(productName)) {
                str = productName;
            }
            arrayList.add(new C3781d.b.a(modelV1, modelV2, str));
        }
        return new C3781d.b(arrayList, linkedHashSet);
    }

    private final String g(ApiProduct apiProduct, String str) {
        Map minAdoptVersion = apiProduct.getMinAdoptVersion();
        if (minAdoptVersion != null) {
            return (String) minAdoptVersion.get(str);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final ua.b h(com.ui.uidb.api.ApiProduct r6) {
        /*
            r5 = this;
            com.ui.uidb.api.ApiProduct$Line r0 = r6.getLine()
            java.lang.String r1 = "line"
            if (r0 == 0) goto La8
            java.lang.String r0 = r0.getId()
            if (r0 == 0) goto La8
            ab.a r0 = r5.f25905a
            com.ui.uidb.api.ApiProduct$Line r2 = r6.getLine()
            java.lang.String r2 = r2.getId()
            ua.b r0 = r0.a(r2)
            if (r0 != 0) goto L2c
            ua.b$v r0 = new ua.b$v
            com.ui.uidb.api.ApiProduct$Line r2 = r6.getLine()
            java.lang.String r2 = r2.getId()
            r0.<init>(r2)
        L2c:
            java.lang.String r2 = r6.getType()
            r3 = 0
            if (r2 == 0) goto L48
            boolean r4 = kotlin.text.t.m0(r2)
            if (r4 != 0) goto L3a
            goto L3b
        L3a:
            r2 = r3
        L3b:
            if (r2 == 0) goto L48
            ab.a r2 = r5.f25905a
            java.lang.String r4 = r6.getType()
            ua.b r2 = r2.b(r0, r4)
            goto L49
        L48:
            r2 = r3
        L49:
            if (r2 != 0) goto L7b
            com.ui.uidb.api.ApiProductUisp r4 = r6.getUisp()
            if (r4 == 0) goto L7b
            com.ui.uidb.api.ApiProductUisp r2 = r6.getUisp()
            java.lang.String r2 = r2.getLine()
            if (r2 == 0) goto L6b
            boolean r4 = kotlin.text.t.m0(r2)
            if (r4 == 0) goto L62
            r2 = r3
        L62:
            if (r2 == 0) goto L6b
            ab.b r1 = r5.f25906b
            ua.b r2 = r1.e(r2)
            goto L7b
        L6b:
            java.lang.String r0 = "uisp"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            r5.n(r6, r0)
            kotlin.KotlinNothingValueException r6 = new kotlin.KotlinNothingValueException
            r6.<init>()
            throw r6
        L7b:
            if (r2 != 0) goto La3
            com.ui.uidb.api.ApiProductUnifi r1 = r6.getUnifi()
            if (r1 == 0) goto La3
            com.ui.uidb.api.ApiProductUnifi r6 = r6.getUnifi()
            com.ui.uidb.api.ApiProductUnifi$Network r6 = r6.getNetwork()
            if (r6 == 0) goto La2
            java.lang.String r6 = r6.getType()
            if (r6 == 0) goto La2
            boolean r1 = kotlin.text.t.m0(r6)
            if (r1 == 0) goto L9a
            r6 = r3
        L9a:
            if (r6 == 0) goto La2
            ab.c r1 = r5.f25907c
            ua.b r3 = r1.a(r6)
        La2:
            r2 = r3
        La3:
            if (r2 != 0) goto La6
            goto La7
        La6:
            r0 = r2
        La7:
            return r0
        La8:
            java.lang.String r0 = "id"
            java.lang.String[] r0 = new java.lang.String[]{r1, r0}
            r5.n(r6, r0)
            kotlin.KotlinNothingValueException r6 = new kotlin.KotlinNothingValueException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ab.C3783f.h(com.ui.uidb.api.ApiProduct):ua.b");
    }

    private final C3781d.c i(ApiProduct apiProduct) {
        List board;
        InterfaceC8780j interfaceC8780jD0;
        InterfaceC8780j interfaceC8780jN;
        Set setB0;
        UiFirmwarePlatform unknown;
        va.c cVarB;
        LinkedHashMap linkedHashMap = null;
        if (apiProduct.getUisp() == null) {
            return null;
        }
        ApiProductUisp.Firmware fw = apiProduct.getUisp().getFw();
        if (fw == null || (board = fw.getBoard()) == null || (interfaceC8780jD0 = AbstractC3689v.d0(board)) == null || (interfaceC8780jN = AbstractC8783m.N(interfaceC8780jD0, new InterfaceC6835l() { // from class: ab.e
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return C3783f.j(this.f25904a, (String) obj);
            }
        })) == null || (setB0 = AbstractC8783m.b0(interfaceC8780jN)) == null) {
            n(apiProduct, "uisp", "firmware", "board");
            throw new KotlinNothingValueException();
        }
        String platform = apiProduct.getUisp().getFw().getPlatform();
        if (platform == null || (unknown = this.f25906b.d(platform)) == null) {
            String platform2 = apiProduct.getUisp().getFw().getPlatform();
            if (platform2 == null) {
                platform2 = "unknown";
            }
            unknown = new UiFirmwarePlatform.Unknown(platform2);
        }
        Ea.b bVar = new Ea.b(setB0, unknown);
        Map bleServices = apiProduct.getUisp().getBleServices();
        if (bleServices != null) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry : bleServices.entrySet()) {
                String str = (String) entry.getKey();
                ApiProductUisp.BleService bleService = (ApiProductUisp.BleService) entry.getValue();
                try {
                    UUID uuidFromString = UUID.fromString(str);
                    AbstractC6492s.f(uuidFromString);
                    UUID uuidC = C8204b.c(uuidFromString);
                    C8204b c8204bA = C8204b.a(uuidC);
                    String mode = bleService.getMode();
                    if (mode == null || (cVarB = this.f25906b.b(mode)) == null) {
                        n(apiProduct, "uisp", "bleServices", "mode");
                        throw new KotlinNothingValueException();
                    }
                    Boolean boolA = this.f25906b.a(bleService.getMode());
                    if (boolA == null) {
                        n(apiProduct, "uisp", "bleServices", "mode");
                        throw new KotlinNothingValueException();
                    }
                    linkedHashMap2.put(c8204bA, new Ea.a(uuidC, cVarB, boolA.booleanValue(), null));
                } catch (IllegalArgumentException unused) {
                    throw new UiDBProduct$Factory$InvalidProduct("UISP BTLE service is not in UUID format: " + str, null, 2, null);
                }
            }
            if (!linkedHashMap2.isEmpty()) {
                linkedHashMap = linkedHashMap2;
            }
        }
        return new C3781d.c(linkedHashMap, bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UiFirmwareBoard j(C3783f c3783f, String board) {
        AbstractC6492s.i(board, "board");
        UiFirmwareBoard uiFirmwareBoardC = c3783f.f25906b.c(board);
        return uiFirmwareBoardC == null ? new UiFirmwareBoard.Unknown(board) : uiFirmwareBoardC;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final ab.C3781d.C0992d k(com.ui.uidb.api.ApiProduct r13) {
        /*
            Method dump skipped, instructions count: 448
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ab.C3783f.k(com.ui.uidb.api.ApiProduct):ab.d$d");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.util.Set l(com.ui.uidb.api.ApiProduct r11, java.lang.String r12, com.ui.uidb.UiDB.b r13) {
        /*
            r10 = this;
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.Map r11 = r11.getVideo()
            if (r11 == 0) goto L89
            java.util.Set r11 = r11.entrySet()
            java.util.Iterator r11 = r11.iterator()
        L13:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L89
            java.lang.Object r1 = r11.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            boolean r3 = kotlin.text.t.m0(r2)
            if (r3 != 0) goto L13
            boolean r3 = kotlin.text.t.m0(r1)
            if (r3 != 0) goto L13
            java.lang.String r5 = ab.C3781d.e.a.a(r1)
            int r1 = r2.hashCode()
            r3 = 781552001(0x2e958981, float:6.800161E-11)
            if (r1 == r3) goto L6a
            r3 = 1125866714(0x431b5cda, float:155.3627)
            if (r1 == r3) goto L5d
            r3 = 1704557026(0x659979e2, float:9.05963E22)
            if (r1 == r3) goto L4f
            goto L73
        L4f:
            java.lang.String r1 = "mobile-setup-wizard-testing-connection"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L59
            goto L73
        L59:
            ab.d$e$b$d r1 = ab.C3781d.e.b.C0994d.f25901b
        L5b:
            r7 = r1
            goto L7c
        L5d:
            java.lang.String r1 = "mobile-setup-wizard-plugin"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L67
            goto L73
        L67:
            ab.d$e$b$c r1 = ab.C3781d.e.b.c.f25899b
            goto L5b
        L6a:
            java.lang.String r1 = "mobile-intro"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L79
        L73:
            ab.d$e$b$e r1 = new ab.d$e$b$e
            r1.<init>(r2)
            goto L5b
        L79:
            ab.d$e$b$b r1 = ab.C3781d.e.b.C0993b.f25897b
            goto L5b
        L7c:
            ab.d$e r1 = new ab.d$e
            r9 = 0
            r4 = r1
            r6 = r12
            r8 = r13
            r4.<init>(r5, r6, r7, r8, r9)
            r0.add(r1)
            goto L13
        L89:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ab.C3783f.l(com.ui.uidb.api.ApiProduct, java.lang.String, com.ui.uidb.UiDB$b):java.util.Set");
    }

    private final Void n(ApiProduct apiProduct, String... strArr) {
        String strI0 = AbstractC3682n.I0(strArr, ".", null, null, 0, null, null, 62, null);
        String id2 = apiProduct.getId();
        ApiProduct.Names names = apiProduct.getNames();
        throw new UiDBProduct$Factory$InvalidProduct("Missing field - '" + strI0 + "' at product [" + id2 + "](" + (names != null ? names.getName() : null) + ")", null, 2, null);
    }

    public C3781d m(UiDB.b environment, ApiProduct apiProduct) {
        String name;
        Set setB0;
        AbstractC6492s.i(environment, "environment");
        AbstractC6492s.i(apiProduct, "apiProduct");
        String id2 = apiProduct.getId();
        if (id2 != null) {
            String str = null;
            Object next = null;
            if (t.m0(id2)) {
                id2 = null;
            }
            if (id2 != null) {
                String strC = InterfaceC8153a.C2195a.c(id2);
                ApiProduct.Names names = apiProduct.getNames();
                if (names != null && (name = names.getName()) != null) {
                    String str2 = t.m0(name) ? null : name;
                    if (str2 != null) {
                        String nameAbbreviated = apiProduct.getNames().getNameAbbreviated();
                        if (nameAbbreviated != null) {
                            String str3 = t.m0(nameAbbreviated) ? null : nameAbbreviated;
                            if (str3 != null) {
                                List shortnames = apiProduct.getShortnames();
                                if (shortnames != null) {
                                    Iterator it = shortnames.iterator();
                                    if (it.hasNext()) {
                                        next = it.next();
                                        if (it.hasNext()) {
                                            int length = ((String) next).length();
                                            do {
                                                Object next2 = it.next();
                                                int length2 = ((String) next2).length();
                                                if (length > length2) {
                                                    next = next2;
                                                    length = length2;
                                                }
                                            } while (it.hasNext());
                                        }
                                    }
                                    str = (String) next;
                                }
                                String str4 = str;
                                ua.b bVarH = h(apiProduct);
                                List systemIds = apiProduct.getSystemIds();
                                if (systemIds != null && (setB0 = AbstractC8783m.b0(AbstractC8783m.N(AbstractC3689v.d0(systemIds), a.f25908a))) != null) {
                                    return new C3781d(strC, d(apiProduct), str2, str3, str4, bVarH, setB0, e(apiProduct, strC, environment), l(apiProduct, strC, environment), i(apiProduct), k(apiProduct), b(apiProduct), c(apiProduct), f(apiProduct), null);
                                }
                                n(apiProduct, "sysids");
                                throw new KotlinNothingValueException();
                            }
                        }
                        n(apiProduct, "product", "abbrev");
                        throw new KotlinNothingValueException();
                    }
                }
                n(apiProduct, "product", "name");
                throw new KotlinNothingValueException();
            }
        }
        n(apiProduct, "id");
        throw new KotlinNothingValueException();
    }
}

package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.xb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2128xb implements InterfaceC0466Db {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ C2128xb f17594b = new C2128xb(20);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ C2128xb f17595c = new C2128xb(21);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ C2128xb f17596d = new C2128xb(22);

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ C2128xb f17597e = new C2128xb(23);

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ C2128xb f17598f = new C2128xb(24);

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ C2128xb f17599g = new C2128xb(27);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17600a;

    public /* synthetic */ C2128xb(int i) {
        this.f17600a = i;
    }

    private final void a(Object obj, Map map) {
        InterfaceC0828Yg interfaceC0828Yg = (InterfaceC0828Yg) obj;
        try {
            String str = (String) map.get("enabled");
            C2128xb c2128xb = AbstractC0449Cb.f7599a;
            if (!AbstractC0582Jp.Z("true", str) && !AbstractC0582Jp.Z("false", str)) {
                return;
            }
            Nx nxF = Nx.f(interfaceC0828Yg.getContext());
            boolean z6 = Boolean.parseBoolean(str);
            nxF.getClass();
            synchronized (Nx.class) {
                ((Vu) nxF.f10110b).C(Boolean.valueOf(z6), "paidv2_user_option");
            }
        } catch (IOException e6) {
            p2.j.f22785C.f22795h.f("DefaultGmsgHandlers.SetPaidv2PersonalizationEnabled", e6);
        }
    }

    private final void b(Object obj, Map map) {
        InterfaceC0828Yg interfaceC0828Yg = (InterfaceC0828Yg) obj;
        if (map.containsKey("start")) {
            C1649oh c1649ohL0 = interfaceC0828Yg.l0();
            synchronized (c1649ohL0.f16011d) {
            }
            c1649ohL0.f16003R++;
            c1649ohL0.Q();
            return;
        }
        if (map.containsKey("stop")) {
            r3.f16003R--;
            interfaceC0828Yg.l0().Q();
        } else if (map.containsKey("cancel")) {
            C1649oh c1649ohL02 = interfaceC0828Yg.l0();
            A8 a8 = c1649ohL02.f16009b;
            if (a8 != null) {
                a8.b(10005);
            }
            c1649ohL02.f16002Q = true;
            c1649ohL02.f16020n = 10004;
            c1649ohL02.f15989C = "Page loaded delay cancel.";
            c1649ohL02.Q();
            c1649ohL02.f16008a.destroy();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void c(java.lang.Object r13, java.util.Map r14) {
        /*
            Method dump skipped, instructions count: 552
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2128xb.c(java.lang.Object, java.util.Map):void");
    }

    public static final Integer d(String str, Map map) {
        if (!map.containsKey(str)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt((String) map.get(str)));
        } catch (NumberFormatException unused) {
            String str2 = (String) map.get(str);
            StringBuilder sb = new StringBuilder(str.length() + 39 + String.valueOf(str2).length());
            sb.append("Precache invalid numeric parameter '");
            sb.append(str);
            sb.append("': ");
            sb.append(str2);
            u2.k.h(sb.toString());
            return null;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:333|75|76|(12:322|78|79|(10:85|(1:87)|88|(1:90)|91|(1:93)|94|(1:96)|97|(2:99|(1:101)))|102|324|103|(1:108)(1:109)|316|110|343|116)(1:83)|82|(0)|102|324|103|(0)(0)|316|110|343|116|73) */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x032e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x032f, code lost:
    
        p2.j.f22785C.f22795h.f(r3.toString(), r0);
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0346, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0347, code lost:
    
        u2.k.f("Error constructing openable urls response.", r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0623  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0634  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02dd  */
    @Override // com.google.android.gms.internal.ads.InterfaceC0466Db
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(java.lang.Object r20, java.util.Map r21) throws org.json.JSONException, java.net.URISyntaxException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 2250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2128xb.e(java.lang.Object, java.util.Map):void");
    }
}

package ec;

import android.app.Application;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.android.gms.internal.ads.or;
import com.google.android.gms.internal.measurement.p8;
import com.google.android.gms.internal.measurement.q4;
import com.google.android.gms.internal.measurement.r4;
import j$.util.Comparator;
import j$.util.Objects;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class q2 extends f0 {

    /* renamed from: d, reason: collision with root package name */
    public m2 f23009d;

    /* renamed from: e, reason: collision with root package name */
    public yb.i f23010e;

    /* renamed from: f, reason: collision with root package name */
    public final CopyOnWriteArraySet f23011f;
    public boolean g;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicReference f23012h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f23013i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public int f23014k;

    /* renamed from: l, reason: collision with root package name */
    public f2 f23015l;

    /* renamed from: m, reason: collision with root package name */
    public f2 f23016m;

    /* renamed from: n, reason: collision with root package name */
    public PriorityQueue f23017n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f23018o;

    /* renamed from: p, reason: collision with root package name */
    public a2 f23019p;

    /* renamed from: q, reason: collision with root package name */
    public final AtomicLong f23020q;

    /* renamed from: r, reason: collision with root package name */
    public long f23021r;

    /* renamed from: s, reason: collision with root package name */
    public final n1 f23022s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f23023t;

    /* renamed from: u, reason: collision with root package name */
    public f2 f23024u;

    /* renamed from: v, reason: collision with root package name */
    public p2 f23025v;

    /* renamed from: w, reason: collision with root package name */
    public f2 f23026w;

    /* renamed from: x, reason: collision with root package name */
    public final p6.i f23027x;

    public q2(o1 o1Var) {
        super(o1Var);
        this.f23011f = new CopyOnWriteArraySet();
        this.f23013i = new Object();
        this.j = false;
        this.f23014k = 1;
        this.f23023t = true;
        this.f23027x = new p6.i(this);
        this.f23012h = new AtomicReference();
        this.f23019p = a2.f22541c;
        this.f23021r = -1L;
        this.f23020q = new AtomicLong(0L);
        this.f23022s = new n1(o1Var);
    }

    @Override // ec.f0
    public final boolean E() {
        return false;
    }

    public final void F(a2 a2Var) {
        B();
        boolean z3 = (a2Var.i(z1.ANALYTICS_STORAGE) && a2Var.i(z1.AD_STORAGE)) || ((o1) this.f218b).p().K();
        o1 o1Var = (o1) this.f218b;
        l1 l1Var = o1Var.g;
        o1.m(l1Var);
        l1Var.B();
        if (z3 != o1Var.f22972z) {
            l1 l1Var2 = o1Var.g;
            o1.m(l1Var2);
            l1Var2.B();
            o1Var.f22972z = z3;
            b1 b1Var = ((o1) this.f218b).f22953e;
            o1.k(b1Var);
            b1Var.B();
            Boolean boolValueOf = b1Var.F().contains("measurement_enabled_from_api") ? Boolean.valueOf(b1Var.F().getBoolean("measurement_enabled_from_api", true)) : null;
            if (!z3 || boolValueOf == null || boolValueOf.booleanValue()) {
                S(Boolean.valueOf(z3), false);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0055, code lost:
    
        if (r4 > 500) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008c, code lost:
    
        if (r6 > 500) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void G(java.lang.String r13, java.lang.String r14, android.os.Bundle r15, boolean r16, boolean r17, long r18) {
        /*
            Method dump skipped, instructions count: 477
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ec.q2.G(java.lang.String, java.lang.String, android.os.Bundle, boolean, boolean, long):void");
    }

    public final void H() {
        s0 s0Var;
        String str;
        int i4;
        int i10;
        int i11;
        int i12;
        s3 s3Var;
        s3 s3Var2;
        q2 q2Var;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        String str2;
        r4 r4Var;
        ud.m mVarB;
        B();
        o1 o1Var = (o1) this.f218b;
        s0 s0Var2 = o1Var.f22954f;
        tb.a aVar = o1Var.f22957k;
        o1.m(s0Var2);
        s0Var2.f23059n.d("Handle tcf update.");
        b1 b1Var = o1Var.f22953e;
        o1.k(b1Var);
        SharedPreferences sharedPreferencesG = b1Var.G();
        HashMap map = new HashMap();
        c0 c0Var = d0.f22618a1;
        int i20 = 2;
        int i21 = 1;
        if (((Boolean) c0Var.a(null)).booleanValue()) {
            ud.h hVar = u3.f23092a;
            q4 q4Var = q4.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE;
            s0Var = s0Var2;
            t3 t3Var = t3.f23082a;
            AbstractMap.SimpleImmutableEntry simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry(q4Var, t3Var);
            q4 q4Var2 = q4.IAB_TCF_PURPOSE_SELECT_BASIC_ADS;
            t3 t3Var2 = t3.f23083b;
            AbstractMap.SimpleImmutableEntry simpleImmutableEntry2 = new AbstractMap.SimpleImmutableEntry(q4Var2, t3Var2);
            q4 q4Var3 = q4.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE;
            AbstractMap.SimpleImmutableEntry simpleImmutableEntry3 = new AbstractMap.SimpleImmutableEntry(q4Var3, t3Var);
            q4 q4Var4 = q4.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS;
            AbstractMap.SimpleImmutableEntry simpleImmutableEntry4 = new AbstractMap.SimpleImmutableEntry(q4Var4, t3Var);
            q4 q4Var5 = q4.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE;
            List listAsList = Arrays.asList(simpleImmutableEntry, simpleImmutableEntry2, simpleImmutableEntry3, simpleImmutableEntry4, new AbstractMap.SimpleImmutableEntry(q4Var5, t3Var2), new AbstractMap.SimpleImmutableEntry(q4.IAB_TCF_PURPOSE_APPLY_MARKET_RESEARCH_TO_GENERATE_AUDIENCE_INSIGHTS, t3Var2), new AbstractMap.SimpleImmutableEntry(q4.IAB_TCF_PURPOSE_DEVELOP_AND_IMPROVE_PRODUCTS, t3Var2));
            com.google.android.gms.common.api.internal.a0 a0Var = new com.google.android.gms.common.api.internal.a0(listAsList != null ? listAsList.size() : 4);
            a0Var.l(listAsList);
            ud.m mVarB2 = a0Var.b();
            int i22 = ud.f.f35302c;
            ud.o oVar = new ud.o("CH");
            char[] cArr = new char[5];
            boolean zContains = sharedPreferencesG.contains("IABTCF_TCString");
            try {
                i13 = sharedPreferencesG.getInt("IABTCF_CmpSdkID", -1);
            } catch (ClassCastException unused) {
                i13 = -1;
            }
            try {
                i14 = sharedPreferencesG.getInt("IABTCF_PolicyVersion", -1);
            } catch (ClassCastException unused2) {
                i14 = -1;
            }
            try {
                i15 = sharedPreferencesG.getInt("IABTCF_gdprApplies", -1);
            } catch (ClassCastException unused3) {
                i15 = -1;
            }
            int i23 = i14;
            try {
                i16 = sharedPreferencesG.getInt("IABTCF_PurposeOneTreatment", -1);
            } catch (ClassCastException unused4) {
                i16 = -1;
            }
            try {
                i17 = sharedPreferencesG.getInt("IABTCF_EnableAdvertiserConsentMode", -1);
            } catch (ClassCastException unused5) {
                i17 = -1;
            }
            String strA = u3.a(sharedPreferencesG, "IABTCF_PublisherCC");
            int i24 = i13;
            com.google.android.gms.common.api.internal.a0 a0Var2 = new com.google.android.gms.common.api.internal.a0(4);
            ud.k kVar = (ud.k) mVarB2.f20225c;
            if (kVar == null) {
                str2 = strA;
                i18 = i16;
                i19 = i17;
                ud.k kVar2 = new ud.k(mVarB2, new ud.l(mVarB2.f35320f, 0, mVarB2.g));
                mVarB2.f20225c = kVar2;
                kVar = kVar2;
            } else {
                i18 = i16;
                i19 = i17;
                str2 = strA;
            }
            ac.h hVarL = kVar.iterator();
            while (true) {
                boolean zHasNext = hVarL.hasNext();
                r4Var = r4.PURPOSE_RESTRICTION_UNDEFINED;
                if (!zHasNext) {
                    break;
                }
                q4 q4Var6 = (q4) hVarL.next();
                int iB = q4Var6.b();
                ac.h hVar2 = hVarL;
                ud.m mVar = mVarB2;
                StringBuilder sb2 = new StringBuilder(String.valueOf(iB).length() + 28);
                sb2.append("IABTCF_PublisherRestrictions");
                sb2.append(iB);
                String strA2 = u3.a(sharedPreferencesG, sb2.toString());
                if (!TextUtils.isEmpty(strA2) && strA2.length() >= 755) {
                    int iDigit = Character.digit(strA2.charAt(754), 10);
                    r4 r4Var2 = r4.PURPOSE_RESTRICTION_NOT_ALLOWED;
                    if (iDigit < 0 || iDigit > r4.values().length || iDigit == 0) {
                        r4Var = r4Var2;
                    } else if (iDigit == i21) {
                        r4Var = r4.PURPOSE_RESTRICTION_REQUIRE_CONSENT;
                    } else if (iDigit == i20) {
                        r4Var = r4.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST;
                    }
                }
                a0Var2.k(q4Var6, r4Var);
                hVarL = hVar2;
                mVarB2 = mVar;
                i20 = 2;
                i21 = 1;
            }
            ud.m mVar2 = mVarB2;
            ud.m mVarB3 = a0Var2.b();
            String strA3 = u3.a(sharedPreferencesG, "IABTCF_PurposeConsents");
            String strA4 = u3.a(sharedPreferencesG, "IABTCF_VendorConsents");
            boolean z3 = !TextUtils.isEmpty(strA4) && strA4.length() >= 755 && strA4.charAt(754) == '1';
            String strA5 = u3.a(sharedPreferencesG, "IABTCF_PurposeLegitimateInterests");
            String strA6 = u3.a(sharedPreferencesG, "IABTCF_VendorLegitimateInterests");
            boolean z10 = !TextUtils.isEmpty(strA6) && strA6.length() >= 755 && strA6.charAt(754) == '1';
            cArr[0] = '2';
            if (zContains) {
                r4 r4Var3 = (r4) mVarB3.get(q4Var);
                r4 r4Var4 = (r4) mVarB3.get(q4Var3);
                r4 r4Var5 = (r4) mVarB3.get(q4Var4);
                r4 r4Var6 = (r4) mVarB3.get(q4Var5);
                com.google.android.gms.common.api.internal.a0 a0Var3 = new com.google.android.gms.common.api.internal.a0(4);
                a0Var3.k("Version", "2");
                boolean z11 = z3;
                a0Var3.k("VendorConsent", true != z3 ? "0" : "1");
                boolean z12 = z10;
                a0Var3.k("VendorLegitimateInterest", true != z10 ? "0" : "1");
                a0Var3.k("gdprApplies", i15 != 1 ? "0" : "1");
                int i25 = i19;
                a0Var3.k("EnableAdvertiserConsentMode", i25 != 1 ? "0" : "1");
                a0Var3.k("PolicyVersion", String.valueOf(i23));
                a0Var3.k("CmpSdkID", String.valueOf(i24));
                int i26 = i18;
                a0Var3.k("PurposeOneTreatment", i26 != 1 ? "0" : "1");
                String str3 = str2;
                a0Var3.k("PublisherCC", str3);
                a0Var3.k("PublisherRestrictions1", String.valueOf(r4Var3 != null ? r4Var3.b() : r4Var.b()));
                a0Var3.k("PublisherRestrictions3", String.valueOf(r4Var4 != null ? r4Var4.b() : r4Var.b()));
                a0Var3.k("PublisherRestrictions4", String.valueOf(r4Var5 != null ? r4Var5.b() : r4Var.b()));
                a0Var3.k("PublisherRestrictions7", String.valueOf(r4Var6 != null ? r4Var6.b() : r4Var.b()));
                String strD = u3.d(q4Var, strA3, strA5);
                String strD2 = u3.d(q4Var3, strA3, strA5);
                String strD3 = u3.d(q4Var4, strA3, strA5);
                String strD4 = u3.d(q4Var5, strA3, strA5);
                com.bumptech.glide.f.f("Purpose1", strD);
                com.bumptech.glide.f.f("Purpose3", strD2);
                com.bumptech.glide.f.f("Purpose4", strD3);
                com.bumptech.glide.f.f("Purpose7", strD4);
                a0Var3.l(ud.m.a(4, new Object[]{"Purpose1", strD, "Purpose3", strD2, "Purpose4", strD3, "Purpose7", strD4}, null).entrySet());
                int i27 = i15;
                a0Var3.l(ud.m.a(5, new Object[]{"AuthorizePurpose1", true != u3.b(q4Var, mVar2, mVarB3, oVar, cArr, i25, i27, i26, str3, strA3, strA5, z11, z12) ? "0" : "1", "AuthorizePurpose3", true != u3.b(q4Var3, mVar2, mVarB3, oVar, cArr, i25, i27, i26, str3, strA3, strA5, z11, z12) ? "0" : "1", "AuthorizePurpose4", true != u3.b(q4Var4, mVar2, mVarB3, oVar, cArr, i25, i27, i26, str3, strA3, strA5, z11, z12) ? "0" : "1", "AuthorizePurpose7", true != u3.b(q4Var5, mVar2, mVarB3, oVar, cArr, i25, i27, i26, str3, strA3, strA5, z11, z12) ? "0" : "1", "PurposeDiagnostics", new String(cArr)}, null).entrySet());
                mVarB = a0Var3.b();
            } else {
                mVarB = ud.m.f35318h;
            }
            s3Var = new s3(mVarB);
            str = "";
        } else {
            s0Var = s0Var2;
            String strA7 = u3.a(sharedPreferencesG, "IABTCF_VendorConsents");
            str = "";
            if (!str.equals(strA7) && strA7.length() > 754) {
                map.put("GoogleConsent", String.valueOf(strA7.charAt(754)));
            }
            try {
                i4 = sharedPreferencesG.getInt("IABTCF_gdprApplies", -1);
            } catch (ClassCastException unused6) {
                i4 = -1;
            }
            if (i4 != -1) {
                map.put("gdprApplies", String.valueOf(i4));
            }
            try {
                i10 = sharedPreferencesG.getInt("IABTCF_EnableAdvertiserConsentMode", -1);
            } catch (ClassCastException unused7) {
                i10 = -1;
            }
            if (i10 != -1) {
                map.put("EnableAdvertiserConsentMode", String.valueOf(i10));
            }
            try {
                i11 = sharedPreferencesG.getInt("IABTCF_PolicyVersion", -1);
            } catch (ClassCastException unused8) {
                i11 = -1;
            }
            if (i11 != -1) {
                map.put("PolicyVersion", String.valueOf(i11));
            }
            String strA8 = u3.a(sharedPreferencesG, "IABTCF_PurposeConsents");
            if (!str.equals(strA8)) {
                map.put("PurposeConsents", strA8);
            }
            try {
                i12 = sharedPreferencesG.getInt("IABTCF_CmpSdkID", -1);
            } catch (ClassCastException unused9) {
                i12 = -1;
            }
            if (i12 != -1) {
                map.put("CmpSdkID", String.valueOf(i12));
            }
            s3Var = new s3(map);
        }
        o1.m(s0Var);
        s0 s0Var3 = s0Var;
        or orVar = s0Var3.f23060o;
        orVar.e(s3Var, "Tcf preferences read");
        if (!o1Var.f22952d.L(null, c0Var)) {
            if (b1Var.J(s3Var)) {
                Bundle bundleB = s3Var.b();
                o1.m(s0Var3);
                orVar.e(bundleB, "Consent generated from Tcf");
                if (bundleB != Bundle.EMPTY) {
                    aVar.getClass();
                    V(bundleB, -30, System.currentTimeMillis());
                }
                Bundle bundle = new Bundle();
                bundle.putString("_tcfd", s3Var.c());
                I("auto", "_tcf", bundle);
                return;
            }
            return;
        }
        b1Var.B();
        String string = b1Var.F().getString("stored_tcf_param", str);
        HashMap map2 = new HashMap();
        if (TextUtils.isEmpty(string)) {
            s3Var2 = new s3(map2);
        } else {
            for (String str4 : string.split(";")) {
                String[] strArrSplit = str4.split("=");
                if (strArrSplit.length >= 2 && u3.f23092a.contains(strArrSplit[0])) {
                    map2.put(strArrSplit[0], strArrSplit[1]);
                }
            }
            s3Var2 = new s3(map2);
        }
        if (b1Var.J(s3Var)) {
            Bundle bundleB2 = s3Var.b();
            o1.m(s0Var3);
            orVar.e(bundleB2, "Consent generated from Tcf");
            if (bundleB2 != Bundle.EMPTY) {
                aVar.getClass();
                q2Var = this;
                q2Var.V(bundleB2, -30, System.currentTimeMillis());
            } else {
                q2Var = this;
            }
            Bundle bundle2 = new Bundle();
            HashMap map3 = s3Var2.f23066a;
            String str5 = (map3.isEmpty() || ((String) map3.get("Version")) != null) ? "0" : "1";
            Bundle bundleB3 = s3Var.b();
            Bundle bundleB4 = s3Var2.b();
            bundle2.putString("_tcfm", str5.concat((bundleB3.size() == bundleB4.size() && Objects.equals(bundleB3.getString("ad_storage"), bundleB4.getString("ad_storage")) && Objects.equals(bundleB3.getString("ad_personalization"), bundleB4.getString("ad_personalization")) && Objects.equals(bundleB3.getString("ad_user_data"), bundleB4.getString("ad_user_data"))) ? "0" : "1"));
            String str6 = (String) s3Var.f23066a.get("PurposeDiagnostics");
            if (TextUtils.isEmpty(str6)) {
                str6 = "200000";
            }
            bundle2.putString("_tcfd2", str6);
            bundle2.putString("_tcfd", s3Var.c());
            q2Var.I("auto", "_tcf", bundle2);
        }
    }

    public final void I(String str, String str2, Bundle bundle) {
        B();
        ((o1) this.f218b).f22957k.getClass();
        J(System.currentTimeMillis(), bundle, str, str2);
    }

    public final void J(long j, Bundle bundle, String str, String str2) {
        B();
        boolean z3 = true;
        if (this.f23010e != null && !l4.a0(str2)) {
            z3 = false;
        }
        K(str, str2, j, bundle, true, z3, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:217:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0200  */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void K(java.lang.String r30, java.lang.String r31, long r32, android.os.Bundle r34, boolean r35, boolean r36, boolean r37) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 1285
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ec.q2.K(java.lang.String, java.lang.String, long, android.os.Bundle, boolean, boolean, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void L(java.lang.String r12, java.lang.String r13, java.lang.Object r14, boolean r15, long r16) {
        /*
            Method dump skipped, instructions count: 215
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ec.q2.L(java.lang.String, java.lang.String, java.lang.Object, boolean, long):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void M(long r20, java.lang.Object r22, java.lang.String r23, java.lang.String r24) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ec.q2.M(long, java.lang.Object, java.lang.String, java.lang.String):void");
    }

    public final void N() {
        B();
        C();
        o1 o1Var = (o1) this.f218b;
        if (o1Var.h()) {
            g gVar = o1Var.f22952d;
            ((o1) gVar.f218b).getClass();
            Boolean boolN = gVar.N("google_analytics_deferred_deep_link_enabled");
            if (boolN != null && boolN.booleanValue()) {
                s0 s0Var = o1Var.f22954f;
                o1.m(s0Var);
                s0Var.f23059n.d("Deferred Deep Link feature enabled.");
                l1 l1Var = o1Var.g;
                o1.m(l1Var);
                l1Var.K(new e2(this, 2));
            }
            j3 j3VarP = o1Var.p();
            j3VarP.B();
            j3VarP.C();
            n4 n4VarR = j3VarP.R(true);
            j3VarP.N();
            o1 o1Var2 = (o1) j3VarP.f218b;
            o1Var2.f22952d.L(null, d0.f22624c1);
            o1Var2.o().I(3, new byte[0]);
            j3VarP.P(new e3(j3VarP, n4VarR, 1));
            this.f23023t = false;
            b1 b1Var = o1Var.f22953e;
            o1.k(b1Var);
            b1Var.B();
            String string = b1Var.F().getString("previous_os_version", null);
            ((o1) b1Var.f218b).q().D();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor editorEdit = b1Var.F().edit();
                editorEdit.putString("previous_os_version", str);
                editorEdit.apply();
            }
            if (TextUtils.isEmpty(string)) {
                return;
            }
            o1Var.q().D();
            if (string.equals(str)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", string);
            I("auto", "_ou", bundle);
        }
    }

    public final void O(Bundle bundle, long j) {
        o1 o1Var = (o1) this.f218b;
        pb.y.h(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            s0 s0Var = o1Var.f22954f;
            o1.m(s0Var);
            s0Var.j.d("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        b2.e(bundle2, "app_id", String.class, null);
        b2.e(bundle2, "origin", String.class, null);
        b2.e(bundle2, "name", String.class, null);
        b2.e(bundle2, "value", Object.class, null);
        b2.e(bundle2, "trigger_event_name", String.class, null);
        b2.e(bundle2, "trigger_timeout", Long.class, 0L);
        b2.e(bundle2, "timed_out_event_name", String.class, null);
        b2.e(bundle2, "timed_out_event_params", Bundle.class, null);
        b2.e(bundle2, "triggered_event_name", String.class, null);
        b2.e(bundle2, "triggered_event_params", Bundle.class, null);
        b2.e(bundle2, "time_to_live", Long.class, 0L);
        b2.e(bundle2, "expired_event_name", String.class, null);
        b2.e(bundle2, "expired_event_params", Bundle.class, null);
        pb.y.e(bundle2.getString("name"));
        pb.y.e(bundle2.getString("origin"));
        pb.y.h(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        l4 l4Var = o1Var.f22956i;
        o0 o0Var = o1Var.j;
        s0 s0Var2 = o1Var.f22954f;
        o1.k(l4Var);
        if (l4Var.H0(string) != 0) {
            o1.m(s0Var2);
            s0Var2.g.e(o0Var.c(string), "Invalid conditional user property name");
            return;
        }
        o1.k(l4Var);
        if (l4Var.O(obj, string) != 0) {
            o1.m(s0Var2);
            s0Var2.g.f(o0Var.c(string), obj, "Invalid conditional user property value");
            return;
        }
        Object objP = l4Var.P(obj, string);
        if (objP == null) {
            o1.m(s0Var2);
            s0Var2.g.f(o0Var.c(string), obj, "Unable to normalize conditional user property value");
            return;
        }
        b2.c(bundle2, objP);
        long j8 = bundle2.getLong("trigger_timeout");
        if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name")) && (j8 > 15552000000L || j8 < 1)) {
            o1.m(s0Var2);
            s0Var2.g.f(o0Var.c(string), Long.valueOf(j8), "Invalid conditional user property timeout");
            return;
        }
        long j9 = bundle2.getLong("time_to_live");
        if (j9 > 15552000000L || j9 < 1) {
            o1.m(s0Var2);
            s0Var2.g.f(o0Var.c(string), Long.valueOf(j9), "Invalid conditional user property time to live");
        } else {
            l1 l1Var = o1Var.g;
            o1.m(l1Var);
            l1Var.K(new k2(this, bundle2, 0));
        }
    }

    public final void P(String str, String str2, Bundle bundle) {
        o1 o1Var = (o1) this.f218b;
        o1Var.f22957k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        pb.y.e(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", jCurrentTimeMillis);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        l1 l1Var = o1Var.g;
        o1.m(l1Var);
        l1Var.K(new k2(this, bundle2, 1));
    }

    public final String Q() {
        o1 o1Var = (o1) this.f218b;
        try {
            return b2.b(o1Var.f22949a, o1Var.f22962p);
        } catch (IllegalStateException e2) {
            s0 s0Var = o1Var.f22954f;
            o1.m(s0Var);
            s0Var.g.e(e2, "getGoogleAppId failed with exception");
            return null;
        }
    }

    public final void R(a2 a2Var, long j, boolean z3) {
        int i4 = a2Var.f22543b;
        B();
        C();
        o1 o1Var = (o1) this.f218b;
        b1 b1Var = o1Var.f22953e;
        s0 s0Var = o1Var.f22954f;
        o1.k(b1Var);
        a2 a2VarI = b1Var.I();
        if (j <= this.f23021r && a2.l(a2VarI.f22543b, i4)) {
            o1.m(s0Var);
            s0Var.f23058m.e(a2Var, "Dropped out-of-date consent setting, proposed settings");
            return;
        }
        b1 b1Var2 = o1Var.f22953e;
        o1.k(b1Var2);
        b1Var2.B();
        if (!a2.l(i4, b1Var2.F().getInt("consent_source", 100))) {
            o1.m(s0Var);
            s0Var.f23058m.e(Integer.valueOf(i4), "Lower precedence consent source ignored, proposed source");
            return;
        }
        SharedPreferences.Editor editorEdit = b1Var2.F().edit();
        editorEdit.putString("consent_settings", a2Var.g());
        editorEdit.putInt("consent_source", i4);
        editorEdit.apply();
        o1.m(s0Var);
        s0Var.f23060o.e(a2Var, "Setting storage consent(FE)");
        this.f23021r = j;
        if (o1Var.p().L()) {
            j3 j3VarP = o1Var.p();
            j3VarP.B();
            j3VarP.C();
            j3VarP.P(new h3(j3VarP, 2));
        } else {
            j3 j3VarP2 = o1Var.p();
            j3VarP2.B();
            j3VarP2.C();
            if (j3VarP2.K()) {
                j3VarP2.P(new e3(j3VarP2, j3VarP2.R(false)));
            }
        }
        if (z3) {
            o1Var.p().F(new AtomicReference());
        }
    }

    public final void S(Boolean bool, boolean z3) {
        B();
        C();
        o1 o1Var = (o1) this.f218b;
        s0 s0Var = o1Var.f22954f;
        o1.m(s0Var);
        s0Var.f23059n.e(bool, "Setting app measurement enabled (FE)");
        b1 b1Var = o1Var.f22953e;
        o1.k(b1Var);
        b1Var.B();
        SharedPreferences.Editor editorEdit = b1Var.F().edit();
        if (bool != null) {
            editorEdit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            editorEdit.remove("measurement_enabled");
        }
        editorEdit.apply();
        if (z3) {
            b1Var.B();
            SharedPreferences.Editor editorEdit2 = b1Var.F().edit();
            if (bool != null) {
                editorEdit2.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                editorEdit2.remove("measurement_enabled_from_api");
            }
            editorEdit2.apply();
        }
        l1 l1Var = o1Var.g;
        o1.m(l1Var);
        l1Var.B();
        if (o1Var.f22972z || !(bool == null || bool.booleanValue())) {
            T();
        }
    }

    public final void T() {
        B();
        o1 o1Var = (o1) this.f218b;
        b1 b1Var = o1Var.f22953e;
        s0 s0Var = o1Var.f22954f;
        tb.a aVar = o1Var.f22957k;
        o1.k(b1Var);
        String strK = b1Var.f22565n.k();
        if (strK != null) {
            if ("unset".equals(strK)) {
                aVar.getClass();
                M(System.currentTimeMillis(), null, "app", "_npa");
            } else {
                Long lValueOf = Long.valueOf(true != "true".equals(strK) ? 0L : 1L);
                aVar.getClass();
                M(System.currentTimeMillis(), lValueOf, "app", "_npa");
            }
        }
        if (!o1Var.e() || !this.f23023t) {
            o1.m(s0Var);
            s0Var.f23059n.d("Updating Scion state (FE)");
            j3 j3VarP = o1Var.p();
            j3VarP.B();
            j3VarP.C();
            j3VarP.P(new e3(j3VarP, j3VarP.R(true), 3));
            return;
        }
        o1.m(s0Var);
        s0Var.f23059n.d("Recording app launch after enabling measurement for the first time (FE)");
        N();
        r3 r3Var = o1Var.f22955h;
        o1.l(r3Var);
        r3Var.f23048f.B();
        l1 l1Var = o1Var.g;
        o1.m(l1Var);
        l1Var.K(new e2(this, 1));
    }

    public final void U() {
        o1 o1Var = (o1) this.f218b;
        if (!(o1Var.f22949a.getApplicationContext() instanceof Application) || this.f23009d == null) {
            return;
        }
        ((Application) o1Var.f22949a.getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f23009d);
    }

    public final void V(Bundle bundle, int i4, long j) {
        Boolean bool;
        String string;
        x1 x1Var;
        o1 o1Var = (o1) this.f218b;
        C();
        a2 a2Var = a2.f22541c;
        z1[] z1VarArr = y1.STORAGE.f23203a;
        int length = z1VarArr.length;
        int i10 = 0;
        while (true) {
            bool = null;
            if (i10 >= length) {
                string = null;
                break;
            }
            String str = z1VarArr[i10].f23248a;
            if (bundle.containsKey(str) && (string = bundle.getString(str)) != null) {
                if ((string.equals("granted") ? Boolean.TRUE : string.equals("denied") ? Boolean.FALSE : null) == null) {
                    break;
                }
            }
            i10++;
        }
        if (string != null) {
            s0 s0Var = o1Var.f22954f;
            o1.m(s0Var);
            s0Var.f23057l.e(string, "Ignoring invalid consent setting");
            s0 s0Var2 = o1Var.f22954f;
            o1.m(s0Var2);
            s0Var2.f23057l.d("Valid consent values are 'granted', 'denied'");
        }
        l1 l1Var = o1Var.g;
        o1.m(l1Var);
        boolean zH = l1Var.H();
        a2 a2VarB = a2.b(i4, bundle);
        Iterator it = a2VarB.f22542a.values().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            x1Var = x1.UNINITIALIZED;
            if (!zHasNext) {
                break;
            } else if (((x1) it.next()) != x1Var) {
                X(a2VarB, zH);
                break;
            }
        }
        o oVarC = o.c(i4, bundle);
        Iterator it2 = oVarC.f22944e.values().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            } else if (((x1) it2.next()) != x1Var) {
                W(oVarC, zH);
                break;
            }
        }
        if (bundle != null) {
            int iOrdinal = a2.d(bundle.getString("ad_personalization")).ordinal();
            if (iOrdinal == 2) {
                bool = Boolean.FALSE;
            } else if (iOrdinal == 3) {
                bool = Boolean.TRUE;
            }
        }
        if (bool != null) {
            String str2 = i4 == -30 ? "tcf" : "app";
            if (zH) {
                M(j, bool.toString(), str2, "allow_personalized_ads");
            } else {
                L(str2, "allow_personalized_ads", bool.toString(), false, j);
            }
        }
    }

    public final void W(o oVar, boolean z3) {
        vd.a aVar = new vd.a(this, false, oVar, 18);
        if (z3) {
            B();
            aVar.run();
        } else {
            l1 l1Var = ((o1) this.f218b).g;
            o1.m(l1Var);
            l1Var.K(aVar);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:70:0x0116
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1178)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public final void X(ec.a2 r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ec.q2.X(ec.a2, boolean):void");
    }

    public final void Y() {
        p8.a();
        o1 o1Var = (o1) this.f218b;
        g gVar = o1Var.f22952d;
        l1 l1Var = o1Var.g;
        s0 s0Var = o1Var.f22954f;
        if (gVar.L(null, d0.R0)) {
            o1.m(l1Var);
            if (l1Var.H()) {
                o1.m(s0Var);
                s0Var.g.d("Cannot get trigger URIs from analytics worker thread");
                return;
            }
            if (b7.h.e()) {
                o1.m(s0Var);
                s0Var.g.d("Cannot get trigger URIs from main thread");
                return;
            }
            C();
            o1.m(s0Var);
            s0Var.f23060o.d("Getting trigger URIs (FE)");
            AtomicReference atomicReference = new AtomicReference();
            o1.m(l1Var);
            l1Var.L(atomicReference, 10000L, "get trigger URIs", new j2(this, atomicReference, 5, false));
            final List list = (List) atomicReference.get();
            if (list == null) {
                o1.m(s0Var);
                s0Var.f23055i.d("Timed out waiting for get trigger URIs");
            } else {
                o1.m(l1Var);
                l1Var.K(new Runnable() { // from class: ec.n2
                    @Override // java.lang.Runnable
                    public final void run() {
                        q2 q2Var = this.f22909a;
                        q2Var.B();
                        if (Build.VERSION.SDK_INT < 30) {
                            return;
                        }
                        b1 b1Var = ((o1) q2Var.f218b).f22953e;
                        o1.k(b1Var);
                        SparseArray sparseArrayH = b1Var.H();
                        for (v3 v3Var : list) {
                            int i4 = v3Var.f23103c;
                            if (!sparseArrayH.contains(i4) || ((Long) sparseArrayH.get(i4)).longValue() < v3Var.f23102b) {
                                q2Var.Z().add(v3Var);
                            }
                        }
                        q2Var.a0();
                    }
                });
            }
        }
    }

    public final PriorityQueue Z() {
        if (this.f23017n == null) {
            this.f23017n = new PriorityQueue(Comparator.CC.comparing(o2.f22973a, androidx.recyclerview.widget.m.f1450b));
        }
        return this.f23017n;
    }

    public final void a0() {
        v3 v3Var;
        B();
        this.f23018o = false;
        if (Z().isEmpty() || this.j || (v3Var = (v3) Z().poll()) == null) {
            return;
        }
        o1 o1Var = (o1) this.f218b;
        l4 l4Var = o1Var.f22956i;
        o1.k(l4Var);
        if (l4Var.g == null) {
            l4Var.g = n5.a.b(((o1) l4Var.f218b).f22949a);
        }
        n5.a aVar = l4Var.g;
        if (aVar != null) {
            this.j = true;
            s0 s0Var = o1Var.f22954f;
            o1.m(s0Var);
            or orVar = s0Var.f23060o;
            String str = v3Var.f23101a;
            orVar.e(str, "Registering trigger URI");
            vd.b bVarF = aVar.f(Uri.parse(str));
            if (bVarF != null) {
                bVarF.a(new vd.a(0, bVarF, new yb.i(14, this, v3Var)), new d7.b(2, this));
            } else {
                this.j = false;
                Z().add(v3Var);
            }
        }
    }
}

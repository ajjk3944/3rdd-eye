package com.google.android.gms.internal.ads;

import android.app.UiModeManager;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import com.applovin.mediation.AppLovinUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class kh0 implements p81, n40, f90, bl0, d81, fp0, ep0, c80, k31, ll1, l31, rd0, a02 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13159a;

    /* renamed from: b, reason: collision with root package name */
    public Object f13160b;

    public static kh0 l(byte[] bArr) {
        return new kh0(16, vl1.a(bArr));
    }

    public static kh0 t(int i4) {
        return new kh0(16, vl1.a(de1.a(i4)));
    }

    public void A(long j, int i4, int i10, String str, nt0 nt0Var, String str2) {
        rt rtVarA = ((qd0) this.f13160b).a();
        rtVarA.u("ppla_ts", Long.toString(j));
        rtVarA.u("ad_format", nt0Var.a());
        rtVarA.u(AppLovinUtils.ServerParameterKeys.AD_UNIT_ID, nt0Var.f14406a);
        rtVarA.u("pid", nt0Var.f14408c);
        rtVarA.u("max_ads", Integer.toString(i4));
        rtVarA.u("cache_size", Integer.toString(i10));
        rtVarA.u("action", "poll_ad");
        if (str != null) {
            rtVarA.u("gqi", str);
        }
        rtVarA.u("pv", str2);
        rtVarA.v();
    }

    public void B(long j, nt0 nt0Var, va.w1 w1Var, int i4, int i10, String str) {
        rt rtVarA = ((qd0) this.f13160b).a();
        rtVarA.u("action", "pftla");
        rtVarA.u("pftlat_ts", Long.toString(j));
        rtVarA.u("pftlaec", Integer.toString(w1Var.f36177a));
        rtVarA.u("ad_format", nt0Var.a());
        rtVarA.u("max_ads", Integer.toString(i4));
        rtVarA.u("cache_size", Integer.toString(i10));
        rtVarA.u(AppLovinUtils.ServerParameterKeys.AD_UNIT_ID, nt0Var.f14406a);
        rtVarA.u("pid", nt0Var.f14408c);
        rtVarA.u("pv", str);
        rtVarA.v();
    }

    public void C(String str, long j, String str2, String str3, pa.b bVar, int i4, int i10, int i11) {
        rt rtVarA = ((qd0) this.f13160b).a();
        rtVarA.u("action", str);
        rtVarA.u("pat", Long.toString(j));
        rtVarA.u("ad_format", bVar.name().toLowerCase(Locale.ENGLISH));
        rtVarA.u("max_ads", Integer.toString(i4));
        rtVarA.u("cache_size", Integer.toString(i10));
        rtVarA.u("pas", Integer.toString(i11));
        rtVarA.u("pv", "2");
        rtVarA.u(AppLovinUtils.ServerParameterKeys.AD_UNIT_ID, str3);
        rtVarA.u("pid", str2);
        rtVarA.v();
    }

    public void D(String str, String str2, long j, int i4, int i10, String str3, nt0 nt0Var, String str4) {
        rt rtVarA = ((qd0) this.f13160b).a();
        rtVarA.u(str2, Long.toString(j));
        if (nt0Var != null) {
            rtVarA.u(AppLovinUtils.ServerParameterKeys.AD_UNIT_ID, nt0Var.f14406a);
            rtVarA.u("ad_format", nt0Var.a());
            rtVarA.u("pid", nt0Var.f14408c);
        }
        rtVarA.u("action", str);
        if (str3 != null) {
            rtVarA.u("gqi", str3);
        }
        if (i4 >= 0) {
            rtVarA.u("max_ads", Integer.toString(i4));
        }
        if (i10 >= 0) {
            rtVarA.u("cache_size", Integer.toString(i10));
        }
        rtVarA.u("pv", str4);
        rtVarA.v();
    }

    public void E(String str, long j, String str2, String str3, pa.b bVar, int i4, int i10, int i11, int i12, int i13) {
        rt rtVarA = ((qd0) this.f13160b).a();
        rtVarA.u("action", str);
        rtVarA.u("pat", Long.toString(j));
        rtVarA.u("pid", str2);
        rtVarA.u(AppLovinUtils.ServerParameterKeys.AD_UNIT_ID, str3);
        rtVarA.u("max_ads", Integer.toString(i4));
        rtVarA.u("cache_size", Integer.toString(i10));
        rtVarA.u("tpcnt", Integer.toString(i12));
        rtVarA.u("mpl", Integer.toString(i13));
        if (bVar != null) {
            rtVarA.u("ad_format", bVar.name().toLowerCase(Locale.ENGLISH));
        }
        if (i11 > 0) {
            rtVarA.u("nptr", Integer.toString(i11));
        }
        rtVarA.v();
    }

    @Override // com.google.android.gms.internal.ads.f90
    public wp0 a() {
        return (wp0) this.f13160b;
    }

    @Override // com.google.android.gms.internal.ads.l31
    public /* synthetic */ Object b() {
        return (fk0) this.f13160b;
    }

    @Override // com.google.android.gms.internal.ads.c80
    /* renamed from: c */
    public void mo162c(Object obj) {
        switch (this.f13159a) {
            case 7:
                pr0 pr0Var = (pr0) this.f13160b;
                ((tr0) obj).m((qr0) pr0Var.f15079a, pr0Var.f15080b);
                break;
            case 21:
                ((ru1) obj).c((os1) this.f13160b);
                break;
            default:
                ((ru1) obj).e((us1) this.f13160b);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.ep0
    public /* synthetic */ m10 d(dp0 dp0Var) {
        return ((qp0) this.f13160b).b(dp0Var);
    }

    @Override // com.google.android.gms.internal.ads.fp0
    public /* synthetic */ Object f() {
        return (x50) this.f13160b;
    }

    @Override // com.google.android.gms.internal.ads.ll1
    public Object g(String str) {
        return ((nl1) this.f13160b).g(str, null);
    }

    @Override // com.google.android.gms.internal.ads.p81
    /* renamed from: h */
    public void mo163h(Object obj) {
        switch (this.f13159a) {
            case 0:
                try {
                    ((lr0) this.f13160b).mo170c((SQLiteDatabase) obj);
                    break;
                } catch (Exception e2) {
                    za.i.e("Error executing function on offline buffered ping database: ".concat(String.valueOf(e2.getMessage())));
                    return;
                }
            default:
                ((yr0) this.f13160b).b();
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.bl0
    public void i(o40 o40Var) {
        o50 o50Var;
        rk0 rk0Var = (rk0) this.f13160b;
        u30 u30Var = (u30) o40Var;
        synchronized (rk0Var) {
            try {
                u30 u30Var2 = rk0Var.f15684i;
                if (u30Var2 != null) {
                    o50 o50Var2 = u30Var.j;
                    if (o50Var2 != null && (o50Var = u30Var2.j) != null) {
                        o50Var2.a(o50Var.f14565a.get());
                    }
                    s60 s60Var = rk0Var.f15684i.f14534c;
                    s60Var.getClass();
                    s60Var.p1(new nk(null, 2));
                }
                rk0Var.f15684i = u30Var;
                u30Var.a();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.a02
    public u51 j(int i4, ii iiVar, int[] iArr) {
        v41 v41Var = x41.f18307b;
        yr1.u(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i10 = 0;
        int i11 = 0;
        while (i10 < iiVar.f12337a) {
            int i12 = i4;
            ii iiVar2 = iiVar;
            tz1 tz1Var = new tz1(i12, iiVar2, i10, (wz1) this.f13160b, iArr[i10]);
            int length = objArrCopyOf.length;
            int i13 = i11 + 1;
            int iD = s41.d(length, i13);
            if (iD > length) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iD);
            }
            objArrCopyOf[i11] = tz1Var;
            i10++;
            i11 = i13;
            i4 = i12;
            iiVar = iiVar2;
        }
        return x41.s(objArrCopyOf, i11);
    }

    @Override // com.google.android.gms.internal.ads.fp0
    public /* bridge */ /* synthetic */ vd.b k(ce1 ce1Var, ep0 ep0Var) {
        return u(ce1Var, ep0Var, null);
    }

    @Override // com.google.android.gms.internal.ads.k31
    public /* synthetic */ Iterator m(rg0 rg0Var, CharSequence charSequence) {
        return new h31(charSequence, (y21) this.f13160b, 0);
    }

    @Override // com.google.android.gms.internal.ads.p81
    public void n(Throwable th2) {
        switch (this.f13159a) {
            case 0:
                za.i.e("Failed to get offline buffered ping database: ".concat(String.valueOf(th2.getMessage())));
                break;
        }
    }

    public JSONObject o(View view) throws JSONException {
        int currentModeType;
        JSONObject jSONObjectA = uu0.a(0, 0, 0, 0);
        UiModeManager uiModeManager = al0.f9348b;
        int i4 = (uiModeManager == null || (currentModeType = uiModeManager.getCurrentModeType()) == 1 || currentModeType != 4) ? 2 : yr1.f18841c;
        int i10 = i4 - 1;
        if (i4 == 0) {
            throw null;
        }
        try {
            jSONObjectA.put("noOutputDevice", i10 == 0);
            return jSONObjectA;
        } catch (JSONException e2) {
            yo0.k("Error with setting output device status", e2);
            return jSONObjectA;
        }
    }

    public void p(int i4, long j, nt0 nt0Var, String str) {
        rt rtVarA = ((qd0) this.f13160b).a();
        rtVarA.u("action", "start_preload");
        rtVarA.u("sp_ts", Long.toString(j));
        rtVarA.u("ad_format", nt0Var.a());
        rtVarA.u(AppLovinUtils.ServerParameterKeys.AD_UNIT_ID, nt0Var.f14406a);
        rtVarA.u("pid", nt0Var.f14408c);
        rtVarA.u("max_ads", Integer.toString(i4));
        rtVarA.u("pv", str);
        rtVarA.v();
    }

    public void q(Exception exc) {
        ls.H("MediaCodecAudioRenderer", "Audio sink error", exc);
        g1 g1Var = ((mw1) this.f13160b).C0;
        Handler handler = g1Var.f11341a;
        if (handler != null) {
            handler.post(new qv1(g1Var, exc, 5));
        }
    }

    public void r(String str, js1 js1Var) {
        if (js1Var == null) {
            throw new NullPointerException("provider");
        }
        ((LinkedHashMap) this.f13160b).put(str, js1Var);
    }

    public vd.b u(ce1 ce1Var, ep0 ep0Var, x50 x50Var) {
        m10 m10VarD = ep0Var.d((dp0) ce1Var.f10095c);
        hp0 hp0Var = new hp0();
        switch (m10VarD.f13716a) {
            case 0:
                m10VarD.f13718c = hp0Var;
                break;
            default:
                m10VarD.f13718c = hp0Var;
                break;
        }
        x50 x50Var2 = (x50) m10VarD.c();
        this.f13160b = x50Var2;
        y40 y40VarB = x50Var2.b();
        ar0 ar0Var = new ar0();
        n81 n81VarS = n81.s(y40VarB.b());
        sq sqVar = new sq(12, ar0Var, y40VarB);
        k81 k81Var = k81.f13081a;
        return yo0.G(yo0.F(n81VarS, sqVar, k81Var), new hu(7, ar0Var), k81Var);
    }

    public void v(Object obj, Object... objArr) {
        List listAsList = Arrays.asList(objArr);
        if (obj == null) {
            Iterator it = listAsList.iterator();
            StringBuilder sb2 = new StringBuilder("[");
            boolean z3 = true;
            while (it.hasNext()) {
                if (!z3) {
                    sb2.append(", ");
                }
                sb2.append(it.next());
                z3 = false;
            }
            sb2.append(']');
            throw new NullPointerException("null key in entry: null=".concat(sb2.toString()));
        }
        Iterator it2 = listAsList.iterator();
        if (it2.hasNext()) {
            m41 m41Var = (m41) this.f13160b;
            if (m41Var == null) {
                m41Var = new m41();
                this.f13160b = m41Var;
            }
            s41 s41VarQ = (s41) m41Var.get(obj);
            if (s41VarQ == null) {
                s41VarQ = e51.q(listAsList instanceof Set ? Math.max(4, ((Set) listAsList).size()) : 4);
                m41 m41Var2 = (m41) this.f13160b;
                if (m41Var2 == null) {
                    m41Var2 = new m41();
                    this.f13160b = m41Var2;
                }
                m41Var2.put(obj, s41VarQ);
            }
            while (it2.hasNext()) {
                Object next = it2.next();
                yr1.h(obj, next);
                s41VarQ.c(next);
            }
        }
    }

    public void w(String str, js1 js1Var) {
        r(str, js1Var);
    }

    public void x(EnumMap enumMap, long j) {
        rt rtVarA = ((qd0) this.f13160b).a();
        rtVarA.u("action", "start_preload");
        rtVarA.u("sp_ts", Long.toString(j));
        rtVarA.u("pv", "1");
        for (pa.b bVar : enumMap.keySet()) {
            String strValueOf = String.valueOf(bVar.name().toLowerCase(Locale.ENGLISH));
            rtVarA.u(strValueOf.concat("_count"), Integer.toString(((Integer) enumMap.get(bVar)).intValue()));
        }
        rtVarA.v();
    }

    public hs1 y() {
        return new hs1((LinkedHashMap) this.f13160b);
    }

    public void z(int i4, int i10, long j, Long l10, String str, nt0 nt0Var, String str2) {
        rt rtVarA = ((qd0) this.f13160b).a();
        rtVarA.u("plaac_ts", Long.toString(j));
        rtVarA.u("max_ads", Integer.toString(i4));
        rtVarA.u("cache_size", Integer.toString(i10));
        rtVarA.u("action", "is_ad_available");
        if (nt0Var != null) {
            rtVarA.u(AppLovinUtils.ServerParameterKeys.AD_UNIT_ID, nt0Var.f14406a);
            rtVarA.u("pid", nt0Var.f14408c);
            rtVarA.u("ad_format", nt0Var.a());
        }
        if (l10 != null) {
            rtVarA.u("plaay_ts", Long.toString(l10.longValue()));
        }
        if (str != null) {
            rtVarA.u("gqi", str);
        }
        rtVarA.u("pv", str2);
        rtVarA.v();
    }

    public /* synthetic */ kh0(int i4, Object obj) {
        this.f13159a = i4;
        this.f13160b = obj;
    }

    @Override // com.google.android.gms.internal.ads.n40
    /* renamed from: b, reason: collision with other method in class */
    public va.a2 mo165b() throws kq0 {
        try {
            return ((qq0) this.f13160b).f15399a.r();
        } catch (Throwable th2) {
            throw new kq0(th2);
        }
    }

    public /* synthetic */ kh0(int i4, Object obj, Object obj2) {
        this.f13159a = i4;
        this.f13160b = obj2;
    }

    public kh0(int i4) {
        this.f13159a = 17;
        this.f13160b = mq0.G(i4);
    }

    @Override // com.google.android.gms.internal.ads.d81
    /* renamed from: b, reason: collision with other method in class */
    public vd.b mo166b() {
        String lowerCase;
        Bundle bundle;
        String str;
        kn0 kn0Var = (kn0) this.f13160b;
        pk pkVar = sk.f16157hc;
        va.s sVar = va.s.f36163e;
        if (((Boolean) sVar.f36166c.a(pkVar)).booleanValue()) {
            lowerCase = kn0Var.f13212e.g.toLowerCase(Locale.ROOT);
        } else {
            lowerCase = kn0Var.f13212e.g;
        }
        if (((Boolean) sVar.f36166c.a(sk.f16036a2)).booleanValue()) {
            se0 se0Var = kn0Var.f13214h;
            synchronized (se0Var) {
                bundle = new Bundle(se0Var.f15997a);
            }
        } else {
            bundle = new Bundle();
        }
        Bundle bundle2 = bundle;
        if (((Boolean) sVar.f36166c.a(sk.T4)).booleanValue()) {
            ww wwVarS = ua.j.C.f35265h.i().s();
            if (!TextUtils.isEmpty(wwVarS.f18213e) && wwVarS.g != null) {
                str = wwVarS.b() ? "VALID" : "INVALID";
            } else {
                str = "EMPTY";
            }
        } else {
            str = "";
        }
        String str2 = str;
        ArrayList arrayList = new ArrayList();
        if (!((Boolean) sVar.f36166c.a(sk.f16177j2)).booleanValue()) {
            kk0 kk0Var = kn0Var.f13210c;
            Iterator it = ((w51) kk0Var.b(kn0Var.j, lowerCase).entrySet()).iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                String str3 = (String) entry.getKey();
                List list = (List) entry.getValue();
                Bundle bundle3 = kn0Var.f13212e.f11944d.f36198m;
                arrayList.add(kn0Var.d(str3, list, bundle3 != null ? bundle3.getBundle(str3) : null, true, true));
            }
            kn0Var.c(arrayList, kk0Var.a());
        } else {
            kn0Var.c(arrayList, kn0Var.f13210c.c(kn0Var.j, lowerCase));
        }
        x41 x41VarQ = x41.q(arrayList);
        u50 u50Var = new u50(str2, arrayList, bundle2);
        w81 w81Var = kn0Var.f13208a;
        j81 j81Var = new j81(x41VarQ, true, false);
        j81Var.f12674p = new i81(j81Var, u50Var, w81Var);
        j81Var.w();
        return j81Var;
    }

    private final void s(Throwable th2) {
    }

    @Override // com.google.android.gms.internal.ads.bl0
    /* renamed from: b, reason: collision with other method in class */
    public void mo167b() {
        rk0 rk0Var = (rk0) this.f13160b;
        synchronized (rk0Var) {
            rk0Var.f15684i = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.f90
    public void e(boolean z3, Context context, m60 m60Var) {
    }
}

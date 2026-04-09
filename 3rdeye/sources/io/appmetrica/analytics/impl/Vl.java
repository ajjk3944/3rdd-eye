package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.coreutils.internal.parsing.RemoteConfigJsonUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class Vl {

    /* renamed from: a, reason: collision with root package name */
    public final Qa f40299a;

    /* renamed from: b, reason: collision with root package name */
    public final C4868pa f40300b;

    /* renamed from: c, reason: collision with root package name */
    public final Pi f40301c;

    /* renamed from: d, reason: collision with root package name */
    public final Le f40302d;

    /* renamed from: e, reason: collision with root package name */
    public final Fm f40303e;

    /* renamed from: f, reason: collision with root package name */
    public final C5013v2 f40304f;

    /* renamed from: g, reason: collision with root package name */
    public final C3 f40305g;

    /* renamed from: h, reason: collision with root package name */
    public final C4963t2 f40306h;
    public final Ab i;

    /* renamed from: j, reason: collision with root package name */
    public final Cm f40307j;

    /* renamed from: k, reason: collision with root package name */
    public final Fd f40308k;

    /* renamed from: l, reason: collision with root package name */
    public final W9 f40309l;

    public Vl() {
        this(new Ab(), new Qa(), new C4868pa(), new Pi(), new Le(), new Fm(), new C3(), new C5013v2(), new C4963t2(), new Cm(), new Fd(), new W9());
    }

    public final void a(C4492am c4492am, C5097yb c5097yb) {
        long jOptLong;
        long jOptLong2;
        String string;
        ArrayList arrayListA;
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        JSONObject jSONObjectOptJSONObject3;
        JSONObject jSONObjectOptJSONObject4 = c5097yb.optJSONObject("queries");
        if (jSONObjectOptJSONObject4 != null && (jSONObjectOptJSONObject2 = jSONObjectOptJSONObject4.optJSONObject("list")) != null && (jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject("host")) != null) {
            c4492am.f40536g = jSONObjectOptJSONObject3.optString(ImagesContract.URL, null);
        }
        Object jSONObject = new JSONObject();
        try {
            jSONObject = c5097yb.get("distribution_customization");
        } catch (Throwable unused) {
        }
        JSONObject jSONObjectOptJSONObject5 = ((JSONObject) jSONObject).optJSONObject("clids");
        if (jSONObjectOptJSONObject5 != null) {
            HashMap map = new HashMap();
            Iterator<String> itKeys = jSONObjectOptJSONObject5.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                JSONObject jSONObjectOptJSONObject6 = jSONObjectOptJSONObject5.optJSONObject(next);
                if (jSONObjectOptJSONObject6 != null && jSONObjectOptJSONObject6.has(AppMeasurementSdk.ConditionalUserProperty.VALUE)) {
                    map.put(next, jSONObjectOptJSONObject6.getString(AppMeasurementSdk.ConditionalUserProperty.VALUE));
                }
            }
            c4492am.f40538j = Dm.a((Map) map);
        }
        JSONObject jSONObjectOptJSONObject7 = c5097yb.optJSONObject(CommonUrlParts.LOCALE);
        String string2 = "";
        c4492am.f40541m = (jSONObjectOptJSONObject7 == null || (jSONObjectOptJSONObject = jSONObjectOptJSONObject7.optJSONObject("country")) == null || !jSONObjectOptJSONObject.optBoolean("reliable", false)) ? "" : jSONObjectOptJSONObject.optString(AppMeasurementSdk.ConditionalUserProperty.VALUE, "");
        JSONObject jSONObjectOptJSONObject8 = c5097yb.optJSONObject("time");
        if (jSONObjectOptJSONObject8 != null) {
            try {
                c4492am.f40540l = Long.valueOf(jSONObjectOptJSONObject8.getLong("max_valid_difference_seconds"));
            } catch (Throwable unused2) {
            }
        }
        C4983tm c4983tm = new C4983tm();
        JSONObject jSONObjectOptJSONObject9 = c5097yb.optJSONObject("stat_sending");
        if (jSONObjectOptJSONObject9 != null) {
            c4983tm.f41700a = RemoteConfigJsonUtils.extractMillisFromSecondsOrDefault(jSONObjectOptJSONObject9, "disabled_reporting_interval_seconds", c4983tm.f41700a);
        }
        this.f40303e.getClass();
        c4492am.f40544p = new Em(c4983tm.f41700a);
        this.f40300b.getClass();
        C4880pm c4880pm = new C4880pm();
        try {
            Object jSONObject2 = new JSONObject();
            try {
                jSONObject2 = c5097yb.get("features");
            } catch (Throwable unused3) {
            }
            JSONObject jSONObjectOptJSONObject10 = ((JSONObject) jSONObject2).optJSONObject("list");
            if (jSONObjectOptJSONObject10 != null) {
                E4 e4 = new E4();
                e4.f39328a = C4868pa.a(jSONObjectOptJSONObject10, "permissions_collecting", c4880pm.f41435a);
                e4.f39329b = C4868pa.a(jSONObjectOptJSONObject10, "features_collecting", c4880pm.f41436b);
                e4.f39330c = C4868pa.a(jSONObjectOptJSONObject10, "google_aid", c4880pm.f41437c);
                e4.f39331d = C4868pa.a(jSONObjectOptJSONObject10, "sim_info", c4880pm.f41438d);
                e4.f39332e = C4868pa.a(jSONObjectOptJSONObject10, "huawei_oaid", c4880pm.f41439e);
                e4.f39333f = jSONObjectOptJSONObject10.has("ssl_pinning") ? Boolean.valueOf(jSONObjectOptJSONObject10.getJSONObject("ssl_pinning").getBoolean("enabled")) : null;
                c4492am.f40531b = new G4(e4);
            }
        } catch (Throwable unused4) {
        }
        this.f40299a.getClass();
        try {
            Object jSONObject3 = new JSONObject();
            try {
                jSONObject3 = c5097yb.get("query_hosts");
            } catch (Throwable unused5) {
            }
            JSONObject jSONObjectOptJSONObject11 = ((JSONObject) jSONObject3).optJSONObject("list");
            if (jSONObjectOptJSONObject11 != null) {
                try {
                    string = jSONObjectOptJSONObject11.getJSONObject("get_ad").getJSONArray("urls").getString(0);
                } catch (Throwable unused6) {
                    string = "";
                }
                if (!TextUtils.isEmpty(string)) {
                    c4492am.f40533d = string;
                }
                ArrayList arrayListA2 = Qa.a(jSONObjectOptJSONObject11, "report");
                if (!AbstractC4623fo.a((Collection) arrayListA2)) {
                    c4492am.f40534e = arrayListA2;
                }
                try {
                    string2 = jSONObjectOptJSONObject11.getJSONObject("report_ad").getJSONArray("urls").getString(0);
                } catch (Throwable unused7) {
                }
                if (!TextUtils.isEmpty(string2)) {
                    c4492am.f40535f = string2;
                }
                ArrayList arrayListA3 = Qa.a(jSONObjectOptJSONObject11, "startup");
                if (!AbstractC4623fo.a((Collection) arrayListA3)) {
                    c4492am.f40532c = arrayListA3;
                }
                ArrayList arrayListA4 = Qa.a(jSONObjectOptJSONObject11, "diagnostic");
                if (!AbstractC4623fo.a((Collection) arrayListA4)) {
                    c4492am.f40542n = arrayListA4;
                }
                HashMap map2 = new HashMap();
                Iterator<String> itKeys2 = jSONObjectOptJSONObject11.keys();
                while (itKeys2.hasNext()) {
                    String next2 = itKeys2.next();
                    if (!Qa.f40014a.contains(next2) && (arrayListA = Qa.a(jSONObjectOptJSONObject11, next2)) != null) {
                        map2.put(next2, arrayListA);
                    }
                }
                c4492am.f40543o = map2;
            }
        } catch (Throwable unused8) {
        }
        this.f40301c.getClass();
        C5008um c5008um = new C5008um();
        JSONObject jSONObjectOptJSONObject12 = c5097yb.optJSONObject("retry_policy");
        int iOptInt = c5008um.f41817w;
        int iOptInt2 = c5008um.f41818x;
        if (jSONObjectOptJSONObject12 != null) {
            iOptInt = jSONObjectOptJSONObject12.optInt("max_interval_seconds", iOptInt);
            iOptInt2 = jSONObjectOptJSONObject12.optInt("exponential_multiplier", c5008um.f41818x);
        }
        c4492am.f40545q = new RetryPolicyConfig(iOptInt, iOptInt2);
        this.f40302d.getClass();
        if (c4492am.f40531b.f39475a) {
            JSONObject jSONObjectOptJSONObject13 = c5097yb.optJSONObject("permissions_collecting");
            C4931rm c4931rm = new C4931rm();
            if (jSONObjectOptJSONObject13 != null) {
                jOptLong = jSONObjectOptJSONObject13.optLong("check_interval_seconds", c4931rm.f41591a);
                jOptLong2 = jSONObjectOptJSONObject13.optLong("force_send_interval_seconds", c4931rm.f41592b);
            } else {
                jOptLong = c4931rm.f41591a;
                jOptLong2 = c4931rm.f41592b;
            }
            c4492am.f40539k = new Je(jOptLong, jOptLong2);
        }
        C4988u2 c4988u2 = this.f40304f.f41828a;
        C4776lm c4776lm = new C4776lm();
        JSONObject jSONObjectOptJSONObject14 = c5097yb.optJSONObject("auto_inapp_collecting");
        if (jSONObjectOptJSONObject14 != null) {
            c4776lm.f41215a = jSONObjectOptJSONObject14.optInt("send_frequency_seconds", c4776lm.f41215a);
            c4776lm.f41216b = jSONObjectOptJSONObject14.optInt("first_collecting_inapp_max_age_seconds", c4776lm.f41216b);
        }
        c4988u2.getClass();
        c4492am.f40546r = new BillingConfig(c4776lm.f41215a, c4776lm.f41216b);
        C3 c32 = this.f40305g;
        c32.getClass();
        C4802mm c4802mm = new C4802mm();
        JSONObject jSONObjectOptJSONObject15 = c5097yb.optJSONObject("cache_control");
        if (jSONObjectOptJSONObject15 != null) {
            c4802mm.f41272a = RemoteConfigJsonUtils.extractMillisFromSecondsOrDefault(jSONObjectOptJSONObject15, "last_known_location_ttl", c4802mm.f41272a);
        }
        c32.f39223a.getClass();
        c4492am.f40547s = new C5114z3(c4802mm.f41272a);
        this.f40306h.getClass();
        C4963t2.a(c4492am, c5097yb);
        Cm cm = this.f40307j;
        cm.getClass();
        JSONObject jSONObjectOptJSONObject16 = c5097yb.optJSONObject("startup_update");
        C4957sm c4957sm = new C4957sm();
        Integer numA = AbstractC5122zb.a(jSONObjectOptJSONObject16, "interval_seconds", null);
        if (numA != null) {
            c4957sm.f41650a = numA.intValue();
        }
        cm.f39270a.getClass();
        c4492am.f40549u = new Am(c4957sm.f41650a);
        Map<String, C4922rd> mapC = this.f40308k.f39435a.c();
        Ed ed = new Ed(c5097yb);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, C4922rd> entry : mapC.entrySet()) {
            Object objInvoke = ed.invoke(entry);
            if (objInvoke != null) {
                linkedHashMap.put(entry.getKey(), objInvoke);
            }
        }
        c4492am.f40550v = linkedHashMap;
        V9 v92 = this.f40309l.f40330a;
        C4854om c4854om = new C4854om();
        JSONObject jSONObjectOptJSONObject17 = c5097yb.optJSONObject("external_attribution");
        if (jSONObjectOptJSONObject17 != null) {
            c4854om.f41395a = RemoteConfigJsonUtils.extractMillisFromSecondsOrDefault(jSONObjectOptJSONObject17, "collecting_interval_seconds", c4854om.f41395a);
        }
        v92.getClass();
        c4492am.f40551w = new U9(c4854om.f41395a);
    }

    public Vl(Ab ab, Qa qa2, C4868pa c4868pa, Pi pi, Le le, Fm fm, C3 c32, C5013v2 c5013v2, C4963t2 c4963t2, Cm cm, Fd fd, W9 w92) {
        this.f40299a = qa2;
        this.f40300b = c4868pa;
        this.f40301c = pi;
        this.f40302d = le;
        this.f40303e = fm;
        this.f40305g = c32;
        this.f40304f = c5013v2;
        this.f40306h = c4963t2;
        this.i = ab;
        this.f40307j = cm;
        this.f40308k = fd;
        this.f40309l = w92;
    }
}

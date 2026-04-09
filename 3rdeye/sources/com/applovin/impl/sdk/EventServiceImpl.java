package com.applovin.impl.sdk;

import android.content.Intent;
import android.text.TextUtils;
import com.applovin.impl.T;
import com.applovin.impl.a7;
import com.applovin.impl.d1;
import com.applovin.impl.f6;
import com.applovin.impl.i4;
import com.applovin.impl.l4;
import com.applovin.impl.n1;
import com.applovin.impl.r5;
import com.applovin.impl.sdk.network.d;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.w4;
import com.applovin.sdk.AppLovinEventParameters;
import com.applovin.sdk.AppLovinEventService;
import com.applovin.sdk.AppLovinEventTypes;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class EventServiceImpl implements AppLovinEventService {
    public static final List<String> ALLOW_PRE_INIT_EVENT_TYPES = Arrays.asList("landing", "paused", "resumed", "cf_start", "tos_ok", "gdpr_ok");

    /* renamed from: a, reason: collision with root package name */
    private final k f21006a;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f21007b = new AtomicBoolean();

    public EventServiceImpl(k kVar) {
        this.f21006a = kVar;
    }

    private void c(String str, Map map, Map map2) {
        if (map.containsKey("items")) {
            Object obj = map.get("items");
            if (!(obj instanceof List)) {
                a("Invalid 'items' value: expected a list.");
                return;
            }
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof Map)) {
                    a("Invalid element in 'items': expected a map.");
                    return;
                }
            }
        }
        this.f21006a.q0().a((w4) new f6(this.f21006a, false, androidx.work.s.d("track_event:", str), new N.i(this, str, map, map2, 2)), r5.b.OTHER);
    }

    private String d() {
        return B4.f.c(new StringBuilder(), (String) this.f21006a.a(l4.f20027t0), "4.0/pix");
    }

    public void maybeTrackAppOpenEvent() {
        if (this.f21007b.compareAndSet(false, true)) {
            this.f21006a.G().trackEvent("landing");
        }
    }

    public String toString() {
        return "EventService{}";
    }

    @Override // com.applovin.sdk.AppLovinEventService
    public void trackCheckout(String str, Map<String, String> map) {
        Map<String, ?> map2 = CollectionUtils.map(map);
        map2.put(AppLovinEventParameters.CHECKOUT_TRANSACTION_IDENTIFIER, str);
        trackEvent(AppLovinEventTypes.USER_COMPLETED_CHECKOUT, map2);
    }

    @Override // com.applovin.sdk.AppLovinEventService
    public void trackEvent(String str) {
        trackEvent(str, new HashMap());
    }

    public void trackEventSynchronously(String str) {
        this.f21006a.O();
        if (o.a()) {
            this.f21006a.O().a("AppLovinEventService", "Tracking event: \"" + str + "\" synchronously");
        }
        n1 n1Var = new n1(str, new HashMap());
        boolean zContains = this.f21006a.c(l4.f19694A0).contains(n1Var.c());
        Map mapA = a(n1Var, true, zContains);
        HashMap map = new HashMap(n1Var.d());
        if (((Boolean) this.f21006a.a(l4.f19915e5)).booleanValue() || ((Boolean) this.f21006a.a(l4.f19878Z4)).booleanValue()) {
            map.putAll(mapA);
            mapA = null;
        }
        this.f21006a.e0().e(com.applovin.impl.sdk.network.d.b().d(d()).a(c()).b(mapA).c(map).a(a(n1Var, zContains)).c(((Boolean) this.f21006a.a(l4.f19992o5)).booleanValue()).a(((Boolean) this.f21006a.a(l4.f19783L4)).booleanValue()).a());
    }

    @Override // com.applovin.sdk.AppLovinEventService
    public void trackInAppPurchase(Intent intent, Map<String, String> map) {
        Map<String, ?> map2 = CollectionUtils.map(map);
        try {
            map2.put(AppLovinEventParameters.IN_APP_PURCHASE_DATA, intent.getStringExtra("INAPP_PURCHASE_DATA"));
            map2.put(AppLovinEventParameters.IN_APP_DATA_SIGNATURE, intent.getStringExtra("INAPP_DATA_SIGNATURE"));
        } catch (Throwable th) {
            o.c("AppLovinEventService", "Unable to track in app purchase - invalid purchase intent", th);
            this.f21006a.E().a("AppLovinEventService", "trackIAP", th);
        }
        trackEvent(AppLovinEventTypes.USER_COMPLETED_IN_APP_PURCHASE, map2);
    }

    private void a(String str, Map map) {
        boolean zContains = ALLOW_PRE_INIT_EVENT_TYPES.contains(str);
        this.f21006a.q0().a((w4) new f6(this.f21006a, zContains, "submitTrackEventPostback", new T(this, str, map, zContains)), r5.b.OTHER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(String str, Map map, Map map2) {
        Map map3 = CollectionUtils.map("AppLovin-Event", str);
        map3.put("AppLovin-SDK-Name", "AppLovin-MAX");
        d.b bVarD = com.applovin.impl.sdk.network.d.b().d(b()).a(a()).a(map3).c(a(str, map, map2)).a(((Boolean) this.f21006a.a(l4.f19783L4)).booleanValue()).a(i4.a.a(((Integer) this.f21006a.a(l4.f19858W4)).intValue())).d(false);
        if (this.f21006a.s0().c()) {
            bVarD.b(CollectionUtils.map("axon_test_code", "1"));
        }
        this.f21006a.e0().e(bVarD.a());
    }

    @Override // com.applovin.sdk.AppLovinEventService
    public void trackEvent(String str, Map<String, ?> map) {
        trackEvent(str, map, new HashMap());
    }

    @Override // com.applovin.sdk.AppLovinEventService
    public void trackEvent(String str, Map<String, ?> map, Map<String, Object> map2) {
        if (TextUtils.isEmpty(str)) {
            a("Unable to track empty event");
        } else if (this.f21006a.c(l4.f19702B0).contains(str)) {
            c(str, map, map2);
        } else {
            a(str, map);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, Map map, boolean z10) {
        n1 n1Var = new n1(str, map);
        boolean zContains = this.f21006a.c(l4.f19694A0).contains(n1Var.c());
        Map mapA = a(n1Var, false, zContains);
        HashMap map2 = new HashMap(n1Var.d());
        if (((Boolean) this.f21006a.a(l4.f19915e5)).booleanValue() || ((Boolean) this.f21006a.a(l4.f19878Z4)).booleanValue()) {
            map2.putAll(mapA);
            mapA = null;
        }
        this.f21006a.e0().e(com.applovin.impl.sdk.network.d.b().d(d()).a(c()).a(a(n1Var, zContains)).b(mapA).c(map2).c(((Boolean) this.f21006a.a(l4.f19992o5)).booleanValue()).a(((Boolean) this.f21006a.a(l4.f19783L4)).booleanValue()).d(z10).a(i4.a.a(((Integer) this.f21006a.a(l4.f19851V4)).intValue())).a());
    }

    private String b() {
        return B4.f.c(new StringBuilder(), (String) this.f21006a.a(l4.f20043v0), "v1/app");
    }

    private String c() {
        return B4.f.c(new StringBuilder(), (String) this.f21006a.a(l4.f20035u0), "4.0/pix");
    }

    private void a(String str) {
        o.h("AppLovinEventService", str);
        if (a7.c(this.f21006a)) {
            throw new IllegalArgumentException(str);
        }
    }

    private Map a(n1 n1Var, boolean z10, boolean z11) {
        Map mapA = this.f21006a.B().a((Map) null, z10, false);
        mapA.put("event_id", n1Var.b());
        mapA.put("ts", Long.toString(n1Var.a()));
        if (z11) {
            mapA.put("event", n1Var.c());
        } else {
            mapA.put("event", "postinstall");
            mapA.put("sub_event", n1Var.c());
        }
        return a7.a(mapA);
    }

    private Map a(n1 n1Var, boolean z10) {
        HashMap map = new HashMap();
        if (z10) {
            map.put("AppLovin-Event", n1Var.c());
            return map;
        }
        map.put("AppLovin-Event", "postinstall");
        map.put("AppLovin-Sub-Event", n1Var.c());
        return map;
    }

    private Map a(String str, Map map, Map map2) {
        HashMap map3 = new HashMap();
        n1 n1Var = new n1(str, map);
        map3.put(FacebookMediationAdapter.KEY_ID, n1Var.b());
        map3.put(AppMeasurementSdk.ConditionalUserProperty.NAME, n1Var.c());
        map3.put("data", n1Var.d());
        map3.put("timestamp", d1.a(n1Var.a()));
        Map mapD = this.f21006a.B().D();
        map3.put("app_info", mapD);
        map3.put("device_info", this.f21006a.B().n());
        CollectionUtils.putObjectToStringIfValid("dedupe_id", map2.get("dedupe_id"), map3);
        HashMap map4 = new HashMap();
        map4.put("connectEventKey", this.f21006a.r());
        CollectionUtils.putStringIfValid("eventId", this.f21006a.F(), map4);
        map4.put("version", AppLovinSdk.VERSION);
        map4.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f21006a.i0());
        map4.put("platform", this.f21006a.B().x());
        if (((Boolean) this.f21006a.a(l4.f20078z3)).booleanValue()) {
            CollectionUtils.putStringIfValid("art", this.f21006a.s(), map4);
        }
        HashMap map5 = new HashMap();
        map5.put("firstVisitTs", mapD.get("ia_v2"));
        map5.put("lastVisitTs", mapD.get("last_launch_ms"));
        map5.put("visitCount", mapD.get("app_launch_count"));
        map5.put("currentVisitStartTs", mapD.get("alts_ms"));
        map4.put("visitInfo", map5);
        map3.put("axon", map4);
        return map3;
    }

    private String a() {
        return B4.f.c(new StringBuilder(), (String) this.f21006a.a(l4.f20051w0), "v1/app");
    }
}

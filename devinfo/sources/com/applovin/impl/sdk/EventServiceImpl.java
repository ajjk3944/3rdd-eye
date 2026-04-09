package com.applovin.impl.sdk;

import android.content.Intent;
import android.text.TextUtils;
import com.applovin.impl.d6;
import com.applovin.impl.i1;
import com.applovin.impl.i5;
import com.applovin.impl.n7;
import com.applovin.impl.r6;
import com.applovin.impl.s1;
import com.applovin.impl.sdk.network.d;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.u4;
import com.applovin.impl.x4;
import com.applovin.sdk.AppLovinEventParameters;
import com.applovin.sdk.AppLovinEventService;
import com.applovin.sdk.AppLovinEventTypes;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class EventServiceImpl implements AppLovinEventService {
    public static final List<String> ALLOW_PRE_INIT_EVENT_TYPES = Arrays.asList("landing", "paused", "resumed", "cf_start", "tos_ok", "gdpr_ok");

    /* renamed from: a, reason: collision with root package name */
    private final k f5370a;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f5371b = new AtomicBoolean();

    public EventServiceImpl(k kVar) {
        this.f5370a = kVar;
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
        this.f5370a.q0().a((i5) new r6(this.f5370a, false, je.u.t("track_event:", str), new ci.a(10, this, map, map2, str)), d6.b.OTHER);
    }

    private String d() {
        return d.h.w(new StringBuilder(), (String) this.f5370a.a(x4.f6108p0), "4.0/pix");
    }

    public void maybeTrackAppOpenEvent() {
        if (this.f5371b.compareAndSet(false, true)) {
            this.f5370a.F().trackEvent("landing");
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
        this.f5370a.O();
        if (o.a()) {
            this.f5370a.O().a("AppLovinEventService", "Tracking event: \"" + str + "\" synchronously");
        }
        s1 s1Var = new s1(str, new HashMap());
        boolean zContains = this.f5370a.c(x4.f6186z0).contains(s1Var.c());
        Map mapA = a(s1Var, true, zContains);
        HashMap map = new HashMap(s1Var.d());
        if (((Boolean) this.f5370a.a(x4.E5)).booleanValue() || ((Boolean) this.f5370a.a(x4.f6190z5)).booleanValue()) {
            map.putAll(mapA);
            mapA = null;
        }
        this.f5370a.f0().e(com.applovin.impl.sdk.network.d.b().d(d()).a(c()).b(mapA).c(map).a(a(s1Var, zContains)).c(((Boolean) this.f5370a.a(x4.O5)).booleanValue()).a(((Boolean) this.f5370a.a(x4.f6074k5)).booleanValue()).a());
    }

    @Override // com.applovin.sdk.AppLovinEventService
    public void trackInAppPurchase(Intent intent, Map<String, String> map) {
        Map<String, ?> map2 = CollectionUtils.map(map);
        try {
            map2.put(AppLovinEventParameters.IN_APP_PURCHASE_DATA, intent.getStringExtra("INAPP_PURCHASE_DATA"));
            map2.put(AppLovinEventParameters.IN_APP_DATA_SIGNATURE, intent.getStringExtra("INAPP_DATA_SIGNATURE"));
        } catch (Throwable th2) {
            o.c("AppLovinEventService", "Unable to track in app purchase - invalid purchase intent", th2);
            this.f5370a.D().a("AppLovinEventService", "trackIAP", th2);
        }
        trackEvent(AppLovinEventTypes.USER_COMPLETED_IN_APP_PURCHASE, map2);
    }

    private void a(String str, Map map) {
        boolean zContains = ALLOW_PRE_INIT_EVENT_TYPES.contains(str);
        this.f5370a.q0().a((i5) new r6(this.f5370a, zContains, "submitTrackEventPostback", new u(this, str, map, zContains, 0)), d6.b.OTHER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(String str, Map map, Map map2) {
        Map map3 = CollectionUtils.map("AppLovin-Event", str);
        map3.put("AppLovin-SDK-Name", "AppLovin-MAX");
        d.b bVarD = com.applovin.impl.sdk.network.d.b().d(b()).a(a()).a(map3).c(a(str, map, map2)).a(((Boolean) this.f5370a.a(x4.f6074k5)).booleanValue()).a(u4.a.a(((Integer) this.f5370a.a(x4.f6159v5)).intValue())).d(false);
        if (this.f5370a.s0().c()) {
            bVarD.b(CollectionUtils.map("axon_test_code", "1"));
        }
        this.f5370a.f0().e(bVarD.a());
    }

    @Override // com.applovin.sdk.AppLovinEventService
    public void trackEvent(String str, Map<String, ?> map) {
        trackEvent(str, map, new HashMap());
    }

    @Override // com.applovin.sdk.AppLovinEventService
    public void trackEvent(String str, Map<String, ?> map, Map<String, Object> map2) {
        if (TextUtils.isEmpty(str)) {
            a("Unable to track empty event");
        } else if (this.f5370a.c(x4.A0).contains(str)) {
            c(str, map, map2);
        } else {
            a(str, map);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, Map map, boolean z3) {
        s1 s1Var = new s1(str, map);
        boolean zContains = this.f5370a.c(x4.f6186z0).contains(s1Var.c());
        Map mapA = a(s1Var, false, zContains);
        HashMap map2 = new HashMap(s1Var.d());
        if (((Boolean) this.f5370a.a(x4.E5)).booleanValue() || ((Boolean) this.f5370a.a(x4.f6190z5)).booleanValue()) {
            map2.putAll(mapA);
            mapA = null;
        }
        this.f5370a.f0().e(com.applovin.impl.sdk.network.d.b().d(d()).a(c()).a(a(s1Var, zContains)).b(mapA).c(map2).c(((Boolean) this.f5370a.a(x4.O5)).booleanValue()).a(((Boolean) this.f5370a.a(x4.f6074k5)).booleanValue()).d(z3).a(u4.a.a(((Integer) this.f5370a.a(x4.f6151u5)).intValue())).a());
    }

    private String b() {
        return d.h.w(new StringBuilder(), (String) this.f5370a.a(x4.f6123r0), "v1/app");
    }

    private String c() {
        return d.h.w(new StringBuilder(), (String) this.f5370a.a(x4.f6116q0), "4.0/pix");
    }

    private void a(String str) {
        o.h("AppLovinEventService", str);
        if (n7.c(this.f5370a)) {
            throw new IllegalArgumentException(str);
        }
    }

    private Map a(s1 s1Var, boolean z3, boolean z10) {
        Map mapA = this.f5370a.A().a((Map) null, z3, false);
        mapA.put("event_id", s1Var.b());
        mapA.put("ts", Long.toString(s1Var.a()));
        if (z10) {
            mapA.put("event", s1Var.c());
        } else {
            mapA.put("event", "postinstall");
            mapA.put("sub_event", s1Var.c());
        }
        return n7.a(mapA);
    }

    private Map a(s1 s1Var, boolean z3) {
        HashMap map = new HashMap();
        if (z3) {
            map.put("AppLovin-Event", s1Var.c());
            return map;
        }
        map.put("AppLovin-Event", "postinstall");
        map.put("AppLovin-Sub-Event", s1Var.c());
        return map;
    }

    private Map a(String str, Map map, Map map2) {
        HashMap map3 = new HashMap();
        s1 s1Var = new s1(str, map);
        map3.put(FacebookMediationAdapter.KEY_ID, s1Var.b());
        map3.put("name", s1Var.c());
        map3.put("data", s1Var.d());
        map3.put("timestamp", i1.a(s1Var.a()));
        Map mapG = this.f5370a.A().G();
        map3.put("app_info", mapG);
        map3.put("device_info", this.f5370a.A().p());
        CollectionUtils.putObjectToStringIfValid("dedupe_id", map2.get("dedupe_id"), map3);
        HashMap map4 = new HashMap();
        map4.put("connectEventKey", this.f5370a.q());
        CollectionUtils.putStringIfValid("eventId", this.f5370a.E(), map4);
        map4.put("version", AppLovinSdk.VERSION);
        map4.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f5370a.i0());
        map4.put("platform", this.f5370a.A().A());
        if (((Boolean) this.f5370a.a(x4.J3)).booleanValue()) {
            CollectionUtils.putStringIfValid("art", this.f5370a.r(), map4);
        }
        HashMap map5 = new HashMap();
        map5.put("firstVisitTs", mapG.get("ia_v2"));
        map5.put("lastVisitTs", mapG.get("last_launch_ms"));
        map5.put("visitCount", mapG.get("app_launch_count"));
        map5.put("currentVisitStartTs", mapG.get("alts_ms"));
        map4.put("visitInfo", map5);
        map3.put("axon", map4);
        return map3;
    }

    private String a() {
        return d.h.w(new StringBuilder(), (String) this.f5370a.a(x4.f6131s0), "v1/app");
    }
}

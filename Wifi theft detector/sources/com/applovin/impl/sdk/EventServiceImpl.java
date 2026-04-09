package com.applovin.impl.sdk;

import android.content.Intent;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.applovin.impl.d6;
import com.applovin.impl.i5;
import com.applovin.impl.n7;
import com.applovin.impl.r6;
import com.applovin.impl.sdk.network.d;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.u4;
import com.applovin.impl.x4;
import com.applovin.sdk.AppLovinEventParameters;
import com.applovin.sdk.AppLovinEventService;
import com.applovin.sdk.AppLovinEventTypes;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.mbridge.msdk.foundation.entity.CampaignEx;
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
    private final k f7625a;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f7626b = new AtomicBoolean();

    public EventServiceImpl(k kVar) {
        this.f7625a = kVar;
    }

    private void c(final String str, final Map map, final Map map2) {
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
        this.f7625a.q0().a((i5) new r6(this.f7625a, false, "track_event:" + str, new Runnable() { // from class: com.applovin.impl.sdk.y
            @Override // java.lang.Runnable
            public final void run() {
                this.f8117a.b(str, map, map2);
            }
        }), d6.b.OTHER);
    }

    private String d() {
        return ((String) this.f7625a.a(x4.f8547p0)) + "4.0/pix";
    }

    public void maybeTrackAppOpenEvent() {
        if (this.f7626b.compareAndSet(false, true)) {
            this.f7625a.F().trackEvent("landing");
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
        this.f7625a.O();
        if (o.a()) {
            this.f7625a.O().a("AppLovinEventService", "Tracking event: \"" + str + "\" synchronously");
        }
        com.applovin.impl.s1 s1Var = new com.applovin.impl.s1(str, new HashMap());
        boolean zContains = this.f7625a.c(x4.f8627z0).contains(s1Var.c());
        Map mapA = a(s1Var, true, zContains);
        HashMap map = new HashMap(s1Var.d());
        if (((Boolean) this.f7625a.a(x4.E5)).booleanValue() || ((Boolean) this.f7625a.a(x4.f8632z5)).booleanValue()) {
            map.putAll(mapA);
            mapA = null;
        }
        this.f7625a.f0().e(com.applovin.impl.sdk.network.d.b().d(d()).a(c()).b(mapA).c(map).a(a(s1Var, zContains)).c(((Boolean) this.f7625a.a(x4.O5)).booleanValue()).a(((Boolean) this.f7625a.a(x4.f8510k5)).booleanValue()).a());
    }

    @Override // com.applovin.sdk.AppLovinEventService
    public void trackInAppPurchase(Intent intent, Map<String, String> map) {
        Map<String, ?> map2 = CollectionUtils.map(map);
        try {
            map2.put(AppLovinEventParameters.IN_APP_PURCHASE_DATA, intent.getStringExtra("INAPP_PURCHASE_DATA"));
            map2.put(AppLovinEventParameters.IN_APP_DATA_SIGNATURE, intent.getStringExtra("INAPP_DATA_SIGNATURE"));
        } catch (Throwable th) {
            o.c("AppLovinEventService", "Unable to track in app purchase - invalid purchase intent", th);
            this.f7625a.D().a("AppLovinEventService", "trackIAP", th);
        }
        trackEvent("iap", map2);
    }

    private void a(final String str, final Map map) {
        final boolean zContains = ALLOW_PRE_INIT_EVENT_TYPES.contains(str);
        this.f7625a.q0().a((i5) new r6(this.f7625a, zContains, "submitTrackEventPostback", new Runnable() { // from class: com.applovin.impl.sdk.x
            @Override // java.lang.Runnable
            public final void run() {
                this.f8113a.a(str, map, zContains);
            }
        }), d6.b.OTHER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(String str, Map map, Map map2) {
        Map map3 = CollectionUtils.map("AppLovin-Event", str);
        map3.put("AppLovin-SDK-Name", "AppLovin-MAX");
        d.b bVarD = com.applovin.impl.sdk.network.d.b().d(b()).a(a()).a(map3).c(a(str, map, map2)).a(((Boolean) this.f7625a.a(x4.f8510k5)).booleanValue()).a(u4.a.a(((Integer) this.f7625a.a(x4.f8600v5)).intValue())).d(false);
        if (this.f7625a.s0().c()) {
            bVarD.b(CollectionUtils.map("axon_test_code", "1"));
        }
        this.f7625a.f0().e(bVarD.a());
    }

    @Override // com.applovin.sdk.AppLovinEventService
    public void trackEvent(String str, Map<String, ?> map) {
        trackEvent(str, map, new HashMap());
    }

    @Override // com.applovin.sdk.AppLovinEventService
    public void trackEvent(String str, Map<String, ?> map, Map<String, Object> map2) {
        if (TextUtils.isEmpty(str)) {
            a("Unable to track empty event");
        } else if (this.f7625a.c(x4.A0).contains(str)) {
            c(str, map, map2);
        } else {
            a(str, map);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, Map map, boolean z10) {
        com.applovin.impl.s1 s1Var = new com.applovin.impl.s1(str, map);
        boolean zContains = this.f7625a.c(x4.f8627z0).contains(s1Var.c());
        Map mapA = a(s1Var, false, zContains);
        HashMap map2 = new HashMap(s1Var.d());
        if (((Boolean) this.f7625a.a(x4.E5)).booleanValue() || ((Boolean) this.f7625a.a(x4.f8632z5)).booleanValue()) {
            map2.putAll(mapA);
            mapA = null;
        }
        this.f7625a.f0().e(com.applovin.impl.sdk.network.d.b().d(d()).a(c()).a(a(s1Var, zContains)).b(mapA).c(map2).c(((Boolean) this.f7625a.a(x4.O5)).booleanValue()).a(((Boolean) this.f7625a.a(x4.f8510k5)).booleanValue()).d(z10).a(u4.a.a(((Integer) this.f7625a.a(x4.f8592u5)).intValue())).a());
    }

    private String c() {
        return ((String) this.f7625a.a(x4.f8555q0)) + "4.0/pix";
    }

    private String b() {
        return ((String) this.f7625a.a(x4.f8563r0)) + "v1/app";
    }

    private void a(String str) {
        o.h("AppLovinEventService", str);
        if (n7.c(this.f7625a)) {
            throw new IllegalArgumentException(str);
        }
    }

    private Map a(com.applovin.impl.s1 s1Var, boolean z10, boolean z11) {
        Map mapA = this.f7625a.A().a((Map) null, z10, false);
        mapA.put("event_id", s1Var.b());
        mapA.put(CampaignEx.JSON_KEY_ST_TS, Long.toString(s1Var.a()));
        if (z11) {
            mapA.put(NotificationCompat.CATEGORY_EVENT, s1Var.c());
        } else {
            mapA.put(NotificationCompat.CATEGORY_EVENT, "postinstall");
            mapA.put("sub_event", s1Var.c());
        }
        return n7.a(mapA);
    }

    private Map a(com.applovin.impl.s1 s1Var, boolean z10) {
        HashMap map = new HashMap();
        if (z10) {
            map.put("AppLovin-Event", s1Var.c());
            return map;
        }
        map.put("AppLovin-Event", "postinstall");
        map.put("AppLovin-Sub-Event", s1Var.c());
        return map;
    }

    private Map a(String str, Map map, Map map2) {
        HashMap map3 = new HashMap();
        com.applovin.impl.s1 s1Var = new com.applovin.impl.s1(str, map);
        map3.put("id", s1Var.b());
        map3.put("name", s1Var.c());
        map3.put("data", s1Var.d());
        map3.put(CampaignEx.JSON_KEY_TIMESTAMP, com.applovin.impl.i1.a(s1Var.a()));
        Map mapG = this.f7625a.A().G();
        map3.put("app_info", mapG);
        map3.put("device_info", this.f7625a.A().p());
        CollectionUtils.putObjectToStringIfValid("dedupe_id", map2.get("dedupe_id"), map3);
        HashMap map4 = new HashMap();
        map4.put("connectEventKey", this.f7625a.q());
        CollectionUtils.putStringIfValid("eventId", this.f7625a.E(), map4);
        map4.put("version", AppLovinSdk.VERSION);
        map4.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f7625a.i0());
        map4.put("platform", this.f7625a.A().A());
        if (((Boolean) this.f7625a.a(x4.J3)).booleanValue()) {
            CollectionUtils.putStringIfValid("art", this.f7625a.r(), map4);
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
        return ((String) this.f7625a.a(x4.f8571s0)) + "v1/app";
    }
}

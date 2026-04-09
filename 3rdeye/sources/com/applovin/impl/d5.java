package com.applovin.impl;

import android.content.Context;
import com.applovin.impl.q4;
import com.applovin.impl.r5;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxError;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class d5 extends w4 {

    /* renamed from: l, reason: collision with root package name */
    private static JSONObject f19212l;

    /* renamed from: m, reason: collision with root package name */
    private static final Object f19213m = new Object();

    /* renamed from: n, reason: collision with root package name */
    private static final Map f19214n = Collections.synchronizedMap(new HashMap());

    /* renamed from: g, reason: collision with root package name */
    private final String f19215g;

    /* renamed from: h, reason: collision with root package name */
    private final MaxAdFormat f19216h;
    private final Map i;

    /* renamed from: j, reason: collision with root package name */
    private final Context f19217j;

    /* renamed from: k, reason: collision with root package name */
    private final b f19218k;

    public interface b {
        void a(JSONArray jSONArray);
    }

    public static class c implements q4.a, Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final b f19219a;

        /* renamed from: b, reason: collision with root package name */
        private final Object f19220b;

        /* renamed from: c, reason: collision with root package name */
        private int f19221c;

        /* renamed from: d, reason: collision with root package name */
        private final AtomicBoolean f19222d;

        /* renamed from: e, reason: collision with root package name */
        private final Collection f19223e;

        /* renamed from: f, reason: collision with root package name */
        private final com.applovin.impl.sdk.k f19224f;

        /* renamed from: g, reason: collision with root package name */
        private final com.applovin.impl.sdk.o f19225g;

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            if (this.f19222d.compareAndSet(false, true)) {
                a();
            }
        }

        private c(int i, b bVar, com.applovin.impl.sdk.k kVar) {
            this.f19221c = i;
            this.f19219a = bVar;
            this.f19224f = kVar;
            this.f19225g = kVar.O();
            this.f19220b = new Object();
            this.f19223e = new ArrayList(i);
            this.f19222d = new AtomicBoolean();
        }

        @Override // com.applovin.impl.q4.a
        public void a(q4 q4Var) throws JSONException {
            boolean z10;
            synchronized (this.f19220b) {
                this.f19223e.add(q4Var);
                int i = this.f19221c - 1;
                this.f19221c = i;
                z10 = i < 1;
            }
            if (z10 && this.f19222d.compareAndSet(false, true)) {
                if (a7.h() && ((Boolean) this.f19224f.a(l4.f19792N)).booleanValue()) {
                    this.f19224f.q0().a((w4) new f6(this.f19224f, "handleSignalCollectionCompleted", new H(this, 0)), r5.b.MEDIATION);
                } else {
                    a();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a() throws JSONException {
            ArrayList arrayList;
            synchronized (this.f19220b) {
                arrayList = new ArrayList(this.f19223e);
            }
            JSONArray jSONArray = new JSONArray();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                q4 q4Var = (q4) it.next();
                try {
                    JSONObject jSONObject = new JSONObject();
                    r4 r4VarF = q4Var.f();
                    jSONObject.put(AppMeasurementSdk.ConditionalUserProperty.NAME, r4VarF.c());
                    jSONObject.put("class", r4VarF.b());
                    jSONObject.put("adapter_version", q4Var.a());
                    jSONObject.put("sdk_version", q4Var.d());
                    JSONObject jSONObject2 = new JSONObject();
                    MaxError maxErrorC = q4Var.c();
                    if (maxErrorC != null) {
                        jSONObject2.put("error_message", maxErrorC.getMessage());
                    } else {
                        jSONObject2.put("signal", q4Var.e());
                    }
                    jSONObject2.put("signal_collection_time_ms", q4Var.b());
                    jSONObject2.put("is_cached", q4Var.g());
                    jSONObject.put("data", jSONObject2);
                    jSONArray.put(jSONObject);
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f19225g.a("TaskCollectSignals", "Collected signal from " + r4VarF);
                    }
                } catch (JSONException e4) {
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f19225g.a("TaskCollectSignals", "Failed to create signal data", e4);
                    }
                    this.f19224f.E().a("TaskCollectSignals", "createSignalsData", e4);
                }
            }
            a(jSONArray);
        }

        private void a(JSONArray jSONArray) {
            b bVar = this.f19219a;
            if (bVar != null) {
                bVar.a(jSONArray);
            }
        }
    }

    public d5(String str, MaxAdFormat maxAdFormat, Map map, Context context, com.applovin.impl.sdk.k kVar, b bVar) {
        super("TaskCollectSignals", kVar);
        this.f19215g = str;
        this.f19216h = maxAdFormat;
        this.i = map;
        this.f19217j = context;
        this.f19218k = bVar;
    }

    private void a(JSONArray jSONArray, JSONObject jSONObject) throws JSONException {
        c cVar = new c(jSONArray.length(), this.f19218k, this.f21692a);
        this.f21692a.q0().a(new f6(this.f21692a, "timeoutCollectSignal", cVar), r5.b.TIMEOUT, ((Long) this.f21692a.a(g3.f19390T6)).longValue());
        for (int i = 0; i < jSONArray.length(); i++) {
            a(new r4(this.i, jSONArray.getJSONObject(i), jSONObject, this.f21692a), cVar);
        }
    }

    private void b(JSONArray jSONArray, JSONObject jSONObject) throws JSONException {
        Set set = (Set) f19214n.get(this.f19215g);
        if (set == null || set.isEmpty()) {
            a("No signal providers found for ad unit: " + this.f19215g, (Throwable) null);
            return;
        }
        JSONArray jSONArray2 = new JSONArray();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            if (set.contains(JsonUtils.getString(jSONObject2, AppMeasurementSdk.ConditionalUserProperty.NAME, null))) {
                jSONArray2.put(jSONObject2);
            }
        }
        a(jSONArray2, jSONObject);
    }

    @Override // java.lang.Runnable
    public void run() {
        JSONArray jSONArray;
        try {
            synchronized (f19213m) {
                jSONArray = JsonUtils.getJSONArray(f19212l, "signal_providers", null);
            }
            if (jSONArray != null && jSONArray.length() > 0) {
                if (f19214n.size() > 0) {
                    b(jSONArray, f19212l);
                    return;
                } else {
                    a(jSONArray, f19212l);
                    return;
                }
            }
            if (com.applovin.impl.sdk.o.a()) {
                this.f21694c.k(this.f21693b, "Unable to find cached signal providers, fetching signal providers from SharedPreferences.");
            }
            JSONObject jSONObject = new JSONObject((String) this.f21692a.a(n4.f20559D, JsonUtils.EMPTY_JSON));
            JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject, "signal_providers", null);
            if (jSONArray2 != null && jSONArray2.length() != 0) {
                if (f19214n.size() > 0) {
                    b(jSONArray2, jSONObject);
                    return;
                } else {
                    a(jSONArray2, jSONObject);
                    return;
                }
            }
            a("No signal providers found", (Throwable) null);
        } catch (InterruptedException e4) {
            a("Failed to wait for signals", e4);
            this.f21692a.E().a("TaskCollectSignals", "waitForSignals", e4);
        } catch (JSONException e10) {
            a("Failed to parse signals JSON", e10);
            this.f21692a.E().a("TaskCollectSignals", "parseSignalsJSON", e10);
        } catch (Throwable th) {
            a("Failed to collect signals", th);
            this.f21692a.E().a("TaskCollectSignals", "collectSignals", th);
        }
    }

    private void a(r4 r4Var, q4.a aVar) {
        if (r4Var.r()) {
            AppLovinSdkUtils.runOnUiThread(new J4.h(this, r4Var, aVar, 6));
        } else {
            this.f21692a.X().collectSignal(this.f19215g, this.f19216h, r4Var, this.f19217j, aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(r4 r4Var, q4.a aVar) {
        this.f21692a.X().collectSignal(this.f19215g, this.f19216h, r4Var, this.f19217j, aVar);
    }

    private void a(String str, Throwable th) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f21694c.a(this.f21693b, "No signals collected: " + str, th);
        }
        b bVar = this.f19218k;
        if (bVar != null) {
            bVar.a(new JSONArray());
        }
    }

    public static void a(JSONObject jSONObject) {
        synchronized (f19213m) {
            f19212l = jSONObject;
        }
    }

    public static void a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        try {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "ad_unit_signal_providers", (JSONObject) null);
            if (jSONObject2 != null) {
                for (String str : JsonUtils.toList(jSONObject2.names())) {
                    f19214n.put(str, new HashSet(JsonUtils.getList(jSONObject2, str, null)));
                }
            }
        } catch (JSONException e4) {
            com.applovin.impl.sdk.o.c("TaskCollectSignals", "Failed to parse ad unit signal providers for JSON object: " + jSONObject, e4);
            kVar.E().a("TaskCollectSignals", "parseAdUnitSignalProvidersJSON", e4);
        }
    }
}

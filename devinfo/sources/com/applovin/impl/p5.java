package com.applovin.impl;

import android.content.Context;
import com.applovin.impl.c5;
import com.applovin.impl.d6;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxError;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class p5 extends i5 {
    private static JSONObject j;

    /* renamed from: k, reason: collision with root package name */
    private static final Object f5064k = new Object();

    /* renamed from: l, reason: collision with root package name */
    private static final Map f5065l = a0.g.r();
    private final a3 g;

    /* renamed from: h, reason: collision with root package name */
    private final Context f5066h;

    /* renamed from: i, reason: collision with root package name */
    private final b f5067i;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public interface b {
        void a(JSONArray jSONArray);
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class c implements c5.a, Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final b f5068a;

        /* renamed from: b, reason: collision with root package name */
        private final Object f5069b;

        /* renamed from: c, reason: collision with root package name */
        private int f5070c;

        /* renamed from: d, reason: collision with root package name */
        private final AtomicBoolean f5071d;

        /* renamed from: e, reason: collision with root package name */
        private final Collection f5072e;

        /* renamed from: f, reason: collision with root package name */
        private final com.applovin.impl.sdk.k f5073f;
        private final com.applovin.impl.sdk.o g;

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            if (this.f5071d.compareAndSet(false, true)) {
                a();
            }
        }

        private c(int i4, b bVar, com.applovin.impl.sdk.k kVar) {
            this.f5070c = i4;
            this.f5068a = bVar;
            this.f5073f = kVar;
            this.g = kVar.O();
            this.f5069b = new Object();
            this.f5072e = new ArrayList(i4);
            this.f5071d = new AtomicBoolean();
        }

        @Override // com.applovin.impl.c5.a
        public void a(c5 c5Var) throws JSONException {
            boolean z3;
            synchronized (this.f5069b) {
                this.f5072e.add(c5Var);
                int i4 = this.f5070c - 1;
                this.f5070c = i4;
                z3 = i4 < 1;
            }
            if (z3 && this.f5071d.compareAndSet(false, true)) {
                if (n7.i() && ((Boolean) this.f5073f.a(x4.P)).booleanValue()) {
                    this.f5073f.q0().a((i5) new r6(this.f5073f, "handleSignalCollectionCompleted", new v9(2, this)), d6.b.MEDIATION);
                } else {
                    a();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a() throws JSONException {
            ArrayList arrayList;
            synchronized (this.f5069b) {
                arrayList = new ArrayList(this.f5072e);
            }
            JSONArray jSONArray = new JSONArray();
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                c5 c5Var = (c5) obj;
                try {
                    JSONObject jSONObject = new JSONObject();
                    d5 d5VarF = c5Var.f();
                    jSONObject.put("name", d5VarF.c());
                    jSONObject.put("class", d5VarF.b());
                    jSONObject.put("adapter_version", c5Var.a());
                    jSONObject.put("sdk_version", c5Var.d());
                    JSONObject jSONObject2 = new JSONObject();
                    MaxError maxErrorC = c5Var.c();
                    if (maxErrorC != null) {
                        jSONObject2.put("error_message", maxErrorC.getMessage());
                    } else {
                        jSONObject2.put("signal", c5Var.e());
                    }
                    jSONObject2.put("signal_collection_time_ms", c5Var.b());
                    jSONObject2.put("is_cached", c5Var.g());
                    jSONObject.put("data", jSONObject2);
                    jSONArray.put(jSONObject);
                    if (com.applovin.impl.sdk.o.a()) {
                        this.g.a("TaskCollectSignals", "Collected signal from " + d5VarF);
                    }
                } catch (JSONException e2) {
                    if (com.applovin.impl.sdk.o.a()) {
                        this.g.a("TaskCollectSignals", "Failed to create signal data", e2);
                    }
                    this.f5073f.D().a("TaskCollectSignals", "createSignalsData", e2);
                }
            }
            a(jSONArray);
        }

        private void a(JSONArray jSONArray) {
            b bVar = this.f5068a;
            if (bVar != null) {
                bVar.a(jSONArray);
            }
        }
    }

    public p5(a3 a3Var, Context context, com.applovin.impl.sdk.k kVar, b bVar) {
        super("TaskCollectSignals", kVar);
        this.g = a3Var;
        this.f5066h = context;
        this.f5067i = bVar;
    }

    private void a(JSONArray jSONArray, JSONObject jSONObject) throws JSONException {
        c cVar = new c(jSONArray.length(), this.f5067i, this.f4287a);
        this.f4287a.q0().a(new r6(this.f4287a, "timeoutCollectSignal", cVar), d6.b.TIMEOUT, ((Long) this.f4287a.a(r3.f5245w7)).longValue());
        for (int i4 = 0; i4 < jSONArray.length(); i4++) {
            a(new d5(this.g, jSONArray.getJSONObject(i4), jSONObject, this.f4287a), cVar);
        }
    }

    private void b(JSONArray jSONArray, JSONObject jSONObject) throws JSONException {
        Set set = (Set) f5065l.get(this.g.b());
        if (set == null || set.isEmpty()) {
            a("No signal providers found for ad unit: " + this.g.b(), (Throwable) null);
            return;
        }
        JSONArray jSONArray2 = new JSONArray();
        for (int i4 = 0; i4 < jSONArray.length(); i4++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i4);
            if (set.contains(JsonUtils.getString(jSONObject2, "name", null))) {
                jSONArray2.put(jSONObject2);
            }
        }
        a(jSONArray2, jSONObject);
    }

    @Override // java.lang.Runnable
    public void run() {
        JSONArray jSONArray;
        try {
            synchronized (f5064k) {
                jSONArray = JsonUtils.getJSONArray(j, "signal_providers", null);
            }
            if (jSONArray != null && jSONArray.length() > 0) {
                if (f5065l.size() > 0) {
                    b(jSONArray, j);
                    return;
                } else {
                    a(jSONArray, j);
                    return;
                }
            }
            if (com.applovin.impl.sdk.o.a()) {
                this.f4289c.k(this.f4288b, "Unable to find cached signal providers, fetching signal providers from SharedPreferences.");
            }
            JSONObject jSONObject = new JSONObject((String) this.f4287a.a(z4.F, JsonUtils.EMPTY_JSON));
            JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject, "signal_providers", null);
            if (jSONArray2 != null && jSONArray2.length() != 0) {
                if (f5065l.size() > 0) {
                    b(jSONArray2, jSONObject);
                    return;
                } else {
                    a(jSONArray2, jSONObject);
                    return;
                }
            }
            a("No signal providers found", (Throwable) null);
        } catch (InterruptedException e2) {
            a("Failed to wait for signals", e2);
            this.f4287a.D().a("TaskCollectSignals", "waitForSignals", e2);
        } catch (JSONException e10) {
            a("Failed to parse signals JSON", e10);
            this.f4287a.D().a("TaskCollectSignals", "parseSignalsJSON", e10);
        } catch (Throwable th2) {
            a("Failed to collect signals", th2);
            this.f4287a.D().a("TaskCollectSignals", "collectSignals", th2);
        }
    }

    private void a(d5 d5Var, c5.a aVar) {
        if (d5Var.r()) {
            AppLovinSdkUtils.runOnUiThread(new b5.e(this, d5Var, aVar, 14));
        } else {
            this.f4287a.X().collectSignal(d5Var, this.f5066h, aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(d5 d5Var, c5.a aVar) {
        this.f4287a.X().collectSignal(d5Var, this.f5066h, aVar);
    }

    private void a(String str, Throwable th2) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f4289c.a(this.f4288b, "No signals collected: " + str, th2);
        }
        b bVar = this.f5067i;
        if (bVar != null) {
            bVar.a(new JSONArray());
        }
    }

    public static void a(JSONObject jSONObject) {
        synchronized (f5064k) {
            j = jSONObject;
        }
    }

    public static void a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        try {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "ad_unit_signal_providers", (JSONObject) null);
            if (jSONObject2 != null) {
                for (String str : JsonUtils.toList(jSONObject2.names())) {
                    f5065l.put(str, new HashSet(JsonUtils.getList(jSONObject2, str, null)));
                }
            }
        } catch (JSONException e2) {
            com.applovin.impl.sdk.o.c("TaskCollectSignals", "Failed to parse ad unit signal providers for JSON object: " + jSONObject, e2);
            kVar.D().a("TaskCollectSignals", "parseAdUnitSignalProvidersJSON", e2);
        }
    }
}

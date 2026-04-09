package com.applovin.impl;

import android.content.Context;
import com.applovin.impl.c5;
import com.applovin.impl.d6;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxError;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class p5 extends i5 {

    /* renamed from: j, reason: collision with root package name */
    private static JSONObject f7244j;

    /* renamed from: k, reason: collision with root package name */
    private static final Object f7245k = new Object();

    /* renamed from: l, reason: collision with root package name */
    private static final Map f7246l = Collections.synchronizedMap(new HashMap());

    /* renamed from: g, reason: collision with root package name */
    private final a3 f7247g;

    /* renamed from: h, reason: collision with root package name */
    private final Context f7248h;

    /* renamed from: i, reason: collision with root package name */
    private final b f7249i;

    public interface b {
        void a(JSONArray jSONArray);
    }

    public static class c implements c5.a, Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final b f7250a;

        /* renamed from: b, reason: collision with root package name */
        private final Object f7251b;

        /* renamed from: c, reason: collision with root package name */
        private int f7252c;

        /* renamed from: d, reason: collision with root package name */
        private final AtomicBoolean f7253d;

        /* renamed from: e, reason: collision with root package name */
        private final Collection f7254e;

        /* renamed from: f, reason: collision with root package name */
        private final com.applovin.impl.sdk.k f7255f;

        /* renamed from: g, reason: collision with root package name */
        private final com.applovin.impl.sdk.o f7256g;

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            if (this.f7253d.compareAndSet(false, true)) {
                a();
            }
        }

        private c(int i10, b bVar, com.applovin.impl.sdk.k kVar) {
            this.f7252c = i10;
            this.f7250a = bVar;
            this.f7255f = kVar;
            this.f7256g = kVar.O();
            this.f7251b = new Object();
            this.f7254e = new ArrayList(i10);
            this.f7253d = new AtomicBoolean();
        }

        @Override // com.applovin.impl.c5.a
        public void a(c5 c5Var) throws JSONException {
            boolean z10;
            synchronized (this.f7251b) {
                this.f7254e.add(c5Var);
                int i10 = this.f7252c - 1;
                this.f7252c = i10;
                z10 = i10 < 1;
            }
            if (z10 && this.f7253d.compareAndSet(false, true)) {
                if (n7.i() && ((Boolean) this.f7255f.a(x4.P)).booleanValue()) {
                    this.f7255f.q0().a((i5) new r6(this.f7255f, "handleSignalCollectionCompleted", new Runnable() { // from class: com.applovin.impl.ud
                        @Override // java.lang.Runnable
                        public final void run() throws JSONException {
                            this.f8237a.a();
                        }
                    }), d6.b.MEDIATION);
                } else {
                    a();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a() throws JSONException {
            ArrayList arrayList;
            synchronized (this.f7251b) {
                arrayList = new ArrayList(this.f7254e);
            }
            JSONArray jSONArray = new JSONArray();
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
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
                        this.f7256g.a("TaskCollectSignals", "Collected signal from " + d5VarF);
                    }
                } catch (JSONException e10) {
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f7256g.a("TaskCollectSignals", "Failed to create signal data", e10);
                    }
                    this.f7255f.D().a("TaskCollectSignals", "createSignalsData", e10);
                }
            }
            a(jSONArray);
        }

        private void a(JSONArray jSONArray) {
            b bVar = this.f7250a;
            if (bVar != null) {
                bVar.a(jSONArray);
            }
        }
    }

    public p5(a3 a3Var, Context context, com.applovin.impl.sdk.k kVar, b bVar) {
        super("TaskCollectSignals", kVar);
        this.f7247g = a3Var;
        this.f7248h = context;
        this.f7249i = bVar;
    }

    private void a(JSONArray jSONArray, JSONObject jSONObject) throws JSONException {
        c cVar = new c(jSONArray.length(), this.f7249i, this.f6218a);
        this.f6218a.q0().a(new r6(this.f6218a, "timeoutCollectSignal", cVar), d6.b.TIMEOUT, ((Long) this.f6218a.a(r3.f7487w7)).longValue());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            a(new d5(this.f7247g, jSONArray.getJSONObject(i10), jSONObject, this.f6218a), cVar);
        }
    }

    private void b(JSONArray jSONArray, JSONObject jSONObject) throws JSONException {
        Set set = (Set) f7246l.get(this.f7247g.b());
        if (set == null || set.isEmpty()) {
            a("No signal providers found for ad unit: " + this.f7247g.b(), (Throwable) null);
            return;
        }
        JSONArray jSONArray2 = new JSONArray();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
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
            synchronized (f7245k) {
                jSONArray = JsonUtils.getJSONArray(f7244j, "signal_providers", null);
            }
            if (jSONArray != null && jSONArray.length() > 0) {
                if (f7246l.size() > 0) {
                    b(jSONArray, f7244j);
                    return;
                } else {
                    a(jSONArray, f7244j);
                    return;
                }
            }
            if (com.applovin.impl.sdk.o.a()) {
                this.f6220c.k(this.f6219b, "Unable to find cached signal providers, fetching signal providers from SharedPreferences.");
            }
            JSONObject jSONObject = new JSONObject((String) this.f6218a.a(z4.F, JsonUtils.EMPTY_JSON));
            JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject, "signal_providers", null);
            if (jSONArray2 != null && jSONArray2.length() != 0) {
                if (f7246l.size() > 0) {
                    b(jSONArray2, jSONObject);
                    return;
                } else {
                    a(jSONArray2, jSONObject);
                    return;
                }
            }
            a("No signal providers found", (Throwable) null);
        } catch (InterruptedException e10) {
            a("Failed to wait for signals", e10);
            this.f6218a.D().a("TaskCollectSignals", "waitForSignals", e10);
        } catch (JSONException e11) {
            a("Failed to parse signals JSON", e11);
            this.f6218a.D().a("TaskCollectSignals", "parseSignalsJSON", e11);
        } catch (Throwable th) {
            a("Failed to collect signals", th);
            this.f6218a.D().a("TaskCollectSignals", "collectSignals", th);
        }
    }

    private void a(final d5 d5Var, final c5.a aVar) {
        if (d5Var.r()) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.td
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8179a.b(d5Var, aVar);
                }
            });
        } else {
            this.f6218a.X().collectSignal(d5Var, this.f7248h, aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(d5 d5Var, c5.a aVar) {
        this.f6218a.X().collectSignal(d5Var, this.f7248h, aVar);
    }

    private void a(String str, Throwable th) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f6220c.a(this.f6219b, "No signals collected: " + str, th);
        }
        b bVar = this.f7249i;
        if (bVar != null) {
            bVar.a(new JSONArray());
        }
    }

    public static void a(JSONObject jSONObject) {
        synchronized (f7245k) {
            f7244j = jSONObject;
        }
    }

    public static void a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        try {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "ad_unit_signal_providers", (JSONObject) null);
            if (jSONObject2 != null) {
                for (String str : JsonUtils.toList(jSONObject2.names())) {
                    f7246l.put(str, new HashSet(JsonUtils.getList(jSONObject2, str, null)));
                }
            }
        } catch (JSONException e10) {
            com.applovin.impl.sdk.o.c("TaskCollectSignals", "Failed to parse ad unit signal providers for JSON object: " + jSONObject, e10);
            kVar.D().a("TaskCollectSignals", "parseAdUnitSignalProvidersJSON", e10);
        }
    }
}

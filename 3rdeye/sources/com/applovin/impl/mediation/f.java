package com.applovin.impl.mediation;

import android.app.Activity;
import com.applovin.impl.a2;
import com.applovin.impl.a3;
import com.applovin.impl.g1;
import com.applovin.impl.g3;
import com.applovin.impl.g4;
import com.applovin.impl.n4;
import com.applovin.impl.r5;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.w5;
import com.applovin.impl.y1;
import com.applovin.impl.y4;
import com.applovin.mediation.adapter.MaxAdapter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f20415a;

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f20416b;

    /* renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f20417c = new AtomicBoolean();

    /* renamed from: d, reason: collision with root package name */
    private final Set f20418d = new HashSet();

    /* renamed from: e, reason: collision with root package name */
    private final Object f20419e = new Object();

    /* renamed from: f, reason: collision with root package name */
    private final JSONArray f20420f = new JSONArray();

    /* renamed from: g, reason: collision with root package name */
    private final LinkedHashMap f20421g = new LinkedHashMap();

    /* renamed from: h, reason: collision with root package name */
    private final Object f20422h = new Object();
    private final Map i = new HashMap();

    /* renamed from: j, reason: collision with root package name */
    private final Map f20423j = new HashMap();

    /* renamed from: k, reason: collision with root package name */
    private final Object f20424k = new Object();

    /* renamed from: l, reason: collision with root package name */
    private List f20425l;

    public f(com.applovin.impl.sdk.k kVar) {
        this.f20415a = kVar;
        this.f20416b = kVar.O();
    }

    public void a(Activity activity) {
        if (this.f20417c.compareAndSet(false, true)) {
            String str = (String) this.f20415a.a(n4.f20560E);
            if (StringUtils.isValidString(str)) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    List<a3> listA = a(JsonUtils.getJSONArray(jSONObject, this.f20415a.s0().c() ? "test_mode_auto_init_adapters" : "auto_init_adapters", new JSONArray()), jSONObject);
                    this.f20425l = listA;
                    for (a3 a3Var : listA) {
                        this.i.put(a3Var.b(), a3Var);
                    }
                    long j4 = StringUtils.parseLong(this.f20415a.n0().getExtraParameters().get("adapter_initialization_delay_ms"), -1L);
                    y4 y4Var = new y4(listA, activity, this.f20415a);
                    if (j4 > 0) {
                        this.f20415a.q0().a(y4Var, r5.b.MEDIATION, j4);
                    } else {
                        this.f20415a.q0().a(y4Var);
                    }
                } catch (JSONException e4) {
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f20416b.a("MediationAdapterInitializationManager", "Failed to parse auto-init adapters JSON", e4);
                    }
                    g1.a((Throwable) e4);
                }
            }
        }
    }

    public boolean c() {
        return this.f20417c.get();
    }

    private void c(a3 a3Var) {
        String strB = a3Var.b();
        synchronized (this.f20419e) {
            try {
                if (this.f20418d.contains(strB)) {
                    return;
                }
                this.f20418d.add(strB);
                this.f20415a.P().d(y1.f21771N, a2.a(a3Var));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public JSONArray b() {
        JSONArray jSONArrayShallowCopy;
        synchronized (this.f20422h) {
            jSONArrayShallowCopy = JsonUtils.shallowCopy(this.f20420f);
        }
        return jSONArrayShallowCopy;
    }

    public boolean b(a3 a3Var) {
        boolean zContainsKey;
        synchronized (this.f20422h) {
            zContainsKey = this.f20421g.containsKey(a3Var.b());
        }
        return zContainsKey;
    }

    public g4 a(a3 a3Var, Activity activity) {
        a3 a3VarA = a(a3Var);
        if (a3VarA == null) {
            return g4.a("AdapterInitialization:" + a3Var.c(), MaxAdapter.InitializationStatus.DOES_NOT_APPLY);
        }
        String strB = a3Var.b();
        synchronized (this.f20424k) {
            try {
                g4 g4Var = (g4) this.f20423j.get(strB);
                if (g4Var == null || (g4Var.d() && a3VarA.q())) {
                    final g4 g4Var2 = new g4("AdapterInitialization:" + a3Var.c());
                    this.f20423j.put(strB, g4Var2);
                    h hVarA = this.f20415a.T().a(a3VarA);
                    if (hVarA == null) {
                        g4Var2.a("Adapter implementation not found");
                        return g4Var2;
                    }
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f20416b.d("MediationAdapterInitializationManager", "Initializing adapter " + a3VarA);
                    }
                    c(a3VarA);
                    hVarA.a(MaxAdapterParametersImpl.a(a3VarA), activity, new MaxAdapter.OnCompletionListener() { // from class: com.applovin.impl.mediation.q
                        @Override // com.applovin.mediation.adapter.MaxAdapter.OnCompletionListener
                        public final void onCompletion(MaxAdapter.InitializationStatus initializationStatus, String str) {
                            f.a(g4Var2, initializationStatus, str);
                        }
                    });
                    w5.a(a3VarA.m(), g4Var2, "The adapter (" + a3Var.c() + ") timed out initializing", "MediationAdapterInitializationManager", this.f20415a);
                    return g4Var2;
                }
                return g4Var;
            } finally {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(g4 g4Var, MaxAdapter.InitializationStatus initializationStatus, String str) {
        if (initializationStatus != null && initializationStatus != MaxAdapter.InitializationStatus.INITIALIZING) {
            if (initializationStatus == MaxAdapter.InitializationStatus.INITIALIZED_FAILURE) {
                g4Var.a(str);
                return;
            } else {
                g4Var.b(initializationStatus);
                return;
            }
        }
        g1.a("Adapters should never report a null or INITIALIZING status.", new Object[0]);
        g4Var.a("Adapter reported INITIALIZING");
    }

    private a3 a(a3 a3Var) {
        List<a3> list;
        if (((Boolean) this.f20415a.a(g3.f19381O7)).booleanValue()) {
            a3 a3Var2 = (a3) this.i.get(a3Var.b());
            return a3Var2 != null ? a3Var2 : a3Var;
        }
        if (!this.f20415a.s0().c() || (list = this.f20425l) == null) {
            return a3Var;
        }
        for (a3 a3Var3 : list) {
            if (a3Var3.b().equals(a3Var.b())) {
                return a3Var3;
            }
        }
        return null;
    }

    public Integer a(String str) {
        Integer num;
        synchronized (this.f20422h) {
            num = (Integer) this.f20421g.get(str);
        }
        return num;
    }

    public Set a() {
        HashSet hashSet;
        synchronized (this.f20422h) {
            hashSet = new HashSet(this.f20421g.keySet());
        }
        return hashSet;
    }

    public void a(a3 a3Var, long j4, MaxAdapter.InitializationStatus initializationStatus, String str) {
        boolean zB;
        if (initializationStatus == null || initializationStatus == MaxAdapter.InitializationStatus.INITIALIZING) {
            return;
        }
        synchronized (this.f20422h) {
            try {
                zB = b(a3Var);
                if (!zB) {
                    this.f20421g.put(a3Var.b(), Integer.valueOf(initializationStatus.getCode()));
                    JSONObject jSONObject = new JSONObject();
                    JsonUtils.putString(jSONObject, "class", a3Var.b());
                    JsonUtils.putString(jSONObject, "init_status", String.valueOf(initializationStatus.getCode()));
                    JsonUtils.putLong(jSONObject, "init_time_ms", j4);
                    JsonUtils.putString(jSONObject, "error_message", JSONObject.quote(str));
                    this.f20420f.put(jSONObject);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zB) {
            return;
        }
        this.f20415a.a(a3Var);
        this.f20415a.X().processAdapterInitializationPostback(a3Var, j4, initializationStatus, str);
        this.f20415a.u().a(initializationStatus, a3Var.b());
    }

    private List a(JSONArray jSONArray, JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(new a3(Collections.EMPTY_MAP, JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null), jSONObject, this.f20415a));
        }
        return arrayList;
    }

    public void a(MaxAdapter.InitializationStatus initializationStatus) {
        synchronized (this.f20422h) {
            this.f20421g.put("com.applovin.mediation.adapters.AppLovinMediationAdapter", Integer.valueOf(initializationStatus.getCode()));
        }
        this.f20415a.u().a(initializationStatus, "com.applovin.mediation.adapters.AppLovinMediationAdapter");
    }
}

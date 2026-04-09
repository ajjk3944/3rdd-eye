package com.applovin.impl.mediation;

import android.app.Activity;
import com.applovin.impl.d2;
import com.applovin.impl.d6;
import com.applovin.impl.f2;
import com.applovin.impl.i6;
import com.applovin.impl.k3;
import com.applovin.impl.k5;
import com.applovin.impl.l1;
import com.applovin.impl.r3;
import com.applovin.impl.s4;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.x4;
import com.applovin.impl.z4;
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

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f4747a;

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f4748b;

    /* renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f4749c = new AtomicBoolean();

    /* renamed from: d, reason: collision with root package name */
    private final Set f4750d = new HashSet();

    /* renamed from: e, reason: collision with root package name */
    private final Object f4751e = new Object();

    /* renamed from: f, reason: collision with root package name */
    private final JSONArray f4752f = new JSONArray();
    private final LinkedHashMap g = new LinkedHashMap();

    /* renamed from: h, reason: collision with root package name */
    private final Object f4753h = new Object();

    /* renamed from: i, reason: collision with root package name */
    private final Map f4754i = new HashMap();
    private final Map j = new HashMap();

    /* renamed from: k, reason: collision with root package name */
    private final Object f4755k = new Object();

    /* renamed from: l, reason: collision with root package name */
    private List f4756l;

    public f(com.applovin.impl.sdk.k kVar) {
        this.f4747a = kVar;
        this.f4748b = kVar.O();
    }

    public void a(Activity activity) {
        if (this.f4749c.compareAndSet(false, true)) {
            String str = (String) this.f4747a.a(z4.G);
            if (StringUtils.isValidString(str)) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    List<k3> listA = a(JsonUtils.getJSONArray(jSONObject, this.f4747a.s0().c() ? "test_mode_auto_init_adapters" : "auto_init_adapters", new JSONArray()), jSONObject);
                    this.f4756l = listA;
                    for (k3 k3Var : listA) {
                        this.f4754i.put(k3Var.b(), k3Var);
                    }
                    long j = StringUtils.parseLong(this.f4747a.n0().getExtraParameters().get("adapter_initialization_delay_ms"), -1L);
                    k5 k5Var = new k5(listA, activity, this.f4747a);
                    if (j > 0) {
                        this.f4747a.q0().a(k5Var, d6.b.MEDIATION, j);
                    } else {
                        this.f4747a.q0().a(k5Var);
                    }
                } catch (JSONException e2) {
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f4748b.a("MediationAdapterInitializationManager", "Failed to parse auto-init adapters JSON", e2);
                    }
                    l1.a((Throwable) e2);
                }
            }
        }
    }

    public boolean c() {
        return this.f4749c.get();
    }

    private void c(k3 k3Var) {
        String strB = k3Var.b();
        synchronized (this.f4751e) {
            try {
                if (this.f4750d.contains(strB)) {
                    return;
                }
                this.f4750d.add(strB);
                this.f4747a.P().d(d2.f3876c0, f2.a(k3Var));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public JSONArray b() {
        JSONArray jSONArrayShallowCopy;
        synchronized (this.f4753h) {
            jSONArrayShallowCopy = JsonUtils.shallowCopy(this.f4752f);
        }
        return jSONArrayShallowCopy;
    }

    public boolean b(k3 k3Var) {
        boolean zContainsKey;
        synchronized (this.f4753h) {
            zContainsKey = this.g.containsKey(k3Var.b());
        }
        return zContainsKey;
    }

    public s4 a(k3 k3Var, Activity activity) {
        k3 k3VarA = a(k3Var);
        if (k3VarA == null) {
            return s4.a("AdapterInitialization:" + k3Var.c(), MaxAdapter.InitializationStatus.DOES_NOT_APPLY);
        }
        String strB = k3Var.b();
        synchronized (this.f4755k) {
            try {
                s4 s4Var = (s4) this.j.get(strB);
                if (s4Var != null) {
                    boolean z3 = false;
                    boolean z10 = k3VarA.q() && s4Var.e();
                    if (((Boolean) this.f4747a.a(x4.U6)).booleanValue() && s4Var.a()) {
                        z3 = true;
                    }
                    if (!z10 && !z3) {
                        return s4Var;
                    }
                }
                final s4 s4Var2 = new s4("AdapterInitialization:" + k3Var.c());
                this.j.put(strB, s4Var2);
                h hVarA = this.f4747a.T().a(k3VarA);
                if (hVarA == null) {
                    s4Var2.a("Adapter implementation not found");
                    return s4Var2;
                }
                if (com.applovin.impl.sdk.o.a()) {
                    this.f4748b.d("MediationAdapterInitializationManager", "Initializing adapter " + k3VarA);
                }
                c(k3VarA);
                hVarA.a(MaxAdapterParametersImpl.a(k3VarA), activity, new MaxAdapter.OnCompletionListener() { // from class: com.applovin.impl.mediation.n
                    @Override // com.applovin.mediation.adapter.MaxAdapter.OnCompletionListener
                    public final void onCompletion(MaxAdapter.InitializationStatus initializationStatus, String str) {
                        f.a(s4Var2, initializationStatus, str);
                    }
                });
                i6.a(k3VarA.m(), s4Var2, "The adapter (" + k3Var.c() + ") timed out initializing", "MediationAdapterInitializationManager", this.f4747a);
                return s4Var2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(s4 s4Var, MaxAdapter.InitializationStatus initializationStatus, String str) {
        if (initializationStatus != null && initializationStatus != MaxAdapter.InitializationStatus.INITIALIZING) {
            if (initializationStatus == MaxAdapter.InitializationStatus.INITIALIZED_FAILURE) {
                s4Var.a(str);
                return;
            } else {
                s4Var.b(initializationStatus);
                return;
            }
        }
        l1.a("Adapters should never report a null or INITIALIZING status.", new Object[0]);
        s4Var.a("Adapter reported INITIALIZING");
    }

    private k3 a(k3 k3Var) {
        List<k3> list;
        if (((Boolean) this.f4747a.a(r3.f5244v8)).booleanValue()) {
            k3 k3Var2 = (k3) this.f4754i.get(k3Var.b());
            return k3Var2 != null ? k3Var2 : k3Var;
        }
        if (!this.f4747a.s0().c() || (list = this.f4756l) == null) {
            return k3Var;
        }
        for (k3 k3Var3 : list) {
            if (k3Var3.b().equals(k3Var.b())) {
                return k3Var3;
            }
        }
        return null;
    }

    public Integer a(String str) {
        Integer num;
        synchronized (this.f4753h) {
            num = (Integer) this.g.get(str);
        }
        return num;
    }

    public Set a() {
        HashSet hashSet;
        synchronized (this.f4753h) {
            hashSet = new HashSet(this.g.keySet());
        }
        return hashSet;
    }

    public void a(k3 k3Var, long j, MaxAdapter.InitializationStatus initializationStatus, String str) {
        boolean zB;
        if (initializationStatus == null || initializationStatus == MaxAdapter.InitializationStatus.INITIALIZING) {
            return;
        }
        synchronized (this.f4753h) {
            try {
                zB = b(k3Var);
                if (!zB) {
                    this.g.put(k3Var.b(), Integer.valueOf(initializationStatus.getCode()));
                    JSONObject jSONObject = new JSONObject();
                    JsonUtils.putString(jSONObject, "class", k3Var.b());
                    JsonUtils.putString(jSONObject, "init_status", String.valueOf(initializationStatus.getCode()));
                    JsonUtils.putLong(jSONObject, "init_time_ms", j);
                    JsonUtils.putString(jSONObject, "error_message", JSONObject.quote(str));
                    this.f4752f.put(jSONObject);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (zB) {
            return;
        }
        this.f4747a.a(k3Var);
        this.f4747a.X().processAdapterInitializationPostback(k3Var, j, initializationStatus, str);
        this.f4747a.t().a(initializationStatus, k3Var.b());
    }

    private List a(JSONArray jSONArray, JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i4 = 0; i4 < jSONArray.length(); i4++) {
            arrayList.add(new k3(Collections.EMPTY_MAP, JsonUtils.getJSONObject(jSONArray, i4, (JSONObject) null), jSONObject, this.f4747a));
        }
        return arrayList;
    }

    public void a(MaxAdapter.InitializationStatus initializationStatus) {
        synchronized (this.f4753h) {
            this.g.put("com.applovin.mediation.adapters.AppLovinMediationAdapter", Integer.valueOf(initializationStatus.getCode()));
        }
        this.f4747a.t().a(initializationStatus, "com.applovin.mediation.adapters.AppLovinMediationAdapter");
    }
}

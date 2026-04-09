package com.applovin.impl;

import android.os.Bundle;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.sdk.AppLovinEventParameters;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class k3 {

    /* renamed from: a, reason: collision with root package name */
    protected final com.applovin.impl.sdk.k f4362a;

    /* renamed from: b, reason: collision with root package name */
    private final JSONObject f4363b;

    /* renamed from: d, reason: collision with root package name */
    protected final JSONObject f4365d;

    /* renamed from: f, reason: collision with root package name */
    private final Map f4367f;
    private final h5 g;

    /* renamed from: h, reason: collision with root package name */
    protected final h5 f4368h;

    /* renamed from: i, reason: collision with root package name */
    private String f4369i;
    private String j;

    /* renamed from: c, reason: collision with root package name */
    private final Object f4364c = new Object();

    /* renamed from: e, reason: collision with root package name */
    protected final Object f4366e = new Object();

    public k3(Map map, JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.k kVar) {
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        if (jSONObject2 == null) {
            throw new IllegalArgumentException("No full response specified");
        }
        if (jSONObject == null) {
            throw new IllegalArgumentException("No ad object specified");
        }
        this.f4362a = kVar;
        if (((Boolean) kVar.a(x4.C6)).booleanValue()) {
            this.g = new h5(jSONObject2);
            this.f4368h = new h5(jSONObject);
            this.f4363b = null;
            this.f4365d = null;
        } else {
            this.f4363b = jSONObject2;
            this.f4365d = jSONObject;
            this.g = null;
            this.f4368h = null;
        }
        this.f4367f = map;
    }

    private int j() {
        return a("mute_state", b("mute_state", ((Integer) this.f4362a.a(r3.f5218b8)).intValue()));
    }

    public JSONObject a() {
        JSONObject jSONObject;
        h5 h5Var = this.f4368h;
        if (h5Var != null) {
            return h5Var.a();
        }
        synchronized (this.f4366e) {
            jSONObject = this.f4365d;
        }
        return jSONObject;
    }

    public Boolean b(String str, Boolean bool) {
        Boolean bool2;
        h5 h5Var = this.g;
        if (h5Var != null) {
            return h5Var.a(str, bool);
        }
        synchronized (this.f4364c) {
            bool2 = JsonUtils.getBoolean(this.f4363b, str, bool);
        }
        return bool2;
    }

    public boolean c(String str) {
        boolean zHas;
        h5 h5Var = this.f4368h;
        if (h5Var != null) {
            return h5Var.a(str);
        }
        synchronized (this.f4366e) {
            zHas = this.f4365d.has(str);
        }
        return zHas;
    }

    public boolean d(String str) {
        boolean zHas;
        h5 h5Var = this.g;
        if (h5Var != null) {
            return h5Var.a(str);
        }
        synchronized (this.f4364c) {
            zHas = this.f4363b.has(str);
        }
        return zHas;
    }

    public Object e(String str) {
        Object objOpt;
        h5 h5Var = this.f4368h;
        if (h5Var != null) {
            return h5Var.b(str);
        }
        synchronized (this.f4366e) {
            objOpt = this.f4365d.opt(str);
        }
        return objOpt;
    }

    public Bundle f() {
        return BundleUtils.getBundle("custom_parameters", new Bundle(), l());
    }

    public JSONObject g() {
        JSONObject jSONObject;
        h5 h5Var = this.g;
        if (h5Var != null) {
            return h5Var.a();
        }
        synchronized (this.f4364c) {
            jSONObject = this.f4363b;
        }
        return jSONObject;
    }

    public String getAdUnitId() {
        return b(AppLovinUtils.ServerParameterKeys.AD_UNIT_ID, "");
    }

    public String getPlacement() {
        return this.f4369i;
    }

    public Map i() {
        return this.f4367f;
    }

    public String k() {
        return c().split("_")[0];
    }

    public Bundle l() {
        Bundle bundle;
        if (e("server_parameters") instanceof JSONObject) {
            h5 h5Var = this.f4368h;
            bundle = h5Var != null ? (Bundle) h5Var.a(new a0.x(8)) : JsonUtils.toBundle(a("server_parameters", (JSONObject) null));
        } else {
            bundle = new Bundle();
        }
        int iJ = j();
        if (iJ != -1) {
            if (iJ == 2) {
                bundle.putBoolean("is_muted", this.f4362a.n0().isMuted());
            } else {
                bundle.putBoolean("is_muted", iJ == 0);
            }
        }
        if (!bundle.containsKey(AppLovinEventParameters.REVENUE_AMOUNT)) {
            bundle.putLong(AppLovinEventParameters.REVENUE_AMOUNT, b(AppLovinEventParameters.REVENUE_AMOUNT, 0L));
        }
        if (!bundle.containsKey(AppLovinEventParameters.REVENUE_CURRENCY)) {
            bundle.putString(AppLovinEventParameters.REVENUE_CURRENCY, b(AppLovinEventParameters.REVENUE_CURRENCY, ""));
        }
        return bundle;
    }

    public long m() {
        return a("adapter_timeout_ms", ((Long) this.f4362a.a(r3.f5247x7)).longValue());
    }

    public Boolean n() {
        String str = this.f4362a.n0().getExtraParameters().get("huc");
        return StringUtils.isValidString(str) ? Boolean.valueOf(str) : c("huc") ? a("huc", Boolean.FALSE) : b("huc", (Boolean) null);
    }

    public Boolean o() {
        String str = this.f4362a.n0().getExtraParameters().get("dns");
        return StringUtils.isValidString(str) ? Boolean.valueOf(str) : c("dns") ? a("dns", Boolean.FALSE) : b("dns", (Boolean) null);
    }

    public boolean p() {
        return a("is_testing", Boolean.FALSE).booleanValue();
    }

    public boolean q() {
        return a("reinitialize_if_init_fails", Boolean.FALSE).booleanValue();
    }

    public boolean r() {
        return a("run_on_ui_thread", Boolean.TRUE).booleanValue();
    }

    public boolean s() {
        return a("eagerly_initialize", Boolean.TRUE).booleanValue();
    }

    public String toString() {
        return "MediationAdapterSpec{adapterClass='" + b() + "', adapterName='" + c() + "', isTesting=" + p() + '}';
    }

    public void f(String str) {
        this.j = str;
    }

    public long h() {
        return a("init_completion_delay_ms", -1L);
    }

    public Boolean a(String str, Boolean bool) {
        Boolean bool2;
        h5 h5Var = this.f4368h;
        if (h5Var != null) {
            return h5Var.a(str, bool);
        }
        synchronized (this.f4366e) {
            bool2 = JsonUtils.getBoolean(this.f4365d, str, bool);
        }
        return bool2;
    }

    public int b(String str, int i4) {
        int i10;
        h5 h5Var = this.g;
        if (h5Var != null) {
            return h5Var.a(str, i4);
        }
        synchronized (this.f4364c) {
            i10 = JsonUtils.getInt(this.f4363b, str, i4);
        }
        return i10;
    }

    public void c(String str, int i4) {
        h5 h5Var = this.f4368h;
        if (h5Var != null) {
            h5Var.b(str, i4);
            return;
        }
        synchronized (this.f4366e) {
            JsonUtils.putInt(this.f4365d, str, i4);
        }
    }

    public String d() {
        if (c("consent_string")) {
            return a("consent_string", (String) null);
        }
        if (d("consent_string")) {
            return b("consent_string", (String) null);
        }
        return this.f4362a.r0().j();
    }

    public String e() {
        return this.j;
    }

    public void g(String str) {
        this.f4369i = str;
    }

    public float a(String str, float f10) {
        float f11;
        h5 h5Var = this.f4368h;
        if (h5Var != null) {
            return h5Var.a(str, f10);
        }
        synchronized (this.f4366e) {
            f11 = JsonUtils.getFloat(this.f4365d, str, f10);
        }
        return f11;
    }

    public JSONArray b(String str, JSONArray jSONArray) {
        JSONArray jSONArray2;
        h5 h5Var = this.g;
        if (h5Var != null) {
            return h5Var.a(str, jSONArray);
        }
        synchronized (this.f4364c) {
            jSONArray2 = JsonUtils.getJSONArray(this.f4363b, str, jSONArray);
        }
        return jSONArray2;
    }

    public void c(String str, long j) {
        h5 h5Var = this.f4368h;
        if (h5Var != null) {
            h5Var.b(str, j);
            return;
        }
        synchronized (this.f4366e) {
            JsonUtils.putLong(this.f4365d, str, j);
        }
    }

    public int a(String str, int i4) {
        int i10;
        h5 h5Var = this.f4368h;
        if (h5Var != null) {
            return h5Var.a(str, i4);
        }
        synchronized (this.f4366e) {
            i10 = JsonUtils.getInt(this.f4365d, str, i4);
        }
        return i10;
    }

    public long b(String str, long j) {
        long j8;
        h5 h5Var = this.g;
        if (h5Var != null) {
            return h5Var.a(str, j);
        }
        synchronized (this.f4364c) {
            j8 = JsonUtils.getLong(this.f4363b, str, j);
        }
        return j8;
    }

    public void c(String str, String str2) {
        h5 h5Var = this.f4368h;
        if (h5Var != null) {
            h5Var.b(str, str2);
            return;
        }
        synchronized (this.f4366e) {
            JsonUtils.putString(this.f4365d, str, str2);
        }
    }

    public JSONArray a(String str, JSONArray jSONArray) {
        JSONArray jSONArray2;
        h5 h5Var = this.f4368h;
        if (h5Var != null) {
            return h5Var.a(str, jSONArray);
        }
        synchronized (this.f4366e) {
            jSONArray2 = JsonUtils.getJSONArray(this.f4365d, str, jSONArray);
        }
        return jSONArray2;
    }

    public String b(String str, String str2) {
        String string;
        h5 h5Var = this.g;
        if (h5Var != null) {
            return h5Var.a(str, str2);
        }
        synchronized (this.f4364c) {
            string = JsonUtils.getString(this.f4363b, str, str2);
        }
        return string;
    }

    public String c() {
        return a("name", (String) null);
    }

    public JSONObject a(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        h5 h5Var = this.f4368h;
        if (h5Var != null) {
            return h5Var.a(str, jSONObject);
        }
        synchronized (this.f4366e) {
            jSONObject2 = JsonUtils.getJSONObject(this.f4365d, str, jSONObject);
        }
        return jSONObject2;
    }

    public String b() {
        return a("class", (String) null);
    }

    public List b(String str) {
        List listOptList;
        List listOptList2;
        if (str != null) {
            h5 h5Var = this.g;
            if (h5Var != null) {
                listOptList = h5Var.b(str, Collections.EMPTY_LIST);
            } else {
                listOptList = JsonUtils.optList(b(str, new JSONArray()), Collections.EMPTY_LIST);
            }
            h5 h5Var2 = this.f4368h;
            if (h5Var2 != null) {
                listOptList2 = h5Var2.b(str, Collections.EMPTY_LIST);
            } else {
                listOptList2 = JsonUtils.optList(a(str, new JSONArray()), Collections.EMPTY_LIST);
            }
            ArrayList arrayList = new ArrayList(listOptList2.size() + listOptList.size());
            arrayList.addAll(listOptList);
            arrayList.addAll(listOptList2);
            return arrayList;
        }
        throw new IllegalArgumentException("No key specified");
    }

    public long a(String str, long j) {
        long j8;
        h5 h5Var = this.f4368h;
        if (h5Var != null) {
            return h5Var.a(str, j);
        }
        synchronized (this.f4366e) {
            j8 = JsonUtils.getLong(this.f4365d, str, j);
        }
        return j8;
    }

    public String a(String str, String str2) {
        String string;
        h5 h5Var = this.f4368h;
        if (h5Var != null) {
            return h5Var.a(str, str2);
        }
        synchronized (this.f4366e) {
            string = JsonUtils.getString(this.f4365d, str, str2);
        }
        return string;
    }

    public void a(String str, Object obj) {
        h5 h5Var = this.f4368h;
        if (h5Var != null) {
            h5Var.a(str, obj);
            return;
        }
        synchronized (this.f4366e) {
            JsonUtils.putObject(this.f4365d, str, obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Bundle a(h5 h5Var) {
        return JsonUtils.toBundle(h5Var.a("server_parameters", (JSONObject) null));
    }

    public String a(String str) {
        String strA = a(str, "");
        return StringUtils.isValidString(strA) ? strA : b(str, "");
    }
}

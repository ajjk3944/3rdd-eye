package com.applovin.impl;

import android.os.Bundle;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.AppLovinUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class k3 {

    /* renamed from: a, reason: collision with root package name */
    protected final com.applovin.impl.sdk.k f6313a;

    /* renamed from: b, reason: collision with root package name */
    private final JSONObject f6314b;

    /* renamed from: d, reason: collision with root package name */
    protected final JSONObject f6316d;

    /* renamed from: f, reason: collision with root package name */
    private final Map f6318f;

    /* renamed from: g, reason: collision with root package name */
    private final h5 f6319g;

    /* renamed from: h, reason: collision with root package name */
    protected final h5 f6320h;

    /* renamed from: i, reason: collision with root package name */
    private String f6321i;

    /* renamed from: j, reason: collision with root package name */
    private String f6322j;

    /* renamed from: c, reason: collision with root package name */
    private final Object f6315c = new Object();

    /* renamed from: e, reason: collision with root package name */
    protected final Object f6317e = new Object();

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
        this.f6313a = kVar;
        if (((Boolean) kVar.a(x4.C6)).booleanValue()) {
            this.f6319g = new h5(jSONObject2);
            this.f6320h = new h5(jSONObject);
            this.f6314b = null;
            this.f6316d = null;
        } else {
            this.f6314b = jSONObject2;
            this.f6316d = jSONObject;
            this.f6319g = null;
            this.f6320h = null;
        }
        this.f6318f = map;
    }

    private int j() {
        return a("mute_state", b("mute_state", ((Integer) this.f6313a.a(r3.f7456b8)).intValue()));
    }

    public JSONObject a() {
        JSONObject jSONObject;
        h5 h5Var = this.f6320h;
        if (h5Var != null) {
            return h5Var.a();
        }
        synchronized (this.f6317e) {
            jSONObject = this.f6316d;
        }
        return jSONObject;
    }

    public Boolean b(String str, Boolean bool) {
        Boolean bool2;
        h5 h5Var = this.f6319g;
        if (h5Var != null) {
            return h5Var.a(str, bool);
        }
        synchronized (this.f6315c) {
            bool2 = JsonUtils.getBoolean(this.f6314b, str, bool);
        }
        return bool2;
    }

    public boolean c(String str) {
        boolean zHas;
        h5 h5Var = this.f6320h;
        if (h5Var != null) {
            return h5Var.a(str);
        }
        synchronized (this.f6317e) {
            zHas = this.f6316d.has(str);
        }
        return zHas;
    }

    public boolean d(String str) {
        boolean zHas;
        h5 h5Var = this.f6319g;
        if (h5Var != null) {
            return h5Var.a(str);
        }
        synchronized (this.f6315c) {
            zHas = this.f6314b.has(str);
        }
        return zHas;
    }

    public Object e(String str) {
        Object objOpt;
        h5 h5Var = this.f6320h;
        if (h5Var != null) {
            return h5Var.b(str);
        }
        synchronized (this.f6317e) {
            objOpt = this.f6316d.opt(str);
        }
        return objOpt;
    }

    public Bundle f() {
        return BundleUtils.getBundle("custom_parameters", new Bundle(), l());
    }

    public JSONObject g() {
        JSONObject jSONObject;
        h5 h5Var = this.f6319g;
        if (h5Var != null) {
            return h5Var.a();
        }
        synchronized (this.f6315c) {
            jSONObject = this.f6314b;
        }
        return jSONObject;
    }

    public String getAdUnitId() {
        return b(AppLovinUtils.ServerParameterKeys.AD_UNIT_ID, "");
    }

    public String getPlacement() {
        return this.f6321i;
    }

    public Map i() {
        return this.f6318f;
    }

    public String k() {
        return c().split("_")[0];
    }

    public Bundle l() {
        Bundle bundle;
        if (e("server_parameters") instanceof JSONObject) {
            h5 h5Var = this.f6320h;
            bundle = h5Var != null ? (Bundle) h5Var.a(new l.a() { // from class: com.applovin.impl.kb
                @Override // l.a
                public final Object apply(Object obj) {
                    return k3.a((h5) obj);
                }
            }) : JsonUtils.toBundle(a("server_parameters", (JSONObject) null));
        } else {
            bundle = new Bundle();
        }
        int iJ = j();
        if (iJ != -1) {
            if (iJ == 2) {
                bundle.putBoolean("is_muted", this.f6313a.n0().isMuted());
            } else {
                bundle.putBoolean("is_muted", iJ == 0);
            }
        }
        if (!bundle.containsKey("amount")) {
            bundle.putLong("amount", b("amount", 0L));
        }
        if (!bundle.containsKey("currency")) {
            bundle.putString("currency", b("currency", ""));
        }
        return bundle;
    }

    public long m() {
        return a("adapter_timeout_ms", ((Long) this.f6313a.a(r3.f7489x7)).longValue());
    }

    public Boolean n() {
        String str = this.f6313a.n0().getExtraParameters().get("huc");
        return StringUtils.isValidString(str) ? Boolean.valueOf(str) : c("huc") ? a("huc", Boolean.FALSE) : b("huc", (Boolean) null);
    }

    public Boolean o() {
        String str = this.f6313a.n0().getExtraParameters().get("dns");
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
        this.f6322j = str;
    }

    public long h() {
        return a("init_completion_delay_ms", -1L);
    }

    public Boolean a(String str, Boolean bool) {
        Boolean bool2;
        h5 h5Var = this.f6320h;
        if (h5Var != null) {
            return h5Var.a(str, bool);
        }
        synchronized (this.f6317e) {
            bool2 = JsonUtils.getBoolean(this.f6316d, str, bool);
        }
        return bool2;
    }

    public int b(String str, int i10) {
        int i11;
        h5 h5Var = this.f6319g;
        if (h5Var != null) {
            return h5Var.a(str, i10);
        }
        synchronized (this.f6315c) {
            i11 = JsonUtils.getInt(this.f6314b, str, i10);
        }
        return i11;
    }

    public void c(String str, int i10) {
        h5 h5Var = this.f6320h;
        if (h5Var != null) {
            h5Var.b(str, i10);
            return;
        }
        synchronized (this.f6317e) {
            JsonUtils.putInt(this.f6316d, str, i10);
        }
    }

    public String d() {
        if (c("consent_string")) {
            return a("consent_string", (String) null);
        }
        if (d("consent_string")) {
            return b("consent_string", (String) null);
        }
        return this.f6313a.r0().j();
    }

    public String e() {
        return this.f6322j;
    }

    public void g(String str) {
        this.f6321i = str;
    }

    public float a(String str, float f10) {
        float f11;
        h5 h5Var = this.f6320h;
        if (h5Var != null) {
            return h5Var.a(str, f10);
        }
        synchronized (this.f6317e) {
            f11 = JsonUtils.getFloat(this.f6316d, str, f10);
        }
        return f11;
    }

    public JSONArray b(String str, JSONArray jSONArray) {
        JSONArray jSONArray2;
        h5 h5Var = this.f6319g;
        if (h5Var != null) {
            return h5Var.a(str, jSONArray);
        }
        synchronized (this.f6315c) {
            jSONArray2 = JsonUtils.getJSONArray(this.f6314b, str, jSONArray);
        }
        return jSONArray2;
    }

    public void c(String str, long j10) {
        h5 h5Var = this.f6320h;
        if (h5Var != null) {
            h5Var.b(str, j10);
            return;
        }
        synchronized (this.f6317e) {
            JsonUtils.putLong(this.f6316d, str, j10);
        }
    }

    public int a(String str, int i10) {
        int i11;
        h5 h5Var = this.f6320h;
        if (h5Var != null) {
            return h5Var.a(str, i10);
        }
        synchronized (this.f6317e) {
            i11 = JsonUtils.getInt(this.f6316d, str, i10);
        }
        return i11;
    }

    public long b(String str, long j10) {
        long j11;
        h5 h5Var = this.f6319g;
        if (h5Var != null) {
            return h5Var.a(str, j10);
        }
        synchronized (this.f6315c) {
            j11 = JsonUtils.getLong(this.f6314b, str, j10);
        }
        return j11;
    }

    public void c(String str, String str2) {
        h5 h5Var = this.f6320h;
        if (h5Var != null) {
            h5Var.b(str, str2);
            return;
        }
        synchronized (this.f6317e) {
            JsonUtils.putString(this.f6316d, str, str2);
        }
    }

    public JSONArray a(String str, JSONArray jSONArray) {
        JSONArray jSONArray2;
        h5 h5Var = this.f6320h;
        if (h5Var != null) {
            return h5Var.a(str, jSONArray);
        }
        synchronized (this.f6317e) {
            jSONArray2 = JsonUtils.getJSONArray(this.f6316d, str, jSONArray);
        }
        return jSONArray2;
    }

    public String b(String str, String str2) {
        String string;
        h5 h5Var = this.f6319g;
        if (h5Var != null) {
            return h5Var.a(str, str2);
        }
        synchronized (this.f6315c) {
            string = JsonUtils.getString(this.f6314b, str, str2);
        }
        return string;
    }

    public String c() {
        return a("name", (String) null);
    }

    public JSONObject a(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        h5 h5Var = this.f6320h;
        if (h5Var != null) {
            return h5Var.a(str, jSONObject);
        }
        synchronized (this.f6317e) {
            jSONObject2 = JsonUtils.getJSONObject(this.f6316d, str, jSONObject);
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
            h5 h5Var = this.f6319g;
            if (h5Var != null) {
                listOptList = h5Var.b(str, Collections.EMPTY_LIST);
            } else {
                listOptList = JsonUtils.optList(b(str, new JSONArray()), Collections.EMPTY_LIST);
            }
            h5 h5Var2 = this.f6320h;
            if (h5Var2 != null) {
                listOptList2 = h5Var2.b(str, Collections.EMPTY_LIST);
            } else {
                listOptList2 = JsonUtils.optList(a(str, new JSONArray()), Collections.EMPTY_LIST);
            }
            ArrayList arrayList = new ArrayList(listOptList.size() + listOptList2.size());
            arrayList.addAll(listOptList);
            arrayList.addAll(listOptList2);
            return arrayList;
        }
        throw new IllegalArgumentException("No key specified");
    }

    public long a(String str, long j10) {
        long j11;
        h5 h5Var = this.f6320h;
        if (h5Var != null) {
            return h5Var.a(str, j10);
        }
        synchronized (this.f6317e) {
            j11 = JsonUtils.getLong(this.f6316d, str, j10);
        }
        return j11;
    }

    public String a(String str, String str2) {
        String string;
        h5 h5Var = this.f6320h;
        if (h5Var != null) {
            return h5Var.a(str, str2);
        }
        synchronized (this.f6317e) {
            string = JsonUtils.getString(this.f6316d, str, str2);
        }
        return string;
    }

    public void a(String str, Object obj) {
        h5 h5Var = this.f6320h;
        if (h5Var != null) {
            h5Var.a(str, obj);
            return;
        }
        synchronized (this.f6317e) {
            JsonUtils.putObject(this.f6316d, str, obj);
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

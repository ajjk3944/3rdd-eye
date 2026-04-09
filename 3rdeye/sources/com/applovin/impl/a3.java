package com.applovin.impl;

import android.os.Bundle;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinEventParameters;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.singular.sdk.internal.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a3 {

    /* renamed from: a, reason: collision with root package name */
    protected final com.applovin.impl.sdk.k f18925a;

    /* renamed from: b, reason: collision with root package name */
    private final JSONObject f18926b;

    /* renamed from: d, reason: collision with root package name */
    protected final JSONObject f18928d;

    /* renamed from: f, reason: collision with root package name */
    private final Map f18930f;

    /* renamed from: g, reason: collision with root package name */
    private final v4 f18931g;

    /* renamed from: h, reason: collision with root package name */
    protected final v4 f18932h;
    private String i;

    /* renamed from: j, reason: collision with root package name */
    private String f18933j;

    /* renamed from: c, reason: collision with root package name */
    private final Object f18927c = new Object();

    /* renamed from: e, reason: collision with root package name */
    protected final Object f18929e = new Object();

    public a3(Map map, JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.k kVar) {
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        if (jSONObject2 == null) {
            throw new IllegalArgumentException("No full response specified");
        }
        if (jSONObject == null) {
            throw new IllegalArgumentException("No ad object specified");
        }
        this.f18925a = kVar;
        if (((Boolean) kVar.a(l4.f19872Y5)).booleanValue()) {
            this.f18931g = new v4(jSONObject2);
            this.f18932h = new v4(jSONObject);
            this.f18926b = null;
            this.f18928d = null;
        } else {
            this.f18926b = jSONObject2;
            this.f18928d = jSONObject;
            this.f18931g = null;
            this.f18932h = null;
        }
        this.f18930f = map;
    }

    private int j() {
        return a("mute_state", b("mute_state", ((Integer) this.f18925a.a(g3.f19424z7)).intValue()));
    }

    public JSONObject a() {
        JSONObject jSONObject;
        v4 v4Var = this.f18932h;
        if (v4Var != null) {
            return v4Var.a();
        }
        synchronized (this.f18929e) {
            jSONObject = this.f18928d;
        }
        return jSONObject;
    }

    public Boolean b(String str, Boolean bool) {
        Boolean bool2;
        v4 v4Var = this.f18931g;
        if (v4Var != null) {
            return v4Var.a(str, bool);
        }
        synchronized (this.f18927c) {
            bool2 = JsonUtils.getBoolean(this.f18926b, str, bool);
        }
        return bool2;
    }

    public boolean c(String str) {
        boolean zHas;
        v4 v4Var = this.f18932h;
        if (v4Var != null) {
            return v4Var.a(str);
        }
        synchronized (this.f18929e) {
            zHas = this.f18928d.has(str);
        }
        return zHas;
    }

    public boolean d(String str) {
        boolean zHas;
        v4 v4Var = this.f18931g;
        if (v4Var != null) {
            return v4Var.a(str);
        }
        synchronized (this.f18927c) {
            zHas = this.f18926b.has(str);
        }
        return zHas;
    }

    public Object e(String str) {
        Object objOpt;
        v4 v4Var = this.f18932h;
        if (v4Var != null) {
            return v4Var.b(str);
        }
        synchronized (this.f18929e) {
            objOpt = this.f18928d.opt(str);
        }
        return objOpt;
    }

    public Bundle f() {
        return BundleUtils.getBundle("custom_parameters", new Bundle(), l());
    }

    public JSONObject g() {
        JSONObject jSONObject;
        v4 v4Var = this.f18931g;
        if (v4Var != null) {
            return v4Var.a();
        }
        synchronized (this.f18927c) {
            jSONObject = this.f18926b;
        }
        return jSONObject;
    }

    public String getAdUnitId() {
        return b(Constants.ADMON_AD_UNIT_ID, "");
    }

    public String getPlacement() {
        return this.i;
    }

    public Map i() {
        return this.f18930f;
    }

    public String k() {
        return c().split("_")[0];
    }

    public Bundle l() {
        Bundle bundle;
        if (e("server_parameters") instanceof JSONObject) {
            v4 v4Var = this.f18932h;
            bundle = v4Var != null ? (Bundle) v4Var.a(new C.I(1)) : JsonUtils.toBundle(a("server_parameters", (JSONObject) null));
        } else {
            bundle = new Bundle();
        }
        int iJ = j();
        if (iJ != -1) {
            if (iJ == 2) {
                bundle.putBoolean("is_muted", this.f18925a.n0().isMuted());
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
        return a("adapter_timeout_ms", ((Long) this.f18925a.a(g3.U6)).longValue());
    }

    public Boolean n() {
        String str = this.f18925a.n0().getExtraParameters().get("huc");
        return StringUtils.isValidString(str) ? Boolean.valueOf(str) : c("huc") ? a("huc", Boolean.FALSE) : b("huc", (Boolean) null);
    }

    public Boolean o() {
        String str = this.f18925a.n0().getExtraParameters().get("dns");
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
        this.f18933j = str;
    }

    public long h() {
        return a("init_completion_delay_ms", -1L);
    }

    public Boolean a(String str, Boolean bool) {
        Boolean bool2;
        v4 v4Var = this.f18932h;
        if (v4Var != null) {
            return v4Var.a(str, bool);
        }
        synchronized (this.f18929e) {
            bool2 = JsonUtils.getBoolean(this.f18928d, str, bool);
        }
        return bool2;
    }

    public int b(String str, int i) {
        int i10;
        v4 v4Var = this.f18931g;
        if (v4Var != null) {
            return v4Var.a(str, i);
        }
        synchronized (this.f18927c) {
            i10 = JsonUtils.getInt(this.f18926b, str, i);
        }
        return i10;
    }

    public void c(String str, int i) {
        v4 v4Var = this.f18932h;
        if (v4Var != null) {
            v4Var.b(str, i);
            return;
        }
        synchronized (this.f18929e) {
            JsonUtils.putInt(this.f18928d, str, i);
        }
    }

    public String d() {
        if (c("consent_string")) {
            return a("consent_string", (String) null);
        }
        if (d("consent_string")) {
            return b("consent_string", (String) null);
        }
        return this.f18925a.r0().j();
    }

    public String e() {
        return this.f18933j;
    }

    public void g(String str) {
        this.i = str;
    }

    public float a(String str, float f10) {
        float f11;
        v4 v4Var = this.f18932h;
        if (v4Var != null) {
            return v4Var.a(str, f10);
        }
        synchronized (this.f18929e) {
            f11 = JsonUtils.getFloat(this.f18928d, str, f10);
        }
        return f11;
    }

    public JSONArray b(String str, JSONArray jSONArray) {
        JSONArray jSONArray2;
        v4 v4Var = this.f18931g;
        if (v4Var != null) {
            return v4Var.a(str, jSONArray);
        }
        synchronized (this.f18927c) {
            jSONArray2 = JsonUtils.getJSONArray(this.f18926b, str, jSONArray);
        }
        return jSONArray2;
    }

    public void c(String str, long j4) {
        v4 v4Var = this.f18932h;
        if (v4Var != null) {
            v4Var.b(str, j4);
            return;
        }
        synchronized (this.f18929e) {
            JsonUtils.putLong(this.f18928d, str, j4);
        }
    }

    public int a(String str, int i) {
        int i10;
        v4 v4Var = this.f18932h;
        if (v4Var != null) {
            return v4Var.a(str, i);
        }
        synchronized (this.f18929e) {
            i10 = JsonUtils.getInt(this.f18928d, str, i);
        }
        return i10;
    }

    public long b(String str, long j4) {
        long j10;
        v4 v4Var = this.f18931g;
        if (v4Var != null) {
            return v4Var.a(str, j4);
        }
        synchronized (this.f18927c) {
            j10 = JsonUtils.getLong(this.f18926b, str, j4);
        }
        return j10;
    }

    public void c(String str, String str2) {
        v4 v4Var = this.f18932h;
        if (v4Var != null) {
            v4Var.b(str, str2);
            return;
        }
        synchronized (this.f18929e) {
            JsonUtils.putString(this.f18928d, str, str2);
        }
    }

    public JSONArray a(String str, JSONArray jSONArray) {
        JSONArray jSONArray2;
        v4 v4Var = this.f18932h;
        if (v4Var != null) {
            return v4Var.a(str, jSONArray);
        }
        synchronized (this.f18929e) {
            jSONArray2 = JsonUtils.getJSONArray(this.f18928d, str, jSONArray);
        }
        return jSONArray2;
    }

    public String b(String str, String str2) {
        String string;
        v4 v4Var = this.f18931g;
        if (v4Var != null) {
            return v4Var.a(str, str2);
        }
        synchronized (this.f18927c) {
            string = JsonUtils.getString(this.f18926b, str, str2);
        }
        return string;
    }

    public String c() {
        return a(AppMeasurementSdk.ConditionalUserProperty.NAME, (String) null);
    }

    public JSONObject a(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        v4 v4Var = this.f18932h;
        if (v4Var != null) {
            return v4Var.a(str, jSONObject);
        }
        synchronized (this.f18929e) {
            jSONObject2 = JsonUtils.getJSONObject(this.f18928d, str, jSONObject);
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
            v4 v4Var = this.f18931g;
            if (v4Var != null) {
                listOptList = v4Var.b(str, Collections.EMPTY_LIST);
            } else {
                listOptList = JsonUtils.optList(b(str, new JSONArray()), Collections.EMPTY_LIST);
            }
            v4 v4Var2 = this.f18932h;
            if (v4Var2 != null) {
                listOptList2 = v4Var2.b(str, Collections.EMPTY_LIST);
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

    public long a(String str, long j4) {
        long j10;
        v4 v4Var = this.f18932h;
        if (v4Var != null) {
            return v4Var.a(str, j4);
        }
        synchronized (this.f18929e) {
            j10 = JsonUtils.getLong(this.f18928d, str, j4);
        }
        return j10;
    }

    public String a(String str, String str2) {
        String string;
        v4 v4Var = this.f18932h;
        if (v4Var != null) {
            return v4Var.a(str, str2);
        }
        synchronized (this.f18929e) {
            string = JsonUtils.getString(this.f18928d, str, str2);
        }
        return string;
    }

    public void a(String str, Object obj) {
        v4 v4Var = this.f18932h;
        if (v4Var != null) {
            v4Var.a(str, obj);
            return;
        }
        synchronized (this.f18929e) {
            JsonUtils.putObject(this.f18928d, str, obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Bundle a(v4 v4Var) {
        return JsonUtils.toBundle(v4Var.a("server_parameters", (JSONObject) null));
    }

    public String a(String str) {
        String strA = a(str, "");
        return StringUtils.isValidString(strA) ? strA : b(str, "");
    }
}

package com.applovin.impl.sdk.network;

import N7.C1154e9;
import com.applovin.impl.i4;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private String f21375a;

    /* renamed from: b, reason: collision with root package name */
    private String f21376b;

    /* renamed from: c, reason: collision with root package name */
    private String f21377c;

    /* renamed from: d, reason: collision with root package name */
    private String f21378d;

    /* renamed from: e, reason: collision with root package name */
    private Map f21379e;

    /* renamed from: f, reason: collision with root package name */
    private Map f21380f;

    /* renamed from: g, reason: collision with root package name */
    private Map f21381g;

    /* renamed from: h, reason: collision with root package name */
    private i4.a f21382h;
    private boolean i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f21383j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f21384k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f21385l;

    /* renamed from: m, reason: collision with root package name */
    private String f21386m;

    /* renamed from: n, reason: collision with root package name */
    private int f21387n;

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private String f21388a;

        /* renamed from: b, reason: collision with root package name */
        private String f21389b;

        /* renamed from: c, reason: collision with root package name */
        private String f21390c;

        /* renamed from: d, reason: collision with root package name */
        private String f21391d;

        /* renamed from: e, reason: collision with root package name */
        private Map f21392e;

        /* renamed from: f, reason: collision with root package name */
        private Map f21393f;

        /* renamed from: g, reason: collision with root package name */
        private Map f21394g;

        /* renamed from: h, reason: collision with root package name */
        private i4.a f21395h;
        private boolean i;

        /* renamed from: j, reason: collision with root package name */
        private boolean f21396j;

        /* renamed from: k, reason: collision with root package name */
        private boolean f21397k;

        /* renamed from: l, reason: collision with root package name */
        private boolean f21398l;

        public b a(String str) {
            this.f21391d = str;
            return this;
        }

        public b b(String str) {
            this.f21388a = str;
            return this;
        }

        public b c(String str) {
            this.f21389b = str;
            return this;
        }

        public b d(String str) {
            this.f21390c = str;
            return this;
        }

        public b a(Map map) {
            this.f21393f = map;
            return this;
        }

        public b b(Map map) {
            this.f21392e = map;
            return this;
        }

        public b c(Map map) {
            this.f21394g = map;
            return this;
        }

        public b d(boolean z10) {
            this.f21397k = z10;
            return this;
        }

        public b a(i4.a aVar) {
            this.f21395h = aVar;
            return this;
        }

        public b b(boolean z10) {
            this.f21398l = z10;
            return this;
        }

        public b c(boolean z10) {
            this.f21396j = z10;
            return this;
        }

        public b a(boolean z10) {
            this.i = z10;
            return this;
        }

        public d a() {
            return new d(this);
        }
    }

    public static b b() {
        return new b();
    }

    public void a() {
        Map map = CollectionUtils.map(this.f21379e);
        map.put("postback_ts", String.valueOf(System.currentTimeMillis()));
        this.f21379e = map;
    }

    public int c() {
        return this.f21387n;
    }

    public String d() {
        return this.f21378d;
    }

    public String e() {
        return this.f21386m;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f21375a.equals(((d) obj).f21375a);
    }

    public i4.a f() {
        return this.f21382h;
    }

    public Map g() {
        return this.f21380f;
    }

    public String h() {
        return this.f21376b;
    }

    public int hashCode() {
        return this.f21375a.hashCode();
    }

    public Map i() {
        return this.f21379e;
    }

    public Map j() {
        return this.f21381g;
    }

    public String k() {
        return this.f21377c;
    }

    public void l() {
        this.f21387n++;
    }

    public boolean m() {
        return this.f21384k;
    }

    public boolean n() {
        return this.i;
    }

    public boolean o() {
        return this.f21383j;
    }

    public boolean p() {
        return this.f21385l;
    }

    public JSONObject q() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("uniqueId", this.f21375a);
        jSONObject.put("communicatorRequestId", this.f21386m);
        jSONObject.put("httpMethod", this.f21376b);
        jSONObject.put("targetUrl", this.f21377c);
        jSONObject.put("backupUrl", this.f21378d);
        jSONObject.put("encodingType", this.f21382h);
        jSONObject.put("isEncodingEnabled", this.i);
        jSONObject.put("gzipBodyEncoding", this.f21383j);
        jSONObject.put("isAllowedPreInitEvent", this.f21384k);
        jSONObject.put("attemptNumber", this.f21387n);
        if (this.f21379e != null) {
            jSONObject.put("parameters", new JSONObject(this.f21379e));
        }
        if (this.f21380f != null) {
            jSONObject.put("httpHeaders", new JSONObject(this.f21380f));
        }
        if (this.f21381g != null) {
            jSONObject.put("requestBody", new JSONObject(this.f21381g));
        }
        return jSONObject;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PostbackRequest{uniqueId='");
        sb.append(this.f21375a);
        sb.append("', communicatorRequestId='");
        sb.append(this.f21386m);
        sb.append("', httpMethod='");
        sb.append(this.f21376b);
        sb.append("', targetUrl='");
        sb.append(this.f21377c);
        sb.append("', backupUrl='");
        sb.append(this.f21378d);
        sb.append("', attemptNumber=");
        sb.append(this.f21387n);
        sb.append(", isEncodingEnabled=");
        sb.append(this.i);
        sb.append(", isGzipBodyEncoding=");
        sb.append(this.f21383j);
        sb.append(", isAllowedPreInitEvent=");
        sb.append(this.f21384k);
        sb.append(", shouldFireInWebView=");
        return C1154e9.k(sb, this.f21385l, '}');
    }

    public d(JSONObject jSONObject, k kVar) throws JSONException {
        String string = JsonUtils.getString(jSONObject, "uniqueId", UUID.randomUUID().toString());
        String string2 = JsonUtils.getString(jSONObject, "communicatorRequestId", "");
        String string3 = JsonUtils.getString(jSONObject, "httpMethod", "");
        String string4 = jSONObject.getString("targetUrl");
        String string5 = JsonUtils.getString(jSONObject, "backupUrl", "");
        int i = jSONObject.getInt("attemptNumber");
        Map mapSynchronizedMap = JsonUtils.valueExists(jSONObject, "parameters") ? Collections.synchronizedMap(JsonUtils.toStringMap(jSONObject.getJSONObject("parameters"))) : new HashMap();
        Map mapSynchronizedMap2 = JsonUtils.valueExists(jSONObject, "httpHeaders") ? Collections.synchronizedMap(JsonUtils.toStringMap(jSONObject.getJSONObject("httpHeaders"))) : new HashMap();
        Map mapSynchronizedMap3 = JsonUtils.valueExists(jSONObject, "requestBody") ? Collections.synchronizedMap(JsonUtils.toStringObjectMap(jSONObject.getJSONObject("requestBody"))) : new HashMap();
        this.f21375a = string;
        this.f21376b = string3;
        this.f21386m = string2;
        this.f21377c = string4;
        this.f21378d = string5;
        this.f21379e = mapSynchronizedMap;
        this.f21380f = mapSynchronizedMap2;
        this.f21381g = mapSynchronizedMap3;
        this.f21382h = i4.a.a(jSONObject.optInt("encodingType", i4.a.DEFAULT.b()));
        this.i = jSONObject.optBoolean("isEncodingEnabled", false);
        this.f21383j = jSONObject.optBoolean("gzipBodyEncoding", false);
        this.f21384k = jSONObject.optBoolean("isAllowedPreInitEvent", false);
        this.f21385l = jSONObject.optBoolean("shouldFireInWebView", false);
        this.f21387n = i;
    }

    private d(b bVar) {
        this.f21375a = UUID.randomUUID().toString();
        this.f21376b = bVar.f21389b;
        this.f21377c = bVar.f21390c;
        this.f21378d = bVar.f21391d;
        this.f21379e = bVar.f21392e;
        this.f21380f = bVar.f21393f;
        this.f21381g = bVar.f21394g;
        this.f21382h = bVar.f21395h;
        this.i = bVar.i;
        this.f21383j = bVar.f21396j;
        this.f21384k = bVar.f21397k;
        this.f21385l = bVar.f21398l;
        this.f21386m = bVar.f21388a;
        this.f21387n = 0;
    }
}

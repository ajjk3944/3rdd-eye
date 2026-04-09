package com.applovin.impl.sdk.network;

import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.u4;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private String f8023a;

    /* renamed from: b, reason: collision with root package name */
    private String f8024b;

    /* renamed from: c, reason: collision with root package name */
    private String f8025c;

    /* renamed from: d, reason: collision with root package name */
    private String f8026d;

    /* renamed from: e, reason: collision with root package name */
    private Map f8027e;

    /* renamed from: f, reason: collision with root package name */
    private Map f8028f;

    /* renamed from: g, reason: collision with root package name */
    private Map f8029g;

    /* renamed from: h, reason: collision with root package name */
    private u4.a f8030h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f8031i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f8032j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f8033k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f8034l;

    /* renamed from: m, reason: collision with root package name */
    private String f8035m;

    /* renamed from: n, reason: collision with root package name */
    private int f8036n;

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private String f8037a;

        /* renamed from: b, reason: collision with root package name */
        private String f8038b;

        /* renamed from: c, reason: collision with root package name */
        private String f8039c;

        /* renamed from: d, reason: collision with root package name */
        private String f8040d;

        /* renamed from: e, reason: collision with root package name */
        private Map f8041e;

        /* renamed from: f, reason: collision with root package name */
        private Map f8042f;

        /* renamed from: g, reason: collision with root package name */
        private Map f8043g;

        /* renamed from: h, reason: collision with root package name */
        private u4.a f8044h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f8045i;

        /* renamed from: j, reason: collision with root package name */
        private boolean f8046j;

        /* renamed from: k, reason: collision with root package name */
        private boolean f8047k;

        /* renamed from: l, reason: collision with root package name */
        private boolean f8048l;

        public b a(String str) {
            this.f8040d = str;
            return this;
        }

        public b b(String str) {
            this.f8037a = str;
            return this;
        }

        public b c(String str) {
            this.f8038b = str;
            return this;
        }

        public b d(String str) {
            this.f8039c = str;
            return this;
        }

        public b a(Map map) {
            this.f8042f = map;
            return this;
        }

        public b b(Map map) {
            this.f8041e = map;
            return this;
        }

        public b c(Map map) {
            this.f8043g = map;
            return this;
        }

        public b d(boolean z10) {
            this.f8047k = z10;
            return this;
        }

        public b a(u4.a aVar) {
            this.f8044h = aVar;
            return this;
        }

        public b b(boolean z10) {
            this.f8048l = z10;
            return this;
        }

        public b c(boolean z10) {
            this.f8046j = z10;
            return this;
        }

        public b a(boolean z10) {
            this.f8045i = z10;
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
        Map map = CollectionUtils.map(this.f8027e);
        map.put("postback_ts", String.valueOf(System.currentTimeMillis()));
        this.f8027e = map;
    }

    public int c() {
        return this.f8036n;
    }

    public String d() {
        return this.f8026d;
    }

    public String e() {
        return this.f8035m;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f8023a.equals(((d) obj).f8023a);
    }

    public u4.a f() {
        return this.f8030h;
    }

    public Map g() {
        return this.f8028f;
    }

    public String h() {
        return this.f8024b;
    }

    public int hashCode() {
        return this.f8023a.hashCode();
    }

    public Map i() {
        return this.f8027e;
    }

    public Map j() {
        return this.f8029g;
    }

    public String k() {
        return this.f8025c;
    }

    public void l() {
        this.f8036n++;
    }

    public boolean m() {
        return this.f8033k;
    }

    public boolean n() {
        return this.f8031i;
    }

    public boolean o() {
        return this.f8032j;
    }

    public boolean p() {
        return this.f8034l;
    }

    public JSONObject q() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("uniqueId", this.f8023a);
        jSONObject.put("communicatorRequestId", this.f8035m);
        jSONObject.put("httpMethod", this.f8024b);
        jSONObject.put("targetUrl", this.f8025c);
        jSONObject.put("backupUrl", this.f8026d);
        jSONObject.put("encodingType", this.f8030h);
        jSONObject.put("isEncodingEnabled", this.f8031i);
        jSONObject.put("gzipBodyEncoding", this.f8032j);
        jSONObject.put("isAllowedPreInitEvent", this.f8033k);
        jSONObject.put("attemptNumber", this.f8036n);
        if (this.f8027e != null) {
            jSONObject.put("parameters", new JSONObject(this.f8027e));
        }
        if (this.f8028f != null) {
            jSONObject.put("httpHeaders", new JSONObject(this.f8028f));
        }
        if (this.f8029g != null) {
            jSONObject.put("requestBody", new JSONObject(this.f8029g));
        }
        return jSONObject;
    }

    public String toString() {
        return "PostbackRequest{uniqueId='" + this.f8023a + "', communicatorRequestId='" + this.f8035m + "', httpMethod='" + this.f8024b + "', targetUrl='" + this.f8025c + "', backupUrl='" + this.f8026d + "', attemptNumber=" + this.f8036n + ", isEncodingEnabled=" + this.f8031i + ", isGzipBodyEncoding=" + this.f8032j + ", isAllowedPreInitEvent=" + this.f8033k + ", shouldFireInWebView=" + this.f8034l + '}';
    }

    public d(JSONObject jSONObject, k kVar) throws JSONException {
        String string = JsonUtils.getString(jSONObject, "uniqueId", UUID.randomUUID().toString());
        String string2 = JsonUtils.getString(jSONObject, "communicatorRequestId", "");
        String string3 = JsonUtils.getString(jSONObject, "httpMethod", "");
        String string4 = jSONObject.getString("targetUrl");
        String string5 = JsonUtils.getString(jSONObject, "backupUrl", "");
        int i10 = jSONObject.getInt("attemptNumber");
        Map mapSynchronizedMap = JsonUtils.valueExists(jSONObject, "parameters") ? Collections.synchronizedMap(JsonUtils.toStringMap(jSONObject.getJSONObject("parameters"))) : new HashMap();
        Map mapSynchronizedMap2 = JsonUtils.valueExists(jSONObject, "httpHeaders") ? Collections.synchronizedMap(JsonUtils.toStringMap(jSONObject.getJSONObject("httpHeaders"))) : new HashMap();
        Map mapSynchronizedMap3 = JsonUtils.valueExists(jSONObject, "requestBody") ? Collections.synchronizedMap(JsonUtils.toStringObjectMap(jSONObject.getJSONObject("requestBody"))) : new HashMap();
        this.f8023a = string;
        this.f8024b = string3;
        this.f8035m = string2;
        this.f8025c = string4;
        this.f8026d = string5;
        this.f8027e = mapSynchronizedMap;
        this.f8028f = mapSynchronizedMap2;
        this.f8029g = mapSynchronizedMap3;
        this.f8030h = u4.a.a(jSONObject.optInt("encodingType", u4.a.DEFAULT.b()));
        this.f8031i = jSONObject.optBoolean("isEncodingEnabled", false);
        this.f8032j = jSONObject.optBoolean("gzipBodyEncoding", false);
        this.f8033k = jSONObject.optBoolean("isAllowedPreInitEvent", false);
        this.f8034l = jSONObject.optBoolean("shouldFireInWebView", false);
        this.f8036n = i10;
    }

    private d(b bVar) {
        this.f8023a = UUID.randomUUID().toString();
        this.f8024b = bVar.f8038b;
        this.f8025c = bVar.f8039c;
        this.f8026d = bVar.f8040d;
        this.f8027e = bVar.f8041e;
        this.f8028f = bVar.f8042f;
        this.f8029g = bVar.f8043g;
        this.f8030h = bVar.f8044h;
        this.f8031i = bVar.f8045i;
        this.f8032j = bVar.f8046j;
        this.f8033k = bVar.f8047k;
        this.f8034l = bVar.f8048l;
        this.f8035m = bVar.f8037a;
        this.f8036n = 0;
    }
}

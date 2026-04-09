package com.applovin.impl.sdk.network;

import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.u4;
import d.h;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private String f5687a;

    /* renamed from: b, reason: collision with root package name */
    private String f5688b;

    /* renamed from: c, reason: collision with root package name */
    private String f5689c;

    /* renamed from: d, reason: collision with root package name */
    private String f5690d;

    /* renamed from: e, reason: collision with root package name */
    private Map f5691e;

    /* renamed from: f, reason: collision with root package name */
    private Map f5692f;
    private Map g;

    /* renamed from: h, reason: collision with root package name */
    private u4.a f5693h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f5694i;
    private boolean j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f5695k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f5696l;

    /* renamed from: m, reason: collision with root package name */
    private String f5697m;

    /* renamed from: n, reason: collision with root package name */
    private int f5698n;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private String f5699a;

        /* renamed from: b, reason: collision with root package name */
        private String f5700b;

        /* renamed from: c, reason: collision with root package name */
        private String f5701c;

        /* renamed from: d, reason: collision with root package name */
        private String f5702d;

        /* renamed from: e, reason: collision with root package name */
        private Map f5703e;

        /* renamed from: f, reason: collision with root package name */
        private Map f5704f;
        private Map g;

        /* renamed from: h, reason: collision with root package name */
        private u4.a f5705h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f5706i;
        private boolean j;

        /* renamed from: k, reason: collision with root package name */
        private boolean f5707k;

        /* renamed from: l, reason: collision with root package name */
        private boolean f5708l;

        public b a(String str) {
            this.f5702d = str;
            return this;
        }

        public b b(String str) {
            this.f5699a = str;
            return this;
        }

        public b c(String str) {
            this.f5700b = str;
            return this;
        }

        public b d(String str) {
            this.f5701c = str;
            return this;
        }

        public b a(Map map) {
            this.f5704f = map;
            return this;
        }

        public b b(Map map) {
            this.f5703e = map;
            return this;
        }

        public b c(Map map) {
            this.g = map;
            return this;
        }

        public b d(boolean z3) {
            this.f5707k = z3;
            return this;
        }

        public b a(u4.a aVar) {
            this.f5705h = aVar;
            return this;
        }

        public b b(boolean z3) {
            this.f5708l = z3;
            return this;
        }

        public b c(boolean z3) {
            this.j = z3;
            return this;
        }

        public b a(boolean z3) {
            this.f5706i = z3;
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
        Map map = CollectionUtils.map(this.f5691e);
        map.put("postback_ts", String.valueOf(System.currentTimeMillis()));
        this.f5691e = map;
    }

    public int c() {
        return this.f5698n;
    }

    public String d() {
        return this.f5690d;
    }

    public String e() {
        return this.f5697m;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f5687a.equals(((d) obj).f5687a);
    }

    public u4.a f() {
        return this.f5693h;
    }

    public Map g() {
        return this.f5692f;
    }

    public String h() {
        return this.f5688b;
    }

    public int hashCode() {
        return this.f5687a.hashCode();
    }

    public Map i() {
        return this.f5691e;
    }

    public Map j() {
        return this.g;
    }

    public String k() {
        return this.f5689c;
    }

    public void l() {
        this.f5698n++;
    }

    public boolean m() {
        return this.f5695k;
    }

    public boolean n() {
        return this.f5694i;
    }

    public boolean o() {
        return this.j;
    }

    public boolean p() {
        return this.f5696l;
    }

    public JSONObject q() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("uniqueId", this.f5687a);
        jSONObject.put("communicatorRequestId", this.f5697m);
        jSONObject.put("httpMethod", this.f5688b);
        jSONObject.put("targetUrl", this.f5689c);
        jSONObject.put("backupUrl", this.f5690d);
        jSONObject.put("encodingType", this.f5693h);
        jSONObject.put("isEncodingEnabled", this.f5694i);
        jSONObject.put("gzipBodyEncoding", this.j);
        jSONObject.put("isAllowedPreInitEvent", this.f5695k);
        jSONObject.put("attemptNumber", this.f5698n);
        if (this.f5691e != null) {
            jSONObject.put("parameters", new JSONObject(this.f5691e));
        }
        if (this.f5692f != null) {
            jSONObject.put("httpHeaders", new JSONObject(this.f5692f));
        }
        if (this.g != null) {
            jSONObject.put("requestBody", new JSONObject(this.g));
        }
        return jSONObject;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("PostbackRequest{uniqueId='");
        sb2.append(this.f5687a);
        sb2.append("', communicatorRequestId='");
        sb2.append(this.f5697m);
        sb2.append("', httpMethod='");
        sb2.append(this.f5688b);
        sb2.append("', targetUrl='");
        sb2.append(this.f5689c);
        sb2.append("', backupUrl='");
        sb2.append(this.f5690d);
        sb2.append("', attemptNumber=");
        sb2.append(this.f5698n);
        sb2.append(", isEncodingEnabled=");
        sb2.append(this.f5694i);
        sb2.append(", isGzipBodyEncoding=");
        sb2.append(this.j);
        sb2.append(", isAllowedPreInitEvent=");
        sb2.append(this.f5695k);
        sb2.append(", shouldFireInWebView=");
        return h.x(sb2, this.f5696l, '}');
    }

    public d(JSONObject jSONObject, k kVar) throws JSONException {
        String string = JsonUtils.getString(jSONObject, "uniqueId", UUID.randomUUID().toString());
        String string2 = JsonUtils.getString(jSONObject, "communicatorRequestId", "");
        String string3 = JsonUtils.getString(jSONObject, "httpMethod", "");
        String string4 = jSONObject.getString("targetUrl");
        String string5 = JsonUtils.getString(jSONObject, "backupUrl", "");
        int i4 = jSONObject.getInt("attemptNumber");
        Map mapSynchronizedMap = JsonUtils.valueExists(jSONObject, "parameters") ? DesugarCollections.synchronizedMap(JsonUtils.toStringMap(jSONObject.getJSONObject("parameters"))) : new HashMap();
        Map mapSynchronizedMap2 = JsonUtils.valueExists(jSONObject, "httpHeaders") ? DesugarCollections.synchronizedMap(JsonUtils.toStringMap(jSONObject.getJSONObject("httpHeaders"))) : new HashMap();
        Map mapSynchronizedMap3 = JsonUtils.valueExists(jSONObject, "requestBody") ? DesugarCollections.synchronizedMap(JsonUtils.toStringObjectMap(jSONObject.getJSONObject("requestBody"))) : new HashMap();
        this.f5687a = string;
        this.f5688b = string3;
        this.f5697m = string2;
        this.f5689c = string4;
        this.f5690d = string5;
        this.f5691e = mapSynchronizedMap;
        this.f5692f = mapSynchronizedMap2;
        this.g = mapSynchronizedMap3;
        this.f5693h = u4.a.a(jSONObject.optInt("encodingType", u4.a.DEFAULT.b()));
        this.f5694i = jSONObject.optBoolean("isEncodingEnabled", false);
        this.j = jSONObject.optBoolean("gzipBodyEncoding", false);
        this.f5695k = jSONObject.optBoolean("isAllowedPreInitEvent", false);
        this.f5696l = jSONObject.optBoolean("shouldFireInWebView", false);
        this.f5698n = i4;
    }

    private d(b bVar) {
        this.f5687a = UUID.randomUUID().toString();
        this.f5688b = bVar.f5700b;
        this.f5689c = bVar.f5701c;
        this.f5690d = bVar.f5702d;
        this.f5691e = bVar.f5703e;
        this.f5692f = bVar.f5704f;
        this.g = bVar.g;
        this.f5693h = bVar.f5705h;
        this.f5694i = bVar.f5706i;
        this.j = bVar.j;
        this.f5695k = bVar.f5707k;
        this.f5696l = bVar.f5708l;
        this.f5697m = bVar.f5699a;
        this.f5698n = 0;
    }
}

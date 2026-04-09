package com.applovin.impl.sdk.network;

import com.applovin.impl.sdk.k;
import com.applovin.impl.u4;
import com.applovin.impl.x4;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private String f7973a;

    /* renamed from: b, reason: collision with root package name */
    private String f7974b;

    /* renamed from: c, reason: collision with root package name */
    private Map f7975c;

    /* renamed from: d, reason: collision with root package name */
    private Map f7976d;

    /* renamed from: e, reason: collision with root package name */
    private final JSONObject f7977e;

    /* renamed from: f, reason: collision with root package name */
    private String f7978f;

    /* renamed from: g, reason: collision with root package name */
    private final Object f7979g;

    /* renamed from: h, reason: collision with root package name */
    private final int f7980h;

    /* renamed from: i, reason: collision with root package name */
    private int f7981i;

    /* renamed from: j, reason: collision with root package name */
    private final int f7982j;

    /* renamed from: k, reason: collision with root package name */
    private final int f7983k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f7984l;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f7985m;

    /* renamed from: n, reason: collision with root package name */
    private final boolean f7986n;

    /* renamed from: o, reason: collision with root package name */
    private final boolean f7987o;

    /* renamed from: p, reason: collision with root package name */
    private final u4.a f7988p;

    /* renamed from: q, reason: collision with root package name */
    private final boolean f7989q;

    /* renamed from: r, reason: collision with root package name */
    private final boolean f7990r;

    /* renamed from: com.applovin.impl.sdk.network.a$a, reason: collision with other inner class name */
    public static class C0086a {

        /* renamed from: a, reason: collision with root package name */
        String f7991a;

        /* renamed from: b, reason: collision with root package name */
        String f7992b;

        /* renamed from: c, reason: collision with root package name */
        String f7993c;

        /* renamed from: e, reason: collision with root package name */
        Map f7995e;

        /* renamed from: f, reason: collision with root package name */
        JSONObject f7996f;

        /* renamed from: g, reason: collision with root package name */
        Object f7997g;

        /* renamed from: i, reason: collision with root package name */
        int f7999i;

        /* renamed from: j, reason: collision with root package name */
        int f8000j;

        /* renamed from: k, reason: collision with root package name */
        boolean f8001k;

        /* renamed from: m, reason: collision with root package name */
        boolean f8003m;

        /* renamed from: n, reason: collision with root package name */
        boolean f8004n;

        /* renamed from: o, reason: collision with root package name */
        boolean f8005o;

        /* renamed from: p, reason: collision with root package name */
        boolean f8006p;

        /* renamed from: q, reason: collision with root package name */
        u4.a f8007q;

        /* renamed from: h, reason: collision with root package name */
        int f7998h = 1;

        /* renamed from: l, reason: collision with root package name */
        boolean f8002l = true;

        /* renamed from: d, reason: collision with root package name */
        Map f7994d = new HashMap();

        public C0086a(k kVar) {
            this.f7999i = ((Integer) kVar.a(x4.T2)).intValue();
            this.f8000j = ((Integer) kVar.a(x4.S2)).intValue();
            this.f8003m = ((Boolean) kVar.a(x4.f8550p3)).booleanValue();
            this.f8004n = ((Boolean) kVar.a(x4.f8510k5)).booleanValue();
            this.f8007q = u4.a.a(((Integer) kVar.a(x4.f8519l5)).intValue());
            this.f8006p = ((Boolean) kVar.a(x4.K5)).booleanValue();
        }

        public C0086a a(Map map) {
            this.f7995e = map;
            return this;
        }

        public C0086a b(String str) {
            this.f7992b = str;
            return this;
        }

        public C0086a c(String str) {
            this.f7991a = str;
            return this;
        }

        public C0086a d(boolean z10) {
            this.f8002l = z10;
            return this;
        }

        public C0086a e(boolean z10) {
            this.f8003m = z10;
            return this;
        }

        public C0086a f(boolean z10) {
            this.f8005o = z10;
            return this;
        }

        public C0086a a(JSONObject jSONObject) {
            this.f7996f = jSONObject;
            return this;
        }

        public C0086a b(Map map) {
            this.f7994d = map;
            return this;
        }

        public C0086a c(int i10) {
            this.f7999i = i10;
            return this;
        }

        public C0086a a(String str) {
            this.f7993c = str;
            return this;
        }

        public C0086a b(int i10) {
            this.f8000j = i10;
            return this;
        }

        public C0086a c(boolean z10) {
            this.f8001k = z10;
            return this;
        }

        public C0086a a(Object obj) {
            this.f7997g = obj;
            return this;
        }

        public C0086a b(boolean z10) {
            this.f8006p = z10;
            return this;
        }

        public C0086a a(int i10) {
            this.f7998h = i10;
            return this;
        }

        public C0086a a(boolean z10) {
            this.f8004n = z10;
            return this;
        }

        public C0086a a(u4.a aVar) {
            this.f8007q = aVar;
            return this;
        }

        public a a() {
            return new a(this);
        }
    }

    public a(C0086a c0086a) {
        this.f7973a = c0086a.f7992b;
        this.f7974b = c0086a.f7991a;
        this.f7975c = c0086a.f7994d;
        this.f7976d = c0086a.f7995e;
        this.f7977e = c0086a.f7996f;
        this.f7978f = c0086a.f7993c;
        this.f7979g = c0086a.f7997g;
        int i10 = c0086a.f7998h;
        this.f7980h = i10;
        this.f7981i = i10;
        this.f7982j = c0086a.f7999i;
        this.f7983k = c0086a.f8000j;
        this.f7984l = c0086a.f8001k;
        this.f7985m = c0086a.f8002l;
        this.f7986n = c0086a.f8003m;
        this.f7987o = c0086a.f8004n;
        this.f7988p = c0086a.f8007q;
        this.f7989q = c0086a.f8005o;
        this.f7990r = c0086a.f8006p;
    }

    public void a(String str) {
        this.f7973a = str;
    }

    public void b(String str) {
        this.f7974b = str;
    }

    public int c() {
        return this.f7980h - this.f7981i;
    }

    public Object d() {
        return this.f7979g;
    }

    public u4.a e() {
        return this.f7988p;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        String str = this.f7973a;
        if (str == null ? aVar.f7973a != null : !str.equals(aVar.f7973a)) {
            return false;
        }
        Map map = this.f7975c;
        if (map == null ? aVar.f7975c != null : !map.equals(aVar.f7975c)) {
            return false;
        }
        Map map2 = this.f7976d;
        if (map2 == null ? aVar.f7976d != null : !map2.equals(aVar.f7976d)) {
            return false;
        }
        String str2 = this.f7978f;
        if (str2 == null ? aVar.f7978f != null : !str2.equals(aVar.f7978f)) {
            return false;
        }
        String str3 = this.f7974b;
        if (str3 == null ? aVar.f7974b != null : !str3.equals(aVar.f7974b)) {
            return false;
        }
        JSONObject jSONObject = this.f7977e;
        if (jSONObject == null ? aVar.f7977e != null : !jSONObject.equals(aVar.f7977e)) {
            return false;
        }
        Object obj2 = this.f7979g;
        if (obj2 == null ? aVar.f7979g == null : obj2.equals(aVar.f7979g)) {
            return this.f7980h == aVar.f7980h && this.f7981i == aVar.f7981i && this.f7982j == aVar.f7982j && this.f7983k == aVar.f7983k && this.f7984l == aVar.f7984l && this.f7985m == aVar.f7985m && this.f7986n == aVar.f7986n && this.f7987o == aVar.f7987o && this.f7988p == aVar.f7988p && this.f7989q == aVar.f7989q && this.f7990r == aVar.f7990r;
        }
        return false;
    }

    public String f() {
        return this.f7973a;
    }

    public Map g() {
        return this.f7976d;
    }

    public String h() {
        return this.f7974b;
    }

    public int hashCode() {
        int iHashCode = super.hashCode() * 31;
        String str = this.f7973a;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f7978f;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f7974b;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Object obj = this.f7979g;
        int iHashCode5 = ((((((((((((((((((((((iHashCode4 + (obj != null ? obj.hashCode() : 0)) * 31) + this.f7980h) * 31) + this.f7981i) * 31) + this.f7982j) * 31) + this.f7983k) * 31) + (this.f7984l ? 1 : 0)) * 31) + (this.f7985m ? 1 : 0)) * 31) + (this.f7986n ? 1 : 0)) * 31) + (this.f7987o ? 1 : 0)) * 31) + this.f7988p.b()) * 31) + (this.f7989q ? 1 : 0)) * 31) + (this.f7990r ? 1 : 0);
        Map map = this.f7975c;
        if (map != null) {
            iHashCode5 = (iHashCode5 * 31) + map.hashCode();
        }
        Map map2 = this.f7976d;
        if (map2 != null) {
            iHashCode5 = (iHashCode5 * 31) + map2.hashCode();
        }
        JSONObject jSONObject = this.f7977e;
        if (jSONObject == null) {
            return iHashCode5;
        }
        char[] charArray = jSONObject.toString().toCharArray();
        Arrays.sort(charArray);
        return (iHashCode5 * 31) + new String(charArray).hashCode();
    }

    public Map i() {
        return this.f7975c;
    }

    public int j() {
        return this.f7981i;
    }

    public int k() {
        return this.f7983k;
    }

    public int l() {
        return this.f7982j;
    }

    public boolean m() {
        return this.f7987o;
    }

    public boolean n() {
        return this.f7984l;
    }

    public boolean o() {
        return this.f7990r;
    }

    public boolean p() {
        return this.f7985m;
    }

    public boolean q() {
        return this.f7986n;
    }

    public boolean r() {
        return this.f7989q;
    }

    public String toString() {
        return "HttpRequest {endpoint=" + this.f7973a + ", backupEndpoint=" + this.f7978f + ", httpMethod=" + this.f7974b + ", httpHeaders=" + this.f7976d + ", body=" + this.f7977e + ", emptyResponse=" + this.f7979g + ", initialRetryAttempts=" + this.f7980h + ", retryAttemptsLeft=" + this.f7981i + ", timeoutMillis=" + this.f7982j + ", retryDelayMillis=" + this.f7983k + ", exponentialRetries=" + this.f7984l + ", retryOnAllErrors=" + this.f7985m + ", retryOnNoConnection=" + this.f7986n + ", encodingEnabled=" + this.f7987o + ", encodingType=" + this.f7988p + ", trackConnectionSpeed=" + this.f7989q + ", gzipBodyEncoding=" + this.f7990r + '}';
    }

    public String a() {
        return this.f7978f;
    }

    public JSONObject b() {
        return this.f7977e;
    }

    public void a(int i10) {
        this.f7981i = i10;
    }

    public static C0086a a(k kVar) {
        return new C0086a(kVar);
    }
}

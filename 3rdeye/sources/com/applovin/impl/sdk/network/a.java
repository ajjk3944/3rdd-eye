package com.applovin.impl.sdk.network;

import N7.C1154e9;
import com.applovin.impl.i4;
import com.applovin.impl.l4;
import com.applovin.impl.sdk.k;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private String f21328a;

    /* renamed from: b, reason: collision with root package name */
    private String f21329b;

    /* renamed from: c, reason: collision with root package name */
    private Map f21330c;

    /* renamed from: d, reason: collision with root package name */
    private Map f21331d;

    /* renamed from: e, reason: collision with root package name */
    private final JSONObject f21332e;

    /* renamed from: f, reason: collision with root package name */
    private String f21333f;

    /* renamed from: g, reason: collision with root package name */
    private final Object f21334g;

    /* renamed from: h, reason: collision with root package name */
    private final int f21335h;
    private int i;

    /* renamed from: j, reason: collision with root package name */
    private final int f21336j;

    /* renamed from: k, reason: collision with root package name */
    private final int f21337k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f21338l;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f21339m;

    /* renamed from: n, reason: collision with root package name */
    private final boolean f21340n;

    /* renamed from: o, reason: collision with root package name */
    private final boolean f21341o;

    /* renamed from: p, reason: collision with root package name */
    private final i4.a f21342p;

    /* renamed from: q, reason: collision with root package name */
    private final boolean f21343q;

    /* renamed from: r, reason: collision with root package name */
    private final boolean f21344r;

    /* renamed from: com.applovin.impl.sdk.network.a$a, reason: collision with other inner class name */
    public static class C0320a {

        /* renamed from: a, reason: collision with root package name */
        String f21345a;

        /* renamed from: b, reason: collision with root package name */
        String f21346b;

        /* renamed from: c, reason: collision with root package name */
        String f21347c;

        /* renamed from: e, reason: collision with root package name */
        Map f21349e;

        /* renamed from: f, reason: collision with root package name */
        JSONObject f21350f;

        /* renamed from: g, reason: collision with root package name */
        Object f21351g;
        int i;

        /* renamed from: j, reason: collision with root package name */
        int f21353j;

        /* renamed from: k, reason: collision with root package name */
        boolean f21354k;

        /* renamed from: m, reason: collision with root package name */
        boolean f21356m;

        /* renamed from: n, reason: collision with root package name */
        boolean f21357n;

        /* renamed from: o, reason: collision with root package name */
        boolean f21358o;

        /* renamed from: p, reason: collision with root package name */
        boolean f21359p;

        /* renamed from: q, reason: collision with root package name */
        i4.a f21360q;

        /* renamed from: h, reason: collision with root package name */
        int f21352h = 1;

        /* renamed from: l, reason: collision with root package name */
        boolean f21355l = true;

        /* renamed from: d, reason: collision with root package name */
        Map f21348d = new HashMap();

        public C0320a(k kVar) {
            this.i = ((Integer) kVar.a(l4.f19781L2)).intValue();
            this.f21353j = ((Integer) kVar.a(l4.f19774K2)).intValue();
            this.f21356m = ((Boolean) kVar.a(l4.f19937h3)).booleanValue();
            this.f21357n = ((Boolean) kVar.a(l4.f19783L4)).booleanValue();
            this.f21360q = i4.a.a(((Integer) kVar.a(l4.f19790M4)).intValue());
            this.f21359p = ((Boolean) kVar.a(l4.f19961k5)).booleanValue();
        }

        public C0320a a(Map map) {
            this.f21349e = map;
            return this;
        }

        public C0320a b(String str) {
            this.f21346b = str;
            return this;
        }

        public C0320a c(String str) {
            this.f21345a = str;
            return this;
        }

        public C0320a d(boolean z10) {
            this.f21355l = z10;
            return this;
        }

        public C0320a e(boolean z10) {
            this.f21356m = z10;
            return this;
        }

        public C0320a f(boolean z10) {
            this.f21358o = z10;
            return this;
        }

        public C0320a a(JSONObject jSONObject) {
            this.f21350f = jSONObject;
            return this;
        }

        public C0320a b(Map map) {
            this.f21348d = map;
            return this;
        }

        public C0320a c(int i) {
            this.i = i;
            return this;
        }

        public C0320a a(String str) {
            this.f21347c = str;
            return this;
        }

        public C0320a b(int i) {
            this.f21353j = i;
            return this;
        }

        public C0320a c(boolean z10) {
            this.f21354k = z10;
            return this;
        }

        public C0320a a(Object obj) {
            this.f21351g = obj;
            return this;
        }

        public C0320a b(boolean z10) {
            this.f21359p = z10;
            return this;
        }

        public C0320a a(int i) {
            this.f21352h = i;
            return this;
        }

        public C0320a a(boolean z10) {
            this.f21357n = z10;
            return this;
        }

        public C0320a a(i4.a aVar) {
            this.f21360q = aVar;
            return this;
        }

        public a a() {
            return new a(this);
        }
    }

    public a(C0320a c0320a) {
        this.f21328a = c0320a.f21346b;
        this.f21329b = c0320a.f21345a;
        this.f21330c = c0320a.f21348d;
        this.f21331d = c0320a.f21349e;
        this.f21332e = c0320a.f21350f;
        this.f21333f = c0320a.f21347c;
        this.f21334g = c0320a.f21351g;
        int i = c0320a.f21352h;
        this.f21335h = i;
        this.i = i;
        this.f21336j = c0320a.i;
        this.f21337k = c0320a.f21353j;
        this.f21338l = c0320a.f21354k;
        this.f21339m = c0320a.f21355l;
        this.f21340n = c0320a.f21356m;
        this.f21341o = c0320a.f21357n;
        this.f21342p = c0320a.f21360q;
        this.f21343q = c0320a.f21358o;
        this.f21344r = c0320a.f21359p;
    }

    public void a(String str) {
        this.f21328a = str;
    }

    public void b(String str) {
        this.f21329b = str;
    }

    public int c() {
        return this.f21335h - this.i;
    }

    public Object d() {
        return this.f21334g;
    }

    public i4.a e() {
        return this.f21342p;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        String str = this.f21328a;
        if (str == null ? aVar.f21328a != null : !str.equals(aVar.f21328a)) {
            return false;
        }
        Map map = this.f21330c;
        if (map == null ? aVar.f21330c != null : !map.equals(aVar.f21330c)) {
            return false;
        }
        Map map2 = this.f21331d;
        if (map2 == null ? aVar.f21331d != null : !map2.equals(aVar.f21331d)) {
            return false;
        }
        String str2 = this.f21333f;
        if (str2 == null ? aVar.f21333f != null : !str2.equals(aVar.f21333f)) {
            return false;
        }
        String str3 = this.f21329b;
        if (str3 == null ? aVar.f21329b != null : !str3.equals(aVar.f21329b)) {
            return false;
        }
        JSONObject jSONObject = this.f21332e;
        if (jSONObject == null ? aVar.f21332e != null : !jSONObject.equals(aVar.f21332e)) {
            return false;
        }
        Object obj2 = this.f21334g;
        if (obj2 == null ? aVar.f21334g == null : obj2.equals(aVar.f21334g)) {
            return this.f21335h == aVar.f21335h && this.i == aVar.i && this.f21336j == aVar.f21336j && this.f21337k == aVar.f21337k && this.f21338l == aVar.f21338l && this.f21339m == aVar.f21339m && this.f21340n == aVar.f21340n && this.f21341o == aVar.f21341o && this.f21342p == aVar.f21342p && this.f21343q == aVar.f21343q && this.f21344r == aVar.f21344r;
        }
        return false;
    }

    public String f() {
        return this.f21328a;
    }

    public Map g() {
        return this.f21331d;
    }

    public String h() {
        return this.f21329b;
    }

    public int hashCode() {
        int iHashCode = super.hashCode() * 31;
        String str = this.f21328a;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f21333f;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f21329b;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Object obj = this.f21334g;
        int iB = ((((this.f21342p.b() + ((((((((((((((((((iHashCode4 + (obj != null ? obj.hashCode() : 0)) * 31) + this.f21335h) * 31) + this.i) * 31) + this.f21336j) * 31) + this.f21337k) * 31) + (this.f21338l ? 1 : 0)) * 31) + (this.f21339m ? 1 : 0)) * 31) + (this.f21340n ? 1 : 0)) * 31) + (this.f21341o ? 1 : 0)) * 31)) * 31) + (this.f21343q ? 1 : 0)) * 31) + (this.f21344r ? 1 : 0);
        Map map = this.f21330c;
        if (map != null) {
            iB = (iB * 31) + map.hashCode();
        }
        Map map2 = this.f21331d;
        if (map2 != null) {
            iB = (iB * 31) + map2.hashCode();
        }
        JSONObject jSONObject = this.f21332e;
        if (jSONObject == null) {
            return iB;
        }
        char[] charArray = jSONObject.toString().toCharArray();
        Arrays.sort(charArray);
        return new String(charArray).hashCode() + (iB * 31);
    }

    public Map i() {
        return this.f21330c;
    }

    public int j() {
        return this.i;
    }

    public int k() {
        return this.f21337k;
    }

    public int l() {
        return this.f21336j;
    }

    public boolean m() {
        return this.f21341o;
    }

    public boolean n() {
        return this.f21338l;
    }

    public boolean o() {
        return this.f21344r;
    }

    public boolean p() {
        return this.f21339m;
    }

    public boolean q() {
        return this.f21340n;
    }

    public boolean r() {
        return this.f21343q;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("HttpRequest {endpoint=");
        sb.append(this.f21328a);
        sb.append(", backupEndpoint=");
        sb.append(this.f21333f);
        sb.append(", httpMethod=");
        sb.append(this.f21329b);
        sb.append(", httpHeaders=");
        sb.append(this.f21331d);
        sb.append(", body=");
        sb.append(this.f21332e);
        sb.append(", emptyResponse=");
        sb.append(this.f21334g);
        sb.append(", initialRetryAttempts=");
        sb.append(this.f21335h);
        sb.append(", retryAttemptsLeft=");
        sb.append(this.i);
        sb.append(", timeoutMillis=");
        sb.append(this.f21336j);
        sb.append(", retryDelayMillis=");
        sb.append(this.f21337k);
        sb.append(", exponentialRetries=");
        sb.append(this.f21338l);
        sb.append(", retryOnAllErrors=");
        sb.append(this.f21339m);
        sb.append(", retryOnNoConnection=");
        sb.append(this.f21340n);
        sb.append(", encodingEnabled=");
        sb.append(this.f21341o);
        sb.append(", encodingType=");
        sb.append(this.f21342p);
        sb.append(", trackConnectionSpeed=");
        sb.append(this.f21343q);
        sb.append(", gzipBodyEncoding=");
        return C1154e9.k(sb, this.f21344r, '}');
    }

    public String a() {
        return this.f21333f;
    }

    public JSONObject b() {
        return this.f21332e;
    }

    public void a(int i) {
        this.i = i;
    }

    public static C0320a a(k kVar) {
        return new C0320a(kVar);
    }
}

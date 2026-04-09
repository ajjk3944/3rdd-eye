package com.applovin.impl.sdk.network;

import com.applovin.impl.sdk.k;
import com.applovin.impl.u4;
import com.applovin.impl.x4;
import d.h;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private String f5644a;

    /* renamed from: b, reason: collision with root package name */
    private String f5645b;

    /* renamed from: c, reason: collision with root package name */
    private Map f5646c;

    /* renamed from: d, reason: collision with root package name */
    private Map f5647d;

    /* renamed from: e, reason: collision with root package name */
    private final JSONObject f5648e;

    /* renamed from: f, reason: collision with root package name */
    private String f5649f;
    private final Object g;

    /* renamed from: h, reason: collision with root package name */
    private final int f5650h;

    /* renamed from: i, reason: collision with root package name */
    private int f5651i;
    private final int j;

    /* renamed from: k, reason: collision with root package name */
    private final int f5652k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f5653l;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f5654m;

    /* renamed from: n, reason: collision with root package name */
    private final boolean f5655n;

    /* renamed from: o, reason: collision with root package name */
    private final boolean f5656o;

    /* renamed from: p, reason: collision with root package name */
    private final u4.a f5657p;

    /* renamed from: q, reason: collision with root package name */
    private final boolean f5658q;

    /* renamed from: r, reason: collision with root package name */
    private final boolean f5659r;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    /* renamed from: com.applovin.impl.sdk.network.a$a, reason: collision with other inner class name */
    public static class C0022a {

        /* renamed from: a, reason: collision with root package name */
        String f5660a;

        /* renamed from: b, reason: collision with root package name */
        String f5661b;

        /* renamed from: c, reason: collision with root package name */
        String f5662c;

        /* renamed from: e, reason: collision with root package name */
        Map f5664e;

        /* renamed from: f, reason: collision with root package name */
        JSONObject f5665f;
        Object g;

        /* renamed from: i, reason: collision with root package name */
        int f5667i;
        int j;

        /* renamed from: k, reason: collision with root package name */
        boolean f5668k;

        /* renamed from: m, reason: collision with root package name */
        boolean f5670m;

        /* renamed from: n, reason: collision with root package name */
        boolean f5671n;

        /* renamed from: o, reason: collision with root package name */
        boolean f5672o;

        /* renamed from: p, reason: collision with root package name */
        boolean f5673p;

        /* renamed from: q, reason: collision with root package name */
        u4.a f5674q;

        /* renamed from: h, reason: collision with root package name */
        int f5666h = 1;

        /* renamed from: l, reason: collision with root package name */
        boolean f5669l = true;

        /* renamed from: d, reason: collision with root package name */
        Map f5663d = new HashMap();

        public C0022a(k kVar) {
            this.f5667i = ((Integer) kVar.a(x4.T2)).intValue();
            this.j = ((Integer) kVar.a(x4.S2)).intValue();
            this.f5670m = ((Boolean) kVar.a(x4.f6111p3)).booleanValue();
            this.f5671n = ((Boolean) kVar.a(x4.f6074k5)).booleanValue();
            this.f5674q = u4.a.a(((Integer) kVar.a(x4.f6083l5)).intValue());
            this.f5673p = ((Boolean) kVar.a(x4.K5)).booleanValue();
        }

        public C0022a a(Map map) {
            this.f5664e = map;
            return this;
        }

        public C0022a b(String str) {
            this.f5661b = str;
            return this;
        }

        public C0022a c(String str) {
            this.f5660a = str;
            return this;
        }

        public C0022a d(boolean z3) {
            this.f5669l = z3;
            return this;
        }

        public C0022a e(boolean z3) {
            this.f5670m = z3;
            return this;
        }

        public C0022a f(boolean z3) {
            this.f5672o = z3;
            return this;
        }

        public C0022a a(JSONObject jSONObject) {
            this.f5665f = jSONObject;
            return this;
        }

        public C0022a b(Map map) {
            this.f5663d = map;
            return this;
        }

        public C0022a c(int i4) {
            this.f5667i = i4;
            return this;
        }

        public C0022a a(String str) {
            this.f5662c = str;
            return this;
        }

        public C0022a b(int i4) {
            this.j = i4;
            return this;
        }

        public C0022a c(boolean z3) {
            this.f5668k = z3;
            return this;
        }

        public C0022a a(Object obj) {
            this.g = obj;
            return this;
        }

        public C0022a b(boolean z3) {
            this.f5673p = z3;
            return this;
        }

        public C0022a a(int i4) {
            this.f5666h = i4;
            return this;
        }

        public C0022a a(boolean z3) {
            this.f5671n = z3;
            return this;
        }

        public C0022a a(u4.a aVar) {
            this.f5674q = aVar;
            return this;
        }

        public a a() {
            return new a(this);
        }
    }

    public a(C0022a c0022a) {
        this.f5644a = c0022a.f5661b;
        this.f5645b = c0022a.f5660a;
        this.f5646c = c0022a.f5663d;
        this.f5647d = c0022a.f5664e;
        this.f5648e = c0022a.f5665f;
        this.f5649f = c0022a.f5662c;
        this.g = c0022a.g;
        int i4 = c0022a.f5666h;
        this.f5650h = i4;
        this.f5651i = i4;
        this.j = c0022a.f5667i;
        this.f5652k = c0022a.j;
        this.f5653l = c0022a.f5668k;
        this.f5654m = c0022a.f5669l;
        this.f5655n = c0022a.f5670m;
        this.f5656o = c0022a.f5671n;
        this.f5657p = c0022a.f5674q;
        this.f5658q = c0022a.f5672o;
        this.f5659r = c0022a.f5673p;
    }

    public void a(String str) {
        this.f5644a = str;
    }

    public void b(String str) {
        this.f5645b = str;
    }

    public int c() {
        return this.f5650h - this.f5651i;
    }

    public Object d() {
        return this.g;
    }

    public u4.a e() {
        return this.f5657p;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        String str = this.f5644a;
        if (str == null ? aVar.f5644a != null : !str.equals(aVar.f5644a)) {
            return false;
        }
        Map map = this.f5646c;
        if (map == null ? aVar.f5646c != null : !map.equals(aVar.f5646c)) {
            return false;
        }
        Map map2 = this.f5647d;
        if (map2 == null ? aVar.f5647d != null : !map2.equals(aVar.f5647d)) {
            return false;
        }
        String str2 = this.f5649f;
        if (str2 == null ? aVar.f5649f != null : !str2.equals(aVar.f5649f)) {
            return false;
        }
        String str3 = this.f5645b;
        if (str3 == null ? aVar.f5645b != null : !str3.equals(aVar.f5645b)) {
            return false;
        }
        JSONObject jSONObject = this.f5648e;
        if (jSONObject == null ? aVar.f5648e != null : !jSONObject.equals(aVar.f5648e)) {
            return false;
        }
        Object obj2 = this.g;
        if (obj2 == null ? aVar.g == null : obj2.equals(aVar.g)) {
            return this.f5650h == aVar.f5650h && this.f5651i == aVar.f5651i && this.j == aVar.j && this.f5652k == aVar.f5652k && this.f5653l == aVar.f5653l && this.f5654m == aVar.f5654m && this.f5655n == aVar.f5655n && this.f5656o == aVar.f5656o && this.f5657p == aVar.f5657p && this.f5658q == aVar.f5658q && this.f5659r == aVar.f5659r;
        }
        return false;
    }

    public String f() {
        return this.f5644a;
    }

    public Map g() {
        return this.f5647d;
    }

    public String h() {
        return this.f5645b;
    }

    public int hashCode() {
        int iHashCode = super.hashCode() * 31;
        String str = this.f5644a;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f5649f;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f5645b;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Object obj = this.g;
        int iB = ((((this.f5657p.b() + ((((((((((((((((((iHashCode4 + (obj != null ? obj.hashCode() : 0)) * 31) + this.f5650h) * 31) + this.f5651i) * 31) + this.j) * 31) + this.f5652k) * 31) + (this.f5653l ? 1 : 0)) * 31) + (this.f5654m ? 1 : 0)) * 31) + (this.f5655n ? 1 : 0)) * 31) + (this.f5656o ? 1 : 0)) * 31)) * 31) + (this.f5658q ? 1 : 0)) * 31) + (this.f5659r ? 1 : 0);
        Map map = this.f5646c;
        if (map != null) {
            iB = (iB * 31) + map.hashCode();
        }
        Map map2 = this.f5647d;
        if (map2 != null) {
            iB = (iB * 31) + map2.hashCode();
        }
        JSONObject jSONObject = this.f5648e;
        if (jSONObject == null) {
            return iB;
        }
        char[] charArray = jSONObject.toString().toCharArray();
        Arrays.sort(charArray);
        return new String(charArray).hashCode() + (iB * 31);
    }

    public Map i() {
        return this.f5646c;
    }

    public int j() {
        return this.f5651i;
    }

    public int k() {
        return this.f5652k;
    }

    public int l() {
        return this.j;
    }

    public boolean m() {
        return this.f5656o;
    }

    public boolean n() {
        return this.f5653l;
    }

    public boolean o() {
        return this.f5659r;
    }

    public boolean p() {
        return this.f5654m;
    }

    public boolean q() {
        return this.f5655n;
    }

    public boolean r() {
        return this.f5658q;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("HttpRequest {endpoint=");
        sb2.append(this.f5644a);
        sb2.append(", backupEndpoint=");
        sb2.append(this.f5649f);
        sb2.append(", httpMethod=");
        sb2.append(this.f5645b);
        sb2.append(", httpHeaders=");
        sb2.append(this.f5647d);
        sb2.append(", body=");
        sb2.append(this.f5648e);
        sb2.append(", emptyResponse=");
        sb2.append(this.g);
        sb2.append(", initialRetryAttempts=");
        sb2.append(this.f5650h);
        sb2.append(", retryAttemptsLeft=");
        sb2.append(this.f5651i);
        sb2.append(", timeoutMillis=");
        sb2.append(this.j);
        sb2.append(", retryDelayMillis=");
        sb2.append(this.f5652k);
        sb2.append(", exponentialRetries=");
        sb2.append(this.f5653l);
        sb2.append(", retryOnAllErrors=");
        sb2.append(this.f5654m);
        sb2.append(", retryOnNoConnection=");
        sb2.append(this.f5655n);
        sb2.append(", encodingEnabled=");
        sb2.append(this.f5656o);
        sb2.append(", encodingType=");
        sb2.append(this.f5657p);
        sb2.append(", trackConnectionSpeed=");
        sb2.append(this.f5658q);
        sb2.append(", gzipBodyEncoding=");
        return h.x(sb2, this.f5659r, '}');
    }

    public String a() {
        return this.f5649f;
    }

    public JSONObject b() {
        return this.f5648e;
    }

    public void a(int i4) {
        this.f5651i = i4;
    }

    public static C0022a a(k kVar) {
        return new C0022a(kVar);
    }
}

package yl;

import com.applovin.shadow.okhttp3.internal.http2.Header;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class d {

    /* renamed from: d, reason: collision with root package name */
    public static final hm.h f37675d;

    /* renamed from: e, reason: collision with root package name */
    public static final hm.h f37676e;

    /* renamed from: f, reason: collision with root package name */
    public static final hm.h f37677f;
    public static final hm.h g;

    /* renamed from: h, reason: collision with root package name */
    public static final hm.h f37678h;

    /* renamed from: i, reason: collision with root package name */
    public static final hm.h f37679i;

    /* renamed from: a, reason: collision with root package name */
    public final hm.h f37680a;

    /* renamed from: b, reason: collision with root package name */
    public final hm.h f37681b;

    /* renamed from: c, reason: collision with root package name */
    public final int f37682c;

    static {
        hm.h hVar = hm.h.f25175d;
        f37675d = ec.y.f(":");
        f37676e = ec.y.f(Header.RESPONSE_STATUS_UTF8);
        f37677f = ec.y.f(Header.TARGET_METHOD_UTF8);
        g = ec.y.f(Header.TARGET_PATH_UTF8);
        f37678h = ec.y.f(Header.TARGET_SCHEME_UTF8);
        f37679i = ec.y.f(Header.TARGET_AUTHORITY_UTF8);
    }

    public d(hm.h hVar, hm.h hVar2) {
        nk.k.e(hVar, "name");
        nk.k.e(hVar2, "value");
        this.f37680a = hVar;
        this.f37681b = hVar2;
        this.f37682c = hVar2.a() + hVar.a() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return nk.k.a(this.f37680a, dVar.f37680a) && nk.k.a(this.f37681b, dVar.f37681b);
    }

    public final int hashCode() {
        return this.f37681b.hashCode() + (this.f37680a.hashCode() * 31);
    }

    public final String toString() {
        return this.f37680a.j() + ": " + this.f37681b.j();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(String str, String str2) {
        this(ec.y.f(str), ec.y.f(str2));
        hm.h hVar = hm.h.f25175d;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(hm.h hVar, String str) {
        this(hVar, ec.y.f(str));
        nk.k.e(hVar, "name");
        nk.k.e(str, "value");
        hm.h hVar2 = hm.h.f25175d;
    }
}

package com.mbridge.msdk.thrid.okhttp.internal.http2;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    public static final com.mbridge.msdk.thrid.okio.f f17778d = com.mbridge.msdk.thrid.okio.f.c(":");

    /* renamed from: e, reason: collision with root package name */
    public static final com.mbridge.msdk.thrid.okio.f f17779e = com.mbridge.msdk.thrid.okio.f.c(":status");

    /* renamed from: f, reason: collision with root package name */
    public static final com.mbridge.msdk.thrid.okio.f f17780f = com.mbridge.msdk.thrid.okio.f.c(":method");

    /* renamed from: g, reason: collision with root package name */
    public static final com.mbridge.msdk.thrid.okio.f f17781g = com.mbridge.msdk.thrid.okio.f.c(":path");

    /* renamed from: h, reason: collision with root package name */
    public static final com.mbridge.msdk.thrid.okio.f f17782h = com.mbridge.msdk.thrid.okio.f.c(":scheme");

    /* renamed from: i, reason: collision with root package name */
    public static final com.mbridge.msdk.thrid.okio.f f17783i = com.mbridge.msdk.thrid.okio.f.c(":authority");

    /* renamed from: a, reason: collision with root package name */
    public final com.mbridge.msdk.thrid.okio.f f17784a;

    /* renamed from: b, reason: collision with root package name */
    public final com.mbridge.msdk.thrid.okio.f f17785b;

    /* renamed from: c, reason: collision with root package name */
    final int f17786c;

    public interface a {
    }

    public c(String str, String str2) {
        this(com.mbridge.msdk.thrid.okio.f.c(str), com.mbridge.msdk.thrid.okio.f.c(str2));
    }

    public boolean equals(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (this.f17784a.equals(cVar.f17784a) && this.f17785b.equals(cVar.f17785b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f17784a.hashCode() + 527) * 31) + this.f17785b.hashCode();
    }

    public String toString() {
        return com.mbridge.msdk.thrid.okhttp.internal.c.a("%s: %s", this.f17784a.m(), this.f17785b.m());
    }

    public c(com.mbridge.msdk.thrid.okio.f fVar, String str) {
        this(fVar, com.mbridge.msdk.thrid.okio.f.c(str));
    }

    public c(com.mbridge.msdk.thrid.okio.f fVar, com.mbridge.msdk.thrid.okio.f fVar2) {
        this.f17784a = fVar;
        this.f17785b = fVar2;
        this.f17786c = fVar.j() + 32 + fVar2.j();
    }
}

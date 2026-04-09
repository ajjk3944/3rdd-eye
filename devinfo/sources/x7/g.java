package x7;

import android.text.TextUtils;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: e, reason: collision with root package name */
    public static final i7.b f36999e = new i7.b();

    /* renamed from: a, reason: collision with root package name */
    public final Object f37000a;

    /* renamed from: b, reason: collision with root package name */
    public final f f37001b;

    /* renamed from: c, reason: collision with root package name */
    public final String f37002c;

    /* renamed from: d, reason: collision with root package name */
    public volatile byte[] f37003d;

    public g(String str, Object obj, f fVar) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must not be null or empty");
        }
        this.f37002c = str;
        this.f37000a = obj;
        this.f37001b = fVar;
    }

    public static g a(Object obj, String str) {
        return new g(str, obj, f36999e);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f37002c.equals(((g) obj).f37002c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f37002c.hashCode();
    }

    public final String toString() {
        return d.h.w(new StringBuilder("Option{key='"), this.f37002c, "'}");
    }
}

package rl;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class p {

    /* renamed from: d, reason: collision with root package name */
    public static final vk.h f33121d = new vk.h("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: e, reason: collision with root package name */
    public static final vk.h f33122e = new vk.h(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: a, reason: collision with root package name */
    public final String f33123a;

    /* renamed from: b, reason: collision with root package name */
    public final String f33124b;

    /* renamed from: c, reason: collision with root package name */
    public final String[] f33125c;

    public p(String str, String str2, String str3, String[] strArr) {
        nk.k.e(str, "mediaType");
        nk.k.e(strArr, "parameterNamesAndValues");
        this.f33123a = str;
        this.f33124b = str2;
        this.f33125c = strArr;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof p) && nk.k.a(((p) obj).f33123a, this.f33123a);
    }

    public final int hashCode() {
        return this.f33123a.hashCode();
    }

    public final String toString() {
        return this.f33123a;
    }
}

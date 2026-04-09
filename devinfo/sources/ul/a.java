package ul;

import nk.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f35530a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f35531b;

    /* renamed from: c, reason: collision with root package name */
    public c f35532c;

    /* renamed from: d, reason: collision with root package name */
    public long f35533d;

    public a(String str) {
        k.e(str, "name");
        this.f35530a = str;
        this.f35531b = true;
        this.f35533d = -1L;
    }

    public abstract long a();

    public final String toString() {
        return this.f35530a;
    }
}

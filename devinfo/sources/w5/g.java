package w5;

import t6.i0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class g implements d6.c {

    /* renamed from: a, reason: collision with root package name */
    public final e6.a f36484a;

    /* renamed from: b, reason: collision with root package name */
    public final String f36485b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f36486c;

    public g(e6.a aVar, String str) {
        this.f36484a = aVar;
        this.f36485b = str;
    }

    public final void c() {
        if (this.f36486c) {
            i0.v(21, "statement is closed");
            throw null;
        }
    }

    @Override // d6.c
    public final boolean r() {
        return getLong(0) != 0;
    }
}

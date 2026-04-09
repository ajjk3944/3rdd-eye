package yj;

import java.io.Serializable;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class v implements f, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public mk.a f37650a;

    /* renamed from: b, reason: collision with root package name */
    public Object f37651b;

    @Override // yj.f
    public final Object getValue() {
        if (this.f37651b == s.f37648a) {
            mk.a aVar = this.f37650a;
            nk.k.b(aVar);
            this.f37651b = aVar.invoke();
            this.f37650a = null;
        }
        return this.f37651b;
    }

    public final String toString() {
        return this.f37651b != s.f37648a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}

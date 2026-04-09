package wi;

import androidx.lifecycle.m0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class d implements m0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f36747a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f36748b;

    public d(m0 m0Var) {
        this.f36747a = m0Var;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.m0, java.lang.Object] */
    @Override // androidx.lifecycle.m0
    public final void b(Object obj) {
        if (this.f36748b) {
            this.f36748b = false;
            this.f36747a.b(obj);
        }
    }
}

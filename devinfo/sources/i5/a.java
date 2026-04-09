package i5;

import ck.h;
import nk.k;
import xk.v;
import xk.x;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a implements AutoCloseable, v {

    /* renamed from: a, reason: collision with root package name */
    public final h f25863a;

    public a(h hVar) {
        k.e(hVar, "coroutineContext");
        this.f25863a = hVar;
    }

    @Override // xk.v
    public final h A() {
        return this.f25863a;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        x.f(this.f25863a, null);
    }
}

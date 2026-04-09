package z0;

import v1.e0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class m extends k {

    /* renamed from: d, reason: collision with root package name */
    public final e0 f37830d;

    public m(e0 e0Var) {
        this.f37830d = e0Var;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i4 = this.f37828c;
        this.f37828c = i4 + 2;
        Object[] objArr = this.f37826a;
        return new a(this.f37830d, objArr[i4], objArr[i4 + 1]);
    }
}

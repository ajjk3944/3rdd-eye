package z0;

import java.util.Iterator;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class k implements Iterator, ok.a {

    /* renamed from: a, reason: collision with root package name */
    public Object[] f37826a = j.f37821e.f37825d;

    /* renamed from: b, reason: collision with root package name */
    public int f37827b;

    /* renamed from: c, reason: collision with root package name */
    public int f37828c;

    public final void a(Object[] objArr, int i4, int i10) {
        this.f37826a = objArr;
        this.f37827b = i4;
        this.f37828c = i10;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f37828c < this.f37827b;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

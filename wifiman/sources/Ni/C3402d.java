package Ni;

import dh.InterfaceC5384i;

/* renamed from: Ni.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3402d implements Ii.N {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC5384i f16589a;

    public C3402d(InterfaceC5384i interfaceC5384i) {
        this.f16589a = interfaceC5384i;
    }

    @Override // Ii.N
    public InterfaceC5384i getCoroutineContext() {
        return this.f16589a;
    }

    public String toString() {
        return "CoroutineScope(coroutineContext=" + getCoroutineContext() + ')';
    }
}

package androidx.camera.core.impl;

import I.m;
import androidx.camera.core.impl.InterfaceC1715t0;
import java.util.concurrent.Executor;

/* compiled from: ConstantObservable.java */
/* loaded from: classes.dex */
public final class V<T> implements InterfaceC1715t0<T> {

    /* renamed from: b, reason: collision with root package name */
    public static final V<Object> f14977b = new V<>(null);

    /* renamed from: a, reason: collision with root package name */
    public final m.c f14978a;

    public V(T t10) {
        this.f14978a = I.j.e(t10);
    }

    @Override // androidx.camera.core.impl.InterfaceC1715t0
    public final A4.a<T> d() {
        return this.f14978a;
    }

    @Override // androidx.camera.core.impl.InterfaceC1715t0
    public final void e(Executor executor, InterfaceC1715t0.a<? super T> aVar) {
        this.f14978a.addListener(new B.c(9, this, aVar), executor);
    }

    @Override // androidx.camera.core.impl.InterfaceC1715t0
    public final void a(InterfaceC1715t0.a<? super T> aVar) {
    }
}

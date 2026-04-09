package androidx.camera.core.impl;

import androidx.camera.core.impl.InterfaceC1715t0;

/* compiled from: QuirkSettingsHolder.java */
/* loaded from: classes.dex */
public final class A0 {

    /* renamed from: b, reason: collision with root package name */
    public static final z0 f14863b = new z0(true, null, null);

    /* renamed from: c, reason: collision with root package name */
    public static final A0 f14864c = new A0();

    /* renamed from: a, reason: collision with root package name */
    public final C1711r0<z0> f14865a = new C1711r0<>(f14863b);

    /* compiled from: QuirkSettingsHolder.java */
    public static class a<T> implements InterfaceC1715t0.a<T> {

        /* renamed from: a, reason: collision with root package name */
        public final K0.b<T> f14866a;

        public a(K0.b<T> bVar) {
            this.f14866a = bVar;
        }

        @Override // androidx.camera.core.impl.InterfaceC1715t0.a
        public final void a(T t10) {
            this.f14866a.accept(t10);
        }

        @Override // androidx.camera.core.impl.InterfaceC1715t0.a
        public final void onError(Throwable th) {
            C.S.c("ObserverToConsumerAdapter", "Unexpected error in Observable", th);
        }
    }

    public final void a(H.b bVar, K0.b bVar2) {
        this.f14865a.e(bVar, new a(bVar2));
    }
}

package androidx.camera.core.impl;

import java.util.concurrent.Executor;

/* compiled from: Observable.java */
/* renamed from: androidx.camera.core.impl.t0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC1715t0<T> {

    /* compiled from: Observable.java */
    /* renamed from: androidx.camera.core.impl.t0$a */
    public interface a<T> {
        void a(T t10);

        void onError(Throwable th);
    }

    void a(a<? super T> aVar);

    A4.a<T> d();

    void e(Executor executor, a<? super T> aVar);
}

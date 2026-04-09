package io.appmetrica.analytics.impl;

/* loaded from: classes3.dex */
public final class E5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC4820ne f39334a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ F5 f39335b;

    public E5(F5 f52, InterfaceC4820ne interfaceC4820ne) {
        this.f39335b = f52;
        this.f39334a = interfaceC4820ne;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f39335b) {
            try {
                F5 f52 = this.f39335b;
                Object obj = f52.f39409a;
                if (obj == null) {
                    f52.f39410b.add(this.f39334a);
                } else {
                    this.f39334a.consume(obj);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

package androidx.work.multiprocess;

import android.os.RemoteException;
import androidx.work.m;
import e2.InterfaceExecutorC4305a;

/* compiled from: ListenableCallback.java */
/* loaded from: classes.dex */
public abstract class d<I> {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceExecutorC4305a f16987a;

    /* renamed from: b, reason: collision with root package name */
    public final c f16988b;

    /* renamed from: c, reason: collision with root package name */
    public final A4.a<I> f16989c;

    /* compiled from: ListenableCallback.java */
    public static class a<I> implements Runnable {

        /* renamed from: c, reason: collision with root package name */
        public static final String f16990c = m.g("ListenableCallbackRbl");

        /* renamed from: b, reason: collision with root package name */
        public final d<I> f16991b;

        public a(d<I> dVar) {
            this.f16991b = dVar;
        }

        public static void a(c cVar, Throwable th) {
            try {
                cVar.onFailure(th.getMessage());
            } catch (RemoteException e4) {
                m.e().d(f16990c, "Unable to notify failures in operation", e4);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            d<I> dVar = this.f16991b;
            try {
                try {
                    dVar.f16988b.n(dVar.b(dVar.f16989c.get()));
                } catch (RemoteException e4) {
                    m.e().d(f16990c, "Unable to notify successful operation", e4);
                }
            } catch (Throwable th) {
                a(dVar.f16988b, th);
            }
        }
    }

    public d(InterfaceExecutorC4305a interfaceExecutorC4305a, c cVar, A4.a aVar) {
        this.f16987a = interfaceExecutorC4305a;
        this.f16988b = cVar;
        this.f16989c = aVar;
    }

    public final void a() {
        this.f16989c.addListener(new a(this), this.f16987a);
    }

    public abstract byte[] b(I i);
}

package androidx.work.multiprocess;

import android.os.IBinder;
import android.os.RemoteException;
import androidx.work.m;
import androidx.work.multiprocess.d;
import androidx.work.multiprocess.g;
import g2.InterfaceC4379c;
import java.util.NoSuchElementException;
import java.util.concurrent.ExecutionException;

/* compiled from: ListenableWorkerImplClient.java */
/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ A4.a f16992b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f16993c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InterfaceC4379c f16994d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f f16995e;

    /* compiled from: ListenableWorkerImplClient.java */
    public class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ androidx.work.multiprocess.a f16996b;

        public a(androidx.work.multiprocess.a aVar) {
            this.f16996b = aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            e eVar = e.this;
            g gVar = eVar.f16993c;
            try {
                eVar.f16994d.a(this.f16996b, gVar);
            } catch (Throwable th) {
                m.e().d(f.f16998e, "Unable to execute", th);
                d.a.a(gVar, th);
            }
        }
    }

    public e(f fVar, A4.a aVar, g gVar, InterfaceC4379c interfaceC4379c) {
        this.f16995e = fVar;
        this.f16992b = aVar;
        this.f16993c = gVar;
        this.f16994d = interfaceC4379c;
    }

    @Override // java.lang.Runnable
    public final void run() throws RemoteException {
        g gVar = this.f16993c;
        try {
            androidx.work.multiprocess.a aVar = (androidx.work.multiprocess.a) this.f16992b.get();
            IBinder iBinderAsBinder = aVar.asBinder();
            g.a aVar2 = gVar.f17007d;
            gVar.f17006c = iBinderAsBinder;
            try {
                iBinderAsBinder.linkToDeath(aVar2, 0);
            } catch (RemoteException e4) {
                gVar.f17005b.j(e4);
                IBinder iBinder = gVar.f17006c;
                if (iBinder != null) {
                    try {
                        iBinder.unlinkToDeath(aVar2, 0);
                    } catch (NoSuchElementException unused) {
                    }
                }
            }
            this.f16995e.f17000b.execute(new a(aVar));
        } catch (InterruptedException | ExecutionException e10) {
            m.e().d(f.f16998e, "Unable to bind to service", e10);
            d.a.a(gVar, e10);
        }
    }
}

package androidx.work.multiprocess;

import android.os.IBinder;
import android.os.RemoteException;
import androidx.work.m;
import androidx.work.multiprocess.RemoteWorkManagerClient;
import androidx.work.multiprocess.d;
import androidx.work.multiprocess.g;
import c2.s;
import g2.InterfaceC4379c;
import java.util.NoSuchElementException;
import java.util.concurrent.ExecutionException;

/* compiled from: RemoteWorkManagerClient.java */
/* loaded from: classes.dex */
public final class h implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ A4.a f17009b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ RemoteWorkManagerClient.b f17010c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InterfaceC4379c f17011d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ RemoteWorkManagerClient f17012e;

    /* compiled from: RemoteWorkManagerClient.java */
    public class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b f17013b;

        public a(b bVar) {
            this.f17013b = bVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            h hVar = h.this;
            RemoteWorkManagerClient.b bVar = hVar.f17010c;
            try {
                hVar.f17011d.a(this.f17013b, bVar);
            } catch (Throwable th) {
                m.e().d(RemoteWorkManagerClient.f16962j, "Unable to execute", th);
                d.a.a(bVar, th);
            }
        }
    }

    public h(RemoteWorkManagerClient remoteWorkManagerClient, A4.a aVar, RemoteWorkManagerClient.b bVar, InterfaceC4379c interfaceC4379c) {
        this.f17012e = remoteWorkManagerClient;
        this.f17009b = aVar;
        this.f17010c = bVar;
        this.f17011d = interfaceC4379c;
    }

    @Override // java.lang.Runnable
    public final void run() throws RemoteException {
        RemoteWorkManagerClient remoteWorkManagerClient = this.f17012e;
        RemoteWorkManagerClient.b bVar = this.f17010c;
        try {
            b bVar2 = (b) this.f17009b.get();
            IBinder iBinderAsBinder = bVar2.asBinder();
            g.a aVar = bVar.f17007d;
            bVar.f17006c = iBinderAsBinder;
            try {
                iBinderAsBinder.linkToDeath(aVar, 0);
            } catch (RemoteException e4) {
                bVar.f17005b.j(e4);
                IBinder iBinder = bVar.f17006c;
                if (iBinder != null) {
                    try {
                        iBinder.unlinkToDeath(aVar, 0);
                    } catch (NoSuchElementException unused) {
                    }
                }
                bVar.w();
            }
            ((s) remoteWorkManagerClient.f16966d).execute(new a(bVar2));
        } catch (InterruptedException | ExecutionException unused2) {
            m.e().c(RemoteWorkManagerClient.f16962j, "Unable to bind to service");
            d.a.a(bVar, new RuntimeException("Unable to bind to service"));
            remoteWorkManagerClient.e();
        }
    }
}

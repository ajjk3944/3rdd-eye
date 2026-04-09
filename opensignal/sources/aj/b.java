package aj;

import a8.f;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import br.l;
import ch.n;
import cj.g;
import cj.h;

/* loaded from: classes.dex */
public final class b implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f398a;

    public b(c cVar) {
        this.f398a = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v13, types: [cj.h] */
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        g gVar;
        b9.c cVar;
        l.e(componentName, "className");
        l.e(iBinder, "service");
        c cVar2 = this.f398a;
        cVar2.f400b = true;
        int i10 = mk.g.f16866h;
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.opensignal.sdk.data.task.JobResultTestIBinder");
        if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof h)) {
            g gVar2 = new g();
            gVar2.f3985d = iBinder;
            gVar = gVar2;
        } else {
            gVar = (h) iInterfaceQueryLocalInterface;
        }
        cVar2.f405g = gVar;
        try {
            gVar.P(cVar2.f406h);
            kj.a aVar = cVar2.f402d;
            if (aVar == null || (cVar = aVar.f14445b) == null) {
                return;
            }
            f.A(new fm.f((f) cVar.f2478d, null, 0));
        } catch (RemoteException e4) {
            n.d("JobResultDataSource", "Unable to connect to the service", e4);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        c cVar = this.f398a;
        l.e(componentName, "className");
        try {
            h hVar = cVar.f405g;
            if (hVar != null) {
                hVar.J(cVar.f406h);
            }
        } catch (DeadObjectException e4) {
            n.d("JobResultDataSource", "Unable to remove listener", e4);
        }
        cVar.f405g = null;
        cVar.f400b = false;
    }
}

package u4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import java.util.Iterator;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* loaded from: classes2.dex */
public final class r extends m {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ IBinder f46580c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t f46581d;

    public r(t tVar, IBinder iBinder) {
        this.f46581d = tVar;
        this.f46580c = iBinder;
    }

    @Override // u4.m
    public final void a() throws RemoteException {
        h fVar;
        t tVar = this.f46581d;
        int i = g.f46570b;
        IBinder iBinder = this.f46580c;
        if (iBinder == null) {
            fVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
            fVar = iInterfaceQueryLocalInterface instanceof h ? (h) iInterfaceQueryLocalInterface : new f(iBinder);
        }
        u uVar = (u) tVar.f46584b;
        uVar.f46597m = fVar;
        uVar.f46587b.a("linkToDeath", new Object[0]);
        try {
            uVar.f46597m.asBinder().linkToDeath(uVar.f46594j, 0);
        } catch (RemoteException e4) {
            Object[] objArr = new Object[0];
            l lVar = uVar.f46587b;
            lVar.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", l.b(lVar.f46572a, "linkToDeath failed", objArr), e4);
            }
        }
        uVar.f46592g = false;
        Iterator it = uVar.f46589d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        uVar.f46589d.clear();
    }
}

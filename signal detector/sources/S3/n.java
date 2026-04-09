package S3;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class n extends k {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IBinder f3494b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f3495c;

    public n(o oVar, IBinder iBinder) {
        this.f3495c = oVar;
        this.f3494b = iBinder;
    }

    @Override // S3.k
    public final void a() throws RemoteException {
        h fVar;
        p pVar = (p) this.f3495c.f3497b;
        int i = g.f3487b;
        IBinder iBinder = this.f3494b;
        if (iBinder == null) {
            fVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
            fVar = iInterfaceQueryLocalInterface instanceof h ? (h) iInterfaceQueryLocalInterface : new f(iBinder);
        }
        pVar.f3510m = fVar;
        B2.a aVar = pVar.f3500b;
        int i3 = 0;
        aVar.f("linkToDeath", new Object[0]);
        try {
            pVar.f3510m.asBinder().linkToDeath(pVar.f3507j, 0);
        } catch (RemoteException e6) {
            aVar.e(e6, "linkToDeath failed", new Object[0]);
        }
        pVar.f3505g = false;
        ArrayList arrayList = pVar.f3502d;
        int size = arrayList.size();
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ((Runnable) obj).run();
        }
        pVar.f3502d.clear();
    }
}

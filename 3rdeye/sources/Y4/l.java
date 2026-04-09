package y4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import java.util.Iterator;
import u4.t;

/* compiled from: com.google.android.play:review@@2.0.1 */
/* loaded from: classes2.dex */
public final class l extends h {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ IBinder f48114c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t f48115d;

    public l(t tVar, IBinder iBinder) {
        this.f48115d = tVar;
        this.f48114c = iBinder;
    }

    @Override // y4.h
    public final void a() throws RemoteException {
        e cVar;
        t tVar = this.f48115d;
        int i = d.f48108b;
        IBinder iBinder = this.f48114c;
        if (iBinder == null) {
            cVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
            cVar = iInterfaceQueryLocalInterface instanceof e ? (e) iInterfaceQueryLocalInterface : new c(iBinder);
        }
        n nVar = (n) tVar.f46584b;
        nVar.f48129m = cVar;
        nVar.f48119b.a("linkToDeath", new Object[0]);
        try {
            nVar.f48129m.asBinder().linkToDeath(nVar.f48126j, 0);
        } catch (RemoteException e4) {
            Object[] objArr = new Object[0];
            g gVar = nVar.f48119b;
            gVar.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", g.b(gVar.f48109a, "linkToDeath failed", objArr), e4);
            }
        }
        nVar.f48124g = false;
        Iterator it = nVar.f48121d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        nVar.f48121d.clear();
    }
}

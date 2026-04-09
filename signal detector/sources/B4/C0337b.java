package b4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;

/* renamed from: b4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0337b extends AbstractRunnableC0359x {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IBinder f5732b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ S3.o f5733c;

    public C0337b(S3.o oVar, IBinder iBinder) {
        this.f5733c = oVar;
        this.f5732b = iBinder;
    }

    @Override // b4.AbstractRunnableC0359x
    public final void a() throws RemoteException {
        InterfaceC0348m c0346k;
        C0339d c0339d = (C0339d) this.f5733c.f3497b;
        int i = AbstractBinderC0347l.f5757b;
        IBinder iBinder = this.f5732b;
        if (iBinder == null) {
            c0346k = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.splitinstall.protocol.ISplitInstallService");
            c0346k = iInterfaceQueryLocalInterface instanceof InterfaceC0348m ? (InterfaceC0348m) iInterfaceQueryLocalInterface : new C0346k(iBinder);
        }
        c0339d.f5748m = c0346k;
        int i3 = 0;
        c0339d.f5738b.c("linkToDeath", new Object[0]);
        try {
            c0339d.f5748m.asBinder().linkToDeath(c0339d.f5745j, 0);
        } catch (RemoteException e6) {
            X3.e eVar = c0339d.f5738b;
            Object[] objArr = new Object[0];
            eVar.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", X3.e.f(eVar.f4174b, "linkToDeath failed", objArr), e6);
            }
        }
        c0339d.f5743g = false;
        ArrayList arrayList = c0339d.f5740d;
        int size = arrayList.size();
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ((Runnable) obj).run();
        }
        c0339d.f5740d.clear();
    }
}

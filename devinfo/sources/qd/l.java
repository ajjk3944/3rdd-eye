package qd;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import cl.u;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class l extends i {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IBinder f32252b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f32253c;

    public l(m mVar, IBinder iBinder) {
        this.f32253c = mVar;
        this.f32252b = iBinder;
    }

    @Override // qd.i
    public final void a() throws RemoteException {
        g eVar;
        n nVar = (n) this.f32253c.f32255b;
        int i4 = f.f32246b;
        IBinder iBinder = this.f32252b;
        if (iBinder == null) {
            eVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
            eVar = iInterfaceQueryLocalInterface instanceof g ? (g) iInterfaceQueryLocalInterface : new e(iBinder);
        }
        nVar.f32267m = eVar;
        int i10 = 0;
        nVar.f32258b.d("linkToDeath", new Object[0]);
        try {
            nVar.f32267m.asBinder().linkToDeath(nVar.j, 0);
        } catch (RemoteException e2) {
            u uVar = nVar.f32258b;
            Object[] objArr = new Object[0];
            uVar.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", u.e(uVar.f2942b, "linkToDeath failed", objArr), e2);
            }
        }
        nVar.g = false;
        ArrayList arrayList = nVar.f32260d;
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((Runnable) obj).run();
        }
        nVar.f32260d.clear();
    }
}

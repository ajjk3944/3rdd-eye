package mk;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import ch.n;
import cj.m;

/* loaded from: classes.dex */
public final class d extends Binder implements vj.a, IInterface {

    /* renamed from: d, reason: collision with root package name */
    public m f16859d;

    @Override // android.os.Binder
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        m mVar;
        if (i10 >= 1 && i10 <= 16777215) {
            parcel.enforceInterface("com.opensignal.sdk.data.task.GetTasksService");
        }
        if (i10 == 1598968902) {
            parcel2.writeString("com.opensignal.sdk.data.task.GetTasksService");
            return true;
        }
        if (i10 != 1) {
            return super.onTransact(i10, parcel, parcel2, i11);
        }
        IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder == null) {
            mVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.opensignal.sdk.data.task.OnTasksResultListener");
            if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof m)) {
                m mVar2 = new m();
                mVar2.f3989d = strongBinder;
                mVar = mVar2;
            } else {
                mVar = (m) iInterfaceQueryLocalInterface;
            }
        }
        n.b("GetTasksBinder", "setListener() called with: tasksResultListener = " + mVar);
        this.f16859d = mVar;
        parcel2.writeNoException();
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}

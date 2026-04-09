package C0;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.MultiInstanceInvalidationService;

/* loaded from: classes.dex */
public final class m extends Binder implements g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MultiInstanceInvalidationService f1068a;

    public m(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f1068a = multiInstanceInvalidationService;
        attachInterface(this, g.f1044p);
    }

    public final void g0(int i, String[] strArr) {
        q5.i.e(strArr, "tables");
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.f1068a;
        synchronized (multiInstanceInvalidationService.f5636c) {
            String str = (String) multiInstanceInvalidationService.f5635b.get(Integer.valueOf(i));
            if (str == null) {
                Log.w("ROOM", "Remote invalidation client ID not registered");
                return;
            }
            int iBeginBroadcast = multiInstanceInvalidationService.f5636c.beginBroadcast();
            for (int i3 = 0; i3 < iBeginBroadcast; i3++) {
                try {
                    Object broadcastCookie = multiInstanceInvalidationService.f5636c.getBroadcastCookie(i3);
                    q5.i.c(broadcastCookie, "null cannot be cast to non-null type kotlin.Int");
                    Integer num = (Integer) broadcastCookie;
                    int iIntValue = num.intValue();
                    String str2 = (String) multiInstanceInvalidationService.f5635b.get(num);
                    if (i != iIntValue && str.equals(str2)) {
                        try {
                            ((f) multiInstanceInvalidationService.f5636c.getBroadcastItem(i3)).U0(strArr);
                        } catch (RemoteException e6) {
                            Log.w("ROOM", "Error invoking a remote callback", e6);
                        }
                    }
                } finally {
                    multiInstanceInvalidationService.f5636c.finishBroadcast();
                }
            }
        }
    }

    public final int h0(f fVar, String str) {
        q5.i.e(fVar, "callback");
        int i = 0;
        if (str == null) {
            return 0;
        }
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.f1068a;
        synchronized (multiInstanceInvalidationService.f5636c) {
            try {
                int i3 = multiInstanceInvalidationService.f5634a + 1;
                multiInstanceInvalidationService.f5634a = i3;
                if (multiInstanceInvalidationService.f5636c.register(fVar, Integer.valueOf(i3))) {
                    multiInstanceInvalidationService.f5635b.put(Integer.valueOf(i3), str);
                    i = i3;
                } else {
                    multiInstanceInvalidationService.f5634a--;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i3) {
        String str = g.f1044p;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        f fVar = null;
        f fVar2 = null;
        if (i == 1) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(f.f1043o);
                if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof f)) {
                    e eVar = new e();
                    eVar.f1042a = strongBinder;
                    fVar = eVar;
                } else {
                    fVar = (f) iInterfaceQueryLocalInterface;
                }
            }
            int iH0 = h0(fVar, parcel.readString());
            parcel2.writeNoException();
            parcel2.writeInt(iH0);
            return true;
        }
        if (i != 2) {
            if (i != 3) {
                return super.onTransact(i, parcel, parcel2, i3);
            }
            g0(parcel.readInt(), parcel.createStringArray());
            return true;
        }
        IBinder strongBinder2 = parcel.readStrongBinder();
        if (strongBinder2 != null) {
            IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface(f.f1043o);
            if (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof f)) {
                e eVar2 = new e();
                eVar2.f1042a = strongBinder2;
                fVar2 = eVar2;
            } else {
                fVar2 = (f) iInterfaceQueryLocalInterface2;
            }
        }
        int i6 = parcel.readInt();
        q5.i.e(fVar2, "callback");
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.f1068a;
        synchronized (multiInstanceInvalidationService.f5636c) {
            multiInstanceInvalidationService.f5636c.unregister(fVar2);
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}

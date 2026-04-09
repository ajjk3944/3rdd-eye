package t5;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.MultiInstanceInvalidationService;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class h extends Binder implements e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MultiInstanceInvalidationService f34241a;

    public h(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f34241a = multiInstanceInvalidationService;
        attachInterface(this, e.Y8);
    }

    @Override // t5.e
    public final void L3(int i4, String[] strArr) {
        nk.k.e(strArr, "tables");
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.f34241a;
        synchronized (multiInstanceInvalidationService.f1569c) {
            String str = (String) multiInstanceInvalidationService.f1568b.get(Integer.valueOf(i4));
            if (str == null) {
                Log.w("ROOM", "Remote invalidation client ID not registered");
                return;
            }
            int iBeginBroadcast = multiInstanceInvalidationService.f1569c.beginBroadcast();
            for (int i10 = 0; i10 < iBeginBroadcast; i10++) {
                try {
                    Object broadcastCookie = multiInstanceInvalidationService.f1569c.getBroadcastCookie(i10);
                    nk.k.c(broadcastCookie, "null cannot be cast to non-null type kotlin.Int");
                    Integer num = (Integer) broadcastCookie;
                    int iIntValue = num.intValue();
                    String str2 = (String) multiInstanceInvalidationService.f1568b.get(num);
                    if (i4 != iIntValue && str.equals(str2)) {
                        try {
                            ((d) multiInstanceInvalidationService.f1569c.getBroadcastItem(i10)).H0(strArr);
                        } catch (RemoteException e2) {
                            Log.w("ROOM", "Error invoking a remote callback", e2);
                        }
                    }
                } finally {
                    multiInstanceInvalidationService.f1569c.finishBroadcast();
                }
            }
        }
    }

    public final int O(d dVar, String str) {
        nk.k.e(dVar, "callback");
        int i4 = 0;
        if (str == null) {
            return 0;
        }
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.f34241a;
        synchronized (multiInstanceInvalidationService.f1569c) {
            try {
                int i10 = multiInstanceInvalidationService.f1567a + 1;
                multiInstanceInvalidationService.f1567a = i10;
                if (multiInstanceInvalidationService.f1569c.register(dVar, Integer.valueOf(i10))) {
                    multiInstanceInvalidationService.f1568b.put(Integer.valueOf(i10), str);
                    i4 = i10;
                } else {
                    multiInstanceInvalidationService.f1567a--;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i4;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i4, Parcel parcel, Parcel parcel2, int i10) {
        String str = e.Y8;
        if (i4 >= 1 && i4 <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i4 == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        d dVar = null;
        d dVar2 = null;
        if (i4 == 1) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(d.X8);
                if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof d)) {
                    c cVar = new c();
                    cVar.f34203a = strongBinder;
                    dVar = cVar;
                } else {
                    dVar = (d) iInterfaceQueryLocalInterface;
                }
            }
            int iO = O(dVar, parcel.readString());
            parcel2.writeNoException();
            parcel2.writeInt(iO);
            return true;
        }
        if (i4 != 2) {
            if (i4 != 3) {
                return super.onTransact(i4, parcel, parcel2, i10);
            }
            L3(parcel.readInt(), parcel.createStringArray());
            return true;
        }
        IBinder strongBinder2 = parcel.readStrongBinder();
        if (strongBinder2 != null) {
            IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface(d.X8);
            if (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof d)) {
                c cVar2 = new c();
                cVar2.f34203a = strongBinder2;
                dVar2 = cVar2;
            } else {
                dVar2 = (d) iInterfaceQueryLocalInterface2;
            }
        }
        int i11 = parcel.readInt();
        nk.k.e(dVar2, "callback");
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.f34241a;
        synchronized (multiInstanceInvalidationService.f1569c) {
            multiInstanceInvalidationService.f1569c.unregister(dVar2);
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}

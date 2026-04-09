package i7;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.room.MultiInstanceInvalidationService;
import io.sentry.android.core.e0;

/* loaded from: classes.dex */
public final class i extends Binder implements e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ MultiInstanceInvalidationService f11262d;

    public i(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f11262d = multiInstanceInvalidationService;
        attachInterface(this, e.f11250c);
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        String str = e.f11250c;
        if (i10 >= 1 && i10 <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i10 == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        d dVar = null;
        d dVar2 = null;
        if (i10 == 1) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(d.f11249b);
                if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof d)) {
                    c cVar = new c();
                    cVar.f11248d = strongBinder;
                    dVar = cVar;
                } else {
                    dVar = (d) iInterfaceQueryLocalInterface;
                }
            }
            String string = parcel.readString();
            br.l.e(dVar, "callback");
            int i12 = 0;
            if (string != null) {
                MultiInstanceInvalidationService multiInstanceInvalidationService = this.f11262d;
                synchronized (multiInstanceInvalidationService.f2115g) {
                    try {
                        int i13 = multiInstanceInvalidationService.f2113a + 1;
                        multiInstanceInvalidationService.f2113a = i13;
                        if (multiInstanceInvalidationService.f2115g.register(dVar, Integer.valueOf(i13))) {
                            multiInstanceInvalidationService.f2114d.put(Integer.valueOf(i13), string);
                            i12 = i13;
                        } else {
                            multiInstanceInvalidationService.f2113a--;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            parcel2.writeNoException();
            parcel2.writeInt(i12);
            return true;
        }
        if (i10 == 2) {
            IBinder strongBinder2 = parcel.readStrongBinder();
            if (strongBinder2 != null) {
                IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface(d.f11249b);
                if (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof d)) {
                    c cVar2 = new c();
                    cVar2.f11248d = strongBinder2;
                    dVar2 = cVar2;
                } else {
                    dVar2 = (d) iInterfaceQueryLocalInterface2;
                }
            }
            int i14 = parcel.readInt();
            br.l.e(dVar2, "callback");
            MultiInstanceInvalidationService multiInstanceInvalidationService2 = this.f11262d;
            synchronized (multiInstanceInvalidationService2.f2115g) {
                multiInstanceInvalidationService2.f2115g.unregister(dVar2);
            }
            parcel2.writeNoException();
            return true;
        }
        if (i10 != 3) {
            return super.onTransact(i10, parcel, parcel2, i11);
        }
        int i15 = parcel.readInt();
        String[] strArrCreateStringArray = parcel.createStringArray();
        br.l.e(strArrCreateStringArray, "tables");
        MultiInstanceInvalidationService multiInstanceInvalidationService3 = this.f11262d;
        synchronized (multiInstanceInvalidationService3.f2115g) {
            String str2 = (String) multiInstanceInvalidationService3.f2114d.get(Integer.valueOf(i15));
            if (str2 == null) {
                e0.p("ROOM", "Remote invalidation client ID not registered");
            } else {
                int iBeginBroadcast = multiInstanceInvalidationService3.f2115g.beginBroadcast();
                for (int i16 = 0; i16 < iBeginBroadcast; i16++) {
                    try {
                        Object broadcastCookie = multiInstanceInvalidationService3.f2115g.getBroadcastCookie(i16);
                        br.l.c(broadcastCookie, "null cannot be cast to non-null type kotlin.Int");
                        Integer num = (Integer) broadcastCookie;
                        int iIntValue = num.intValue();
                        String str3 = (String) multiInstanceInvalidationService3.f2114d.get(num);
                        if (i15 != iIntValue && str2.equals(str3)) {
                            try {
                                ((d) multiInstanceInvalidationService3.f2115g.getBroadcastItem(i16)).j(strArrCreateStringArray);
                            } catch (RemoteException e4) {
                                e0.q("ROOM", "Error invoking a remote callback", e4);
                            }
                        }
                    } finally {
                        multiInstanceInvalidationService3.f2115g.finishBroadcast();
                    }
                }
            }
        }
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}

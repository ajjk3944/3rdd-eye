package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import androidx.room.MultiInstanceInvalidationService;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class hf0 extends Binder implements IInterface {
    public final /* synthetic */ int f = 0;
    public final /* synthetic */ Object g;

    public hf0(k01 k01Var) {
        this.g = k01Var;
        attachInterface(this, "com.google.android.gms.appset.internal.IAppSetIdCallback");
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int i = this.f;
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        t10 t10Var = null;
        t10 t10Var2 = null;
        int i3 = 0;
        switch (this.f) {
            case 0:
                if (i == 1) {
                    parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                    IBinder strongBinder = parcel.readStrongBinder();
                    if (strongBinder != null) {
                        IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
                        if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof t10)) {
                            t10Var = new t10();
                            t10Var.f = strongBinder;
                        } else {
                            t10Var = (t10) iInterfaceQueryLocalInterface;
                        }
                    }
                    String string = parcel.readString();
                    if (string != null) {
                        synchronized (((MultiInstanceInvalidationService) this.g).h) {
                            try {
                                MultiInstanceInvalidationService multiInstanceInvalidationService = (MultiInstanceInvalidationService) this.g;
                                int i4 = multiInstanceInvalidationService.f + 1;
                                multiInstanceInvalidationService.f = i4;
                                if (multiInstanceInvalidationService.h.register(t10Var, Integer.valueOf(i4))) {
                                    ((MultiInstanceInvalidationService) this.g).g.put(Integer.valueOf(i4), string);
                                    i3 = i4;
                                } else {
                                    ((MultiInstanceInvalidationService) this.g).f--;
                                }
                            } finally {
                            }
                        }
                    }
                    parcel2.writeNoException();
                    parcel2.writeInt(i3);
                    return true;
                }
                if (i == 2) {
                    parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                    IBinder strongBinder2 = parcel.readStrongBinder();
                    if (strongBinder2 != null) {
                        IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
                        if (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof t10)) {
                            t10Var2 = new t10();
                            t10Var2.f = strongBinder2;
                        } else {
                            t10Var2 = (t10) iInterfaceQueryLocalInterface2;
                        }
                    }
                    int i5 = parcel.readInt();
                    synchronized (((MultiInstanceInvalidationService) this.g).h) {
                        ((MultiInstanceInvalidationService) this.g).h.unregister(t10Var2);
                        ((MultiInstanceInvalidationService) this.g).g.remove(Integer.valueOf(i5));
                    }
                    parcel2.writeNoException();
                    return true;
                }
                if (i != 3) {
                    if (i != 1598968902) {
                        return super.onTransact(i, parcel, parcel2, i2);
                    }
                    parcel2.writeString("androidx.room.IMultiInstanceInvalidationService");
                    return true;
                }
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                int i6 = parcel.readInt();
                String[] strArrCreateStringArray = parcel.createStringArray();
                synchronized (((MultiInstanceInvalidationService) this.g).h) {
                    try {
                        String str = (String) ((MultiInstanceInvalidationService) this.g).g.get(Integer.valueOf(i6));
                        if (str == null) {
                            return true;
                        }
                        int iBeginBroadcast = ((MultiInstanceInvalidationService) this.g).h.beginBroadcast();
                        while (i3 < iBeginBroadcast) {
                            try {
                                Integer num = (Integer) ((MultiInstanceInvalidationService) this.g).h.getBroadcastCookie(i3);
                                int iIntValue = num.intValue();
                                String str2 = (String) ((MultiInstanceInvalidationService) this.g).g.get(num);
                                if (i6 != iIntValue && str.equals(str2)) {
                                    try {
                                        ((t10) ((MultiInstanceInvalidationService) this.g).h.getBroadcastItem(i3)).T(strArrCreateStringArray);
                                    } catch (RemoteException unused) {
                                    }
                                }
                                i3++;
                            } finally {
                                ((MultiInstanceInvalidationService) this.g).h.finishBroadcast();
                            }
                        }
                        return true;
                    } finally {
                    }
                }
            default:
                if (i > 16777215) {
                    if (!super.onTransact(i, parcel, parcel2, i2)) {
                    }
                    return true;
                }
                parcel.enforceInterface(getInterfaceDescriptor());
                if (i != 1) {
                    return false;
                }
                Parcelable.Creator<Status> creator = Status.CREATOR;
                int i7 = bc2.a;
                Status statusCreateFromParcel = parcel.readInt() == 0 ? null : creator.createFromParcel(parcel);
                jc2 jc2VarCreateFromParcel = parcel.readInt() == 0 ? null : jc2.CREATOR.createFromParcel(parcel);
                h8 h8Var = jc2VarCreateFromParcel != null ? new h8(jc2VarCreateFromParcel.f, jc2VarCreateFromParcel.g) : null;
                gi4 gi4Var = ((k01) this.g).a;
                if (statusCreateFromParcel.f <= 0) {
                    gi4Var.e(h8Var);
                } else {
                    gi4Var.d(new y4(statusCreateFromParcel));
                }
                return true;
        }
    }

    public hf0(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.g = multiInstanceInvalidationService;
        attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
    }
}

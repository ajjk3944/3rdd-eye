package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.room.MultiInstanceInvalidationService;
import androidx.room.a;

/* compiled from: IMultiInstanceInvalidationService.java */
/* loaded from: classes.dex */
public interface b extends IInterface {

    /* renamed from: f8, reason: collision with root package name */
    public static final String f16786f8 = "androidx$room$IMultiInstanceInvalidationService".replace('$', '.');

    int e(androidx.room.a aVar, String str) throws RemoteException;

    void p(int i, String[] strArr) throws RemoteException;

    void t(androidx.room.a aVar, int i) throws RemoteException;

    /* compiled from: IMultiInstanceInvalidationService.java */
    public static abstract class a extends Binder implements b {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int f16787b = 0;

        /* compiled from: IMultiInstanceInvalidationService.java */
        /* renamed from: androidx.room.b$a$a, reason: collision with other inner class name */
        public static class C0264a implements b {

            /* renamed from: b, reason: collision with root package name */
            public IBinder f16788b;

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f16788b;
            }

            @Override // androidx.room.b
            public final int e(androidx.room.a aVar, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f16786f8);
                    parcelObtain.writeStrongInterface(aVar);
                    parcelObtain.writeString(str);
                    this.f16788b.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.room.b
            public final void p(int i, String[] strArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f16786f8);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeStringArray(strArr);
                    this.f16788b.transact(3, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.room.b
            public final void t(androidx.room.a aVar, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f16786f8);
                    parcelObtain.writeStrongInterface(aVar);
                    parcelObtain.writeInt(i);
                    this.f16788b.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
            String str = b.f16786f8;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            androidx.room.a aVar = null;
            androidx.room.a aVar2 = null;
            if (i == 1) {
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(androidx.room.a.f16784e8);
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof androidx.room.a)) {
                        a.AbstractBinderC0262a.C0263a c0263a = new a.AbstractBinderC0262a.C0263a();
                        c0263a.f16785b = strongBinder;
                        aVar = c0263a;
                    } else {
                        aVar = (androidx.room.a) iInterfaceQueryLocalInterface;
                    }
                }
                int iE = ((MultiInstanceInvalidationService.a) this).e(aVar, parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(iE);
                return true;
            }
            if (i != 2) {
                if (i != 3) {
                    return super.onTransact(i, parcel, parcel2, i10);
                }
                ((MultiInstanceInvalidationService.a) this).p(parcel.readInt(), parcel.createStringArray());
                return true;
            }
            IBinder strongBinder2 = parcel.readStrongBinder();
            if (strongBinder2 != null) {
                IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface(androidx.room.a.f16784e8);
                if (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof androidx.room.a)) {
                    a.AbstractBinderC0262a.C0263a c0263a2 = new a.AbstractBinderC0262a.C0263a();
                    c0263a2.f16785b = strongBinder2;
                    aVar2 = c0263a2;
                } else {
                    aVar2 = (androidx.room.a) iInterfaceQueryLocalInterface2;
                }
            }
            ((MultiInstanceInvalidationService.a) this).t(aVar2, parcel.readInt());
            parcel2.writeNoException();
            return true;
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }
    }
}

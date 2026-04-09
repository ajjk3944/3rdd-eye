package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.room.e;

/* compiled from: IMultiInstanceInvalidationCallback.java */
/* loaded from: classes.dex */
public interface a extends IInterface {

    /* renamed from: e8, reason: collision with root package name */
    public static final String f16784e8 = "androidx$room$IMultiInstanceInvalidationCallback".replace('$', '.');

    void c(String[] strArr) throws RemoteException;

    /* compiled from: IMultiInstanceInvalidationCallback.java */
    /* renamed from: androidx.room.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0262a extends Binder implements a {

        /* compiled from: IMultiInstanceInvalidationCallback.java */
        /* renamed from: androidx.room.a$a$a, reason: collision with other inner class name */
        public static class C0263a implements a {

            /* renamed from: b, reason: collision with root package name */
            public IBinder f16785b;

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f16785b;
            }

            @Override // androidx.room.a
            public final void c(String[] strArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f16784e8);
                    parcelObtain.writeStringArray(strArr);
                    this.f16785b.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
            String str = a.f16784e8;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i10);
            }
            ((e.a) this).c(parcel.createStringArray());
            return true;
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }
    }
}

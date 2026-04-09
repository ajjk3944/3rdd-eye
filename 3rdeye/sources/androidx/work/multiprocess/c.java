package androidx.work.multiprocess;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: IWorkManagerImplCallback.java */
/* loaded from: classes.dex */
public interface c extends IInterface {

    /* renamed from: i8, reason: collision with root package name */
    public static final String f16985i8 = "androidx$work$multiprocess$IWorkManagerImplCallback".replace('$', '.');

    void n(byte[] bArr) throws RemoteException;

    void onFailure(String str) throws RemoteException;

    /* compiled from: IWorkManagerImplCallback.java */
    public static abstract class a extends Binder implements c {

        /* compiled from: IWorkManagerImplCallback.java */
        /* renamed from: androidx.work.multiprocess.c$a$a, reason: collision with other inner class name */
        public static class C0271a implements c {

            /* renamed from: b, reason: collision with root package name */
            public IBinder f16986b;

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f16986b;
            }

            @Override // androidx.work.multiprocess.c
            public final void n(byte[] bArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c.f16985i8);
                    parcelObtain.writeByteArray(bArr);
                    this.f16986b.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.work.multiprocess.c
            public final void onFailure(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c.f16985i8);
                    parcelObtain.writeString(str);
                    this.f16986b.transact(2, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public static c v(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(c.f16985i8);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof c)) {
                return (c) iInterfaceQueryLocalInterface;
            }
            C0271a c0271a = new C0271a();
            c0271a.f16986b = iBinder;
            return c0271a;
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
            String str = c.f16985i8;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i == 1) {
                ((g) this).n(parcel.createByteArray());
            } else {
                if (i != 2) {
                    return super.onTransact(i, parcel, parcel2, i10);
                }
                ((g) this).onFailure(parcel.readString());
            }
            return true;
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }
    }
}

package androidx.work.multiprocess;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: IListenableWorkerImpl.java */
/* loaded from: classes.dex */
public interface a extends IInterface {

    /* renamed from: g8, reason: collision with root package name */
    public static final String f16979g8 = "androidx$work$multiprocess$IListenableWorkerImpl".replace('$', '.');

    /* compiled from: IListenableWorkerImpl.java */
    /* renamed from: androidx.work.multiprocess.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0268a extends Binder implements a {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int f16980b = 0;

        /* compiled from: IListenableWorkerImpl.java */
        /* renamed from: androidx.work.multiprocess.a$a$a, reason: collision with other inner class name */
        public static class C0269a implements a {

            /* renamed from: b, reason: collision with root package name */
            public IBinder f16981b;

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f16981b;
            }

            @Override // androidx.work.multiprocess.a
            public final void i(byte[] bArr, g gVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f16979g8);
                    parcelObtain.writeByteArray(bArr);
                    parcelObtain.writeStrongInterface(gVar);
                    this.f16981b.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.work.multiprocess.a
            public final void s(byte[] bArr, g gVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f16979g8);
                    parcelObtain.writeByteArray(bArr);
                    parcelObtain.writeStrongInterface(gVar);
                    this.f16981b.transact(2, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }
    }

    void i(byte[] bArr, g gVar) throws RemoteException;

    void s(byte[] bArr, g gVar) throws RemoteException;
}

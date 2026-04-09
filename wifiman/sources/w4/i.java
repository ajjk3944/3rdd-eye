package W4;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes3.dex */
public interface i extends IInterface {

    public static abstract class a extends Binder implements i {

        /* renamed from: W4.i$a$a, reason: collision with other inner class name */
        private static class C0876a implements i {

            /* renamed from: a, reason: collision with root package name */
            private IBinder f23625a;

            C0876a(IBinder iBinder) {
                this.f23625a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f23625a;
            }

            @Override // W4.i
            public void q(h hVar, String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.google.firebase.dynamiclinks.internal.IDynamicLinksService");
                    parcelObtain.writeStrongInterface(hVar);
                    parcelObtain.writeString(str);
                    this.f23625a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public static i b(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.firebase.dynamiclinks.internal.IDynamicLinksService");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof i)) ? new C0876a(iBinder) : (i) iInterfaceQueryLocalInterface;
        }
    }

    void q(h hVar, String str);
}

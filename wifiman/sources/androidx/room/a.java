package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public interface a extends IInterface {

    /* renamed from: g, reason: collision with root package name */
    public static final String f32274g = "androidx$room$IMultiInstanceInvalidationCallback".replace('$', '.');

    /* renamed from: androidx.room.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC1121a extends Binder implements a {

        /* renamed from: androidx.room.a$a$a, reason: collision with other inner class name */
        private static class C1122a implements a {

            /* renamed from: a, reason: collision with root package name */
            private IBinder f32275a;

            C1122a(IBinder iBinder) {
                this.f32275a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f32275a;
            }

            @Override // androidx.room.a
            public void r(String[] strArr) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f32274g);
                    parcelObtain.writeStringArray(strArr);
                    this.f32275a.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public AbstractBinderC1121a() {
            attachInterface(this, a.f32274g);
        }

        public static a b(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(a.f32274g);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof a)) ? new C1122a(iBinder) : (a) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            String str = a.f32274g;
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i10 != 1) {
                return super.onTransact(i10, parcel, parcel2, i11);
            }
            r(parcel.createStringArray());
            return true;
        }
    }

    void r(String[] strArr);
}

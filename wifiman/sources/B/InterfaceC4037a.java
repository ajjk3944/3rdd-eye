package b;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: b.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC4037a extends IInterface {

    /* renamed from: i, reason: collision with root package name */
    public static final String f32638i = "android$support$v4$app$INotificationSideChannel".replace('$', '.');

    /* renamed from: b.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC1135a extends Binder implements InterfaceC4037a {

        /* renamed from: b.a$a$a, reason: collision with other inner class name */
        private static class C1136a implements InterfaceC4037a {

            /* renamed from: a, reason: collision with root package name */
            private IBinder f32639a;

            C1136a(IBinder iBinder) {
                this.f32639a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f32639a;
            }

            @Override // b.InterfaceC4037a
            public void h0(String str, int i10, String str2, Notification notification) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(InterfaceC4037a.f32638i);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeString(str2);
                    b.b(parcelObtain, notification, 0);
                    this.f32639a.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public static InterfaceC4037a b(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(InterfaceC4037a.f32638i);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC4037a)) ? new C1136a(iBinder) : (InterfaceC4037a) iInterfaceQueryLocalInterface;
        }
    }

    /* renamed from: b.a$b */
    public static class b {
        /* JADX INFO: Access modifiers changed from: private */
        public static void b(Parcel parcel, Parcelable parcelable, int i10) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcelable.writeToParcel(parcel, i10);
            }
        }
    }

    void h0(String str, int i10, String str2, Notification notification);
}

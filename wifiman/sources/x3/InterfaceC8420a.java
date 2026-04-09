package x3;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: x3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC8420a extends IInterface {

    /* renamed from: x3.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC2309a extends B3.c implements InterfaceC8420a {
        public AbstractBinderC2309a() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
        }

        public static InterfaceC8420a c(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            return iInterfaceQueryLocalInterface instanceof InterfaceC8420a ? (InterfaceC8420a) iInterfaceQueryLocalInterface : new c(iBinder);
        }
    }
}

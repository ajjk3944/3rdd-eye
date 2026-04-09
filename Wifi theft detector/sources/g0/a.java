package g0;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public interface a extends IInterface {
    public static final String D8 = "androidx$core$app$unusedapprestrictions$IUnusedAppRestrictionsBackportCallback".replace('$', '.');

    /* renamed from: g0.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0400a extends Binder implements a {

        /* renamed from: g0.a$a$a, reason: collision with other inner class name */
        public static class C0401a implements a {

            /* renamed from: a, reason: collision with root package name */
            public IBinder f21177a;

            public C0401a(IBinder iBinder) {
                this.f21177a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f21177a;
            }
        }

        public static a f(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(a.D8);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof a)) ? new C0401a(iBinder) : (a) iInterfaceQueryLocalInterface;
        }
    }
}

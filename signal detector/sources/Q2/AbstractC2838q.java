package q2;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.AbstractC1103ea;
import com.google.android.gms.internal.ads.AbstractC1857sa;
import com.google.android.gms.internal.ads.H9;
import u2.C2954d;

/* renamed from: q2.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2838q {

    /* renamed from: a, reason: collision with root package name */
    public static final Y f23259a;

    static {
        Y x6 = null;
        try {
            Object objNewInstance = C2834o.class.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi").getDeclaredConstructor(null).newInstance(null);
            if (objNewInstance instanceof IBinder) {
                IBinder iBinder = (IBinder) objNewInstance;
                if (iBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IClientApi");
                    x6 = iInterfaceQueryLocalInterface instanceof Y ? (Y) iInterfaceQueryLocalInterface : new X(iBinder, "com.google.android.gms.ads.internal.client.IClientApi", 2);
                }
            } else {
                u2.k.h("ClientApi class is not an instance of IBinder.");
            }
        } catch (Exception unused) {
            u2.k.h("Failed to instantiate ClientApi class.");
        }
        f23259a = x6;
    }

    public abstract Object a();

    public abstract Object b();

    public abstract Object c(Y y3);

    public final Object d(Context context, boolean z6) {
        boolean z7;
        Object objB;
        Object objC;
        if (!z6) {
            u2.f fVar = r.f23260g.f23261a;
            if (J2.f.f2059b.c(context, 12451000) != 0) {
                u2.k.c("Google Play Services is not available.");
                z6 = true;
            }
        }
        boolean z8 = false;
        boolean z9 = !(T2.e.a(context) <= T2.e.d(context, false));
        H9.a(context);
        if (((Boolean) AbstractC1103ea.f13906a.v()).booleanValue()) {
            z7 = false;
        } else if (((Boolean) AbstractC1103ea.f13907b.v()).booleanValue()) {
            z7 = true;
            z8 = true;
        } else {
            z8 = z6 | z9;
            z7 = false;
        }
        Y y3 = f23259a;
        Object objC2 = null;
        if (z8) {
            if (y3 != null) {
                try {
                    objC = c(y3);
                } catch (RemoteException e6) {
                    u2.k.i("Cannot invoke local loader using ClientApi class.", e6);
                }
                if (objC == null && !z7) {
                    try {
                        objC2 = b();
                    } catch (RemoteException e7) {
                        u2.k.i("Cannot invoke remote loader.", e7);
                    }
                    objC = objC2;
                }
            } else {
                u2.k.h("ClientApi class cannot be loaded.");
            }
            objC = null;
            if (objC == null) {
                objC2 = b();
                objC = objC2;
            }
        } else {
            try {
                objB = b();
            } catch (RemoteException e8) {
                u2.k.i("Cannot invoke remote loader.", e8);
                objB = null;
            }
            if (objB == null) {
                int iIntValue = ((Long) AbstractC1857sa.f16749a.v()).intValue();
                r rVar = r.f23260g;
                if (rVar.f23265e.nextInt(iIntValue) == 0) {
                    Bundle bundle = new Bundle();
                    bundle.putString("action", "dynamite_load");
                    bundle.putInt("is_missing", 1);
                    u2.f fVar2 = rVar.f23261a;
                    String str = rVar.f23264d.f23784a;
                    fVar2.getClass();
                    u2.f.a(context, str, bundle, new C2954d(fVar2, context));
                }
            }
            if (objB == null) {
                if (y3 != null) {
                    try {
                        objC2 = c(y3);
                    } catch (RemoteException e9) {
                        u2.k.i("Cannot invoke local loader using ClientApi class.", e9);
                    }
                } else {
                    u2.k.h("ClientApi class cannot be loaded.");
                }
                objC = objC2;
            } else {
                objC = objB;
            }
        }
        return objC == null ? a() : objC;
    }
}

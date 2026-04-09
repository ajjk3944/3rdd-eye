package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class zu1 {
    public static final ek2 a;

    static {
        ek2 ej2Var = null;
        try {
            Object objNewInstance = bu1.class.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi").getDeclaredConstructor(null).newInstance(null);
            if (objNewInstance instanceof IBinder) {
                IBinder iBinder = (IBinder) objNewInstance;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IClientApi");
                ej2Var = iInterfaceQueryLocalInterface instanceof ek2 ? (ek2) iInterfaceQueryLocalInterface : new ej2(iBinder, "com.google.android.gms.ads.internal.client.IClientApi", 2);
            } else {
                gi2.i0("ClientApi class is not an instance of IBinder.");
            }
        } catch (Exception unused) {
            gi2.i0("Failed to instantiate ClientApi class.");
        }
        a = ej2Var;
    }

    public abstract Object a();

    public abstract Object b();

    public abstract Object c(ek2 ek2Var);

    public final Object d(Context context, boolean z) {
        boolean z2;
        Object objB;
        Object objC;
        if (!z) {
            j63 j63Var = sv1.f.a;
            if (gz.b.c(context, 12451000) != 0) {
                gi2.U("Google Play Services is not available.");
                z = true;
            }
        }
        boolean z3 = false;
        boolean z4 = !(ar.a(context) <= ar.d(context, false));
        mz1.a(context);
        if (((Boolean) o02.a.w()).booleanValue()) {
            z2 = false;
        } else if (((Boolean) o02.b.w()).booleanValue()) {
            z2 = true;
            z3 = true;
        } else {
            z3 = z | z4;
            z2 = false;
        }
        ek2 ek2Var = a;
        Object objC2 = null;
        if (z3) {
            if (ek2Var != null) {
                try {
                    objC = c(ek2Var);
                } catch (RemoteException unused) {
                    gi2.q0(5);
                }
                if (objC == null && !z2) {
                    try {
                        objC2 = b();
                    } catch (RemoteException unused2) {
                        gi2.q0(5);
                    }
                    objC = objC2;
                }
            } else {
                gi2.i0("ClientApi class cannot be loaded.");
            }
            objC = null;
            if (objC == null) {
                objC2 = b();
                objC = objC2;
            }
        } else {
            try {
                objB = b();
            } catch (RemoteException unused3) {
                gi2.q0(5);
                objB = null;
            }
            if (objB == null) {
                int iIntValue = ((Long) f12.a.w()).intValue();
                sv1 sv1Var = sv1.f;
                if (sv1Var.e.nextInt(iIntValue) == 0) {
                    Bundle bundle = new Bundle();
                    bundle.putString("action", "dynamite_load");
                    bundle.putInt("is_missing", 1);
                    j63 j63Var2 = sv1Var.a;
                    String str = sv1Var.d.f;
                    j63Var2.getClass();
                    j63.a(context, str, bundle, new l92((Object) j63Var2, (Object) context, false));
                }
            }
            if (objB == null) {
                if (ek2Var != null) {
                    try {
                        objC2 = c(ek2Var);
                    } catch (RemoteException unused4) {
                        gi2.q0(5);
                    }
                } else {
                    gi2.i0("ClientApi class cannot be loaded.");
                }
                objC = objC2;
            } else {
                objC = objB;
            }
        }
        return objC == null ? a() : objC;
    }
}

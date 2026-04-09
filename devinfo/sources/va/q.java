package va;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.dm;
import com.google.android.gms.internal.ads.pl;
import com.google.android.gms.internal.ads.sk;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static final x0 f36156a;

    static {
        x0 w0Var = null;
        try {
            Object objNewInstance = o.class.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi").getDeclaredConstructor(null).newInstance(null);
            if (objNewInstance instanceof IBinder) {
                IBinder iBinder = (IBinder) objNewInstance;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IClientApi");
                w0Var = iInterfaceQueryLocalInterface instanceof x0 ? (x0) iInterfaceQueryLocalInterface : new w0(iBinder, "com.google.android.gms.ads.internal.client.IClientApi", 1);
            } else {
                za.i.h("ClientApi class is not an instance of IBinder.");
            }
        } catch (Exception unused) {
            za.i.h("Failed to instantiate ClientApi class.");
        }
        f36156a = w0Var;
    }

    public abstract Object a();

    public abstract Object b();

    public abstract Object c(x0 x0Var);

    public final Object d(Context context, boolean z3) {
        boolean z10;
        Object objB;
        Object objC;
        if (!z3) {
            za.d dVar = r.g.f36157a;
            if (nb.f.f29899b.c(12451000, context) != 0) {
                za.i.c("Google Play Services is not available.");
                z3 = true;
            }
        }
        boolean z11 = false;
        boolean z12 = !(wb.d.a(context, ModuleDescriptor.MODULE_ID) <= wb.d.d(context, ModuleDescriptor.MODULE_ID, false));
        sk.a(context);
        if (((Boolean) pl.f15034a.u()).booleanValue()) {
            z10 = false;
        } else if (((Boolean) pl.f15035b.u()).booleanValue()) {
            z10 = true;
            z11 = true;
        } else {
            z11 = z3 | z12;
            z10 = false;
        }
        x0 x0Var = f36156a;
        Object objC2 = null;
        if (z11) {
            if (x0Var != null) {
                try {
                    objC = c(x0Var);
                } catch (RemoteException e2) {
                    za.i.i("Cannot invoke local loader using ClientApi class.", e2);
                }
                if (objC == null && !z10) {
                    try {
                        objC2 = b();
                    } catch (RemoteException e10) {
                        za.i.i("Cannot invoke remote loader.", e10);
                    }
                    objC = objC2;
                }
            } else {
                za.i.h("ClientApi class cannot be loaded.");
            }
            objC = null;
            if (objC == null) {
                objC2 = b();
                objC = objC2;
            }
        } else {
            try {
                objB = b();
            } catch (RemoteException e11) {
                za.i.i("Cannot invoke remote loader.", e11);
                objB = null;
            }
            if (objB == null) {
                int iIntValue = ((Long) dm.f10516a.u()).intValue();
                r rVar = r.g;
                if (rVar.f36161e.nextInt(iIntValue) == 0) {
                    Bundle bundle = new Bundle();
                    bundle.putString("action", "dynamite_load");
                    bundle.putInt("is_missing", 1);
                    za.d dVar2 = rVar.f36157a;
                    String str = rVar.f36160d.f38129a;
                    dVar2.getClass();
                    za.d.a(context, str, bundle, new ya.n(dVar2, context));
                }
            }
            if (objB == null) {
                if (x0Var != null) {
                    try {
                        objC2 = c(x0Var);
                    } catch (RemoteException e12) {
                        za.i.i("Cannot invoke local loader using ClientApi class.", e12);
                    }
                } else {
                    za.i.h("ClientApi class cannot be loaded.");
                }
                objC = objC2;
            } else {
                objC = objB;
            }
        }
        return objC == null ? a() : objC;
    }
}

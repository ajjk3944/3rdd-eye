package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class fw0 {

    /* renamed from: a, reason: collision with root package name */
    public final hw0 f11270a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f11271b = true;

    public fw0(hw0 hw0Var) {
        this.f11270a = hw0Var;
    }

    public static fw0 a(Context context, String str) throws rv0 {
        hw0 gw0Var;
        try {
            try {
                try {
                    IBinder iBinderB = wb.d.c(context, wb.d.f36579b, ModuleDescriptor.MODULE_ID).b("com.google.android.gms.gass.internal.clearcut.GassDynamiteClearcutLogger");
                    if (iBinderB == null) {
                        gw0Var = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
                        gw0Var = iInterfaceQueryLocalInterface instanceof hw0 ? (hw0) iInterfaceQueryLocalInterface : new gw0(iBinderB, "com.google.android.gms.gass.internal.clearcut.IGassClearcut", 1);
                    }
                    gw0Var.b2(new vb.b(context), str);
                    Log.i("GASS", "GassClearcutLogger Initialized.");
                    return new fw0(gw0Var);
                } catch (Exception e2) {
                    throw new rv0(e2);
                }
            } catch (RemoteException | rv0 | NullPointerException | SecurityException unused) {
                Log.d("GASS", "Cannot dynamite load clearcut");
                return new fw0(new iw0());
            }
        } catch (Exception e10) {
            throw new rv0(e10);
        }
    }
}

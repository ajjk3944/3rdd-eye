package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;

/* renamed from: com.google.android.gms.internal.ads.bx, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0963bx {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1071dx f13502a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f13503b = true;

    public C0963bx(InterfaceC1071dx interfaceC1071dx) {
        this.f13502a = interfaceC1071dx;
    }

    public static C0963bx a(Context context, String str) throws Nw {
        InterfaceC1071dx c1017cx;
        try {
            try {
                try {
                    IBinder iBinderB = T2.e.c(context, T2.e.f3572b).b("com.google.android.gms.gass.internal.clearcut.GassDynamiteClearcutLogger");
                    if (iBinderB == null) {
                        c1017cx = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
                        c1017cx = iInterfaceQueryLocalInterface instanceof InterfaceC1071dx ? (InterfaceC1071dx) iInterfaceQueryLocalInterface : new C1017cx(iBinderB, "com.google.android.gms.gass.internal.clearcut.IGassClearcut", 2);
                    }
                    c1017cx.A1(new S2.b(context), str);
                    Log.i("GASS", "GassClearcutLogger Initialized.");
                    return new C0963bx(c1017cx);
                } catch (Exception e6) {
                    throw new Nw(e6);
                }
            } catch (RemoteException | Nw | NullPointerException | SecurityException unused) {
                Log.d("GASS", "Cannot dynamite load clearcut");
                return new C0963bx(new BinderC1126ex());
            }
        } catch (Exception e7) {
            throw new Nw(e7);
        }
    }
}

package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.measurement.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC4316c0 extends AbstractBinderC4307b0 implements InterfaceC4325d0 {
    public static InterfaceC4325d0 c(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
        return iInterfaceQueryLocalInterface instanceof InterfaceC4325d0 ? (InterfaceC4325d0) iInterfaceQueryLocalInterface : new C4334e0(iBinder);
    }
}

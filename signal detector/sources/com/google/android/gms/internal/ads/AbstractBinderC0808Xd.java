package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.Xd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC0808Xd extends B7 implements InterfaceC0825Yd {
    public static InterfaceC0825Yd K3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
        return iInterfaceQueryLocalInterface instanceof InterfaceC0825Yd ? (InterfaceC0825Yd) iInterfaceQueryLocalInterface : new C0791Wd(iBinder, "com.google.android.gms.ads.internal.query.IUpdateUrlsCallback", 2);
    }
}

package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class i92 extends hv1 implements j92 {
    public static j92 B3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
        return iInterfaceQueryLocalInterface instanceof j92 ? (j92) iInterfaceQueryLocalInterface : new h92(iBinder, "com.google.android.gms.ads.internal.query.IUpdateUrlsCallback", 2);
    }
}

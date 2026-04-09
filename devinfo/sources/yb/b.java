package yb;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.appset.zze;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b extends pb.h {
    @Override // pb.e
    public final int j() {
        return 212800000;
    }

    @Override // pb.e
    public final /* synthetic */ IInterface o(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.appset.internal.IAppSetService");
        return iInterfaceQueryLocalInterface instanceof c ? (c) iInterfaceQueryLocalInterface : new c(iBinder);
    }

    @Override // pb.e
    public final nb.d[] q() {
        return zze.zzb;
    }

    @Override // pb.e
    public final String u() {
        return "com.google.android.gms.appset.internal.IAppSetService";
    }

    @Override // pb.e
    public final String v() {
        return "com.google.android.gms.appset.service.START";
    }

    @Override // pb.e
    public final boolean w() {
        return true;
    }
}

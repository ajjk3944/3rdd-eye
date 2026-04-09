package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class kn2 extends cz {
    @Override // defpackage.w9, defpackage.v4
    public final int e() {
        return 212800000;
    }

    @Override // defpackage.w9
    public final /* synthetic */ IInterface o(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.appset.internal.IAppSetService");
        return iInterfaceQueryLocalInterface instanceof gh3 ? (gh3) iInterfaceQueryLocalInterface : new gh3(iBinder);
    }

    @Override // defpackage.w9
    public final ju[] q() {
        return uk2.m;
    }

    @Override // defpackage.w9
    public final String u() {
        return "com.google.android.gms.appset.internal.IAppSetService";
    }

    @Override // defpackage.w9
    public final String v() {
        return "com.google.android.gms.appset.service.START";
    }

    @Override // defpackage.w9
    public final boolean w() {
        return true;
    }
}

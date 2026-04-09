package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class vd3 extends dc2 {
    public final int y;

    public vd3(Context context, Looper looper, t9 t9Var, u9 u9Var, int i) {
        super(context, looper, 116, t9Var, u9Var);
        this.y = i;
    }

    @Override // defpackage.w9, defpackage.v4
    public final int e() {
        return this.y;
    }

    @Override // defpackage.w9
    public final IInterface o(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.gass.internal.IGassService");
        return iInterfaceQueryLocalInterface instanceof yd3 ? (yd3) iInterfaceQueryLocalInterface : new yd3(iBinder, "com.google.android.gms.gass.internal.IGassService", 2);
    }

    @Override // defpackage.w9
    public final String u() {
        return "com.google.android.gms.gass.internal.IGassService";
    }

    @Override // defpackage.w9
    public final String v() {
        return "com.google.android.gms.gass.START";
    }
}

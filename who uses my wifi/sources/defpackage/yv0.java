package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class yv0 extends cz implements v4 {
    public final bu1 A;
    public final Bundle B;
    public final Integer C;
    public final boolean z;

    public yv0(Context context, Looper looper, bu1 bu1Var, Bundle bundle, hz hzVar, iz izVar) {
        super(context, looper, 44, bu1Var, hzVar, izVar);
        this.z = true;
        this.A = bu1Var;
        this.B = bundle;
        this.C = (Integer) bu1Var.l;
    }

    @Override // defpackage.w9, defpackage.v4
    public final int e() {
        return 12451000;
    }

    @Override // defpackage.w9, defpackage.v4
    public final boolean l() {
        return this.z;
    }

    @Override // defpackage.w9
    public final IInterface o(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof nc1 ? (nc1) iInterfaceQueryLocalInterface : new nc1(iBinder, "com.google.android.gms.signin.internal.ISignInService", 0);
    }

    @Override // defpackage.w9
    public final Bundle r() {
        bu1 bu1Var = this.A;
        boolean zEquals = this.c.getPackageName().equals((String) bu1Var.i);
        Bundle bundle = this.B;
        if (!zEquals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", (String) bu1Var.i);
        }
        return bundle;
    }

    @Override // defpackage.w9
    public final String u() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // defpackage.w9
    public final String v() {
        return "com.google.android.gms.signin.service.START";
    }
}

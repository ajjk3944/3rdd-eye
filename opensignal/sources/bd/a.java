package bd;

import ac.g;
import ac.h;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import cc.f;
import h9.r2;

/* loaded from: classes.dex */
public final class a extends f implements ac.c {
    public final boolean A;
    public final r2 B;
    public final Bundle C;
    public final Integer D;

    public a(Context context, Looper looper, r2 r2Var, Bundle bundle, g gVar, h hVar) {
        super(context, looper, 44, r2Var, gVar, hVar);
        this.A = true;
        this.B = r2Var;
        this.C = bundle;
        this.D = (Integer) r2Var.f10475y;
    }

    @Override // cc.e, ac.c
    public final int a() {
        return 12451000;
    }

    @Override // cc.e, ac.c
    public final boolean b() {
        return this.A;
    }

    @Override // cc.e
    public final IInterface d(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof c ? (c) iInterfaceQueryLocalInterface : new c(iBinder, "com.google.android.gms.signin.internal.ISignInService", 1);
    }

    @Override // cc.e
    public final Bundle j() {
        r2 r2Var = this.B;
        boolean zEquals = this.f3617c.getPackageName().equals((String) r2Var.f10472g);
        Bundle bundle = this.C;
        if (!zEquals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", (String) r2Var.f10472g);
        }
        return bundle;
    }

    @Override // cc.e
    public final String n() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // cc.e
    public final String o() {
        return "com.google.android.gms.signin.service.START";
    }
}

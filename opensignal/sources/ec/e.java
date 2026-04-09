package ec;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import bc.n;
import cc.f;
import cc.i;
import com.google.android.gms.common.Feature;
import h9.r2;

/* loaded from: classes.dex */
public final class e extends f {
    public final i A;

    public e(Context context, Looper looper, r2 r2Var, i iVar, n nVar, n nVar2) {
        super(context, looper, 270, r2Var, nVar, nVar2);
        this.A = iVar;
    }

    @Override // cc.e, ac.c
    public final int a() {
        return 203400000;
    }

    @Override // cc.e
    public final IInterface d(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return iInterfaceQueryLocalInterface instanceof c ? (c) iInterfaceQueryLocalInterface : new c(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService", 1);
    }

    @Override // cc.e
    public final Feature[] h() {
        return mc.c.f16675c;
    }

    @Override // cc.e
    public final Bundle j() {
        i iVar = this.A;
        iVar.getClass();
        Bundle bundle = new Bundle();
        String str = iVar.f3654b;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    @Override // cc.e
    public final String n() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // cc.e
    public final String o() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // cc.e
    public final boolean p() {
        return true;
    }
}

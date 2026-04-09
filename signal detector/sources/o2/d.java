package O2;

import L2.k;
import M2.AbstractC0168h;
import M2.n;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import q2.C2834o;

/* loaded from: classes.dex */
public final class d extends AbstractC0168h {

    /* renamed from: z, reason: collision with root package name */
    public final n f3065z;

    public d(Context context, Looper looper, C2834o c2834o, n nVar, k kVar, k kVar2) {
        super(context, looper, 270, c2834o, kVar, kVar2);
        this.f3065z = nVar;
    }

    @Override // M2.AbstractC0165e, K2.c
    public final int j() {
        return 203400000;
    }

    @Override // M2.AbstractC0165e
    public final IInterface o(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return iInterfaceQueryLocalInterface instanceof a ? (a) iInterfaceQueryLocalInterface : new a(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService", 0);
    }

    @Override // M2.AbstractC0165e
    public final J2.d[] q() {
        return W2.c.f4020b;
    }

    @Override // M2.AbstractC0165e
    public final Bundle r() {
        this.f3065z.getClass();
        return new Bundle();
    }

    @Override // M2.AbstractC0165e
    public final String u() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // M2.AbstractC0165e
    public final String v() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // M2.AbstractC0165e
    public final boolean w() {
        return true;
    }
}

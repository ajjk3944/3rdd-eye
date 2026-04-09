package fj;

import android.telephony.TelephonyManager;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class j extends t {

    /* renamed from: h, reason: collision with root package name */
    public final TelephonyManager f8927h;

    /* renamed from: i, reason: collision with root package name */
    public final ag.b f8928i;
    public final Executor j;
    public final c k;

    /* renamed from: l, reason: collision with root package name */
    public d f8929l;

    public j(TelephonyManager telephonyManager, ag.b bVar, xj.j jVar, Executor executor) {
        super(jVar);
        this.f8927h = telephonyManager;
        this.f8928i = bVar;
        this.j = executor;
        this.k = new c(this);
    }

    @Override // fj.t
    public final void h() {
        ag.b bVar = this.f8928i;
        boolean zI = bVar.i("android.permission.ACCESS_FINE_LOCATION");
        Executor executor = this.j;
        TelephonyManager telephonyManager = this.f8927h;
        if (!zI || !bVar.i("android.permission.READ_PHONE_STATE")) {
            ch.n.b("TelephonyPhoneStateCallback", "Not all permission granted: registering default callback");
            if (telephonyManager != null) {
                telephonyManager.registerTelephonyCallback(executor, this.k);
                return;
            }
            return;
        }
        ch.n.b("TelephonyPhoneStateCallback", "All permission granted: registering callback for CELL_INFO And CELL_LOCATION");
        d dVar = new d(this);
        this.f8929l = dVar;
        if (telephonyManager != null) {
            telephonyManager.registerTelephonyCallback(executor, dVar);
        }
    }

    @Override // fj.t
    public final void i() {
        TelephonyManager telephonyManager = this.f8927h;
        if (telephonyManager != null) {
            telephonyManager.unregisterTelephonyCallback(this.k);
        }
        d dVar = this.f8929l;
        if (dVar == null || telephonyManager == null) {
            return;
        }
        telephonyManager.unregisterTelephonyCallback(i.g(dVar));
    }
}

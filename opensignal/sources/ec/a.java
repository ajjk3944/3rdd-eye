package ec;

import android.os.IBinder;
import android.os.IInterface;
import cc.f;
import com.google.android.gms.common.Feature;

/* loaded from: classes.dex */
public final class a extends f {
    @Override // cc.e, ac.c
    public final int a() {
        return 253600000;
    }

    @Override // cc.e
    public final IInterface d(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientNotificationTelemetryService");
        return iInterfaceQueryLocalInterface instanceof b ? (b) iInterfaceQueryLocalInterface : new b(iBinder, "com.google.android.gms.common.internal.service.IClientNotificationTelemetryService", 1);
    }

    @Override // cc.e
    public final Feature[] h() {
        return mc.c.f16675c;
    }

    @Override // cc.e
    public final String n() {
        return "com.google.android.gms.common.internal.service.IClientNotificationTelemetryService";
    }

    @Override // cc.e
    public final String o() {
        return "com.google.android.gms.common.telemetry.notification.service.START";
    }

    @Override // cc.e
    public final boolean p() {
        return true;
    }
}

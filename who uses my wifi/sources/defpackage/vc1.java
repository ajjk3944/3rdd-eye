package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class vc1 extends cz {
    public final r01 z;

    public vc1(Context context, Looper looper, bu1 bu1Var, r01 r01Var, xb1 xb1Var, xb1 xb1Var2) {
        super(context, looper, 270, bu1Var, xb1Var, xb1Var2);
        this.z = r01Var;
    }

    @Override // defpackage.w9, defpackage.v4
    public final int e() {
        return 203400000;
    }

    @Override // defpackage.w9
    public final IInterface o(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return iInterfaceQueryLocalInterface instanceof rc1 ? (rc1) iInterfaceQueryLocalInterface : new rc1(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService", 0);
    }

    @Override // defpackage.w9
    public final ju[] q() {
        return a30.m;
    }

    @Override // defpackage.w9
    public final Bundle r() {
        this.z.getClass();
        return new Bundle();
    }

    @Override // defpackage.w9
    public final String u() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // defpackage.w9
    public final String v() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // defpackage.w9
    public final boolean w() {
        return true;
    }
}

package rb;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.internal.n;
import nb.d;
import pb.h;
import pb.o;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c extends h {

    /* renamed from: z, reason: collision with root package name */
    public final o f32900z;

    public c(Context context, Looper looper, va.o oVar, o oVar2, n nVar, n nVar2) {
        super(context, looper, 270, oVar, nVar, nVar2);
        this.f32900z = oVar2;
    }

    @Override // pb.e
    public final int j() {
        return 203400000;
    }

    @Override // pb.e
    public final IInterface o(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return iInterfaceQueryLocalInterface instanceof a ? (a) iInterfaceQueryLocalInterface : new a(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService", 4);
    }

    @Override // pb.e
    public final d[] q() {
        return zb.b.f38167b;
    }

    @Override // pb.e
    public final Bundle r() {
        o oVar = this.f32900z;
        oVar.getClass();
        Bundle bundle = new Bundle();
        String str = oVar.f31653b;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    @Override // pb.e
    public final String u() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // pb.e
    public final String v() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // pb.e
    public final boolean w() {
        return true;
    }
}

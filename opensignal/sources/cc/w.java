package cc;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.zzj;

/* loaded from: classes.dex */
public final class w extends mc.a {

    /* renamed from: e, reason: collision with root package name */
    public e f3676e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3677f;

    public w(e eVar, int i10) {
        super("com.google.android.gms.common.internal.IGmsCallbacks", 1);
        this.f3676e = eVar;
        this.f3677f = i10;
    }

    @Override // mc.a
    public final boolean S(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 == 1) {
            int i11 = parcel.readInt();
            IBinder strongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) oc.h.a(parcel, Bundle.CREATOR);
            oc.h.c(parcel);
            s.i(this.f3676e, "onPostInitComplete can be called only once per call to getRemoteService");
            e eVar = this.f3676e;
            int i12 = this.f3677f;
            eVar.getClass();
            y yVar = new y(eVar, i11, strongBinder, bundle);
            v vVar = eVar.f3620f;
            vVar.sendMessage(vVar.obtainMessage(1, i12, -1, yVar));
            this.f3676e = null;
        } else if (i10 == 2) {
            parcel.readInt();
            oc.h.c(parcel);
            io.sentry.android.core.e0.r("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else {
            if (i10 != 3) {
                return false;
            }
            int i13 = parcel.readInt();
            IBinder strongBinder2 = parcel.readStrongBinder();
            zzj zzjVar = (zzj) oc.h.a(parcel, zzj.CREATOR);
            oc.h.c(parcel);
            e eVar2 = this.f3676e;
            s.i(eVar2, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            s.h(zzjVar);
            eVar2.f3635w = zzjVar;
            if (eVar2 instanceof pc.h) {
                ConnectionTelemetryConfiguration connectionTelemetryConfiguration = zzjVar.f4867r;
                h hVarB = h.b();
                RootTelemetryConfiguration rootTelemetryConfiguration = connectionTelemetryConfiguration == null ? null : connectionTelemetryConfiguration.f4825a;
                synchronized (hVarB) {
                    if (rootTelemetryConfiguration == null) {
                        rootTelemetryConfiguration = h.f3651c;
                    } else {
                        RootTelemetryConfiguration rootTelemetryConfiguration2 = (RootTelemetryConfiguration) hVarB.f3652a;
                        if (rootTelemetryConfiguration2 == null || rootTelemetryConfiguration2.f4843a < rootTelemetryConfiguration.f4843a) {
                        }
                    }
                    hVarB.f3652a = rootTelemetryConfiguration;
                }
            }
            Bundle bundle2 = zzjVar.f4864a;
            s.i(this.f3676e, "onPostInitComplete can be called only once per call to getRemoteService");
            e eVar3 = this.f3676e;
            int i14 = this.f3677f;
            eVar3.getClass();
            y yVar2 = new y(eVar3, i13, strongBinder2, bundle2);
            v vVar2 = eVar3.f3620f;
            vVar2.sendMessage(vVar2.obtainMessage(1, i14, -1, yVar2));
            this.f3676e = null;
        }
        parcel2.writeNoException();
        return true;
    }
}

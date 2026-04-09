package pb;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c0 extends ac.i {

    /* renamed from: b, reason: collision with root package name */
    public e f31562b;

    /* renamed from: c, reason: collision with root package name */
    public final int f31563c;

    public c0(e eVar, int i4) {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
        this.f31562b = eVar;
        this.f31563c = i4;
    }

    @Override // ac.i
    public final boolean e0(int i4, Parcel parcel, Parcel parcel2) {
        if (i4 == 1) {
            int i10 = parcel.readInt();
            IBinder strongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) ac.j.a(parcel, Bundle.CREATOR);
            ac.j.c(parcel);
            y.i(this.f31562b, "onPostInitComplete can be called only once per call to getRemoteService");
            e eVar = this.f31562b;
            int i11 = this.f31563c;
            eVar.getClass();
            e0 e0Var = new e0(eVar, i10, strongBinder, bundle);
            b0 b0Var = eVar.f31572f;
            b0Var.sendMessage(b0Var.obtainMessage(1, i11, -1, e0Var));
            this.f31562b = null;
        } else if (i4 == 2) {
            parcel.readInt();
            ac.j.c(parcel);
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else {
            if (i4 != 3) {
                return false;
            }
            int i12 = parcel.readInt();
            IBinder strongBinder2 = parcel.readStrongBinder();
            g0 g0Var = (g0) ac.j.a(parcel, g0.CREATOR);
            ac.j.c(parcel);
            e eVar2 = this.f31562b;
            y.i(eVar2, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            y.h(g0Var);
            eVar2.f31586v = g0Var;
            if (eVar2 instanceof yb.b) {
                f fVar = g0Var.f31612d;
                k kVarB = k.b();
                l lVar = fVar == null ? null : fVar.f31589a;
                synchronized (kVarB) {
                    if (lVar == null) {
                        lVar = k.f31633c;
                    } else {
                        l lVar2 = (l) kVarB.f31634a;
                        if (lVar2 == null || lVar2.f31643a < lVar.f31643a) {
                        }
                    }
                    kVarB.f31634a = lVar;
                }
            }
            Bundle bundle2 = g0Var.f31609a;
            y.i(this.f31562b, "onPostInitComplete can be called only once per call to getRemoteService");
            e eVar3 = this.f31562b;
            int i13 = this.f31563c;
            eVar3.getClass();
            e0 e0Var2 = new e0(eVar3, i12, strongBinder2, bundle2);
            b0 b0Var2 = eVar3.f31572f;
            b0Var2.sendMessage(b0Var2.obtainMessage(1, i13, -1, e0Var2));
            this.f31562b = null;
        }
        parcel2.writeNoException();
        return true;
    }
}

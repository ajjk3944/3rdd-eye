package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class on2 extends fc1 {
    public w9 g;
    public final int h;

    public on2(w9 w9Var, int i) {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
        this.g = w9Var;
        this.h = i;
    }

    @Override // defpackage.fc1
    public final boolean M0(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            int i2 = parcel.readInt();
            IBinder strongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) cc2.a(parcel, Bundle.CREATOR);
            cc2.b(parcel);
            ou1.k(this.g, "onPostInitComplete can be called only once per call to getRemoteService");
            w9 w9Var = this.g;
            int i3 = this.h;
            w9Var.getClass();
            m63 m63Var = new m63(w9Var, i2, strongBinder, bundle);
            mu1 mu1Var = w9Var.f;
            mu1Var.sendMessage(mu1Var.obtainMessage(1, i3, -1, m63Var));
            this.g = null;
        } else if (i == 2) {
            parcel.readInt();
            cc2.b(parcel);
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else {
            if (i != 3) {
                return false;
            }
            int i4 = parcel.readInt();
            IBinder strongBinder2 = parcel.readStrongBinder();
            eb4 eb4Var = (eb4) cc2.a(parcel, eb4.CREATOR);
            cc2.b(parcel);
            w9 w9Var2 = this.g;
            ou1.k(w9Var2, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            ou1.j(eb4Var);
            w9Var2.v = eb4Var;
            if (w9Var2 instanceof kn2) {
                sh shVar = eb4Var.i;
                sq0 sq0VarK = sq0.k();
                tq0 tq0Var = shVar == null ? null : shVar.f;
                synchronized (sq0VarK) {
                    if (tq0Var == null) {
                        tq0Var = sq0.i;
                    } else {
                        tq0 tq0Var2 = (tq0) sq0VarK.g;
                        if (tq0Var2 == null || tq0Var2.f < tq0Var.f) {
                        }
                    }
                    sq0VarK.g = tq0Var;
                }
            }
            Bundle bundle2 = eb4Var.f;
            ou1.k(this.g, "onPostInitComplete can be called only once per call to getRemoteService");
            w9 w9Var3 = this.g;
            int i5 = this.h;
            w9Var3.getClass();
            m63 m63Var2 = new m63(w9Var3, i4, strongBinder2, bundle2);
            mu1 mu1Var2 = w9Var3.f;
            mu1Var2.sendMessage(mu1Var2.obtainMessage(1, i5, -1, m63Var2));
            this.g = null;
        }
        parcel2.writeNoException();
        return true;
    }
}

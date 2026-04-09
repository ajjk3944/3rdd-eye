package pc;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.zzj;
import h9.r2;
import u.i0;

/* loaded from: classes.dex */
public final class h extends cc.f {
    public final i0 A;
    public final i0 B;
    public final i0 C;

    public h(Context context, Looper looper, r2 r2Var, bc.n nVar, bc.n nVar2) {
        super(context, looper, 23, r2Var, nVar, nVar2);
        this.A = new i0(0);
        this.B = new i0(0);
        this.C = new i0(0);
    }

    @Override // cc.e, ac.c
    public final int a() {
        return 11717000;
    }

    @Override // cc.e
    public final IInterface d(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        return iInterfaceQueryLocalInterface instanceof r ? (r) iInterfaceQueryLocalInterface : new r(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService", 3);
    }

    @Override // cc.e
    public final Feature[] h() {
        return tc.e.f22702c;
    }

    @Override // cc.e
    public final String n() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    @Override // cc.e
    public final String o() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    @Override // cc.e
    public final void s() {
        System.currentTimeMillis();
        synchronized (this.A) {
            this.A.clear();
        }
        synchronized (this.B) {
            this.B.clear();
        }
        synchronized (this.C) {
            this.C.clear();
        }
    }

    public final boolean v(Feature feature) {
        zzj zzjVar = this.f3635w;
        Feature feature2 = null;
        Feature[] featureArr = zzjVar == null ? null : zzjVar.f4865d;
        if (featureArr != null) {
            int i10 = 0;
            while (true) {
                if (i10 >= featureArr.length) {
                    break;
                }
                Feature feature3 = featureArr[i10];
                if (feature.f4811a.equals(feature3.f4811a)) {
                    feature2 = feature3;
                    break;
                }
                i10++;
            }
            if (feature2 != null && feature2.d() >= feature.d()) {
                return true;
            }
        }
        return false;
    }
}

package pc;

import android.os.Parcel;
import com.google.android.gms.internal.measurement.h4;
import com.google.android.gms.location.LocationResult;

/* loaded from: classes.dex */
public final class g extends mc.a implements tc.g {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f20446f = 0;

    /* renamed from: e, reason: collision with root package name */
    public final h4 f20447e;

    public g(h4 h4Var) {
        super("com.google.android.gms.location.ILocationCallback", 2);
        this.f20447e = h4Var;
    }

    @Override // mc.a
    public final boolean T(Parcel parcel, int i10) {
        h4 h4Var = this.f20447e;
        if (i10 == 1) {
            LocationResult locationResult = (LocationResult) b.a(parcel, LocationResult.CREATOR);
            b.c(parcel);
            h4Var.n().d(new oh.p(4, locationResult));
            return true;
        }
        if (i10 != 2) {
            if (i10 != 3) {
                return false;
            }
            U();
            return true;
        }
        b.c(parcel);
        h4Var.n().d(new et.d());
        return true;
    }

    public final void U() {
        this.f20447e.n().d(new o2.g(6, this));
    }
}

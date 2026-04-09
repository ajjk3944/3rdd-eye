package pc;

import android.os.Parcel;
import com.google.android.gms.libs.identity.zzl;

/* loaded from: classes.dex */
public abstract class p extends mc.a implements q {
    public p() {
        super("com.google.android.gms.location.internal.IFusedLocationProviderCallback", 2);
    }

    @Override // mc.a
    public final boolean T(Parcel parcel, int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                return false;
            }
            a();
            return true;
        }
        zzl zzlVar = (zzl) b.a(parcel, zzl.CREATOR);
        b.c(parcel);
        r(zzlVar);
        return true;
    }
}

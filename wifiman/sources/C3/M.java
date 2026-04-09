package C3;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationAvailability;

/* loaded from: classes.dex */
public abstract class M extends AbstractBinderC2544d implements N {
    public M() {
        super("com.google.android.gms.location.internal.ILocationAvailabilityStatusCallback");
    }

    @Override // C3.AbstractBinderC2544d
    protected final boolean b(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        Status status = (Status) AbstractC2550j.a(parcel, Status.CREATOR);
        LocationAvailability locationAvailability = (LocationAvailability) AbstractC2550j.a(parcel, LocationAvailability.CREATOR);
        AbstractC2550j.d(parcel);
        v(status, locationAvailability);
        return true;
    }
}

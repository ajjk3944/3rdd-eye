package C3;

import android.location.Location;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public abstract class O extends AbstractBinderC2544d implements P {
    public O() {
        super("com.google.android.gms.location.internal.ILocationStatusCallback");
    }

    @Override // C3.AbstractBinderC2544d
    protected final boolean b(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        Status status = (Status) AbstractC2550j.a(parcel, Status.CREATOR);
        Location location = (Location) AbstractC2550j.a(parcel, Location.CREATOR);
        AbstractC2550j.d(parcel);
        n(status, location);
        return true;
    }
}

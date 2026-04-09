package pc;

import android.location.Location;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationSettingsResult;

/* loaded from: classes.dex */
public final class d extends mc.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f20441e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dd.h f20442f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(int i10, dd.h hVar) {
        super("com.google.android.gms.location.internal.ISettingsCallbacks", 2);
        this.f20441e = i10;
        switch (i10) {
            case 1:
                this.f20442f = hVar;
                super("com.google.android.gms.location.internal.ILocationStatusCallback", 2);
                break;
            default:
                this.f20442f = hVar;
                break;
        }
    }

    @Override // mc.a
    public final boolean T(Parcel parcel, int i10) {
        switch (this.f20441e) {
            case 0:
                if (i10 == 1) {
                    LocationSettingsResult locationSettingsResult = (LocationSettingsResult) b.a(parcel, LocationSettingsResult.CREATOR);
                    b.c(parcel);
                    Status status = locationSettingsResult.f5318a;
                    tc.b bVar = new tc.b();
                    bVar.f22696a = locationSettingsResult;
                    vc.e.P(status, bVar, this.f20442f);
                    break;
                }
                break;
            default:
                if (i10 == 1) {
                    Status status2 = (Status) b.a(parcel, Status.CREATOR);
                    Location location = (Location) b.a(parcel, Location.CREATOR);
                    b.c(parcel);
                    vc.e.P(status2, location, this.f20442f);
                    break;
                }
                break;
        }
        return true;
    }
}

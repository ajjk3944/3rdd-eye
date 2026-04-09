package C3;

import android.location.Location;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.location.LocationAvailability;

/* loaded from: classes.dex */
public final class K extends AbstractC2541a implements L {
    K(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService");
    }

    @Override // C3.L
    public final void F(I3.n nVar, u uVar) {
        Parcel parcelB = b();
        AbstractC2550j.b(parcelB, nVar);
        AbstractC2550j.b(parcelB, uVar);
        f(91, parcelB);
    }

    @Override // C3.L
    public final LocationAvailability L(String str) {
        Parcel parcelB = b();
        parcelB.writeString(str);
        Parcel parcelC = c(34, parcelB);
        LocationAvailability locationAvailability = (LocationAvailability) AbstractC2550j.a(parcelC, LocationAvailability.CREATOR);
        parcelC.recycle();
        return locationAvailability;
    }

    @Override // C3.L
    public final void R(I3.d dVar, P p10) {
        Parcel parcelB = b();
        AbstractC2550j.b(parcelB, dVar);
        AbstractC2550j.c(parcelB, p10);
        f(82, parcelB);
    }

    @Override // C3.L
    public final void S(I3.f fVar, InterfaceC2543c interfaceC2543c, String str) {
        Parcel parcelB = b();
        AbstractC2550j.b(parcelB, fVar);
        AbstractC2550j.c(parcelB, interfaceC2543c);
        parcelB.writeString(null);
        f(63, parcelB);
    }

    @Override // C3.L
    public final void e0(I3.d dVar, u uVar) {
        Parcel parcelB = b();
        AbstractC2550j.b(parcelB, dVar);
        AbstractC2550j.b(parcelB, uVar);
        f(90, parcelB);
    }

    @Override // C3.L
    public final Location zzs() {
        Parcel parcelC = c(7, b());
        Location location = (Location) AbstractC2550j.a(parcelC, Location.CREATOR);
        parcelC.recycle();
        return location;
    }
}

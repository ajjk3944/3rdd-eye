package uc;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import qc.l;

/* loaded from: classes.dex */
public final class g extends mc.a implements vc.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f23523e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d f23524f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(d dVar, int i10) {
        super("com.google.android.gms.maps.internal.IOnMapReadyCallback", 3);
        this.f23523e = i10;
        this.f23524f = dVar;
    }

    @Override // mc.a
    public final boolean S(int i10, Parcel parcel, Parcel parcel2) {
        vc.g gVar;
        if (i10 != 1) {
            return false;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder == null) {
            gVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            gVar = iInterfaceQueryLocalInterface instanceof vc.g ? (vc.g) iInterfaceQueryLocalInterface : new vc.g(strongBinder, "com.google.android.gms.maps.internal.IGoogleMapDelegate", 4);
        }
        l.b(parcel);
        i(gVar);
        parcel2.writeNoException();
        return true;
    }

    @Override // vc.a
    public final void i(vc.g gVar) {
        switch (this.f23523e) {
            case 0:
                this.f23524f.c(new q3.a(gVar));
                break;
            default:
                this.f23524f.c(new q3.a(gVar));
                break;
        }
    }
}

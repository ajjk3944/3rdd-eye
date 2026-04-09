package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class f13 extends hv1 implements z72 {
    public final c03 f;
    public final /* synthetic */ r03 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f13(r03 r03Var, c03 c03Var) {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
        this.g = r03Var;
        this.f = c03Var;
    }

    @Override // defpackage.hv1
    public final boolean A3(int i, Parcel parcel, Parcel parcel2) {
        e72 d72Var;
        c03 c03Var = this.f;
        if (i == 1) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                d72Var = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
                d72Var = iInterfaceQueryLocalInterface instanceof e72 ? (e72) iInterfaceQueryLocalInterface : new d72(strongBinder);
            }
            iv1.f(parcel);
            this.g.d = d72Var;
            ((u03) c03Var.c).g();
        } else if (i == 2) {
            String string = parcel.readString();
            iv1.f(parcel);
            ((u03) c03Var.c).w0(string, 0);
        } else {
            if (i != 3) {
                return false;
            }
            nx2 nx2Var = (nx2) iv1.b(parcel, nx2.CREATOR);
            iv1.f(parcel);
            a(nx2Var);
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // defpackage.z72
    public final void a(nx2 nx2Var) {
        ((u03) this.f.c).K0(nx2Var);
    }
}

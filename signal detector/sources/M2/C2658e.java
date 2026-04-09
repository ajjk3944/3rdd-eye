package m2;

import a.AbstractC0241a;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.Q7;
import g3.C2333b;
import q2.V;
import q2.W;

/* renamed from: m2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2658e extends N2.a {
    public static final Parcelable.Creator<C2658e> CREATOR = new C2333b(7);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f21949a;

    /* renamed from: b, reason: collision with root package name */
    public final W f21950b;

    /* renamed from: c, reason: collision with root package name */
    public final IBinder f21951c;

    public C2658e(boolean z6, IBinder iBinder, IBinder iBinder2) {
        W v6;
        this.f21949a = z6;
        if (iBinder != null) {
            int i = Q7.f10579b;
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
            v6 = iInterfaceQueryLocalInterface instanceof W ? (W) iInterfaceQueryLocalInterface : new V(iBinder);
        } else {
            v6 = null;
        }
        this.f21950b = v6;
        this.f21951c = iBinder2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iE = AbstractC0241a.E(parcel, 20293);
        AbstractC0241a.B(parcel, 1, 4);
        parcel.writeInt(this.f21949a ? 1 : 0);
        W w6 = this.f21950b;
        AbstractC0241a.s(parcel, 2, w6 == null ? null : w6.asBinder());
        AbstractC0241a.s(parcel, 3, this.f21951c);
        AbstractC0241a.H(parcel, iE);
    }
}

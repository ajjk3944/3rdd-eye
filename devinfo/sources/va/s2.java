package va;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.mg;
import com.google.android.gms.internal.ads.ng;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class s2 extends mg implements r1 {

    /* renamed from: a, reason: collision with root package name */
    public final pa.n f36168a;

    public s2(pa.n nVar) {
        super("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
        this.f36168a = nVar;
    }

    public static r1 h4(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
        return iInterfaceQueryLocalInterface instanceof r1 ? (r1) iInterfaceQueryLocalInterface : new q1(iBinder);
    }

    @Override // va.r1
    public final boolean d() {
        return this.f36168a == null;
    }

    @Override // com.google.android.gms.internal.ads.mg
    public final boolean g4(int i4, Parcel parcel, Parcel parcel2) {
        if (i4 == 1) {
            d3 d3Var = (d3) ng.b(parcel, d3.CREATOR);
            ng.f(parcel);
            x1(d3Var);
            parcel2.writeNoException();
            return true;
        }
        if (i4 != 2) {
            return false;
        }
        boolean zD = d();
        parcel2.writeNoException();
        ClassLoader classLoader = ng.f14287a;
        parcel2.writeInt(zD ? 1 : 0);
        return true;
    }

    @Override // va.r1
    public final void x1(d3 d3Var) {
        pa.n nVar = this.f36168a;
        if (nVar != null) {
            int i4 = d3Var.f36065b;
            nVar.b(new com.google.android.gms.internal.ads.c2(d3Var.f36067d));
        }
    }
}

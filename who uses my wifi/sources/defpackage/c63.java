package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class c63 extends hv1 implements nq2 {
    public final String f;
    public final String g;

    public c63(String str, String str2) {
        super("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
        this.f = str;
        this.g = str2;
    }

    public static nq2 B3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
        return iInterfaceQueryLocalInterface instanceof nq2 ? (nq2) iInterfaceQueryLocalInterface : new bq2(iBinder, "com.google.android.gms.ads.internal.client.IMuteThisAdReason", 2);
    }

    @Override // defpackage.hv1
    public final boolean A3(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            parcel2.writeNoException();
            parcel2.writeString(this.f);
            return true;
        }
        if (i != 2) {
            return false;
        }
        parcel2.writeNoException();
        parcel2.writeString(this.g);
        return true;
    }

    @Override // defpackage.nq2
    public final String b() {
        return this.f;
    }

    @Override // defpackage.nq2
    public final String c() {
        return this.g;
    }
}

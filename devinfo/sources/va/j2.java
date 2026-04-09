package va;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.mg;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class j2 extends mg implements l1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f36124a;

    /* renamed from: b, reason: collision with root package name */
    public final String f36125b;

    public j2(String str, String str2) {
        super("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
        this.f36124a = str;
        this.f36125b = str2;
    }

    public static l1 h4(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
        return iInterfaceQueryLocalInterface instanceof l1 ? (l1) iInterfaceQueryLocalInterface : new k1(iBinder, "com.google.android.gms.ads.internal.client.IMuteThisAdReason", 1);
    }

    @Override // va.l1
    public final String c() {
        return this.f36124a;
    }

    @Override // va.l1
    public final String d() {
        return this.f36125b;
    }

    @Override // com.google.android.gms.internal.ads.mg
    public final boolean g4(int i4, Parcel parcel, Parcel parcel2) {
        if (i4 == 1) {
            parcel2.writeNoException();
            parcel2.writeString(this.f36124a);
            return true;
        }
        if (i4 != 2) {
            return false;
        }
        parcel2.writeNoException();
        parcel2.writeString(this.f36125b);
        return true;
    }
}

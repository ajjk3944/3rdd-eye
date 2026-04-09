package q2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.B7;

/* loaded from: classes.dex */
public final class K0 extends B7 implements InterfaceC2831m0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f23127a;

    /* renamed from: b, reason: collision with root package name */
    public final String f23128b;

    public K0(String str, String str2) {
        super("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
        this.f23127a = str;
        this.f23128b = str2;
    }

    public static InterfaceC2831m0 K3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
        return iInterfaceQueryLocalInterface instanceof InterfaceC2831m0 ? (InterfaceC2831m0) iInterfaceQueryLocalInterface : new C2829l0(iBinder, "com.google.android.gms.ads.internal.client.IMuteThisAdReason", 2);
    }

    @Override // com.google.android.gms.internal.ads.B7
    public final boolean J3(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            parcel2.writeNoException();
            parcel2.writeString(this.f23127a);
            return true;
        }
        if (i != 2) {
            return false;
        }
        parcel2.writeNoException();
        parcel2.writeString(this.f23128b);
        return true;
    }

    @Override // q2.InterfaceC2831m0
    public final String b() {
        return this.f23127a;
    }

    @Override // q2.InterfaceC2831m0
    public final String d() {
        return this.f23128b;
    }
}

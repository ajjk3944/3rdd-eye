package q2;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.C7;

/* renamed from: q2.t0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2844t0 extends W2.a implements InterfaceC2846u0 {
    public C2844t0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOutOfContextTester", 2);
    }

    @Override // q2.InterfaceC2846u0
    public final void i3(String str, S2.a aVar, S2.a aVar2) {
        Parcel parcelH0 = h0();
        parcelH0.writeString(str);
        C7.e(parcelH0, aVar);
        C7.e(parcelH0, aVar2);
        I0(parcelH0, 1);
    }
}

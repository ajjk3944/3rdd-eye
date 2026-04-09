package q2;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class V extends W2.a implements W {
    public V(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAppEventListener", 2);
    }

    @Override // q2.W
    public final void q0(String str, String str2) {
        Parcel parcelH0 = h0();
        parcelH0.writeString(str);
        parcelH0.writeString(str2);
        I0(parcelH0, 1);
    }
}

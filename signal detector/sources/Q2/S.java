package q2;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.BinderC0569Jc;
import com.google.android.gms.internal.ads.C7;

/* loaded from: classes.dex */
public final class S extends W2.a implements T {
    public S(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdPreloader", 2);
    }

    @Override // q2.T
    public final void P(int i) {
        Parcel parcelH0 = h0();
        parcelH0.writeInt(i);
        I0(parcelH0, 18);
    }

    @Override // q2.T
    public final void i2(BinderC0569Jc binderC0569Jc) {
        Parcel parcelH0 = h0();
        C7.e(parcelH0, binderC0569Jc);
        I0(parcelH0, 8);
    }
}

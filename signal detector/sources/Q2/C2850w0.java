package q2;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.C7;
import java.util.ArrayList;
import java.util.List;

/* renamed from: q2.w0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2850w0 extends W2.a implements InterfaceC2854y0 {
    public C2850w0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IResponseInfo", 2);
    }

    @Override // q2.InterfaceC2854y0
    public final String b() {
        Parcel parcelK0 = k0(h0(), 1);
        String string = parcelK0.readString();
        parcelK0.recycle();
        return string;
    }

    @Override // q2.InterfaceC2854y0
    public final String d() {
        Parcel parcelK0 = k0(h0(), 2);
        String string = parcelK0.readString();
        parcelK0.recycle();
        return string;
    }

    @Override // q2.InterfaceC2854y0
    public final List e() {
        Parcel parcelK0 = k0(h0(), 3);
        ArrayList arrayListCreateTypedArrayList = parcelK0.createTypedArrayList(f1.CREATOR);
        parcelK0.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // q2.InterfaceC2854y0
    public final f1 g() {
        Parcel parcelK0 = k0(h0(), 4);
        f1 f1Var = (f1) C7.b(parcelK0, f1.CREATOR);
        parcelK0.recycle();
        return f1Var;
    }

    @Override // q2.InterfaceC2854y0
    public final String h() {
        Parcel parcelK0 = k0(h0(), 6);
        String string = parcelK0.readString();
        parcelK0.recycle();
        return string;
    }

    @Override // q2.InterfaceC2854y0
    public final Bundle j() {
        Parcel parcelK0 = k0(h0(), 5);
        Bundle bundle = (Bundle) C7.b(parcelK0, Bundle.CREATOR);
        parcelK0.recycle();
        return bundle;
    }
}

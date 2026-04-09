package k4;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes3.dex */
public final class d extends AbstractC6390a implements f {
    d(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.inappreview.protocol.IInAppReviewService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // k4.f
    public final void m(String str, Bundle bundle, h hVar) {
        Parcel parcelB = b();
        parcelB.writeString(str);
        int i10 = AbstractC6392c.f51200a;
        parcelB.writeInt(1);
        bundle.writeToParcel(parcelB, 0);
        parcelB.writeStrongBinder(hVar);
        c(2, parcelB);
    }
}

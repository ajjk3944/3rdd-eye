package zc;

import android.os.Parcel;
import java.util.List;

/* loaded from: classes.dex */
public final class y extends com.google.android.gms.internal.measurement.x implements z {
    @Override // zc.z
    public final void H(List list) {
        Parcel parcelR = R();
        parcelR.writeTypedList(list);
        T(parcelR);
    }
}

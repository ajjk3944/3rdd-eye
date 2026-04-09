package ak;

import android.os.Parcel;
import android.os.Parcelable;
import com.opensignal.sdk.domain.model.TaskInfo;

/* loaded from: classes.dex */
public final class u0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        br.l.e(parcel, "parcel");
        long j = parcel.readLong();
        String string = parcel.readString();
        if (string == null) {
            string = "";
        }
        String string2 = parcel.readString();
        if (string2 == null) {
            string2 = "";
        }
        return new TaskInfo(j, string, string2, parcel.readLong(), parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        return new TaskInfo[i10];
    }
}

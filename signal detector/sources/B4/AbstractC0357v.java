package b4;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.AbstractC1135f5;

/* renamed from: b4.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0357v {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f5775a = 0;

    static {
        AbstractC0357v.class.getClassLoader();
    }

    public static Parcelable a(Parcel parcel) {
        Parcelable.Creator creator = Bundle.CREATOR;
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    public static void b(Parcel parcel) {
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail > 0) {
            throw new BadParcelableException(AbstractC1135f5.l(iDataAvail, "Parcel data not fully consumed, unread size: "));
        }
    }
}

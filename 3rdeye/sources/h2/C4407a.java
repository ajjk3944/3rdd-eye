package h2;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: ParcelConverters.java */
/* renamed from: h2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4407a {
    public static byte[] a(Parcelable parcelable) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(parcelObtain, 0);
            return parcelObtain.marshall();
        } finally {
            parcelObtain.recycle();
        }
    }

    public static <T> T b(byte[] bArr, Parcelable.Creator<T> creator) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.unmarshall(bArr, 0, bArr.length);
            parcelObtain.setDataPosition(0);
            return creator.createFromParcel(parcelObtain);
        } finally {
            parcelObtain.recycle();
        }
    }
}

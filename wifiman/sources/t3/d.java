package t3;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import s3.AbstractC7901p;

/* loaded from: classes.dex */
public abstract class d {
    public static c a(byte[] bArr, Parcelable.Creator creator) {
        AbstractC7901p.l(creator);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.unmarshall(bArr, 0, bArr.length);
        parcelObtain.setDataPosition(0);
        c cVar = (c) creator.createFromParcel(parcelObtain);
        parcelObtain.recycle();
        return cVar;
    }

    public static c b(Intent intent, String str, Parcelable.Creator creator) {
        byte[] byteArrayExtra = intent.getByteArrayExtra(str);
        if (byteArrayExtra == null) {
            return null;
        }
        return a(byteArrayExtra, creator);
    }
}

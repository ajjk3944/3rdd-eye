package j4;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: j4.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C6250e implements Parcelable.Creator {
    C6250e() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new C6249d((PendingIntent) parcel.readParcelable(AbstractC6246a.class.getClassLoader()), parcel.readInt() != 0);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new AbstractC6246a[i10];
    }
}

package h2;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.work.w;
import java.util.ArrayList;

/* compiled from: ParcelableWorkRequests.java */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class o implements Parcelable {
    public static final Parcelable.Creator<o> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f38183b;

    /* compiled from: ParcelableWorkRequests.java */
    public class a implements Parcelable.Creator<o> {
        @Override // android.os.Parcelable.Creator
        public final o createFromParcel(Parcel parcel) {
            return new o(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final o[] newArray(int i) {
            return new o[i];
        }
    }

    public o(Parcel parcel) {
        Parcelable[] parcelableArray = parcel.readParcelableArray(o.class.getClassLoader());
        this.f38183b = new ArrayList(parcelableArray.length);
        for (Parcelable parcelable : parcelableArray) {
            this.f38183b.add(((n) parcelable).f38182b);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ArrayList arrayList = this.f38183b;
        n[] nVarArr = new n[arrayList.size()];
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            nVarArr[i10] = new n((w) arrayList.get(i10));
        }
        parcel.writeParcelableArray(nVarArr, i);
    }
}

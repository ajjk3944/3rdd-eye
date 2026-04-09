package h2;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.work.t;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ParcelableWorkInfos.java */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class l implements Parcelable {
    public static final Parcelable.Creator<l> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final List<t> f38180b;

    /* compiled from: ParcelableWorkInfos.java */
    public class a implements Parcelable.Creator<l> {
        @Override // android.os.Parcelable.Creator
        public final l createFromParcel(Parcel parcel) {
            return new l(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final l[] newArray(int i) {
            return new l[i];
        }
    }

    public l(List<t> list) {
        this.f38180b = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<t> list = this.f38180b;
        k[] kVarArr = new k[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            kVarArr[i10] = new k(list.get(i10));
        }
        parcel.writeParcelableArray(kVarArr, i);
    }

    public l(Parcel parcel) {
        Parcelable[] parcelableArray = parcel.readParcelableArray(l.class.getClassLoader());
        this.f38180b = new ArrayList(parcelableArray.length);
        for (Parcelable parcelable : parcelableArray) {
            this.f38180b.add(((k) parcelable).f38179b);
        }
    }
}

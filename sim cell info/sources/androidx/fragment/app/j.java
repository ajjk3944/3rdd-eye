package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
final class j implements Parcelable {
    public static final Parcelable.Creator<j> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    ArrayList<m> f1667b;

    /* renamed from: c, reason: collision with root package name */
    ArrayList<String> f1668c;

    /* renamed from: d, reason: collision with root package name */
    b[] f1669d;

    /* renamed from: e, reason: collision with root package name */
    String f1670e;

    /* renamed from: f, reason: collision with root package name */
    int f1671f;

    static class a implements Parcelable.Creator<j> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public j createFromParcel(Parcel parcel) {
            return new j(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public j[] newArray(int i2) {
            return new j[i2];
        }
    }

    public j() {
        this.f1670e = null;
    }

    public j(Parcel parcel) {
        this.f1670e = null;
        this.f1667b = parcel.createTypedArrayList(m.CREATOR);
        this.f1668c = parcel.createStringArrayList();
        this.f1669d = (b[]) parcel.createTypedArray(b.CREATOR);
        this.f1670e = parcel.readString();
        this.f1671f = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeTypedList(this.f1667b);
        parcel.writeStringList(this.f1668c);
        parcel.writeTypedArray(this.f1669d, i2);
        parcel.writeString(this.f1670e);
        parcel.writeInt(this.f1671f);
    }
}

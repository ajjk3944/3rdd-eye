package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: androidx.fragment.app.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C3992c implements Parcelable {
    public static final Parcelable.Creator<C3992c> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    final List f31374a;

    /* renamed from: b, reason: collision with root package name */
    final List f31375b;

    /* renamed from: androidx.fragment.app.c$a */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C3992c createFromParcel(Parcel parcel) {
            return new C3992c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C3992c[] newArray(int i10) {
            return new C3992c[i10];
        }
    }

    C3992c(Parcel parcel) {
        this.f31374a = parcel.createStringArrayList();
        this.f31375b = parcel.createTypedArrayList(C3991b.CREATOR);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeStringList(this.f31374a);
        parcel.writeTypedList(this.f31375b);
    }
}

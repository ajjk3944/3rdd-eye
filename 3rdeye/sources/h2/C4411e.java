package h2;

import N7.H7;
import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: ParcelableInterruptRequest.kt */
@SuppressLint({"BanParcelableUsage"})
/* renamed from: h2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4411e implements Parcelable {
    public static final Parcelable.Creator<C4411e> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final String f38164b;

    /* renamed from: c, reason: collision with root package name */
    public final int f38165c;

    /* compiled from: ParcelableInterruptRequest.kt */
    /* renamed from: h2.e$a */
    public static final class a implements Parcelable.Creator<C4411e> {
        @Override // android.os.Parcelable.Creator
        public final C4411e createFromParcel(Parcel parcel) {
            kotlin.jvm.internal.l.f(parcel, "parcel");
            String string = parcel.readString();
            kotlin.jvm.internal.l.c(string);
            return new C4411e(string, parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final C4411e[] newArray(int i) {
            return new C4411e[i];
        }
    }

    public C4411e(String id, int i) {
        kotlin.jvm.internal.l.f(id, "id");
        this.f38164b = id;
        this.f38165c = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4411e)) {
            return false;
        }
        C4411e c4411e = (C4411e) obj;
        return kotlin.jvm.internal.l.b(this.f38164b, c4411e.f38164b) && this.f38165c == c4411e.f38165c;
    }

    public final int hashCode() {
        return (this.f38164b.hashCode() * 31) + this.f38165c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParcelableInterruptRequest(id=");
        sb.append(this.f38164b);
        sb.append(", stopReason=");
        return H7.p(sb, this.f38165c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        kotlin.jvm.internal.l.f(parcel, "parcel");
        parcel.writeString(this.f38164b);
        parcel.writeInt(this.f38165c);
    }
}

package zh;

import android.os.Parcel;
import android.os.Parcelable;
import nk.k;
import za.m;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new m(1);

    /* renamed from: a, reason: collision with root package name */
    public final String f38284a;

    /* renamed from: b, reason: collision with root package name */
    public final int f38285b;

    /* renamed from: c, reason: collision with root package name */
    public final int f38286c;

    public b(String str, int i4, int i10) {
        k.e(str, "name");
        this.f38284a = str;
        this.f38285b = i4;
        this.f38286c = i10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return k.a(this.f38284a, bVar.f38284a) && this.f38285b == bVar.f38285b && this.f38286c == bVar.f38286c;
    }

    public final int hashCode() {
        return (((this.f38284a.hashCode() * 31) + this.f38285b) * 31) + this.f38286c;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DevInfoTheme(name=");
        sb2.append(this.f38284a);
        sb2.append(", primaryColor=");
        sb2.append(this.f38285b);
        sb2.append(", accentColor=");
        return r5.c.j(this.f38286c, ")", sb2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        k.e(parcel, "dest");
        parcel.writeString(this.f38284a);
        parcel.writeInt(this.f38285b);
        parcel.writeInt(this.f38286c);
    }
}

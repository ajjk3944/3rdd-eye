package androidx.media3.common;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class StreamKey implements Comparable<StreamKey>, Parcelable {
    public static final Parcelable.Creator<StreamKey> CREATOR = new ac.l(8);

    /* renamed from: a, reason: collision with root package name */
    public final int f1551a;

    /* renamed from: d, reason: collision with root package name */
    public final int f1552d;

    /* renamed from: g, reason: collision with root package name */
    public final int f1553g;

    public StreamKey() {
        this.f1551a = -1;
        this.f1552d = -1;
        this.f1553g = -1;
    }

    @Override // java.lang.Comparable
    public final int compareTo(StreamKey streamKey) {
        StreamKey streamKey2 = streamKey;
        int i10 = this.f1551a - streamKey2.f1551a;
        if (i10 != 0) {
            return i10;
        }
        int i11 = this.f1552d - streamKey2.f1552d;
        return i11 == 0 ? this.f1553g - streamKey2.f1553g : i11;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && StreamKey.class == obj.getClass()) {
            StreamKey streamKey = (StreamKey) obj;
            if (this.f1551a == streamKey.f1551a && this.f1552d == streamKey.f1552d && this.f1553g == streamKey.f1553g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f1551a * 31) + this.f1552d) * 31) + this.f1553g;
    }

    public final String toString() {
        return this.f1551a + "." + this.f1552d + "." + this.f1553g;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f1551a);
        parcel.writeInt(this.f1552d);
        parcel.writeInt(this.f1553g);
    }

    public StreamKey(Parcel parcel) {
        this.f1551a = parcel.readInt();
        this.f1552d = parcel.readInt();
        this.f1553g = parcel.readInt();
    }
}

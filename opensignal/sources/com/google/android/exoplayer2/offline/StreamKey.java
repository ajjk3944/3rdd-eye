package com.google.android.exoplayer2.offline;

import android.os.Parcel;
import android.os.Parcelable;
import wc.h;

/* loaded from: classes.dex */
public final class StreamKey implements Comparable<StreamKey>, Parcelable {
    public static final Parcelable.Creator<StreamKey> CREATOR = new h(10);

    /* renamed from: a, reason: collision with root package name */
    public final int f4359a;

    /* renamed from: d, reason: collision with root package name */
    public final int f4360d;

    /* renamed from: g, reason: collision with root package name */
    public final int f4361g;

    public StreamKey() {
        this.f4359a = -1;
        this.f4360d = -1;
        this.f4361g = -1;
    }

    @Override // java.lang.Comparable
    public final int compareTo(StreamKey streamKey) {
        StreamKey streamKey2 = streamKey;
        int i10 = this.f4359a - streamKey2.f4359a;
        if (i10 != 0) {
            return i10;
        }
        int i11 = this.f4360d - streamKey2.f4360d;
        return i11 == 0 ? this.f4361g - streamKey2.f4361g : i11;
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
            if (this.f4359a == streamKey.f4359a && this.f4360d == streamKey.f4360d && this.f4361g == streamKey.f4361g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f4359a * 31) + this.f4360d) * 31) + this.f4361g;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(35);
        sb2.append(this.f4359a);
        sb2.append(".");
        sb2.append(this.f4360d);
        sb2.append(".");
        sb2.append(this.f4361g);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f4359a);
        parcel.writeInt(this.f4360d);
        parcel.writeInt(this.f4361g);
    }

    public StreamKey(Parcel parcel) {
        this.f4359a = parcel.readInt();
        this.f4360d = parcel.readInt();
        this.f4361g = parcel.readInt();
    }
}

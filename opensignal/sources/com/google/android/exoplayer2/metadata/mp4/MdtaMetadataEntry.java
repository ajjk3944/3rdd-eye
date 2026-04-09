package com.google.android.exoplayer2.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.Arrays;
import qb.v;
import tc.c;

/* loaded from: classes.dex */
public final class MdtaMetadataEntry implements Metadata.Entry {
    public static final Parcelable.Creator<MdtaMetadataEntry> CREATOR = new c(16);

    /* renamed from: a, reason: collision with root package name */
    public final String f4304a;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f4305d;

    /* renamed from: g, reason: collision with root package name */
    public final int f4306g;

    /* renamed from: r, reason: collision with root package name */
    public final int f4307r;

    public MdtaMetadataEntry(int i10, int i11, String str, byte[] bArr) {
        this.f4304a = str;
        this.f4305d = bArr;
        this.f4306g = i10;
        this.f4307r = i11;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && MdtaMetadataEntry.class == obj.getClass()) {
            MdtaMetadataEntry mdtaMetadataEntry = (MdtaMetadataEntry) obj;
            if (this.f4304a.equals(mdtaMetadataEntry.f4304a) && Arrays.equals(this.f4305d, mdtaMetadataEntry.f4305d) && this.f4306g == mdtaMetadataEntry.f4306g && this.f4307r == mdtaMetadataEntry.f4307r) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f4305d) + c7.a.g(this.f4304a, 527, 31)) * 31) + this.f4306g) * 31) + this.f4307r;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f4304a);
        return strValueOf.length() != 0 ? "mdta: key=".concat(strValueOf) : new String("mdta: key=");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f4304a);
        parcel.writeByteArray(this.f4305d);
        parcel.writeInt(this.f4306g);
        parcel.writeInt(this.f4307r);
    }

    public MdtaMetadataEntry(Parcel parcel) {
        String string = parcel.readString();
        int i10 = v.f20828a;
        this.f4304a = string;
        this.f4305d = parcel.createByteArray();
        this.f4306g = parcel.readInt();
        this.f4307r = parcel.readInt();
    }
}

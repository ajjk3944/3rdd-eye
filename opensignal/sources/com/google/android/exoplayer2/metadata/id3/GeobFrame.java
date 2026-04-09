package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import c7.a;
import h0.b;
import java.util.Arrays;
import qb.v;
import tc.c;

/* loaded from: classes.dex */
public final class GeobFrame extends Id3Frame {
    public static final Parcelable.Creator<GeobFrame> CREATOR = new c(8);

    /* renamed from: d, reason: collision with root package name */
    public final String f4285d;

    /* renamed from: g, reason: collision with root package name */
    public final String f4286g;

    /* renamed from: r, reason: collision with root package name */
    public final String f4287r;

    /* renamed from: x, reason: collision with root package name */
    public final byte[] f4288x;

    public GeobFrame(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f4285d = str;
        this.f4286g = str2;
        this.f4287r = str3;
        this.f4288x = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && GeobFrame.class == obj.getClass()) {
            GeobFrame geobFrame = (GeobFrame) obj;
            if (v.a(this.f4285d, geobFrame.f4285d) && v.a(this.f4286g, geobFrame.f4286g) && v.a(this.f4287r, geobFrame.f4287r) && Arrays.equals(this.f4288x, geobFrame.f4288x)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f4285d;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f4286g;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f4287r;
        return Arrays.hashCode(this.f4288x) + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public final String toString() {
        String str = this.f4289a;
        int iD = a.d(36, str);
        String str2 = this.f4285d;
        int iD2 = a.d(iD, str2);
        String str3 = this.f4286g;
        int iD3 = a.d(iD2, str3);
        String str4 = this.f4287r;
        return b.s(a.s(a.d(iD3, str4), str, ": mimeType=", str2, ", filename="), str3, ", description=", str4);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f4285d);
        parcel.writeString(this.f4286g);
        parcel.writeString(this.f4287r);
        parcel.writeByteArray(this.f4288x);
    }

    public GeobFrame(Parcel parcel) {
        super("GEOB");
        String string = parcel.readString();
        int i10 = v.f20828a;
        this.f4285d = string;
        this.f4286g = parcel.readString();
        this.f4287r = parcel.readString();
        this.f4288x = parcel.createByteArray();
    }
}

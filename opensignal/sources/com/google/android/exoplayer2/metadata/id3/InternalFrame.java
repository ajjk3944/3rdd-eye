package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import c7.a;
import qb.v;
import tc.c;

/* loaded from: classes.dex */
public final class InternalFrame extends Id3Frame {
    public static final Parcelable.Creator<InternalFrame> CREATOR = new c(9);

    /* renamed from: d, reason: collision with root package name */
    public final String f4290d;

    /* renamed from: g, reason: collision with root package name */
    public final String f4291g;

    /* renamed from: r, reason: collision with root package name */
    public final String f4292r;

    public InternalFrame(String str, String str2, String str3) {
        super("----");
        this.f4290d = str;
        this.f4291g = str2;
        this.f4292r = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && InternalFrame.class == obj.getClass()) {
            InternalFrame internalFrame = (InternalFrame) obj;
            if (v.a(this.f4291g, internalFrame.f4291g) && v.a(this.f4290d, internalFrame.f4290d) && v.a(this.f4292r, internalFrame.f4292r)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f4290d;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f4291g;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f4292r;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public final String toString() {
        String str = this.f4289a;
        int iD = a.d(23, str);
        String str2 = this.f4290d;
        int iD2 = a.d(iD, str2);
        String str3 = this.f4291g;
        StringBuilder sbS = a.s(a.d(iD2, str3), str, ": domain=", str2, ", description=");
        sbS.append(str3);
        return sbS.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f4289a);
        parcel.writeString(this.f4290d);
        parcel.writeString(this.f4292r);
    }

    public InternalFrame(Parcel parcel) {
        super("----");
        String string = parcel.readString();
        int i10 = v.f20828a;
        this.f4290d = string;
        this.f4291g = parcel.readString();
        this.f4292r = parcel.readString();
    }
}

package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import c7.a;
import qb.v;
import tc.c;

/* loaded from: classes.dex */
public final class CommentFrame extends Id3Frame {
    public static final Parcelable.Creator<CommentFrame> CREATOR = new c(7);

    /* renamed from: d, reason: collision with root package name */
    public final String f4282d;

    /* renamed from: g, reason: collision with root package name */
    public final String f4283g;

    /* renamed from: r, reason: collision with root package name */
    public final String f4284r;

    public CommentFrame(String str, String str2, String str3) {
        super("COMM");
        this.f4282d = str;
        this.f4283g = str2;
        this.f4284r = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && CommentFrame.class == obj.getClass()) {
            CommentFrame commentFrame = (CommentFrame) obj;
            if (v.a(this.f4283g, commentFrame.f4283g) && v.a(this.f4282d, commentFrame.f4282d) && v.a(this.f4284r, commentFrame.f4284r)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f4282d;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f4283g;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f4284r;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public final String toString() {
        String str = this.f4289a;
        int iD = a.d(25, str);
        String str2 = this.f4282d;
        int iD2 = a.d(iD, str2);
        String str3 = this.f4283g;
        StringBuilder sbS = a.s(a.d(iD2, str3), str, ": language=", str2, ", description=");
        sbS.append(str3);
        return sbS.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f4289a);
        parcel.writeString(this.f4282d);
        parcel.writeString(this.f4284r);
    }

    public CommentFrame(Parcel parcel) {
        super("COMM");
        String string = parcel.readString();
        int i10 = v.f20828a;
        this.f4282d = string;
        this.f4283g = parcel.readString();
        this.f4284r = parcel.readString();
    }
}

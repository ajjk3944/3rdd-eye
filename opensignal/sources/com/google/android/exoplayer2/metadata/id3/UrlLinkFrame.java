package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import c7.a;
import qb.v;
import tc.c;

/* loaded from: classes.dex */
public final class UrlLinkFrame extends Id3Frame {
    public static final Parcelable.Creator<UrlLinkFrame> CREATOR = new c(13);

    /* renamed from: d, reason: collision with root package name */
    public final String f4302d;

    /* renamed from: g, reason: collision with root package name */
    public final String f4303g;

    public UrlLinkFrame(String str, String str2, String str3) {
        super(str);
        this.f4302d = str2;
        this.f4303g = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && UrlLinkFrame.class == obj.getClass()) {
            UrlLinkFrame urlLinkFrame = (UrlLinkFrame) obj;
            if (this.f4289a.equals(urlLinkFrame.f4289a) && v.a(this.f4302d, urlLinkFrame.f4302d) && v.a(this.f4303g, urlLinkFrame.f4303g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iG = a.g(this.f4289a, 527, 31);
        String str = this.f4302d;
        int iHashCode = (iG + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f4303g;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public final String toString() {
        String str = this.f4289a;
        int iD = a.d(6, str);
        String str2 = this.f4303g;
        return a.k(a.d(iD, str2), str, ": url=", str2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f4289a);
        parcel.writeString(this.f4302d);
        parcel.writeString(this.f4303g);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public UrlLinkFrame(Parcel parcel) {
        String string = parcel.readString();
        int i10 = v.f20828a;
        super(string);
        this.f4302d = parcel.readString();
        this.f4303g = parcel.readString();
    }
}

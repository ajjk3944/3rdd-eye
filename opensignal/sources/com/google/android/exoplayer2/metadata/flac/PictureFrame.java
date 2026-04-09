package com.google.android.exoplayer2.metadata.flac;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.o0;
import i6.a;
import java.util.Arrays;
import qb.v;

/* loaded from: classes.dex */
public final class PictureFrame implements Metadata.Entry {
    public static final Parcelable.Creator<PictureFrame> CREATOR = new a(19);
    public final int B;
    public final byte[] D;

    /* renamed from: a, reason: collision with root package name */
    public final int f4250a;

    /* renamed from: d, reason: collision with root package name */
    public final String f4251d;

    /* renamed from: g, reason: collision with root package name */
    public final String f4252g;

    /* renamed from: r, reason: collision with root package name */
    public final int f4253r;

    /* renamed from: x, reason: collision with root package name */
    public final int f4254x;

    /* renamed from: y, reason: collision with root package name */
    public final int f4255y;

    public PictureFrame(int i10, String str, String str2, int i11, int i12, int i13, int i14, byte[] bArr) {
        this.f4250a = i10;
        this.f4251d = str;
        this.f4252g = str2;
        this.f4253r = i11;
        this.f4254x = i12;
        this.f4255y = i13;
        this.B = i14;
        this.D = bArr;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final void c(o0 o0Var) {
        o0Var.a(this.f4250a, this.D);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && PictureFrame.class == obj.getClass()) {
            PictureFrame pictureFrame = (PictureFrame) obj;
            if (this.f4250a == pictureFrame.f4250a && this.f4251d.equals(pictureFrame.f4251d) && this.f4252g.equals(pictureFrame.f4252g) && this.f4253r == pictureFrame.f4253r && this.f4254x == pictureFrame.f4254x && this.f4255y == pictureFrame.f4255y && this.B == pictureFrame.B && Arrays.equals(this.D, pictureFrame.D)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.D) + ((((((((c7.a.g(this.f4252g, c7.a.g(this.f4251d, (527 + this.f4250a) * 31, 31), 31) + this.f4253r) * 31) + this.f4254x) * 31) + this.f4255y) * 31) + this.B) * 31);
    }

    public final String toString() {
        String str = this.f4251d;
        int iD = c7.a.d(32, str);
        String str2 = this.f4252g;
        StringBuilder sb2 = new StringBuilder(c7.a.d(iD, str2));
        sb2.append("Picture: mimeType=");
        sb2.append(str);
        sb2.append(", description=");
        sb2.append(str2);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f4250a);
        parcel.writeString(this.f4251d);
        parcel.writeString(this.f4252g);
        parcel.writeInt(this.f4253r);
        parcel.writeInt(this.f4254x);
        parcel.writeInt(this.f4255y);
        parcel.writeInt(this.B);
        parcel.writeByteArray(this.D);
    }

    public PictureFrame(Parcel parcel) {
        this.f4250a = parcel.readInt();
        String string = parcel.readString();
        int i10 = v.f20828a;
        this.f4251d = string;
        this.f4252g = parcel.readString();
        this.f4253r = parcel.readInt();
        this.f4254x = parcel.readInt();
        this.f4255y = parcel.readInt();
        this.B = parcel.readInt();
        this.D = parcel.createByteArray();
    }
}

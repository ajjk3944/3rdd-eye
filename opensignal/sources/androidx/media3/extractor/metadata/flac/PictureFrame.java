package androidx.media3.extractor.metadata.flac;

import a5.d0;
import a5.v;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.Metadata;
import androidx.media3.common.f0;
import c7.a;
import cc.a0;
import java.util.Arrays;
import ne.g;

/* loaded from: classes.dex */
public final class PictureFrame implements Metadata.Entry {
    public static final Parcelable.Creator<PictureFrame> CREATOR = new a0(3);
    public final int B;
    public final byte[] D;

    /* renamed from: a, reason: collision with root package name */
    public final int f1954a;

    /* renamed from: d, reason: collision with root package name */
    public final String f1955d;

    /* renamed from: g, reason: collision with root package name */
    public final String f1956g;

    /* renamed from: r, reason: collision with root package name */
    public final int f1957r;

    /* renamed from: x, reason: collision with root package name */
    public final int f1958x;

    /* renamed from: y, reason: collision with root package name */
    public final int f1959y;

    public PictureFrame(int i10, String str, String str2, int i11, int i12, int i13, int i14, byte[] bArr) {
        this.f1954a = i10;
        this.f1955d = str;
        this.f1956g = str2;
        this.f1957r = i11;
        this.f1958x = i12;
        this.f1959y = i13;
        this.B = i14;
        this.D = bArr;
    }

    public static PictureFrame d(v vVar) {
        int iG = vVar.g();
        String strR = vVar.r(vVar.g(), g.f17522a);
        String strR2 = vVar.r(vVar.g(), g.f17524c);
        int iG2 = vVar.g();
        int iG3 = vVar.g();
        int iG4 = vVar.g();
        int iG5 = vVar.g();
        int iG6 = vVar.g();
        byte[] bArr = new byte[iG6];
        vVar.e(bArr, 0, iG6);
        return new PictureFrame(iG, strR, strR2, iG2, iG3, iG4, iG5, bArr);
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
            if (this.f1954a == pictureFrame.f1954a && this.f1955d.equals(pictureFrame.f1955d) && this.f1956g.equals(pictureFrame.f1956g) && this.f1957r == pictureFrame.f1957r && this.f1958x == pictureFrame.f1958x && this.f1959y == pictureFrame.f1959y && this.B == pictureFrame.B && Arrays.equals(this.D, pictureFrame.D)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.D) + ((((((((a.g(this.f1956g, a.g(this.f1955d, (527 + this.f1954a) * 31, 31), 31) + this.f1957r) * 31) + this.f1958x) * 31) + this.f1959y) * 31) + this.B) * 31);
    }

    @Override // androidx.media3.common.Metadata.Entry
    public final void k(f0 f0Var) {
        f0Var.a(this.f1954a, this.D);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.f1955d + ", description=" + this.f1956g;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f1954a);
        parcel.writeString(this.f1955d);
        parcel.writeString(this.f1956g);
        parcel.writeInt(this.f1957r);
        parcel.writeInt(this.f1958x);
        parcel.writeInt(this.f1959y);
        parcel.writeInt(this.B);
        parcel.writeByteArray(this.D);
    }

    public PictureFrame(Parcel parcel) {
        this.f1954a = parcel.readInt();
        String string = parcel.readString();
        int i10 = d0.f105a;
        this.f1955d = string;
        this.f1956g = parcel.readString();
        this.f1957r = parcel.readInt();
        this.f1958x = parcel.readInt();
        this.f1959y = parcel.readInt();
        this.B = parcel.readInt();
        this.D = parcel.createByteArray();
    }
}

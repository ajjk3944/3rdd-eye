package androidx.media3.extractor.metadata.id3;

import a5.d0;
import android.os.Parcel;
import android.os.Parcelable;
import cc.a0;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class GeobFrame extends Id3Frame {
    public static final Parcelable.Creator<GeobFrame> CREATOR = new a0(14);

    /* renamed from: d, reason: collision with root package name */
    public final String f1989d;

    /* renamed from: g, reason: collision with root package name */
    public final String f1990g;

    /* renamed from: r, reason: collision with root package name */
    public final String f1991r;

    /* renamed from: x, reason: collision with root package name */
    public final byte[] f1992x;

    public GeobFrame(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f1989d = str;
        this.f1990g = str2;
        this.f1991r = str3;
        this.f1992x = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && GeobFrame.class == obj.getClass()) {
            GeobFrame geobFrame = (GeobFrame) obj;
            if (d0.a(this.f1989d, geobFrame.f1989d) && d0.a(this.f1990g, geobFrame.f1990g) && d0.a(this.f1991r, geobFrame.f1991r) && Arrays.equals(this.f1992x, geobFrame.f1992x)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f1989d;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f1990g;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f1991r;
        return Arrays.hashCode(this.f1992x) + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // androidx.media3.extractor.metadata.id3.Id3Frame
    public final String toString() {
        return this.f1993a + ": mimeType=" + this.f1989d + ", filename=" + this.f1990g + ", description=" + this.f1991r;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f1989d);
        parcel.writeString(this.f1990g);
        parcel.writeString(this.f1991r);
        parcel.writeByteArray(this.f1992x);
    }

    public GeobFrame(Parcel parcel) {
        super("GEOB");
        String string = parcel.readString();
        int i10 = d0.f105a;
        this.f1989d = string;
        this.f1990g = parcel.readString();
        this.f1991r = parcel.readString();
        this.f1992x = parcel.createByteArray();
    }
}

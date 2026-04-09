package androidx.media3.extractor.metadata.id3;

import a5.d0;
import android.os.Parcel;
import android.os.Parcelable;
import cc.a0;

/* loaded from: classes.dex */
public final class CommentFrame extends Id3Frame {
    public static final Parcelable.Creator<CommentFrame> CREATOR = new a0(13);

    /* renamed from: d, reason: collision with root package name */
    public final String f1986d;

    /* renamed from: g, reason: collision with root package name */
    public final String f1987g;

    /* renamed from: r, reason: collision with root package name */
    public final String f1988r;

    public CommentFrame(String str, String str2, String str3) {
        super("COMM");
        this.f1986d = str;
        this.f1987g = str2;
        this.f1988r = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && CommentFrame.class == obj.getClass()) {
            CommentFrame commentFrame = (CommentFrame) obj;
            if (d0.a(this.f1987g, commentFrame.f1987g) && d0.a(this.f1986d, commentFrame.f1986d) && d0.a(this.f1988r, commentFrame.f1988r)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f1986d;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f1987g;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f1988r;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // androidx.media3.extractor.metadata.id3.Id3Frame
    public final String toString() {
        return this.f1993a + ": language=" + this.f1986d + ", description=" + this.f1987g;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f1993a);
        parcel.writeString(this.f1986d);
        parcel.writeString(this.f1988r);
    }

    public CommentFrame(Parcel parcel) {
        super("COMM");
        String string = parcel.readString();
        int i10 = d0.f105a;
        this.f1986d = string;
        this.f1987g = parcel.readString();
        this.f1988r = parcel.readString();
    }
}

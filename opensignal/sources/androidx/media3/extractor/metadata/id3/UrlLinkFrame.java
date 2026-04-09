package androidx.media3.extractor.metadata.id3;

import a5.d0;
import android.os.Parcel;
import android.os.Parcelable;
import c7.a;
import cc.a0;

/* loaded from: classes.dex */
public final class UrlLinkFrame extends Id3Frame {
    public static final Parcelable.Creator<UrlLinkFrame> CREATOR = new a0(19);

    /* renamed from: d, reason: collision with root package name */
    public final String f2006d;

    /* renamed from: g, reason: collision with root package name */
    public final String f2007g;

    public UrlLinkFrame(String str, String str2, String str3) {
        super(str);
        this.f2006d = str2;
        this.f2007g = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && UrlLinkFrame.class == obj.getClass()) {
            UrlLinkFrame urlLinkFrame = (UrlLinkFrame) obj;
            if (this.f1993a.equals(urlLinkFrame.f1993a) && d0.a(this.f2006d, urlLinkFrame.f2006d) && d0.a(this.f2007g, urlLinkFrame.f2007g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iG = a.g(this.f1993a, 527, 31);
        String str = this.f2006d;
        int iHashCode = (iG + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f2007g;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // androidx.media3.extractor.metadata.id3.Id3Frame
    public final String toString() {
        return this.f1993a + ": url=" + this.f2007g;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f1993a);
        parcel.writeString(this.f2006d);
        parcel.writeString(this.f2007g);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public UrlLinkFrame(Parcel parcel) {
        String string = parcel.readString();
        int i10 = d0.f105a;
        super(string);
        this.f2006d = parcel.readString();
        this.f2007g = parcel.readString();
    }
}

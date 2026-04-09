package androidx.media3.extractor.metadata.id3;

import a5.d0;
import android.os.Parcel;
import android.os.Parcelable;
import cc.a0;

/* loaded from: classes.dex */
public final class InternalFrame extends Id3Frame {
    public static final Parcelable.Creator<InternalFrame> CREATOR = new a0(15);

    /* renamed from: d, reason: collision with root package name */
    public final String f1994d;

    /* renamed from: g, reason: collision with root package name */
    public final String f1995g;

    /* renamed from: r, reason: collision with root package name */
    public final String f1996r;

    public InternalFrame(String str, String str2, String str3) {
        super("----");
        this.f1994d = str;
        this.f1995g = str2;
        this.f1996r = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && InternalFrame.class == obj.getClass()) {
            InternalFrame internalFrame = (InternalFrame) obj;
            if (d0.a(this.f1995g, internalFrame.f1995g) && d0.a(this.f1994d, internalFrame.f1994d) && d0.a(this.f1996r, internalFrame.f1996r)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f1994d;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f1995g;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f1996r;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // androidx.media3.extractor.metadata.id3.Id3Frame
    public final String toString() {
        return this.f1993a + ": domain=" + this.f1994d + ", description=" + this.f1995g;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f1993a);
        parcel.writeString(this.f1994d);
        parcel.writeString(this.f1996r);
    }

    public InternalFrame(Parcel parcel) {
        super("----");
        String string = parcel.readString();
        int i10 = d0.f105a;
        this.f1994d = string;
        this.f1995g = parcel.readString();
        this.f1996r = parcel.readString();
    }
}

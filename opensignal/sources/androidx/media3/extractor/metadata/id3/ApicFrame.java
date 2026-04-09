package androidx.media3.extractor.metadata.id3;

import a5.d0;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.f0;
import cc.a0;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class ApicFrame extends Id3Frame {
    public static final Parcelable.Creator<ApicFrame> CREATOR = new a0(9);

    /* renamed from: d, reason: collision with root package name */
    public final String f1971d;

    /* renamed from: g, reason: collision with root package name */
    public final String f1972g;

    /* renamed from: r, reason: collision with root package name */
    public final int f1973r;

    /* renamed from: x, reason: collision with root package name */
    public final byte[] f1974x;

    public ApicFrame(String str, String str2, int i10, byte[] bArr) {
        super("APIC");
        this.f1971d = str;
        this.f1972g = str2;
        this.f1973r = i10;
        this.f1974x = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ApicFrame.class == obj.getClass()) {
            ApicFrame apicFrame = (ApicFrame) obj;
            if (this.f1973r == apicFrame.f1973r && d0.a(this.f1971d, apicFrame.f1971d) && d0.a(this.f1972g, apicFrame.f1972g) && Arrays.equals(this.f1974x, apicFrame.f1974x)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = (527 + this.f1973r) * 31;
        String str = this.f1971d;
        int iHashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f1972g;
        return Arrays.hashCode(this.f1974x) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // androidx.media3.common.Metadata.Entry
    public final void k(f0 f0Var) {
        f0Var.a(this.f1973r, this.f1974x);
    }

    @Override // androidx.media3.extractor.metadata.id3.Id3Frame
    public final String toString() {
        return this.f1993a + ": mimeType=" + this.f1971d + ", description=" + this.f1972g;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f1971d);
        parcel.writeString(this.f1972g);
        parcel.writeInt(this.f1973r);
        parcel.writeByteArray(this.f1974x);
    }

    public ApicFrame(Parcel parcel) {
        super("APIC");
        String string = parcel.readString();
        int i10 = d0.f105a;
        this.f1971d = string;
        this.f1972g = parcel.readString();
        this.f1973r = parcel.readInt();
        this.f1974x = parcel.createByteArray();
    }
}

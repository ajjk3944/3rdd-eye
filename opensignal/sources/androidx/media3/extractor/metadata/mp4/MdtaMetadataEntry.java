package androidx.media3.extractor.metadata.mp4;

import a5.d0;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.Metadata;
import cc.a0;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class MdtaMetadataEntry implements Metadata.Entry {
    public static final Parcelable.Creator<MdtaMetadataEntry> CREATOR = new a0(20);

    /* renamed from: a, reason: collision with root package name */
    public final String f2008a;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f2009d;

    /* renamed from: g, reason: collision with root package name */
    public final int f2010g;

    /* renamed from: r, reason: collision with root package name */
    public final int f2011r;

    public MdtaMetadataEntry(int i10, int i11, String str, byte[] bArr) {
        this.f2008a = str;
        this.f2009d = bArr;
        this.f2010g = i10;
        this.f2011r = i11;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && MdtaMetadataEntry.class == obj.getClass()) {
            MdtaMetadataEntry mdtaMetadataEntry = (MdtaMetadataEntry) obj;
            if (this.f2008a.equals(mdtaMetadataEntry.f2008a) && Arrays.equals(this.f2009d, mdtaMetadataEntry.f2009d) && this.f2010g == mdtaMetadataEntry.f2010g && this.f2011r == mdtaMetadataEntry.f2011r) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f2009d) + c7.a.g(this.f2008a, 527, 31)) * 31) + this.f2010g) * 31) + this.f2011r;
    }

    public final String toString() {
        return "mdta: key=" + this.f2008a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f2008a);
        parcel.writeByteArray(this.f2009d);
        parcel.writeInt(this.f2010g);
        parcel.writeInt(this.f2011r);
    }

    public MdtaMetadataEntry(Parcel parcel) {
        String string = parcel.readString();
        int i10 = d0.f105a;
        this.f2008a = string;
        this.f2009d = parcel.createByteArray();
        this.f2010g = parcel.readInt();
        this.f2011r = parcel.readInt();
    }
}

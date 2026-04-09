package androidx.media3.exoplayer.hls;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.media3.common.Metadata;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import w.g;

/* loaded from: classes.dex */
public final class HlsTrackMetadataEntry implements Metadata.Entry {
    public static final Parcelable.Creator<HlsTrackMetadataEntry> CREATOR = new i6.a(5);

    /* renamed from: a, reason: collision with root package name */
    public final String f1848a;

    /* renamed from: d, reason: collision with root package name */
    public final String f1849d;

    /* renamed from: g, reason: collision with root package name */
    public final List f1850g;

    public HlsTrackMetadataEntry(String str, String str2, List list) {
        this.f1848a = str;
        this.f1849d = str2;
        this.f1850g = Collections.unmodifiableList(new ArrayList(list));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && HlsTrackMetadataEntry.class == obj.getClass()) {
            HlsTrackMetadataEntry hlsTrackMetadataEntry = (HlsTrackMetadataEntry) obj;
            if (TextUtils.equals(this.f1848a, hlsTrackMetadataEntry.f1848a) && TextUtils.equals(this.f1849d, hlsTrackMetadataEntry.f1849d) && this.f1850g.equals(hlsTrackMetadataEntry.f1850g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f1848a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f1849d;
        return this.f1850g.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HlsTrackMetadataEntry");
        String str = this.f1848a;
        sb2.append(str != null ? g.j(c7.a.u(" [", str, ", "), this.f1849d, "]") : "");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f1848a);
        parcel.writeString(this.f1849d);
        List list = this.f1850g;
        int size = list.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            parcel.writeParcelable((Parcelable) list.get(i11), 0);
        }
    }

    public HlsTrackMetadataEntry(Parcel parcel) {
        this.f1848a = parcel.readString();
        this.f1849d = parcel.readString();
        int i10 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add((VariantInfo) parcel.readParcelable(VariantInfo.class.getClassLoader()));
        }
        this.f1850g = Collections.unmodifiableList(arrayList);
    }

    public static final class VariantInfo implements Parcelable {
        public static final Parcelable.Creator<VariantInfo> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public final int f1851a;

        /* renamed from: d, reason: collision with root package name */
        public final int f1852d;

        /* renamed from: g, reason: collision with root package name */
        public final String f1853g;

        /* renamed from: r, reason: collision with root package name */
        public final String f1854r;

        /* renamed from: x, reason: collision with root package name */
        public final String f1855x;

        /* renamed from: y, reason: collision with root package name */
        public final String f1856y;

        public VariantInfo(int i10, int i11, String str, String str2, String str3, String str4) {
            this.f1851a = i10;
            this.f1852d = i11;
            this.f1853g = str;
            this.f1854r = str2;
            this.f1855x = str3;
            this.f1856y = str4;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && VariantInfo.class == obj.getClass()) {
                VariantInfo variantInfo = (VariantInfo) obj;
                if (this.f1851a == variantInfo.f1851a && this.f1852d == variantInfo.f1852d && TextUtils.equals(this.f1853g, variantInfo.f1853g) && TextUtils.equals(this.f1854r, variantInfo.f1854r) && TextUtils.equals(this.f1855x, variantInfo.f1855x) && TextUtils.equals(this.f1856y, variantInfo.f1856y)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            int i10 = ((this.f1851a * 31) + this.f1852d) * 31;
            String str = this.f1853g;
            int iHashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f1854r;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f1855x;
            int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.f1856y;
            return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f1851a);
            parcel.writeInt(this.f1852d);
            parcel.writeString(this.f1853g);
            parcel.writeString(this.f1854r);
            parcel.writeString(this.f1855x);
            parcel.writeString(this.f1856y);
        }

        public VariantInfo(Parcel parcel) {
            this.f1851a = parcel.readInt();
            this.f1852d = parcel.readInt();
            this.f1853g = parcel.readString();
            this.f1854r = parcel.readString();
            this.f1855x = parcel.readString();
            this.f1856y = parcel.readString();
        }
    }
}

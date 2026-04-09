package com.google.android.exoplayer2.source.hls;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import cc.a0;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class HlsTrackMetadataEntry implements Metadata.Entry {
    public static final Parcelable.Creator<HlsTrackMetadataEntry> CREATOR = new a0(2);

    /* renamed from: a, reason: collision with root package name */
    public final String f4460a;

    /* renamed from: d, reason: collision with root package name */
    public final String f4461d;

    /* renamed from: g, reason: collision with root package name */
    public final List f4462g;

    public HlsTrackMetadataEntry(String str, String str2, List list) {
        this.f4460a = str;
        this.f4461d = str2;
        this.f4462g = Collections.unmodifiableList(new ArrayList(list));
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
            if (TextUtils.equals(this.f4460a, hlsTrackMetadataEntry.f4460a) && TextUtils.equals(this.f4461d, hlsTrackMetadataEntry.f4461d) && this.f4462g.equals(hlsTrackMetadataEntry.f4462g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f4460a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f4461d;
        return this.f4462g.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        String string;
        String str = this.f4460a;
        if (str != null) {
            int iD = c7.a.d(5, str);
            String str2 = this.f4461d;
            StringBuilder sbS = c7.a.s(c7.a.d(iD, str2), " [", str, ", ", str2);
            sbS.append("]");
            string = sbS.toString();
        } else {
            string = "";
        }
        String strValueOf = String.valueOf(string);
        return strValueOf.length() != 0 ? "HlsTrackMetadataEntry".concat(strValueOf) : new String("HlsTrackMetadataEntry");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f4460a);
        parcel.writeString(this.f4461d);
        List list = this.f4462g;
        int size = list.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            parcel.writeParcelable((Parcelable) list.get(i11), 0);
        }
    }

    public HlsTrackMetadataEntry(Parcel parcel) {
        this.f4460a = parcel.readString();
        this.f4461d = parcel.readString();
        int i10 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add((VariantInfo) parcel.readParcelable(VariantInfo.class.getClassLoader()));
        }
        this.f4462g = Collections.unmodifiableList(arrayList);
    }

    public static final class VariantInfo implements Parcelable {
        public static final Parcelable.Creator<VariantInfo> CREATOR = new v();

        /* renamed from: a, reason: collision with root package name */
        public final int f4463a;

        /* renamed from: d, reason: collision with root package name */
        public final int f4464d;

        /* renamed from: g, reason: collision with root package name */
        public final String f4465g;

        /* renamed from: r, reason: collision with root package name */
        public final String f4466r;

        /* renamed from: x, reason: collision with root package name */
        public final String f4467x;

        /* renamed from: y, reason: collision with root package name */
        public final String f4468y;

        public VariantInfo(int i10, int i11, String str, String str2, String str3, String str4) {
            this.f4463a = i10;
            this.f4464d = i11;
            this.f4465g = str;
            this.f4466r = str2;
            this.f4467x = str3;
            this.f4468y = str4;
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
                if (this.f4463a == variantInfo.f4463a && this.f4464d == variantInfo.f4464d && TextUtils.equals(this.f4465g, variantInfo.f4465g) && TextUtils.equals(this.f4466r, variantInfo.f4466r) && TextUtils.equals(this.f4467x, variantInfo.f4467x) && TextUtils.equals(this.f4468y, variantInfo.f4468y)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            int i10 = ((this.f4463a * 31) + this.f4464d) * 31;
            String str = this.f4465g;
            int iHashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f4466r;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f4467x;
            int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.f4468y;
            return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f4463a);
            parcel.writeInt(this.f4464d);
            parcel.writeString(this.f4465g);
            parcel.writeString(this.f4466r);
            parcel.writeString(this.f4467x);
            parcel.writeString(this.f4468y);
        }

        public VariantInfo(Parcel parcel) {
            this.f4463a = parcel.readInt();
            this.f4464d = parcel.readInt();
            this.f4465g = parcel.readString();
            this.f4466r = parcel.readString();
            this.f4467x = parcel.readString();
            this.f4468y = parcel.readString();
        }
    }
}

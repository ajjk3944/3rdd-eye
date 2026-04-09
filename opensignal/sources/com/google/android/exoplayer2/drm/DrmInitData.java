package com.google.android.exoplayer2.drm;

import ac.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;
import qb.v;

/* loaded from: classes.dex */
public final class DrmInitData implements Comparator<SchemeData>, Parcelable {
    public static final Parcelable.Creator<DrmInitData> CREATOR = new l(11);

    /* renamed from: a, reason: collision with root package name */
    public final SchemeData[] f4095a;

    /* renamed from: d, reason: collision with root package name */
    public int f4096d;

    /* renamed from: g, reason: collision with root package name */
    public final String f4097g;

    /* renamed from: r, reason: collision with root package name */
    public final int f4098r;

    public DrmInitData(String str, ArrayList arrayList) {
        this(str, false, (SchemeData[]) arrayList.toArray(new SchemeData[0]));
    }

    @Override // java.util.Comparator
    public final int compare(SchemeData schemeData, SchemeData schemeData2) {
        SchemeData schemeData3 = schemeData;
        SchemeData schemeData4 = schemeData2;
        UUID uuid = h.f4166a;
        return uuid.equals(schemeData3.f4100d) ? uuid.equals(schemeData4.f4100d) ? 0 : 1 : schemeData3.f4100d.compareTo(schemeData4.f4100d);
    }

    public final DrmInitData d(String str) {
        return v.a(this.f4097g, str) ? this : new DrmInitData(str, false, this.f4095a);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && DrmInitData.class == obj.getClass()) {
            DrmInitData drmInitData = (DrmInitData) obj;
            if (v.a(this.f4097g, drmInitData.f4097g) && Arrays.equals(this.f4095a, drmInitData.f4095a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f4096d == 0) {
            String str = this.f4097g;
            this.f4096d = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f4095a);
        }
        return this.f4096d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f4097g);
        parcel.writeTypedArray(this.f4095a, 0);
    }

    public DrmInitData(String str, boolean z10, SchemeData... schemeDataArr) {
        this.f4097g = str;
        schemeDataArr = z10 ? (SchemeData[]) schemeDataArr.clone() : schemeDataArr;
        this.f4095a = schemeDataArr;
        this.f4098r = schemeDataArr.length;
        Arrays.sort(schemeDataArr, this);
    }

    public static final class SchemeData implements Parcelable {
        public static final Parcelable.Creator<SchemeData> CREATOR = new b();

        /* renamed from: a, reason: collision with root package name */
        public int f4099a;

        /* renamed from: d, reason: collision with root package name */
        public final UUID f4100d;

        /* renamed from: g, reason: collision with root package name */
        public final String f4101g;

        /* renamed from: r, reason: collision with root package name */
        public final String f4102r;

        /* renamed from: x, reason: collision with root package name */
        public final byte[] f4103x;

        public SchemeData(UUID uuid, String str, String str2, byte[] bArr) {
            uuid.getClass();
            this.f4100d = uuid;
            this.f4101g = str;
            str2.getClass();
            this.f4102r = str2;
            this.f4103x = bArr;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof SchemeData)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            SchemeData schemeData = (SchemeData) obj;
            return v.a(this.f4101g, schemeData.f4101g) && v.a(this.f4102r, schemeData.f4102r) && v.a(this.f4100d, schemeData.f4100d) && Arrays.equals(this.f4103x, schemeData.f4103x);
        }

        public final int hashCode() {
            if (this.f4099a == 0) {
                int iHashCode = this.f4100d.hashCode() * 31;
                String str = this.f4101g;
                this.f4099a = Arrays.hashCode(this.f4103x) + c7.a.g(this.f4102r, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
            }
            return this.f4099a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            UUID uuid = this.f4100d;
            parcel.writeLong(uuid.getMostSignificantBits());
            parcel.writeLong(uuid.getLeastSignificantBits());
            parcel.writeString(this.f4101g);
            parcel.writeString(this.f4102r);
            parcel.writeByteArray(this.f4103x);
        }

        public SchemeData(Parcel parcel) {
            this.f4100d = new UUID(parcel.readLong(), parcel.readLong());
            this.f4101g = parcel.readString();
            String string = parcel.readString();
            int i10 = v.f20828a;
            this.f4102r = string;
            this.f4103x = parcel.createByteArray();
        }
    }

    public DrmInitData(Parcel parcel) {
        this.f4097g = parcel.readString();
        SchemeData[] schemeDataArr = (SchemeData[]) parcel.createTypedArray(SchemeData.CREATOR);
        int i10 = v.f20828a;
        this.f4095a = schemeDataArr;
        this.f4098r = schemeDataArr.length;
    }
}

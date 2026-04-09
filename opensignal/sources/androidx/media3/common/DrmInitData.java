package androidx.media3.common;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;

/* loaded from: classes.dex */
public final class DrmInitData implements Comparator<SchemeData>, Parcelable {
    public static final Parcelable.Creator<DrmInitData> CREATOR = new ac.l(6);

    /* renamed from: a, reason: collision with root package name */
    public final SchemeData[] f1540a;

    /* renamed from: d, reason: collision with root package name */
    public int f1541d;

    /* renamed from: g, reason: collision with root package name */
    public final String f1542g;

    /* renamed from: r, reason: collision with root package name */
    public final int f1543r;

    public DrmInitData(String str, ArrayList arrayList) {
        this(str, false, (SchemeData[]) arrayList.toArray(new SchemeData[0]));
    }

    @Override // java.util.Comparator
    public final int compare(SchemeData schemeData, SchemeData schemeData2) {
        SchemeData schemeData3 = schemeData;
        SchemeData schemeData4 = schemeData2;
        UUID uuid = j.f1701a;
        return uuid.equals(schemeData3.f1545d) ? uuid.equals(schemeData4.f1545d) ? 0 : 1 : schemeData3.f1545d.compareTo(schemeData4.f1545d);
    }

    public final DrmInitData d(String str) {
        return a5.d0.a(this.f1542g, str) ? this : new DrmInitData(str, false, this.f1540a);
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
            if (a5.d0.a(this.f1542g, drmInitData.f1542g) && Arrays.equals(this.f1540a, drmInitData.f1540a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f1541d == 0) {
            String str = this.f1542g;
            this.f1541d = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f1540a);
        }
        return this.f1541d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f1542g);
        parcel.writeTypedArray(this.f1540a, 0);
    }

    public DrmInitData(String str, boolean z10, SchemeData... schemeDataArr) {
        this.f1542g = str;
        schemeDataArr = z10 ? (SchemeData[]) schemeDataArr.clone() : schemeDataArr;
        this.f1540a = schemeDataArr;
        this.f1543r = schemeDataArr.length;
        Arrays.sort(schemeDataArr, this);
    }

    public static final class SchemeData implements Parcelable {
        public static final Parcelable.Creator<SchemeData> CREATOR = new n();

        /* renamed from: a, reason: collision with root package name */
        public int f1544a;

        /* renamed from: d, reason: collision with root package name */
        public final UUID f1545d;

        /* renamed from: g, reason: collision with root package name */
        public final String f1546g;

        /* renamed from: r, reason: collision with root package name */
        public final String f1547r;

        /* renamed from: x, reason: collision with root package name */
        public final byte[] f1548x;

        public SchemeData(UUID uuid, String str, String str2, byte[] bArr) {
            uuid.getClass();
            this.f1545d = uuid;
            this.f1546g = str;
            str2.getClass();
            this.f1547r = str2;
            this.f1548x = bArr;
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
            return a5.d0.a(this.f1546g, schemeData.f1546g) && a5.d0.a(this.f1547r, schemeData.f1547r) && a5.d0.a(this.f1545d, schemeData.f1545d) && Arrays.equals(this.f1548x, schemeData.f1548x);
        }

        public final int hashCode() {
            if (this.f1544a == 0) {
                int iHashCode = this.f1545d.hashCode() * 31;
                String str = this.f1546g;
                this.f1544a = Arrays.hashCode(this.f1548x) + c7.a.g(this.f1547r, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
            }
            return this.f1544a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            UUID uuid = this.f1545d;
            parcel.writeLong(uuid.getMostSignificantBits());
            parcel.writeLong(uuid.getLeastSignificantBits());
            parcel.writeString(this.f1546g);
            parcel.writeString(this.f1547r);
            parcel.writeByteArray(this.f1548x);
        }

        public SchemeData(Parcel parcel) {
            this.f1545d = new UUID(parcel.readLong(), parcel.readLong());
            this.f1546g = parcel.readString();
            String string = parcel.readString();
            int i10 = a5.d0.f105a;
            this.f1547r = string;
            this.f1548x = parcel.createByteArray();
        }
    }

    public DrmInitData(Parcel parcel) {
        this.f1542g = parcel.readString();
        SchemeData[] schemeDataArr = (SchemeData[]) parcel.createTypedArray(SchemeData.CREATOR);
        int i10 = a5.d0.f105a;
        this.f1540a = schemeDataArr;
        this.f1543r = schemeDataArr.length;
    }
}

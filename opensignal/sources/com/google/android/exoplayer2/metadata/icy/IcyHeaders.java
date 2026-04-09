package com.google.android.exoplayer2.metadata.icy;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;
import i6.a;
import qb.b;
import qb.v;

/* loaded from: classes.dex */
public final class IcyHeaders implements Metadata.Entry {
    public static final Parcelable.Creator<IcyHeaders> CREATOR = new a(23);

    /* renamed from: a, reason: collision with root package name */
    public final int f4258a;

    /* renamed from: d, reason: collision with root package name */
    public final String f4259d;

    /* renamed from: g, reason: collision with root package name */
    public final String f4260g;

    /* renamed from: r, reason: collision with root package name */
    public final String f4261r;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f4262x;

    /* renamed from: y, reason: collision with root package name */
    public final int f4263y;

    public IcyHeaders(int i10, int i11, String str, String str2, String str3, boolean z10) {
        b.g(i11 == -1 || i11 > 0);
        this.f4258a = i10;
        this.f4259d = str;
        this.f4260g = str2;
        this.f4261r = str3;
        this.f4262x = z10;
        this.f4263y = i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.exoplayer2.metadata.icy.IcyHeaders d(java.util.Map r13) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 265
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.metadata.icy.IcyHeaders.d(java.util.Map):com.google.android.exoplayer2.metadata.icy.IcyHeaders");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && IcyHeaders.class == obj.getClass()) {
            IcyHeaders icyHeaders = (IcyHeaders) obj;
            if (this.f4258a == icyHeaders.f4258a && v.a(this.f4259d, icyHeaders.f4259d) && v.a(this.f4260g, icyHeaders.f4260g) && v.a(this.f4261r, icyHeaders.f4261r) && this.f4262x == icyHeaders.f4262x && this.f4263y == icyHeaders.f4263y) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = (527 + this.f4258a) * 31;
        String str = this.f4259d;
        int iHashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f4260g;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f4261r;
        return ((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f4262x ? 1 : 0)) * 31) + this.f4263y;
    }

    public final String toString() {
        String str = this.f4260g;
        int iD = c7.a.d(80, str);
        String str2 = this.f4259d;
        StringBuilder sbS = c7.a.s(c7.a.d(iD, str2), "IcyHeaders: name=\"", str, "\", genre=\"", str2);
        sbS.append("\", bitrate=");
        sbS.append(this.f4258a);
        sbS.append(", metadataInterval=");
        sbS.append(this.f4263y);
        return sbS.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f4258a);
        parcel.writeString(this.f4259d);
        parcel.writeString(this.f4260g);
        parcel.writeString(this.f4261r);
        int i11 = v.f20828a;
        parcel.writeInt(this.f4262x ? 1 : 0);
        parcel.writeInt(this.f4263y);
    }

    public IcyHeaders(Parcel parcel) {
        this.f4258a = parcel.readInt();
        this.f4259d = parcel.readString();
        this.f4260g = parcel.readString();
        this.f4261r = parcel.readString();
        int i10 = v.f20828a;
        this.f4262x = parcel.readInt() != 0;
        this.f4263y = parcel.readInt();
    }
}

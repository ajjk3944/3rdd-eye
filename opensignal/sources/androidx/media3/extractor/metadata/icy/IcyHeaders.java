package androidx.media3.extractor.metadata.icy;

import a5.a;
import a5.d0;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.Metadata;
import androidx.media3.common.f0;
import cc.a0;

/* loaded from: classes.dex */
public final class IcyHeaders implements Metadata.Entry {
    public static final Parcelable.Creator<IcyHeaders> CREATOR = new a0(5);

    /* renamed from: a, reason: collision with root package name */
    public final int f1962a;

    /* renamed from: d, reason: collision with root package name */
    public final String f1963d;

    /* renamed from: g, reason: collision with root package name */
    public final String f1964g;

    /* renamed from: r, reason: collision with root package name */
    public final String f1965r;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f1966x;

    /* renamed from: y, reason: collision with root package name */
    public final int f1967y;

    public IcyHeaders(int i10, int i11, String str, String str2, String str3, boolean z10) {
        a.e(i11 == -1 || i11 > 0);
        this.f1962a = i10;
        this.f1963d = str;
        this.f1964g = str2;
        this.f1965r = str3;
        this.f1966x = z10;
        this.f1967y = i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static androidx.media3.extractor.metadata.icy.IcyHeaders d(java.util.Map r14) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 207
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.metadata.icy.IcyHeaders.d(java.util.Map):androidx.media3.extractor.metadata.icy.IcyHeaders");
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
            if (this.f1962a == icyHeaders.f1962a && d0.a(this.f1963d, icyHeaders.f1963d) && d0.a(this.f1964g, icyHeaders.f1964g) && d0.a(this.f1965r, icyHeaders.f1965r) && this.f1966x == icyHeaders.f1966x && this.f1967y == icyHeaders.f1967y) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = (527 + this.f1962a) * 31;
        String str = this.f1963d;
        int iHashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f1964g;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f1965r;
        return ((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f1966x ? 1 : 0)) * 31) + this.f1967y;
    }

    @Override // androidx.media3.common.Metadata.Entry
    public final void k(f0 f0Var) {
        String str = this.f1964g;
        if (str != null) {
            f0Var.E = str;
        }
        String str2 = this.f1963d;
        if (str2 != null) {
            f0Var.C = str2;
        }
    }

    public final String toString() {
        return "IcyHeaders: name=\"" + this.f1964g + "\", genre=\"" + this.f1963d + "\", bitrate=" + this.f1962a + ", metadataInterval=" + this.f1967y;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f1962a);
        parcel.writeString(this.f1963d);
        parcel.writeString(this.f1964g);
        parcel.writeString(this.f1965r);
        int i11 = d0.f105a;
        parcel.writeInt(this.f1966x ? 1 : 0);
        parcel.writeInt(this.f1967y);
    }

    public IcyHeaders(Parcel parcel) {
        this.f1962a = parcel.readInt();
        this.f1963d = parcel.readString();
        this.f1964g = parcel.readString();
        this.f1965r = parcel.readString();
        int i10 = d0.f105a;
        this.f1966x = parcel.readInt() != 0;
        this.f1967y = parcel.readInt();
    }
}

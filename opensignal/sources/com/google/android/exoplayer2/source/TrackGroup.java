package com.google.android.exoplayer2.source;

import android.os.Parcel;
import android.os.Parcelable;
import c7.a;
import com.google.android.exoplayer2.Format;
import java.util.Arrays;
import qb.b;
import wc.h;

/* loaded from: classes.dex */
public final class TrackGroup implements Parcelable {
    public static final Parcelable.Creator<TrackGroup> CREATOR = new h(11);

    /* renamed from: a, reason: collision with root package name */
    public final int f4453a;

    /* renamed from: d, reason: collision with root package name */
    public final Format[] f4454d;

    /* renamed from: g, reason: collision with root package name */
    public int f4455g;

    public TrackGroup(Format... formatArr) {
        b.j(formatArr.length > 0);
        this.f4454d = formatArr;
        this.f4453a = formatArr.length;
        String str = formatArr[0].f4024g;
        str = (str == null || str.equals("und")) ? "" : str;
        int i10 = formatArr[0].f4026x | 16384;
        for (int i11 = 1; i11 < formatArr.length; i11++) {
            String str2 = formatArr[i11].f4024g;
            if (!str.equals((str2 == null || str2.equals("und")) ? "" : str2)) {
                e(i11, "languages", formatArr[0].f4024g, formatArr[i11].f4024g);
                return;
            } else {
                if (i10 != (formatArr[i11].f4026x | 16384)) {
                    e(i11, "role flags", Integer.toBinaryString(formatArr[0].f4026x), Integer.toBinaryString(formatArr[i11].f4026x));
                    return;
                }
            }
        }
    }

    public static void e(int i10, String str, String str2, String str3) {
        StringBuilder sbS = a.s(a.d(a.d(str.length() + 78, str2), str3), "Different ", str, " combined in one TrackGroup: '", str2);
        sbS.append("' (track 0) and '");
        sbS.append(str3);
        sbS.append("' (track ");
        sbS.append(i10);
        sbS.append(")");
        b.q("TrackGroup", "", new IllegalStateException(sbS.toString()));
    }

    public final int d(Format format) {
        int i10 = 0;
        while (true) {
            Format[] formatArr = this.f4454d;
            if (i10 >= formatArr.length) {
                return -1;
            }
            if (format == formatArr[i10]) {
                return i10;
            }
            i10++;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && TrackGroup.class == obj.getClass()) {
            TrackGroup trackGroup = (TrackGroup) obj;
            if (this.f4453a == trackGroup.f4453a && Arrays.equals(this.f4454d, trackGroup.f4454d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f4455g == 0) {
            this.f4455g = 527 + Arrays.hashCode(this.f4454d);
        }
        return this.f4455g;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f4453a;
        parcel.writeInt(i11);
        for (int i12 = 0; i12 < i11; i12++) {
            parcel.writeParcelable(this.f4454d[i12], 0);
        }
    }

    public TrackGroup(Parcel parcel) {
        int i10 = parcel.readInt();
        this.f4453a = i10;
        this.f4454d = new Format[i10];
        for (int i11 = 0; i11 < this.f4453a; i11++) {
            this.f4454d[i11] = (Format) parcel.readParcelable(Format.class.getClassLoader());
        }
    }
}

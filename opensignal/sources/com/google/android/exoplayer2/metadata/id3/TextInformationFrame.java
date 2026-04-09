package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import c7.a;
import java.util.ArrayList;
import qb.v;
import tc.c;

/* loaded from: classes.dex */
public final class TextInformationFrame extends Id3Frame {
    public static final Parcelable.Creator<TextInformationFrame> CREATOR = new c(12);

    /* renamed from: d, reason: collision with root package name */
    public final String f4300d;

    /* renamed from: g, reason: collision with root package name */
    public final String f4301g;

    public TextInformationFrame(String str, String str2, String str3) {
        super(str);
        this.f4300d = str2;
        this.f4301g = str3;
    }

    public static ArrayList d(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
                return arrayList;
            }
            if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                return arrayList;
            }
            if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0012  */
    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(com.google.android.exoplayer2.o0 r9) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 628
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.metadata.id3.TextInformationFrame.c(com.google.android.exoplayer2.o0):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && TextInformationFrame.class == obj.getClass()) {
            TextInformationFrame textInformationFrame = (TextInformationFrame) obj;
            if (v.a(this.f4289a, textInformationFrame.f4289a) && v.a(this.f4300d, textInformationFrame.f4300d) && v.a(this.f4301g, textInformationFrame.f4301g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iG = a.g(this.f4289a, 527, 31);
        String str = this.f4300d;
        int iHashCode = (iG + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f4301g;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public final String toString() {
        String str = this.f4289a;
        int iD = a.d(22, str);
        String str2 = this.f4300d;
        int iD2 = a.d(iD, str2);
        String str3 = this.f4301g;
        StringBuilder sbS = a.s(a.d(iD2, str3), str, ": description=", str2, ": value=");
        sbS.append(str3);
        return sbS.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f4289a);
        parcel.writeString(this.f4300d);
        parcel.writeString(this.f4301g);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TextInformationFrame(Parcel parcel) {
        String string = parcel.readString();
        int i10 = v.f20828a;
        super(string);
        this.f4300d = parcel.readString();
        this.f4301g = parcel.readString();
    }
}

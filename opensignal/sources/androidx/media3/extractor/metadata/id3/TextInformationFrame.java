package androidx.media3.extractor.metadata.id3;

import a5.a;
import a5.d0;
import android.os.Parcel;
import android.os.Parcelable;
import cc.a0;
import java.util.ArrayList;
import oe.h0;
import oe.u0;

/* loaded from: classes.dex */
public final class TextInformationFrame extends Id3Frame {
    public static final Parcelable.Creator<TextInformationFrame> CREATOR = new a0(18);

    /* renamed from: d, reason: collision with root package name */
    public final String f2004d;

    /* renamed from: g, reason: collision with root package name */
    public final h0 f2005g;

    public TextInformationFrame(String str, String str2, u0 u0Var) {
        super(str);
        a.e(!u0Var.isEmpty());
        this.f2004d = str2;
        h0 h0VarL = h0.l(u0Var);
        this.f2005g = h0VarL;
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && TextInformationFrame.class == obj.getClass()) {
            TextInformationFrame textInformationFrame = (TextInformationFrame) obj;
            if (d0.a(this.f1993a, textInformationFrame.f1993a) && d0.a(this.f2004d, textInformationFrame.f2004d) && this.f2005g.equals(textInformationFrame.f2005g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iG = c7.a.g(this.f1993a, 527, 31);
        String str = this.f2004d;
        return this.f2005g.hashCode() + ((iG + (str != null ? str.hashCode() : 0)) * 31);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0012  */
    @Override // androidx.media3.common.Metadata.Entry
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(androidx.media3.common.f0 r9) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 702
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.metadata.id3.TextInformationFrame.k(androidx.media3.common.f0):void");
    }

    @Override // androidx.media3.extractor.metadata.id3.Id3Frame
    public final String toString() {
        return this.f1993a + ": description=" + this.f2004d + ": values=" + this.f2005g;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f1993a);
        parcel.writeString(this.f2004d);
        parcel.writeStringArray((String[]) this.f2005g.toArray(new String[0]));
    }
}

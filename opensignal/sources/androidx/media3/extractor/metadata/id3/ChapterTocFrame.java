package androidx.media3.extractor.metadata.id3;

import a5.d0;
import android.os.Parcel;
import android.os.Parcelable;
import cc.a0;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class ChapterTocFrame extends Id3Frame {
    public static final Parcelable.Creator<ChapterTocFrame> CREATOR = new a0(12);

    /* renamed from: d, reason: collision with root package name */
    public final String f1981d;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f1982g;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f1983r;

    /* renamed from: x, reason: collision with root package name */
    public final String[] f1984x;

    /* renamed from: y, reason: collision with root package name */
    public final Id3Frame[] f1985y;

    public ChapterTocFrame(String str, boolean z10, boolean z11, String[] strArr, Id3Frame[] id3FrameArr) {
        super("CTOC");
        this.f1981d = str;
        this.f1982g = z10;
        this.f1983r = z11;
        this.f1984x = strArr;
        this.f1985y = id3FrameArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ChapterTocFrame.class == obj.getClass()) {
            ChapterTocFrame chapterTocFrame = (ChapterTocFrame) obj;
            if (this.f1982g == chapterTocFrame.f1982g && this.f1983r == chapterTocFrame.f1983r && d0.a(this.f1981d, chapterTocFrame.f1981d) && Arrays.equals(this.f1984x, chapterTocFrame.f1984x) && Arrays.equals(this.f1985y, chapterTocFrame.f1985y)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = (((527 + (this.f1982g ? 1 : 0)) * 31) + (this.f1983r ? 1 : 0)) * 31;
        String str = this.f1981d;
        return i10 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f1981d);
        parcel.writeByte(this.f1982g ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f1983r ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f1984x);
        Id3Frame[] id3FrameArr = this.f1985y;
        parcel.writeInt(id3FrameArr.length);
        for (Id3Frame id3Frame : id3FrameArr) {
            parcel.writeParcelable(id3Frame, 0);
        }
    }

    public ChapterTocFrame(Parcel parcel) {
        super("CTOC");
        String string = parcel.readString();
        int i10 = d0.f105a;
        this.f1981d = string;
        this.f1982g = parcel.readByte() != 0;
        this.f1983r = parcel.readByte() != 0;
        this.f1984x = parcel.createStringArray();
        int i11 = parcel.readInt();
        this.f1985y = new Id3Frame[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            this.f1985y[i12] = (Id3Frame) parcel.readParcelable(Id3Frame.class.getClassLoader());
        }
    }
}

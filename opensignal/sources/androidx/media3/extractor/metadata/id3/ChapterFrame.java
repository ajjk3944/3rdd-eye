package androidx.media3.extractor.metadata.id3;

import a5.d0;
import android.os.Parcel;
import android.os.Parcelable;
import cc.a0;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class ChapterFrame extends Id3Frame {
    public static final Parcelable.Creator<ChapterFrame> CREATOR = new a0(11);
    public final Id3Frame[] B;

    /* renamed from: d, reason: collision with root package name */
    public final String f1976d;

    /* renamed from: g, reason: collision with root package name */
    public final int f1977g;

    /* renamed from: r, reason: collision with root package name */
    public final int f1978r;

    /* renamed from: x, reason: collision with root package name */
    public final long f1979x;

    /* renamed from: y, reason: collision with root package name */
    public final long f1980y;

    public ChapterFrame(String str, int i10, int i11, long j, long j7, Id3Frame[] id3FrameArr) {
        super("CHAP");
        this.f1976d = str;
        this.f1977g = i10;
        this.f1978r = i11;
        this.f1979x = j;
        this.f1980y = j7;
        this.B = id3FrameArr;
    }

    @Override // androidx.media3.extractor.metadata.id3.Id3Frame, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ChapterFrame.class == obj.getClass()) {
            ChapterFrame chapterFrame = (ChapterFrame) obj;
            if (this.f1977g == chapterFrame.f1977g && this.f1978r == chapterFrame.f1978r && this.f1979x == chapterFrame.f1979x && this.f1980y == chapterFrame.f1980y && d0.a(this.f1976d, chapterFrame.f1976d) && Arrays.equals(this.B, chapterFrame.B)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = (((((((527 + this.f1977g) * 31) + this.f1978r) * 31) + ((int) this.f1979x)) * 31) + ((int) this.f1980y)) * 31;
        String str = this.f1976d;
        return i10 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f1976d);
        parcel.writeInt(this.f1977g);
        parcel.writeInt(this.f1978r);
        parcel.writeLong(this.f1979x);
        parcel.writeLong(this.f1980y);
        Id3Frame[] id3FrameArr = this.B;
        parcel.writeInt(id3FrameArr.length);
        for (Id3Frame id3Frame : id3FrameArr) {
            parcel.writeParcelable(id3Frame, 0);
        }
    }

    public ChapterFrame(Parcel parcel) {
        super("CHAP");
        String string = parcel.readString();
        int i10 = d0.f105a;
        this.f1976d = string;
        this.f1977g = parcel.readInt();
        this.f1978r = parcel.readInt();
        this.f1979x = parcel.readLong();
        this.f1980y = parcel.readLong();
        int i11 = parcel.readInt();
        this.B = new Id3Frame[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            this.B[i12] = (Id3Frame) parcel.readParcelable(Id3Frame.class.getClassLoader());
        }
    }
}

package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import qb.v;
import tc.c;

/* loaded from: classes.dex */
public final class ChapterTocFrame extends Id3Frame {
    public static final Parcelable.Creator<ChapterTocFrame> CREATOR = new c(6);

    /* renamed from: d, reason: collision with root package name */
    public final String f4277d;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f4278g;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f4279r;

    /* renamed from: x, reason: collision with root package name */
    public final String[] f4280x;

    /* renamed from: y, reason: collision with root package name */
    public final Id3Frame[] f4281y;

    public ChapterTocFrame(String str, boolean z10, boolean z11, String[] strArr, Id3Frame[] id3FrameArr) {
        super("CTOC");
        this.f4277d = str;
        this.f4278g = z10;
        this.f4279r = z11;
        this.f4280x = strArr;
        this.f4281y = id3FrameArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ChapterTocFrame.class == obj.getClass()) {
            ChapterTocFrame chapterTocFrame = (ChapterTocFrame) obj;
            if (this.f4278g == chapterTocFrame.f4278g && this.f4279r == chapterTocFrame.f4279r && v.a(this.f4277d, chapterTocFrame.f4277d) && Arrays.equals(this.f4280x, chapterTocFrame.f4280x) && Arrays.equals(this.f4281y, chapterTocFrame.f4281y)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = (((527 + (this.f4278g ? 1 : 0)) * 31) + (this.f4279r ? 1 : 0)) * 31;
        String str = this.f4277d;
        return i10 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f4277d);
        parcel.writeByte(this.f4278g ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f4279r ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f4280x);
        Id3Frame[] id3FrameArr = this.f4281y;
        parcel.writeInt(id3FrameArr.length);
        for (Id3Frame id3Frame : id3FrameArr) {
            parcel.writeParcelable(id3Frame, 0);
        }
    }

    public ChapterTocFrame(Parcel parcel) {
        super("CTOC");
        String string = parcel.readString();
        int i10 = v.f20828a;
        this.f4277d = string;
        this.f4278g = parcel.readByte() != 0;
        this.f4279r = parcel.readByte() != 0;
        this.f4280x = parcel.createStringArray();
        int i11 = parcel.readInt();
        this.f4281y = new Id3Frame[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            this.f4281y[i12] = (Id3Frame) parcel.readParcelable(Id3Frame.class.getClassLoader());
        }
    }
}

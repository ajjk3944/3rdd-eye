package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import qb.v;
import tc.c;

/* loaded from: classes.dex */
public final class ChapterFrame extends Id3Frame {
    public static final Parcelable.Creator<ChapterFrame> CREATOR = new c(5);
    public final Id3Frame[] B;

    /* renamed from: d, reason: collision with root package name */
    public final String f4272d;

    /* renamed from: g, reason: collision with root package name */
    public final int f4273g;

    /* renamed from: r, reason: collision with root package name */
    public final int f4274r;

    /* renamed from: x, reason: collision with root package name */
    public final long f4275x;

    /* renamed from: y, reason: collision with root package name */
    public final long f4276y;

    public ChapterFrame(String str, int i10, int i11, long j, long j7, Id3Frame[] id3FrameArr) {
        super("CHAP");
        this.f4272d = str;
        this.f4273g = i10;
        this.f4274r = i11;
        this.f4275x = j;
        this.f4276y = j7;
        this.B = id3FrameArr;
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ChapterFrame.class == obj.getClass()) {
            ChapterFrame chapterFrame = (ChapterFrame) obj;
            if (this.f4273g == chapterFrame.f4273g && this.f4274r == chapterFrame.f4274r && this.f4275x == chapterFrame.f4275x && this.f4276y == chapterFrame.f4276y && v.a(this.f4272d, chapterFrame.f4272d) && Arrays.equals(this.B, chapterFrame.B)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = (((((((527 + this.f4273g) * 31) + this.f4274r) * 31) + ((int) this.f4275x)) * 31) + ((int) this.f4276y)) * 31;
        String str = this.f4272d;
        return i10 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f4272d);
        parcel.writeInt(this.f4273g);
        parcel.writeInt(this.f4274r);
        parcel.writeLong(this.f4275x);
        parcel.writeLong(this.f4276y);
        Id3Frame[] id3FrameArr = this.B;
        parcel.writeInt(id3FrameArr.length);
        for (Id3Frame id3Frame : id3FrameArr) {
            parcel.writeParcelable(id3Frame, 0);
        }
    }

    public ChapterFrame(Parcel parcel) {
        super("CHAP");
        String string = parcel.readString();
        int i10 = v.f20828a;
        this.f4272d = string;
        this.f4273g = parcel.readInt();
        this.f4274r = parcel.readInt();
        this.f4275x = parcel.readLong();
        this.f4276y = parcel.readLong();
        int i11 = parcel.readInt();
        this.B = new Id3Frame[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            this.B[i12] = (Id3Frame) parcel.readParcelable(Id3Frame.class.getClassLoader());
        }
    }
}

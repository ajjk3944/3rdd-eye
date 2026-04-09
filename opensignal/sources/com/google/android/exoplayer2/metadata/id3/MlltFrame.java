package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import qb.v;
import tc.c;

/* loaded from: classes.dex */
public final class MlltFrame extends Id3Frame {
    public static final Parcelable.Creator<MlltFrame> CREATOR = new c(10);

    /* renamed from: d, reason: collision with root package name */
    public final int f4293d;

    /* renamed from: g, reason: collision with root package name */
    public final int f4294g;

    /* renamed from: r, reason: collision with root package name */
    public final int f4295r;

    /* renamed from: x, reason: collision with root package name */
    public final int[] f4296x;

    /* renamed from: y, reason: collision with root package name */
    public final int[] f4297y;

    public MlltFrame(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f4293d = i10;
        this.f4294g = i11;
        this.f4295r = i12;
        this.f4296x = iArr;
        this.f4297y = iArr2;
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && MlltFrame.class == obj.getClass()) {
            MlltFrame mlltFrame = (MlltFrame) obj;
            if (this.f4293d == mlltFrame.f4293d && this.f4294g == mlltFrame.f4294g && this.f4295r == mlltFrame.f4295r && Arrays.equals(this.f4296x, mlltFrame.f4296x) && Arrays.equals(this.f4297y, mlltFrame.f4297y)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f4297y) + ((Arrays.hashCode(this.f4296x) + ((((((527 + this.f4293d) * 31) + this.f4294g) * 31) + this.f4295r) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f4293d);
        parcel.writeInt(this.f4294g);
        parcel.writeInt(this.f4295r);
        parcel.writeIntArray(this.f4296x);
        parcel.writeIntArray(this.f4297y);
    }

    public MlltFrame(Parcel parcel) {
        super("MLLT");
        this.f4293d = parcel.readInt();
        this.f4294g = parcel.readInt();
        this.f4295r = parcel.readInt();
        int[] iArrCreateIntArray = parcel.createIntArray();
        int i10 = v.f20828a;
        this.f4296x = iArrCreateIntArray;
        this.f4297y = parcel.createIntArray();
    }
}

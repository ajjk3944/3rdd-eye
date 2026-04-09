package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import tc.c;
import wa.b;

/* loaded from: classes.dex */
public final class SpliceInsertCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceInsertCommand> CREATOR = new c(22);
    public final long B;
    public final List D;
    public final boolean E;
    public final long F;
    public final int G;
    public final int H;
    public final int I;

    /* renamed from: a, reason: collision with root package name */
    public final long f4322a;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f4323d;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f4324g;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f4325r;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f4326x;

    /* renamed from: y, reason: collision with root package name */
    public final long f4327y;

    public SpliceInsertCommand(long j, boolean z10, boolean z11, boolean z12, boolean z13, long j7, long j10, List list, boolean z14, long j11, int i10, int i11, int i12) {
        this.f4322a = j;
        this.f4323d = z10;
        this.f4324g = z11;
        this.f4325r = z12;
        this.f4326x = z13;
        this.f4327y = j7;
        this.B = j10;
        this.D = Collections.unmodifiableList(list);
        this.E = z14;
        this.F = j11;
        this.G = i10;
        this.H = i11;
        this.I = i12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f4322a);
        parcel.writeByte(this.f4323d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f4324g ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f4325r ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f4326x ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f4327y);
        parcel.writeLong(this.B);
        List list = this.D;
        int size = list.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            b bVar = (b) list.get(i11);
            parcel.writeInt(bVar.f24390a);
            parcel.writeLong(bVar.f24391b);
            parcel.writeLong(bVar.f24392c);
        }
        parcel.writeByte(this.E ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.F);
        parcel.writeInt(this.G);
        parcel.writeInt(this.H);
        parcel.writeInt(this.I);
    }

    public SpliceInsertCommand(Parcel parcel) {
        this.f4322a = parcel.readLong();
        this.f4323d = parcel.readByte() == 1;
        this.f4324g = parcel.readByte() == 1;
        this.f4325r = parcel.readByte() == 1;
        this.f4326x = parcel.readByte() == 1;
        this.f4327y = parcel.readLong();
        this.B = parcel.readLong();
        int i10 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add(new b(parcel.readInt(), parcel.readLong(), parcel.readLong()));
        }
        this.D = Collections.unmodifiableList(arrayList);
        this.E = parcel.readByte() == 1;
        this.F = parcel.readLong();
        this.G = parcel.readInt();
        this.H = parcel.readInt();
        this.I = parcel.readInt();
    }
}

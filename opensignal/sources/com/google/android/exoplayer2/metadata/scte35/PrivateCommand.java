package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import qb.v;
import tc.c;

/* loaded from: classes.dex */
public final class PrivateCommand extends SpliceCommand {
    public static final Parcelable.Creator<PrivateCommand> CREATOR = new c(21);

    /* renamed from: a, reason: collision with root package name */
    public final long f4319a;

    /* renamed from: d, reason: collision with root package name */
    public final long f4320d;

    /* renamed from: g, reason: collision with root package name */
    public final byte[] f4321g;

    public PrivateCommand(long j, byte[] bArr, long j7) {
        this.f4319a = j7;
        this.f4320d = j;
        this.f4321g = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f4319a);
        parcel.writeLong(this.f4320d);
        parcel.writeByteArray(this.f4321g);
    }

    public PrivateCommand(Parcel parcel) {
        this.f4319a = parcel.readLong();
        this.f4320d = parcel.readLong();
        byte[] bArrCreateByteArray = parcel.createByteArray();
        int i10 = v.f20828a;
        this.f4321g = bArrCreateByteArray;
    }
}

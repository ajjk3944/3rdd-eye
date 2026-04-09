package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import fb.f;
import tc.c;

/* loaded from: classes.dex */
public final class TimeSignalCommand extends SpliceCommand {
    public static final Parcelable.Creator<TimeSignalCommand> CREATOR = new c(25);

    /* renamed from: a, reason: collision with root package name */
    public final long f4329a;

    /* renamed from: d, reason: collision with root package name */
    public final long f4330d;

    public TimeSignalCommand(long j, long j7) {
        this.f4329a = j;
        this.f4330d = j7;
    }

    public static long d(long j, f fVar) {
        long jO = fVar.o();
        if ((128 & jO) != 0) {
            return 8589934591L & ((((jO & 1) << 32) | fVar.p()) + j);
        }
        return -9223372036854775807L;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f4329a);
        parcel.writeLong(this.f4330d);
    }
}

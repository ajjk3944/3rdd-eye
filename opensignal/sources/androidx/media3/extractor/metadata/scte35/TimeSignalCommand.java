package androidx.media3.extractor.metadata.scte35;

import a5.v;
import android.os.Parcel;
import android.os.Parcelable;
import cc.a0;

/* loaded from: classes.dex */
public final class TimeSignalCommand extends SpliceCommand {
    public static final Parcelable.Creator<TimeSignalCommand> CREATOR = new a0(28);

    /* renamed from: a, reason: collision with root package name */
    public final long f2033a;

    /* renamed from: d, reason: collision with root package name */
    public final long f2034d;

    public TimeSignalCommand(long j, long j7) {
        this.f2033a = j;
        this.f2034d = j7;
    }

    public static long d(long j, v vVar) {
        long jT = vVar.t();
        if ((128 & jT) != 0) {
            return 8589934591L & ((((jT & 1) << 32) | vVar.u()) + j);
        }
        return -9223372036854775807L;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f2033a);
        parcel.writeLong(this.f2034d);
    }
}

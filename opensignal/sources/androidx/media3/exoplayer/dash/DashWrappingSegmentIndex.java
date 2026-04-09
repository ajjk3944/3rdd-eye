package androidx.media3.exoplayer.dash;

import a5.d0;
import h5.i;
import u5.g;

/* loaded from: classes.dex */
public final class DashWrappingSegmentIndex implements DashSegmentIndex {
    private final g chunkIndex;
    private final long timeOffsetUs;

    public DashWrappingSegmentIndex(g gVar, long j) {
        this.chunkIndex = gVar;
        this.timeOffsetUs = j;
    }

    @Override // androidx.media3.exoplayer.dash.DashSegmentIndex
    public long getAvailableSegmentCount(long j, long j7) {
        return this.chunkIndex.f23279a;
    }

    @Override // androidx.media3.exoplayer.dash.DashSegmentIndex
    public long getDurationUs(long j, long j7) {
        return this.chunkIndex.f23282d[(int) j];
    }

    @Override // androidx.media3.exoplayer.dash.DashSegmentIndex
    public long getFirstAvailableSegmentNum(long j, long j7) {
        return 0L;
    }

    @Override // androidx.media3.exoplayer.dash.DashSegmentIndex
    public long getFirstSegmentNum() {
        return 0L;
    }

    @Override // androidx.media3.exoplayer.dash.DashSegmentIndex
    public long getNextSegmentAvailableTimeUs(long j, long j7) {
        return -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.dash.DashSegmentIndex
    public long getSegmentCount(long j) {
        return this.chunkIndex.f23279a;
    }

    @Override // androidx.media3.exoplayer.dash.DashSegmentIndex
    public long getSegmentNum(long j, long j7) {
        g gVar = this.chunkIndex;
        return d0.e(gVar.f23283e, j + this.timeOffsetUs, true);
    }

    @Override // androidx.media3.exoplayer.dash.DashSegmentIndex
    public i getSegmentUrl(long j) {
        return new i(null, this.chunkIndex.f23281c[(int) j], r1.f23280b[r7]);
    }

    @Override // androidx.media3.exoplayer.dash.DashSegmentIndex
    public long getTimeUs(long j) {
        return this.chunkIndex.f23283e[(int) j] - this.timeOffsetUs;
    }

    @Override // androidx.media3.exoplayer.dash.DashSegmentIndex
    public boolean isExplicit() {
        return true;
    }
}

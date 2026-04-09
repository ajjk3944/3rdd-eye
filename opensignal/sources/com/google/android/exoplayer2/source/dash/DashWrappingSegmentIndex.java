package com.google.android.exoplayer2.source.dash;

import ca.g;
import cb.i;
import qb.v;

/* loaded from: classes.dex */
public final class DashWrappingSegmentIndex implements DashSegmentIndex {
    private final g chunkIndex;
    private final long timeOffsetUs;

    public DashWrappingSegmentIndex(g gVar, long j) {
        this.chunkIndex = gVar;
        this.timeOffsetUs = j;
    }

    @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
    public long getAvailableSegmentCount(long j, long j7) {
        return this.chunkIndex.f3469a;
    }

    @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
    public long getDurationUs(long j, long j7) {
        return this.chunkIndex.f3472d[(int) j];
    }

    @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
    public long getFirstAvailableSegmentNum(long j, long j7) {
        return 0L;
    }

    @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
    public long getFirstSegmentNum() {
        return 0L;
    }

    @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
    public long getNextSegmentAvailableTimeUs(long j, long j7) {
        return -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
    public long getSegmentCount(long j) {
        return this.chunkIndex.f3469a;
    }

    @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
    public long getSegmentNum(long j, long j7) {
        g gVar = this.chunkIndex;
        return v.e(gVar.f3473e, j + this.timeOffsetUs, true);
    }

    @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
    public i getSegmentUrl(long j) {
        return new i(null, this.chunkIndex.f3471c[(int) j], r1.f3470b[r7]);
    }

    @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
    public long getTimeUs(long j) {
        return this.chunkIndex.f3473e[(int) j] - this.timeOffsetUs;
    }

    @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
    public boolean isExplicit() {
        return true;
    }
}

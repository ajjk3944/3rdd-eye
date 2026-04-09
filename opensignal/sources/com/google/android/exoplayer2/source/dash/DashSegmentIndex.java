package com.google.android.exoplayer2.source.dash;

import cb.i;

/* loaded from: classes.dex */
public interface DashSegmentIndex {
    public static final int INDEX_UNBOUNDED = -1;

    long getAvailableSegmentCount(long j, long j7);

    long getDurationUs(long j, long j7);

    long getFirstAvailableSegmentNum(long j, long j7);

    long getFirstSegmentNum();

    long getNextSegmentAvailableTimeUs(long j, long j7);

    long getSegmentCount(long j);

    long getSegmentNum(long j, long j7);

    i getSegmentUrl(long j);

    long getTimeUs(long j);

    boolean isExplicit();
}

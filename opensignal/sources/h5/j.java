package h5;

import androidx.media3.exoplayer.dash.DashSegmentIndex;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class j extends l implements DashSegmentIndex {

    /* renamed from: y, reason: collision with root package name */
    public final m f9945y;

    public j(androidx.media3.common.r rVar, List list, m mVar, ArrayList arrayList) {
        super(rVar, list, mVar, arrayList);
        this.f9945y = mVar;
    }

    @Override // h5.l
    public final String a() {
        return null;
    }

    @Override // h5.l
    public final i c() {
        return null;
    }

    @Override // androidx.media3.exoplayer.dash.DashSegmentIndex
    public final long getAvailableSegmentCount(long j, long j7) {
        return this.f9945y.b(j, j7);
    }

    @Override // androidx.media3.exoplayer.dash.DashSegmentIndex
    public final long getDurationUs(long j, long j7) {
        return this.f9945y.e(j, j7);
    }

    @Override // androidx.media3.exoplayer.dash.DashSegmentIndex
    public final long getFirstAvailableSegmentNum(long j, long j7) {
        return this.f9945y.c(j, j7);
    }

    @Override // androidx.media3.exoplayer.dash.DashSegmentIndex
    public final long getFirstSegmentNum() {
        return this.f9945y.f9952d;
    }

    @Override // androidx.media3.exoplayer.dash.DashSegmentIndex
    public final long getNextSegmentAvailableTimeUs(long j, long j7) {
        m mVar = this.f9945y;
        if (mVar.f9954f != null) {
            return -9223372036854775807L;
        }
        long jB = mVar.b(j, j7) + mVar.c(j, j7);
        return (mVar.e(jB, j) + mVar.g(jB)) - mVar.f9957i;
    }

    @Override // androidx.media3.exoplayer.dash.DashSegmentIndex
    public final long getSegmentCount(long j) {
        return this.f9945y.d(j);
    }

    @Override // androidx.media3.exoplayer.dash.DashSegmentIndex
    public final long getSegmentNum(long j, long j7) {
        return this.f9945y.f(j, j7);
    }

    @Override // androidx.media3.exoplayer.dash.DashSegmentIndex
    public final i getSegmentUrl(long j) {
        return this.f9945y.h(this, j);
    }

    @Override // androidx.media3.exoplayer.dash.DashSegmentIndex
    public final long getTimeUs(long j) {
        return this.f9945y.g(j);
    }

    @Override // androidx.media3.exoplayer.dash.DashSegmentIndex
    public final boolean isExplicit() {
        return this.f9945y.i();
    }

    @Override // h5.l
    public final DashSegmentIndex b() {
        return this;
    }
}

package cb;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.dash.DashSegmentIndex;
import com.google.android.exoplayer2.source.dash.manifest.Representation;
import java.util.List;

/* loaded from: classes.dex */
public final class k extends Representation implements DashSegmentIndex {

    /* renamed from: a, reason: collision with root package name */
    public final m f3572a;

    public k(long j, Format format, List list, m mVar, List list2) {
        super(j, format, list, mVar, list2);
        this.f3572a = mVar;
    }

    @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
    public final long getAvailableSegmentCount(long j, long j7) {
        return this.f3572a.b(j, j7);
    }

    @Override // com.google.android.exoplayer2.source.dash.manifest.Representation
    public final String getCacheKey() {
        return null;
    }

    @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
    public final long getDurationUs(long j, long j7) {
        return this.f3572a.e(j, j7);
    }

    @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
    public final long getFirstAvailableSegmentNum(long j, long j7) {
        return this.f3572a.c(j, j7);
    }

    @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
    public final long getFirstSegmentNum() {
        return this.f3572a.f3576d;
    }

    @Override // com.google.android.exoplayer2.source.dash.manifest.Representation
    public final i getIndexUri() {
        return null;
    }

    @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
    public final long getNextSegmentAvailableTimeUs(long j, long j7) {
        m mVar = this.f3572a;
        if (mVar.f3578f != null) {
            return -9223372036854775807L;
        }
        long jB = mVar.b(j, j7) + mVar.c(j, j7);
        return (mVar.e(jB, j) + mVar.g(jB)) - mVar.f3581i;
    }

    @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
    public final long getSegmentCount(long j) {
        return this.f3572a.d(j);
    }

    @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
    public final long getSegmentNum(long j, long j7) {
        return this.f3572a.f(j, j7);
    }

    @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
    public final i getSegmentUrl(long j) {
        return this.f3572a.h(this, j);
    }

    @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
    public final long getTimeUs(long j) {
        return this.f3572a.g(j);
    }

    @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
    public final boolean isExplicit() {
        return this.f3572a.i();
    }

    @Override // com.google.android.exoplayer2.source.dash.manifest.Representation
    public final DashSegmentIndex getIndex() {
        return this;
    }
}

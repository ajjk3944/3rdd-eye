package g3;

import android.util.SparseIntArray;
import android.view.FrameMetrics;
import android.view.Window;

/* loaded from: classes.dex */
public final class h implements Window.OnFrameMetricsAvailableListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a5.t f9292a;

    public h(a5.t tVar) {
        this.f9292a = tVar;
    }

    @Override // android.view.Window.OnFrameMetricsAvailableListener
    public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i10) {
        a5.t tVar = this.f9292a;
        int i11 = tVar.f153a;
        if ((i11 & 1) != 0) {
            a5.t.b(((SparseIntArray[]) tVar.f154b)[0], frameMetrics.getMetric(8));
        }
        if ((i11 & 2) != 0) {
            a5.t.b(((SparseIntArray[]) tVar.f154b)[1], frameMetrics.getMetric(1));
        }
        if ((i11 & 4) != 0) {
            a5.t.b(((SparseIntArray[]) tVar.f154b)[2], frameMetrics.getMetric(3));
        }
        if ((i11 & 8) != 0) {
            a5.t.b(((SparseIntArray[]) tVar.f154b)[3], frameMetrics.getMetric(4));
        }
        if ((i11 & 16) != 0) {
            a5.t.b(((SparseIntArray[]) tVar.f154b)[4], frameMetrics.getMetric(5));
        }
        if ((i11 & 64) != 0) {
            a5.t.b(((SparseIntArray[]) tVar.f154b)[6], frameMetrics.getMetric(7));
        }
        if ((i11 & 32) != 0) {
            a5.t.b(((SparseIntArray[]) tVar.f154b)[5], frameMetrics.getMetric(6));
        }
        if ((i11 & 128) != 0) {
            a5.t.b(((SparseIntArray[]) tVar.f154b)[7], frameMetrics.getMetric(0));
        }
        if ((i11 & 256) != 0) {
            a5.t.b(((SparseIntArray[]) tVar.f154b)[8], frameMetrics.getMetric(2));
        }
    }
}

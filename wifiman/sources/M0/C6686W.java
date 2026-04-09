package m0;

import android.graphics.Path;
import android.graphics.PathMeasure;

/* renamed from: m0.W, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6686W implements X0 {

    /* renamed from: a, reason: collision with root package name */
    private final PathMeasure f52861a;

    public C6686W(PathMeasure pathMeasure) {
        this.f52861a = pathMeasure;
    }

    @Override // m0.X0
    public void a(U0 u02, boolean z10) {
        Path pathV;
        PathMeasure pathMeasure = this.f52861a;
        if (u02 == null) {
            pathV = null;
        } else {
            if (!(u02 instanceof C6683T)) {
                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
            pathV = ((C6683T) u02).v();
        }
        pathMeasure.setPath(pathV, z10);
    }

    @Override // m0.X0
    public boolean b(float f10, float f11, U0 u02, boolean z10) {
        PathMeasure pathMeasure = this.f52861a;
        if (u02 instanceof C6683T) {
            return pathMeasure.getSegment(f10, f11, ((C6683T) u02).v(), z10);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // m0.X0
    public float c() {
        return this.f52861a.getLength();
    }
}

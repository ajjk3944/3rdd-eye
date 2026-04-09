package p1;

import android.graphics.PathMeasure;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final PathMeasure f30989a;

    public k(PathMeasure pathMeasure) {
        this.f30989a = pathMeasure;
    }

    public final boolean a(float f10, float f11, j jVar) {
        if (!a0.g.C(jVar)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        return this.f30989a.getSegment(f10, f11, jVar.f30986a, true);
    }
}

package g1;

import android.graphics.PathMeasure;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final PathMeasure f9241a;

    public j(PathMeasure pathMeasure) {
        this.f9241a = pathMeasure;
    }

    public final void a(float f10, float f11, i iVar) {
        if (iVar == null) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        this.f9241a.getSegment(f10, f11, iVar.f9238a, true);
    }
}

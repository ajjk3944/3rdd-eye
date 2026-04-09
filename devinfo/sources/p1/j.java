package p1;

import android.graphics.Path;
import android.graphics.RectF;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final Path f30986a;

    /* renamed from: b, reason: collision with root package name */
    public RectF f30987b;

    /* renamed from: c, reason: collision with root package name */
    public float[] f30988c;

    public j(Path path) {
        this.f30986a = path;
    }

    public final o1.c a() {
        if (this.f30987b == null) {
            this.f30987b = new RectF();
        }
        RectF rectF = this.f30987b;
        nk.k.b(rectF);
        this.f30986a.computeBounds(rectF, true);
        return new o1.c(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public final boolean b(j jVar, j jVar2, int i4) {
        Path.Op op = i4 == 0 ? Path.Op.DIFFERENCE : i4 == 1 ? Path.Op.INTERSECT : i4 == 4 ? Path.Op.REVERSE_DIFFERENCE : i4 == 2 ? Path.Op.UNION : Path.Op.XOR;
        if (!(jVar instanceof j)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        Path path = jVar.f30986a;
        if (jVar2 instanceof j) {
            return this.f30986a.op(path, jVar2.f30986a, op);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    public final void c() {
        this.f30986a.reset();
    }
}

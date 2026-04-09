package m7;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f28924a;

    /* renamed from: b, reason: collision with root package name */
    public PointF f28925b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f28926c;

    public k(PointF pointF, boolean z3, List list) {
        this.f28925b = pointF;
        this.f28926c = z3;
        this.f28924a = new ArrayList(list);
    }

    public final void a(float f10, float f11) {
        if (this.f28925b == null) {
            this.f28925b = new PointF();
        }
        this.f28925b.set(f10, f11);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ShapeData{numCurves=");
        sb2.append(this.f28924a.size());
        sb2.append("closed=");
        return d.h.x(sb2, this.f28926c, '}');
    }

    public k() {
        this.f28924a = new ArrayList();
    }
}

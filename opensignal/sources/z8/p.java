package z8;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f26757a;

    /* renamed from: b, reason: collision with root package name */
    public PointF f26758b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f26759c;

    public p(PointF pointF, boolean z10, List list) {
        this.f26758b = pointF;
        this.f26759c = z10;
        this.f26757a = new ArrayList(list);
    }

    public final void a(float f10, float f11) {
        if (this.f26758b == null) {
            this.f26758b = new PointF();
        }
        this.f26758b.set(f10, f11);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ShapeData{numCurves=");
        sb2.append(this.f26757a.size());
        sb2.append("closed=");
        return c7.a.r(sb2, this.f26759c, '}');
    }

    public p() {
        this.f26757a = new ArrayList();
    }
}

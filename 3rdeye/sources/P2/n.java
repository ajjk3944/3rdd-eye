package p2;

import N7.C1154e9;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;
import n2.C5347a;

/* compiled from: ShapeData.java */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f45069a;

    /* renamed from: b, reason: collision with root package name */
    public PointF f45070b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f45071c;

    public n(PointF pointF, boolean z10, List<C5347a> list) {
        this.f45070b = pointF;
        this.f45071c = z10;
        this.f45069a = new ArrayList(list);
    }

    public final void a(float f10, float f11) {
        if (this.f45070b == null) {
            this.f45070b = new PointF();
        }
        this.f45070b.set(f10, f11);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShapeData{numCurves=");
        sb.append(this.f45069a.size());
        sb.append("closed=");
        return C1154e9.k(sb, this.f45071c, '}');
    }

    public n() {
        this.f45069a = new ArrayList();
    }
}

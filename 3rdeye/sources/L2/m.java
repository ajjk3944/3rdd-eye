package l2;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collections;
import l2.AbstractC5268a;
import v2.C5673a;

/* compiled from: SplitDimensionPathKeyframeAnimation.java */
/* loaded from: classes.dex */
public final class m extends AbstractC5268a<PointF, PointF> {
    public final PointF i;

    /* renamed from: j, reason: collision with root package name */
    public final PointF f43726j;

    /* renamed from: k, reason: collision with root package name */
    public final C5271d f43727k;

    /* renamed from: l, reason: collision with root package name */
    public final C5271d f43728l;

    /* renamed from: m, reason: collision with root package name */
    public B0.f f43729m;

    /* renamed from: n, reason: collision with root package name */
    public B0.f f43730n;

    public m(C5271d c5271d, C5271d c5271d2) {
        super(Collections.EMPTY_LIST);
        this.i = new PointF();
        this.f43726j = new PointF();
        this.f43727k = c5271d;
        this.f43728l = c5271d2;
        j(this.f43689d);
    }

    @Override // l2.AbstractC5268a
    public final PointF f() {
        return l(0.0f);
    }

    @Override // l2.AbstractC5268a
    public final /* bridge */ /* synthetic */ PointF g(C5673a<PointF> c5673a, float f10) {
        return l(f10);
    }

    @Override // l2.AbstractC5268a
    public final void j(float f10) {
        C5271d c5271d = this.f43727k;
        c5271d.j(f10);
        C5271d c5271d2 = this.f43728l;
        c5271d2.j(f10);
        this.i.set(c5271d.f().floatValue(), c5271d2.f().floatValue());
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f43686a;
            if (i >= arrayList.size()) {
                return;
            }
            ((AbstractC5268a.InterfaceC0489a) arrayList.get(i)).a();
            i++;
        }
    }

    public final PointF l(float f10) {
        float f11;
        Float f12;
        C5271d c5271d;
        C5673a<Float> c5673aB;
        C5271d c5271d2;
        C5673a<Float> c5673aB2;
        Float f13 = null;
        if (this.f43729m == null || (c5673aB2 = (c5271d2 = this.f43727k).b()) == null) {
            f11 = f10;
            f12 = null;
        } else {
            float fD = c5271d2.d();
            Float f14 = c5673aB2.f47018h;
            B0.f fVar = this.f43729m;
            float f15 = c5673aB2.f47017g;
            f11 = f10;
            f12 = (Float) fVar.e(f15, f14 == null ? f15 : f14.floatValue(), c5673aB2.f47012b, c5673aB2.f47013c, f10, f10, fD);
        }
        if (this.f43730n != null && (c5673aB = (c5271d = this.f43728l).b()) != null) {
            float fD2 = c5271d.d();
            Float f16 = c5673aB.f47018h;
            B0.f fVar2 = this.f43730n;
            float f17 = c5673aB.f47017g;
            f13 = (Float) fVar2.e(f17, f16 == null ? f17 : f16.floatValue(), c5673aB.f47012b, c5673aB.f47013c, f11, f11, fD2);
        }
        PointF pointF = this.i;
        PointF pointF2 = this.f43726j;
        if (f12 == null) {
            pointF2.set(pointF.x, 0.0f);
        } else {
            pointF2.set(f12.floatValue(), 0.0f);
        }
        if (f13 == null) {
            pointF2.set(pointF2.x, pointF.y);
            return pointF2;
        }
        pointF2.set(pointF2.x, f13.floatValue());
        return pointF2;
    }
}

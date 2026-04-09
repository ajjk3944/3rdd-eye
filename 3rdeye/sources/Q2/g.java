package q2;

import H6.I;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import i2.C4448h;
import i2.z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import k2.C5213d;
import k2.InterfaceC5212c;
import n2.C5351e;
import p2.p;

/* compiled from: ShapeLayer.java */
/* loaded from: classes.dex */
public final class g extends b {

    /* renamed from: D, reason: collision with root package name */
    public final C5213d f45398D;

    /* renamed from: E, reason: collision with root package name */
    public final c f45399E;

    public g(z zVar, e eVar, c cVar, C4448h c4448h) {
        super(zVar, eVar);
        this.f45399E = cVar;
        C5213d c5213d = new C5213d(zVar, this, new p("__container", eVar.f45374a, false), c4448h);
        this.f45398D = c5213d;
        List<InterfaceC5212c> list = Collections.EMPTY_LIST;
        c5213d.b(list, list);
    }

    @Override // q2.b, k2.InterfaceC5214e
    public final void d(RectF rectF, Matrix matrix, boolean z10) {
        super.d(rectF, matrix, z10);
        this.f45398D.d(rectF, this.f45344n, z10);
    }

    @Override // q2.b
    public final void k(Canvas canvas, Matrix matrix, int i) {
        this.f45398D.h(canvas, matrix, i);
    }

    @Override // q2.b
    public final I l() {
        I i = this.f45346p.f45395w;
        return i != null ? i : this.f45399E.f45346p.f45395w;
    }

    @Override // q2.b
    public final D3.d m() {
        D3.d dVar = this.f45346p.f45396x;
        return dVar != null ? dVar : this.f45399E.f45346p.f45396x;
    }

    @Override // q2.b
    public final void q(C5351e c5351e, int i, ArrayList arrayList, C5351e c5351e2) {
        this.f45398D.g(c5351e, i, arrayList, c5351e2);
    }
}

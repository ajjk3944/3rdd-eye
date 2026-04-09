package s1;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.view.View;
import j2.z1;
import p1.q;
import p1.r;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class l extends View {

    /* renamed from: k, reason: collision with root package name */
    public static final z1 f33318k = new z1(1);

    /* renamed from: a, reason: collision with root package name */
    public final t1.a f33319a;

    /* renamed from: b, reason: collision with root package name */
    public final r f33320b;

    /* renamed from: c, reason: collision with root package name */
    public final r1.b f33321c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f33322d;

    /* renamed from: e, reason: collision with root package name */
    public Outline f33323e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f33324f;
    public d3.c g;

    /* renamed from: h, reason: collision with root package name */
    public d3.l f33325h;

    /* renamed from: i, reason: collision with root package name */
    public mk.c f33326i;
    public b j;

    public l(t1.a aVar, r rVar, r1.b bVar) {
        super(aVar.getContext());
        this.f33319a = aVar;
        this.f33320b = rVar;
        this.f33321c = bVar;
        setOutlineProvider(f33318k);
        this.f33324f = true;
        this.g = r1.c.f32721a;
        this.f33325h = d3.l.f21966a;
        d.f33254a.getClass();
        this.f33326i = a.f33229c;
        setWillNotDraw(false);
        setClipBounds(null);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        r rVar = this.f33320b;
        p1.c cVar = rVar.f31012a;
        Canvas canvas2 = cVar.f30949a;
        cVar.f30949a = canvas;
        d3.c cVar2 = this.g;
        d3.l lVar = this.f33325h;
        float width = getWidth();
        float height = getHeight();
        long jFloatToRawIntBits = (Float.floatToRawIntBits(height) & 4294967295L) | (Float.floatToRawIntBits(width) << 32);
        b bVar = this.j;
        mk.c cVar3 = this.f33326i;
        r1.b bVar2 = this.f33321c;
        i0.f fVar = bVar2.f32718b;
        r1.a aVar = ((r1.b) fVar.f25418d).f32717a;
        d3.c cVar4 = aVar.f32713a;
        d3.l lVar2 = aVar.f32714b;
        q qVarX = fVar.x();
        i0.f fVar2 = bVar2.f32718b;
        long jE = fVar2.E();
        b bVar3 = (b) fVar2.f25417c;
        fVar2.P(cVar2);
        fVar2.Q(lVar);
        fVar2.O(cVar);
        fVar2.R(jFloatToRawIntBits);
        fVar2.f25417c = bVar;
        cVar.c();
        try {
            cVar3.invoke(bVar2);
            cVar.k();
            fVar2.P(cVar4);
            fVar2.Q(lVar2);
            fVar2.O(qVarX);
            fVar2.R(jE);
            fVar2.f25417c = bVar3;
            rVar.f31012a.f30949a = canvas2;
            this.f33322d = false;
        } catch (Throwable th2) {
            cVar.k();
            fVar2.P(cVar4);
            fVar2.Q(lVar2);
            fVar2.O(qVarX);
            fVar2.R(jE);
            fVar2.f25417c = bVar3;
            throw th2;
        }
    }

    public final boolean getCanUseCompositingLayer$ui_graphics() {
        return this.f33324f;
    }

    public final r getCanvasHolder() {
        return this.f33320b;
    }

    public final View getOwnerView() {
        return this.f33319a;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.f33324f;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.f33322d) {
            return;
        }
        this.f33322d = true;
        super.invalidate();
    }

    public final void setCanUseCompositingLayer$ui_graphics(boolean z3) {
        if (this.f33324f != z3) {
            this.f33324f = z3;
            invalidate();
        }
    }

    public final void setInvalidated(boolean z3) {
        this.f33322d = z3;
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z3, int i4, int i10, int i11, int i12) {
    }
}

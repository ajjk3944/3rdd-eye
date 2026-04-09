package j1;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.view.View;
import g1.p;
import g1.q;

/* loaded from: classes.dex */
public final class n extends View {
    public static final m G = new m(0);
    public t2.c B;
    public t2.i D;
    public ar.k E;
    public c F;

    /* renamed from: a, reason: collision with root package name */
    public final k1.a f13132a;

    /* renamed from: d, reason: collision with root package name */
    public final q f13133d;

    /* renamed from: g, reason: collision with root package name */
    public final i1.b f13134g;

    /* renamed from: r, reason: collision with root package name */
    public boolean f13135r;

    /* renamed from: x, reason: collision with root package name */
    public Outline f13136x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f13137y;

    public n(k1.a aVar, q qVar, i1.b bVar) {
        super(aVar.getContext());
        this.f13132a = aVar;
        this.f13133d = qVar;
        this.f13134g = bVar;
        setOutlineProvider(G);
        this.f13137y = true;
        this.B = i1.c.f11144a;
        this.D = t2.i.Ltr;
        e.f13073a.getClass();
        this.E = b.f13048r;
        setWillNotDraw(false);
        setClipBounds(null);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        q qVar = this.f13133d;
        g1.b bVar = qVar.f9263a;
        Canvas canvas2 = bVar.f9198a;
        bVar.f9198a = canvas;
        t2.c cVar = this.B;
        t2.i iVar = this.D;
        float width = getWidth();
        float height = getHeight();
        long jFloatToRawIntBits = (Float.floatToRawIntBits(height) & 4294967295L) | (Float.floatToRawIntBits(width) << 32);
        c cVar2 = this.F;
        ar.k kVar = this.E;
        i1.b bVar2 = this.f13134g;
        bm.d dVar = bVar2.f11141c;
        i1.a aVar = ((i1.b) dVar.f2828r).f11140b;
        t2.c cVar3 = aVar.f11136a;
        t2.i iVar2 = aVar.f11137b;
        p pVarY = dVar.y();
        bm.d dVar2 = bVar2.f11141c;
        long jH = dVar2.H();
        c cVar4 = (c) dVar2.f2827g;
        dVar2.P(cVar);
        dVar2.Q(iVar);
        dVar2.O(bVar);
        dVar2.R(jFloatToRawIntBits);
        dVar2.f2827g = cVar2;
        bVar.g();
        try {
            kVar.a(bVar2);
            bVar.n();
            dVar2.P(cVar3);
            dVar2.Q(iVar2);
            dVar2.O(pVarY);
            dVar2.R(jH);
            dVar2.f2827g = cVar4;
            qVar.f9263a.f9198a = canvas2;
            this.f13135r = false;
        } catch (Throwable th2) {
            bVar.n();
            dVar2.P(cVar3);
            dVar2.Q(iVar2);
            dVar2.O(pVarY);
            dVar2.R(jH);
            dVar2.f2827g = cVar4;
            throw th2;
        }
    }

    public final boolean getCanUseCompositingLayer$ui_graphics_release() {
        return this.f13137y;
    }

    public final q getCanvasHolder() {
        return this.f13133d;
    }

    public final View getOwnerView() {
        return this.f13132a;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.f13137y;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.f13135r) {
            return;
        }
        this.f13135r = true;
        super.invalidate();
    }

    public final void setCanUseCompositingLayer$ui_graphics_release(boolean z10) {
        if (this.f13137y != z10) {
            this.f13137y = z10;
            invalidate();
        }
    }

    public final void setInvalidated(boolean z10) {
        this.f13135r = z10;
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }
}

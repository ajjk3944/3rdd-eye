package s;

import android.graphics.Canvas;
import android.widget.EdgeEffect;
import androidx.compose.ui.platform.C0;
import j0.InterfaceC6236g;
import l0.AbstractC6532h;
import l0.C6531g;
import l0.C6537m;
import m0.AbstractC6670H;
import mh.InterfaceC6835l;
import o0.InterfaceC7036c;
import o0.InterfaceC7039f;
import oh.AbstractC7137b;

/* renamed from: s.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C7854o extends C0 implements InterfaceC6236g {

    /* renamed from: b, reason: collision with root package name */
    private final C7840a f60775b;

    /* renamed from: c, reason: collision with root package name */
    private final C7861w f60776c;

    /* renamed from: d, reason: collision with root package name */
    private final P f60777d;

    public C7854o(C7840a c7840a, C7861w c7861w, P p10, InterfaceC6835l interfaceC6835l) {
        super(interfaceC6835l);
        this.f60775b = c7840a;
        this.f60776c = c7861w;
        this.f60777d = p10;
    }

    private final boolean a(InterfaceC7039f interfaceC7039f, EdgeEffect edgeEffect, Canvas canvas) {
        return f(180.0f, AbstractC6532h.a(-C6537m.i(interfaceC7039f.c()), (-C6537m.g(interfaceC7039f.c())) + interfaceC7039f.d1(this.f60777d.a().c())), edgeEffect, canvas);
    }

    private final boolean c(InterfaceC7039f interfaceC7039f, EdgeEffect edgeEffect, Canvas canvas) {
        return f(270.0f, AbstractC6532h.a(-C6537m.g(interfaceC7039f.c()), interfaceC7039f.d1(this.f60777d.a().a(interfaceC7039f.getLayoutDirection()))), edgeEffect, canvas);
    }

    private final boolean d(InterfaceC7039f interfaceC7039f, EdgeEffect edgeEffect, Canvas canvas) {
        return f(90.0f, AbstractC6532h.a(0.0f, (-AbstractC7137b.e(C6537m.i(interfaceC7039f.c()))) + interfaceC7039f.d1(this.f60777d.a().b(interfaceC7039f.getLayoutDirection()))), edgeEffect, canvas);
    }

    private final boolean e(InterfaceC7039f interfaceC7039f, EdgeEffect edgeEffect, Canvas canvas) {
        return f(0.0f, AbstractC6532h.a(0.0f, interfaceC7039f.d1(this.f60777d.a().d())), edgeEffect, canvas);
    }

    private final boolean f(float f10, long j10, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        canvas.rotate(f10);
        canvas.translate(C6531g.m(j10), C6531g.n(j10));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    @Override // j0.InterfaceC6236g
    public void J(InterfaceC7036c interfaceC7036c) {
        this.f60775b.r(interfaceC7036c.c());
        if (C6537m.k(interfaceC7036c.c())) {
            interfaceC7036c.X1();
            return;
        }
        interfaceC7036c.X1();
        this.f60775b.j().getValue();
        Canvas canvasD = AbstractC6670H.d(interfaceC7036c.k1().d());
        C7861w c7861w = this.f60776c;
        boolean zC = c7861w.r() ? c(interfaceC7036c, c7861w.h(), canvasD) : false;
        if (c7861w.y()) {
            zC = e(interfaceC7036c, c7861w.l(), canvasD) || zC;
        }
        if (c7861w.u()) {
            zC = d(interfaceC7036c, c7861w.j(), canvasD) || zC;
        }
        if (c7861w.o()) {
            zC = a(interfaceC7036c, c7861w.f(), canvasD) || zC;
        }
        if (zC) {
            this.f60775b.k();
        }
    }
}

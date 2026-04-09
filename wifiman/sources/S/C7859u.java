package s;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.widget.EdgeEffect;
import androidx.compose.ui.platform.C0;
import j0.InterfaceC6236g;
import l0.C6531g;
import l0.C6537m;
import m0.AbstractC6670H;
import m0.InterfaceC6717n0;
import mh.InterfaceC6835l;
import o0.InterfaceC7036c;
import o0.InterfaceC7037d;
import oh.AbstractC7137b;
import p0.C7182c;

/* renamed from: s.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C7859u extends C0 implements InterfaceC6236g {

    /* renamed from: b, reason: collision with root package name */
    private final C7840a f60778b;

    /* renamed from: c, reason: collision with root package name */
    private final C7861w f60779c;

    /* renamed from: d, reason: collision with root package name */
    private RenderNode f60780d;

    public C7859u(C7840a c7840a, C7861w c7861w, InterfaceC6835l interfaceC6835l) {
        super(interfaceC6835l);
        this.f60778b = c7840a;
        this.f60779c = c7861w;
    }

    private final boolean a(EdgeEffect edgeEffect, Canvas canvas) {
        return f(180.0f, edgeEffect, canvas);
    }

    private final boolean c(EdgeEffect edgeEffect, Canvas canvas) {
        return f(270.0f, edgeEffect, canvas);
    }

    private final boolean d(EdgeEffect edgeEffect, Canvas canvas) {
        return f(90.0f, edgeEffect, canvas);
    }

    private final boolean e(EdgeEffect edgeEffect, Canvas canvas) {
        return f(0.0f, edgeEffect, canvas);
    }

    private final boolean f(float f10, EdgeEffect edgeEffect, Canvas canvas) {
        if (f10 == 0.0f) {
            return edgeEffect.draw(canvas);
        }
        int iSave = canvas.save();
        canvas.rotate(f10);
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    private final RenderNode g() {
        RenderNode renderNode = this.f60780d;
        if (renderNode != null) {
            return renderNode;
        }
        RenderNode renderNodeA = AbstractC7855p.a("AndroidEdgeEffectOverscrollEffect");
        this.f60780d = renderNodeA;
        return renderNodeA;
    }

    private final boolean h() {
        C7861w c7861w = this.f60779c;
        return c7861w.r() || c7861w.s() || c7861w.u() || c7861w.v();
    }

    private final boolean i() {
        C7861w c7861w = this.f60779c;
        return c7861w.y() || c7861w.z() || c7861w.o() || c7861w.p();
    }

    @Override // j0.InterfaceC6236g
    public void J(InterfaceC7036c interfaceC7036c) {
        boolean zC;
        float f10;
        float f11;
        this.f60778b.r(interfaceC7036c.c());
        if (C6537m.k(interfaceC7036c.c())) {
            interfaceC7036c.X1();
            return;
        }
        this.f60778b.j().getValue();
        float fD1 = interfaceC7036c.d1(AbstractC7851l.b());
        Canvas canvasD = AbstractC6670H.d(interfaceC7036c.k1().d());
        C7861w c7861w = this.f60779c;
        boolean zI = i();
        boolean zH = h();
        if (zI && zH) {
            g().setPosition(0, 0, canvasD.getWidth(), canvasD.getHeight());
        } else if (zI) {
            g().setPosition(0, 0, canvasD.getWidth() + (AbstractC7137b.e(fD1) * 2), canvasD.getHeight());
        } else {
            if (!zH) {
                interfaceC7036c.X1();
                return;
            }
            g().setPosition(0, 0, canvasD.getWidth(), canvasD.getHeight() + (AbstractC7137b.e(fD1) * 2));
        }
        RecordingCanvas recordingCanvasBeginRecording = g().beginRecording();
        if (c7861w.s()) {
            EdgeEffect edgeEffectI = c7861w.i();
            d(edgeEffectI, recordingCanvasBeginRecording);
            edgeEffectI.finish();
        }
        if (c7861w.r()) {
            EdgeEffect edgeEffectH = c7861w.h();
            zC = c(edgeEffectH, recordingCanvasBeginRecording);
            if (c7861w.t()) {
                float fN = C6531g.n(this.f60778b.i());
                C7860v c7860v = C7860v.f60781a;
                c7860v.d(c7861w.i(), c7860v.b(edgeEffectH), 1 - fN);
            }
        } else {
            zC = false;
        }
        if (c7861w.z()) {
            EdgeEffect edgeEffectM = c7861w.m();
            a(edgeEffectM, recordingCanvasBeginRecording);
            edgeEffectM.finish();
        }
        if (c7861w.y()) {
            EdgeEffect edgeEffectL = c7861w.l();
            zC = e(edgeEffectL, recordingCanvasBeginRecording) || zC;
            if (c7861w.A()) {
                float fM = C6531g.m(this.f60778b.i());
                C7860v c7860v2 = C7860v.f60781a;
                c7860v2.d(c7861w.m(), c7860v2.b(edgeEffectL), fM);
            }
        }
        if (c7861w.v()) {
            EdgeEffect edgeEffectK = c7861w.k();
            c(edgeEffectK, recordingCanvasBeginRecording);
            edgeEffectK.finish();
        }
        if (c7861w.u()) {
            EdgeEffect edgeEffectJ = c7861w.j();
            zC = d(edgeEffectJ, recordingCanvasBeginRecording) || zC;
            if (c7861w.w()) {
                float fN2 = C6531g.n(this.f60778b.i());
                C7860v c7860v3 = C7860v.f60781a;
                c7860v3.d(c7861w.k(), c7860v3.b(edgeEffectJ), fN2);
            }
        }
        if (c7861w.p()) {
            EdgeEffect edgeEffectG = c7861w.g();
            e(edgeEffectG, recordingCanvasBeginRecording);
            edgeEffectG.finish();
        }
        if (c7861w.o()) {
            EdgeEffect edgeEffectF = c7861w.f();
            boolean z10 = a(edgeEffectF, recordingCanvasBeginRecording) || zC;
            if (c7861w.q()) {
                float fM2 = C6531g.m(this.f60778b.i());
                C7860v c7860v4 = C7860v.f60781a;
                c7860v4.d(c7861w.g(), c7860v4.b(edgeEffectF), 1 - fM2);
            }
            zC = z10;
        }
        if (zC) {
            this.f60778b.k();
        }
        float f12 = zH ? 0.0f : fD1;
        if (zI) {
            fD1 = 0.0f;
        }
        Y0.t layoutDirection = interfaceC7036c.getLayoutDirection();
        InterfaceC6717n0 interfaceC6717n0B = AbstractC6670H.b(recordingCanvasBeginRecording);
        long jC = interfaceC7036c.c();
        Y0.d density = interfaceC7036c.k1().getDensity();
        Y0.t layoutDirection2 = interfaceC7036c.k1().getLayoutDirection();
        InterfaceC6717n0 interfaceC6717n0D = interfaceC7036c.k1().d();
        long jC2 = interfaceC7036c.k1().c();
        C7182c c7182cG = interfaceC7036c.k1().g();
        InterfaceC7037d interfaceC7037dK1 = interfaceC7036c.k1();
        interfaceC7037dK1.a(interfaceC7036c);
        interfaceC7037dK1.b(layoutDirection);
        interfaceC7037dK1.i(interfaceC6717n0B);
        interfaceC7037dK1.f(jC);
        interfaceC7037dK1.h(null);
        interfaceC6717n0B.j();
        try {
            interfaceC7036c.k1().e().c(f12, fD1);
            try {
                interfaceC7036c.X1();
                interfaceC6717n0B.r();
                InterfaceC7037d interfaceC7037dK12 = interfaceC7036c.k1();
                interfaceC7037dK12.a(density);
                interfaceC7037dK12.b(layoutDirection2);
                interfaceC7037dK12.i(interfaceC6717n0D);
                interfaceC7037dK12.f(jC2);
                interfaceC7037dK12.h(c7182cG);
                g().endRecording();
                int iSave = canvasD.save();
                canvasD.translate(f10, f11);
                canvasD.drawRenderNode(g());
                canvasD.restoreToCount(iSave);
            } finally {
                interfaceC7036c.k1().e().c(-f12, -fD1);
            }
        } catch (Throwable th2) {
            interfaceC6717n0B.r();
            InterfaceC7037d interfaceC7037dK13 = interfaceC7036c.k1();
            interfaceC7037dK13.a(density);
            interfaceC7037dK13.b(layoutDirection2);
            interfaceC7037dK13.i(interfaceC6717n0D);
            interfaceC7037dK13.f(jC2);
            interfaceC7037dK13.h(c7182cG);
            throw th2;
        }
    }
}

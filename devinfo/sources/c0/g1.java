package c0;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import android.widget.EdgeEffect;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class g1 extends i2.j implements i2.l {

    /* renamed from: q, reason: collision with root package name */
    public final j f2429q;

    /* renamed from: r, reason: collision with root package name */
    public final g0 f2430r;

    /* renamed from: s, reason: collision with root package name */
    public RenderNode f2431s;

    public g1(c2.m0 m0Var, j jVar, g0 g0Var) {
        this.f2429q = jVar;
        this.f2430r = g0Var;
        p0(m0Var);
    }

    public static boolean s0(float f10, EdgeEffect edgeEffect, Canvas canvas) {
        if (f10 == 0.0f) {
            return edgeEffect.draw(canvas);
        }
        int iSave = canvas.save();
        canvas.rotate(f10);
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    @Override // i2.l
    public final void J(i2.g0 g0Var) {
        i0.f fVar;
        boolean zS0;
        j jVar;
        boolean z3;
        char c9;
        float f10;
        float f11;
        float f12;
        float fB;
        r1.b bVar = g0Var.f25668a;
        long jE = bVar.f32718b.E();
        j jVar2 = this.f2429q;
        jVar2.i(jE);
        Canvas canvasA = p1.d.a(bVar.f32718b.x());
        jVar2.f2442d.getValue();
        i0.f fVar2 = bVar.f32718b;
        if (o1.e.c(fVar2.E())) {
            g0Var.b();
            return;
        }
        boolean zIsHardwareAccelerated = canvasA.isHardwareAccelerated();
        g0 g0Var2 = this.f2430r;
        if (!zIsHardwareAccelerated) {
            EdgeEffect edgeEffect = g0Var2.f2423d;
            if (edgeEffect != null) {
                edgeEffect.finish();
            }
            EdgeEffect edgeEffect2 = g0Var2.f2424e;
            if (edgeEffect2 != null) {
                edgeEffect2.finish();
            }
            EdgeEffect edgeEffect3 = g0Var2.f2425f;
            if (edgeEffect3 != null) {
                edgeEffect3.finish();
            }
            EdgeEffect edgeEffect4 = g0Var2.g;
            if (edgeEffect4 != null) {
                edgeEffect4.finish();
            }
            EdgeEffect edgeEffect5 = g0Var2.f2426h;
            if (edgeEffect5 != null) {
                edgeEffect5.finish();
            }
            EdgeEffect edgeEffect6 = g0Var2.f2427i;
            if (edgeEffect6 != null) {
                edgeEffect6.finish();
            }
            EdgeEffect edgeEffect7 = g0Var2.j;
            if (edgeEffect7 != null) {
                edgeEffect7.finish();
            }
            EdgeEffect edgeEffect8 = g0Var2.f2428k;
            if (edgeEffect8 != null) {
                edgeEffect8.finish();
            }
            g0Var.b();
            return;
        }
        float fI = g0Var.I(c0.f2378a);
        boolean z10 = g0.f(g0Var2.f2423d) || g0.g(g0Var2.f2426h) || g0.f(g0Var2.f2424e) || g0.g(g0Var2.f2427i);
        boolean z11 = g0.f(g0Var2.f2425f) || g0.g(g0Var2.j) || g0.f(g0Var2.g) || g0.g(g0Var2.f2428k);
        if (z10 && z11) {
            t0().setPosition(0, 0, canvasA.getWidth(), canvasA.getHeight());
        } else if (z10) {
            t0().setPosition(0, 0, (pk.a.s(fI) * 2) + canvasA.getWidth(), canvasA.getHeight());
        } else {
            if (!z11) {
                g0Var.b();
                return;
            }
            t0().setPosition(0, 0, canvasA.getWidth(), (pk.a.s(fI) * 2) + canvasA.getHeight());
        }
        RecordingCanvas recordingCanvasBeginRecording = t0().beginRecording();
        boolean zG = g0.g(g0Var2.j);
        d0.a1 a1Var = d0.a1.f21663b;
        if (zG) {
            EdgeEffect edgeEffectA = g0Var2.j;
            if (edgeEffectA == null) {
                edgeEffectA = g0Var2.a(a1Var);
                g0Var2.j = edgeEffectA;
            }
            s0(90.0f, edgeEffectA, recordingCanvasBeginRecording);
            edgeEffectA.finish();
        }
        if (g0.f(g0Var2.f2425f)) {
            EdgeEffect edgeEffectC = g0Var2.c();
            zS0 = s0(270.0f, edgeEffectC, recordingCanvasBeginRecording);
            if (g0.g(g0Var2.f2425f)) {
                float fIntBitsToFloat = Float.intBitsToFloat((int) (jVar2.c() & 4294967295L));
                EdgeEffect edgeEffectA2 = g0Var2.j;
                if (edgeEffectA2 == null) {
                    edgeEffectA2 = g0Var2.a(a1Var);
                    g0Var2.j = edgeEffectA2;
                }
                int i4 = Build.VERSION.SDK_INT;
                float fB2 = i4 >= 31 ? m.b(edgeEffectC) : 0.0f;
                fVar = fVar2;
                float f13 = 1 - fIntBitsToFloat;
                if (i4 >= 31) {
                    m.c(edgeEffectA2, fB2, f13);
                } else {
                    edgeEffectA2.onPull(fB2, f13);
                }
            } else {
                fVar = fVar2;
            }
        } else {
            fVar = fVar2;
            zS0 = false;
        }
        boolean zG2 = g0.g(g0Var2.f2426h);
        d0.a1 a1Var2 = d0.a1.f21662a;
        if (zG2) {
            EdgeEffect edgeEffectA3 = g0Var2.f2426h;
            if (edgeEffectA3 == null) {
                edgeEffectA3 = g0Var2.a(a1Var2);
                g0Var2.f2426h = edgeEffectA3;
            }
            s0(180.0f, edgeEffectA3, recordingCanvasBeginRecording);
            edgeEffectA3.finish();
        }
        if (g0.f(g0Var2.f2423d)) {
            EdgeEffect edgeEffectE = g0Var2.e();
            boolean z12 = s0(0.0f, edgeEffectE, recordingCanvasBeginRecording) || zS0;
            if (g0.g(g0Var2.f2423d)) {
                z3 = z11;
                c9 = ' ';
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jVar2.c() >> 32));
                EdgeEffect edgeEffectA4 = g0Var2.f2426h;
                if (edgeEffectA4 == null) {
                    edgeEffectA4 = g0Var2.a(a1Var2);
                    g0Var2.f2426h = edgeEffectA4;
                }
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 31) {
                    jVar = jVar2;
                    fB = m.b(edgeEffectE);
                } else {
                    jVar = jVar2;
                    fB = 0.0f;
                }
                if (i10 >= 31) {
                    m.c(edgeEffectA4, fB, fIntBitsToFloat2);
                } else {
                    edgeEffectA4.onPull(fB, fIntBitsToFloat2);
                }
            } else {
                jVar = jVar2;
                z3 = z11;
                c9 = ' ';
            }
            zS0 = z12;
        } else {
            jVar = jVar2;
            z3 = z11;
            c9 = ' ';
        }
        if (g0.g(g0Var2.f2428k)) {
            EdgeEffect edgeEffectA5 = g0Var2.f2428k;
            if (edgeEffectA5 == null) {
                edgeEffectA5 = g0Var2.a(a1Var);
                g0Var2.f2428k = edgeEffectA5;
            }
            s0(270.0f, edgeEffectA5, recordingCanvasBeginRecording);
            edgeEffectA5.finish();
        }
        if (g0.f(g0Var2.g)) {
            EdgeEffect edgeEffectD = g0Var2.d();
            boolean z13 = s0(90.0f, edgeEffectD, recordingCanvasBeginRecording) || zS0;
            if (g0.g(g0Var2.g)) {
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jVar.c() & 4294967295L));
                EdgeEffect edgeEffectA6 = g0Var2.f2428k;
                if (edgeEffectA6 == null) {
                    edgeEffectA6 = g0Var2.a(a1Var);
                    g0Var2.f2428k = edgeEffectA6;
                }
                int i11 = Build.VERSION.SDK_INT;
                float fB3 = i11 >= 31 ? m.b(edgeEffectD) : 0.0f;
                if (i11 >= 31) {
                    m.c(edgeEffectA6, fB3, fIntBitsToFloat3);
                } else {
                    edgeEffectA6.onPull(fB3, fIntBitsToFloat3);
                }
            }
            zS0 = z13;
        }
        if (g0.g(g0Var2.f2427i)) {
            EdgeEffect edgeEffectA7 = g0Var2.f2427i;
            if (edgeEffectA7 == null) {
                edgeEffectA7 = g0Var2.a(a1Var2);
                g0Var2.f2427i = edgeEffectA7;
            }
            f10 = 0.0f;
            s0(0.0f, edgeEffectA7, recordingCanvasBeginRecording);
            edgeEffectA7.finish();
        } else {
            f10 = 0.0f;
        }
        if (g0.f(g0Var2.f2424e)) {
            EdgeEffect edgeEffectB = g0Var2.b();
            boolean z14 = s0(180.0f, edgeEffectB, recordingCanvasBeginRecording) || zS0;
            if (g0.g(g0Var2.f2424e)) {
                float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jVar.c() >> c9));
                EdgeEffect edgeEffectA8 = g0Var2.f2427i;
                if (edgeEffectA8 == null) {
                    edgeEffectA8 = g0Var2.a(a1Var2);
                    g0Var2.f2427i = edgeEffectA8;
                }
                int i12 = Build.VERSION.SDK_INT;
                float fB4 = i12 >= 31 ? m.b(edgeEffectB) : f10;
                float f14 = 1 - fIntBitsToFloat4;
                if (i12 >= 31) {
                    m.c(edgeEffectA8, fB4, f14);
                } else {
                    edgeEffectA8.onPull(fB4, f14);
                }
            }
            zS0 = z14;
        }
        if (zS0) {
            jVar.d();
        }
        float f15 = z3 ? f10 : fI;
        if (z10) {
            fI = f10;
        }
        d3.l layoutDirection = g0Var.getLayoutDirection();
        p1.c cVar = new p1.c();
        cVar.f30949a = recordingCanvasBeginRecording;
        long jE2 = fVar.E();
        i0.f fVar3 = bVar.f32718b;
        r1.a aVar = ((r1.b) fVar3.f25418d).f32717a;
        d3.c cVar2 = aVar.f32713a;
        d3.l lVar = aVar.f32714b;
        p1.q qVarX = fVar3.x();
        long jE3 = bVar.f32718b.E();
        i0.f fVar4 = bVar.f32718b;
        s1.b bVar2 = (s1.b) fVar4.f25417c;
        fVar4.P(g0Var);
        fVar4.Q(layoutDirection);
        fVar4.O(cVar);
        fVar4.R(jE2);
        fVar4.f25417c = null;
        cVar.c();
        try {
            ((nm.d0) bVar.f32718b.f25416b).w(f15, fI);
            try {
                g0Var.b();
                cVar.k();
                i0.f fVar5 = bVar.f32718b;
                fVar5.P(cVar2);
                fVar5.Q(lVar);
                fVar5.O(qVarX);
                fVar5.R(jE3);
                fVar5.f25417c = bVar2;
                t0().endRecording();
                int iSave = canvasA.save();
                canvasA.translate(f11, f12);
                canvasA.drawRenderNode(t0());
                canvasA.restoreToCount(iSave);
            } finally {
                ((nm.d0) bVar.f32718b.f25416b).w(-f15, -fI);
            }
        } catch (Throwable th2) {
            cVar.k();
            i0.f fVar6 = bVar.f32718b;
            fVar6.P(cVar2);
            fVar6.Q(lVar);
            fVar6.O(qVarX);
            fVar6.R(jE3);
            fVar6.f25417c = bVar2;
            throw th2;
        }
    }

    public final RenderNode t0() {
        RenderNode renderNode = this.f2431s;
        if (renderNode != null) {
            return renderNode;
        }
        RenderNode renderNodeB = f1.b();
        this.f2431s = renderNodeB;
        return renderNodeB;
    }

    @Override // i2.l
    public final /* synthetic */ void z() {
    }
}

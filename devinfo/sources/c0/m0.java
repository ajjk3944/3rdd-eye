package c0;

import android.graphics.Canvas;
import android.widget.EdgeEffect;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class m0 extends i2.j implements i2.l {

    /* renamed from: q, reason: collision with root package name */
    public final j f2462q;

    /* renamed from: r, reason: collision with root package name */
    public final g0 f2463r;

    /* renamed from: s, reason: collision with root package name */
    public final g0.a0 f2464s;

    public m0(c2.m0 m0Var, j jVar, g0 g0Var, g0.a0 a0Var) {
        this.f2462q = jVar;
        this.f2463r = g0Var;
        this.f2464s = a0Var;
        p0(m0Var);
    }

    public static boolean s0(float f10, long j, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        canvas.rotate(f10);
        canvas.translate(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    @Override // i2.l
    public final void J(i2.g0 g0Var) {
        boolean zS0;
        char c9;
        long j;
        r1.b bVar = g0Var.f25668a;
        long jE = bVar.f32718b.E();
        j jVar = this.f2462q;
        jVar.i(jE);
        if (o1.e.c(bVar.f32718b.E())) {
            g0Var.b();
            return;
        }
        g0Var.b();
        jVar.f2442d.getValue();
        Canvas canvasA = p1.d.a(bVar.f32718b.x());
        g0 g0Var2 = this.f2463r;
        boolean zF = g0.f(g0Var2.f2425f);
        d3.l lVar = d3.l.f21966a;
        g0.a0 a0Var = this.f2464s;
        if (zF) {
            EdgeEffect edgeEffectC = g0Var2.c();
            float f10 = -Float.intBitsToFloat((int) (g0Var.c() & 4294967295L));
            zS0 = s0(270.0f, (Float.floatToRawIntBits(g0Var.I(g0Var.getLayoutDirection() == lVar ? a0Var.f24096a : a0Var.f24098c)) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32), edgeEffectC, canvasA);
        } else {
            zS0 = false;
        }
        if (g0.f(g0Var2.f2423d)) {
            c9 = ' ';
            j = 4294967295L;
            zS0 = s0(0.0f, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(g0Var.I(a0Var.f24097b))) & 4294967295L), g0Var2.e(), canvasA) || zS0;
        } else {
            c9 = ' ';
            j = 4294967295L;
        }
        if (g0.f(g0Var2.g)) {
            zS0 = s0(90.0f, (((long) Float.floatToRawIntBits(0.0f)) << c9) | (((long) Float.floatToRawIntBits(g0Var.I(g0Var.getLayoutDirection() == lVar ? a0Var.f24098c : a0Var.f24096a) + (-((float) pk.a.s(Float.intBitsToFloat((int) (g0Var.c() >> c9))))))) & j), g0Var2.d(), canvasA) || zS0;
        }
        if (g0.f(g0Var2.f2424e)) {
            EdgeEffect edgeEffectB = g0Var2.b();
            zS0 = s0(180.0f, (((long) Float.floatToRawIntBits(-Float.intBitsToFloat((int) (g0Var.c() >> c9)))) << c9) | (((long) Float.floatToRawIntBits((-Float.intBitsToFloat((int) (g0Var.c() & j))) + g0Var.I(a0Var.f24099d))) & j), edgeEffectB, canvasA) || zS0;
        }
        if (zS0) {
            jVar.d();
        }
    }

    @Override // i2.l
    public final /* synthetic */ void z() {
    }
}

package q2;

import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import i2.C4430C;
import i2.C4448h;
import i2.InterfaceC4433F;
import i2.z;
import j2.C5167a;
import java.util.HashMap;
import l2.C5270c;
import l2.q;
import u2.C5629h;

/* compiled from: ImageLayer.java */
/* loaded from: classes.dex */
public final class d extends b {

    /* renamed from: D, reason: collision with root package name */
    public final C5167a f45367D;

    /* renamed from: E, reason: collision with root package name */
    public final Rect f45368E;

    /* renamed from: F, reason: collision with root package name */
    public final Rect f45369F;

    /* renamed from: G, reason: collision with root package name */
    public final C4430C f45370G;

    /* renamed from: H, reason: collision with root package name */
    public q f45371H;

    /* renamed from: I, reason: collision with root package name */
    public q f45372I;

    /* renamed from: J, reason: collision with root package name */
    public final C5270c f45373J;

    public d(z zVar, e eVar) {
        C4430C c4430c;
        super(zVar, eVar);
        this.f45367D = new C5167a(3);
        this.f45368E = new Rect();
        this.f45369F = new Rect();
        C4448h c4448h = zVar.f38423b;
        if (c4448h == null) {
            c4430c = null;
        } else {
            c4430c = (C4430C) ((HashMap) c4448h.c()).get(eVar.f45380g);
        }
        this.f45370G = c4430c;
        D3.d dVar = this.f45346p.f45396x;
        if (dVar != null) {
            this.f45373J = new C5270c(this, this, dVar);
        }
    }

    @Override // q2.b, n2.InterfaceC5352f
    public final void c(ColorFilter colorFilter, B0.f fVar) {
        super.c(colorFilter, fVar);
        if (colorFilter == InterfaceC4433F.f38294F) {
            this.f45371H = new q(fVar, null);
        } else if (colorFilter == InterfaceC4433F.f38297I) {
            this.f45372I = new q(fVar, null);
        }
    }

    @Override // q2.b, k2.InterfaceC5214e
    public final void d(RectF rectF, Matrix matrix, boolean z10) {
        super.d(rectF, matrix, z10);
        if (this.f45370G != null) {
            float fC = C5629h.c();
            rectF.set(0.0f, 0.0f, r3.f38283a * fC, r3.f38284b * fC);
            this.f45344n.mapRect(rectF);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0105  */
    @Override // q2.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(android.graphics.Canvas r17, android.graphics.Matrix r18, int r19) {
        /*
            Method dump skipped, instructions count: 427
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q2.d.k(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }
}

package o2;

import android.graphics.Paint;
import android.text.TextPaint;
import bf.n;
import g1.f0;
import g1.h0;
import g1.r;
import n0.d0;
import r2.l;
import yb.k;

/* loaded from: classes.dex */
public final class e extends TextPaint {

    /* renamed from: a, reason: collision with root package name */
    public k f18742a;

    /* renamed from: b, reason: collision with root package name */
    public l f18743b;

    /* renamed from: c, reason: collision with root package name */
    public int f18744c;

    /* renamed from: d, reason: collision with root package name */
    public h0 f18745d;

    /* renamed from: e, reason: collision with root package name */
    public r f18746e;

    /* renamed from: f, reason: collision with root package name */
    public f0 f18747f;

    /* renamed from: g, reason: collision with root package name */
    public d0 f18748g;

    /* renamed from: h, reason: collision with root package name */
    public f1.e f18749h;

    /* renamed from: i, reason: collision with root package name */
    public i1.c f18750i;

    public final k a() {
        k kVar = this.f18742a;
        if (kVar != null) {
            return kVar;
        }
        k kVar2 = new k(this);
        this.f18742a = kVar2;
        return kVar2;
    }

    public final void b(int i10) {
        if (i10 == this.f18744c) {
            return;
        }
        a().c(i10);
        this.f18744c = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(g1.f0 r6, long r7, float r9) {
        /*
            r5 = this;
            r0 = 0
            if (r6 != 0) goto Ld
            r5.f18748g = r0
            r5.f18747f = r0
            r5.f18749h = r0
            r5.setShader(r0)
            return
        Ld:
            boolean r1 = r6 instanceof g1.k0
            if (r1 == 0) goto L1d
            g1.k0 r6 = (g1.k0) r6
            long r6 = r6.f9254e
            long r6 = ic.a.A(r6, r9)
            r5.d(r6)
            return
        L1d:
            boolean r1 = r6 instanceof g1.o
            if (r1 == 0) goto L7a
            g1.f0 r1 = r5.f18747f
            boolean r1 = br.l.a(r1, r6)
            r2 = 0
            if (r1 == 0) goto L38
            f1.e r1 = r5.f18749h
            if (r1 != 0) goto L30
            r1 = r2
            goto L36
        L30:
            long r3 = r1.f8416a
            boolean r1 = f1.e.a(r3, r7)
        L36:
            if (r1 != 0) goto L5b
        L38:
            r3 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r1 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r1 == 0) goto L42
            r2 = 1
        L42:
            if (r2 == 0) goto L5b
            r5.f18747f = r6
            f1.e r1 = new f1.e
            r1.<init>(r7)
            r5.f18749h = r1
            androidx.lifecycle.p0 r1 = new androidx.lifecycle.p0
            r1.<init>(r6, r7)
            qm.c r6 = n0.d2.f17151a
            n0.d0 r6 = new n0.d0
            r6.<init>(r1)
            r5.f18748g = r6
        L5b:
            yb.k r6 = r5.a()
            n0.d0 r7 = r5.f18748g
            if (r7 == 0) goto L6a
            java.lang.Object r7 = r7.getValue()
            android.graphics.Shader r7 = (android.graphics.Shader) r7
            goto L6b
        L6a:
            r7 = r0
        L6b:
            r6.f26242c = r7
            java.lang.Object r6 = r6.f26241b
            android.graphics.Paint r6 = (android.graphics.Paint) r6
            r6.setShader(r7)
            r5.f18746e = r0
            o2.j.b(r5, r9)
            return
        L7a:
            bf.n r6 = new bf.n
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o2.e.c(g1.f0, long, float):void");
    }

    public final void d(long j) {
        r rVar = this.f18746e;
        if (rVar == null ? false : r.c(rVar.f9271a, j)) {
            return;
        }
        if (j != 16) {
            this.f18746e = new r(j);
            setColor(f0.q(j));
            this.f18748g = null;
            this.f18747f = null;
            this.f18749h = null;
            setShader(null);
        }
    }

    public final void e(i1.c cVar) {
        if (cVar == null || br.l.a(this.f18750i, cVar)) {
            return;
        }
        this.f18750i = cVar;
        if (cVar.equals(i1.f.f11146b)) {
            setStyle(Paint.Style.FILL);
            return;
        }
        if (!(cVar instanceof i1.g)) {
            throw new n();
        }
        a().f(1);
        i1.g gVar = (i1.g) cVar;
        ((Paint) a().f26241b).setStrokeWidth(gVar.f11147b);
        ((Paint) a().f26241b).setStrokeMiter(gVar.f11148c);
        k kVarA = a();
        int i10 = gVar.f11150e;
        ((Paint) kVarA.f26241b).setStrokeJoin(i10 == 0 ? Paint.Join.MITER : i10 == 2 ? Paint.Join.BEVEL : i10 == 1 ? Paint.Join.ROUND : Paint.Join.MITER);
        k kVarA2 = a();
        int i11 = gVar.f11149d;
        ((Paint) kVarA2.f26241b).setStrokeCap(i11 == 2 ? Paint.Cap.SQUARE : i11 == 1 ? Paint.Cap.ROUND : i11 == 0 ? Paint.Cap.BUTT : Paint.Cap.BUTT);
        ((Paint) a().f26241b).setPathEffect(null);
    }

    public final void f(h0 h0Var) {
        if (h0Var == null || br.l.a(this.f18745d, h0Var)) {
            return;
        }
        this.f18745d = h0Var;
        if (h0Var.equals(h0.f9234d)) {
            clearShadowLayer();
            return;
        }
        h0 h0Var2 = this.f18745d;
        float f10 = h0Var2.f9237c;
        if (f10 == 0.0f) {
            f10 = Float.MIN_VALUE;
        }
        setShadowLayer(f10, Float.intBitsToFloat((int) (h0Var2.f9236b >> 32)), Float.intBitsToFloat((int) (this.f18745d.f9236b & 4294967295L)), f0.q(this.f18745d.f9235a));
    }

    public final void g(l lVar) {
        if (lVar == null || br.l.a(this.f18743b, lVar)) {
            return;
        }
        this.f18743b = lVar;
        int i10 = lVar.f21210a;
        setUnderlineText((i10 | 1) == i10);
        int i11 = this.f18743b.f21210a;
        setStrikeThruText((i11 | 2) == i11);
    }
}

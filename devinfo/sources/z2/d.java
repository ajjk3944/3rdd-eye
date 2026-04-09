package z2;

import ac.m;
import android.graphics.Paint;
import android.text.TextPaint;
import c3.l;
import p1.i0;
import p1.s;
import p1.z;
import u0.d0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class d extends TextPaint {

    /* renamed from: a, reason: collision with root package name */
    public l7.d f37851a;

    /* renamed from: b, reason: collision with root package name */
    public l f37852b;

    /* renamed from: c, reason: collision with root package name */
    public int f37853c;

    /* renamed from: d, reason: collision with root package name */
    public i0 f37854d;

    /* renamed from: e, reason: collision with root package name */
    public s f37855e;

    /* renamed from: f, reason: collision with root package name */
    public z f37856f;
    public d0 g;

    /* renamed from: h, reason: collision with root package name */
    public o1.e f37857h;

    /* renamed from: i, reason: collision with root package name */
    public r1.c f37858i;

    public final l7.d a() {
        l7.d dVar = this.f37851a;
        if (dVar != null) {
            return dVar;
        }
        l7.d dVar2 = new l7.d(this);
        this.f37851a = dVar2;
        return dVar2;
    }

    public final void b(int i4) {
        if (i4 == this.f37853c) {
            return;
        }
        a().b(i4);
        this.f37853c = i4;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(p1.z r6, long r7, float r9) {
        /*
            r5 = this;
            r0 = 0
            if (r6 != 0) goto Ld
            r5.g = r0
            r5.f37856f = r0
            r5.f37857h = r0
            r5.setShader(r0)
            return
        Ld:
            boolean r1 = r6 instanceof p1.l0
            if (r1 == 0) goto L1d
            p1.l0 r6 = (p1.l0) r6
            long r6 = r6.f31002f
            long r6 = t6.i0.p(r6, r9)
            r5.d(r6)
            return
        L1d:
            boolean r1 = r6 instanceof p1.p
            if (r1 == 0) goto L77
            p1.z r1 = r5.f37856f
            boolean r1 = nk.k.a(r1, r6)
            r2 = 0
            if (r1 == 0) goto L38
            o1.e r1 = r5.f37857h
            if (r1 != 0) goto L30
            r1 = r2
            goto L36
        L30:
            long r3 = r1.f30377a
            boolean r1 = o1.e.a(r3, r7)
        L36:
            if (r1 != 0) goto L58
        L38:
            r3 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r1 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r1 == 0) goto L42
            r2 = 1
        L42:
            if (r2 == 0) goto L58
            r5.f37856f = r6
            o1.e r1 = new o1.e
            r1.<init>(r7)
            r5.f37857h = r1
            a6.e r1 = new a6.e
            r1.<init>(r6, r7)
            u0.d0 r6 = u0.q.l(r1)
            r5.g = r6
        L58:
            l7.d r6 = r5.a()
            u0.d0 r7 = r5.g
            if (r7 == 0) goto L67
            java.lang.Object r7 = r7.getValue()
            android.graphics.Shader r7 = (android.graphics.Shader) r7
            goto L68
        L67:
            r7 = r0
        L68:
            r6.f28605c = r7
            java.lang.Object r6 = r6.f28604b
            android.graphics.Paint r6 = (android.graphics.Paint) r6
            r6.setShader(r7)
            r5.f37855e = r0
            z2.i.b(r5, r9)
            return
        L77:
            ac.m r6 = new ac.m
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: z2.d.c(p1.z, long, float):void");
    }

    public final void d(long j) {
        s sVar = this.f37855e;
        if (sVar == null ? false : s.c(sVar.f31020a, j)) {
            return;
        }
        if (j != 16) {
            this.f37855e = new s(j);
            setColor(z.u(j));
            this.g = null;
            this.f37856f = null;
            this.f37857h = null;
            setShader(null);
        }
    }

    public final void e(r1.c cVar) {
        if (cVar == null || nk.k.a(this.f37858i, cVar)) {
            return;
        }
        this.f37858i = cVar;
        if (cVar.equals(r1.f.f32723b)) {
            setStyle(Paint.Style.FILL);
            return;
        }
        if (!(cVar instanceof r1.g)) {
            throw new m();
        }
        a().e(1);
        r1.g gVar = (r1.g) cVar;
        ((Paint) a().f28604b).setStrokeWidth(gVar.f32724b);
        ((Paint) a().f28604b).setStrokeMiter(gVar.f32725c);
        l7.d dVarA = a();
        int i4 = gVar.f32727e;
        ((Paint) dVarA.f28604b).setStrokeJoin(i4 == 0 ? Paint.Join.MITER : i4 == 2 ? Paint.Join.BEVEL : i4 == 1 ? Paint.Join.ROUND : Paint.Join.MITER);
        l7.d dVarA2 = a();
        int i10 = gVar.f32726d;
        ((Paint) dVarA2.f28604b).setStrokeCap(i10 == 2 ? Paint.Cap.SQUARE : i10 == 1 ? Paint.Cap.ROUND : i10 == 0 ? Paint.Cap.BUTT : Paint.Cap.BUTT);
        ((Paint) a().f28604b).setPathEffect(null);
    }

    public final void f(i0 i0Var) {
        if (i0Var == null || nk.k.a(this.f37854d, i0Var)) {
            return;
        }
        this.f37854d = i0Var;
        if (i0Var.equals(i0.f30982d)) {
            clearShadowLayer();
            return;
        }
        i0 i0Var2 = this.f37854d;
        float f10 = i0Var2.f30985c;
        if (f10 == 0.0f) {
            f10 = Float.MIN_VALUE;
        }
        setShadowLayer(f10, Float.intBitsToFloat((int) (i0Var2.f30984b >> 32)), Float.intBitsToFloat((int) (this.f37854d.f30984b & 4294967295L)), z.u(this.f37854d.f30983a));
    }

    public final void g(l lVar) {
        if (lVar == null || nk.k.a(this.f37852b, lVar)) {
            return;
        }
        this.f37852b = lVar;
        int i4 = lVar.f2725a;
        setUnderlineText((i4 | 1) == i4);
        int i10 = this.f37852b.f2725a;
        setStrikeThruText((i10 | 2) == i10);
    }
}

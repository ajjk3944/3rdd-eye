package r1;

import android.graphics.Paint;
import android.graphics.Shader;
import com.google.android.gms.internal.measurement.z3;
import d.h;
import d3.l;
import nk.k;
import p1.j;
import p1.m;
import p1.s;
import p1.z;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class b implements d {

    /* renamed from: a, reason: collision with root package name */
    public final a f32717a;

    /* renamed from: b, reason: collision with root package name */
    public final i0.f f32718b;

    /* renamed from: c, reason: collision with root package name */
    public l7.d f32719c;

    /* renamed from: d, reason: collision with root package name */
    public l7.d f32720d;

    public b() {
        a aVar = new a();
        aVar.f32713a = c.f32721a;
        aVar.f32714b = l.f21966a;
        aVar.f32715c = e.f32722a;
        aVar.f32716d = 0L;
        this.f32717a = aVar;
        this.f32718b = new i0.f(this);
    }

    public static l7.d b(b bVar, long j, c cVar, int i4) {
        l7.d dVarF = bVar.f(cVar);
        Paint paint = (Paint) dVarF.f28604b;
        if (!s.c(z.b(paint.getColor()), j)) {
            dVarF.c(j);
        }
        if (((Shader) dVarF.f28605c) != null) {
            dVarF.f28605c = null;
            paint.setShader(null);
        }
        if (!k.a((m) dVarF.f28606d, null)) {
            dVarF.d(null);
        }
        if (dVarF.f28603a != i4) {
            dVarF.b(i4);
        }
        if (paint.isFilterBitmap()) {
            return dVarF;
        }
        paint.setFilterBitmap(true);
        return dVarF;
    }

    @Override // r1.d
    public final void A(p1.g gVar, long j, long j8, long j9, float f10, m mVar, int i4) {
        this.f32717a.f32715c.b(gVar, j, j8, j9, d(null, f.f32723b, f10, mVar, 3, i4));
    }

    @Override // d3.c
    public final float C(int i4) {
        return i4 / a();
    }

    @Override // d3.c
    public final float D(float f10) {
        return f10 / a();
    }

    @Override // d3.c
    public final float F() {
        return this.f32717a.f32713a.F();
    }

    @Override // d3.c
    public final float I(float f10) {
        return a() * f10;
    }

    @Override // r1.d
    public final i0.f M() {
        return this.f32718b;
    }

    @Override // d3.c
    public final /* synthetic */ int Q(float f10) {
        return h.i(this, f10);
    }

    @Override // d3.c
    public final /* synthetic */ long T(long j) {
        return h.m(j, this);
    }

    @Override // d3.c
    public final /* synthetic */ float W(long j) {
        return h.l(j, this);
    }

    @Override // d3.c
    public final float a() {
        return this.f32717a.f32713a.a();
    }

    @Override // r1.d
    public final long c() {
        return this.f32718b.E();
    }

    public final l7.d d(z zVar, c cVar, float f10, m mVar, int i4, int i10) {
        l7.d dVarF = f(cVar);
        Paint paint = (Paint) dVarF.f28604b;
        if (zVar != null) {
            zVar.g(f10, this.f32718b.E(), dVarF);
        } else {
            if (((Shader) dVarF.f28605c) != null) {
                dVarF.f28605c = null;
                paint.setShader(null);
            }
            long jB = z.b(paint.getColor());
            long j = s.f31013b;
            if (!s.c(jB, j)) {
                dVarF.c(j);
            }
            if (paint.getAlpha() / 255.0f != f10) {
                dVarF.a(f10);
            }
        }
        if (!k.a((m) dVarF.f28606d, mVar)) {
            dVarF.d(mVar);
        }
        if (dVarF.f28603a != i4) {
            dVarF.b(i4);
        }
        if (paint.isFilterBitmap() == i10) {
            return dVarF;
        }
        paint.setFilterBitmap(true ^ (i10 == 0));
        return dVarF;
    }

    public final long e() {
        return z3.j(this.f32718b.E());
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final l7.d f(r1.c r10) {
        /*
            r9 = this;
            r1.f r0 = r1.f.f32723b
            boolean r0 = nk.k.a(r10, r0)
            r1 = 0
            if (r0 == 0) goto L17
            l7.d r10 = r9.f32719c
            if (r10 != 0) goto L16
            l7.d r10 = p1.z.f()
            r10.e(r1)
            r9.f32719c = r10
        L16:
            return r10
        L17:
            boolean r0 = r10 instanceof r1.g
            if (r0 == 0) goto Lb6
            l7.d r0 = r9.f32720d
            r2 = 1
            if (r0 != 0) goto L29
            l7.d r0 = p1.z.f()
            r0.e(r2)
            r9.f32720d = r0
        L29:
            java.lang.Object r3 = r0.f28604b
            android.graphics.Paint r3 = (android.graphics.Paint) r3
            float r4 = r3.getStrokeWidth()
            r1.g r10 = (r1.g) r10
            float r5 = r10.f32724b
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 != 0) goto L3a
            goto L3d
        L3a:
            r3.setStrokeWidth(r5)
        L3d:
            android.graphics.Paint$Cap r4 = r3.getStrokeCap()
            r5 = -1
            if (r4 != 0) goto L46
            r4 = r5
            goto L4e
        L46:
            int[] r6 = p1.i.f30980a
            int r4 = r4.ordinal()
            r4 = r6[r4]
        L4e:
            r6 = 3
            r7 = 2
            if (r4 == r2) goto L5b
            if (r4 == r7) goto L59
            if (r4 == r6) goto L57
            goto L5b
        L57:
            r4 = r7
            goto L5c
        L59:
            r4 = r2
            goto L5c
        L5b:
            r4 = r1
        L5c:
            int r8 = r10.f32726d
            if (r4 != r8) goto L61
            goto L75
        L61:
            if (r8 != r7) goto L66
            android.graphics.Paint$Cap r4 = android.graphics.Paint.Cap.SQUARE
            goto L72
        L66:
            if (r8 != r2) goto L6b
            android.graphics.Paint$Cap r4 = android.graphics.Paint.Cap.ROUND
            goto L72
        L6b:
            if (r8 != 0) goto L70
            android.graphics.Paint$Cap r4 = android.graphics.Paint.Cap.BUTT
            goto L72
        L70:
            android.graphics.Paint$Cap r4 = android.graphics.Paint.Cap.BUTT
        L72:
            r3.setStrokeCap(r4)
        L75:
            float r4 = r3.getStrokeMiter()
            float r8 = r10.f32725c
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 != 0) goto L80
            goto L83
        L80:
            r3.setStrokeMiter(r8)
        L83:
            android.graphics.Paint$Join r4 = r3.getStrokeJoin()
            if (r4 != 0) goto L8a
            goto L92
        L8a:
            int[] r5 = p1.i.f30981b
            int r4 = r4.ordinal()
            r5 = r5[r4]
        L92:
            if (r5 == r2) goto L9c
            if (r5 == r7) goto L9b
            if (r5 == r6) goto L99
            goto L9c
        L99:
            r1 = r2
            goto L9c
        L9b:
            r1 = r7
        L9c:
            int r10 = r10.f32727e
            if (r1 != r10) goto La1
            return r0
        La1:
            if (r10 != 0) goto La6
            android.graphics.Paint$Join r10 = android.graphics.Paint.Join.MITER
            goto Lb2
        La6:
            if (r10 != r7) goto Lab
            android.graphics.Paint$Join r10 = android.graphics.Paint.Join.BEVEL
            goto Lb2
        Lab:
            if (r10 != r2) goto Lb0
            android.graphics.Paint$Join r10 = android.graphics.Paint.Join.ROUND
            goto Lb2
        Lb0:
            android.graphics.Paint$Join r10 = android.graphics.Paint.Join.MITER
        Lb2:
            r3.setStrokeJoin(r10)
            return r0
        Lb6:
            ac.m r10 = new ac.m
            r10.<init>()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: r1.b.f(r1.c):l7.d");
    }

    @Override // r1.d
    public final l getLayoutDirection() {
        return this.f32717a.f32714b;
    }

    @Override // r1.d
    public final void k(long j, long j8, long j9, c cVar, int i4) {
        int i10 = (int) (j8 >> 32);
        int i11 = (int) (j8 & 4294967295L);
        this.f32717a.f32715c.m(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11), Float.intBitsToFloat(i10) + Float.intBitsToFloat((int) (j9 >> 32)), Float.intBitsToFloat((int) (j9 & 4294967295L)) + Float.intBitsToFloat(i11), b(this, j, cVar, i4));
    }

    @Override // d3.c
    public final /* synthetic */ float o(long j) {
        return h.k(j, this);
    }

    @Override // r1.d
    public final void s(j jVar, z zVar, float f10, c cVar, int i4) {
        this.f32717a.f32715c.o(jVar, d(zVar, cVar, f10, null, i4, 1));
    }

    @Override // d3.c
    public final long x(float f10) {
        return h.n(this, D(f10));
    }
}

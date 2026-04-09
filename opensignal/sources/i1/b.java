package i1;

import android.graphics.Paint;
import android.graphics.Shader;
import br.l;
import g1.f0;
import g1.m;
import g1.r;
import t2.i;
import yb.k;

/* loaded from: classes.dex */
public final class b implements d {

    /* renamed from: b, reason: collision with root package name */
    public final a f11140b;

    /* renamed from: c, reason: collision with root package name */
    public final bm.d f11141c;

    /* renamed from: d, reason: collision with root package name */
    public k f11142d;

    /* renamed from: e, reason: collision with root package name */
    public k f11143e;

    public b() {
        i iVar = i.Ltr;
        a aVar = new a();
        aVar.f11136a = c.f11144a;
        aVar.f11137b = iVar;
        aVar.f11138c = e.f11145a;
        aVar.f11139d = 0L;
        this.f11140b = aVar;
        this.f11141c = new bm.d(this);
    }

    public static k a(b bVar, long j, c cVar, float f10, int i10) {
        k kVarC = bVar.c(cVar);
        Paint paint = (Paint) kVarC.f26241b;
        if (f10 != 1.0f) {
            j = r.b(j, r.d(j) * f10);
        }
        if (!r.c(f0.b(paint.getColor()), j)) {
            kVarC.d(j);
        }
        if (((Shader) kVarC.f26242c) != null) {
            kVarC.f26242c = null;
            paint.setShader(null);
        }
        if (!l.a((m) kVarC.f26243d, null)) {
            kVarC.e(null);
        }
        if (kVarC.f26240a != i10) {
            kVarC.c(i10);
        }
        if (paint.isFilterBitmap()) {
            return kVarC;
        }
        paint.setFilterBitmap(true);
        return kVarC;
    }

    @Override // i1.d
    public final bm.d A() {
        return this.f11141c;
    }

    public final k b(f0 f0Var, c cVar, float f10, m mVar, int i10, int i11) {
        k kVarC = c(cVar);
        Paint paint = (Paint) kVarC.f26241b;
        if (f0Var != null) {
            f0Var.f(f10, C(), kVarC);
        } else {
            if (((Shader) kVarC.f26242c) != null) {
                kVarC.f26242c = null;
                paint.setShader(null);
            }
            long jB = f0.b(paint.getColor());
            long j = r.f9264b;
            if (!r.c(jB, j)) {
                kVarC.d(j);
            }
            if (paint.getAlpha() / 255.0f != f10) {
                kVarC.b(f10);
            }
        }
        if (!l.a((m) kVarC.f26243d, mVar)) {
            kVarC.e(mVar);
        }
        if (kVarC.f26240a != i10) {
            kVarC.c(i10);
        }
        if (paint.isFilterBitmap() == i11) {
            return kVarC;
        }
        paint.setFilterBitmap(true ^ (i11 == 0));
        return kVarC;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final yb.k c(i1.c r10) {
        /*
            r9 = this;
            i1.f r0 = i1.f.f11146b
            boolean r0 = br.l.a(r10, r0)
            r1 = 0
            if (r0 == 0) goto L17
            yb.k r10 = r9.f11142d
            if (r10 != 0) goto L16
            yb.k r10 = g1.f0.e()
            r10.f(r1)
            r9.f11142d = r10
        L16:
            return r10
        L17:
            boolean r0 = r10 instanceof i1.g
            if (r0 == 0) goto Lb6
            yb.k r0 = r9.f11143e
            r2 = 1
            if (r0 != 0) goto L29
            yb.k r0 = g1.f0.e()
            r0.f(r2)
            r9.f11143e = r0
        L29:
            java.lang.Object r3 = r0.f26241b
            android.graphics.Paint r3 = (android.graphics.Paint) r3
            float r4 = r3.getStrokeWidth()
            i1.g r10 = (i1.g) r10
            float r5 = r10.f11147b
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
            int[] r6 = g1.h.f9232a
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
            int r8 = r10.f11149d
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
            float r8 = r10.f11148c
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
            int[] r5 = g1.h.f9233b
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
            int r10 = r10.f11150e
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
            bf.n r10 = new bf.n
            r10.<init>()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: i1.b.c(i1.c):yb.k");
    }

    @Override // t2.c
    public final float getDensity() {
        return this.f11140b.f11136a.getDensity();
    }

    @Override // i1.d
    public final i getLayoutDirection() {
        return this.f11140b.f11137b;
    }

    @Override // i1.d
    public final void k(g1.i iVar, f0 f0Var, float f10, c cVar, int i10) {
        this.f11140b.f11138c.d(iVar, b(f0Var, cVar, f10, null, i10, 1));
    }

    @Override // i1.d
    public final void m(long j, long j7, long j10, float f10, c cVar, int i10) {
        int i11 = (int) (j7 >> 32);
        int i12 = (int) (j7 & 4294967295L);
        this.f11140b.f11138c.f(Float.intBitsToFloat(i11), Float.intBitsToFloat(i12), Float.intBitsToFloat((int) (j10 >> 32)) + Float.intBitsToFloat(i11), Float.intBitsToFloat((int) (4294967295L & j10)) + Float.intBitsToFloat(i12), a(this, j, cVar, f10, i10));
    }

    @Override // i1.d
    public final void p(g1.g gVar, long j, long j7, long j10, float f10, m mVar, int i10) {
        this.f11140b.f11138c.e(gVar, j, j7, j10, b(null, f.f11146b, f10, mVar, 3, i10));
    }

    @Override // t2.c
    public final float y() {
        return this.f11140b.f11136a.y();
    }
}

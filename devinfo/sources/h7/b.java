package h7;

import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import f7.b0;
import f7.x;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class b implements i7.a, l, f {

    /* renamed from: e, reason: collision with root package name */
    public final x f24892e;

    /* renamed from: f, reason: collision with root package name */
    public final n7.a f24893f;

    /* renamed from: h, reason: collision with root package name */
    public final float[] f24894h;

    /* renamed from: i, reason: collision with root package name */
    public final g7.a f24895i;
    public final i7.i j;

    /* renamed from: k, reason: collision with root package name */
    public final i7.f f24896k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f24897l;

    /* renamed from: m, reason: collision with root package name */
    public final i7.i f24898m;

    /* renamed from: n, reason: collision with root package name */
    public i7.s f24899n;

    /* renamed from: o, reason: collision with root package name */
    public i7.e f24900o;

    /* renamed from: p, reason: collision with root package name */
    public float f24901p;

    /* renamed from: a, reason: collision with root package name */
    public final PathMeasure f24888a = new PathMeasure();

    /* renamed from: b, reason: collision with root package name */
    public final Path f24889b = new Path();

    /* renamed from: c, reason: collision with root package name */
    public final Path f24890c = new Path();

    /* renamed from: d, reason: collision with root package name */
    public final RectF f24891d = new RectF();
    public final ArrayList g = new ArrayList();

    public b(x xVar, n7.a aVar, Paint.Cap cap, Paint.Join join, float f10, l7.a aVar2, l7.b bVar, ArrayList arrayList, l7.b bVar2) {
        g7.a aVar3 = new g7.a(1, 0);
        this.f24895i = aVar3;
        this.f24901p = 0.0f;
        this.f24892e = xVar;
        this.f24893f = aVar;
        aVar3.setStyle(Paint.Style.STROKE);
        aVar3.setStrokeCap(cap);
        aVar3.setStrokeJoin(join);
        aVar3.setStrokeMiter(f10);
        this.f24896k = (i7.f) aVar2.g();
        this.j = bVar.g();
        if (bVar2 == null) {
            this.f24898m = null;
        } else {
            this.f24898m = bVar2.g();
        }
        this.f24897l = new ArrayList(arrayList.size());
        this.f24894h = new float[arrayList.size()];
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            this.f24897l.add(((l7.b) arrayList.get(i4)).g());
        }
        aVar.e(this.f24896k);
        aVar.e(this.j);
        for (int i10 = 0; i10 < this.f24897l.size(); i10++) {
            aVar.e((i7.e) this.f24897l.get(i10));
        }
        i7.i iVar = this.f24898m;
        if (iVar != null) {
            aVar.e(iVar);
        }
        this.f24896k.a(this);
        this.j.a(this);
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            ((i7.e) this.f24897l.get(i11)).a(this);
        }
        i7.i iVar2 = this.f24898m;
        if (iVar2 != null) {
            iVar2.a(this);
        }
        if (aVar.l() != null) {
            i7.i iVarG = ((l7.b) aVar.l().f28426b).g();
            this.f24900o = iVarG;
            iVarG.a(this);
            aVar.e(this.f24900o);
        }
    }

    @Override // i7.a
    public final void a() {
        this.f24892e.invalidateSelf();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0050  */
    @Override // h7.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(java.util.List r8, java.util.List r9) {
        /*
            r7 = this;
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            int r0 = r8.size()
            int r0 = r0 + (-1)
            r1 = 0
            r2 = r1
        La:
            r3 = 2
            if (r0 < 0) goto L21
            java.lang.Object r4 = r8.get(r0)
            h7.d r4 = (h7.d) r4
            boolean r5 = r4 instanceof h7.u
            if (r5 == 0) goto L1e
            h7.u r4 = (h7.u) r4
            int r5 = r4.f25012c
            if (r5 != r3) goto L1e
            r2 = r4
        L1e:
            int r0 = r0 + (-1)
            goto La
        L21:
            if (r2 == 0) goto L26
            r2.e(r7)
        L26:
            int r8 = r9.size()
            int r8 = r8 + (-1)
        L2c:
            java.util.ArrayList r0 = r7.g
            if (r8 < 0) goto L65
            java.lang.Object r4 = r9.get(r8)
            h7.d r4 = (h7.d) r4
            boolean r5 = r4 instanceof h7.u
            if (r5 == 0) goto L50
            r5 = r4
            h7.u r5 = (h7.u) r5
            int r6 = r5.f25012c
            if (r6 != r3) goto L50
            if (r1 == 0) goto L46
            r0.add(r1)
        L46:
            h7.a r0 = new h7.a
            r0.<init>(r5)
            r5.e(r7)
            r1 = r0
            goto L62
        L50:
            boolean r0 = r4 instanceof h7.n
            if (r0 == 0) goto L62
            if (r1 != 0) goto L5b
            h7.a r1 = new h7.a
            r1.<init>(r2)
        L5b:
            java.util.ArrayList r0 = r1.f24886a
            h7.n r4 = (h7.n) r4
            r0.add(r4)
        L62:
            int r8 = r8 + (-1)
            goto L2c
        L65:
            if (r1 == 0) goto L6a
            r0.add(r1)
        L6a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h7.b.c(java.util.List, java.util.List):void");
    }

    @Override // h7.f
    public final void d(RectF rectF, Matrix matrix, boolean z3) {
        Path path = this.f24889b;
        path.reset();
        int i4 = 0;
        while (true) {
            ArrayList arrayList = this.g;
            if (i4 >= arrayList.size()) {
                RectF rectF2 = this.f24891d;
                path.computeBounds(rectF2, false);
                float fL = this.j.l() / 2.0f;
                rectF2.set(rectF2.left - fL, rectF2.top - fL, rectF2.right + fL, rectF2.bottom + fL);
                rectF.set(rectF2);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            }
            a aVar = (a) arrayList.get(i4);
            for (int i10 = 0; i10 < aVar.f24886a.size(); i10++) {
                path.addPath(((n) aVar.f24886a.get(i10)).b(), matrix);
            }
            i4++;
        }
    }

    @Override // k7.f
    public void f(Object obj, km.o oVar) {
        PointF pointF = b0.f23692a;
        if (obj == 4) {
            this.f24896k.j(oVar);
            return;
        }
        if (obj == b0.f23706q) {
            this.j.j(oVar);
            return;
        }
        ColorFilter colorFilter = b0.I;
        n7.a aVar = this.f24893f;
        if (obj == colorFilter) {
            i7.s sVar = this.f24899n;
            if (sVar != null) {
                aVar.o(sVar);
            }
            i7.s sVar2 = new i7.s(null, oVar);
            this.f24899n = sVar2;
            sVar2.a(this);
            aVar.e(this.f24899n);
            return;
        }
        if (obj == b0.f23696e) {
            i7.e eVar = this.f24900o;
            if (eVar != null) {
                eVar.j(oVar);
                return;
            }
            i7.s sVar3 = new i7.s(null, oVar);
            this.f24900o = sVar3;
            sVar3.a(this);
            aVar.e(this.f24900o);
        }
    }

    @Override // k7.f
    public final void g(k7.e eVar, int i4, ArrayList arrayList, k7.e eVar2) {
        r7.h.g(eVar, i4, arrayList, eVar2, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x01f0  */
    @Override // h7.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void h(android.graphics.Canvas r21, android.graphics.Matrix r22, int r23, r7.b r24) {
        /*
            Method dump skipped, instructions count: 601
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h7.b.h(android.graphics.Canvas, android.graphics.Matrix, int, r7.b):void");
    }
}

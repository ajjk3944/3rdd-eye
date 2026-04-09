package a9;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import r8.d0;
import r8.v;
import u8.p;
import u8.q;

/* loaded from: classes.dex */
public abstract class b implements t8.e, u8.a, x8.g {
    public float A;
    public BlurMaskFilter B;
    public l C;

    /* renamed from: a, reason: collision with root package name */
    public final Path f223a = new Path();

    /* renamed from: b, reason: collision with root package name */
    public final Matrix f224b = new Matrix();

    /* renamed from: c, reason: collision with root package name */
    public final Matrix f225c = new Matrix();

    /* renamed from: d, reason: collision with root package name */
    public final l f226d = new l(1, 2);

    /* renamed from: e, reason: collision with root package name */
    public final l f227e;

    /* renamed from: f, reason: collision with root package name */
    public final l f228f;

    /* renamed from: g, reason: collision with root package name */
    public final l f229g;

    /* renamed from: h, reason: collision with root package name */
    public final l f230h;

    /* renamed from: i, reason: collision with root package name */
    public final RectF f231i;
    public final RectF j;
    public final RectF k;

    /* renamed from: l, reason: collision with root package name */
    public final RectF f232l;

    /* renamed from: m, reason: collision with root package name */
    public final RectF f233m;

    /* renamed from: n, reason: collision with root package name */
    public final Matrix f234n;

    /* renamed from: o, reason: collision with root package name */
    public final v f235o;

    /* renamed from: p, reason: collision with root package name */
    public final h f236p;

    /* renamed from: q, reason: collision with root package name */
    public final qm.c f237q;

    /* renamed from: r, reason: collision with root package name */
    public final u8.h f238r;

    /* renamed from: s, reason: collision with root package name */
    public b f239s;

    /* renamed from: t, reason: collision with root package name */
    public b f240t;

    /* renamed from: u, reason: collision with root package name */
    public List f241u;

    /* renamed from: v, reason: collision with root package name */
    public final ArrayList f242v;

    /* renamed from: w, reason: collision with root package name */
    public final q f243w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f244x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f245y;

    /* renamed from: z, reason: collision with root package name */
    public l f246z;

    public b(v vVar, h hVar) {
        PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
        this.f227e = new l(mode);
        PorterDuff.Mode mode2 = PorterDuff.Mode.DST_OUT;
        this.f228f = new l(mode2);
        l lVar = new l(1, 2);
        this.f229g = lVar;
        PorterDuff.Mode mode3 = PorterDuff.Mode.CLEAR;
        l lVar2 = new l();
        lVar2.setXfermode(new PorterDuffXfermode(mode3));
        this.f230h = lVar2;
        this.f231i = new RectF();
        this.j = new RectF();
        this.k = new RectF();
        this.f232l = new RectF();
        this.f233m = new RectF();
        this.f234n = new Matrix();
        this.f242v = new ArrayList();
        this.f244x = true;
        this.A = 0.0f;
        this.f235o = vVar;
        this.f236p = hVar;
        List list = hVar.f255h;
        if (hVar.f266u == g.INVERT) {
            lVar.setXfermode(new PorterDuffXfermode(mode2));
        } else {
            lVar.setXfermode(new PorterDuffXfermode(mode));
        }
        y8.d dVar = hVar.f256i;
        dVar.getClass();
        q qVar = new q(dVar);
        this.f243w = qVar;
        qVar.b(this);
        if (list != null && !list.isEmpty()) {
            qm.c cVar = new qm.c(list);
            this.f237q = cVar;
            Iterator it = ((ArrayList) cVar.f20918d).iterator();
            while (it.hasNext()) {
                ((u8.d) it.next()).a(this);
            }
            Iterator it2 = ((ArrayList) this.f237q.f20919g).iterator();
            while (it2.hasNext()) {
                u8.d dVar2 = (u8.d) it2.next();
                e(dVar2);
                dVar2.a(this);
            }
        }
        h hVar2 = this.f236p;
        if (hVar2.f265t.isEmpty()) {
            if (true != this.f244x) {
                this.f244x = true;
                this.f235o.invalidateSelf();
                return;
            }
            return;
        }
        u8.h hVar3 = new u8.h(hVar2.f265t);
        this.f238r = hVar3;
        hVar3.f23448b = true;
        hVar3.a(new p(3, this));
        boolean z10 = ((Float) this.f238r.f()).floatValue() == 1.0f;
        if (z10 != this.f244x) {
            this.f244x = z10;
            this.f235o.invalidateSelf();
        }
        e(this.f238r);
    }

    @Override // u8.a
    public final void a() {
        this.f235o.invalidateSelf();
    }

    @Override // x8.g
    public final void c(x8.f fVar, int i10, ArrayList arrayList, x8.f fVar2) {
        b bVar = this.f239s;
        h hVar = this.f236p;
        if (bVar != null) {
            String str = bVar.f236p.f250c;
            x8.f fVar3 = new x8.f(fVar2);
            fVar3.f25092a.add(str);
            if (fVar.a(i10, this.f239s.f236p.f250c)) {
                b bVar2 = this.f239s;
                x8.f fVar4 = new x8.f(fVar3);
                fVar4.f25093b = bVar2;
                arrayList.add(fVar4);
            }
            if (fVar.c(i10, this.f239s.f236p.f250c) && fVar.d(i10, hVar.f250c)) {
                this.f239s.p(fVar, fVar.b(i10, this.f239s.f236p.f250c) + i10, arrayList, fVar3);
            }
        }
        String str2 = hVar.f250c;
        String str3 = hVar.f250c;
        if (fVar.c(i10, str2)) {
            if (!"__container".equals(str3)) {
                x8.f fVar5 = new x8.f(fVar2);
                fVar5.f25092a.add(str3);
                if (fVar.a(i10, str3)) {
                    x8.f fVar6 = new x8.f(fVar5);
                    fVar6.f25093b = this;
                    arrayList.add(fVar6);
                }
                fVar2 = fVar5;
            }
            if (fVar.d(i10, str3)) {
                p(fVar, fVar.b(i10, str3) + i10, arrayList, fVar2);
            }
        }
    }

    @Override // t8.e
    public void d(RectF rectF, Matrix matrix, boolean z10) {
        this.f231i.set(0.0f, 0.0f, 0.0f, 0.0f);
        i();
        Matrix matrix2 = this.f234n;
        matrix2.set(matrix);
        if (z10) {
            List list = this.f241u;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    matrix2.preConcat(((b) this.f241u.get(size)).f243w.e());
                }
            } else {
                b bVar = this.f240t;
                if (bVar != null) {
                    matrix2.preConcat(bVar.f243w.e());
                }
            }
        }
        matrix2.preConcat(this.f243w.e());
    }

    public final void e(u8.d dVar) {
        if (dVar == null) {
            return;
        }
        this.f242v.add(dVar);
    }

    @Override // x8.g
    public void f(bm.e eVar, Object obj) {
        this.f243w.c(eVar, obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01dd  */
    @Override // t8.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(android.graphics.Canvas r20, android.graphics.Matrix r21, int r22, e9.a r23) {
        /*
            Method dump skipped, instructions count: 932
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a9.b.h(android.graphics.Canvas, android.graphics.Matrix, int, e9.a):void");
    }

    public final void i() {
        if (this.f241u != null) {
            return;
        }
        if (this.f240t == null) {
            this.f241u = Collections.EMPTY_LIST;
            return;
        }
        this.f241u = new ArrayList();
        for (b bVar = this.f240t; bVar != null; bVar = bVar.f240t) {
            this.f241u.add(bVar);
        }
    }

    public final void j(Canvas canvas) {
        r8.a aVar = r8.d.f21312a;
        RectF rectF = this.f231i;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.f230h);
    }

    public abstract void k(Canvas canvas, Matrix matrix, int i10, e9.a aVar);

    public z7.b l() {
        return this.f236p.f268w;
    }

    public final boolean m() {
        qm.c cVar = this.f237q;
        return (cVar == null || ((ArrayList) cVar.f20918d).isEmpty()) ? false : true;
    }

    public final void n() {
        d0 d0Var = this.f235o.f21375a.f21323a;
        String str = this.f236p.f250c;
        HashMap map = d0Var.f21318c;
        if (d0Var.f21316a) {
            e9.f fVar = (e9.f) map.get(str);
            if (fVar == null) {
                fVar = new e9.f();
                map.put(str, fVar);
            }
            int i10 = fVar.f7993a + 1;
            fVar.f7993a = i10;
            if (i10 == Integer.MAX_VALUE) {
                fVar.f7993a = i10 / 2;
            }
            if (str.equals("__container")) {
                u.f fVar2 = d0Var.f21317b;
                fVar2.getClass();
                u.a aVar = new u.a(fVar2);
                if (aVar.hasNext()) {
                    aVar.next().getClass();
                    throw new ClassCastException();
                }
            }
        }
    }

    public final void o(u8.d dVar) {
        this.f242v.remove(dVar);
    }

    public void q(boolean z10) {
        if (z10 && this.f246z == null) {
            this.f246z = new l();
        }
        this.f245y = z10;
    }

    public void r(float f10) {
        r8.a aVar = r8.d.f21312a;
        q qVar = this.f243w;
        u8.d dVar = qVar.f23496p;
        if (dVar != null) {
            dVar.j(f10);
        }
        u8.d dVar2 = qVar.f23502v;
        if (dVar2 != null) {
            dVar2.j(f10);
        }
        u8.d dVar3 = qVar.f23503w;
        if (dVar3 != null) {
            dVar3.j(f10);
        }
        u8.d dVar4 = qVar.f23492l;
        if (dVar4 != null) {
            dVar4.j(f10);
        }
        u8.d dVar5 = qVar.f23493m;
        if (dVar5 != null) {
            dVar5.j(f10);
        }
        u8.d dVar6 = qVar.f23494n;
        if (dVar6 != null) {
            dVar6.j(f10);
        }
        u8.d dVar7 = qVar.f23495o;
        if (dVar7 != null) {
            dVar7.j(f10);
        }
        u8.h hVar = qVar.f23497q;
        if (hVar != null) {
            hVar.j(f10);
        }
        u8.h hVar2 = qVar.f23498r;
        if (hVar2 != null) {
            hVar2.j(f10);
        }
        u8.h hVar3 = qVar.f23499s;
        if (hVar3 != null) {
            hVar3.j(f10);
        }
        u8.h hVar4 = qVar.f23500t;
        if (hVar4 != null) {
            hVar4.j(f10);
        }
        u8.h hVar5 = qVar.f23501u;
        if (hVar5 != null) {
            hVar5.j(f10);
        }
        int i10 = 0;
        qm.c cVar = this.f237q;
        if (cVar != null) {
            ArrayList arrayList = (ArrayList) cVar.f20918d;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((u8.d) arrayList.get(i11)).j(f10);
            }
            r8.a aVar2 = r8.d.f21312a;
        }
        u8.h hVar6 = this.f238r;
        if (hVar6 != null) {
            hVar6.j(f10);
        }
        b bVar = this.f239s;
        if (bVar != null) {
            bVar.r(f10);
        }
        while (true) {
            ArrayList arrayList2 = this.f242v;
            if (i10 >= arrayList2.size()) {
                r8.a aVar3 = r8.d.f21312a;
                return;
            } else {
                ((u8.d) arrayList2.get(i10)).j(f10);
                i10++;
            }
        }
    }

    @Override // t8.c
    public final void b(List list, List list2) {
    }

    public void p(x8.f fVar, int i10, ArrayList arrayList, x8.f fVar2) {
    }
}

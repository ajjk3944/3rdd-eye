package n7;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import f7.f0;
import f7.x;
import i7.q;
import i7.r;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import km.o;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class a implements h7.f, i7.a, k7.f {
    public float A;
    public BlurMaskFilter B;
    public g7.a C;

    /* renamed from: a, reason: collision with root package name */
    public final Path f29779a = new Path();

    /* renamed from: b, reason: collision with root package name */
    public final Matrix f29780b = new Matrix();

    /* renamed from: c, reason: collision with root package name */
    public final Matrix f29781c = new Matrix();

    /* renamed from: d, reason: collision with root package name */
    public final g7.a f29782d = new g7.a(1, 0);

    /* renamed from: e, reason: collision with root package name */
    public final g7.a f29783e;

    /* renamed from: f, reason: collision with root package name */
    public final g7.a f29784f;
    public final g7.a g;

    /* renamed from: h, reason: collision with root package name */
    public final g7.a f29785h;

    /* renamed from: i, reason: collision with root package name */
    public final RectF f29786i;
    public final RectF j;

    /* renamed from: k, reason: collision with root package name */
    public final RectF f29787k;

    /* renamed from: l, reason: collision with root package name */
    public final RectF f29788l;

    /* renamed from: m, reason: collision with root package name */
    public final RectF f29789m;

    /* renamed from: n, reason: collision with root package name */
    public final Matrix f29790n;

    /* renamed from: o, reason: collision with root package name */
    public final x f29791o;

    /* renamed from: p, reason: collision with root package name */
    public final d f29792p;

    /* renamed from: q, reason: collision with root package name */
    public final i0.f f29793q;

    /* renamed from: r, reason: collision with root package name */
    public final i7.i f29794r;

    /* renamed from: s, reason: collision with root package name */
    public a f29795s;

    /* renamed from: t, reason: collision with root package name */
    public a f29796t;

    /* renamed from: u, reason: collision with root package name */
    public List f29797u;

    /* renamed from: v, reason: collision with root package name */
    public final ArrayList f29798v;

    /* renamed from: w, reason: collision with root package name */
    public final r f29799w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f29800x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f29801y;

    /* renamed from: z, reason: collision with root package name */
    public g7.a f29802z;

    public a(x xVar, d dVar) {
        PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
        this.f29783e = new g7.a(mode);
        PorterDuff.Mode mode2 = PorterDuff.Mode.DST_OUT;
        this.f29784f = new g7.a(mode2);
        g7.a aVar = new g7.a(1, 0);
        this.g = aVar;
        PorterDuff.Mode mode3 = PorterDuff.Mode.CLEAR;
        g7.a aVar2 = new g7.a();
        aVar2.setXfermode(new PorterDuffXfermode(mode3));
        this.f29785h = aVar2;
        this.f29786i = new RectF();
        this.j = new RectF();
        this.f29787k = new RectF();
        this.f29788l = new RectF();
        this.f29789m = new RectF();
        this.f29790n = new Matrix();
        this.f29798v = new ArrayList();
        this.f29800x = true;
        this.A = 0.0f;
        this.f29791o = xVar;
        this.f29792p = dVar;
        List list = dVar.f29809h;
        if (dVar.f29821u == 3) {
            aVar.setXfermode(new PorterDuffXfermode(mode2));
        } else {
            aVar.setXfermode(new PorterDuffXfermode(mode));
        }
        l7.e eVar = dVar.f29810i;
        eVar.getClass();
        r rVar = new r(eVar);
        this.f29799w = rVar;
        rVar.b(this);
        if (list != null && !list.isEmpty()) {
            i0.f fVar = new i0.f(list);
            this.f29793q = fVar;
            ArrayList arrayList = (ArrayList) fVar.f25416b;
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                ((i7.e) obj).a(this);
            }
            ArrayList arrayList2 = (ArrayList) this.f29793q.f25417c;
            int size2 = arrayList2.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj2 = arrayList2.get(i10);
                i10++;
                i7.e eVar2 = (i7.e) obj2;
                e(eVar2);
                eVar2.a(this);
            }
        }
        d dVar2 = this.f29792p;
        if (dVar2.f29820t.isEmpty()) {
            if (true != this.f29800x) {
                this.f29800x = true;
                this.f29791o.invalidateSelf();
                return;
            }
            return;
        }
        i7.i iVar = new i7.i(dVar2.f29820t);
        this.f29794r = iVar;
        iVar.f25873b = true;
        iVar.a(new q(3, this));
        boolean z3 = ((Float) this.f29794r.e()).floatValue() == 1.0f;
        if (z3 != this.f29800x) {
            this.f29800x = z3;
            this.f29791o.invalidateSelf();
        }
        e(this.f29794r);
    }

    @Override // i7.a
    public final void a() {
        this.f29791o.invalidateSelf();
    }

    @Override // h7.f
    public void d(RectF rectF, Matrix matrix, boolean z3) {
        this.f29786i.set(0.0f, 0.0f, 0.0f, 0.0f);
        i();
        Matrix matrix2 = this.f29790n;
        matrix2.set(matrix);
        if (z3) {
            List list = this.f29797u;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    matrix2.preConcat(((a) this.f29797u.get(size)).f29799w.e());
                }
            } else {
                a aVar = this.f29796t;
                if (aVar != null) {
                    matrix2.preConcat(aVar.f29799w.e());
                }
            }
        }
        matrix2.preConcat(this.f29799w.e());
    }

    public final void e(i7.e eVar) {
        if (eVar == null) {
            return;
        }
        this.f29798v.add(eVar);
    }

    @Override // k7.f
    public void f(Object obj, o oVar) {
        this.f29799w.c(obj, oVar);
    }

    @Override // k7.f
    public final void g(k7.e eVar, int i4, ArrayList arrayList, k7.e eVar2) {
        a aVar = this.f29795s;
        d dVar = this.f29792p;
        if (aVar != null) {
            String str = aVar.f29792p.f29805c;
            k7.e eVar3 = new k7.e(eVar2);
            eVar3.f28062a.add(str);
            if (eVar.a(i4, this.f29795s.f29792p.f29805c)) {
                a aVar2 = this.f29795s;
                k7.e eVar4 = new k7.e(eVar3);
                eVar4.f28063b = aVar2;
                arrayList.add(eVar4);
            }
            if (eVar.c(i4, this.f29795s.f29792p.f29805c) && eVar.d(i4, dVar.f29805c)) {
                this.f29795s.p(eVar, eVar.b(i4, this.f29795s.f29792p.f29805c) + i4, arrayList, eVar3);
            }
        }
        String str2 = dVar.f29805c;
        String str3 = dVar.f29805c;
        if (eVar.c(i4, str2)) {
            if (!"__container".equals(str3)) {
                k7.e eVar5 = new k7.e(eVar2);
                eVar5.f28062a.add(str3);
                if (eVar.a(i4, str3)) {
                    k7.e eVar6 = new k7.e(eVar5);
                    eVar6.f28063b = this;
                    arrayList.add(eVar6);
                }
                eVar2 = eVar5;
            }
            if (eVar.d(i4, str3)) {
                p(eVar, eVar.b(i4, str3) + i4, arrayList, eVar2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0116  */
    @Override // h7.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(android.graphics.Canvas r22, android.graphics.Matrix r23, int r24, r7.b r25) {
        /*
            Method dump skipped, instructions count: 1016
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n7.a.h(android.graphics.Canvas, android.graphics.Matrix, int, r7.b):void");
    }

    public final void i() {
        if (this.f29797u != null) {
            return;
        }
        if (this.f29796t == null) {
            this.f29797u = Collections.EMPTY_LIST;
            return;
        }
        this.f29797u = new ArrayList();
        for (a aVar = this.f29796t; aVar != null; aVar = aVar.f29796t) {
            this.f29797u.add(aVar);
        }
    }

    public final void j(Canvas canvas) {
        RectF rectF = this.f29786i;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.f29785h);
    }

    public abstract void k(Canvas canvas, Matrix matrix, int i4, r7.b bVar);

    public km.i l() {
        return this.f29792p.f29823w;
    }

    public final boolean m() {
        i0.f fVar = this.f29793q;
        return (fVar == null || ((ArrayList) fVar.f25416b).isEmpty()) ? false : true;
    }

    public final void n() {
        f0 f0Var = this.f29791o.f23801a.f23750a;
        String str = this.f29792p.f29805c;
        HashMap map = f0Var.f23730c;
        if (f0Var.f23728a) {
            r7.g gVar = (r7.g) map.get(str);
            if (gVar == null) {
                gVar = new r7.g();
                map.put(str, gVar);
            }
            int i4 = gVar.f32866a + 1;
            gVar.f32866a = i4;
            if (i4 == Integer.MAX_VALUE) {
                gVar.f32866a = i4 / 2;
            }
            if (str.equals("__container")) {
                x.f fVar = f0Var.f23729b;
                fVar.getClass();
                x.a aVar = new x.a(fVar);
                if (aVar.hasNext()) {
                    aVar.next().getClass();
                    throw new ClassCastException();
                }
            }
        }
    }

    public final void o(i7.e eVar) {
        this.f29798v.remove(eVar);
    }

    public void q(boolean z3) {
        if (z3 && this.f29802z == null) {
            this.f29802z = new g7.a();
        }
        this.f29801y = z3;
    }

    public void r(float f10) {
        r rVar = this.f29799w;
        i7.e eVar = rVar.f25922p;
        if (eVar != null) {
            eVar.i(f10);
        }
        i7.e eVar2 = rVar.f25928v;
        if (eVar2 != null) {
            eVar2.i(f10);
        }
        i7.e eVar3 = rVar.f25929w;
        if (eVar3 != null) {
            eVar3.i(f10);
        }
        i7.e eVar4 = rVar.f25918l;
        if (eVar4 != null) {
            eVar4.i(f10);
        }
        i7.e eVar5 = rVar.f25919m;
        if (eVar5 != null) {
            eVar5.i(f10);
        }
        i7.e eVar6 = rVar.f25920n;
        if (eVar6 != null) {
            eVar6.i(f10);
        }
        i7.e eVar7 = rVar.f25921o;
        if (eVar7 != null) {
            eVar7.i(f10);
        }
        i7.i iVar = rVar.f25923q;
        if (iVar != null) {
            iVar.i(f10);
        }
        i7.i iVar2 = rVar.f25924r;
        if (iVar2 != null) {
            iVar2.i(f10);
        }
        i7.i iVar3 = rVar.f25925s;
        if (iVar3 != null) {
            iVar3.i(f10);
        }
        i7.i iVar4 = rVar.f25926t;
        if (iVar4 != null) {
            iVar4.i(f10);
        }
        i7.i iVar5 = rVar.f25927u;
        if (iVar5 != null) {
            iVar5.i(f10);
        }
        int i4 = 0;
        i0.f fVar = this.f29793q;
        if (fVar != null) {
            ArrayList arrayList = (ArrayList) fVar.f25416b;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((i7.e) arrayList.get(i10)).i(f10);
            }
        }
        i7.i iVar6 = this.f29794r;
        if (iVar6 != null) {
            iVar6.i(f10);
        }
        a aVar = this.f29795s;
        if (aVar != null) {
            aVar.r(f10);
        }
        while (true) {
            ArrayList arrayList2 = this.f29798v;
            if (i4 >= arrayList2.size()) {
                return;
            }
            ((i7.e) arrayList2.get(i4)).i(f10);
            i4++;
        }
    }

    @Override // h7.d
    public final void c(List list, List list2) {
    }

    public void p(k7.e eVar, int i4, ArrayList arrayList, k7.e eVar2) {
    }
}

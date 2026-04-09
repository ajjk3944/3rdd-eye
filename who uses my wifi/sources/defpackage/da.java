package defpackage;

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
import java.util.List;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class da implements bq, x9, u40 {
    public float A;
    public BlurMaskFilter B;
    public d50 C;
    public final Path a = new Path();
    public final Matrix b = new Matrix();
    public final Matrix c = new Matrix();
    public final d50 d = new d50(1, 0);
    public final d50 e;
    public final d50 f;
    public final d50 g;
    public final d50 h;
    public final RectF i;
    public final RectF j;
    public final RectF k;
    public final RectF l;
    public final RectF m;
    public final Matrix n;
    public final i90 o;
    public final f50 p;
    public final xb4 q;
    public final pu r;
    public da s;
    public da t;
    public List u;
    public final ArrayList v;
    public final q21 w;
    public boolean x;
    public boolean y;
    public d50 z;

    public da(i90 i90Var, f50 f50Var) {
        PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
        this.e = new d50(mode);
        PorterDuff.Mode mode2 = PorterDuff.Mode.DST_OUT;
        this.f = new d50(mode2);
        d50 d50Var = new d50(1, 0);
        this.g = d50Var;
        PorterDuff.Mode mode3 = PorterDuff.Mode.CLEAR;
        d50 d50Var2 = new d50();
        d50Var2.setXfermode(new PorterDuffXfermode(mode3));
        this.h = d50Var2;
        this.i = new RectF();
        this.j = new RectF();
        this.k = new RectF();
        this.l = new RectF();
        this.m = new RectF();
        this.n = new Matrix();
        this.v = new ArrayList();
        this.x = true;
        this.A = 0.0f;
        this.o = i90Var;
        this.p = f50Var;
        List list = f50Var.h;
        if (f50Var.u == 3) {
            d50Var.setXfermode(new PorterDuffXfermode(mode2));
        } else {
            d50Var.setXfermode(new PorterDuffXfermode(mode));
        }
        h4 h4Var = f50Var.i;
        h4Var.getClass();
        q21 q21Var = new q21(h4Var);
        this.w = q21Var;
        q21Var.b(this);
        if (list != null && !list.isEmpty()) {
            xb4 xb4Var = new xb4(6, list);
            this.q = xb4Var;
            ArrayList arrayList = (ArrayList) xb4Var.g;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((ba) obj).a(this);
            }
            ArrayList arrayList2 = (ArrayList) this.q.h;
            int size2 = arrayList2.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = arrayList2.get(i2);
                i2++;
                ba baVar = (ba) obj2;
                e(baVar);
                baVar.a(this);
            }
        }
        f50 f50Var2 = this.p;
        if (f50Var2.t.isEmpty()) {
            if (true != this.x) {
                this.x = true;
                this.o.invalidateSelf();
                return;
            }
            return;
        }
        pu puVar = new pu(f50Var2.t);
        this.r = puVar;
        puVar.b = true;
        puVar.a(new x9() { // from class: ca
            @Override // defpackage.x9
            public final void c() {
                da daVar = this.a;
                boolean z = daVar.r.l() == 1.0f;
                if (z != daVar.x) {
                    daVar.x = z;
                    daVar.o.invalidateSelf();
                }
            }
        });
        boolean z = ((Float) this.r.e()).floatValue() == 1.0f;
        if (z != this.x) {
            this.x = z;
            this.o.invalidateSelf();
        }
        e(this.r);
    }

    @Override // defpackage.u40
    public void a(Object obj, vq2 vq2Var) {
        this.w.c(obj, vq2Var);
    }

    @Override // defpackage.bq
    public void b(RectF rectF, Matrix matrix, boolean z) {
        this.i.set(0.0f, 0.0f, 0.0f, 0.0f);
        i();
        Matrix matrix2 = this.n;
        matrix2.set(matrix);
        if (z) {
            List list = this.u;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    matrix2.preConcat(((da) this.u.get(size)).w.e());
                }
            } else {
                da daVar = this.t;
                if (daVar != null) {
                    matrix2.preConcat(daVar.w.e());
                }
            }
        }
        matrix2.preConcat(this.w.e());
    }

    @Override // defpackage.x9
    public final void c() {
        this.o.invalidateSelf();
    }

    public final void e(ba baVar) {
        if (baVar == null) {
            return;
        }
        this.v.add(baVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0116  */
    @Override // defpackage.bq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(android.graphics.Canvas r22, android.graphics.Matrix r23, int r24, defpackage.mq r25) {
        /*
            Method dump skipped, instructions count: 1018
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.da.g(android.graphics.Canvas, android.graphics.Matrix, int, mq):void");
    }

    @Override // defpackage.u40
    public final void h(t40 t40Var, int i, ArrayList arrayList, t40 t40Var2) {
        da daVar = this.s;
        f50 f50Var = this.p;
        if (daVar != null) {
            String str = daVar.p.c;
            t40 t40Var3 = new t40(t40Var2);
            t40Var3.a.add(str);
            if (t40Var.a(this.s.p.c, i)) {
                da daVar2 = this.s;
                t40 t40Var4 = new t40(t40Var3);
                t40Var4.b = daVar2;
                arrayList.add(t40Var4);
            }
            if (t40Var.c(this.s.p.c, i) && t40Var.d(f50Var.c, i)) {
                this.s.p(t40Var, t40Var.b(this.s.p.c, i) + i, arrayList, t40Var3);
            }
        }
        String str2 = f50Var.c;
        String str3 = f50Var.c;
        if (t40Var.c(str2, i)) {
            if (!"__container".equals(str3)) {
                t40 t40Var5 = new t40(t40Var2);
                t40Var5.a.add(str3);
                if (t40Var.a(str3, i)) {
                    t40 t40Var6 = new t40(t40Var5);
                    t40Var6.b = this;
                    arrayList.add(t40Var6);
                }
                t40Var2 = t40Var5;
            }
            if (t40Var.d(str3, i)) {
                p(t40Var, t40Var.b(str3, i) + i, arrayList, t40Var2);
            }
        }
    }

    public final void i() {
        if (this.u != null) {
            return;
        }
        if (this.t == null) {
            this.u = Collections.EMPTY_LIST;
            return;
        }
        this.u = new ArrayList();
        for (da daVar = this.t; daVar != null; daVar = daVar.t) {
            this.u.add(daVar);
        }
    }

    public final void j(Canvas canvas) {
        RectF rectF = this.i;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.h);
    }

    public abstract void k(Canvas canvas, Matrix matrix, int i, mq mqVar);

    public kf3 l() {
        return this.p.w;
    }

    public final boolean m() {
        xb4 xb4Var = this.q;
        return (xb4Var == null || ((ArrayList) xb4Var.g).isEmpty()) ? false : true;
    }

    public final void n() {
        qk0 qk0Var = this.o.f.a;
        String str = this.p.c;
        HashMap map = qk0Var.c;
        if (qk0Var.a) {
            sc0 sc0Var = (sc0) map.get(str);
            if (sc0Var == null) {
                sc0Var = new sc0();
                map.put(str, sc0Var);
            }
            int i = sc0Var.a + 1;
            sc0Var.a = i;
            if (i == Integer.MAX_VALUE) {
                sc0Var.a = i / 2;
            }
            if (str.equals("__container")) {
                u8 u8Var = qk0Var.b;
                u8Var.getClass();
                o8 o8Var = new o8(u8Var);
                if (o8Var.hasNext()) {
                    o8Var.next().getClass();
                    throw new ClassCastException();
                }
            }
        }
    }

    public final void o(ba baVar) {
        this.v.remove(baVar);
    }

    public void q(boolean z) {
        if (z && this.z == null) {
            this.z = new d50();
        }
        this.y = z;
    }

    public void r(float f) {
        q21 q21Var = this.w;
        ba baVar = q21Var.j;
        if (baVar != null) {
            baVar.i(f);
        }
        ba baVar2 = q21Var.m;
        if (baVar2 != null) {
            baVar2.i(f);
        }
        ba baVar3 = q21Var.n;
        if (baVar3 != null) {
            baVar3.i(f);
        }
        ba baVar4 = q21Var.f;
        if (baVar4 != null) {
            baVar4.i(f);
        }
        ba baVar5 = q21Var.g;
        if (baVar5 != null) {
            baVar5.i(f);
        }
        ba baVar6 = q21Var.h;
        if (baVar6 != null) {
            baVar6.i(f);
        }
        ba baVar7 = q21Var.i;
        if (baVar7 != null) {
            baVar7.i(f);
        }
        pu puVar = q21Var.k;
        if (puVar != null) {
            puVar.i(f);
        }
        pu puVar2 = q21Var.l;
        if (puVar2 != null) {
            puVar2.i(f);
        }
        int i = 0;
        xb4 xb4Var = this.q;
        if (xb4Var != null) {
            ArrayList arrayList = (ArrayList) xb4Var.g;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((ba) arrayList.get(i2)).i(f);
            }
        }
        pu puVar3 = this.r;
        if (puVar3 != null) {
            puVar3.i(f);
        }
        da daVar = this.s;
        if (daVar != null) {
            daVar.r(f);
        }
        while (true) {
            ArrayList arrayList2 = this.v;
            if (i >= arrayList2.size()) {
                return;
            }
            ((ba) arrayList2.get(i)).i(f);
            i++;
        }
    }

    @Override // defpackage.vi
    public final void d(List list, List list2) {
    }

    public void p(t40 t40Var, int i, ArrayList arrayList, t40 t40Var2) {
    }
}

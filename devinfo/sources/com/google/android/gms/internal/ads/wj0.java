package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class wj0 implements f90 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f18031a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f18032b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f18033c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f18034d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f18035e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f18036f;
    public final Object g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f18037h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f18038i;
    public final Object j;

    /* renamed from: k, reason: collision with root package name */
    public Object f18039k;

    /* renamed from: l, reason: collision with root package name */
    public Object f18040l;

    public wj0(Context context, wc0 wc0Var, hq0 hq0Var, za.a aVar, wp0 wp0Var, gx gxVar, qz qzVar, qo qoVar, boolean z3, qh0 qh0Var, od0 od0Var, qd0 qd0Var) {
        this.f18032b = context;
        this.f18033c = wc0Var;
        this.f18034d = hq0Var;
        this.f18035e = aVar;
        this.f18036f = wp0Var;
        this.g = gxVar;
        this.f18037h = qzVar;
        this.f18038i = qoVar;
        this.f18031a = z3;
        this.j = qh0Var;
        this.f18039k = od0Var;
        this.f18040l = qd0Var;
    }

    @Override // com.google.android.gms.internal.ads.f90
    public wp0 a() {
        return (wp0) this.f18036f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v5 */
    public void b(ed.o oVar, float[] fArr, float f10, RectF rectF, p6.i iVar, Path path) {
        boolean z3;
        int i4;
        Path path2;
        p6.i iVar2;
        boolean z10;
        ed.d cVar;
        int i10;
        p6.i iVar3 = iVar;
        Path path3 = path;
        Matrix[] matrixArr = (Matrix[]) this.f18034d;
        float[] fArr2 = (float[]) this.f18038i;
        ed.x[] xVarArr = (ed.x[]) this.f18032b;
        Matrix[] matrixArr2 = (Matrix[]) this.f18033c;
        path3.rewind();
        Path path4 = (Path) this.f18036f;
        path4.rewind();
        Path path5 = (Path) this.g;
        path5.rewind();
        path5.addRect(rectF, Path.Direction.CW);
        int i11 = 0;
        while (true) {
            z3 = 0;
            int i12 = 1;
            if (i11 >= 4) {
                break;
            }
            PointF pointF = (PointF) this.f18035e;
            if (fArr == null) {
                cVar = i11 != 1 ? i11 != 2 ? i11 != 3 ? oVar.f23358f : oVar.f23357e : oVar.f23359h : oVar.g;
            } else {
                cVar = new ed.c(fArr[i11]);
                i12 = 1;
            }
            com.google.android.gms.internal.play_billing.m1 m1Var = i11 != i12 ? i11 != 2 ? i11 != 3 ? oVar.f23354b : oVar.f23353a : oVar.f23356d : oVar.f23355c;
            Matrix[] matrixArr3 = matrixArr;
            ed.x xVar = xVarArr[i11];
            m1Var.getClass();
            m1Var.p(xVar, f10, cVar.a(rectF));
            int i13 = i11 + 1;
            float f11 = (i13 % 4) * 90;
            matrixArr2[i11].reset();
            if (i11 == 1) {
                i10 = i13;
                pointF.set(rectF.right, rectF.bottom);
            } else if (i11 == 2) {
                i10 = i13;
                pointF.set(rectF.left, rectF.bottom);
            } else if (i11 != 3) {
                i10 = i13;
                pointF.set(rectF.right, rectF.top);
            } else {
                i10 = i13;
                pointF.set(rectF.left, rectF.top);
            }
            matrixArr2[i11].setTranslate(pointF.x, pointF.y);
            matrixArr2[i11].preRotate(f11);
            ed.x xVar2 = xVarArr[i11];
            fArr2[0] = xVar2.f23383c;
            fArr2[1] = xVar2.f23384d;
            matrixArr2[i11].mapPoints(fArr2);
            matrixArr3[i11].reset();
            matrixArr3[i11].setTranslate(fArr2[0], fArr2[1]);
            matrixArr3[i11].preRotate(f11);
            i11 = i10;
            matrixArr = matrixArr3;
        }
        Matrix[] matrixArr4 = matrixArr;
        char c9 = 1;
        int i14 = 0;
        for (i4 = 4; i14 < i4; i4 = 4) {
            ed.x xVar3 = xVarArr[i14];
            fArr2[z3] = xVar3.f23381a;
            fArr2[c9] = xVar3.f23382b;
            matrixArr2[i14].mapPoints(fArr2);
            if (i14 == 0) {
                path3.moveTo(fArr2[z3], fArr2[c9]);
            } else {
                path3.lineTo(fArr2[z3], fArr2[c9]);
            }
            xVarArr[i14].b(matrixArr2[i14], path3);
            if (iVar3 != null) {
                ed.x xVar4 = xVarArr[i14];
                Matrix matrix = matrixArr2[i14];
                ed.j jVar = (ed.j) iVar3.f31385a;
                BitSet bitSet = jVar.f23319e;
                xVar4.getClass();
                bitSet.set(i14, z3);
                ed.w[] wVarArr = jVar.f23317c;
                xVar4.a(xVar4.f23386f);
                wVarArr[i14] = new ed.q(new ArrayList(xVar4.f23387h), new Matrix(matrix));
            }
            Path path6 = (Path) this.f18039k;
            ed.x xVar5 = (ed.x) this.f18037h;
            int i15 = i14 + 1;
            int i16 = i15 % 4;
            ed.x xVar6 = xVarArr[i14];
            ed.x[] xVarArr2 = xVarArr;
            fArr2[0] = xVar6.f23383c;
            fArr2[1] = xVar6.f23384d;
            matrixArr2[i14].mapPoints(fArr2);
            float[] fArr3 = (float[]) this.j;
            ed.x xVar7 = xVarArr2[i16];
            Matrix[] matrixArr5 = matrixArr2;
            fArr3[0] = xVar7.f23381a;
            fArr3[1] = xVar7.f23382b;
            matrixArr5[i16].mapPoints(fArr3);
            float fMax = Math.max(((float) Math.hypot(fArr2[0] - fArr3[0], fArr2[1] - fArr3[1])) - 0.001f, 0.0f);
            ed.x xVar8 = xVarArr2[i14];
            fArr2[0] = xVar8.f23383c;
            fArr2[1] = xVar8.f23384d;
            matrixArr5[i14].mapPoints(fArr2);
            float fAbs = (i14 == 1 || i14 == 3) ? Math.abs(rectF.centerX() - fArr2[0]) : Math.abs(rectF.centerY() - fArr2[1]);
            xVar5.d(0.0f, 0.0f, 270.0f, 0.0f);
            ed.f fVar = i14 != 1 ? i14 != 2 ? i14 != 3 ? oVar.j : oVar.f23360i : oVar.f23362l : oVar.f23361k;
            fVar.m(fMax, fAbs, f10, xVar5);
            path6.reset();
            xVar5.b(matrixArr4[i14], path6);
            if (this.f18031a && (fVar.l() || c(path6, i14) || c(path6, i16))) {
                path6.op(path6, path5, Path.Op.DIFFERENCE);
                fArr2[0] = xVar5.f23381a;
                c9 = 1;
                fArr2[1] = xVar5.f23382b;
                matrixArr4[i14].mapPoints(fArr2);
                path4.moveTo(fArr2[0], fArr2[1]);
                xVar5.b(matrixArr4[i14], path4);
                path2 = path;
            } else {
                c9 = 1;
                path2 = path;
                xVar5.b(matrixArr4[i14], path2);
            }
            if (iVar != null) {
                Matrix matrix2 = matrixArr4[i14];
                iVar2 = iVar;
                ed.j jVar2 = (ed.j) iVar2.f31385a;
                z10 = false;
                jVar2.f23319e.set(i14 + 4, false);
                ed.w[] wVarArr2 = jVar2.f23318d;
                xVar5.a(xVar5.f23386f);
                wVarArr2[i14] = new ed.q(new ArrayList(xVar5.f23387h), new Matrix(matrix2));
            } else {
                iVar2 = iVar;
                z10 = false;
            }
            path3 = path2;
            iVar3 = iVar2;
            i14 = i15;
            z3 = z10;
            xVarArr = xVarArr2;
            matrixArr2 = matrixArr5;
        }
        Path path7 = path3;
        path7.close();
        path4.close();
        if (path4.isEmpty()) {
            return;
        }
        path7.op(path4, Path.Op.UNION);
    }

    public boolean c(Path path, int i4) {
        Path path2 = (Path) this.f18040l;
        path2.reset();
        ((ed.x[]) this.f18032b)[i4].b(((Matrix[]) this.f18033c)[i4], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        return !rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f);
    }

    public uh d(int i4, int i10, List list) {
        ArrayList arrayList = (ArrayList) this.f18033c;
        mq0.m(i4 >= 0 && i4 <= i10 && i10 <= arrayList.size());
        mq0.m(list.size() == i10 - i4);
        for (int i11 = i4; i11 < i10; i11++) {
            ((bu1) arrayList.get(i11)).f9806a.a((h5) list.get(i11 - i4));
        }
        return i();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00b6  */
    @Override // com.google.android.gms.internal.ads.f90
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void e(boolean r23, android.content.Context r24, com.google.android.gms.internal.ads.m60 r25) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.wj0.e(boolean, android.content.Context, com.google.android.gms.internal.ads.m60):void");
    }

    public boolean f() {
        return this.f18031a;
    }

    public void g(hm1 hm1Var) {
        mq0.c0(!this.f18031a);
        this.f18039k = hm1Var;
        int i4 = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) this.f18033c;
            if (i4 >= arrayList.size()) {
                this.f18031a = true;
                return;
            }
            bu1 bu1Var = (bu1) arrayList.get(i4);
            p(bu1Var);
            ((HashSet) this.f18037h).add(bu1Var);
            i4++;
        }
    }

    public void h(iy1 iy1Var) {
        IdentityHashMap identityHashMap = (IdentityHashMap) this.f18034d;
        bu1 bu1Var = (bu1) identityHashMap.remove(iy1Var);
        bu1Var.getClass();
        bu1Var.f9806a.b(iy1Var);
        bu1Var.f9808c.remove(((dy1) iy1Var).f10606a);
        if (!identityHashMap.isEmpty()) {
            n();
        }
        q(bu1Var);
    }

    public uh i() {
        ArrayList arrayList = (ArrayList) this.f18033c;
        if (arrayList.isEmpty()) {
            return uh.f17203a;
        }
        int iA = 0;
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            bu1 bu1Var = (bu1) arrayList.get(i4);
            bu1Var.f9809d = iA;
            iA += bu1Var.f9806a.f11655o.f19232b.a();
        }
        return new ju1(arrayList, (kz1) this.f18040l);
    }

    public uh j(List list, kz1 kz1Var) {
        ArrayList arrayList = (ArrayList) this.f18033c;
        o(0, arrayList.size());
        return k(arrayList.size(), list, kz1Var);
    }

    public uh k(int i4, List list, kz1 kz1Var) {
        ArrayList arrayList = (ArrayList) this.f18033c;
        if (!list.isEmpty()) {
            this.f18040l = kz1Var;
            for (int i10 = i4; i10 < list.size() + i4; i10++) {
                bu1 bu1Var = (bu1) list.get(i10 - i4);
                if (i10 > 0) {
                    bu1 bu1Var2 = (bu1) arrayList.get(i10 - 1);
                    bu1Var.f9809d = bu1Var2.f9806a.f11655o.f19232b.a() + bu1Var2.f9809d;
                    bu1Var.f9810e = false;
                    bu1Var.f9808c.clear();
                } else {
                    bu1Var.f9809d = 0;
                    bu1Var.f9810e = false;
                    bu1Var.f9808c.clear();
                }
                int iA = bu1Var.f9806a.f11655o.f19232b.a();
                for (int i11 = i10; i11 < arrayList.size(); i11++) {
                    ((bu1) arrayList.get(i11)).f9809d += iA;
                }
                arrayList.add(i10, bu1Var);
                ((HashMap) this.f18035e).put(bu1Var.f9807b, bu1Var);
                if (this.f18031a) {
                    p(bu1Var);
                    if (((IdentityHashMap) this.f18034d).isEmpty()) {
                        ((HashSet) this.f18037h).add(bu1Var);
                    } else {
                        au1 au1Var = (au1) ((HashMap) this.g).get(bu1Var);
                        if (au1Var != null) {
                            au1Var.f9418a.p(au1Var.f9419b);
                        }
                    }
                }
            }
        }
        return i();
    }

    public uh l(int i4, int i10, kz1 kz1Var) {
        boolean z3 = false;
        if (i4 >= 0 && i4 <= i10 && i10 <= ((ArrayList) this.f18033c).size()) {
            z3 = true;
        }
        mq0.m(z3);
        this.f18040l = kz1Var;
        o(i4, i10);
        return i();
    }

    public uh m(kz1 kz1Var) {
        int size = ((ArrayList) this.f18033c).size();
        if (kz1Var.f13304b.length != size) {
            kz1Var = new kz1(new Random(kz1Var.f13303a.nextLong())).a(size);
        }
        this.f18040l = kz1Var;
        return i();
    }

    public void n() {
        Iterator it = ((HashSet) this.f18037h).iterator();
        while (it.hasNext()) {
            bu1 bu1Var = (bu1) it.next();
            if (bu1Var.f9808c.isEmpty()) {
                au1 au1Var = (au1) ((HashMap) this.g).get(bu1Var);
                if (au1Var != null) {
                    au1Var.f9418a.p(au1Var.f9419b);
                }
                it.remove();
            }
        }
    }

    public void o(int i4, int i10) {
        ArrayList arrayList = (ArrayList) this.f18033c;
        while (true) {
            i10--;
            if (i10 < i4) {
                return;
            }
            bu1 bu1Var = (bu1) arrayList.remove(i10);
            ((HashMap) this.f18035e).remove(bu1Var.f9807b);
            int i11 = -bu1Var.f9806a.f11655o.f19232b.a();
            for (int i12 = i10; i12 < arrayList.size(); i12++) {
                ((bu1) arrayList.get(i12)).f9809d += i11;
            }
            bu1Var.f9810e = true;
            if (this.f18031a) {
                q(bu1Var);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.gms.internal.ads.du1, com.google.android.gms.internal.ads.ky1] */
    public void p(bu1 bu1Var) {
        gy1 gy1Var = bu1Var.f9806a;
        ?? r12 = new ky1() { // from class: com.google.android.gms.internal.ads.du1
            @Override // com.google.android.gms.internal.ads.ky1
            public final void a(qx1 qx1Var, uh uhVar) {
                no0 no0Var = ((nt1) this.f10553a.f18036f).f14419h;
                no0Var.d(2);
                no0Var.c(22);
            }
        };
        zt1 zt1Var = new zt1(this, bu1Var);
        ((HashMap) this.g).put(bu1Var, new au1(gy1Var, r12, zt1Var));
        String str = bq0.f9768a;
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null) {
            looperMyLooper = Looper.getMainLooper();
        }
        Handler handler = new Handler(looperMyLooper, null);
        l90 l90Var = gy1Var.f15471c;
        l90Var.getClass();
        ((CopyOnWriteArrayList) l90Var.f13427c).add(new ly1(handler, zt1Var));
        Looper looperMyLooper2 = Looper.myLooper();
        if (looperMyLooper2 == null) {
            looperMyLooper2 = Looper.getMainLooper();
        }
        new Handler(looperMyLooper2, null);
        ce1 ce1Var = gy1Var.f15472d;
        ce1Var.getClass();
        ((CopyOnWriteArrayList) ce1Var.f10095c).add(new rw1(zt1Var));
        gy1Var.n(r12, (hm1) this.f18039k, (cv1) this.f18032b);
    }

    public void q(bu1 bu1Var) {
        if (bu1Var.f9810e && bu1Var.f9808c.isEmpty()) {
            au1 au1Var = (au1) ((HashMap) this.g).remove(bu1Var);
            au1Var.getClass();
            qx1 qx1Var = au1Var.f9418a;
            qx1Var.q(au1Var.f9419b);
            zt1 zt1Var = au1Var.f9420c;
            qx1Var.l(zt1Var);
            qx1Var.m(zt1Var);
            ((HashSet) this.f18037h).remove(bu1Var);
        }
    }

    public wj0(nt1 nt1Var, wu1 wu1Var, no0 no0Var, cv1 cv1Var) {
        this.f18032b = cv1Var;
        this.f18036f = nt1Var;
        this.f18040l = new kz1();
        this.f18034d = new IdentityHashMap();
        this.f18035e = new HashMap();
        this.f18033c = new ArrayList();
        this.f18038i = wu1Var;
        this.j = no0Var;
        this.g = new HashMap();
        this.f18037h = new HashSet();
    }

    public wj0() {
        this.f18032b = new ed.x[4];
        this.f18033c = new Matrix[4];
        this.f18034d = new Matrix[4];
        this.f18035e = new PointF();
        this.f18036f = new Path();
        this.g = new Path();
        this.f18037h = new ed.x();
        this.f18038i = new float[2];
        this.j = new float[2];
        this.f18039k = new Path();
        this.f18040l = new Path();
        this.f18031a = true;
        for (int i4 = 0; i4 < 4; i4++) {
            ((ed.x[]) this.f18032b)[i4] = new ed.x();
            ((Matrix[]) this.f18033c)[i4] = new Matrix();
            ((Matrix[]) this.f18034d)[i4] = new Matrix();
        }
    }
}

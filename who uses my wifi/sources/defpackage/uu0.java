package defpackage;

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

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class uu0 implements qq2 {
    public boolean f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final Object m;
    public final Object n;
    public final Object o;
    public Object p;
    public Object q;

    public uu0(Context context, pu2 pu2Var, l83 l83Var, e51 e51Var, a83 a83Var, pd2 pd2Var, ag2 ag2Var, e42 e42Var, boolean z, pz2 pz2Var, jv2 jv2Var, mv2 mv2Var) {
        this.g = context;
        this.h = pu2Var;
        this.i = l83Var;
        this.j = e51Var;
        this.k = a83Var;
        this.l = pd2Var;
        this.m = ag2Var;
        this.n = e42Var;
        this.f = z;
        this.o = pz2Var;
        this.p = jv2Var;
        this.q = mv2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v5 */
    public void a(su0 su0Var, float[] fArr, float f, RectF rectF, f20 f20Var, Path path) {
        boolean z;
        int i;
        float f2;
        boolean z2;
        ck ffVar;
        int i2;
        f20 f20Var2 = f20Var;
        Path path2 = path;
        Matrix[] matrixArr = (Matrix[]) this.i;
        float[] fArr2 = (float[]) this.p;
        k90[] k90VarArr = (k90[]) this.g;
        Matrix[] matrixArr2 = (Matrix[]) this.h;
        path2.rewind();
        Path path3 = (Path) this.k;
        path3.rewind();
        Path path4 = (Path) this.l;
        path4.rewind();
        path4.addRect(rectF, Path.Direction.CW);
        int i3 = 0;
        while (true) {
            z = 0;
            int i4 = 1;
            if (i3 >= 4) {
                break;
            }
            PointF pointF = (PointF) this.j;
            if (fArr == null) {
                ffVar = i3 != 1 ? i3 != 2 ? i3 != 3 ? su0Var.f : su0Var.e : su0Var.h : su0Var.g;
            } else {
                ffVar = new ff(fArr[i3]);
                i4 = 1;
            }
            ou1 ou1Var = i3 != i4 ? i3 != 2 ? i3 != 3 ? su0Var.b : su0Var.a : su0Var.d : su0Var.c;
            Matrix[] matrixArr3 = matrixArr;
            k90 k90Var = k90VarArr[i3];
            ou1Var.getClass();
            ou1Var.n(k90Var, f, ffVar.a(rectF));
            int i5 = i3 + 1;
            float f3 = (i5 % 4) * 90;
            matrixArr2[i3].reset();
            if (i3 == 1) {
                i2 = i5;
                pointF.set(rectF.right, rectF.bottom);
            } else if (i3 == 2) {
                i2 = i5;
                pointF.set(rectF.left, rectF.bottom);
            } else if (i3 != 3) {
                i2 = i5;
                pointF.set(rectF.right, rectF.top);
            } else {
                i2 = i5;
                pointF.set(rectF.left, rectF.top);
            }
            matrixArr2[i3].setTranslate(pointF.x, pointF.y);
            matrixArr2[i3].preRotate(f3);
            k90 k90Var2 = k90VarArr[i3];
            fArr2[0] = k90Var2.b;
            fArr2[1] = k90Var2.c;
            matrixArr2[i3].mapPoints(fArr2);
            matrixArr3[i3].reset();
            matrixArr3[i3].setTranslate(fArr2[0], fArr2[1]);
            matrixArr3[i3].preRotate(f3);
            i3 = i2;
            matrixArr = matrixArr3;
        }
        Matrix[] matrixArr4 = matrixArr;
        int i6 = 0;
        for (i = 4; i6 < i; i = 4) {
            k90 k90Var3 = k90VarArr[i6];
            k90Var3.getClass();
            fArr2[z] = 0.0f;
            fArr2[1] = k90Var3.a;
            matrixArr2[i6].mapPoints(fArr2);
            if (i6 == 0) {
                path2.moveTo(fArr2[z], fArr2[1]);
            } else {
                path2.lineTo(fArr2[z], fArr2[1]);
            }
            k90VarArr[i6].c(matrixArr2[i6], path2);
            if (f20Var2 != null) {
                k90 k90Var4 = k90VarArr[i6];
                Matrix matrix = matrixArr2[i6];
                nc0 nc0Var = (nc0) f20Var2.g;
                f2 = 0.0f;
                BitSet bitSet = nc0Var.j;
                k90Var4.getClass();
                bitSet.set(i6, z);
                kv0[] kv0VarArr = nc0Var.h;
                k90Var4.b(k90Var4.e);
                kv0VarArr[i6] = new ev0(new ArrayList((ArrayList) k90Var4.g), new Matrix(matrix));
            } else {
                f2 = 0.0f;
            }
            Path path5 = (Path) this.m;
            k90 k90Var5 = (k90) this.o;
            int i7 = i6 + 1;
            int i8 = i7 % 4;
            k90 k90Var6 = k90VarArr[i6];
            k90[] k90VarArr2 = k90VarArr;
            fArr2[0] = k90Var6.b;
            fArr2[1] = k90Var6.c;
            matrixArr2[i6].mapPoints(fArr2);
            float[] fArr3 = (float[]) this.q;
            k90 k90Var7 = k90VarArr2[i8];
            k90Var7.getClass();
            fArr3[0] = f2;
            fArr3[1] = k90Var7.a;
            matrixArr2[i8].mapPoints(fArr3);
            Matrix[] matrixArr5 = matrixArr2;
            float fMax = Math.max(((float) Math.hypot(fArr2[0] - fArr3[0], fArr2[1] - fArr3[1])) - 0.001f, f2);
            k90 k90Var8 = k90VarArr2[i6];
            fArr2[0] = k90Var8.b;
            fArr2[1] = k90Var8.c;
            matrixArr5[i6].mapPoints(fArr2);
            float fAbs = (i6 == 1 || i6 == 3) ? Math.abs(rectF.centerX() - fArr2[0]) : Math.abs(rectF.centerY() - fArr2[1]);
            k90Var5.e(0.0f, 270.0f, 0.0f);
            (i6 != 1 ? i6 != 2 ? i6 != 3 ? su0Var.j : su0Var.i : su0Var.l : su0Var.k).d(fMax, fAbs, f, k90Var5);
            path5.reset();
            k90Var5.c(matrixArr4[i6], path5);
            if (this.f && (b(path5, i6) || b(path5, i8))) {
                path5.op(path5, path4, Path.Op.DIFFERENCE);
                fArr2[0] = 0.0f;
                fArr2[1] = k90Var5.a;
                matrixArr4[i6].mapPoints(fArr2);
                path3.moveTo(fArr2[0], fArr2[1]);
                k90Var5.c(matrixArr4[i6], path3);
                path2 = path;
            } else {
                path2 = path;
                k90Var5.c(matrixArr4[i6], path2);
            }
            if (f20Var != null) {
                Matrix matrix2 = matrixArr4[i6];
                f20Var2 = f20Var;
                nc0 nc0Var2 = (nc0) f20Var2.g;
                z2 = false;
                nc0Var2.j.set(i6 + 4, false);
                kv0[] kv0VarArr2 = nc0Var2.i;
                k90Var5.b(k90Var5.e);
                kv0VarArr2[i6] = new ev0(new ArrayList((ArrayList) k90Var5.g), new Matrix(matrix2));
            } else {
                f20Var2 = f20Var;
                z2 = false;
            }
            i6 = i7;
            z = z2;
            k90VarArr = k90VarArr2;
            matrixArr2 = matrixArr5;
        }
        path2.close();
        path3.close();
        if (path3.isEmpty()) {
            return;
        }
        path2.op(path3, Path.Op.UNION);
    }

    public boolean b(Path path, int i) {
        Path path2 = (Path) this.n;
        path2.reset();
        ((k90[]) this.g)[i].c(((Matrix[]) this.h)[i], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        return !rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f);
    }

    public oz1 c(int i, int i2, List list) {
        ArrayList arrayList = (ArrayList) this.h;
        zt0.D(i >= 0 && i <= i2 && i2 <= arrayList.size());
        zt0.D(list.size() == i2 - i);
        for (int i3 = i; i3 < i2; i3++) {
            ((bc4) arrayList.get(i3)).a.a((fk1) list.get(i3 - i));
        }
        return h();
    }

    @Override // defpackage.qq2
    public a83 d() {
        return (a83) this.k;
    }

    public boolean e() {
        return this.f;
    }

    public void f(ws3 ws3Var) {
        zt0.b0(!this.f);
        this.p = ws3Var;
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) this.h;
            if (i >= arrayList.size()) {
                this.f = true;
                return;
            }
            bc4 bc4Var = (bc4) arrayList.get(i);
            o(bc4Var);
            ((HashSet) this.m).add(bc4Var);
            i++;
        }
    }

    public void g(jh4 jh4Var) {
        IdentityHashMap identityHashMap = (IdentityHashMap) this.i;
        bc4 bc4Var = (bc4) identityHashMap.remove(jh4Var);
        bc4Var.getClass();
        bc4Var.a.b(jh4Var);
        bc4Var.c.remove(((dh4) jh4Var).f);
        if (!identityHashMap.isEmpty()) {
            m();
        }
        p(bc4Var);
    }

    public oz1 h() {
        ArrayList arrayList = (ArrayList) this.h;
        if (arrayList.isEmpty()) {
            return oz1.a;
        }
        int iA = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            bc4 bc4Var = (bc4) arrayList.get(i);
            bc4Var.d = iA;
            iA += bc4Var.a.o.b.a();
        }
        return new ic4(arrayList, (ni4) this.q);
    }

    public oz1 i(List list, ni4 ni4Var) {
        ArrayList arrayList = (ArrayList) this.h;
        n(0, arrayList.size());
        return j(arrayList.size(), list, ni4Var);
    }

    public oz1 j(int i, List list, ni4 ni4Var) {
        ArrayList arrayList = (ArrayList) this.h;
        if (!list.isEmpty()) {
            this.q = ni4Var;
            for (int i2 = i; i2 < list.size() + i; i2++) {
                bc4 bc4Var = (bc4) list.get(i2 - i);
                if (i2 > 0) {
                    bc4 bc4Var2 = (bc4) arrayList.get(i2 - 1);
                    bc4Var.d = bc4Var2.a.o.b.a() + bc4Var2.d;
                    bc4Var.e = false;
                    bc4Var.c.clear();
                } else {
                    bc4Var.d = 0;
                    bc4Var.e = false;
                    bc4Var.c.clear();
                }
                int iA = bc4Var.a.o.b.a();
                for (int i3 = i2; i3 < arrayList.size(); i3++) {
                    ((bc4) arrayList.get(i3)).d += iA;
                }
                arrayList.add(i2, bc4Var);
                ((HashMap) this.j).put(bc4Var.b, bc4Var);
                if (this.f) {
                    o(bc4Var);
                    if (((IdentityHashMap) this.i).isEmpty()) {
                        ((HashSet) this.m).add(bc4Var);
                    } else {
                        ac4 ac4Var = (ac4) ((HashMap) this.l).get(bc4Var);
                        if (ac4Var != null) {
                            ac4Var.a.p(ac4Var.b);
                        }
                    }
                }
            }
        }
        return h();
    }

    public oz1 k(int i, int i2, ni4 ni4Var) {
        boolean z = false;
        if (i >= 0 && i <= i2 && i2 <= ((ArrayList) this.h).size()) {
            z = true;
        }
        zt0.D(z);
        this.q = ni4Var;
        n(i, i2);
        return h();
    }

    public oz1 l(ni4 ni4Var) {
        int size = ((ArrayList) this.h).size();
        if (ni4Var.b.length != size) {
            ni4Var = new ni4(new Random(ni4Var.a.nextLong())).a(size);
        }
        this.q = ni4Var;
        return h();
    }

    public void m() {
        Iterator it = ((HashSet) this.m).iterator();
        while (it.hasNext()) {
            bc4 bc4Var = (bc4) it.next();
            if (bc4Var.c.isEmpty()) {
                ac4 ac4Var = (ac4) ((HashMap) this.l).get(bc4Var);
                if (ac4Var != null) {
                    ac4Var.a.p(ac4Var.b);
                }
                it.remove();
            }
        }
    }

    public void n(int i, int i2) {
        ArrayList arrayList = (ArrayList) this.h;
        while (true) {
            i2--;
            if (i2 < i) {
                return;
            }
            bc4 bc4Var = (bc4) arrayList.remove(i2);
            ((HashMap) this.j).remove(bc4Var.b);
            int i3 = -bc4Var.a.o.b.a();
            for (int i4 = i2; i4 < arrayList.size(); i4++) {
                ((bc4) arrayList.get(i4)).d += i3;
            }
            bc4Var.e = true;
            if (this.f) {
                p(bc4Var);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [cc4, lh4] */
    public void o(bc4 bc4Var) {
        gh4 gh4Var = bc4Var.a;
        ?? r1 = new lh4() { // from class: cc4
            @Override // defpackage.lh4
            public final void a(pg4 pg4Var, oz1 oz1Var) {
                d13 d13Var = ((jb4) this.a.k).m;
                d13Var.c(2);
                d13Var.b(22);
            }
        };
        vb4 vb4Var = new vb4(this, bc4Var);
        ((HashMap) this.l).put(bc4Var, new ac4(gh4Var, r1, vb4Var));
        String str = v23.a;
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null) {
            looperMyLooper = Looper.getMainLooper();
        }
        Handler handler = new Handler(looperMyLooper, null);
        wt2 wt2Var = gh4Var.c;
        wt2Var.getClass();
        ((CopyOnWriteArrayList) wt2Var.h).add(new mh4(handler, vb4Var));
        Looper looperMyLooper2 = Looper.myLooper();
        if (looperMyLooper2 == null) {
            looperMyLooper2 = Looper.getMainLooper();
        }
        new Handler(looperMyLooper2, null);
        lv2 lv2Var = gh4Var.d;
        lv2Var.getClass();
        ((CopyOnWriteArrayList) lv2Var.h).add(new jf4(vb4Var));
        gh4Var.n(r1, (ws3) this.p, (xd4) this.g);
    }

    public void p(bc4 bc4Var) {
        if (bc4Var.e && bc4Var.c.isEmpty()) {
            ac4 ac4Var = (ac4) ((HashMap) this.l).remove(bc4Var);
            ac4Var.getClass();
            pg4 pg4Var = ac4Var.a;
            pg4Var.q(ac4Var.b);
            vb4 vb4Var = ac4Var.c;
            pg4Var.l(vb4Var);
            pg4Var.m(vb4Var);
            ((HashSet) this.m).remove(bc4Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00b7  */
    @Override // defpackage.qq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void q(boolean r23, android.content.Context r24, defpackage.an2 r25) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uu0.q(boolean, android.content.Context, an2):void");
    }

    public uu0(jb4 jb4Var, md4 md4Var, d13 d13Var, xd4 xd4Var) {
        this.g = xd4Var;
        this.k = jb4Var;
        this.q = new ni4();
        this.i = new IdentityHashMap();
        this.j = new HashMap();
        this.h = new ArrayList();
        this.n = md4Var;
        this.o = d13Var;
        this.l = new HashMap();
        this.m = new HashSet();
    }

    public uu0() {
        this.g = new k90[4];
        this.h = new Matrix[4];
        this.i = new Matrix[4];
        this.j = new PointF();
        this.k = new Path();
        this.l = new Path();
        this.o = new k90();
        this.p = new float[2];
        this.q = new float[2];
        this.m = new Path();
        this.n = new Path();
        this.f = true;
        for (int i = 0; i < 4; i++) {
            ((k90[]) this.g)[i] = new k90();
            ((Matrix[]) this.h)[i] = new Matrix();
            ((Matrix[]) this.i)[i] = new Matrix();
        }
    }
}

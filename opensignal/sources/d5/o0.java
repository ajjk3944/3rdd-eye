package d5;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.common.a1;
import androidx.media3.exoplayer.analytics.AnalyticsCollector;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import lf.t1;
import o5.b1;

/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f7044a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f7045b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f7046c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f7047d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f7048e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f7049f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f7050g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f7051h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f7052i;
    public final Object j;
    public Object k;

    /* renamed from: l, reason: collision with root package name */
    public Object f7053l;

    public o0() {
        this.f7045b = new ee.u[4];
        this.f7046c = new Matrix[4];
        this.f7047d = new Matrix[4];
        this.f7048e = new PointF();
        this.f7049f = new Path();
        this.f7050g = new Path();
        this.f7051h = new ee.u();
        this.f7052i = new float[2];
        this.j = new float[2];
        this.k = new Path();
        this.f7053l = new Path();
        this.f7044a = true;
        for (int i10 = 0; i10 < 4; i10++) {
            ((ee.u[]) this.f7045b)[i10] = new ee.u();
            ((Matrix[]) this.f7046c)[i10] = new Matrix();
            ((Matrix[]) this.f7047d)[i10] = new Matrix();
        }
    }

    public a1 a(int i10, ArrayList arrayList, b1 b1Var) {
        ArrayList arrayList2 = (ArrayList) this.f7046c;
        if (!arrayList.isEmpty()) {
            this.k = b1Var;
            for (int i11 = i10; i11 < arrayList.size() + i10; i11++) {
                n0 n0Var = (n0) arrayList.get(i11 - i10);
                if (i11 > 0) {
                    n0 n0Var2 = (n0) arrayList2.get(i11 - 1);
                    n0Var.f7039d = n0Var2.f7036a.f19066h.f19002d.o() + n0Var2.f7039d;
                    n0Var.f7040e = false;
                    n0Var.f7038c.clear();
                } else {
                    n0Var.f7039d = 0;
                    n0Var.f7040e = false;
                    n0Var.f7038c.clear();
                }
                int iO = n0Var.f7036a.f19066h.f19002d.o();
                for (int i12 = i11; i12 < arrayList2.size(); i12++) {
                    ((n0) arrayList2.get(i12)).f7039d += iO;
                }
                arrayList2.add(i11, n0Var);
                ((HashMap) this.f7048e).put(n0Var.f7037b, n0Var);
                if (this.f7044a) {
                    g(n0Var);
                    if (((IdentityHashMap) this.f7047d).isEmpty()) {
                        ((HashSet) this.f7051h).add(n0Var);
                    } else {
                        m0 m0Var = (m0) ((HashMap) this.f7049f).get(n0Var);
                        if (m0Var != null) {
                            m0Var.f7033a.disable(m0Var.f7034b);
                        }
                    }
                }
            }
        }
        return c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v5 */
    public void b(ee.l lVar, float[] fArr, float f10, RectF rectF, b9.c cVar, Path path) {
        int i10;
        boolean z10;
        float f11;
        b9.c cVar2;
        boolean z11;
        b9.c cVar3 = cVar;
        Matrix[] matrixArr = (Matrix[]) this.f7047d;
        float[] fArr2 = (float[]) this.f7052i;
        ee.u[] uVarArr = (ee.u[]) this.f7045b;
        Matrix[] matrixArr2 = (Matrix[]) this.f7046c;
        path.rewind();
        Path path2 = (Path) this.f7049f;
        path2.rewind();
        Path path3 = (Path) this.f7050g;
        path3.rewind();
        path3.addRect(rectF, Path.Direction.CW);
        int i11 = 0;
        while (true) {
            z10 = 0;
            if (i11 >= 4) {
                break;
            }
            PointF pointF = (PointF) this.f7048e;
            ee.d cVar4 = fArr == null ? i11 != 1 ? i11 != 2 ? i11 != 3 ? lVar.f8129f : lVar.f8128e : lVar.f8131h : lVar.f8130g : new ee.c(fArr[i11]);
            t1 t1Var = i11 != 1 ? i11 != 2 ? i11 != 3 ? lVar.f8125b : lVar.f8124a : lVar.f8127d : lVar.f8126c;
            ee.u uVar = uVarArr[i11];
            t1Var.getClass();
            Matrix[] matrixArr3 = matrixArr;
            t1Var.q(uVar, f10, cVar4.a(rectF));
            int i12 = i11 + 1;
            float f12 = (i12 % 4) * 90;
            matrixArr2[i11].reset();
            if (i11 == 1) {
                pointF.set(rectF.right, rectF.bottom);
            } else if (i11 == 2) {
                pointF.set(rectF.left, rectF.bottom);
            } else if (i11 != 3) {
                pointF.set(rectF.right, rectF.top);
            } else {
                pointF.set(rectF.left, rectF.top);
            }
            matrixArr2[i11].setTranslate(pointF.x, pointF.y);
            matrixArr2[i11].preRotate(f12);
            ee.u uVar2 = uVarArr[i11];
            fArr2[0] = uVar2.f8154b;
            fArr2[1] = uVar2.f8155c;
            matrixArr2[i11].mapPoints(fArr2);
            matrixArr3[i11].reset();
            matrixArr3[i11].setTranslate(fArr2[0], fArr2[1]);
            matrixArr3[i11].preRotate(f12);
            i11 = i12;
            matrixArr = matrixArr3;
        }
        Matrix[] matrixArr4 = matrixArr;
        int i13 = 0;
        for (i10 = 4; i13 < i10; i10 = 4) {
            ee.u uVar3 = uVarArr[i13];
            uVar3.getClass();
            fArr2[z10] = 0.0f;
            fArr2[1] = uVar3.f8153a;
            matrixArr2[i13].mapPoints(fArr2);
            if (i13 == 0) {
                path.moveTo(fArr2[z10], fArr2[1]);
            } else {
                path.lineTo(fArr2[z10], fArr2[1]);
            }
            uVarArr[i13].b(matrixArr2[i13], path);
            if (cVar3 != null) {
                ee.u uVar4 = uVarArr[i13];
                Matrix matrix = matrixArr2[i13];
                ee.i iVar = (ee.i) cVar3.f2478d;
                BitSet bitSet = iVar.f8120x;
                uVar4.getClass();
                f11 = 0.0f;
                bitSet.set(i13, z10);
                ee.t[] tVarArr = iVar.f8118g;
                uVar4.a(uVar4.f8157e);
                tVarArr[i13] = new ee.n(new ArrayList((ArrayList) uVar4.f8159g), new Matrix(matrix));
            } else {
                f11 = 0.0f;
            }
            Path path4 = (Path) this.k;
            ee.u uVar5 = (ee.u) this.f7051h;
            int i14 = i13 + 1;
            int i15 = i14 % 4;
            ee.u uVar6 = uVarArr[i13];
            fArr2[0] = uVar6.f8154b;
            fArr2[1] = uVar6.f8155c;
            matrixArr2[i13].mapPoints(fArr2);
            float[] fArr3 = (float[]) this.j;
            ee.u uVar7 = uVarArr[i15];
            uVar7.getClass();
            fArr3[0] = f11;
            fArr3[1] = uVar7.f8153a;
            matrixArr2[i15].mapPoints(fArr3);
            ee.u[] uVarArr2 = uVarArr;
            Matrix[] matrixArr5 = matrixArr2;
            float fMax = Math.max(((float) Math.hypot(fArr2[0] - fArr3[0], fArr2[1] - fArr3[1])) - 0.001f, f11);
            ee.u uVar8 = uVarArr2[i13];
            fArr2[0] = uVar8.f8154b;
            fArr2[1] = uVar8.f8155c;
            matrixArr5[i13].mapPoints(fArr2);
            if (i13 == 1 || i13 == 3) {
                Math.abs(rectF.centerX() - fArr2[0]);
            } else {
                Math.abs(rectF.centerY() - fArr2[1]);
            }
            uVar5.d(0.0f, 270.0f, 0.0f);
            (i13 != 1 ? i13 != 2 ? i13 != 3 ? lVar.j : lVar.f8132i : lVar.f8133l : lVar.k).getClass();
            uVar5.c(fMax, 0.0f);
            path4.reset();
            uVar5.b(matrixArr4[i13], path4);
            if (this.f7044a && (f(path4, i13) || f(path4, i15))) {
                path4.op(path4, path3, Path.Op.DIFFERENCE);
                fArr2[0] = 0.0f;
                fArr2[1] = uVar5.f8153a;
                matrixArr4[i13].mapPoints(fArr2);
                path2.moveTo(fArr2[0], fArr2[1]);
                uVar5.b(matrixArr4[i13], path2);
            } else {
                uVar5.b(matrixArr4[i13], path);
            }
            if (cVar != null) {
                Matrix matrix2 = matrixArr4[i13];
                cVar2 = cVar;
                ee.i iVar2 = (ee.i) cVar2.f2478d;
                z11 = false;
                iVar2.f8120x.set(i13 + 4, false);
                ee.t[] tVarArr2 = iVar2.f8119r;
                uVar5.a(uVar5.f8157e);
                tVarArr2[i13] = new ee.n(new ArrayList((ArrayList) uVar5.f8159g), new Matrix(matrix2));
            } else {
                cVar2 = cVar;
                z11 = false;
            }
            z10 = z11;
            cVar3 = cVar2;
            i13 = i14;
            uVarArr = uVarArr2;
            matrixArr2 = matrixArr5;
        }
        path.close();
        path2.close();
        if (path2.isEmpty()) {
            return;
        }
        path.op(path2, Path.Op.UNION);
    }

    public a1 c() {
        ArrayList arrayList = (ArrayList) this.f7046c;
        if (arrayList.isEmpty()) {
            return a1.f1564a;
        }
        int iO = 0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            n0 n0Var = (n0) arrayList.get(i10);
            n0Var.f7039d = iO;
            iO += n0Var.f7036a.f19066h.f19002d.o();
        }
        return new t0(arrayList, (b1) this.k);
    }

    public void d() {
        Iterator it = ((HashSet) this.f7051h).iterator();
        while (it.hasNext()) {
            n0 n0Var = (n0) it.next();
            if (n0Var.f7038c.isEmpty()) {
                m0 m0Var = (m0) ((HashMap) this.f7049f).get(n0Var);
                if (m0Var != null) {
                    m0Var.f7033a.disable(m0Var.f7034b);
                }
                it.remove();
            }
        }
    }

    public void e(n0 n0Var) {
        if (n0Var.f7040e && n0Var.f7038c.isEmpty()) {
            m0 m0Var = (m0) ((HashMap) this.f7049f).remove(n0Var);
            m0Var.getClass();
            bm.e eVar = m0Var.f7035c;
            o5.b0 b0Var = m0Var.f7033a;
            b0Var.releaseSource(m0Var.f7034b);
            b0Var.removeEventListener(eVar);
            b0Var.removeDrmEventListener(eVar);
            ((HashSet) this.f7051h).remove(n0Var);
        }
    }

    public boolean f(Path path, int i10) {
        Path path2 = (Path) this.f7053l;
        path2.reset();
        ((ee.u[]) this.f7045b)[i10].b(((Matrix[]) this.f7046c)[i10], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        return !rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [d5.i0, o5.a0] */
    public void g(n0 n0Var) {
        o5.u uVar = n0Var.f7036a;
        ?? r12 = new o5.a0() { // from class: d5.i0
            @Override // o5.a0
            public final void a(o5.a aVar, a1 a1Var) {
                ((e0) this.f6999a.f7050g).D.e(22);
            }
        };
        bm.e eVar = new bm.e(this, n0Var);
        ((HashMap) this.f7049f).put(n0Var, new m0(uVar, r12, eVar));
        int i10 = a5.d0.f105a;
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null) {
            looperMyLooper = Looper.getMainLooper();
        }
        uVar.addEventListener(new Handler(looperMyLooper, null), eVar);
        Looper looperMyLooper2 = Looper.myLooper();
        if (looperMyLooper2 == null) {
            looperMyLooper2 = Looper.getMainLooper();
        }
        uVar.addDrmEventListener(new Handler(looperMyLooper2, null), eVar);
        uVar.prepareSource(r12, (b5.b0) this.f7053l, (e5.o0) this.f7045b);
    }

    public void h(o5.x xVar) {
        IdentityHashMap identityHashMap = (IdentityHashMap) this.f7047d;
        n0 n0Var = (n0) identityHashMap.remove(xVar);
        n0Var.getClass();
        n0Var.f7036a.releasePeriod(xVar);
        n0Var.f7038c.remove(((o5.r) xVar).f19030a);
        if (!identityHashMap.isEmpty()) {
            d();
        }
        e(n0Var);
    }

    public void i(int i10, int i11) {
        ArrayList arrayList = (ArrayList) this.f7046c;
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            n0 n0Var = (n0) arrayList.remove(i12);
            ((HashMap) this.f7048e).remove(n0Var.f7037b);
            int i13 = -n0Var.f7036a.f19066h.f19002d.o();
            for (int i14 = i12; i14 < arrayList.size(); i14++) {
                ((n0) arrayList.get(i14)).f7039d += i13;
            }
            n0Var.f7040e = true;
            if (this.f7044a) {
                e(n0Var);
            }
        }
    }

    public o0(e0 e0Var, AnalyticsCollector analyticsCollector, a5.z zVar, e5.o0 o0Var) {
        this.f7045b = o0Var;
        this.f7050g = e0Var;
        this.k = new o5.a1();
        this.f7047d = new IdentityHashMap();
        this.f7048e = new HashMap();
        this.f7046c = new ArrayList();
        this.f7052i = analyticsCollector;
        this.j = zVar;
        this.f7049f = new HashMap();
        this.f7051h = new HashSet();
    }
}

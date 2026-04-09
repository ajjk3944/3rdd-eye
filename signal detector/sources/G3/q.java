package G3;

import a.AbstractC0241a;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.ads.AbstractC0582Jp;
import com.google.android.gms.internal.ads.AbstractC1353j8;
import com.google.android.gms.internal.ads.BinderC0718Rp;
import com.google.android.gms.internal.ads.C0427An;
import com.google.android.gms.internal.ads.C0500Fb;
import com.google.android.gms.internal.ads.C0657Of;
import com.google.android.gms.internal.ads.C0750Tn;
import com.google.android.gms.internal.ads.C0784Vn;
import com.google.android.gms.internal.ads.C0960bu;
import com.google.android.gms.internal.ads.C1231gt;
import com.google.android.gms.internal.ads.C1241h2;
import com.google.android.gms.internal.ads.C1371jQ;
import com.google.android.gms.internal.ads.C1477lO;
import com.google.android.gms.internal.ads.C1531mO;
import com.google.android.gms.internal.ads.C1533mQ;
import com.google.android.gms.internal.ads.C1585nO;
import com.google.android.gms.internal.ads.C1856sQ;
import com.google.android.gms.internal.ads.C2016vO;
import com.google.android.gms.internal.ads.C2179yP;
import com.google.android.gms.internal.ads.C2233zP;
import com.google.android.gms.internal.ads.GO;
import com.google.android.gms.internal.ads.InterfaceC0595Kl;
import com.google.android.gms.internal.ads.InterfaceC0828Yg;
import com.google.android.gms.internal.ads.InterfaceC1695pQ;
import com.google.android.gms.internal.ads.InterfaceC1802rQ;
import com.google.android.gms.internal.ads.InterfaceC1958uK;
import com.google.android.gms.internal.ads.MO;
import com.google.android.gms.internal.ads.OQ;
import com.google.android.gms.internal.ads.Qt;
import com.google.android.gms.internal.ads.Vt;
import com.google.android.gms.internal.ads.XP;
import com.google.android.gms.internal.ads.ZN;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import u2.C2951a;

/* loaded from: classes.dex */
public final class q implements InterfaceC0595Kl {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1636a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1637b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1638c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f1639d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f1640e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f1641f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f1642g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f1643h;
    public final Object i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f1644j;

    /* renamed from: k, reason: collision with root package name */
    public Object f1645k;

    /* renamed from: l, reason: collision with root package name */
    public Object f1646l;

    public q(Context context, C0427An c0427An, C0960bu c0960bu, C2951a c2951a, Qt qt, C0657Of c0657Of, InterfaceC0828Yg interfaceC0828Yg, C0500Fb c0500Fb, boolean z6, BinderC0718Rp binderC0718Rp, C0750Tn c0750Tn, C0784Vn c0784Vn) {
        this.f1637b = context;
        this.f1638c = c0427An;
        this.f1639d = c0960bu;
        this.f1640e = c2951a;
        this.f1641f = qt;
        this.f1642g = c0657Of;
        this.f1643h = interfaceC0828Yg;
        this.i = c0500Fb;
        this.f1636a = z6;
        this.f1644j = binderC0718Rp;
        this.f1645k = c0750Tn;
        this.f1646l = c0784Vn;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v5 */
    public void a(o oVar, float[] fArr, float f2, RectF rectF, U0.j jVar, Path path) {
        boolean z6;
        int i;
        Path path2;
        U0.j jVar2;
        boolean z7;
        InterfaceC0150d c0149c;
        int i3;
        U0.j jVar3 = jVar;
        Path path3 = path;
        Matrix[] matrixArr = (Matrix[]) this.f1639d;
        float[] fArr2 = (float[]) this.f1645k;
        y[] yVarArr = (y[]) this.f1637b;
        Matrix[] matrixArr2 = (Matrix[]) this.f1638c;
        path3.rewind();
        Path path4 = (Path) this.f1641f;
        path4.rewind();
        Path path5 = (Path) this.f1642g;
        path5.rewind();
        path5.addRect(rectF, Path.Direction.CW);
        int i6 = 0;
        while (true) {
            z6 = 0;
            int i7 = 1;
            if (i6 >= 4) {
                break;
            }
            PointF pointF = (PointF) this.f1640e;
            if (fArr == null) {
                c0149c = i6 != 1 ? i6 != 2 ? i6 != 3 ? oVar.f1629f : oVar.f1628e : oVar.f1631h : oVar.f1630g;
            } else {
                c0149c = new C0149c(fArr[i6]);
                i7 = 1;
            }
            AbstractC0241a abstractC0241a = i6 != i7 ? i6 != 2 ? i6 != 3 ? oVar.f1625b : oVar.f1624a : oVar.f1627d : oVar.f1626c;
            Matrix[] matrixArr3 = matrixArr;
            y yVar = yVarArr[i6];
            abstractC0241a.getClass();
            abstractC0241a.c(yVar, f2, c0149c.a(rectF));
            int i8 = i6 + 1;
            float f5 = (i8 % 4) * 90;
            matrixArr2[i6].reset();
            if (i6 == 1) {
                i3 = i8;
                pointF.set(rectF.right, rectF.bottom);
            } else if (i6 == 2) {
                i3 = i8;
                pointF.set(rectF.left, rectF.bottom);
            } else if (i6 != 3) {
                i3 = i8;
                pointF.set(rectF.right, rectF.top);
            } else {
                i3 = i8;
                pointF.set(rectF.left, rectF.top);
            }
            matrixArr2[i6].setTranslate(pointF.x, pointF.y);
            matrixArr2[i6].preRotate(f5);
            y yVar2 = yVarArr[i6];
            fArr2[0] = yVar2.f1667c;
            fArr2[1] = yVar2.f1668d;
            matrixArr2[i6].mapPoints(fArr2);
            matrixArr3[i6].reset();
            matrixArr3[i6].setTranslate(fArr2[0], fArr2[1]);
            matrixArr3[i6].preRotate(f5);
            i6 = i3;
            matrixArr = matrixArr3;
        }
        Matrix[] matrixArr4 = matrixArr;
        char c6 = 1;
        int i9 = 0;
        for (i = 4; i9 < i; i = 4) {
            y yVar3 = yVarArr[i9];
            fArr2[z6] = yVar3.f1665a;
            fArr2[c6] = yVar3.f1666b;
            matrixArr2[i9].mapPoints(fArr2);
            if (i9 == 0) {
                path3.moveTo(fArr2[z6], fArr2[c6]);
            } else {
                path3.lineTo(fArr2[z6], fArr2[c6]);
            }
            yVarArr[i9].b(matrixArr2[i9], path3);
            if (jVar3 != null) {
                y yVar4 = yVarArr[i9];
                Matrix matrix = matrixArr2[i9];
                j jVar4 = (j) jVar3.f3677b;
                BitSet bitSet = jVar4.f1600e;
                yVar4.getClass();
                bitSet.set(i9, z6);
                x[] xVarArr = jVar4.f1598c;
                yVar4.a(yVar4.f1670f);
                xVarArr[i9] = new r(new ArrayList(yVar4.f1672h), new Matrix(matrix));
            }
            Path path6 = (Path) this.f1643h;
            y yVar5 = (y) this.f1644j;
            int i10 = i9 + 1;
            int i11 = i10 % 4;
            y yVar6 = yVarArr[i9];
            y[] yVarArr2 = yVarArr;
            fArr2[0] = yVar6.f1667c;
            fArr2[1] = yVar6.f1668d;
            matrixArr2[i9].mapPoints(fArr2);
            float[] fArr3 = (float[]) this.f1646l;
            y yVar7 = yVarArr2[i11];
            Matrix[] matrixArr5 = matrixArr2;
            fArr3[0] = yVar7.f1665a;
            fArr3[1] = yVar7.f1666b;
            matrixArr5[i11].mapPoints(fArr3);
            float fMax = Math.max(((float) Math.hypot(fArr2[0] - fArr3[0], fArr2[1] - fArr3[1])) - 0.001f, 0.0f);
            y yVar8 = yVarArr2[i9];
            fArr2[0] = yVar8.f1667c;
            fArr2[1] = yVar8.f1668d;
            matrixArr5[i9].mapPoints(fArr2);
            float fAbs = (i9 == 1 || i9 == 3) ? Math.abs(rectF.centerX() - fArr2[0]) : Math.abs(rectF.centerY() - fArr2[1]);
            yVar5.d(0.0f, 0.0f, 270.0f, 0.0f);
            C0152f c0152f = i9 != 1 ? i9 != 2 ? i9 != 3 ? oVar.f1632j : oVar.i : oVar.f1634l : oVar.f1633k;
            c0152f.k(fMax, fAbs, f2, yVar5);
            path6.reset();
            yVar5.b(matrixArr4[i9], path6);
            if (this.f1636a && (c0152f.i() || b(path6, i9) || b(path6, i11))) {
                path6.op(path6, path5, Path.Op.DIFFERENCE);
                fArr2[0] = yVar5.f1665a;
                c6 = 1;
                fArr2[1] = yVar5.f1666b;
                matrixArr4[i9].mapPoints(fArr2);
                path4.moveTo(fArr2[0], fArr2[1]);
                yVar5.b(matrixArr4[i9], path4);
                path2 = path;
            } else {
                c6 = 1;
                path2 = path;
                yVar5.b(matrixArr4[i9], path2);
            }
            if (jVar != null) {
                Matrix matrix2 = matrixArr4[i9];
                jVar2 = jVar;
                j jVar5 = (j) jVar2.f3677b;
                z7 = false;
                jVar5.f1600e.set(i9 + 4, false);
                x[] xVarArr2 = jVar5.f1599d;
                yVar5.a(yVar5.f1670f);
                xVarArr2[i9] = new r(new ArrayList(yVar5.f1672h), new Matrix(matrix2));
            } else {
                jVar2 = jVar;
                z7 = false;
            }
            path3 = path2;
            jVar3 = jVar2;
            i9 = i10;
            z6 = z7;
            yVarArr = yVarArr2;
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

    public boolean b(Path path, int i) {
        Path path2 = (Path) this.i;
        path2.reset();
        ((y[]) this.f1637b)[i].b(((Matrix[]) this.f1638c)[i], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        return !rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0595Kl
    public Qt c() {
        return (Qt) this.f1641f;
    }

    public AbstractC1353j8 d(int i, int i3, List list) {
        ArrayList arrayList = (ArrayList) this.f1638c;
        AbstractC0582Jp.m(i >= 0 && i <= i3 && i3 <= arrayList.size());
        AbstractC0582Jp.m(list.size() == i3 - i);
        for (int i6 = i; i6 < i3; i6++) {
            ((C1585nO) arrayList.get(i6)).f15771a.a((C1241h2) list.get(i6 - i));
        }
        return h();
    }

    public boolean e() {
        return this.f1636a;
    }

    public void f(InterfaceC1958uK interfaceC1958uK) {
        AbstractC0582Jp.h0(!this.f1636a);
        this.f1645k = interfaceC1958uK;
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) this.f1638c;
            if (i >= arrayList.size()) {
                this.f1636a = true;
                return;
            }
            C1585nO c1585nO = (C1585nO) arrayList.get(i);
            o(c1585nO);
            ((HashSet) this.f1643h).add(c1585nO);
            i++;
        }
    }

    public void g(InterfaceC1695pQ interfaceC1695pQ) {
        IdentityHashMap identityHashMap = (IdentityHashMap) this.f1639d;
        C1585nO c1585nO = (C1585nO) identityHashMap.remove(interfaceC1695pQ);
        c1585nO.getClass();
        c1585nO.f15771a.b(interfaceC1695pQ);
        c1585nO.f15773c.remove(((C1371jQ) interfaceC1695pQ).f14943a);
        if (!identityHashMap.isEmpty()) {
            m();
        }
        q(c1585nO);
    }

    public AbstractC1353j8 h() {
        ArrayList arrayList = (ArrayList) this.f1638c;
        if (arrayList.isEmpty()) {
            return AbstractC1353j8.f14909a;
        }
        int iA = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            C1585nO c1585nO = (C1585nO) arrayList.get(i);
            c1585nO.f15774d = iA;
            iA += c1585nO.f15771a.f15623o.f14270b.a();
        }
        return new C2016vO(arrayList, (OQ) this.f1646l);
    }

    public AbstractC1353j8 i(List list, OQ oq) {
        ArrayList arrayList = (ArrayList) this.f1638c;
        n(0, arrayList.size());
        return j(arrayList.size(), list, oq);
    }

    public AbstractC1353j8 j(int i, List list, OQ oq) {
        ArrayList arrayList = (ArrayList) this.f1638c;
        if (!list.isEmpty()) {
            this.f1646l = oq;
            for (int i3 = i; i3 < list.size() + i; i3++) {
                C1585nO c1585nO = (C1585nO) list.get(i3 - i);
                if (i3 > 0) {
                    C1585nO c1585nO2 = (C1585nO) arrayList.get(i3 - 1);
                    c1585nO.f15774d = c1585nO2.f15771a.f15623o.f14270b.a() + c1585nO2.f15774d;
                    c1585nO.f15775e = false;
                    c1585nO.f15773c.clear();
                } else {
                    c1585nO.f15774d = 0;
                    c1585nO.f15775e = false;
                    c1585nO.f15773c.clear();
                }
                int iA = c1585nO.f15771a.f15623o.f14270b.a();
                for (int i6 = i3; i6 < arrayList.size(); i6++) {
                    ((C1585nO) arrayList.get(i6)).f15774d += iA;
                }
                arrayList.add(i3, c1585nO);
                ((HashMap) this.f1640e).put(c1585nO.f15772b, c1585nO);
                if (this.f1636a) {
                    o(c1585nO);
                    if (((IdentityHashMap) this.f1639d).isEmpty()) {
                        ((HashSet) this.f1643h).add(c1585nO);
                    } else {
                        C1531mO c1531mO = (C1531mO) ((HashMap) this.f1642g).get(c1585nO);
                        if (c1531mO != null) {
                            c1531mO.f15615a.p(c1531mO.f15616b);
                        }
                    }
                }
            }
        }
        return h();
    }

    public AbstractC1353j8 k(int i, int i3, OQ oq) {
        boolean z6 = false;
        if (i >= 0 && i <= i3 && i3 <= ((ArrayList) this.f1638c).size()) {
            z6 = true;
        }
        AbstractC0582Jp.m(z6);
        this.f1646l = oq;
        n(i, i3);
        return h();
    }

    public AbstractC1353j8 l(OQ oq) {
        int size = ((ArrayList) this.f1638c).size();
        if (oq.f10200b.length != size) {
            oq = new OQ(new Random(oq.f10199a.nextLong())).a(size);
        }
        this.f1646l = oq;
        return h();
    }

    public void m() {
        Iterator it = ((HashSet) this.f1643h).iterator();
        while (it.hasNext()) {
            C1585nO c1585nO = (C1585nO) it.next();
            if (c1585nO.f15773c.isEmpty()) {
                C1531mO c1531mO = (C1531mO) ((HashMap) this.f1642g).get(c1585nO);
                if (c1531mO != null) {
                    c1531mO.f15615a.p(c1531mO.f15616b);
                }
                it.remove();
            }
        }
    }

    public void n(int i, int i3) {
        ArrayList arrayList = (ArrayList) this.f1638c;
        while (true) {
            i3--;
            if (i3 < i) {
                return;
            }
            C1585nO c1585nO = (C1585nO) arrayList.remove(i3);
            ((HashMap) this.f1640e).remove(c1585nO.f15772b);
            int i6 = -c1585nO.f15771a.f15623o.f14270b.a();
            for (int i7 = i3; i7 < arrayList.size(); i7++) {
                ((C1585nO) arrayList.get(i7)).f15774d += i6;
            }
            c1585nO.f15775e = true;
            if (this.f1636a) {
                q(c1585nO);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.gms.internal.ads.pO, com.google.android.gms.internal.ads.rQ] */
    public void o(C1585nO c1585nO) {
        C1533mQ c1533mQ = c1585nO.f15771a;
        ?? r12 = new InterfaceC1802rQ() { // from class: com.google.android.gms.internal.ads.pO
            @Override // com.google.android.gms.internal.ads.InterfaceC1802rQ
            public final void a(XP xp, AbstractC1353j8 abstractC1353j8) {
                C1231gt c1231gt = ((ZN) this.f16169a.f1641f).f12866h;
                c1231gt.d(2);
                c1231gt.c(22);
            }
        };
        C1477lO c1477lO = new C1477lO(this, c1585nO);
        ((HashMap) this.f1642g).put(c1585nO, new C1531mO(c1533mQ, r12, c1477lO));
        String str = Vt.f12096a;
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null) {
            looperMyLooper = Looper.getMainLooper();
        }
        Handler handler = new Handler(looperMyLooper, null);
        C2233zP c2233zP = c1533mQ.f12424c;
        c2233zP.getClass();
        c2233zP.f17875b.add(new C1856sQ(handler, c1477lO));
        Looper looperMyLooper2 = Looper.myLooper();
        if (looperMyLooper2 == null) {
            looperMyLooper2 = Looper.getMainLooper();
        }
        new Handler(looperMyLooper2, null);
        C2233zP c2233zP2 = c1533mQ.f12425d;
        c2233zP2.getClass();
        c2233zP2.f17875b.add(new C2179yP(c1477lO));
        c1533mQ.n(r12, (InterfaceC1958uK) this.f1645k, (MO) this.f1637b);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00b5  */
    @Override // com.google.android.gms.internal.ads.InterfaceC0595Kl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void p(boolean r23, android.content.Context r24, com.google.android.gms.internal.ads.C1760qk r25) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: G3.q.p(boolean, android.content.Context, com.google.android.gms.internal.ads.qk):void");
    }

    public void q(C1585nO c1585nO) {
        if (c1585nO.f15775e && c1585nO.f15773c.isEmpty()) {
            C1531mO c1531mO = (C1531mO) ((HashMap) this.f1642g).remove(c1585nO);
            c1531mO.getClass();
            XP xp = c1531mO.f15615a;
            xp.q(c1531mO.f15616b);
            C1477lO c1477lO = c1531mO.f15617c;
            xp.l(c1477lO);
            xp.m(c1477lO);
            ((HashSet) this.f1643h).remove(c1585nO);
        }
    }

    public q(ZN zn, GO go, C1231gt c1231gt, MO mo) {
        this.f1637b = mo;
        this.f1641f = zn;
        this.f1646l = new OQ();
        this.f1639d = new IdentityHashMap();
        this.f1640e = new HashMap();
        this.f1638c = new ArrayList();
        this.i = go;
        this.f1644j = c1231gt;
        this.f1642g = new HashMap();
        this.f1643h = new HashSet();
    }

    public q() {
        this.f1637b = new y[4];
        this.f1638c = new Matrix[4];
        this.f1639d = new Matrix[4];
        this.f1640e = new PointF();
        this.f1641f = new Path();
        this.f1642g = new Path();
        this.f1644j = new y();
        this.f1645k = new float[2];
        this.f1646l = new float[2];
        this.f1643h = new Path();
        this.i = new Path();
        this.f1636a = true;
        for (int i = 0; i < 4; i++) {
            ((y[]) this.f1637b)[i] = new y();
            ((Matrix[]) this.f1638c)[i] = new Matrix();
            ((Matrix[]) this.f1639d)[i] = new Matrix();
        }
    }
}

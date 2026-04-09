package R;

import A2.l;
import C.W;
import C.m0;
import G.n;
import G.o;
import N.p;
import N.s;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.impl.H0;
import androidx.camera.core.impl.InterfaceC1698k0;
import androidx.camera.core.impl.J;
import androidx.camera.core.impl.T0;
import androidx.camera.core.impl.U0;
import androidx.camera.core.impl.X;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/* compiled from: VirtualCameraAdapter.java */
/* loaded from: classes.dex */
public final class h implements m0.b {

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f11584b;

    /* renamed from: f, reason: collision with root package name */
    public final U0 f11588f;

    /* renamed from: g, reason: collision with root package name */
    public final J f11589g;

    /* renamed from: h, reason: collision with root package name */
    public final J f11590h;

    /* renamed from: j, reason: collision with root package name */
    public final HashSet f11591j;

    /* renamed from: k, reason: collision with root package name */
    public final HashMap f11592k;

    /* renamed from: l, reason: collision with root package name */
    public final a f11593l;

    /* renamed from: m, reason: collision with root package name */
    public final a f11594m;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f11585c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f11586d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f11587e = new HashMap();
    public final g i = new g(this);

    public h(J j4, J j10, HashSet hashSet, U0 u02, B.d dVar) {
        this.f11589g = j4;
        this.f11590h = j10;
        this.f11588f = u02;
        this.f11584b = hashSet;
        HashMap map = new HashMap();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            m0 m0Var = (m0) it.next();
            map.put(m0Var, m0Var.m(j4.n(), null, m0Var.e(true, u02)));
        }
        this.f11592k = map;
        HashSet hashSet2 = new HashSet(map.values());
        this.f11591j = hashSet2;
        this.f11593l = new a(j4, hashSet2);
        if (this.f11590h != null) {
            this.f11594m = new a(this.f11590h, hashSet2);
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            m0 m0Var2 = (m0) it2.next();
            this.f11587e.put(m0Var2, Boolean.FALSE);
            this.f11586d.put(m0Var2, new f(j4, this, dVar));
        }
    }

    public static void r(s sVar, X x10, H0 h02) {
        sVar.e();
        try {
            n.a();
            sVar.b();
            s.a aVar = sVar.f4442l;
            Objects.requireNonNull(aVar);
            aVar.g(x10, new p(aVar, 0));
        } catch (X.a unused) {
            H0.d dVar = h02.f14883f;
            if (dVar != null) {
                dVar.a(h02, H0.g.SESSION_ERROR_SURFACE_NEEDS_RESET);
            }
        }
    }

    public static X s(m0 m0Var) {
        List<X> listB = m0Var instanceof C.J ? m0Var.f760n.b() : Collections.unmodifiableList(m0Var.f760n.f14884g.f14940a);
        l.q(null, listB.size() <= 1);
        if (listB.size() == 1) {
            return listB.get(0);
        }
        return null;
    }

    @Override // C.m0.b
    public final void c(m0 m0Var) {
        X xS;
        n.a();
        s sVarT = t(m0Var);
        if (u(m0Var) && (xS = s(m0Var)) != null) {
            r(sVarT, xS, m0Var.f760n);
        }
    }

    @Override // C.m0.b
    public final void h(m0 m0Var) {
        n.a();
        if (u(m0Var)) {
            this.f11587e.put(m0Var, Boolean.FALSE);
            s sVarT = t(m0Var);
            n.a();
            sVarT.b();
            sVarT.f4442l.a();
        }
    }

    @Override // C.m0.b
    public final void o(m0 m0Var) {
        n.a();
        if (u(m0Var)) {
            return;
        }
        this.f11587e.put(m0Var, Boolean.TRUE);
        X xS = s(m0Var);
        if (xS != null) {
            r(t(m0Var), xS, m0Var.f760n);
        }
    }

    @Override // C.m0.b
    public final void p(m0 m0Var) {
        n.a();
        if (u(m0Var)) {
            s sVarT = t(m0Var);
            X xS = s(m0Var);
            if (xS != null) {
                r(sVarT, xS, m0Var.f760n);
                return;
            }
            n.a();
            sVarT.b();
            sVarT.f4442l.a();
        }
    }

    public final P.b q(m0 m0Var, a aVar, J j4, s sVar, int i, boolean z10) {
        Size next;
        Size sizeE;
        int iJ = j4.a().j(i);
        Matrix matrix = sVar.f4433b;
        RectF rectF = o.f1843a;
        float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
        matrix.mapVectors(fArr);
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[2];
        float f13 = fArr[3];
        float f14 = (f11 * f13) + (f10 * f12);
        float f15 = (f10 * f13) - (f11 * f12);
        float f16 = (f13 * f13) + (f12 * f12);
        boolean z11 = false;
        double dSqrt = Math.sqrt((f11 * f11) + (f10 * f10)) * Math.sqrt(f16);
        boolean z12 = ((float) Math.toDegrees(Math.atan2(((double) f15) / dSqrt, ((double) f14) / dSqrt))) > 0.0f;
        T0<?> t02 = (T0) this.f11592k.get(m0Var);
        Objects.requireNonNull(t02);
        sVar.f4433b.getValues(new float[9]);
        int iH = o.h((int) Math.round(Math.atan2(r7[3], r7[0]) * 57.29577951308232d));
        aVar.getClass();
        boolean zC = o.c(iH);
        Rect rectA = sVar.f4435d;
        if (zC) {
            rectA = new Rect(rectA.top, rectA.left, rectA.bottom, rectA.right);
            z11 = true;
        }
        if (z10) {
            sizeE = o.e(rectA);
            Iterator<Size> it = aVar.b(t02).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Size sizeE2 = o.e(a.a(it.next(), sizeE));
                if (!a.c(sizeE2, sizeE)) {
                    sizeE = sizeE2;
                    break;
                }
            }
        } else {
            Size sizeE3 = o.e(rectA);
            List<Size> listB = aVar.b(t02);
            Iterator<Size> it2 = listB.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    Iterator<Size> it3 = listB.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            next = sizeE3;
                            break;
                        }
                        Size next2 = it3.next();
                        if (!a.c(next2, sizeE3)) {
                            next = next2;
                            break;
                        }
                    }
                } else {
                    next = it2.next();
                    Rational rationalG = G.a.f1791a;
                    Size size = M.c.f4112c;
                    if (!G.a.a(sizeE3, rationalG, size)) {
                        rationalG = G.a.f1793c;
                        if (!G.a.a(sizeE3, rationalG, size)) {
                            rationalG = a.g(sizeE3);
                        }
                    }
                    if (!aVar.d(rationalG, next) && !a.c(next, sizeE3)) {
                        break;
                    }
                }
            }
            rectA = a.a(sizeE3, next);
            sizeE = next;
        }
        Pair pair = new Pair(rectA, sizeE);
        Rect rect = (Rect) pair.first;
        Size size2 = (Size) pair.second;
        if (z11) {
            Size size3 = new Size(size2.getHeight(), size2.getWidth());
            rect = new Rect(rect.top, rect.left, rect.bottom, rect.right);
            size2 = size3;
        }
        Pair pair2 = new Pair(rect, size2);
        Rect rect2 = (Rect) pair2.first;
        Size size4 = (Size) pair2.second;
        int iJ2 = this.f11589g.a().j(((InterfaceC1698k0) m0Var.f753f).y());
        f fVar = (f) this.f11586d.get(m0Var);
        Objects.requireNonNull(fVar);
        fVar.f11581d.f11600c = iJ2;
        int iH2 = o.h((sVar.i + iJ2) - iJ);
        return new P.b(UUID.randomUUID(), m0Var instanceof W ? 1 : m0Var instanceof C.J ? 4 : 2, m0Var instanceof C.J ? 256 : 34, rect2, o.g(size4, iH2), iH2, m0Var.l(j4) ^ z12);
    }

    public final s t(m0 m0Var) {
        s sVar = (s) this.f11585c.get(m0Var);
        Objects.requireNonNull(sVar);
        return sVar;
    }

    public final boolean u(m0 m0Var) {
        Boolean bool = (Boolean) this.f11587e.get(m0Var);
        Objects.requireNonNull(bool);
        return bool.booleanValue();
    }

    public final void v(HashMap map) {
        HashMap map2 = this.f11585c;
        map2.clear();
        map2.putAll(map);
        for (Map.Entry entry : map2.entrySet()) {
            m0 m0Var = (m0) entry.getKey();
            s sVar = (s) entry.getValue();
            m0Var.z(sVar.f4435d);
            m0Var.y(sVar.f4433b);
            m0Var.f754g = m0Var.w(sVar.f4438g, null);
            m0Var.p();
        }
    }
}

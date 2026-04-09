package R;

import A2.l;
import C.AbstractC0627n;
import C.Q;
import C.X;
import C.k0;
import C.m0;
import G.n;
import G.o;
import N.s;
import N.v;
import N7.B8;
import N7.G8;
import O.j;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.util.Log;
import android.util.Size;
import androidx.camera.core.impl.AbstractC1707p;
import androidx.camera.core.impl.C1701m;
import androidx.camera.core.impl.C1710q0;
import androidx.camera.core.impl.C1717u0;
import androidx.camera.core.impl.H0;
import androidx.camera.core.impl.InterfaceC1694i0;
import androidx.camera.core.impl.InterfaceC1698k0;
import androidx.camera.core.impl.J;
import androidx.camera.core.impl.L0;
import androidx.camera.core.impl.S;
import androidx.camera.core.impl.T0;
import androidx.camera.core.impl.U;
import androidx.camera.core.impl.U0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: StreamSharing.java */
/* loaded from: classes.dex */
public final class c extends m0 {

    /* renamed from: A, reason: collision with root package name */
    public H0.b f11563A;

    /* renamed from: B, reason: collision with root package name */
    public H0.c f11564B;

    /* renamed from: p, reason: collision with root package name */
    public final e f11565p;

    /* renamed from: q, reason: collision with root package name */
    public final h f11566q;

    /* renamed from: r, reason: collision with root package name */
    public final Q f11567r;

    /* renamed from: s, reason: collision with root package name */
    public final Q f11568s;

    /* renamed from: t, reason: collision with root package name */
    public v f11569t;

    /* renamed from: u, reason: collision with root package name */
    public O.j f11570u;

    /* renamed from: v, reason: collision with root package name */
    public s f11571v;

    /* renamed from: w, reason: collision with root package name */
    public s f11572w;

    /* renamed from: x, reason: collision with root package name */
    public s f11573x;

    /* renamed from: y, reason: collision with root package name */
    public s f11574y;

    /* renamed from: z, reason: collision with root package name */
    public H0.b f11575z;

    public c(J j4, J j10, Q q10, Q q11, HashSet hashSet, U0 u02) {
        super(H(hashSet));
        this.f11565p = H(hashSet);
        this.f11567r = q10;
        this.f11568s = q11;
        this.f11566q = new h(j4, j10, hashSet, u02, new B.d(this, 12));
    }

    public static ArrayList G(m0 m0Var) {
        ArrayList arrayList = new ArrayList();
        if (!(m0Var instanceof c)) {
            arrayList.add(m0Var.f753f.A());
            return arrayList;
        }
        Iterator it = ((c) m0Var).f11566q.f11584b.iterator();
        while (it.hasNext()) {
            arrayList.add(((m0) it.next()).f753f.A());
        }
        return arrayList;
    }

    public static e H(HashSet hashSet) {
        C1710q0 c1710q0K = C1710q0.K();
        new d(c1710q0K);
        c1710q0K.N(InterfaceC1694i0.f15057j, 34);
        ArrayList arrayList = new ArrayList();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            m0 m0Var = (m0) it.next();
            if (m0Var.f753f.f(T0.f14968D)) {
                arrayList.add(m0Var.f753f.A());
            } else {
                Log.e("StreamSharing", "A child does not have capture type.");
            }
        }
        c1710q0K.N(e.f11577H, arrayList);
        c1710q0K.N(InterfaceC1698k0.f15077o, 2);
        return new e(C1717u0.J(c1710q0K));
    }

    public final void C() {
        H0.c cVar = this.f11564B;
        if (cVar != null) {
            cVar.b();
            this.f11564B = null;
        }
        s sVar = this.f11571v;
        if (sVar != null) {
            sVar.c();
            this.f11571v = null;
        }
        s sVar2 = this.f11572w;
        if (sVar2 != null) {
            sVar2.c();
            this.f11572w = null;
        }
        s sVar3 = this.f11573x;
        if (sVar3 != null) {
            sVar3.c();
            this.f11573x = null;
        }
        s sVar4 = this.f11574y;
        if (sVar4 != null) {
            sVar4.c();
            this.f11574y = null;
        }
        v vVar = this.f11569t;
        if (vVar != null) {
            vVar.b();
            this.f11569t = null;
        }
        O.j jVar = this.f11570u;
        if (jVar != null) {
            jVar.f10166a.release();
            n.c(new C2.h(jVar, 9));
            this.f11570u = null;
        }
    }

    public final List<H0> D(String str, String str2, T0<?> t02, L0 l02, L0 l03) throws X {
        n.a();
        h hVar = this.f11566q;
        if (l03 == null) {
            E(str, str2, t02, l02, null);
            J jB = b();
            Objects.requireNonNull(jB);
            this.f11569t = new v(jB, new N.j(l02.a()));
            boolean z10 = this.i != null;
            s sVar = this.f11573x;
            int iY = ((InterfaceC1698k0) this.f753f).y();
            hVar.getClass();
            HashMap map = new HashMap();
            Iterator it = hVar.f11584b.iterator();
            while (it.hasNext()) {
                m0 m0Var = (m0) it.next();
                a aVar = hVar.f11593l;
                J j4 = hVar.f11589g;
                h hVar2 = hVar;
                boolean z11 = z10;
                map.put(m0Var, hVar2.q(m0Var, aVar, j4, sVar, iY, z11));
                z10 = z11;
                hVar = hVar2;
            }
            h hVar3 = hVar;
            v.c cVarC = this.f11569t.c(new N.c(this.f11573x, new ArrayList(map.values())));
            HashMap map2 = new HashMap();
            for (Map.Entry entry : map.entrySet()) {
                map2.put((m0) entry.getKey(), cVarC.get(entry.getValue()));
            }
            hVar3.v(map2);
            Object[] objArr = {this.f11575z.d()};
            ArrayList arrayList = new ArrayList(1);
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            return Collections.unmodifiableList(arrayList);
        }
        h hVar4 = hVar;
        E(str, str2, t02, l02, l03);
        Matrix matrix = this.f756j;
        J jH = h();
        Objects.requireNonNull(jH);
        boolean zL = jH.l();
        Size sizeD = l03.d();
        Rect rect = this.i;
        if (rect == null) {
            rect = new Rect(0, 0, sizeD.getWidth(), sizeD.getHeight());
        }
        Rect rect2 = rect;
        J jH2 = h();
        Objects.requireNonNull(jH2);
        int iG = g(jH2, false);
        J jH3 = h();
        Objects.requireNonNull(jH3);
        s sVar2 = new s(3, 34, l03, matrix, zL, rect2, iG, -1, l(jH3));
        this.f11572w = sVar2;
        Objects.requireNonNull(h());
        AbstractC0627n abstractC0627n = this.f759m;
        if (abstractC0627n != null) {
            abstractC0627n.getClass();
            throw null;
        }
        this.f11574y = sVar2;
        H0.b bVarF = F(this.f11572w, t02, l03);
        this.f11563A = bVarF;
        H0.c cVar = this.f11564B;
        if (cVar != null) {
            cVar.b();
        }
        H0.c cVar2 = new H0.c(new b(this, str, str2, t02, l02, l03));
        this.f11564B = cVar2;
        bVarF.f14891f = cVar2;
        this.f11570u = new O.j(b(), h(), new O.h(l02.a(), this.f11567r, this.f11568s));
        boolean z12 = this.i != null;
        s sVar3 = this.f11573x;
        s sVar4 = this.f11574y;
        int iY2 = ((InterfaceC1698k0) this.f753f).y();
        hVar4.getClass();
        HashMap map3 = new HashMap();
        Iterator it2 = hVar4.f11584b.iterator();
        while (it2.hasNext()) {
            m0 m0Var2 = (m0) it2.next();
            h hVar5 = hVar4;
            P.b bVarQ = hVar5.q(m0Var2, hVar4.f11593l, hVar4.f11589g, sVar3, iY2, z12);
            s sVar5 = sVar3;
            J j10 = hVar5.f11590h;
            Objects.requireNonNull(j10);
            s sVar6 = sVar4;
            map3.put(m0Var2, new O.a(bVarQ, hVar5.q(m0Var2, hVar5.f11594m, j10, sVar6, iY2, z12)));
            hVar4 = hVar5;
            sVar4 = sVar6;
            sVar3 = sVar5;
        }
        h hVar6 = hVar4;
        O.j jVar = this.f11570u;
        O.b bVar = new O.b(this.f11573x, this.f11574y, new ArrayList(map3.values()));
        jVar.getClass();
        n.a();
        jVar.f10170e = bVar;
        jVar.f10169d = new j.c();
        O.b bVar2 = jVar.f10170e;
        s sVar7 = bVar2.f10133a;
        s sVar8 = bVar2.f10134b;
        Iterator it3 = bVar2.f10135c.iterator();
        while (it3.hasNext()) {
            O.d dVar = (O.d) it3.next();
            j.c cVar3 = jVar.f10169d;
            P.f fVarA = dVar.a();
            Rect rectA = fVarA.a();
            int iC = fVarA.c();
            boolean zG = fVarA.g();
            Matrix matrix2 = new Matrix();
            l.l(o.d(o.g(o.e(rectA), iC), false, fVarA.d()));
            Size sizeD2 = fVarA.d();
            Rect rect3 = new Rect(0, 0, sizeD2.getWidth(), sizeD2.getHeight());
            C1701m.a aVarF = sVar7.f4438g.f();
            Size sizeD3 = fVarA.d();
            if (sizeD3 == null) {
                throw new NullPointerException("Null resolution");
            }
            aVarF.f15090a = sizeD3;
            cVar3.put(dVar, new s(fVarA.e(), fVarA.b(), aVarF.a(), matrix2, false, rect3, sVar7.i - iC, -1, sVar7.f4436e != zG));
        }
        k0 k0VarD = sVar7.d(jVar.f10167b, true);
        O.h hVar7 = jVar.f10166a;
        hVar7.a(k0VarD);
        hVar7.a(sVar8.d(jVar.f10168c, false));
        for (Map.Entry<O.d, s> entry2 : jVar.f10169d.entrySet()) {
            J j11 = jVar.f10167b;
            J j12 = jVar.f10168c;
            O.j jVar2 = jVar;
            s sVar9 = sVar7;
            s sVar10 = sVar8;
            jVar2.a(j11, j12, sVar9, sVar10, entry2);
            entry2.getValue().a(new O.i(jVar2, j11, j12, sVar9, sVar10, entry2, 0));
            jVar = jVar2;
            sVar7 = sVar9;
            sVar8 = sVar10;
        }
        j.c cVar4 = jVar.f10169d;
        HashMap map4 = new HashMap();
        for (Map.Entry entry3 : map3.entrySet()) {
            map4.put((m0) entry3.getKey(), cVar4.get(entry3.getValue()));
        }
        hVar6.v(map4);
        Object[] objArr2 = {this.f11575z.d(), this.f11563A.d()};
        ArrayList arrayList2 = new ArrayList(2);
        for (int i = 0; i < 2; i++) {
            Object obj2 = objArr2[i];
            Objects.requireNonNull(obj2);
            arrayList2.add(obj2);
        }
        return Collections.unmodifiableList(arrayList2);
    }

    public final void E(String str, String str2, T0<?> t02, L0 l02, L0 l03) {
        Matrix matrix = this.f756j;
        J jB = b();
        Objects.requireNonNull(jB);
        boolean zL = jB.l();
        Size sizeD = l02.d();
        Rect rect = this.i;
        if (rect == null) {
            rect = new Rect(0, 0, sizeD.getWidth(), sizeD.getHeight());
        }
        Rect rect2 = rect;
        J jB2 = b();
        Objects.requireNonNull(jB2);
        int iG = g(jB2, false);
        J jB3 = b();
        Objects.requireNonNull(jB3);
        s sVar = new s(3, 34, l02, matrix, zL, rect2, iG, -1, l(jB3));
        this.f11571v = sVar;
        Objects.requireNonNull(b());
        AbstractC0627n abstractC0627n = this.f759m;
        if (abstractC0627n != null) {
            abstractC0627n.getClass();
            throw null;
        }
        this.f11573x = sVar;
        H0.b bVarF = F(this.f11571v, t02, l02);
        this.f11575z = bVarF;
        H0.c cVar = this.f11564B;
        if (cVar != null) {
            cVar.b();
        }
        H0.c cVar2 = new H0.c(new b(this, str, str2, t02, l02, l03));
        this.f11564B = cVar2;
        bVarF.f14891f = cVar2;
    }

    public final H0.b F(s sVar, T0<?> t02, L0 l02) {
        H0.b bVarE = H0.b.e(t02, l02.d());
        h hVar = this.f11566q;
        Iterator it = hVar.f11584b.iterator();
        int i = -1;
        while (it.hasNext()) {
            int i10 = ((m0) it.next()).f753f.m().f14884g.f14942c;
            Integer numValueOf = Integer.valueOf(i);
            List<Integer> list = H0.i;
            if (list.indexOf(numValueOf) < list.indexOf(Integer.valueOf(i10))) {
                i = i10;
            }
        }
        S.a aVar = bVarE.f14887b;
        if (i != -1) {
            aVar.f14950c = i;
        }
        Size sizeD = l02.d();
        Iterator it2 = hVar.f11584b.iterator();
        while (it2.hasNext()) {
            H0 h0D = H0.b.e(((m0) it2.next()).f753f, sizeD).d();
            S s10 = h0D.f14884g;
            aVar.a(s10.f14944e);
            for (AbstractC1707p abstractC1707p : h0D.f14882e) {
                aVar.b(abstractC1707p);
                ArrayList arrayList = bVarE.f14890e;
                if (!arrayList.contains(abstractC1707p)) {
                    arrayList.add(abstractC1707p);
                }
            }
            for (CameraCaptureSession.StateCallback stateCallback : h0D.f14881d) {
                ArrayList arrayList2 = bVarE.f14889d;
                if (!arrayList2.contains(stateCallback)) {
                    arrayList2.add(stateCallback);
                }
            }
            for (CameraDevice.StateCallback stateCallback2 : h0D.f14880c) {
                ArrayList arrayList3 = bVarE.f14888c;
                if (!arrayList3.contains(stateCallback2)) {
                    arrayList3.add(stateCallback2);
                }
            }
            aVar.c(s10.f14941b);
        }
        sVar.getClass();
        n.a();
        sVar.b();
        l.q("Consumer can only be linked once.", !sVar.f4440j);
        sVar.f4440j = true;
        bVarE.c(sVar.f4442l, l02.a(), -1);
        aVar.b(hVar.i);
        if (l02.c() != null) {
            bVarE.b(l02.c());
        }
        return bVarE;
    }

    @Override // C.m0
    public final T0<?> e(boolean z10, U0 u02) {
        e eVar = this.f11565p;
        eVar.getClass();
        U uA = u02.a(G8.d(eVar), 1);
        if (z10) {
            uA = B8.m(uA, eVar.f11578G);
        }
        if (uA == null) {
            return null;
        }
        return ((d) j(uA)).b();
    }

    @Override // C.m0
    public final Set<Integer> i() {
        HashSet hashSet = new HashSet();
        hashSet.add(3);
        return hashSet;
    }

    @Override // C.m0
    public final T0.a<?, ?, ?> j(U u8) {
        return new d(C1710q0.L(u8));
    }

    @Override // C.m0
    public final void q() {
        h hVar = this.f11566q;
        Iterator it = hVar.f11584b.iterator();
        while (it.hasNext()) {
            m0 m0Var = (m0) it.next();
            f fVar = (f) hVar.f11586d.get(m0Var);
            Objects.requireNonNull(fVar);
            m0Var.a(fVar, null, null, m0Var.e(true, hVar.f11588f));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x016e  */
    @Override // C.m0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.camera.core.impl.T0<?> s(androidx.camera.core.impl.I r13, androidx.camera.core.impl.T0.a<?, ?, ?> r14) {
        /*
            Method dump skipped, instructions count: 564
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: R.c.s(androidx.camera.core.impl.I, androidx.camera.core.impl.T0$a):androidx.camera.core.impl.T0");
    }

    @Override // C.m0
    public final void t() {
        Iterator it = this.f11566q.f11584b.iterator();
        while (it.hasNext()) {
            m0 m0Var = (m0) it.next();
            m0Var.t();
            m0Var.r();
        }
    }

    @Override // C.m0
    public final void u() {
        Iterator it = this.f11566q.f11584b.iterator();
        while (it.hasNext()) {
            ((m0) it.next()).u();
        }
    }

    @Override // C.m0
    public final C1701m v(U u8) {
        this.f11575z.f14887b.c(u8);
        Object[] objArr = {this.f11575z.d()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        B(Collections.unmodifiableList(arrayList));
        C1701m.a aVarF = this.f754g.f();
        aVarF.f15093d = u8;
        return aVarF.a();
    }

    @Override // C.m0
    public final L0 w(L0 l02, L0 l03) {
        B(D(d(), h() == null ? null : h().n().d(), this.f753f, l02, l03));
        n();
        return l02;
    }

    @Override // C.m0
    public final void x() {
        C();
        h hVar = this.f11566q;
        Iterator it = hVar.f11584b.iterator();
        while (it.hasNext()) {
            m0 m0Var = (m0) it.next();
            f fVar = (f) hVar.f11586d.get(m0Var);
            Objects.requireNonNull(fVar);
            m0Var.A(fVar);
        }
    }
}

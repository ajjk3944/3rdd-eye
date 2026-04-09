package L0;

import G3.C0152f;
import a.AbstractC0241a;
import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.ads.AbstractC1135f5;
import java.util.ArrayList;
import x.AbstractC2984e;

/* renamed from: L0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0156a extends l {

    /* renamed from: R, reason: collision with root package name */
    public int f2420R;

    /* renamed from: P, reason: collision with root package name */
    public ArrayList f2418P = new ArrayList();

    /* renamed from: Q, reason: collision with root package name */
    public boolean f2419Q = true;

    /* renamed from: S, reason: collision with root package name */
    public boolean f2421S = false;

    /* renamed from: T, reason: collision with root package name */
    public int f2422T = 0;

    public C0156a() {
        M(1);
        J(new g(2));
        J(new C0160e());
        J(new g(1));
    }

    @Override // L0.l
    public final void A() {
        if (this.f2418P.isEmpty()) {
            H();
            m();
            return;
        }
        q qVar = new q();
        qVar.f2486b = this;
        ArrayList arrayList = this.f2418P;
        int size = arrayList.size();
        int i = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ((l) obj).a(qVar);
        }
        this.f2420R = this.f2418P.size();
        if (this.f2419Q) {
            ArrayList arrayList2 = this.f2418P;
            int size2 = arrayList2.size();
            while (i < size2) {
                Object obj2 = arrayList2.get(i);
                i++;
                ((l) obj2).A();
            }
            return;
        }
        for (int i6 = 1; i6 < this.f2418P.size(); i6++) {
            ((l) this.f2418P.get(i6 - 1)).a(new q((l) this.f2418P.get(i6)));
        }
        l lVar = (l) this.f2418P.get(0);
        if (lVar != null) {
            lVar.A();
        }
    }

    @Override // L0.l
    public final void C(AbstractC0241a abstractC0241a) {
        this.f2422T |= 8;
        int size = this.f2418P.size();
        for (int i = 0; i < size; i++) {
            ((l) this.f2418P.get(i)).C(abstractC0241a);
        }
    }

    @Override // L0.l
    public final void E(C0152f c0152f) {
        super.E(c0152f);
        this.f2422T |= 4;
        if (this.f2418P != null) {
            for (int i = 0; i < this.f2418P.size(); i++) {
                ((l) this.f2418P.get(i)).E(c0152f);
            }
        }
    }

    @Override // L0.l
    public final void F() {
        this.f2422T |= 2;
        int size = this.f2418P.size();
        for (int i = 0; i < size; i++) {
            ((l) this.f2418P.get(i)).F();
        }
    }

    @Override // L0.l
    public final void G(long j6) {
        this.f2466b = j6;
    }

    @Override // L0.l
    public final String I(String str) {
        String strI = super.I(str);
        for (int i = 0; i < this.f2418P.size(); i++) {
            StringBuilder sbB = AbstractC2984e.b(strI, "\n");
            sbB.append(((l) this.f2418P.get(i)).I(str + "  "));
            strI = sbB.toString();
        }
        return strI;
    }

    public final void J(l lVar) {
        this.f2418P.add(lVar);
        lVar.f2473j = this;
        long j6 = this.f2467c;
        if (j6 >= 0) {
            lVar.B(j6);
        }
        if ((this.f2422T & 1) != 0) {
            lVar.D(this.f2468d);
        }
        if ((this.f2422T & 2) != 0) {
            lVar.F();
        }
        if ((this.f2422T & 4) != 0) {
            lVar.E(this.f2464K);
        }
        if ((this.f2422T & 8) != 0) {
            lVar.C(null);
        }
    }

    @Override // L0.l
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public final void B(long j6) {
        ArrayList arrayList;
        this.f2467c = j6;
        if (j6 < 0 || (arrayList = this.f2418P) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((l) this.f2418P.get(i)).B(j6);
        }
    }

    @Override // L0.l
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public final void D(TimeInterpolator timeInterpolator) {
        this.f2422T |= 1;
        ArrayList arrayList = this.f2418P;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((l) this.f2418P.get(i)).D(timeInterpolator);
            }
        }
        this.f2468d = timeInterpolator;
    }

    public final void M(int i) {
        if (i == 0) {
            this.f2419Q = true;
        } else {
            if (i != 1) {
                throw new AndroidRuntimeException(AbstractC1135f5.l(i, "Invalid parameter for TransitionSet ordering: "));
            }
            this.f2419Q = false;
        }
    }

    @Override // L0.l
    public final void c() {
        super.c();
        int size = this.f2418P.size();
        for (int i = 0; i < size; i++) {
            ((l) this.f2418P.get(i)).c();
        }
    }

    @Override // L0.l
    public final void d(t tVar) {
        if (u(tVar.f2489b)) {
            ArrayList arrayList = this.f2418P;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                l lVar = (l) obj;
                if (lVar.u(tVar.f2489b)) {
                    lVar.d(tVar);
                    tVar.f2490c.add(lVar);
                }
            }
        }
    }

    @Override // L0.l
    public final void f(t tVar) {
        int size = this.f2418P.size();
        for (int i = 0; i < size; i++) {
            ((l) this.f2418P.get(i)).f(tVar);
        }
    }

    @Override // L0.l
    public final void g(t tVar) {
        if (u(tVar.f2489b)) {
            ArrayList arrayList = this.f2418P;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                l lVar = (l) obj;
                if (lVar.u(tVar.f2489b)) {
                    lVar.g(tVar);
                    tVar.f2490c.add(lVar);
                }
            }
        }
    }

    @Override // L0.l
    /* renamed from: j */
    public final l clone() {
        C0156a c0156a = (C0156a) super.clone();
        c0156a.f2418P = new ArrayList();
        int size = this.f2418P.size();
        for (int i = 0; i < size; i++) {
            l lVarClone = ((l) this.f2418P.get(i)).clone();
            c0156a.f2418P.add(lVarClone);
            lVarClone.f2473j = c0156a;
        }
        return c0156a;
    }

    @Override // L0.l
    public final void l(ViewGroup viewGroup, c1.g gVar, c1.g gVar2, ArrayList arrayList, ArrayList arrayList2) {
        long j6 = this.f2466b;
        int size = this.f2418P.size();
        for (int i = 0; i < size; i++) {
            l lVar = (l) this.f2418P.get(i);
            if (j6 > 0 && (this.f2419Q || i == 0)) {
                long j7 = lVar.f2466b;
                if (j7 > 0) {
                    lVar.G(j7 + j6);
                } else {
                    lVar.G(j6);
                }
            }
            lVar.l(viewGroup, gVar, gVar2, arrayList, arrayList2);
        }
    }

    @Override // L0.l
    public final void n() {
        for (int i = 0; i < this.f2418P.size(); i++) {
            ((l) this.f2418P.get(i)).n();
        }
        super.n();
    }

    @Override // L0.l
    public final void x(View view) {
        super.x(view);
        int size = this.f2418P.size();
        for (int i = 0; i < size; i++) {
            ((l) this.f2418P.get(i)).x(view);
        }
    }

    @Override // L0.l
    public final l y(j jVar) {
        super.y(jVar);
        return this;
    }

    @Override // L0.l
    public final void z(View view) {
        super.z(view);
        int size = this.f2418P.size();
        for (int i = 0; i < size; i++) {
            ((l) this.f2418P.get(i)).z(view);
        }
    }
}

package t7;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class a extends q {

    /* renamed from: b0, reason: collision with root package name */
    public int f22454b0;
    public ArrayList Z = new ArrayList();

    /* renamed from: a0, reason: collision with root package name */
    public boolean f22453a0 = true;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f22455c0 = false;

    /* renamed from: d0, reason: collision with root package name */
    public int f22456d0 = 0;

    public a() {
        P(1);
        M(new g(2));
        M(new e());
        M(new g(1));
    }

    @Override // t7.q
    public final q A(o oVar) {
        super.A(oVar);
        return this;
    }

    @Override // t7.q
    public final void B(View view) {
        super.B(view);
        int size = this.Z.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((q) this.Z.get(i10)).B(view);
        }
    }

    @Override // t7.q
    public final void C() {
        if (this.Z.isEmpty()) {
            K();
            m();
            return;
        }
        v vVar = new v();
        vVar.f22526b = this;
        Iterator it = this.Z.iterator();
        while (it.hasNext()) {
            ((q) it.next()).a(vVar);
        }
        this.f22454b0 = this.Z.size();
        if (this.f22453a0) {
            Iterator it2 = this.Z.iterator();
            while (it2.hasNext()) {
                ((q) it2.next()).C();
            }
            return;
        }
        for (int i10 = 1; i10 < this.Z.size(); i10++) {
            ((q) this.Z.get(i10 - 1)).a(new v((q) this.Z.get(i10), 2));
        }
        q qVar = (q) this.Z.get(0);
        if (qVar != null) {
            qVar.C();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    @Override // t7.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void D(long r20, long r22) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t7.a.D(long, long):void");
    }

    @Override // t7.q
    public final void F(xu.d dVar) {
        this.f22456d0 |= 8;
        int size = this.Z.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((q) this.Z.get(i10)).F(dVar);
        }
    }

    @Override // t7.q
    public final void H(df.c cVar) {
        super.H(cVar);
        this.f22456d0 |= 4;
        if (this.Z != null) {
            for (int i10 = 0; i10 < this.Z.size(); i10++) {
                ((q) this.Z.get(i10)).H(cVar);
            }
        }
    }

    @Override // t7.q
    public final void I() {
        this.f22456d0 |= 2;
        int size = this.Z.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((q) this.Z.get(i10)).I();
        }
    }

    @Override // t7.q
    public final void J(long j) {
        this.f22513d = j;
    }

    @Override // t7.q
    public final String L(String str) {
        String strL = super.L(str);
        for (int i10 = 0; i10 < this.Z.size(); i10++) {
            StringBuilder sbL = w.g.l(strL, "\n");
            sbL.append(((q) this.Z.get(i10)).L(str + "  "));
            strL = sbL.toString();
        }
        return strL;
    }

    public final void M(q qVar) {
        this.Z.add(qVar);
        qVar.F = this;
        long j = this.f22514g;
        if (j >= 0) {
            qVar.E(j);
        }
        if ((this.f22456d0 & 1) != 0) {
            qVar.G(this.f22515r);
        }
        if ((this.f22456d0 & 2) != 0) {
            qVar.I();
        }
        if ((this.f22456d0 & 4) != 0) {
            qVar.H(this.S);
        }
        if ((this.f22456d0 & 8) != 0) {
            qVar.F(null);
        }
    }

    @Override // t7.q
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public final void E(long j) {
        ArrayList arrayList;
        this.f22514g = j;
        if (j < 0 || (arrayList = this.Z) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((q) this.Z.get(i10)).E(j);
        }
    }

    @Override // t7.q
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public final void G(TimeInterpolator timeInterpolator) {
        this.f22456d0 |= 1;
        ArrayList arrayList = this.Z;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((q) this.Z.get(i10)).G(timeInterpolator);
            }
        }
        this.f22515r = timeInterpolator;
    }

    public final void P(int i10) {
        if (i10 == 0) {
            this.f22453a0 = true;
        } else {
            if (i10 != 1) {
                throw new AndroidRuntimeException(h0.b.h(i10, "Invalid parameter for TransitionSet ordering: "));
            }
            this.f22453a0 = false;
        }
    }

    @Override // t7.q
    public final void c() {
        super.c();
        int size = this.Z.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((q) this.Z.get(i10)).c();
        }
    }

    @Override // t7.q
    public final void d(y yVar) {
        View view = yVar.f22529b;
        if (v(view)) {
            Iterator it = this.Z.iterator();
            while (it.hasNext()) {
                q qVar = (q) it.next();
                if (qVar.v(view)) {
                    qVar.d(yVar);
                    yVar.f22530c.add(qVar);
                }
            }
        }
    }

    @Override // t7.q
    public final void f(y yVar) {
        int size = this.Z.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((q) this.Z.get(i10)).f(yVar);
        }
    }

    @Override // t7.q
    public final void g(y yVar) {
        View view = yVar.f22529b;
        if (v(view)) {
            Iterator it = this.Z.iterator();
            while (it.hasNext()) {
                q qVar = (q) it.next();
                if (qVar.v(view)) {
                    qVar.g(yVar);
                    yVar.f22530c.add(qVar);
                }
            }
        }
    }

    @Override // t7.q
    /* renamed from: j */
    public final q clone() {
        a aVar = (a) super.clone();
        aVar.Z = new ArrayList();
        int size = this.Z.size();
        for (int i10 = 0; i10 < size; i10++) {
            q qVarClone = ((q) this.Z.get(i10)).clone();
            aVar.Z.add(qVarClone);
            qVarClone.F = aVar;
        }
        return aVar;
    }

    @Override // t7.q
    public final void l(ViewGroup viewGroup, js.e eVar, js.e eVar2, ArrayList arrayList, ArrayList arrayList2) {
        long j = this.f22513d;
        int size = this.Z.size();
        for (int i10 = 0; i10 < size; i10++) {
            q qVar = (q) this.Z.get(i10);
            if (j > 0 && (this.f22453a0 || i10 == 0)) {
                long j7 = qVar.f22513d;
                if (j7 > 0) {
                    qVar.J(j7 + j);
                } else {
                    qVar.J(j);
                }
            }
            qVar.l(viewGroup, eVar, eVar2, arrayList, arrayList2);
        }
    }

    @Override // t7.q
    public final void n() {
        for (int i10 = 0; i10 < this.Z.size(); i10++) {
            ((q) this.Z.get(i10)).n();
        }
        super.n();
    }

    @Override // t7.q
    public final boolean t() {
        for (int i10 = 0; i10 < this.Z.size(); i10++) {
            if (((q) this.Z.get(i10)).t()) {
                return true;
            }
        }
        return false;
    }

    @Override // t7.q
    public final void y(View view) {
        super.y(view);
        int size = this.Z.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((q) this.Z.get(i10)).y(view);
        }
    }

    @Override // t7.q
    public final void z() {
        this.T = 0L;
        int i10 = 0;
        v vVar = new v(this, i10);
        while (i10 < this.Z.size()) {
            q qVar = (q) this.Z.get(i10);
            qVar.a(vVar);
            qVar.z();
            long j = qVar.T;
            if (this.f22453a0) {
                this.T = Math.max(this.T, j);
            } else {
                long j7 = this.T;
                qVar.U = j7;
                this.T = j7 + j;
            }
            i10++;
        }
    }
}

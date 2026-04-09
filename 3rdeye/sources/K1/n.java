package K1;

import K1.i;
import N7.G8;
import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import g0.C4356c;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: TransitionSet.java */
/* loaded from: classes.dex */
public class n extends i {

    /* renamed from: E, reason: collision with root package name */
    public int f3025E;

    /* renamed from: C, reason: collision with root package name */
    public ArrayList<i> f3023C = new ArrayList<>();

    /* renamed from: D, reason: collision with root package name */
    public boolean f3024D = true;

    /* renamed from: F, reason: collision with root package name */
    public boolean f3026F = false;

    /* renamed from: G, reason: collision with root package name */
    public int f3027G = 0;

    /* compiled from: TransitionSet.java */
    public class a extends l {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i f3028a;

        public a(i iVar) {
            this.f3028a = iVar;
        }

        @Override // K1.i.d
        public final void a(i iVar) {
            this.f3028a.D();
            iVar.z(this);
        }
    }

    /* compiled from: TransitionSet.java */
    public static class b extends l {

        /* renamed from: a, reason: collision with root package name */
        public n f3029a;

        @Override // K1.i.d
        public final void a(i iVar) {
            n nVar = this.f3029a;
            int i = nVar.f3025E - 1;
            nVar.f3025E = i;
            if (i == 0) {
                nVar.f3026F = false;
                nVar.o();
            }
            iVar.z(this);
        }

        @Override // K1.l, K1.i.d
        public final void b(i iVar) {
            n nVar = this.f3029a;
            if (nVar.f3026F) {
                return;
            }
            nVar.K();
            nVar.f3026F = true;
        }
    }

    @Override // K1.i
    public final void B(View view) {
        for (int i = 0; i < this.f3023C.size(); i++) {
            this.f3023C.get(i).B(view);
        }
        this.f2984g.remove(view);
    }

    @Override // K1.i
    public final void C(View view) {
        super.C(view);
        int size = this.f3023C.size();
        for (int i = 0; i < size; i++) {
            this.f3023C.get(i).C(view);
        }
    }

    @Override // K1.i
    public final void D() {
        if (this.f3023C.isEmpty()) {
            K();
            o();
            return;
        }
        b bVar = new b();
        bVar.f3029a = this;
        Iterator<i> it = this.f3023C.iterator();
        while (it.hasNext()) {
            it.next().a(bVar);
        }
        this.f3025E = this.f3023C.size();
        if (this.f3024D) {
            Iterator<i> it2 = this.f3023C.iterator();
            while (it2.hasNext()) {
                it2.next().D();
            }
            return;
        }
        for (int i = 1; i < this.f3023C.size(); i++) {
            this.f3023C.get(i - 1).a(new a(this.f3023C.get(i)));
        }
        i iVar = this.f3023C.get(0);
        if (iVar != null) {
            iVar.D();
        }
    }

    @Override // K1.i
    public final void F(i.c cVar) {
        this.f2999w = cVar;
        this.f3027G |= 8;
        int size = this.f3023C.size();
        for (int i = 0; i < size; i++) {
            this.f3023C.get(i).F(cVar);
        }
    }

    @Override // K1.i
    public final void G(TimeInterpolator timeInterpolator) {
        this.f3027G |= 1;
        ArrayList<i> arrayList = this.f3023C;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f3023C.get(i).G(timeInterpolator);
            }
        }
        this.f2982e = timeInterpolator;
    }

    @Override // K1.i
    public final void H(i.a aVar) {
        super.H(aVar);
        this.f3027G |= 4;
        if (this.f3023C != null) {
            for (int i = 0; i < this.f3023C.size(); i++) {
                this.f3023C.get(i).H(aVar);
            }
        }
    }

    @Override // K1.i
    public final void I() {
        this.f3027G |= 2;
        int size = this.f3023C.size();
        for (int i = 0; i < size; i++) {
            this.f3023C.get(i).I();
        }
    }

    @Override // K1.i
    public final void J(long j4) {
        this.f2980c = j4;
    }

    @Override // K1.i
    public final String L(String str) {
        String strL = super.L(str);
        for (int i = 0; i < this.f3023C.size(); i++) {
            StringBuilder sbV = G8.v(strL, "\n");
            sbV.append(this.f3023C.get(i).L(str + "  "));
            strL = sbV.toString();
        }
        return strL;
    }

    public final void M(i iVar) {
        this.f3023C.add(iVar);
        iVar.f2986j = this;
        long j4 = this.f2981d;
        if (j4 >= 0) {
            iVar.E(j4);
        }
        if ((this.f3027G & 1) != 0) {
            iVar.G(this.f2982e);
        }
        if ((this.f3027G & 2) != 0) {
            iVar.I();
        }
        if ((this.f3027G & 4) != 0) {
            iVar.H(this.f3000x);
        }
        if ((this.f3027G & 8) != 0) {
            iVar.F(this.f2999w);
        }
    }

    @Override // K1.i
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public final void E(long j4) {
        ArrayList<i> arrayList;
        this.f2981d = j4;
        if (j4 < 0 || (arrayList = this.f3023C) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            this.f3023C.get(i).E(j4);
        }
    }

    public final void O(int i) {
        if (i == 0) {
            this.f3024D = true;
        } else {
            if (i != 1) {
                throw new AndroidRuntimeException(C4356c.h(i, "Invalid parameter for TransitionSet ordering: "));
            }
            this.f3024D = false;
        }
    }

    @Override // K1.i
    public final void b(int i) {
        for (int i10 = 0; i10 < this.f3023C.size(); i10++) {
            this.f3023C.get(i10).b(i);
        }
        super.b(i);
    }

    @Override // K1.i
    public final void cancel() {
        super.cancel();
        int size = this.f3023C.size();
        for (int i = 0; i < size; i++) {
            this.f3023C.get(i).cancel();
        }
    }

    @Override // K1.i
    public final void d(View view) {
        for (int i = 0; i < this.f3023C.size(); i++) {
            this.f3023C.get(i).d(view);
        }
        this.f2984g.add(view);
    }

    @Override // K1.i
    public final void f(p pVar) {
        if (w(pVar.f3032b)) {
            Iterator<i> it = this.f3023C.iterator();
            while (it.hasNext()) {
                i next = it.next();
                if (next.w(pVar.f3032b)) {
                    next.f(pVar);
                    pVar.f3033c.add(next);
                }
            }
        }
    }

    @Override // K1.i
    public final void h(p pVar) {
        int size = this.f3023C.size();
        for (int i = 0; i < size; i++) {
            this.f3023C.get(i).h(pVar);
        }
    }

    @Override // K1.i
    public final void i(p pVar) {
        if (w(pVar.f3032b)) {
            Iterator<i> it = this.f3023C.iterator();
            while (it.hasNext()) {
                i next = it.next();
                if (next.w(pVar.f3032b)) {
                    next.i(pVar);
                    pVar.f3033c.add(next);
                }
            }
        }
    }

    @Override // K1.i
    /* renamed from: l */
    public final i clone() {
        n nVar = (n) super.clone();
        nVar.f3023C = new ArrayList<>();
        int size = this.f3023C.size();
        for (int i = 0; i < size; i++) {
            i iVarClone = this.f3023C.get(i).clone();
            nVar.f3023C.add(iVarClone);
            iVarClone.f2986j = nVar;
        }
        return nVar;
    }

    @Override // K1.i
    public final void n(ViewGroup viewGroup, q qVar, q qVar2, ArrayList<p> arrayList, ArrayList<p> arrayList2) {
        long j4 = this.f2980c;
        int size = this.f3023C.size();
        for (int i = 0; i < size; i++) {
            i iVar = this.f3023C.get(i);
            if (j4 > 0 && (this.f3024D || i == 0)) {
                long j10 = iVar.f2980c;
                if (j10 > 0) {
                    iVar.J(j10 + j4);
                } else {
                    iVar.J(j4);
                }
            }
            iVar.n(viewGroup, qVar, qVar2, arrayList, arrayList2);
        }
    }

    @Override // K1.i
    public final void p(ViewGroup viewGroup) {
        super.p(viewGroup);
        int size = this.f3023C.size();
        for (int i = 0; i < size; i++) {
            this.f3023C.get(i).p(viewGroup);
        }
    }

    @Override // K1.i
    public final void y(ViewGroup viewGroup) {
        super.y(viewGroup);
        int size = this.f3023C.size();
        for (int i = 0; i < size; i++) {
            this.f3023C.get(i).y(viewGroup);
        }
    }

    @Override // K1.i
    public final i z(i.d dVar) {
        super.z(dVar);
        return this;
    }
}

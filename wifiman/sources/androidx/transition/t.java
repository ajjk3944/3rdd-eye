package androidx.transition;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.AbstractC4036k;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class t extends AbstractC4036k {

    /* renamed from: f1, reason: collision with root package name */
    int f32509f1;

    /* renamed from: Y, reason: collision with root package name */
    ArrayList f32507Y = new ArrayList();

    /* renamed from: Z, reason: collision with root package name */
    private boolean f32508Z = true;

    /* renamed from: g1, reason: collision with root package name */
    boolean f32510g1 = false;

    /* renamed from: h1, reason: collision with root package name */
    private int f32511h1 = 0;

    class a extends q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC4036k f32512a;

        a(AbstractC4036k abstractC4036k) {
            this.f32512a = abstractC4036k;
        }

        @Override // androidx.transition.AbstractC4036k.f
        public void d(AbstractC4036k abstractC4036k) {
            this.f32512a.f0();
            abstractC4036k.a0(this);
        }
    }

    static class b extends q {

        /* renamed from: a, reason: collision with root package name */
        t f32514a;

        b(t tVar) {
            this.f32514a = tVar;
        }

        @Override // androidx.transition.q, androidx.transition.AbstractC4036k.f
        public void a(AbstractC4036k abstractC4036k) {
            t tVar = this.f32514a;
            if (tVar.f32510g1) {
                return;
            }
            tVar.m0();
            this.f32514a.f32510g1 = true;
        }

        @Override // androidx.transition.AbstractC4036k.f
        public void d(AbstractC4036k abstractC4036k) {
            t tVar = this.f32514a;
            int i10 = tVar.f32509f1 - 1;
            tVar.f32509f1 = i10;
            if (i10 == 0) {
                tVar.f32510g1 = false;
                tVar.r();
            }
            abstractC4036k.a0(this);
        }
    }

    private void B0() {
        b bVar = new b(this);
        Iterator it = this.f32507Y.iterator();
        while (it.hasNext()) {
            ((AbstractC4036k) it.next()).b(bVar);
        }
        this.f32509f1 = this.f32507Y.size();
    }

    private void s0(AbstractC4036k abstractC4036k) {
        this.f32507Y.add(abstractC4036k);
        abstractC4036k.f32477r = this;
    }

    @Override // androidx.transition.AbstractC4036k
    /* renamed from: A0, reason: merged with bridge method [inline-methods] */
    public t l0(long j10) {
        return (t) super.l0(j10);
    }

    @Override // androidx.transition.AbstractC4036k
    public void Y(View view) {
        super.Y(view);
        int size = this.f32507Y.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((AbstractC4036k) this.f32507Y.get(i10)).Y(view);
        }
    }

    @Override // androidx.transition.AbstractC4036k
    protected void cancel() {
        super.cancel();
        int size = this.f32507Y.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((AbstractC4036k) this.f32507Y.get(i10)).cancel();
        }
    }

    @Override // androidx.transition.AbstractC4036k
    public void d0(View view) {
        super.d0(view);
        int size = this.f32507Y.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((AbstractC4036k) this.f32507Y.get(i10)).d0(view);
        }
    }

    @Override // androidx.transition.AbstractC4036k
    protected void f0() {
        if (this.f32507Y.isEmpty()) {
            m0();
            r();
            return;
        }
        B0();
        if (this.f32508Z) {
            Iterator it = this.f32507Y.iterator();
            while (it.hasNext()) {
                ((AbstractC4036k) it.next()).f0();
            }
            return;
        }
        for (int i10 = 1; i10 < this.f32507Y.size(); i10++) {
            ((AbstractC4036k) this.f32507Y.get(i10 - 1)).b(new a((AbstractC4036k) this.f32507Y.get(i10)));
        }
        AbstractC4036k abstractC4036k = (AbstractC4036k) this.f32507Y.get(0);
        if (abstractC4036k != null) {
            abstractC4036k.f0();
        }
    }

    @Override // androidx.transition.AbstractC4036k
    public void h(v vVar) {
        if (O(vVar.f32517b)) {
            Iterator it = this.f32507Y.iterator();
            while (it.hasNext()) {
                AbstractC4036k abstractC4036k = (AbstractC4036k) it.next();
                if (abstractC4036k.O(vVar.f32517b)) {
                    abstractC4036k.h(vVar);
                    vVar.f32518c.add(abstractC4036k);
                }
            }
        }
    }

    @Override // androidx.transition.AbstractC4036k
    public void h0(AbstractC4036k.e eVar) {
        super.h0(eVar);
        this.f32511h1 |= 8;
        int size = this.f32507Y.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((AbstractC4036k) this.f32507Y.get(i10)).h0(eVar);
        }
    }

    @Override // androidx.transition.AbstractC4036k
    public void j0(AbstractC4032g abstractC4032g) {
        super.j0(abstractC4032g);
        this.f32511h1 |= 4;
        if (this.f32507Y != null) {
            for (int i10 = 0; i10 < this.f32507Y.size(); i10++) {
                ((AbstractC4036k) this.f32507Y.get(i10)).j0(abstractC4032g);
            }
        }
    }

    @Override // androidx.transition.AbstractC4036k
    void k(v vVar) {
        super.k(vVar);
        int size = this.f32507Y.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((AbstractC4036k) this.f32507Y.get(i10)).k(vVar);
        }
    }

    @Override // androidx.transition.AbstractC4036k
    public void k0(s sVar) {
        super.k0(sVar);
        this.f32511h1 |= 2;
        int size = this.f32507Y.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((AbstractC4036k) this.f32507Y.get(i10)).k0(sVar);
        }
    }

    @Override // androidx.transition.AbstractC4036k
    public void l(v vVar) {
        if (O(vVar.f32517b)) {
            Iterator it = this.f32507Y.iterator();
            while (it.hasNext()) {
                AbstractC4036k abstractC4036k = (AbstractC4036k) it.next();
                if (abstractC4036k.O(vVar.f32517b)) {
                    abstractC4036k.l(vVar);
                    vVar.f32518c.add(abstractC4036k);
                }
            }
        }
    }

    @Override // androidx.transition.AbstractC4036k
    String n0(String str) {
        String strN0 = super.n0(str);
        for (int i10 = 0; i10 < this.f32507Y.size(); i10++) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(strN0);
            sb2.append("\n");
            sb2.append(((AbstractC4036k) this.f32507Y.get(i10)).n0(str + "  "));
            strN0 = sb2.toString();
        }
        return strN0;
    }

    @Override // androidx.transition.AbstractC4036k
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public AbstractC4036k clone() {
        t tVar = (t) super.clone();
        tVar.f32507Y = new ArrayList();
        int size = this.f32507Y.size();
        for (int i10 = 0; i10 < size; i10++) {
            tVar.s0(((AbstractC4036k) this.f32507Y.get(i10)).clone());
        }
        return tVar;
    }

    @Override // androidx.transition.AbstractC4036k
    /* renamed from: o0, reason: merged with bridge method [inline-methods] */
    public t b(AbstractC4036k.f fVar) {
        return (t) super.b(fVar);
    }

    @Override // androidx.transition.AbstractC4036k
    /* renamed from: p0, reason: merged with bridge method [inline-methods] */
    public t c(View view) {
        for (int i10 = 0; i10 < this.f32507Y.size(); i10++) {
            ((AbstractC4036k) this.f32507Y.get(i10)).c(view);
        }
        return (t) super.c(view);
    }

    @Override // androidx.transition.AbstractC4036k
    void q(ViewGroup viewGroup, w wVar, w wVar2, ArrayList arrayList, ArrayList arrayList2) {
        long jF = F();
        int size = this.f32507Y.size();
        for (int i10 = 0; i10 < size; i10++) {
            AbstractC4036k abstractC4036k = (AbstractC4036k) this.f32507Y.get(i10);
            if (jF > 0 && (this.f32508Z || i10 == 0)) {
                long jF2 = abstractC4036k.F();
                if (jF2 > 0) {
                    abstractC4036k.l0(jF2 + jF);
                } else {
                    abstractC4036k.l0(jF);
                }
            }
            abstractC4036k.q(viewGroup, wVar, wVar2, arrayList, arrayList2);
        }
    }

    public t r0(AbstractC4036k abstractC4036k) {
        s0(abstractC4036k);
        long j10 = this.f32462c;
        if (j10 >= 0) {
            abstractC4036k.g0(j10);
        }
        if ((this.f32511h1 & 1) != 0) {
            abstractC4036k.i0(w());
        }
        if ((this.f32511h1 & 2) != 0) {
            B();
            abstractC4036k.k0(null);
        }
        if ((this.f32511h1 & 4) != 0) {
            abstractC4036k.j0(A());
        }
        if ((this.f32511h1 & 8) != 0) {
            abstractC4036k.h0(u());
        }
        return this;
    }

    public AbstractC4036k t0(int i10) {
        if (i10 < 0 || i10 >= this.f32507Y.size()) {
            return null;
        }
        return (AbstractC4036k) this.f32507Y.get(i10);
    }

    public int u0() {
        return this.f32507Y.size();
    }

    @Override // androidx.transition.AbstractC4036k
    /* renamed from: v0, reason: merged with bridge method [inline-methods] */
    public t a0(AbstractC4036k.f fVar) {
        return (t) super.a0(fVar);
    }

    @Override // androidx.transition.AbstractC4036k
    /* renamed from: w0, reason: merged with bridge method [inline-methods] */
    public t c0(View view) {
        for (int i10 = 0; i10 < this.f32507Y.size(); i10++) {
            ((AbstractC4036k) this.f32507Y.get(i10)).c0(view);
        }
        return (t) super.c0(view);
    }

    @Override // androidx.transition.AbstractC4036k
    /* renamed from: x0, reason: merged with bridge method [inline-methods] */
    public t g0(long j10) {
        ArrayList arrayList;
        super.g0(j10);
        if (this.f32462c >= 0 && (arrayList = this.f32507Y) != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((AbstractC4036k) this.f32507Y.get(i10)).g0(j10);
            }
        }
        return this;
    }

    @Override // androidx.transition.AbstractC4036k
    /* renamed from: y0, reason: merged with bridge method [inline-methods] */
    public t i0(TimeInterpolator timeInterpolator) {
        this.f32511h1 |= 1;
        ArrayList arrayList = this.f32507Y;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((AbstractC4036k) this.f32507Y.get(i10)).i0(timeInterpolator);
            }
        }
        return (t) super.i0(timeInterpolator);
    }

    public t z0(int i10) {
        if (i10 == 0) {
            this.f32508Z = true;
        } else {
            if (i10 != 1) {
                throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i10);
            }
            this.f32508Z = false;
        }
        return this;
    }
}

package androidx.transition;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.Transition;
import java.util.ArrayList;
import y1.o;
import y1.q;
import y1.r;

/* loaded from: classes.dex */
public class f extends Transition {
    public int O;
    public ArrayList M = new ArrayList();
    public boolean N = true;
    public boolean P = false;
    public int Q = 0;

    public class a extends d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Transition f4243a;

        public a(Transition transition) {
            this.f4243a = transition;
        }

        @Override // androidx.transition.Transition.f
        public void e(Transition transition) {
            this.f4243a.V();
            transition.R(this);
        }
    }

    public static class b extends d {

        /* renamed from: a, reason: collision with root package name */
        public f f4245a;

        public b(f fVar) {
            this.f4245a = fVar;
        }

        @Override // androidx.transition.d, androidx.transition.Transition.f
        public void b(Transition transition) {
            f fVar = this.f4245a;
            if (fVar.P) {
                return;
            }
            fVar.c0();
            this.f4245a.P = true;
        }

        @Override // androidx.transition.Transition.f
        public void e(Transition transition) {
            f fVar = this.f4245a;
            int i10 = fVar.O - 1;
            fVar.O = i10;
            if (i10 == 0) {
                fVar.P = false;
                fVar.o();
            }
            transition.R(this);
        }
    }

    @Override // androidx.transition.Transition
    public void P(View view) {
        super.P(view);
        int size = this.M.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((Transition) this.M.get(i10)).P(view);
        }
    }

    @Override // androidx.transition.Transition
    public void T(View view) {
        super.T(view);
        int size = this.M.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((Transition) this.M.get(i10)).T(view);
        }
    }

    @Override // androidx.transition.Transition
    public void V() {
        if (this.M.isEmpty()) {
            c0();
            o();
            return;
        }
        q0();
        int i10 = 0;
        if (this.N) {
            ArrayList arrayList = this.M;
            int size = arrayList.size();
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((Transition) obj).V();
            }
            return;
        }
        for (int i11 = 1; i11 < this.M.size(); i11++) {
            ((Transition) this.M.get(i11 - 1)).a(new a((Transition) this.M.get(i11)));
        }
        Transition transition = (Transition) this.M.get(0);
        if (transition != null) {
            transition.V();
        }
    }

    @Override // androidx.transition.Transition
    public void X(Transition.e eVar) {
        super.X(eVar);
        this.Q |= 8;
        int size = this.M.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((Transition) this.M.get(i10)).X(eVar);
        }
    }

    @Override // androidx.transition.Transition
    public void Z(y1.d dVar) {
        super.Z(dVar);
        this.Q |= 4;
        if (this.M != null) {
            for (int i10 = 0; i10 < this.M.size(); i10++) {
                ((Transition) this.M.get(i10)).Z(dVar);
            }
        }
    }

    @Override // androidx.transition.Transition
    public void a0(o oVar) {
        super.a0(oVar);
        this.Q |= 2;
        int size = this.M.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((Transition) this.M.get(i10)).a0(oVar);
        }
    }

    @Override // androidx.transition.Transition
    public void cancel() {
        super.cancel();
        int size = this.M.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((Transition) this.M.get(i10)).cancel();
        }
    }

    @Override // androidx.transition.Transition
    public String d0(String str) {
        String strD0 = super.d0(str);
        for (int i10 = 0; i10 < this.M.size(); i10++) {
            StringBuilder sb = new StringBuilder();
            sb.append(strD0);
            sb.append("\n");
            sb.append(((Transition) this.M.get(i10)).d0(str + "  "));
            strD0 = sb.toString();
        }
        return strD0;
    }

    @Override // androidx.transition.Transition
    /* renamed from: e0, reason: merged with bridge method [inline-methods] */
    public f a(Transition.f fVar) {
        return (f) super.a(fVar);
    }

    @Override // androidx.transition.Transition
    public void f(q qVar) {
        if (G(qVar.f25090b)) {
            ArrayList arrayList = this.M;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                Transition transition = (Transition) obj;
                if (transition.G(qVar.f25090b)) {
                    transition.f(qVar);
                    qVar.f25091c.add(transition);
                }
            }
        }
    }

    @Override // androidx.transition.Transition
    /* renamed from: f0, reason: merged with bridge method [inline-methods] */
    public f b(View view) {
        for (int i10 = 0; i10 < this.M.size(); i10++) {
            ((Transition) this.M.get(i10)).b(view);
        }
        return (f) super.b(view);
    }

    public f g0(Transition transition) {
        h0(transition);
        long j10 = this.f4138c;
        if (j10 >= 0) {
            transition.W(j10);
        }
        if ((this.Q & 1) != 0) {
            transition.Y(r());
        }
        if ((this.Q & 2) != 0) {
            v();
            transition.a0(null);
        }
        if ((this.Q & 4) != 0) {
            transition.Z(u());
        }
        if ((this.Q & 8) != 0) {
            transition.X(q());
        }
        return this;
    }

    @Override // androidx.transition.Transition
    public void h(q qVar) {
        super.h(qVar);
        int size = this.M.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((Transition) this.M.get(i10)).h(qVar);
        }
    }

    public final void h0(Transition transition) {
        this.M.add(transition);
        transition.f4153r = this;
    }

    @Override // androidx.transition.Transition
    public void i(q qVar) {
        if (G(qVar.f25090b)) {
            ArrayList arrayList = this.M;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                Transition transition = (Transition) obj;
                if (transition.G(qVar.f25090b)) {
                    transition.i(qVar);
                    qVar.f25091c.add(transition);
                }
            }
        }
    }

    public Transition i0(int i10) {
        if (i10 < 0 || i10 >= this.M.size()) {
            return null;
        }
        return (Transition) this.M.get(i10);
    }

    public int j0() {
        return this.M.size();
    }

    @Override // androidx.transition.Transition
    /* renamed from: k0, reason: merged with bridge method [inline-methods] */
    public f R(Transition.f fVar) {
        return (f) super.R(fVar);
    }

    @Override // androidx.transition.Transition
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public Transition clone() {
        f fVar = (f) super.clone();
        fVar.M = new ArrayList();
        int size = this.M.size();
        for (int i10 = 0; i10 < size; i10++) {
            fVar.h0(((Transition) this.M.get(i10)).clone());
        }
        return fVar;
    }

    @Override // androidx.transition.Transition
    /* renamed from: l0, reason: merged with bridge method [inline-methods] */
    public f S(View view) {
        for (int i10 = 0; i10 < this.M.size(); i10++) {
            ((Transition) this.M.get(i10)).S(view);
        }
        return (f) super.S(view);
    }

    @Override // androidx.transition.Transition
    /* renamed from: m0, reason: merged with bridge method [inline-methods] */
    public f W(long j10) {
        ArrayList arrayList;
        super.W(j10);
        if (this.f4138c >= 0 && (arrayList = this.M) != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((Transition) this.M.get(i10)).W(j10);
            }
        }
        return this;
    }

    @Override // androidx.transition.Transition
    public void n(ViewGroup viewGroup, r rVar, r rVar2, ArrayList arrayList, ArrayList arrayList2) {
        long jY = y();
        int size = this.M.size();
        for (int i10 = 0; i10 < size; i10++) {
            Transition transition = (Transition) this.M.get(i10);
            if (jY > 0 && (this.N || i10 == 0)) {
                long jY2 = transition.y();
                if (jY2 > 0) {
                    transition.b0(jY2 + jY);
                } else {
                    transition.b0(jY);
                }
            }
            transition.n(viewGroup, rVar, rVar2, arrayList, arrayList2);
        }
    }

    @Override // androidx.transition.Transition
    /* renamed from: n0, reason: merged with bridge method [inline-methods] */
    public f Y(TimeInterpolator timeInterpolator) {
        this.Q |= 1;
        ArrayList arrayList = this.M;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((Transition) this.M.get(i10)).Y(timeInterpolator);
            }
        }
        return (f) super.Y(timeInterpolator);
    }

    public f o0(int i10) {
        if (i10 == 0) {
            this.N = true;
            return this;
        }
        if (i10 == 1) {
            this.N = false;
            return this;
        }
        throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i10);
    }

    @Override // androidx.transition.Transition
    /* renamed from: p0, reason: merged with bridge method [inline-methods] */
    public f b0(long j10) {
        return (f) super.b0(j10);
    }

    public final void q0() {
        b bVar = new b(this);
        ArrayList arrayList = this.M;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((Transition) obj).a(bVar);
        }
        this.O = this.M.size();
    }
}

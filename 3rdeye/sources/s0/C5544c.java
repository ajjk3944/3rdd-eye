package s0;

import java.util.ArrayList;
import java.util.Iterator;
import r0.C5507d;
import r0.C5508e;
import r0.C5509f;

/* compiled from: ChainRun.java */
/* renamed from: s0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5544c extends p {

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList<p> f45910k;

    /* renamed from: l, reason: collision with root package name */
    public int f45911l;

    public C5544c(C5508e c5508e, int i) {
        C5508e c5508e2;
        super(c5508e);
        this.f45910k = new ArrayList<>();
        this.f45951f = i;
        C5508e c5508e3 = this.f45947b;
        C5508e c5508eM = c5508e3.m(i);
        while (true) {
            C5508e c5508e4 = c5508eM;
            c5508e2 = c5508e3;
            c5508e3 = c5508e4;
            if (c5508e3 == null) {
                break;
            } else {
                c5508eM = c5508e3.m(this.f45951f);
            }
        }
        this.f45947b = c5508e2;
        int i10 = this.f45951f;
        p pVar = i10 == 0 ? c5508e2.f45547d : i10 == 1 ? c5508e2.f45549e : null;
        ArrayList<p> arrayList = this.f45910k;
        arrayList.add(pVar);
        C5508e c5508eL = c5508e2.l(this.f45951f);
        while (c5508eL != null) {
            int i11 = this.f45951f;
            arrayList.add(i11 == 0 ? c5508eL.f45547d : i11 == 1 ? c5508eL.f45549e : null);
            c5508eL = c5508eL.l(this.f45951f);
        }
        Iterator<p> it = arrayList.iterator();
        while (it.hasNext()) {
            p next = it.next();
            int i12 = this.f45951f;
            if (i12 == 0) {
                next.f45947b.f45543b = this;
            } else if (i12 == 1) {
                next.f45947b.f45545c = this;
            }
        }
        if (this.f45951f == 0 && ((C5509f) this.f45947b.f45536V).f45601w0 && arrayList.size() > 1) {
            this.f45947b = arrayList.get(arrayList.size() - 1).f45947b;
        }
        this.f45911l = this.f45951f == 0 ? this.f45947b.f45561k0 : this.f45947b.f45563l0;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0153  */
    @Override // s0.p, s0.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(s0.d r27) {
        /*
            Method dump skipped, instructions count: 960
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.C5544c.a(s0.d):void");
    }

    @Override // s0.p
    public final void d() {
        ArrayList<p> arrayList = this.f45910k;
        Iterator<p> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().d();
        }
        int size = arrayList.size();
        if (size < 1) {
            return;
        }
        C5508e c5508e = arrayList.get(0).f45947b;
        C5508e c5508e2 = arrayList.get(size - 1).f45947b;
        int i = this.f45951f;
        f fVar = this.i;
        f fVar2 = this.f45953h;
        if (i == 0) {
            C5507d c5507d = c5508e.f45524J;
            C5507d c5507d2 = c5508e2.f45526L;
            f fVarI = p.i(c5507d, 0);
            int iE = c5507d.e();
            C5508e c5508eM = m();
            if (c5508eM != null) {
                iE = c5508eM.f45524J.e();
            }
            if (fVarI != null) {
                p.b(fVar2, fVarI, iE);
            }
            f fVarI2 = p.i(c5507d2, 0);
            int iE2 = c5507d2.e();
            C5508e c5508eN = n();
            if (c5508eN != null) {
                iE2 = c5508eN.f45526L.e();
            }
            if (fVarI2 != null) {
                p.b(fVar, fVarI2, -iE2);
            }
        } else {
            C5507d c5507d3 = c5508e.f45525K;
            C5507d c5507d4 = c5508e2.f45527M;
            f fVarI3 = p.i(c5507d3, 1);
            int iE3 = c5507d3.e();
            C5508e c5508eM2 = m();
            if (c5508eM2 != null) {
                iE3 = c5508eM2.f45525K.e();
            }
            if (fVarI3 != null) {
                p.b(fVar2, fVarI3, iE3);
            }
            f fVarI4 = p.i(c5507d4, 1);
            int iE4 = c5507d4.e();
            C5508e c5508eN2 = n();
            if (c5508eN2 != null) {
                iE4 = c5508eN2.f45527M.e();
            }
            if (fVarI4 != null) {
                p.b(fVar, fVarI4, -iE4);
            }
        }
        fVar2.f45920a = this;
        fVar.f45920a = this;
    }

    @Override // s0.p
    public final void e() {
        int i = 0;
        while (true) {
            ArrayList<p> arrayList = this.f45910k;
            if (i >= arrayList.size()) {
                return;
            }
            arrayList.get(i).e();
            i++;
        }
    }

    @Override // s0.p
    public final void f() {
        this.f45948c = null;
        Iterator<p> it = this.f45910k.iterator();
        while (it.hasNext()) {
            it.next().f();
        }
    }

    @Override // s0.p
    public final long j() {
        ArrayList<p> arrayList = this.f45910k;
        int size = arrayList.size();
        long j4 = 0;
        for (int i = 0; i < size; i++) {
            j4 = r5.i.f45925f + arrayList.get(i).j() + j4 + r5.f45953h.f45925f;
        }
        return j4;
    }

    @Override // s0.p
    public final boolean k() {
        ArrayList<p> arrayList = this.f45910k;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (!arrayList.get(i).k()) {
                return false;
            }
        }
        return true;
    }

    public final C5508e m() {
        int i = 0;
        while (true) {
            ArrayList<p> arrayList = this.f45910k;
            if (i >= arrayList.size()) {
                return null;
            }
            C5508e c5508e = arrayList.get(i).f45947b;
            if (c5508e.f45557i0 != 8) {
                return c5508e;
            }
            i++;
        }
    }

    public final C5508e n() {
        ArrayList<p> arrayList = this.f45910k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C5508e c5508e = arrayList.get(size).f45947b;
            if (c5508e.f45557i0 != 8) {
                return c5508e;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.f45951f == 0 ? "horizontal : " : "vertical : ");
        Iterator<p> it = this.f45910k.iterator();
        while (it.hasNext()) {
            p next = it.next();
            sb.append("<");
            sb.append(next);
            sb.append("> ");
        }
        return sb.toString();
    }
}

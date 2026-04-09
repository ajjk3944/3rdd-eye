package p1;

import java.util.ArrayList;
import java.util.Iterator;
import o1.C7048d;
import o1.C7049e;
import o1.C7050f;

/* loaded from: classes.dex */
public class c extends m {

    /* renamed from: k, reason: collision with root package name */
    ArrayList f57461k;

    /* renamed from: l, reason: collision with root package name */
    private int f57462l;

    public c(C7049e c7049e, int i10) {
        super(c7049e);
        this.f57461k = new ArrayList();
        this.f57503f = i10;
        q();
    }

    private void q() {
        C7049e c7049e;
        C7049e c7049e2 = this.f57499b;
        C7049e c7049eH = c7049e2.H(this.f57503f);
        while (true) {
            C7049e c7049e3 = c7049eH;
            c7049e = c7049e2;
            c7049e2 = c7049e3;
            if (c7049e2 == null) {
                break;
            } else {
                c7049eH = c7049e2.H(this.f57503f);
            }
        }
        this.f57499b = c7049e;
        this.f57461k.add(c7049e.J(this.f57503f));
        C7049e c7049eF = c7049e.F(this.f57503f);
        while (c7049eF != null) {
            this.f57461k.add(c7049eF.J(this.f57503f));
            c7049eF = c7049eF.F(this.f57503f);
        }
        Iterator it = this.f57461k.iterator();
        while (it.hasNext()) {
            m mVar = (m) it.next();
            int i10 = this.f57503f;
            if (i10 == 0) {
                mVar.f57499b.f55111c = this;
            } else if (i10 == 1) {
                mVar.f57499b.f55113d = this;
            }
        }
        if (this.f57503f == 0 && ((C7050f) this.f57499b.G()).a1() && this.f57461k.size() > 1) {
            ArrayList arrayList = this.f57461k;
            this.f57499b = ((m) arrayList.get(arrayList.size() - 1)).f57499b;
        }
        this.f57462l = this.f57503f == 0 ? this.f57499b.x() : this.f57499b.L();
    }

    private C7049e r() {
        for (int i10 = 0; i10 < this.f57461k.size(); i10++) {
            m mVar = (m) this.f57461k.get(i10);
            if (mVar.f57499b.O() != 8) {
                return mVar.f57499b;
            }
        }
        return null;
    }

    private C7049e s() {
        for (int size = this.f57461k.size() - 1; size >= 0; size--) {
            m mVar = (m) this.f57461k.get(size);
            if (mVar.f57499b.O() != 8) {
                return mVar.f57499b;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x01d5 A[PHI: r1 r22 r23 r24
  0x01d5: PHI (r1v61 int) = (r1v59 int), (r1v67 int) binds: [B:119:0x01d3, B:110:0x01ad] A[DONT_GENERATE, DONT_INLINE]
  0x01d5: PHI (r22v1 float) = (r22v0 float), (r22v3 float) binds: [B:119:0x01d3, B:110:0x01ad] A[DONT_GENERATE, DONT_INLINE]
  0x01d5: PHI (r23v4 boolean) = (r23v3 boolean), (r23v6 boolean) binds: [B:119:0x01d3, B:110:0x01ad] A[DONT_GENERATE, DONT_INLINE]
  0x01d5: PHI (r24v4 int) = (r24v3 int), (r24v6 int) binds: [B:119:0x01d3, B:110:0x01ad] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0155  */
    @Override // p1.m, p1.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(p1.d r26) {
        /*
            Method dump skipped, instructions count: 1086
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p1.c.a(p1.d):void");
    }

    @Override // p1.m
    void d() {
        Iterator it = this.f57461k.iterator();
        while (it.hasNext()) {
            ((m) it.next()).d();
        }
        int size = this.f57461k.size();
        if (size < 1) {
            return;
        }
        C7049e c7049e = ((m) this.f57461k.get(0)).f57499b;
        C7049e c7049e2 = ((m) this.f57461k.get(size - 1)).f57499b;
        if (this.f57503f == 0) {
            C7048d c7048d = c7049e.f55082B;
            C7048d c7048d2 = c7049e2.f55084D;
            f fVarI = i(c7048d, 0);
            int iC = c7048d.c();
            C7049e c7049eR = r();
            if (c7049eR != null) {
                iC = c7049eR.f55082B.c();
            }
            if (fVarI != null) {
                b(this.f57505h, fVarI, iC);
            }
            f fVarI2 = i(c7048d2, 0);
            int iC2 = c7048d2.c();
            C7049e c7049eS = s();
            if (c7049eS != null) {
                iC2 = c7049eS.f55084D.c();
            }
            if (fVarI2 != null) {
                b(this.f57506i, fVarI2, -iC2);
            }
        } else {
            C7048d c7048d3 = c7049e.f55083C;
            C7048d c7048d4 = c7049e2.f55085E;
            f fVarI3 = i(c7048d3, 1);
            int iC3 = c7048d3.c();
            C7049e c7049eR2 = r();
            if (c7049eR2 != null) {
                iC3 = c7049eR2.f55083C.c();
            }
            if (fVarI3 != null) {
                b(this.f57505h, fVarI3, iC3);
            }
            f fVarI4 = i(c7048d4, 1);
            int iC4 = c7048d4.c();
            C7049e c7049eS2 = s();
            if (c7049eS2 != null) {
                iC4 = c7049eS2.f55085E.c();
            }
            if (fVarI4 != null) {
                b(this.f57506i, fVarI4, -iC4);
            }
        }
        this.f57505h.f57472a = this;
        this.f57506i.f57472a = this;
    }

    @Override // p1.m
    public void e() {
        for (int i10 = 0; i10 < this.f57461k.size(); i10++) {
            ((m) this.f57461k.get(i10)).e();
        }
    }

    @Override // p1.m
    void f() {
        this.f57500c = null;
        Iterator it = this.f57461k.iterator();
        while (it.hasNext()) {
            ((m) it.next()).f();
        }
    }

    @Override // p1.m
    public long j() {
        int size = this.f57461k.size();
        long j10 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            j10 = j10 + r4.f57505h.f57477f + ((m) this.f57461k.get(i10)).j() + r4.f57506i.f57477f;
        }
        return j10;
    }

    @Override // p1.m
    boolean m() {
        int size = this.f57461k.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!((m) this.f57461k.get(i10)).m()) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ChainRun ");
        sb2.append(this.f57503f == 0 ? "horizontal : " : "vertical : ");
        String string = sb2.toString();
        Iterator it = this.f57461k.iterator();
        while (it.hasNext()) {
            String str = string + "<";
            string = (str + ((m) it.next())) + "> ";
        }
        return string;
    }
}

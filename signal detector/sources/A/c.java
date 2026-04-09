package A;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class c extends p {

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f9k;

    /* renamed from: l, reason: collision with root package name */
    public int f10l;

    public c(z.d dVar, int i) {
        z.d dVar2;
        super(dVar);
        ArrayList arrayList = new ArrayList();
        this.f9k = arrayList;
        this.f48f = i;
        z.d dVar3 = this.f44b;
        z.d dVarM = dVar3.m(i);
        while (true) {
            dVar2 = dVar3;
            dVar3 = dVarM;
            if (dVar3 == null) {
                break;
            } else {
                dVarM = dVar3.m(this.f48f);
            }
        }
        this.f44b = dVar2;
        int i3 = this.f48f;
        arrayList.add(i3 == 0 ? dVar2.f24322d : i3 == 1 ? dVar2.f24324e : null);
        z.d dVarL = dVar2.l(this.f48f);
        while (dVarL != null) {
            int i6 = this.f48f;
            arrayList.add(i6 == 0 ? dVarL.f24322d : i6 == 1 ? dVarL.f24324e : null);
            dVarL = dVarL.l(this.f48f);
        }
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            p pVar = (p) obj;
            int i8 = this.f48f;
            if (i8 == 0) {
                pVar.f44b.f24319b = this;
            } else if (i8 == 1) {
                pVar.f44b.f24320c = this;
            }
        }
        if (this.f48f == 0 && ((z.e) this.f44b.f24310T).v0 && arrayList.size() > 1) {
            this.f44b = ((p) arrayList.get(arrayList.size() - 1)).f44b;
        }
        this.f10l = this.f48f == 0 ? this.f44b.f24332i0 : this.f44b.f24334j0;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00dd  */
    @Override // A.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(A.d r28) {
        /*
            Method dump skipped, instructions count: 945
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: A.c.a(A.d):void");
    }

    @Override // A.p
    public final void d() {
        ArrayList arrayList = this.f9k;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((p) obj).d();
        }
        int size2 = arrayList.size();
        if (size2 < 1) {
            return;
        }
        z.d dVar = ((p) arrayList.get(0)).f44b;
        z.d dVar2 = ((p) arrayList.get(size2 - 1)).f44b;
        int i3 = this.f48f;
        g gVar = this.i;
        g gVar2 = this.f50h;
        if (i3 == 0) {
            z.c cVar = dVar.f24300I;
            z.c cVar2 = dVar2.f24302K;
            g gVarI = p.i(cVar, 0);
            int iE = cVar.e();
            z.d dVarM = m();
            if (dVarM != null) {
                iE = dVarM.f24300I.e();
            }
            if (gVarI != null) {
                p.b(gVar2, gVarI, iE);
            }
            g gVarI2 = p.i(cVar2, 0);
            int iE2 = cVar2.e();
            z.d dVarN = n();
            if (dVarN != null) {
                iE2 = dVarN.f24302K.e();
            }
            if (gVarI2 != null) {
                p.b(gVar, gVarI2, -iE2);
            }
        } else {
            z.c cVar3 = dVar.f24301J;
            z.c cVar4 = dVar2.f24303L;
            g gVarI3 = p.i(cVar3, 1);
            int iE3 = cVar3.e();
            z.d dVarM2 = m();
            if (dVarM2 != null) {
                iE3 = dVarM2.f24301J.e();
            }
            if (gVarI3 != null) {
                p.b(gVar2, gVarI3, iE3);
            }
            g gVarI4 = p.i(cVar4, 1);
            int iE4 = cVar4.e();
            z.d dVarN2 = n();
            if (dVarN2 != null) {
                iE4 = dVarN2.f24303L.e();
            }
            if (gVarI4 != null) {
                p.b(gVar, gVarI4, -iE4);
            }
        }
        gVar2.f19a = this;
        gVar.f19a = this;
    }

    @Override // A.p
    public final void e() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f9k;
            if (i >= arrayList.size()) {
                return;
            }
            ((p) arrayList.get(i)).e();
            i++;
        }
    }

    @Override // A.p
    public final void f() {
        this.f45c = null;
        ArrayList arrayList = this.f9k;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((p) obj).f();
        }
    }

    @Override // A.p
    public final long j() {
        ArrayList arrayList = this.f9k;
        int size = arrayList.size();
        long j6 = 0;
        for (int i = 0; i < size; i++) {
            j6 = r5.i.f24f + ((p) arrayList.get(i)).j() + j6 + r5.f50h.f24f;
        }
        return j6;
    }

    @Override // A.p
    public final boolean k() {
        ArrayList arrayList = this.f9k;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (!((p) arrayList.get(i)).k()) {
                return false;
            }
        }
        return true;
    }

    public final z.d m() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f9k;
            if (i >= arrayList.size()) {
                return null;
            }
            z.d dVar = ((p) arrayList.get(i)).f44b;
            if (dVar.f24329g0 != 8) {
                return dVar;
            }
            i++;
        }
    }

    public final z.d n() {
        ArrayList arrayList = this.f9k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            z.d dVar = ((p) arrayList.get(size)).f44b;
            if (dVar.f24329g0 != 8) {
                return dVar;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.f48f == 0 ? "horizontal : " : "vertical : ");
        ArrayList arrayList = this.f9k;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            sb.append("<");
            sb.append((p) obj);
            sb.append("> ");
        }
        return sb.toString();
    }
}

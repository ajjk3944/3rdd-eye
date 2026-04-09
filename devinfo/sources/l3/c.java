package l3;

import java.util.ArrayList;
import je.u;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class c extends n {

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f28555k;

    /* renamed from: l, reason: collision with root package name */
    public int f28556l;

    public c(k3.d dVar, int i4) {
        k3.d dVar2;
        super(dVar);
        ArrayList arrayList = new ArrayList();
        this.f28555k = arrayList;
        this.f28585f = i4;
        k3.d dVar3 = this.f28581b;
        k3.d dVarM = dVar3.m(i4);
        while (true) {
            dVar2 = dVar3;
            dVar3 = dVarM;
            if (dVar3 == null) {
                break;
            } else {
                dVarM = dVar3.m(this.f28585f);
            }
        }
        this.f28581b = dVar2;
        int i10 = this.f28585f;
        arrayList.add(i10 == 0 ? dVar2.f27845d : i10 == 1 ? dVar2.f27847e : null);
        k3.d dVarL = dVar2.l(this.f28585f);
        while (dVarL != null) {
            int i11 = this.f28585f;
            arrayList.add(i11 == 0 ? dVarL.f27845d : i11 == 1 ? dVarL.f27847e : null);
            dVarL = dVarL.l(this.f28585f);
        }
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            n nVar = (n) obj;
            int i13 = this.f28585f;
            if (i13 == 0) {
                nVar.f28581b.f27841b = this;
            } else if (i13 == 1) {
                nVar.f28581b.f27843c = this;
            }
        }
        if (this.f28585f == 0 && ((k3.e) this.f28581b.T).f27884v0 && arrayList.size() > 1) {
            this.f28581b = ((n) u.p(1, arrayList)).f28581b;
        }
        this.f28556l = this.f28585f == 0 ? this.f28581b.f27855i0 : this.f28581b.f27856j0;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00dd  */
    @Override // l3.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(l3.d r28) {
        /*
            Method dump skipped, instructions count: 945
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l3.c.a(l3.d):void");
    }

    @Override // l3.n
    public final void d() {
        ArrayList arrayList = this.f28555k;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            ((n) obj).d();
        }
        int size2 = arrayList.size();
        if (size2 < 1) {
            return;
        }
        k3.d dVar = ((n) arrayList.get(0)).f28581b;
        k3.d dVar2 = ((n) arrayList.get(size2 - 1)).f28581b;
        int i10 = this.f28585f;
        e eVar = this.f28587i;
        e eVar2 = this.f28586h;
        if (i10 == 0) {
            k3.c cVar = dVar.I;
            k3.c cVar2 = dVar2.K;
            e eVarI = n.i(cVar, 0);
            int iE = cVar.e();
            k3.d dVarM = m();
            if (dVarM != null) {
                iE = dVarM.I.e();
            }
            if (eVarI != null) {
                n.b(eVar2, eVarI, iE);
            }
            e eVarI2 = n.i(cVar2, 0);
            int iE2 = cVar2.e();
            k3.d dVarN = n();
            if (dVarN != null) {
                iE2 = dVarN.K.e();
            }
            if (eVarI2 != null) {
                n.b(eVar, eVarI2, -iE2);
            }
        } else {
            k3.c cVar3 = dVar.J;
            k3.c cVar4 = dVar2.L;
            e eVarI3 = n.i(cVar3, 1);
            int iE3 = cVar3.e();
            k3.d dVarM2 = m();
            if (dVarM2 != null) {
                iE3 = dVarM2.J.e();
            }
            if (eVarI3 != null) {
                n.b(eVar2, eVarI3, iE3);
            }
            e eVarI4 = n.i(cVar4, 1);
            int iE4 = cVar4.e();
            k3.d dVarN2 = n();
            if (dVarN2 != null) {
                iE4 = dVarN2.L.e();
            }
            if (eVarI4 != null) {
                n.b(eVar, eVarI4, -iE4);
            }
        }
        eVar2.f28557a = this;
        eVar.f28557a = this;
    }

    @Override // l3.n
    public final void e() {
        int i4 = 0;
        while (true) {
            ArrayList arrayList = this.f28555k;
            if (i4 >= arrayList.size()) {
                return;
            }
            ((n) arrayList.get(i4)).e();
            i4++;
        }
    }

    @Override // l3.n
    public final void f() {
        this.f28582c = null;
        ArrayList arrayList = this.f28555k;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            ((n) obj).f();
        }
    }

    @Override // l3.n
    public final long j() {
        ArrayList arrayList = this.f28555k;
        int size = arrayList.size();
        long j = 0;
        for (int i4 = 0; i4 < size; i4++) {
            j = r5.f28587i.f28562f + ((n) arrayList.get(i4)).j() + j + r5.f28586h.f28562f;
        }
        return j;
    }

    @Override // l3.n
    public final boolean k() {
        ArrayList arrayList = this.f28555k;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (!((n) arrayList.get(i4)).k()) {
                return false;
            }
        }
        return true;
    }

    public final k3.d m() {
        int i4 = 0;
        while (true) {
            ArrayList arrayList = this.f28555k;
            if (i4 >= arrayList.size()) {
                return null;
            }
            k3.d dVar = ((n) arrayList.get(i4)).f28581b;
            if (dVar.f27851g0 != 8) {
                return dVar;
            }
            i4++;
        }
    }

    public final k3.d n() {
        ArrayList arrayList = this.f28555k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            k3.d dVar = ((n) arrayList.get(size)).f28581b;
            if (dVar.f27851g0 != 8) {
                return dVar;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ChainRun ");
        sb2.append(this.f28585f == 0 ? "horizontal : " : "vertical : ");
        ArrayList arrayList = this.f28555k;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            sb2.append("<");
            sb2.append((n) obj);
            sb2.append("> ");
        }
        return sb2.toString();
    }
}

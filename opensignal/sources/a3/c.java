package a3;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class c extends t {
    public final ArrayList k;

    /* renamed from: l, reason: collision with root package name */
    public int f41l;

    public c(z2.g gVar, int i10) {
        z2.g gVar2;
        super(gVar);
        ArrayList arrayList = new ArrayList();
        this.k = arrayList;
        this.f80f = i10;
        z2.g gVar3 = this.f76b;
        z2.g gVarM = gVar3.m(i10);
        while (true) {
            gVar2 = gVar3;
            gVar3 = gVarM;
            if (gVar3 == null) {
                break;
            } else {
                gVarM = gVar3.m(this.f80f);
            }
        }
        this.f76b = gVar2;
        int i11 = this.f80f;
        arrayList.add(i11 == 0 ? gVar2.f26542d : i11 == 1 ? gVar2.f26544e : null);
        z2.g gVarL = gVar2.l(this.f80f);
        while (gVarL != null) {
            int i12 = this.f80f;
            arrayList.add(i12 == 0 ? gVarL.f26542d : i12 == 1 ? gVarL.f26544e : null);
            gVarL = gVarL.l(this.f80f);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            t tVar = (t) it.next();
            int i13 = this.f80f;
            if (i13 == 0) {
                tVar.f76b.f26538b = this;
            } else if (i13 == 1) {
                tVar.f76b.f26540c = this;
            }
        }
        if (this.f80f == 0 && ((z2.h) this.f76b.U).f26581v0 && arrayList.size() > 1) {
            this.f76b = ((t) h0.b.f(1, arrayList)).f76b;
        }
        this.f41l = this.f80f == 0 ? this.f76b.f26554j0 : this.f76b.f26555k0;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00de  */
    @Override // a3.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(a3.d r27) {
        /*
            Method dump skipped, instructions count: 956
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a3.c.a(a3.d):void");
    }

    @Override // a3.t
    public final void d() {
        ArrayList arrayList = this.k;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((t) it.next()).d();
        }
        int size = arrayList.size();
        if (size < 1) {
            return;
        }
        z2.g gVar = ((t) arrayList.get(0)).f76b;
        z2.g gVar2 = ((t) arrayList.get(size - 1)).f76b;
        int i10 = this.f80f;
        g gVar3 = this.f83i;
        g gVar4 = this.f82h;
        if (i10 == 0) {
            z2.d dVar = gVar.I;
            z2.d dVar2 = gVar2.K;
            g gVarI = t.i(dVar, 0);
            int iE = dVar.e();
            z2.g gVarM = m();
            if (gVarM != null) {
                iE = gVarM.I.e();
            }
            if (gVarI != null) {
                t.b(gVar4, gVarI, iE);
            }
            g gVarI2 = t.i(dVar2, 0);
            int iE2 = dVar2.e();
            z2.g gVarN = n();
            if (gVarN != null) {
                iE2 = gVarN.K.e();
            }
            if (gVarI2 != null) {
                t.b(gVar3, gVarI2, -iE2);
            }
        } else {
            z2.d dVar3 = gVar.J;
            z2.d dVar4 = gVar2.L;
            g gVarI3 = t.i(dVar3, 1);
            int iE3 = dVar3.e();
            z2.g gVarM2 = m();
            if (gVarM2 != null) {
                iE3 = gVarM2.J.e();
            }
            if (gVarI3 != null) {
                t.b(gVar4, gVarI3, iE3);
            }
            g gVarI4 = t.i(dVar4, 1);
            int iE4 = dVar4.e();
            z2.g gVarN2 = n();
            if (gVarN2 != null) {
                iE4 = gVarN2.L.e();
            }
            if (gVarI4 != null) {
                t.b(gVar3, gVarI4, -iE4);
            }
        }
        gVar4.f51a = this;
        gVar3.f51a = this;
    }

    @Override // a3.t
    public final void e() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.k;
            if (i10 >= arrayList.size()) {
                return;
            }
            ((t) arrayList.get(i10)).e();
            i10++;
        }
    }

    @Override // a3.t
    public final void f() {
        this.f77c = null;
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            ((t) it.next()).f();
        }
    }

    @Override // a3.t
    public final long j() {
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        long j = 0;
        for (int i10 = 0; i10 < size; i10++) {
            j = r5.f83i.f56f + ((t) arrayList.get(i10)).j() + j + r5.f82h.f56f;
        }
        return j;
    }

    @Override // a3.t
    public final boolean k() {
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!((t) arrayList.get(i10)).k()) {
                return false;
            }
        }
        return true;
    }

    public final z2.g m() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.k;
            if (i10 >= arrayList.size()) {
                return null;
            }
            z2.g gVar = ((t) arrayList.get(i10)).f76b;
            if (gVar.f26551h0 != 8) {
                return gVar;
            }
            i10++;
        }
    }

    public final z2.g n() {
        ArrayList arrayList = this.k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            z2.g gVar = ((t) arrayList.get(size)).f76b;
            if (gVar.f26551h0 != 8) {
                return gVar;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ChainRun ");
        sb2.append(this.f80f == 0 ? "horizontal : " : "vertical : ");
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            t tVar = (t) it.next();
            sb2.append("<");
            sb2.append(tVar);
            sb2.append("> ");
        }
        return sb2.toString();
    }
}

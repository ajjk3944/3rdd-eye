package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class zd extends m81 {
    public final ArrayList k;
    public int l;

    public zd(pi piVar, int i) {
        pi piVar2;
        super(piVar);
        ArrayList arrayList = new ArrayList();
        this.k = arrayList;
        this.f = i;
        pi piVar3 = this.b;
        pi piVarM = piVar3.m(i);
        while (true) {
            piVar2 = piVar3;
            piVar3 = piVarM;
            if (piVar3 == null) {
                break;
            } else {
                piVarM = piVar3.m(this.f);
            }
        }
        this.b = piVar2;
        int i2 = this.f;
        arrayList.add(i2 == 0 ? piVar2.d : i2 == 1 ? piVar2.e : null);
        pi piVarL = piVar2.l(this.f);
        while (piVarL != null) {
            int i3 = this.f;
            arrayList.add(i3 == 0 ? piVarL.d : i3 == 1 ? piVarL.e : null);
            piVarL = piVarL.l(this.f);
        }
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            m81 m81Var = (m81) obj;
            int i5 = this.f;
            if (i5 == 0) {
                m81Var.b.b = this;
            } else if (i5 == 1) {
                m81Var.b.c = this;
            }
        }
        if (this.f == 0 && ((qi) this.b.T).v0 && arrayList.size() > 1) {
            this.b = ((m81) arrayList.get(arrayList.size() - 1)).b;
        }
        this.l = this.f == 0 ? this.b.i0 : this.b.j0;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00dd  */
    @Override // defpackage.ho
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(defpackage.ho r28) {
        /*
            Method dump skipped, instructions count: 945
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zd.a(ho):void");
    }

    @Override // defpackage.m81
    public final void d() {
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((m81) obj).d();
        }
        int size2 = arrayList.size();
        if (size2 < 1) {
            return;
        }
        pi piVar = ((m81) arrayList.get(0)).b;
        pi piVar2 = ((m81) arrayList.get(size2 - 1)).b;
        int i2 = this.f;
        jo joVar = this.i;
        jo joVar2 = this.h;
        if (i2 == 0) {
            wh whVar = piVar.I;
            wh whVar2 = piVar2.K;
            jo joVarI = m81.i(whVar, 0);
            int iE = whVar.e();
            pi piVarM = m();
            if (piVarM != null) {
                iE = piVarM.I.e();
            }
            if (joVarI != null) {
                m81.b(joVar2, joVarI, iE);
            }
            jo joVarI2 = m81.i(whVar2, 0);
            int iE2 = whVar2.e();
            pi piVarN = n();
            if (piVarN != null) {
                iE2 = piVarN.K.e();
            }
            if (joVarI2 != null) {
                m81.b(joVar, joVarI2, -iE2);
            }
        } else {
            wh whVar3 = piVar.J;
            wh whVar4 = piVar2.L;
            jo joVarI3 = m81.i(whVar3, 1);
            int iE3 = whVar3.e();
            pi piVarM2 = m();
            if (piVarM2 != null) {
                iE3 = piVarM2.J.e();
            }
            if (joVarI3 != null) {
                m81.b(joVar2, joVarI3, iE3);
            }
            jo joVarI4 = m81.i(whVar4, 1);
            int iE4 = whVar4.e();
            pi piVarN2 = n();
            if (piVarN2 != null) {
                iE4 = piVarN2.L.e();
            }
            if (joVarI4 != null) {
                m81.b(joVar, joVarI4, -iE4);
            }
        }
        joVar2.a = this;
        joVar.a = this;
    }

    @Override // defpackage.m81
    public final void e() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.k;
            if (i >= arrayList.size()) {
                return;
            }
            ((m81) arrayList.get(i)).e();
            i++;
        }
    }

    @Override // defpackage.m81
    public final void f() {
        this.c = null;
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((m81) obj).f();
        }
    }

    @Override // defpackage.m81
    public final long j() {
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            j = r5.i.f + ((m81) arrayList.get(i)).j() + j + r5.h.f;
        }
        return j;
    }

    @Override // defpackage.m81
    public final boolean k() {
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (!((m81) arrayList.get(i)).k()) {
                return false;
            }
        }
        return true;
    }

    public final pi m() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.k;
            if (i >= arrayList.size()) {
                return null;
            }
            pi piVar = ((m81) arrayList.get(i)).b;
            if (piVar.g0 != 8) {
                return piVar;
            }
            i++;
        }
    }

    public final pi n() {
        ArrayList arrayList = this.k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            pi piVar = ((m81) arrayList.get(size)).b;
            if (piVar.g0 != 8) {
                return piVar;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.f == 0 ? "horizontal : " : "vertical : ");
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            sb.append("<");
            sb.append((m81) obj);
            sb.append("> ");
        }
        return sb.toString();
    }
}

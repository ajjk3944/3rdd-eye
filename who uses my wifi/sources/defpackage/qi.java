package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class qi extends pi {
    public int A0;
    public yd[] B0;
    public yd[] C0;
    public int D0;
    public boolean E0;
    public boolean F0;
    public WeakReference G0;
    public WeakReference H0;
    public WeakReference I0;
    public WeakReference J0;
    public final HashSet K0;
    public final ra L0;
    public ArrayList q0 = new ArrayList();
    public final t83 r0 = new t83(this);
    public final qm s0;
    public int t0;
    public di u0;
    public boolean v0;
    public final x60 w0;
    public int x0;
    public int y0;
    public int z0;

    public qi() {
        qm qmVar = new qm();
        qmVar.a = true;
        qmVar.b = true;
        qmVar.e = new ArrayList();
        new ArrayList();
        qmVar.f = null;
        qmVar.g = new ra();
        qmVar.h = new ArrayList();
        qmVar.c = this;
        qmVar.d = this;
        this.s0 = qmVar;
        this.u0 = null;
        this.v0 = false;
        this.w0 = new x60();
        this.z0 = 0;
        this.A0 = 0;
        this.B0 = new yd[4];
        this.C0 = new yd[4];
        this.D0 = 257;
        this.E0 = false;
        this.F0 = false;
        this.G0 = null;
        this.H0 = null;
        this.I0 = null;
        this.J0 = null;
        this.K0 = new HashSet();
        this.L0 = new ra();
    }

    public static void V(pi piVar, di diVar, ra raVar) {
        int i;
        int i2;
        if (diVar == null) {
            return;
        }
        int i3 = piVar.g0;
        int[] iArr = piVar.t;
        if (i3 == 8 || (piVar instanceof b00) || (piVar instanceof q9)) {
            raVar.e = 0;
            raVar.f = 0;
            return;
        }
        int[] iArr2 = piVar.p0;
        raVar.a = iArr2[0];
        raVar.b = iArr2[1];
        raVar.c = piVar.q();
        raVar.d = piVar.k();
        raVar.i = false;
        raVar.j = 0;
        boolean z = raVar.a == 3;
        boolean z2 = raVar.b == 3;
        boolean z3 = z && piVar.W > 0.0f;
        boolean z4 = z2 && piVar.W > 0.0f;
        if (z && piVar.t(0) && piVar.r == 0 && !z3) {
            raVar.a = 2;
            if (z2 && piVar.s == 0) {
                raVar.a = 1;
            }
            z = false;
        }
        if (z2 && piVar.t(1) && piVar.s == 0 && !z4) {
            raVar.b = 2;
            if (z && piVar.r == 0) {
                raVar.b = 1;
            }
            z2 = false;
        }
        if (piVar.A()) {
            raVar.a = 1;
            z = false;
        }
        if (piVar.B()) {
            raVar.b = 1;
            z2 = false;
        }
        if (z3) {
            if (iArr[0] == 4) {
                raVar.a = 1;
            } else if (!z2) {
                if (raVar.b == 1) {
                    i2 = raVar.d;
                } else {
                    raVar.a = 2;
                    diVar.b(piVar, raVar);
                    i2 = raVar.f;
                }
                raVar.a = 1;
                raVar.c = (int) (piVar.W * i2);
            }
        }
        if (z4) {
            if (iArr[1] == 4) {
                raVar.b = 1;
            } else if (!z) {
                if (raVar.a == 1) {
                    i = raVar.c;
                } else {
                    raVar.b = 2;
                    diVar.b(piVar, raVar);
                    i = raVar.e;
                }
                raVar.b = 1;
                if (piVar.X == -1) {
                    raVar.d = (int) (i / piVar.W);
                } else {
                    raVar.d = (int) (piVar.W * i);
                }
            }
        }
        diVar.b(piVar, raVar);
        piVar.O(raVar.e);
        piVar.L(raVar.f);
        piVar.E = raVar.h;
        piVar.I(raVar.g);
        raVar.j = 0;
    }

    @Override // defpackage.pi
    public final void C() {
        this.w0.t();
        this.x0 = 0;
        this.y0 = 0;
        this.q0.clear();
        super.C();
    }

    @Override // defpackage.pi
    public final void F(xb4 xb4Var) {
        super.F(xb4Var);
        int size = this.q0.size();
        for (int i = 0; i < size; i++) {
            ((pi) this.q0.get(i)).F(xb4Var);
        }
    }

    @Override // defpackage.pi
    public final void P(boolean z, boolean z2) {
        super.P(z, z2);
        int size = this.q0.size();
        for (int i = 0; i < size; i++) {
            ((pi) this.q0.get(i)).P(z, z2);
        }
    }

    public final void R(pi piVar, int i) {
        if (i == 0) {
            int i2 = this.z0 + 1;
            yd[] ydVarArr = this.C0;
            if (i2 >= ydVarArr.length) {
                this.C0 = (yd[]) Arrays.copyOf(ydVarArr, ydVarArr.length * 2);
            }
            yd[] ydVarArr2 = this.C0;
            int i3 = this.z0;
            ydVarArr2[i3] = new yd(piVar, 0, this.v0);
            this.z0 = i3 + 1;
            return;
        }
        if (i == 1) {
            int i4 = this.A0 + 1;
            yd[] ydVarArr3 = this.B0;
            if (i4 >= ydVarArr3.length) {
                this.B0 = (yd[]) Arrays.copyOf(ydVarArr3, ydVarArr3.length * 2);
            }
            yd[] ydVarArr4 = this.B0;
            int i5 = this.A0;
            ydVarArr4[i5] = new yd(piVar, 1, this.v0);
            this.A0 = i5 + 1;
        }
    }

    public final void S(x60 x60Var) {
        qi qiVar;
        x60 x60Var2;
        boolean zW = W(64);
        b(x60Var, zW);
        int size = this.q0.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            pi piVar = (pi) this.q0.get(i);
            boolean[] zArr = piVar.S;
            zArr[0] = false;
            zArr[1] = false;
            if (piVar instanceof q9) {
                z = true;
            }
        }
        if (z) {
            for (int i2 = 0; i2 < size; i2++) {
                pi piVar2 = (pi) this.q0.get(i2);
                if (piVar2 instanceof q9) {
                    q9 q9Var = (q9) piVar2;
                    for (int i3 = 0; i3 < q9Var.r0; i3++) {
                        pi piVar3 = q9Var.q0[i3];
                        if (q9Var.t0 || piVar3.c()) {
                            int i4 = q9Var.s0;
                            if (i4 == 0 || i4 == 1) {
                                piVar3.S[0] = true;
                            } else if (i4 == 2 || i4 == 3) {
                                piVar3.S[1] = true;
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = this.K0;
        hashSet.clear();
        for (int i5 = 0; i5 < size; i5++) {
            pi piVar4 = (pi) this.q0.get(i5);
            piVar4.getClass();
            boolean z2 = piVar4 instanceof zu;
            if (z2 || (piVar4 instanceof b00)) {
                if (z2) {
                    hashSet.add(piVar4);
                } else {
                    piVar4.b(x60Var, zW);
                }
            }
        }
        while (hashSet.size() > 0) {
            int size2 = hashSet.size();
            Iterator it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                zu zuVar = (zu) ((pi) it.next());
                for (int i6 = 0; i6 < zuVar.r0; i6++) {
                    if (hashSet.contains(zuVar.q0[i6])) {
                        zuVar.b(x60Var, zW);
                        hashSet.remove(zuVar);
                        break;
                    }
                }
            }
            if (size2 == hashSet.size()) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((pi) it2.next()).b(x60Var, zW);
                }
                hashSet.clear();
            }
        }
        if (x60.q) {
            HashSet hashSet2 = new HashSet();
            for (int i7 = 0; i7 < size; i7++) {
                pi piVar5 = (pi) this.q0.get(i7);
                piVar5.getClass();
                if (!(piVar5 instanceof zu) && !(piVar5 instanceof b00)) {
                    hashSet2.add(piVar5);
                }
            }
            qiVar = this;
            x60Var2 = x60Var;
            qiVar.a(this, x60Var2, hashSet2, this.p0[0] == 2 ? 0 : 1, false);
            Iterator it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                pi piVar6 = (pi) it3.next();
                zt0.i(this, x60Var2, piVar6);
                piVar6.b(x60Var2, zW);
            }
        } else {
            qiVar = this;
            x60Var2 = x60Var;
            for (int i8 = 0; i8 < size; i8++) {
                pi piVar7 = (pi) qiVar.q0.get(i8);
                if (piVar7 instanceof qi) {
                    int[] iArr = piVar7.p0;
                    int i9 = iArr[0];
                    int i10 = iArr[1];
                    if (i9 == 2) {
                        piVar7.M(1);
                    }
                    if (i10 == 2) {
                        piVar7.N(1);
                    }
                    piVar7.b(x60Var2, zW);
                    if (i9 == 2) {
                        piVar7.M(i9);
                    }
                    if (i10 == 2) {
                        piVar7.N(i10);
                    }
                } else {
                    zt0.i(this, x60Var2, piVar7);
                    if (!(piVar7 instanceof zu) && !(piVar7 instanceof b00)) {
                        piVar7.b(x60Var2, zW);
                    }
                }
            }
        }
        if (qiVar.z0 > 0) {
            um.c(this, x60Var2, null, 0);
        }
        if (qiVar.A0 > 0) {
            um.c(this, x60Var2, null, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean T(int i, boolean z) {
        int i2;
        int i3;
        boolean z2;
        boolean z3;
        qm qmVar = this.s0;
        ArrayList arrayList = (ArrayList) qmVar.e;
        qi qiVar = (qi) qmVar.c;
        int iJ = qiVar.j(0);
        int[] iArr = qiVar.p0;
        int iJ2 = qiVar.j(1);
        int iR = qiVar.r();
        int iS = qiVar.s();
        if (z && (iJ == 2 || iJ2 == 2)) {
            int size = arrayList.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    z3 = z;
                    break;
                }
                Object obj = arrayList.get(i4);
                i4++;
                m81 m81Var = (m81) obj;
                if (m81Var.f == i && !m81Var.k()) {
                    z3 = false;
                    break;
                }
            }
            if (i == 0) {
                if (z3 && iJ == 2) {
                    qiVar.M(1);
                    qiVar.O(qmVar.d(qiVar, 0));
                    qiVar.d.e.d(qiVar.q());
                }
            } else if (z3 && iJ2 == 2) {
                qiVar.N(1);
                qiVar.L(qmVar.d(qiVar, 1));
                qiVar.e.e.d(qiVar.k());
            }
        }
        if (i == 0) {
            i2 = 0;
            int i5 = iArr[0];
            if (i5 == 1 || i5 == 4) {
                int iQ = qiVar.q() + iR;
                qiVar.d.i.d(iQ);
                qiVar.d.e.d(iQ - iR);
                i3 = 1;
            }
            i3 = i2;
        } else {
            i2 = 0;
            int i6 = iArr[1];
            if (i6 == 1 || i6 == 4) {
                int iK = qiVar.k() + iS;
                qiVar.e.i.d(iK);
                qiVar.e.e.d(iK - iS);
                i3 = 1;
            }
            i3 = i2;
        }
        qmVar.g();
        int size2 = arrayList.size();
        int i7 = i2;
        while (i7 < size2) {
            Object obj2 = arrayList.get(i7);
            i7++;
            m81 m81Var2 = (m81) obj2;
            if (m81Var2.f == i && (m81Var2.b != qiVar || m81Var2.g)) {
                m81Var2.e();
            }
        }
        int size3 = arrayList.size();
        int i8 = i2;
        while (i8 < size3) {
            Object obj3 = arrayList.get(i8);
            i8++;
            m81 m81Var3 = (m81) obj3;
            if (m81Var3.f == i && (i3 != 0 || m81Var3.b != qiVar)) {
                if (!m81Var3.h.j || !m81Var3.i.j || (!(m81Var3 instanceof zd) && !m81Var3.e.j)) {
                    z2 = i2;
                    break;
                }
            }
        }
        z2 = 1;
        qiVar.M(iJ);
        qiVar.N(iJ2);
        return z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:339:0x05de  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0608  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x063b  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0651  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x065f  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x066a  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x0675 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:384:0x067b  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x0683  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x068a  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x0694  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x06b1  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x0714  */
    /* JADX WARN: Removed duplicated region for block: B:467:0x07c1  */
    /* JADX WARN: Removed duplicated region for block: B:476:0x07fe  */
    /* JADX WARN: Removed duplicated region for block: B:482:0x0818 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:487:0x0825 A[LOOP:14: B:486:0x0823->B:487:0x0825, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:499:0x088c  */
    /* JADX WARN: Removed duplicated region for block: B:500:0x0898  */
    /* JADX WARN: Removed duplicated region for block: B:503:0x08ab  */
    /* JADX WARN: Removed duplicated region for block: B:504:0x08b3  */
    /* JADX WARN: Removed duplicated region for block: B:506:0x08b7  */
    /* JADX WARN: Removed duplicated region for block: B:519:0x08eb  */
    /* JADX WARN: Removed duplicated region for block: B:521:0x08ef  */
    /* JADX WARN: Removed duplicated region for block: B:525:0x0900  */
    /* JADX WARN: Removed duplicated region for block: B:595:0x08f0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x012c  */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v14 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void U() {
        /*
            Method dump skipped, instructions count: 2318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qi.U():void");
    }

    public final boolean W(int i) {
        return (this.D0 & i) == i;
    }

    @Override // defpackage.pi
    public final void n(StringBuilder sb) {
        sb.append(this.j + ":{\n");
        StringBuilder sb2 = new StringBuilder("  actualWidth:");
        sb2.append(this.U);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("  actualHeight:" + this.V);
        sb.append("\n");
        ArrayList arrayList = this.q0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((pi) obj).n(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }
}

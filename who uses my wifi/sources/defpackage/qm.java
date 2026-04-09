package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class qm {
    public boolean a;
    public boolean b;
    public Object c;
    public Object d;
    public Serializable e;
    public Object f;
    public Object g;
    public Object h;

    public void a(jo joVar, int i, ArrayList arrayList, mr0 mr0Var) {
        m81 m81Var = joVar.d;
        mr0 mr0Var2 = m81Var.c;
        jo joVar2 = m81Var.i;
        jo joVar3 = m81Var.h;
        if (mr0Var2 == null) {
            qi qiVar = (qi) this.c;
            if (m81Var == qiVar.d || m81Var == qiVar.e) {
                return;
            }
            if (mr0Var == null) {
                mr0Var = new mr0();
                mr0Var.a = null;
                mr0Var.b = new ArrayList();
                mr0Var.a = m81Var;
                arrayList.add(mr0Var);
            }
            m81Var.c = mr0Var;
            mr0Var.b.add(m81Var);
            ArrayList arrayList2 = joVar3.k;
            int size = arrayList2.size();
            int i2 = 0;
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList2.get(i3);
                i3++;
                ho hoVar = (ho) obj;
                if (hoVar instanceof jo) {
                    a((jo) hoVar, i, arrayList, mr0Var);
                }
            }
            ArrayList arrayList3 = joVar2.k;
            int size2 = arrayList3.size();
            int i4 = 0;
            while (i4 < size2) {
                Object obj2 = arrayList3.get(i4);
                i4++;
                ho hoVar2 = (ho) obj2;
                if (hoVar2 instanceof jo) {
                    a((jo) hoVar2, i, arrayList, mr0Var);
                }
            }
            if (i == 1 && (m81Var instanceof i51)) {
                ArrayList arrayList4 = ((i51) m81Var).k.k;
                int size3 = arrayList4.size();
                int i5 = 0;
                while (i5 < size3) {
                    Object obj3 = arrayList4.get(i5);
                    i5++;
                    ho hoVar3 = (ho) obj3;
                    if (hoVar3 instanceof jo) {
                        a((jo) hoVar3, i, arrayList, mr0Var);
                    }
                }
            }
            ArrayList arrayList5 = joVar3.l;
            int size4 = arrayList5.size();
            int i6 = 0;
            while (i6 < size4) {
                Object obj4 = arrayList5.get(i6);
                i6++;
                a((jo) obj4, i, arrayList, mr0Var);
            }
            ArrayList arrayList6 = joVar2.l;
            int size5 = arrayList6.size();
            int i7 = 0;
            while (i7 < size5) {
                Object obj5 = arrayList6.get(i7);
                i7++;
                a((jo) obj5, i, arrayList, mr0Var);
            }
            if (i == 1 && (m81Var instanceof i51)) {
                ArrayList arrayList7 = ((i51) m81Var).k.l;
                int size6 = arrayList7.size();
                while (i2 < size6) {
                    Object obj6 = arrayList7.get(i2);
                    i2++;
                    a((jo) obj6, i, arrayList, mr0Var);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x00c9, code lost:
    
        if (r6 == 2) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02a1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(defpackage.qi r25) {
        /*
            Method dump skipped, instructions count: 860
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qm.b(qi):void");
    }

    public void c() {
        qi qiVar = (qi) this.c;
        ArrayList arrayList = (ArrayList) this.h;
        ArrayList arrayList2 = (ArrayList) this.e;
        arrayList2.clear();
        qi qiVar2 = (qi) this.d;
        qiVar2.d.f();
        qiVar2.e.f();
        arrayList2.add(qiVar2.d);
        arrayList2.add(qiVar2.e);
        ArrayList arrayList3 = qiVar2.q0;
        int size = arrayList3.size();
        HashSet hashSet = null;
        int i = 0;
        while (i < size) {
            Object obj = arrayList3.get(i);
            i++;
            pi piVar = (pi) obj;
            if (piVar instanceof b00) {
                c00 c00Var = new c00(piVar);
                piVar.d.f();
                piVar.e.f();
                c00Var.f = ((b00) piVar).u0;
                arrayList2.add(c00Var);
            } else {
                if (piVar.x()) {
                    if (piVar.b == null) {
                        piVar.b = new zd(piVar, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(piVar.b);
                } else {
                    arrayList2.add(piVar.d);
                }
                if (piVar.y()) {
                    if (piVar.c == null) {
                        piVar.c = new zd(piVar, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(piVar.c);
                } else {
                    arrayList2.add(piVar.e);
                }
                if (piVar instanceof s00) {
                    arrayList2.add(new r00(piVar));
                }
            }
        }
        if (hashSet != null) {
            arrayList2.addAll(hashSet);
        }
        int size2 = arrayList2.size();
        int i2 = 0;
        while (i2 < size2) {
            Object obj2 = arrayList2.get(i2);
            i2++;
            ((m81) obj2).f();
        }
        int size3 = arrayList2.size();
        int i3 = 0;
        while (i3 < size3) {
            Object obj3 = arrayList2.get(i3);
            i3++;
            m81 m81Var = (m81) obj3;
            if (m81Var.b != qiVar2) {
                m81Var.d();
            }
        }
        arrayList.clear();
        e(qiVar.d, 0, arrayList);
        e(qiVar.e, 1, arrayList);
        this.a = false;
    }

    public int d(qi qiVar, int i) {
        ArrayList arrayList;
        int i2;
        long jMax;
        float f;
        qi qiVar2 = qiVar;
        ArrayList arrayList2 = (ArrayList) this.h;
        int size = arrayList2.size();
        long j = 0;
        int i3 = 0;
        long jMax2 = 0;
        while (i3 < size) {
            m81 m81Var = ((mr0) arrayList2.get(i3)).a;
            if (!(m81Var instanceof zd) ? !(i != 0 ? (m81Var instanceof i51) : (m81Var instanceof z00)) : ((zd) m81Var).f != i) {
                jo joVar = (i == 0 ? qiVar2.d : qiVar2.e).h;
                jo joVar2 = (i == 0 ? qiVar2.d : qiVar2.e).i;
                jo joVar3 = m81Var.h;
                jo joVar4 = m81Var.i;
                boolean zContains = joVar3.l.contains(joVar);
                boolean zContains2 = joVar4.l.contains(joVar2);
                long j2 = m81Var.j();
                if (zContains && zContains2) {
                    long jB = mr0.b(joVar3, j);
                    long jA = mr0.a(joVar4, j);
                    long j3 = jB - j2;
                    int i4 = joVar4.f;
                    arrayList = arrayList2;
                    i2 = size;
                    if (j3 >= (-i4)) {
                        j3 += i4;
                    }
                    long j4 = joVar3.f;
                    long j5 = ((-jA) - j2) - j4;
                    if (j5 >= j4) {
                        j5 -= j4;
                    }
                    pi piVar = m81Var.b;
                    if (i == 0) {
                        f = piVar.d0;
                    } else if (i == 1) {
                        f = piVar.e0;
                    } else {
                        piVar.getClass();
                        f = -1.0f;
                    }
                    float f2 = f > 0.0f ? (long) ((j3 / (1.0f - f)) + (j5 / f)) : 0L;
                    jMax = (joVar3.f + ((((long) ((f2 * f) + 0.5f)) + j2) + ((long) ex0.d(1.0f, f, f2, 0.5f)))) - joVar4.f;
                } else {
                    arrayList = arrayList2;
                    i2 = size;
                    jMax = zContains ? Math.max(mr0.b(joVar3, joVar3.f), joVar3.f + j2) : zContains2 ? Math.max(-mr0.a(joVar4, joVar4.f), (-joVar4.f) + j2) : (m81Var.j() + joVar3.f) - joVar4.f;
                }
            } else {
                arrayList = arrayList2;
                i2 = size;
                jMax = j;
            }
            jMax2 = Math.max(jMax2, jMax);
            i3++;
            qiVar2 = qiVar;
            arrayList2 = arrayList;
            size = i2;
            j = 0;
        }
        return (int) jMax2;
    }

    public void e(m81 m81Var, int i, ArrayList arrayList) {
        jo joVar = m81Var.h;
        jo joVar2 = m81Var.i;
        ArrayList arrayList2 = joVar.k;
        int size = arrayList2.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList2.get(i3);
            i3++;
            ho hoVar = (ho) obj;
            if (hoVar instanceof jo) {
                a((jo) hoVar, i, arrayList, null);
            } else if (hoVar instanceof m81) {
                a(((m81) hoVar).h, i, arrayList, null);
            }
        }
        ArrayList arrayList3 = joVar2.k;
        int size2 = arrayList3.size();
        int i4 = 0;
        while (i4 < size2) {
            Object obj2 = arrayList3.get(i4);
            i4++;
            ho hoVar2 = (ho) obj2;
            if (hoVar2 instanceof jo) {
                a((jo) hoVar2, i, arrayList, null);
            } else if (hoVar2 instanceof m81) {
                a(((m81) hoVar2).i, i, arrayList, null);
            }
        }
        if (i == 1) {
            ArrayList arrayList4 = ((i51) m81Var).k.k;
            int size3 = arrayList4.size();
            while (i2 < size3) {
                Object obj3 = arrayList4.get(i2);
                i2++;
                ho hoVar3 = (ho) obj3;
                if (hoVar3 instanceof jo) {
                    a((jo) hoVar3, i, arrayList, null);
                }
            }
        }
    }

    public void f(int i, int i2, int i3, int i4, pi piVar) {
        ra raVar = (ra) this.g;
        raVar.a = i;
        raVar.b = i3;
        raVar.c = i2;
        raVar.d = i4;
        ((di) this.f).b(piVar, raVar);
        piVar.O(raVar.e);
        piVar.L(raVar.f);
        piVar.E = raVar.h;
        piVar.I(raVar.g);
    }

    public void g() {
        qa qaVar;
        qm qmVar = this;
        ArrayList arrayList = ((qi) qmVar.c).q0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            pi piVar = (pi) arrayList.get(i);
            if (!piVar.a) {
                int[] iArr = piVar.p0;
                int i3 = iArr[0];
                int i4 = iArr[1];
                int i5 = piVar.r;
                int i6 = piVar.s;
                boolean z = i3 == 2 || (i3 == 3 && i5 == 1);
                boolean z2 = i4 == 2 || (i4 == 3 && i6 == 1);
                ap apVar = piVar.d.e;
                boolean z3 = apVar.j;
                ap apVar2 = piVar.e.e;
                boolean z4 = apVar2.j;
                boolean z5 = z;
                if (z3 && z4) {
                    qmVar.f(1, apVar.g, 1, apVar2.g, piVar);
                    piVar.a = true;
                } else if (z3 && z2) {
                    f(1, apVar.g, 2, apVar2.g, piVar);
                    if (i4 == 3) {
                        piVar.e.e.m = piVar.k();
                    } else {
                        piVar.e.e.d(piVar.k());
                        piVar.a = true;
                    }
                } else if (z4 && z5) {
                    f(2, apVar.g, 1, apVar2.g, piVar);
                    if (i3 == 3) {
                        piVar.d.e.m = piVar.q();
                    } else {
                        piVar.d.e.d(piVar.q());
                        piVar.a = true;
                    }
                }
                if (piVar.a && (qaVar = piVar.e.l) != null) {
                    qaVar.d(piVar.a0);
                }
                qmVar = this;
            }
            i = i2;
        }
    }
}

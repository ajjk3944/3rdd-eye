package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class tc {
    public static final i80 b = k80.d(tc.class);
    public final pc a;

    public tc(int i) {
        pc pcVar = new pc(16, 0.75f, true);
        pcVar.f = 50000;
        this.a = pcVar;
    }

    public static int a(long j, long j2) {
        if (j2 >= 0 && j2 < j) {
            j = j2;
        }
        long jCurrentTimeMillis = (System.currentTimeMillis() / 1000) + j;
        if (jCurrentTimeMillis < 0 || jCurrentTimeMillis > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) jCurrentTimeMillis;
    }

    public static int f(int i, boolean z) {
        if (i == 1) {
            if (z) {
                return 4;
            }
        } else {
            if (i != 2) {
                if (i == 3) {
                    return 1;
                }
                throw new IllegalArgumentException("getCred: invalid section");
            }
            if (z) {
                return 4;
            }
        }
        return 3;
    }

    public static void h(kn0 kn0Var, HashSet hashSet) {
        if (kn0Var.e().f() == null) {
            return;
        }
        Iterator it = kn0Var.f(true).iterator();
        while (it.hasNext()) {
            gg0 gg0VarF = ((tn0) it.next()).f();
            if (gg0VarF != null) {
                hashSet.add(gg0VarF);
            }
        }
    }

    public final synchronized void b(gg0 gg0Var, rc rcVar) {
        V v = this.a.get(gg0Var);
        if (v == 0) {
            this.a.put(gg0Var, rcVar);
            return;
        }
        int type = rcVar.getType();
        if (v instanceof List) {
            List list = (List) v;
            for (int i = 0; i < list.size(); i++) {
                if (((rc) list.get(i)).getType() == type) {
                    list.set(i, rcVar);
                    return;
                }
            }
            list.add(rcVar);
        } else {
            rc rcVar2 = (rc) v;
            if (rcVar2.getType() == type) {
                this.a.put(gg0Var, rcVar);
            } else {
                LinkedList linkedList = new LinkedList();
                linkedList.add(rcVar2);
                linkedList.add(rcVar);
                this.a.put(gg0Var, linkedList);
            }
        }
    }

    public final synchronized void c(int i, kn0 kn0Var, boolean z) {
        qc qcVar;
        try {
            long j = kn0Var.e().i;
            gg0 gg0Var = kn0Var.e().f;
            int type = kn0Var.getType();
            rc rcVarE = e(gg0Var, type);
            if (j != 0) {
                if (rcVarE != null && rcVarE.a(i) <= 0) {
                    rcVarE = null;
                }
                if (rcVarE == null) {
                    if (kn0Var instanceof qc) {
                        qcVar = (qc) kn0Var;
                    } else {
                        qc qcVar2 = new qc(kn0Var);
                        qcVar2.j = i;
                        qcVar2.k = a(kn0Var.e().i, -1);
                        qcVar2.l = z;
                        qcVar = qcVar2;
                    }
                    b(gg0Var, qcVar);
                }
            } else if (rcVarE != null && rcVarE.a(i) <= 0) {
                j(gg0Var, type);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized rc[] d(Object obj) {
        if (!(obj instanceof List)) {
            return new rc[]{(rc) obj};
        }
        List list = (List) obj;
        return (rc[]) list.toArray(new rc[list.size()]);
    }

    public final synchronized rc e(gg0 gg0Var, int i) {
        Object obj;
        synchronized (this) {
            obj = this.a.get(gg0Var);
        }
        if (obj == null) {
            return null;
        }
        return i(gg0Var, obj, i, 0);
    }

    public final nu0 g(gg0 gg0Var, int i, int i2) {
        synchronized (this) {
            try {
                int i3 = gg0Var.i;
                int i4 = i3;
                while (true) {
                    boolean z = true;
                    if (i4 < 1) {
                        return nu0.b(1, null, false);
                    }
                    boolean z2 = i4 == 1;
                    if (i4 != i3) {
                        z = false;
                    }
                    gg0 gg0Var2 = z2 ? gg0.l : z ? gg0Var : new gg0(gg0Var, i3 - i4);
                    Object obj = this.a.get(gg0Var2);
                    if (obj != null) {
                        if (z && i == 255) {
                            rc[] rcVarArrD = d(obj);
                            nu0 nu0VarB = nu0.b(7, null, false);
                            int i5 = 0;
                            for (rc rcVar : rcVarArrD) {
                                if (rcVar.b()) {
                                    j(gg0Var2, rcVar.getType());
                                } else if ((rcVar instanceof qc) && rcVar.a(i2) >= 0) {
                                    nu0VarB.a((qc) rcVar);
                                    i5++;
                                }
                            }
                            if (i5 > 0) {
                                return nu0VarB;
                            }
                        } else if (z) {
                            rc rcVarI = i(gg0Var2, obj, i, i2);
                            if (rcVarI instanceof qc) {
                                qc qcVar = (qc) rcVarI;
                                nu0 nu0Var = nu0.d;
                                return nu0.b(7, qcVar, qcVar.l);
                            }
                            if (rcVarI != null) {
                                return nu0.b(3, null, false);
                            }
                            rc rcVarI2 = i(gg0Var2, obj, 5, i2);
                            if (rcVarI2 instanceof qc) {
                                qc qcVar2 = (qc) rcVarI2;
                                nu0 nu0Var2 = nu0.d;
                                return nu0.b(5, qcVar2, qcVar2.l);
                            }
                        } else {
                            rc rcVarI3 = i(gg0Var2, obj, 39, i2);
                            if (rcVarI3 instanceof qc) {
                                qc qcVar3 = (qc) rcVarI3;
                                nu0 nu0Var3 = nu0.d;
                                return nu0.b(6, qcVar3, qcVar3.l);
                            }
                        }
                        rc rcVarI4 = i(gg0Var2, obj, 2, i2);
                        if (rcVarI4 instanceof qc) {
                            qc qcVar4 = (qc) rcVarI4;
                            nu0 nu0Var4 = nu0.d;
                            return nu0.b(4, qcVar4, qcVar4.l);
                        }
                        if (z && i(gg0Var2, obj, 0, i2) != null) {
                            return nu0.b(2, null, false);
                        }
                    }
                    i4--;
                }
            } finally {
            }
        }
    }

    public final synchronized rc i(gg0 gg0Var, Object obj, int i, int i2) {
        try {
            if (i == 255) {
                throw new IllegalArgumentException("oneElement(ANY)");
            }
            if (obj instanceof List) {
                for (rc rcVar : (List) obj) {
                    if (rcVar.getType() == i) {
                    }
                }
                rcVar = null;
            } else {
                rcVar = (rc) obj;
                if (rcVar.getType() != i) {
                    rcVar = null;
                }
            }
            if (rcVar == null) {
                return null;
            }
            if (rcVar.b()) {
                j(gg0Var, i);
                return null;
            }
            if (rcVar.a(i2) < 0) {
                return null;
            }
            return rcVar;
        } finally {
        }
    }

    public final synchronized void j(gg0 gg0Var, int i) {
        V v = this.a.get(gg0Var);
        if (v == 0) {
            return;
        }
        if (v instanceof List) {
            List list = (List) v;
            for (int i2 = 0; i2 < list.size(); i2++) {
                if (((rc) list.get(i2)).getType() == i) {
                    list.remove(i2);
                    if (list.isEmpty()) {
                        this.a.remove(gg0Var);
                    }
                    return;
                }
            }
        } else if (((rc) v).getType() == i) {
            this.a.remove(gg0Var);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        synchronized (this) {
            try {
                Iterator it = this.a.values().iterator();
                while (it.hasNext()) {
                    for (rc rcVar : d(it.next())) {
                        sb.append(rcVar);
                        sb.append("\n");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return sb.toString();
    }
}

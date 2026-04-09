package defpackage;

import android.util.SparseArray;
import android.util.SparseIntArray;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class pj4 implements an1 {
    public int f;
    public final Object g;
    public final Object h;
    public final Object i;
    public Object j;

    public pj4(xf1 xf1Var, ug0 ug0Var, byte[] bArr, kj1[] kj1VarArr, int i) {
        this.g = xf1Var;
        this.h = ug0Var;
        this.i = bArr;
        this.j = kj1VarArr;
        this.f = i;
    }

    public boolean a(int i) {
        return ((jc4[]) this.g)[i] != null;
    }

    public boolean c(pj4 pj4Var, int i) {
        return pj4Var != null && Objects.equals(((jc4[]) this.g)[i], ((jc4[]) pj4Var.g)[i]) && Objects.equals(((nj4[]) this.h)[i], ((nj4[]) pj4Var.h)[i]);
    }

    public synchronized void d() {
        a73 a73Var;
        if (((Boolean) tw1.e.c.a(mz1.F6)).booleanValue() && !hg4.C.h.g().m().j) {
            ((ArrayDeque) this.i).clear();
            return;
        }
        synchronized (this) {
            try {
                if (((gc3) this.j) == null) {
                    while (true) {
                        ArrayDeque arrayDeque = (ArrayDeque) this.i;
                        if (arrayDeque.isEmpty()) {
                            break;
                        }
                        a73Var = (a73) arrayDeque.pollFirst();
                        if (a73Var == null) {
                            break;
                        }
                        f93 f93Var = a73Var.g;
                        if (f93Var != null) {
                            t83 t83Var = (t83) this.g;
                            synchronized (t83Var) {
                                z83 z83Var = (z83) ((ConcurrentHashMap) t83Var.g).get(f93Var);
                                if (z83Var == null) {
                                    break;
                                }
                                d93 d93Var = (d93) t83Var.h;
                                z83Var.a();
                                if (z83Var.a.size() < d93Var.j) {
                                    break;
                                }
                            }
                        }
                    }
                    gc3 gc3Var = new gc3((t83) this.g, (z71) this.h, a73Var);
                    this.j = gc3Var;
                    lv2 lv2Var = new lv2((Object) this, (Object) a73Var, 6, false);
                    synchronized (gc3Var) {
                        qp3 qp3VarO = pu1.O((wo3) gc3Var.d, fi1.n, a73Var.e);
                        qp3VarO.c(new jq3(qp3VarO, lv2Var, 0), a73Var.e);
                    }
                }
            } finally {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01db  */
    /* JADX WARN: Type inference failed for: r0v16, types: [bn1] */
    /* JADX WARN: Type inference failed for: r0v23, types: [bn1] */
    @Override // defpackage.an1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void e(defpackage.kz2 r29) {
        /*
            Method dump skipped, instructions count: 974
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pj4.e(kz2):void");
    }

    public pj4(gn1 gn1Var, int i) {
        Objects.requireNonNull(gn1Var);
        this.j = gn1Var;
        this.g = new lg1(5, new byte[5]);
        this.h = new SparseArray();
        this.i = new SparseIntArray();
        this.f = i;
    }

    public pj4(t83 t83Var) {
        ArrayList arrayList = (ArrayList) t83Var.h;
        int size = arrayList.size();
        this.g = (String[]) ((ArrayList) t83Var.g).toArray(new String[size]);
        int size2 = arrayList.size();
        double[] dArr = new double[size2];
        for (int i = 0; i < size2; i++) {
            dArr[i] = ((Double) arrayList.get(i)).doubleValue();
        }
        this.h = dArr;
        ArrayList arrayList2 = (ArrayList) t83Var.i;
        int size3 = arrayList2.size();
        double[] dArr2 = new double[size3];
        for (int i2 = 0; i2 < size3; i2++) {
            dArr2[i2] = ((Double) arrayList2.get(i2)).doubleValue();
        }
        this.i = dArr2;
        this.j = new int[size];
        this.f = 0;
    }

    public pj4(t83 t83Var, x83 x83Var, z71 z71Var) {
        this.f = 1;
        this.g = t83Var;
        this.h = z71Var;
        this.i = new ArrayDeque();
        x83Var.a = new vg0(25, this);
    }

    public pj4(jc4[] jc4VarArr, nj4[] nj4VarArr, o42 o42Var, oj4 oj4Var) {
        int length = jc4VarArr.length;
        zt0.D(length == nj4VarArr.length);
        this.g = jc4VarArr;
        this.h = (nj4[]) nj4VarArr.clone();
        this.i = o42Var;
        this.j = oj4Var;
        this.f = length;
    }

    @Override // defpackage.an1
    public void b(x13 x13Var, nf1 nf1Var, in1 in1Var) {
    }
}

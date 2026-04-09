package zc;

import com.google.android.gms.internal.measurement.v7;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class u3 {

    /* renamed from: a, reason: collision with root package name */
    public final String f27234a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f27235b;

    /* renamed from: c, reason: collision with root package name */
    public final com.google.android.gms.internal.measurement.k3 f27236c;

    /* renamed from: d, reason: collision with root package name */
    public final BitSet f27237d;

    /* renamed from: e, reason: collision with root package name */
    public final BitSet f27238e;

    /* renamed from: f, reason: collision with root package name */
    public final u.e f27239f;

    /* renamed from: g, reason: collision with root package name */
    public final u.e f27240g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c f27241h;

    public u3(c cVar, String str, com.google.android.gms.internal.measurement.k3 k3Var, BitSet bitSet, BitSet bitSet2, u.e eVar, u.e eVar2) {
        this.f27241h = cVar;
        this.f27234a = str;
        this.f27237d = bitSet;
        this.f27238e = bitSet2;
        this.f27239f = eVar;
        this.f27240g = new u.e(0);
        Iterator it = ((u.b) eVar2.keySet()).iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) eVar2.get(num));
            this.f27240g.put(num, arrayList);
        }
        this.f27235b = false;
        this.f27236c = k3Var;
    }

    public final void a(b bVar) {
        int iQ;
        boolean z10;
        boolean zV;
        switch (bVar.f26868g) {
            case 0:
                iQ = ((com.google.android.gms.internal.measurement.m1) bVar.f26870i).q();
                break;
            default:
                iQ = ((com.google.android.gms.internal.measurement.t1) bVar.f26870i).q();
                break;
        }
        if (bVar.f26864c != null) {
            this.f27238e.set(iQ, true);
        }
        Boolean bool = bVar.f26865d;
        if (bool != null) {
            this.f27237d.set(iQ, bool.booleanValue());
        }
        if (bVar.f26866e != null) {
            Integer numValueOf = Integer.valueOf(iQ);
            u.e eVar = this.f27239f;
            Long l10 = (Long) eVar.get(numValueOf);
            long jLongValue = bVar.f26866e.longValue() / 1000;
            if (l10 == null || jLongValue > l10.longValue()) {
                eVar.put(numValueOf, Long.valueOf(jLongValue));
            }
        }
        if (bVar.f26867f != null) {
            Integer numValueOf2 = Integer.valueOf(iQ);
            u.e eVar2 = this.f27240g;
            List arrayList = (List) eVar2.get(numValueOf2);
            if (arrayList == null) {
                arrayList = new ArrayList();
                eVar2.put(numValueOf2, arrayList);
            }
            switch (bVar.f26868g) {
                case 0:
                    z10 = false;
                    break;
                default:
                    z10 = true;
                    break;
            }
            if (z10) {
                arrayList.clear();
            }
            v7.a();
            c1 c1Var = (c1) this.f27241h.f1504d;
            f fVar = c1Var.f26887r;
            t tVar = u.F0;
            String str = this.f27234a;
            if (fVar.C1(str, tVar)) {
                switch (bVar.f26868g) {
                    case 0:
                        zV = ((com.google.android.gms.internal.measurement.m1) bVar.f26870i).v();
                        break;
                    default:
                        zV = false;
                        break;
                }
                if (zV) {
                    arrayList.clear();
                }
            }
            v7.a();
            if (!c1Var.f26887r.C1(str, tVar)) {
                arrayList.add(Long.valueOf(bVar.f26867f.longValue() / 1000));
                return;
            }
            Long lValueOf = Long.valueOf(bVar.f26867f.longValue() / 1000);
            if (arrayList.contains(lValueOf)) {
                return;
            }
            arrayList.add(lValueOf);
        }
    }

    public final com.google.android.gms.internal.measurement.r2 b(int i10) {
        ArrayList arrayList;
        List list;
        com.google.android.gms.internal.measurement.q2 q2VarW = com.google.android.gms.internal.measurement.r2.w();
        q2VarW.b();
        ((com.google.android.gms.internal.measurement.r2) q2VarW.f5042d).x(i10);
        q2VarW.b();
        ((com.google.android.gms.internal.measurement.r2) q2VarW.f5042d).A(this.f27235b);
        com.google.android.gms.internal.measurement.k3 k3Var = this.f27236c;
        if (k3Var != null) {
            q2VarW.b();
            ((com.google.android.gms.internal.measurement.r2) q2VarW.f5042d).z(k3Var);
        }
        com.google.android.gms.internal.measurement.j3 j3VarX = com.google.android.gms.internal.measurement.k3.x();
        ArrayList arrayListA2 = m0.a2(this.f27237d);
        j3VarX.b();
        ((com.google.android.gms.internal.measurement.k3) j3VarX.f5042d).B(arrayListA2);
        ArrayList arrayListA22 = m0.a2(this.f27238e);
        j3VarX.b();
        ((com.google.android.gms.internal.measurement.k3) j3VarX.f5042d).z(arrayListA22);
        u.e eVar = this.f27239f;
        if (eVar == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(eVar.f23077g);
            Iterator it = ((u.b) eVar.keySet()).iterator();
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                int iIntValue = num.intValue();
                Long l10 = (Long) eVar.get(num);
                if (l10 != null) {
                    com.google.android.gms.internal.measurement.w2 w2VarT = com.google.android.gms.internal.measurement.x2.t();
                    w2VarT.b();
                    ((com.google.android.gms.internal.measurement.x2) w2VarT.f5042d).u(iIntValue);
                    long jLongValue = l10.longValue();
                    w2VarT.b();
                    ((com.google.android.gms.internal.measurement.x2) w2VarT.f5042d).v(jLongValue);
                    arrayList2.add((com.google.android.gms.internal.measurement.x2) w2VarT.e());
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            j3VarX.b();
            ((com.google.android.gms.internal.measurement.k3) j3VarX.f5042d).D(arrayList);
        }
        u.e eVar2 = this.f27240g;
        if (eVar2 == null) {
            list = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList3 = new ArrayList(eVar2.f23077g);
            Iterator it2 = ((u.b) eVar2.keySet()).iterator();
            while (it2.hasNext()) {
                Integer num2 = (Integer) it2.next();
                com.google.android.gms.internal.measurement.l3 l3VarU = com.google.android.gms.internal.measurement.m3.u();
                int iIntValue2 = num2.intValue();
                l3VarU.b();
                ((com.google.android.gms.internal.measurement.m3) l3VarU.f5042d).v(iIntValue2);
                List list2 = (List) eVar2.get(num2);
                if (list2 != null) {
                    Collections.sort(list2);
                    l3VarU.b();
                    ((com.google.android.gms.internal.measurement.m3) l3VarU.f5042d).w(list2);
                }
                arrayList3.add((com.google.android.gms.internal.measurement.m3) l3VarU.e());
            }
            list = arrayList3;
        }
        j3VarX.b();
        ((com.google.android.gms.internal.measurement.k3) j3VarX.f5042d).F(list);
        q2VarW.b();
        ((com.google.android.gms.internal.measurement.r2) q2VarW.f5042d).y((com.google.android.gms.internal.measurement.k3) j3VarX.e());
        return (com.google.android.gms.internal.measurement.r2) q2VarW.e();
    }

    public u3(c cVar, String str) {
        this.f27241h = cVar;
        this.f27234a = str;
        this.f27235b = true;
        this.f27237d = new BitSet();
        this.f27238e = new BitSet();
        this.f27239f = new u.e(0);
        this.f27240g = new u.e(0);
    }
}

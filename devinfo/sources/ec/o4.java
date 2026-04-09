package ec;

import com.google.android.gms.internal.measurement.u7;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class o4 {

    /* renamed from: a, reason: collision with root package name */
    public final String f22977a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f22978b;

    /* renamed from: c, reason: collision with root package name */
    public final com.google.android.gms.internal.measurement.m3 f22979c;

    /* renamed from: d, reason: collision with root package name */
    public final BitSet f22980d;

    /* renamed from: e, reason: collision with root package name */
    public final BitSet f22981e;

    /* renamed from: f, reason: collision with root package name */
    public final x.e f22982f;
    public final x.e g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c f22983h;

    public o4(c cVar, String str, com.google.android.gms.internal.measurement.m3 m3Var, BitSet bitSet, BitSet bitSet2, x.e eVar, x.e eVar2) {
        this.f22983h = cVar;
        this.f22977a = str;
        this.f22980d = bitSet;
        this.f22981e = bitSet2;
        this.f22982f = eVar;
        this.g = new x.e(0);
        Iterator it = ((x.b) eVar2.keySet()).iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) eVar2.get(num));
            this.g.put(num, arrayList);
        }
        this.f22978b = false;
        this.f22979c = m3Var;
    }

    public final void a(b bVar) {
        int iQ;
        boolean z3;
        boolean zV;
        switch (bVar.g) {
            case 0:
                iQ = ((com.google.android.gms.internal.measurement.o1) bVar.f22554i).q();
                break;
            default:
                iQ = ((com.google.android.gms.internal.measurement.v1) bVar.f22554i).q();
                break;
        }
        if (bVar.f22549c != null) {
            this.f22981e.set(iQ, true);
        }
        Boolean bool = bVar.f22550d;
        if (bool != null) {
            this.f22980d.set(iQ, bool.booleanValue());
        }
        if (bVar.f22551e != null) {
            Integer numValueOf = Integer.valueOf(iQ);
            x.e eVar = this.f22982f;
            Long l10 = (Long) eVar.get(numValueOf);
            long jLongValue = bVar.f22551e.longValue() / 1000;
            if (l10 == null || jLongValue > l10.longValue()) {
                eVar.put(numValueOf, Long.valueOf(jLongValue));
            }
        }
        if (bVar.f22552f != null) {
            Integer numValueOf2 = Integer.valueOf(iQ);
            x.e eVar2 = this.g;
            List arrayList = (List) eVar2.get(numValueOf2);
            if (arrayList == null) {
                arrayList = new ArrayList();
                eVar2.put(numValueOf2, arrayList);
            }
            switch (bVar.g) {
                case 0:
                    z3 = false;
                    break;
                default:
                    z3 = true;
                    break;
            }
            if (z3) {
                arrayList.clear();
            }
            u7.a();
            o1 o1Var = (o1) this.f22983h.f218b;
            g gVar = o1Var.f22952d;
            c0 c0Var = d0.G0;
            String str = this.f22977a;
            if (gVar.L(str, c0Var)) {
                switch (bVar.g) {
                    case 0:
                        zV = ((com.google.android.gms.internal.measurement.o1) bVar.f22554i).v();
                        break;
                    default:
                        zV = false;
                        break;
                }
                if (zV) {
                    arrayList.clear();
                }
            }
            u7.a();
            if (!o1Var.f22952d.L(str, c0Var)) {
                arrayList.add(Long.valueOf(bVar.f22552f.longValue() / 1000));
                return;
            }
            Long lValueOf = Long.valueOf(bVar.f22552f.longValue() / 1000);
            if (arrayList.contains(lValueOf)) {
                return;
            }
            arrayList.add(lValueOf);
        }
    }

    public final com.google.android.gms.internal.measurement.t2 b(int i4) {
        ArrayList arrayList;
        List list;
        com.google.android.gms.internal.measurement.s2 s2VarW = com.google.android.gms.internal.measurement.t2.w();
        s2VarW.b();
        ((com.google.android.gms.internal.measurement.t2) s2VarW.f19740b).x(i4);
        s2VarW.b();
        ((com.google.android.gms.internal.measurement.t2) s2VarW.f19740b).A(this.f22978b);
        com.google.android.gms.internal.measurement.m3 m3Var = this.f22979c;
        if (m3Var != null) {
            s2VarW.b();
            ((com.google.android.gms.internal.measurement.t2) s2VarW.f19740b).z(m3Var);
        }
        com.google.android.gms.internal.measurement.l3 l3VarX = com.google.android.gms.internal.measurement.m3.x();
        ArrayList arrayListJ0 = w0.j0(this.f22980d);
        l3VarX.b();
        ((com.google.android.gms.internal.measurement.m3) l3VarX.f19740b).B(arrayListJ0);
        ArrayList arrayListJ02 = w0.j0(this.f22981e);
        l3VarX.b();
        ((com.google.android.gms.internal.measurement.m3) l3VarX.f19740b).z(arrayListJ02);
        x.e eVar = this.f22982f;
        if (eVar == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(eVar.f36920c);
            Iterator it = ((x.b) eVar.keySet()).iterator();
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                int iIntValue = num.intValue();
                Long l10 = (Long) eVar.get(num);
                if (l10 != null) {
                    com.google.android.gms.internal.measurement.y2 y2VarT = com.google.android.gms.internal.measurement.z2.t();
                    y2VarT.b();
                    ((com.google.android.gms.internal.measurement.z2) y2VarT.f19740b).u(iIntValue);
                    long jLongValue = l10.longValue();
                    y2VarT.b();
                    ((com.google.android.gms.internal.measurement.z2) y2VarT.f19740b).v(jLongValue);
                    arrayList2.add((com.google.android.gms.internal.measurement.z2) y2VarT.f());
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            l3VarX.b();
            ((com.google.android.gms.internal.measurement.m3) l3VarX.f19740b).D(arrayList);
        }
        x.e eVar2 = this.g;
        if (eVar2 == null) {
            list = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList3 = new ArrayList(eVar2.f36920c);
            Iterator it2 = ((x.b) eVar2.keySet()).iterator();
            while (it2.hasNext()) {
                Integer num2 = (Integer) it2.next();
                com.google.android.gms.internal.measurement.n3 n3VarU = com.google.android.gms.internal.measurement.o3.u();
                int iIntValue2 = num2.intValue();
                n3VarU.b();
                ((com.google.android.gms.internal.measurement.o3) n3VarU.f19740b).v(iIntValue2);
                List list2 = (List) eVar2.get(num2);
                if (list2 != null) {
                    Collections.sort(list2);
                    n3VarU.b();
                    ((com.google.android.gms.internal.measurement.o3) n3VarU.f19740b).w(list2);
                }
                arrayList3.add((com.google.android.gms.internal.measurement.o3) n3VarU.f());
            }
            list = arrayList3;
        }
        l3VarX.b();
        ((com.google.android.gms.internal.measurement.m3) l3VarX.f19740b).F(list);
        s2VarW.b();
        ((com.google.android.gms.internal.measurement.t2) s2VarW.f19740b).y((com.google.android.gms.internal.measurement.m3) l3VarX.f());
        return (com.google.android.gms.internal.measurement.t2) s2VarW.f();
    }

    public o4(c cVar, String str) {
        this.f22983h = cVar;
        this.f22977a = str;
        this.f22978b = true;
        this.f22980d = new BitSet();
        this.f22981e = new BitSet();
        this.f22982f = new x.e(0);
        this.g = new x.e(0);
    }
}

package or;

import ht.a1;
import ht.x;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import mq.b0;
import rr.f0;
import ur.c0;

/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public static final Set f19727a;

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f19728b;

    /* renamed from: c, reason: collision with root package name */
    public static final HashMap f19729c;

    /* renamed from: d, reason: collision with root package name */
    public static final LinkedHashSet f19730d;

    static {
        r[] rVarArrValues = r.values();
        ArrayList arrayList = new ArrayList(rVarArrValues.length);
        for (r rVar : rVarArrValues) {
            arrayList.add(rVar.getTypeName());
        }
        f19727a = mq.o.U0(arrayList);
        q[] qVarArrValues = q.values();
        ArrayList arrayList2 = new ArrayList(qVarArrValues.length);
        for (q qVar : qVarArrValues) {
            arrayList2.add(qVar.getTypeName());
        }
        mq.o.U0(arrayList2);
        f19728b = new HashMap();
        f19729c = new HashMap();
        b0.U(new HashMap(b0.P(4)), new lq.l[]{new lq.l(q.UBYTEARRAY, qs.g.e("ubyteArrayOf")), new lq.l(q.USHORTARRAY, qs.g.e("ushortArrayOf")), new lq.l(q.UINTARRAY, qs.g.e("uintArrayOf")), new lq.l(q.ULONGARRAY, qs.g.e("ulongArrayOf"))});
        r[] rVarArrValues2 = r.values();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (r rVar2 : rVarArrValues2) {
            linkedHashSet.add(rVar2.getArrayClassId().i());
        }
        f19730d = linkedHashSet;
        for (r rVar3 : r.values()) {
            f19728b.put(rVar3.getArrayClassId(), rVar3.getClassId());
            f19729c.put(rVar3.getClassId(), rVar3.getArrayClassId());
        }
    }

    public static final boolean a(x xVar) {
        rr.i iVarP;
        if (a1.l(xVar) || (iVarP = xVar.Z().p()) == null) {
            return false;
        }
        rr.l lVarO = iVarP.o();
        return (lVarO instanceof f0) && br.l.a(((c0) ((f0) lVarO)).f23629y, o.j) && f19727a.contains(iVarP.getName());
    }
}

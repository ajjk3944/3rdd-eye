package kotlin.reflect.jvm.internal.impl.builtins;

import Bh.InterfaceC2498h;
import Bh.InterfaceC2503m;
import Bh.M;
import Yg.z;
import Zg.AbstractC3689v;
import Zg.U;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6492s;
import pi.J0;
import pi.S;

/* loaded from: classes4.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public static final s f51897a = new s();

    /* renamed from: b, reason: collision with root package name */
    private static final Set f51898b;

    /* renamed from: c, reason: collision with root package name */
    private static final Set f51899c;

    /* renamed from: d, reason: collision with root package name */
    private static final HashMap f51900d;

    /* renamed from: e, reason: collision with root package name */
    private static final HashMap f51901e;

    /* renamed from: f, reason: collision with root package name */
    private static final HashMap f51902f;

    /* renamed from: g, reason: collision with root package name */
    private static final Set f51903g;

    static {
        r[] rVarArrValues = r.values();
        ArrayList arrayList = new ArrayList(rVarArrValues.length);
        for (r rVar : rVarArrValues) {
            arrayList.add(rVar.getTypeName());
        }
        f51898b = AbstractC3689v.n1(arrayList);
        q[] qVarArrValues = q.values();
        ArrayList arrayList2 = new ArrayList(qVarArrValues.length);
        for (q qVar : qVarArrValues) {
            arrayList2.add(qVar.getTypeName());
        }
        f51899c = AbstractC3689v.n1(arrayList2);
        f51900d = new HashMap();
        f51901e = new HashMap();
        f51902f = U.j(z.a(q.UBYTEARRAY, Zh.f.h("ubyteArrayOf")), z.a(q.USHORTARRAY, Zh.f.h("ushortArrayOf")), z.a(q.UINTARRAY, Zh.f.h("uintArrayOf")), z.a(q.ULONGARRAY, Zh.f.h("ulongArrayOf")));
        r[] rVarArrValues2 = r.values();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (r rVar2 : rVarArrValues2) {
            linkedHashSet.add(rVar2.getArrayClassId().h());
        }
        f51903g = linkedHashSet;
        for (r rVar3 : r.values()) {
            f51900d.put(rVar3.getArrayClassId(), rVar3.getClassId());
            f51901e.put(rVar3.getClassId(), rVar3.getArrayClassId());
        }
    }

    private s() {
    }

    public static final boolean d(S type) {
        InterfaceC2498h interfaceC2498hC;
        AbstractC6492s.i(type, "type");
        if (J0.w(type) || (interfaceC2498hC = type.N0().c()) == null) {
            return false;
        }
        return f51897a.c(interfaceC2498hC);
    }

    public final Zh.b a(Zh.b arrayClassId) {
        AbstractC6492s.i(arrayClassId, "arrayClassId");
        return (Zh.b) f51900d.get(arrayClassId);
    }

    public final boolean b(Zh.f name) {
        AbstractC6492s.i(name, "name");
        return f51903g.contains(name);
    }

    public final boolean c(InterfaceC2503m descriptor) {
        AbstractC6492s.i(descriptor, "descriptor");
        InterfaceC2503m interfaceC2503mB = descriptor.b();
        return (interfaceC2503mB instanceof M) && AbstractC6492s.d(((M) interfaceC2503mB).e(), o.f51769A) && f51898b.contains(descriptor.getName());
    }
}

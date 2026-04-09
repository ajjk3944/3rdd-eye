package Zi;

import Yg.u;
import Zg.AbstractC3689v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AbstractC6492s;
import lh.AbstractC6596a;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;

/* renamed from: Zi.u, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C3733u implements InterfaceC3744z0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC6839p f25696a;

    /* renamed from: b, reason: collision with root package name */
    private final C3735v f25697b;

    /* renamed from: Zi.u$a */
    public static final class a implements InterfaceC6824a {
        @Override // mh.InterfaceC6824a
        public final Object invoke() {
            return new C3742y0();
        }
    }

    public C3733u(InterfaceC6839p compute) {
        AbstractC6492s.i(compute, "compute");
        this.f25696a = compute;
        this.f25697b = new C3735v();
    }

    @Override // Zi.InterfaceC3744z0
    public Object a(th.d key, List types) {
        Object objC;
        AbstractC6492s.i(key, "key");
        AbstractC6492s.i(types, "types");
        Object obj = this.f25697b.get(AbstractC6596a.b(key));
        AbstractC6492s.h(obj, "get(...)");
        C3719m0 c3719m0 = (C3719m0) obj;
        Object objA = c3719m0.f25665a.get();
        if (objA == null) {
            objA = c3719m0.a(new a());
        }
        C3742y0 c3742y0 = (C3742y0) objA;
        List list = types;
        ArrayList arrayList = new ArrayList(AbstractC3689v.w(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new Y((th.p) it.next()));
        }
        ConcurrentHashMap concurrentHashMap = c3742y0.f25708a;
        Object obj2 = concurrentHashMap.get(arrayList);
        if (obj2 == null) {
            try {
                u.a aVar = Yg.u.f25017b;
                objC = Yg.u.c((Vi.b) this.f25696a.invoke(key, types));
            } catch (Throwable th2) {
                u.a aVar2 = Yg.u.f25017b;
                objC = Yg.u.c(Yg.v.a(th2));
            }
            Yg.u uVarA = Yg.u.a(objC);
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(arrayList, uVarA);
            obj2 = objPutIfAbsent == null ? uVarA : objPutIfAbsent;
        }
        AbstractC6492s.h(obj2, "getOrPut(...)");
        return ((Yg.u) obj2).o();
    }
}

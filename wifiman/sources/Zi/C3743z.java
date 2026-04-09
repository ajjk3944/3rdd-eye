package Zi;

import Yg.u;
import Zg.AbstractC3689v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AbstractC6492s;
import lh.AbstractC6596a;
import mh.InterfaceC6839p;

/* renamed from: Zi.z, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C3743z implements InterfaceC3744z0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC6839p f25709a;

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentHashMap f25710b;

    public C3743z(InterfaceC6839p compute) {
        AbstractC6492s.i(compute, "compute");
        this.f25709a = compute;
        this.f25710b = new ConcurrentHashMap();
    }

    @Override // Zi.InterfaceC3744z0
    public Object a(th.d key, List types) {
        Object objC;
        Object objPutIfAbsent;
        AbstractC6492s.i(key, "key");
        AbstractC6492s.i(types, "types");
        ConcurrentHashMap concurrentHashMap = this.f25710b;
        Class clsB = AbstractC6596a.b(key);
        Object c3742y0 = concurrentHashMap.get(clsB);
        if (c3742y0 == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(clsB, (c3742y0 = new C3742y0()))) != null) {
            c3742y0 = objPutIfAbsent;
        }
        C3742y0 c3742y02 = (C3742y0) c3742y0;
        List list = types;
        ArrayList arrayList = new ArrayList(AbstractC3689v.w(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new Y((th.p) it.next()));
        }
        ConcurrentHashMap concurrentHashMap2 = c3742y02.f25708a;
        Object obj = concurrentHashMap2.get(arrayList);
        if (obj == null) {
            try {
                u.a aVar = Yg.u.f25017b;
                objC = Yg.u.c((Vi.b) this.f25709a.invoke(key, types));
            } catch (Throwable th2) {
                u.a aVar2 = Yg.u.f25017b;
                objC = Yg.u.c(Yg.v.a(th2));
            }
            Yg.u uVarA = Yg.u.a(objC);
            Object objPutIfAbsent2 = concurrentHashMap2.putIfAbsent(arrayList, uVarA);
            obj = objPutIfAbsent2 == null ? uVarA : objPutIfAbsent2;
        }
        AbstractC6492s.h(obj, "getOrPut(...)");
        return ((Yg.u) obj).o();
    }
}

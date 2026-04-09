package wh;

import Zg.AbstractC3689v;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AbstractC6492s;
import uh.AbstractC8173a;

/* renamed from: wh.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC8362h {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC8348a f65147a = AbstractC8350b.a(C8352c.f65121a);

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC8348a f65148b = AbstractC8350b.a(C8354d.f65124a);

    /* renamed from: c, reason: collision with root package name */
    private static final AbstractC8348a f65149c = AbstractC8350b.a(C8356e.f65134a);

    /* renamed from: d, reason: collision with root package name */
    private static final AbstractC8348a f65150d = AbstractC8350b.a(C8358f.f65139a);

    /* renamed from: e, reason: collision with root package name */
    private static final AbstractC8348a f65151e = AbstractC8350b.a(C8360g.f65144a);

    /* JADX INFO: Access modifiers changed from: private */
    public static final th.p a(Class it) {
        AbstractC6492s.i(it, "it");
        return AbstractC8173a.b(m(it), AbstractC3689v.l(), false, AbstractC3689v.l());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConcurrentHashMap b(Class it) {
        AbstractC6492s.i(it, "it");
        return new ConcurrentHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final th.p c(Class it) {
        AbstractC6492s.i(it, "it");
        return AbstractC8173a.b(m(it), AbstractC3689v.l(), true, AbstractC3689v.l());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final X d(Class it) {
        AbstractC6492s.i(it, "it");
        return new X(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C8390v0 e(Class it) {
        AbstractC6492s.i(it, "it");
        return new C8390v0(it);
    }

    public static final th.p k(Class jClass, List arguments, boolean z10) {
        AbstractC6492s.i(jClass, "jClass");
        AbstractC6492s.i(arguments, "arguments");
        return arguments.isEmpty() ? z10 ? (th.p) f65150d.a(jClass) : (th.p) f65149c.a(jClass) : l(jClass, arguments, z10);
    }

    private static final th.p l(Class cls, List list, boolean z10) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) f65151e.a(cls);
        Yg.s sVarA = Yg.z.a(list, Boolean.valueOf(z10));
        Object obj = concurrentHashMap.get(sVarA);
        if (obj == null) {
            th.p pVarB = AbstractC8173a.b(m(cls), list, z10, AbstractC3689v.l());
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(sVarA, pVarB);
            obj = objPutIfAbsent == null ? pVarB : objPutIfAbsent;
        }
        AbstractC6492s.h(obj, "getOrPut(...)");
        return (th.p) obj;
    }

    public static final X m(Class jClass) {
        AbstractC6492s.i(jClass, "jClass");
        Object objA = f65147a.a(jClass);
        AbstractC6492s.g(objA, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<T of kotlin.reflect.jvm.internal.CachesKt.getOrCreateKotlinClass>");
        return (X) objA;
    }

    public static final th.f n(Class jClass) {
        AbstractC6492s.i(jClass, "jClass");
        return (th.f) f65148b.a(jClass);
    }
}

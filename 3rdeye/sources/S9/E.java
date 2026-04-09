package S9;

import K6.P0;
import N7.B8;
import Q9.C1545n0;
import R9.AbstractC1564a;
import S9.C1586s;
import c9.C2078B;
import c9.C2079C;
import c9.C2101v;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: TreeJsonDecoder.kt */
/* loaded from: classes3.dex */
public class E extends AbstractC1570b {

    /* renamed from: f, reason: collision with root package name */
    public final R9.z f12016f;

    /* renamed from: g, reason: collision with root package name */
    public final String f12017g;

    /* renamed from: h, reason: collision with root package name */
    public final O9.e f12018h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f12019j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(AbstractC1564a json, R9.z value, String str, O9.e eVar) {
        super(json, value);
        kotlin.jvm.internal.l.f(json, "json");
        kotlin.jvm.internal.l.f(value, "value");
        this.f12016f = value;
        this.f12017g = str;
        this.f12018h = eVar;
    }

    @Override // Q9.AbstractC1525d0
    public String S(O9.e descriptor, int i) {
        Object next;
        kotlin.jvm.internal.l.f(descriptor, "descriptor");
        AbstractC1564a abstractC1564a = this.f12070d;
        y.c(descriptor, abstractC1564a);
        String strG = descriptor.g(i);
        if (this.f12071e.f11805g && !X().f11826b.keySet().contains(strG)) {
            kotlin.jvm.internal.l.f(abstractC1564a, "<this>");
            C1586s.a<Map<String, Integer>> aVar = y.f12110a;
            P0 p02 = new P0(1, descriptor, abstractC1564a);
            C1586s c1586s = abstractC1564a.f11783c;
            c1586s.getClass();
            Object objA = c1586s.a(descriptor, aVar);
            if (objA == null) {
                objA = p02.invoke();
                ConcurrentHashMap concurrentHashMap = c1586s.f12105a;
                Object concurrentHashMap2 = concurrentHashMap.get(descriptor);
                if (concurrentHashMap2 == null) {
                    concurrentHashMap2 = new ConcurrentHashMap(2);
                    concurrentHashMap.put(descriptor, concurrentHashMap2);
                }
                ((Map) concurrentHashMap2).put(aVar, objA);
            }
            Map map = (Map) objA;
            Iterator<T> it = X().f11826b.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                Integer num = (Integer) map.get((String) next);
                if (num != null && num.intValue() == i) {
                    break;
                }
            }
            String str = (String) next;
            if (str != null) {
                return str;
            }
        }
        return strG;
    }

    @Override // S9.AbstractC1570b
    public R9.i U(String tag) {
        kotlin.jvm.internal.l.f(tag, "tag");
        return (R9.i) C2078B.n(X(), tag);
    }

    @Override // S9.AbstractC1570b
    /* renamed from: Z, reason: merged with bridge method [inline-methods] */
    public R9.z X() {
        return this.f12016f;
    }

    @Override // S9.AbstractC1570b, P9.b
    public void b(O9.e descriptor) {
        Set setC;
        kotlin.jvm.internal.l.f(descriptor, "descriptor");
        R9.g gVar = this.f12071e;
        if (gVar.f11800b || (descriptor.e() instanceof O9.c)) {
            return;
        }
        AbstractC1564a abstractC1564a = this.f12070d;
        y.c(descriptor, abstractC1564a);
        if (gVar.f11805g) {
            Set<String> setA = C1545n0.a(descriptor);
            kotlin.jvm.internal.l.f(abstractC1564a, "<this>");
            Map map = (Map) abstractC1564a.f11783c.a(descriptor, y.f12110a);
            Set setKeySet = map != null ? map.keySet() : null;
            if (setKeySet == null) {
                setKeySet = C2101v.f18583b;
            }
            setC = C2079C.c(setA, setKeySet);
        } else {
            setC = C1545n0.a(descriptor);
        }
        for (String key : X().f11826b.keySet()) {
            if (!setC.contains(key) && !kotlin.jvm.internal.l.b(key, this.f12017g)) {
                String input = X().toString();
                kotlin.jvm.internal.l.f(key, "key");
                kotlin.jvm.internal.l.f(input, "input");
                StringBuilder sbK = B8.k("Encountered an unknown key '", key, "'.\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.\nCurrent input: ");
                sbK.append((Object) E.u.I(input, -1));
                throw E.u.h(-1, sbK.toString());
            }
        }
    }

    @Override // S9.AbstractC1570b, P9.d
    public final P9.b d(O9.e descriptor) {
        kotlin.jvm.internal.l.f(descriptor, "descriptor");
        return descriptor == this.f12018h ? this : super.d(descriptor);
    }

    @Override // S9.AbstractC1570b, Q9.D0, P9.d
    public final boolean p() {
        return !this.f12019j && super.p();
    }

    @Override // P9.b
    public int x(O9.e descriptor) {
        kotlin.jvm.internal.l.f(descriptor, "descriptor");
        while (this.i < descriptor.f()) {
            int i = this.i;
            this.i = i + 1;
            String nestedName = S(descriptor, i);
            kotlin.jvm.internal.l.f(nestedName, "nestedName");
            int i10 = this.i - 1;
            this.f12019j = false;
            if (!X().containsKey(nestedName)) {
                boolean z10 = (this.f12070d.f11781a.f11802d || descriptor.j(i10) || !descriptor.i(i10).c()) ? false : true;
                this.f12019j = z10;
                if (z10) {
                }
            }
            this.f12071e.getClass();
            return i10;
        }
        return -1;
    }
}

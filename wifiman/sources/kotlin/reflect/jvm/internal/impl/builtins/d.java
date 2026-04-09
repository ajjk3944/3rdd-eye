package kotlin.reflect.jvm.internal.impl.builtins;

import Zg.AbstractC3689v;
import Zh.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.builtins.o;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f51733a = new d();

    /* renamed from: b, reason: collision with root package name */
    private static final Set f51734b;

    static {
        Set<l> set = l.NUMBER_TYPES;
        ArrayList arrayList = new ArrayList(AbstractC3689v.w(set, 10));
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(o.c((l) it.next()));
        }
        List listN0 = AbstractC3689v.N0(AbstractC3689v.N0(AbstractC3689v.N0(arrayList, o.a.f51858h.l()), o.a.f51862j.l()), o.a.f51880s.l());
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        b.a aVar = Zh.b.f25401d;
        Iterator it2 = listN0.iterator();
        while (it2.hasNext()) {
            linkedHashSet.add(aVar.c((Zh.c) it2.next()));
        }
        f51734b = linkedHashSet;
    }

    private d() {
    }

    public final Set a() {
        return f51734b;
    }

    public final Set b() {
        return f51734b;
    }
}

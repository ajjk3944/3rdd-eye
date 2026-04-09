package kotlin.reflect.jvm.internal.impl.types.checker;

import Bh.F;
import Zg.AbstractC3689v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import pi.S;

/* loaded from: classes4.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    private static final F f52147a = new F("KotlinTypeRefiner");

    public static final F a() {
        return f52147a;
    }

    public static final List b(g gVar, Iterable types) {
        AbstractC6492s.i(gVar, "<this>");
        AbstractC6492s.i(types, "types");
        ArrayList arrayList = new ArrayList(AbstractC3689v.w(types, 10));
        Iterator it = types.iterator();
        while (it.hasNext()) {
            arrayList.add(gVar.a((S) it.next()));
        }
        return arrayList;
    }
}

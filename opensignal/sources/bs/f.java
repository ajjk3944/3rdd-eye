package bs;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import lq.l;
import mq.b0;
import mq.p;
import mq.y;
import or.n;
import sr.m;
import sr.o;
import xr.t;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f2934a = b0.R(new l("PACKAGE", EnumSet.noneOf(o.class)), new l("TYPE", EnumSet.of(o.CLASS, o.FILE)), new l("ANNOTATION_TYPE", EnumSet.of(o.ANNOTATION_CLASS)), new l("TYPE_PARAMETER", EnumSet.of(o.TYPE_PARAMETER)), new l("FIELD", EnumSet.of(o.FIELD)), new l("LOCAL_VARIABLE", EnumSet.of(o.LOCAL_VARIABLE)), new l("PARAMETER", EnumSet.of(o.VALUE_PARAMETER)), new l("CONSTRUCTOR", EnumSet.of(o.CONSTRUCTOR)), new l("METHOD", EnumSet.of(o.FUNCTION, o.PROPERTY_GETTER, o.PROPERTY_SETTER)), new l("TYPE_USE", EnumSet.of(o.TYPE)));

    /* renamed from: b, reason: collision with root package name */
    public static final Object f2935b = b0.R(new l("RUNTIME", m.RUNTIME), new l("CLASS", m.BINARY), new l("SOURCE", m.SOURCE));

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    public static vs.b a(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof t) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Iterable iterable = (EnumSet) f2934a.get(qs.g.e(((t) it.next()).f25514b.name()).b());
            if (iterable == null) {
                iterable = y.f16947a;
            }
            mq.t.d0(arrayList2, iterable);
        }
        ArrayList arrayList3 = new ArrayList(p.a0(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(new vs.i(qs.b.j(n.f19707u), qs.g.e(((o) it2.next()).name())));
        }
        return new vs.b(arrayList3, e.f2933d);
    }
}

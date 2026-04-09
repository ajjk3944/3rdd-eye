package pi;

import Zg.AbstractC3689v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6835l;
import nh.InterfaceC6944a;
import xi.AbstractC8534a;

/* loaded from: classes4.dex */
public final class r0 extends ui.e implements Iterable, InterfaceC6944a {

    /* renamed from: b, reason: collision with root package name */
    public static final a f58162b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    private static final r0 f58163c = new r0(AbstractC3689v.l());

    public static final class a extends ui.z {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // ui.z
        public int b(ConcurrentHashMap concurrentHashMap, String key, InterfaceC6835l compute) {
            int iIntValue;
            AbstractC6492s.i(concurrentHashMap, "<this>");
            AbstractC6492s.i(key, "key");
            AbstractC6492s.i(compute, "compute");
            Integer num = (Integer) concurrentHashMap.get(key);
            if (num != null) {
                return num.intValue();
            }
            synchronized (concurrentHashMap) {
                try {
                    Integer num2 = (Integer) concurrentHashMap.get(key);
                    if (num2 != null) {
                        iIntValue = num2.intValue();
                    } else {
                        Object objInvoke = compute.invoke(key);
                        concurrentHashMap.putIfAbsent(key, Integer.valueOf(((Number) objInvoke).intValue()));
                        iIntValue = ((Number) objInvoke).intValue();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return iIntValue;
        }

        public final r0 i(List attributes) {
            AbstractC6492s.i(attributes, "attributes");
            return attributes.isEmpty() ? j() : new r0(attributes, null);
        }

        public final r0 j() {
            return r0.f58163c;
        }

        private a() {
        }
    }

    public /* synthetic */ r0(List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(list);
    }

    @Override // ui.AbstractC8175a
    protected ui.z e() {
        return f58162b;
    }

    public final r0 j(r0 other) {
        AbstractC6492s.i(other, "other");
        if (isEmpty() && other.isEmpty()) {
            return this;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = f58162b.g().iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            p0 p0Var = (p0) b().get(iIntValue);
            p0 p0Var2 = (p0) other.b().get(iIntValue);
            AbstractC8534a.a(arrayList, p0Var == null ? p0Var2 != null ? p0Var2.a(p0Var) : null : p0Var.a(p0Var2));
        }
        return f58162b.i(arrayList);
    }

    public final boolean k(p0 attribute) {
        AbstractC6492s.i(attribute, "attribute");
        return b().get(f58162b.e(attribute.b())) != null;
    }

    public final r0 q(r0 other) {
        AbstractC6492s.i(other, "other");
        if (isEmpty() && other.isEmpty()) {
            return this;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = f58162b.g().iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            p0 p0Var = (p0) b().get(iIntValue);
            p0 p0Var2 = (p0) other.b().get(iIntValue);
            AbstractC8534a.a(arrayList, p0Var == null ? p0Var2 != null ? p0Var2.c(p0Var) : null : p0Var.c(p0Var2));
        }
        return f58162b.i(arrayList);
    }

    public final r0 s(p0 attribute) {
        AbstractC6492s.i(attribute, "attribute");
        if (k(attribute)) {
            return this;
        }
        if (isEmpty()) {
            return new r0(attribute);
        }
        return f58162b.i(AbstractC3689v.N0(AbstractC3689v.i1(this), attribute));
    }

    public final r0 u(p0 attribute) {
        AbstractC6492s.i(attribute, "attribute");
        if (isEmpty()) {
            return this;
        }
        ui.c cVarB = b();
        ArrayList arrayList = new ArrayList();
        for (Object obj : cVarB) {
            if (!AbstractC6492s.d((p0) obj, attribute)) {
                arrayList.add(obj);
            }
        }
        return arrayList.size() == b().b() ? this : f58162b.i(arrayList);
    }

    private r0(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            p0 p0Var = (p0) it.next();
            g(p0Var.b(), p0Var);
        }
    }

    private r0(p0 p0Var) {
        this(AbstractC3689v.e(p0Var));
    }
}

package s7;

import Zg.AbstractC3689v;
import Zg.U;
import Zg.d0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import kotlin.jvm.internal.AbstractC6492s;
import r7.C7577a;

/* renamed from: s7.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC7915b {

    /* renamed from: a, reason: collision with root package name */
    private final Map f61362a = new LinkedHashMap();

    public AbstractC7915b(Map map) {
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                this.f61362a.put((Class) entry.getKey(), AbstractC3689v.Y((Set) entry.getValue()));
            }
        }
    }

    protected final void a(InterfaceC7921h value, int i10) {
        Object next;
        AbstractC6492s.i(value, "value");
        SortedSet sortedSet = (SortedSet) this.f61362a.get(value.getClass());
        if (sortedSet == null || value.isSingle()) {
            this.f61362a.put(value.getClass(), d0.d(new C7577a(i10, value)));
            return;
        }
        Iterator it = sortedSet.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (AbstractC6492s.d(((C7577a) next).c(), value)) {
                    break;
                }
            }
        }
        if (next == null) {
            sortedSet.add(new C7577a(i10, value));
        }
    }

    public final Map b() {
        return U.t(this.f61362a);
    }

    public abstract Set c();

    public final InterfaceC7921h d(Class clazz) {
        C7577a c7577a;
        AbstractC6492s.i(clazz, "clazz");
        SortedSet sortedSet = (SortedSet) this.f61362a.get(clazz);
        if (sortedSet == null || (c7577a = (C7577a) AbstractC3689v.r0(sortedSet)) == null) {
            return null;
        }
        Object objC = c7577a.c();
        if (objC instanceof InterfaceC7921h) {
            return (InterfaceC7921h) objC;
        }
        return null;
    }

    public final Set e(Class clazz) {
        AbstractC6492s.i(clazz, "clazz");
        SortedSet sortedSet = (SortedSet) this.f61362a.get(clazz);
        if (sortedSet != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = sortedSet.iterator();
            while (it.hasNext()) {
                Object objC = ((C7577a) it.next()).c();
                InterfaceC7921h interfaceC7921h = objC instanceof InterfaceC7921h ? (InterfaceC7921h) objC : null;
                if (interfaceC7921h != null) {
                    arrayList.add(interfaceC7921h);
                }
            }
            Set setN1 = AbstractC3689v.n1(arrayList);
            if (setN1 != null) {
                return setN1;
            }
        }
        return d0.e();
    }
}

package a8;

import Zg.AbstractC3689v;
import Zg.Q;
import a8.C3772b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;

/* renamed from: a8.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3771a {

    /* renamed from: a, reason: collision with root package name */
    private final List f25746a = new ArrayList();

    public final Object a(C3772b key) {
        AbstractC6492s.i(key, "key");
        Iterator it = AbstractC3689v.m(this.f25746a).iterator();
        while (it.hasNext()) {
            int iD = ((Q) it).d();
            Object obj = ((HashMap) this.f25746a.get(iD)).get(key.b().get(iD));
            if (obj != null) {
                return obj;
            }
        }
        return null;
    }

    public final Object b(C3772b key, InterfaceC6824a valueCreator) {
        AbstractC6492s.i(key, "key");
        AbstractC6492s.i(valueCreator, "valueCreator");
        Object objA = a(key);
        if (objA != null) {
            return objA;
        }
        Object objInvoke = valueCreator.invoke();
        d(key, objInvoke);
        return objInvoke;
    }

    public final void c(InterfaceC6835l action) {
        AbstractC6492s.i(action, "action");
        HashMap map = (HashMap) AbstractC3689v.s0(this.f25746a);
        if (map != null) {
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                action.invoke(((Map.Entry) it.next()).getValue());
            }
        }
    }

    public final void d(C3772b key, Object obj) {
        AbstractC6492s.i(key, "key");
        if (this.f25746a.isEmpty()) {
            for (C3772b.AbstractC0980b abstractC0980b : key.b()) {
                this.f25746a.add(new HashMap());
            }
        }
        Iterator it = AbstractC3689v.m(key.b()).iterator();
        while (it.hasNext()) {
            int iD = ((Q) it).d();
            ((Map) this.f25746a.get(iD)).put(key.b().get(iD), obj);
        }
    }
}

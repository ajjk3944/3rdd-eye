package uj;

import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6824a;

/* loaded from: classes4.dex */
public final class w extends s {

    /* renamed from: a, reason: collision with root package name */
    private final Map f63250a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f63251b;

    public w() {
        super(null);
        this.f63250a = vj.j.a();
        this.f63251b = new Object();
    }

    @Override // uj.s
    public Object a(Object key, boolean z10, InterfaceC6824a creator) {
        Object objInvoke;
        AbstractC6492s.i(key, "key");
        AbstractC6492s.i(creator, "creator");
        Object obj = z10 ? this.f63251b : null;
        InterfaceC6824a interfaceC6824a = (InterfaceC6824a) this.f63250a.get(key);
        Object objInvoke2 = interfaceC6824a != null ? interfaceC6824a.invoke() : null;
        if (objInvoke2 != null) {
            return objInvoke2;
        }
        if (obj == null) {
            InterfaceC6824a interfaceC6824a2 = (InterfaceC6824a) this.f63250a.get(key);
            objInvoke = interfaceC6824a2 != null ? interfaceC6824a2.invoke() : null;
            if (objInvoke == null) {
                p pVar = (p) creator.invoke();
                Object objA = pVar.a();
                this.f63250a.put(key, pVar.b());
                return objA;
            }
        } else {
            synchronized (obj) {
                InterfaceC6824a interfaceC6824a3 = (InterfaceC6824a) this.f63250a.get(key);
                objInvoke = interfaceC6824a3 != null ? interfaceC6824a3.invoke() : null;
                if (objInvoke == null) {
                    p pVar2 = (p) creator.invoke();
                    Object objA2 = pVar2.a();
                    this.f63250a.put(key, pVar2.b());
                    return objA2;
                }
            }
        }
        return objInvoke;
    }
}

package k;

import java.util.HashMap;
import java.util.Map;
import k.b;

/* loaded from: classes.dex */
public class a extends b {

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f21785e = new HashMap();

    @Override // k.b
    public b.c c(Object obj) {
        return (b.c) this.f21785e.get(obj);
    }

    public boolean contains(Object obj) {
        return this.f21785e.containsKey(obj);
    }

    @Override // k.b
    public Object g(Object obj, Object obj2) {
        b.c cVarC = c(obj);
        if (cVarC != null) {
            return cVarC.f21791b;
        }
        this.f21785e.put(obj, f(obj, obj2));
        return null;
    }

    @Override // k.b
    public Object h(Object obj) {
        Object objH = super.h(obj);
        this.f21785e.remove(obj);
        return objH;
    }

    public Map.Entry i(Object obj) {
        if (contains(obj)) {
            return ((b.c) this.f21785e.get(obj)).f21793d;
        }
        return null;
    }
}

package n;

import java.util.HashMap;
import java.util.Map;
import n.C6854b;

/* renamed from: n.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6853a extends C6854b {

    /* renamed from: e, reason: collision with root package name */
    private final HashMap f54085e = new HashMap();

    public boolean contains(Object obj) {
        return this.f54085e.containsKey(obj);
    }

    @Override // n.C6854b
    protected C6854b.c e(Object obj) {
        return (C6854b.c) this.f54085e.get(obj);
    }

    @Override // n.C6854b
    public Object j(Object obj, Object obj2) {
        C6854b.c cVarE = e(obj);
        if (cVarE != null) {
            return cVarE.f54091b;
        }
        this.f54085e.put(obj, i(obj, obj2));
        return null;
    }

    @Override // n.C6854b
    public Object k(Object obj) {
        Object objK = super.k(obj);
        this.f54085e.remove(obj);
        return objK;
    }

    public Map.Entry m(Object obj) {
        if (contains(obj)) {
            return ((C6854b.c) this.f54085e.get(obj)).f54093d;
        }
        return null;
    }
}

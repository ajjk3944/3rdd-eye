package androidx.datastore.preferences.protobuf;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes.dex */
final class Y {

    /* renamed from: c, reason: collision with root package name */
    private static final Y f30819c = new Y();

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentMap f30821b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    private final d0 f30820a = new E();

    private Y() {
    }

    public static Y a() {
        return f30819c;
    }

    public c0 b(Class cls, c0 c0Var) {
        AbstractC3987x.b(cls, "messageType");
        AbstractC3987x.b(c0Var, "schema");
        return (c0) this.f30821b.putIfAbsent(cls, c0Var);
    }

    public c0 c(Class cls) {
        AbstractC3987x.b(cls, "messageType");
        c0 c0Var = (c0) this.f30821b.get(cls);
        if (c0Var != null) {
            return c0Var;
        }
        c0 c0VarA = this.f30820a.a(cls);
        c0 c0VarB = b(cls, c0VarA);
        return c0VarB != null ? c0VarB : c0VarA;
    }

    public c0 d(Object obj) {
        return c(obj.getClass());
    }
}

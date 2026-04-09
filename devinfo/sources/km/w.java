package km;

import j$.util.DesugarCollections;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final Class f28512a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f28513b;

    /* renamed from: c, reason: collision with root package name */
    public final Method f28514c;

    /* renamed from: d, reason: collision with root package name */
    public final List f28515d;

    public w(Class cls, Object obj, Method method, ArrayList arrayList) {
        this.f28512a = cls;
        this.f28513b = obj;
        this.f28514c = method;
        this.f28515d = DesugarCollections.unmodifiableList(arrayList);
    }

    public final String toString() {
        return String.format("%s.%s() %s", this.f28512a.getName(), this.f28514c.getName(), this.f28515d);
    }
}

package xh;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
class d implements InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    private final Class f66109a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f66110b;

    /* renamed from: c, reason: collision with root package name */
    private final Yg.m f66111c;

    /* renamed from: d, reason: collision with root package name */
    private final Yg.m f66112d;

    /* renamed from: e, reason: collision with root package name */
    private final List f66113e;

    public d(Class cls, Map map, Yg.m mVar, Yg.m mVar2, List list) {
        this.f66109a = cls;
        this.f66110b = map;
        this.f66111c = mVar;
        this.f66112d = mVar2;
        this.f66113e = list;
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        return f.o(this.f66109a, this.f66110b, this.f66111c, this.f66112d, this.f66113e, obj, method, objArr);
    }
}

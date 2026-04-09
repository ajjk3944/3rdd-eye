package androidx.lifecycle;

import androidx.lifecycle.a;
import androidx.lifecycle.d;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
class ReflectiveGenericLifecycleObserver implements e {

    /* renamed from: a, reason: collision with root package name */
    private final Object f1809a;

    /* renamed from: b, reason: collision with root package name */
    private final a.C0013a f1810b;

    ReflectiveGenericLifecycleObserver(Object obj) {
        this.f1809a = obj;
        this.f1810b = a.f1812c.c(obj.getClass());
    }

    @Override // androidx.lifecycle.e
    public void g(g gVar, d.a aVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        this.f1810b.a(gVar, aVar, this.f1809a);
    }
}

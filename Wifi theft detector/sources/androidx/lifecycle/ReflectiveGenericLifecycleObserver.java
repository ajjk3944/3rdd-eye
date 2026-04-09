package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.b;
import java.lang.reflect.InvocationTargetException;

@Deprecated
/* loaded from: classes.dex */
class ReflectiveGenericLifecycleObserver implements j {

    /* renamed from: a, reason: collision with root package name */
    public final Object f3457a;

    /* renamed from: b, reason: collision with root package name */
    public final b.a f3458b;

    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.f3457a = obj;
        this.f3458b = b.f3485c.c(obj.getClass());
    }

    @Override // androidx.lifecycle.j
    public void onStateChanged(n nVar, Lifecycle.Event event) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        this.f3458b.a(nVar, event, this.f3457a);
    }
}

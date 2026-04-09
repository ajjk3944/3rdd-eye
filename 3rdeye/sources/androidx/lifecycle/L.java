package androidx.lifecycle;

import androidx.lifecycle.AbstractC1781n;
import androidx.lifecycle.C1769b;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;

/* compiled from: ReflectiveGenericLifecycleObserver.java */
@Deprecated
/* loaded from: classes.dex */
public final class L implements InterfaceC1788v {

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1789w f16058b;

    /* renamed from: c, reason: collision with root package name */
    public final C1769b.a f16059c;

    public L(InterfaceC1789w interfaceC1789w) {
        this.f16058b = interfaceC1789w;
        C1769b c1769b = C1769b.f16125c;
        Class<?> cls = interfaceC1789w.getClass();
        C1769b.a aVar = (C1769b.a) c1769b.f16126a.get(cls);
        this.f16059c = aVar == null ? c1769b.a(cls, null) : aVar;
    }

    @Override // androidx.lifecycle.InterfaceC1788v
    public final void c(InterfaceC1790x interfaceC1790x, AbstractC1781n.a aVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        HashMap map = this.f16059c.f16128a;
        List list = (List) map.get(aVar);
        InterfaceC1789w interfaceC1789w = this.f16058b;
        C1769b.a.a(list, interfaceC1790x, aVar, interfaceC1789w);
        C1769b.a.a((List) map.get(AbstractC1781n.a.ON_ANY), interfaceC1790x, aVar, interfaceC1789w);
    }
}

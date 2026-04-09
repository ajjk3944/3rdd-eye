package androidx.lifecycle;

import androidx.lifecycle.AbstractC4013k;
import androidx.lifecycle.C4005c;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
class z implements InterfaceC4015m {

    /* renamed from: a, reason: collision with root package name */
    private final Object f31710a;

    /* renamed from: b, reason: collision with root package name */
    private final C4005c.a f31711b;

    z(Object obj) {
        this.f31710a = obj;
        this.f31711b = C4005c.f31643c.c(obj.getClass());
    }

    @Override // androidx.lifecycle.InterfaceC4015m
    public void j(InterfaceC4017o interfaceC4017o, AbstractC4013k.a aVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        this.f31711b.a(interfaceC4017o, aVar, this.f31710a);
    }
}

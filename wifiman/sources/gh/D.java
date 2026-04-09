package Gh;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class D extends y implements Qh.w {

    /* renamed from: a, reason: collision with root package name */
    private final Object f7447a;

    public D(Object recordComponent) {
        AbstractC6492s.i(recordComponent, "recordComponent");
        this.f7447a = recordComponent;
    }

    @Override // Gh.y
    public Member S() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Method methodC = C2909a.f7457a.c(this.f7447a);
        if (methodC != null) {
            return methodC;
        }
        throw new NoSuchMethodError("Can't find `getAccessor` method");
    }

    @Override // Qh.w
    public boolean c() {
        return false;
    }

    @Override // Qh.w
    public Qh.x getType() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Class clsD = C2909a.f7457a.d(this.f7447a);
        if (clsD != null) {
            return new s(clsD);
        }
        throw new NoSuchMethodError("Can't find `getType` method");
    }
}

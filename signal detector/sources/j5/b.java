package j5;

import E5.h;
import h5.C2371e;
import h5.InterfaceC2370d;
import h5.InterfaceC2373g;
import h5.InterfaceC2375i;
import i5.EnumC2380a;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import q5.i;
import z5.C3030f;

/* loaded from: classes3.dex */
public abstract class b implements InterfaceC2370d, c, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC2370d f21462a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC2375i f21463b;

    /* renamed from: c, reason: collision with root package name */
    public transient InterfaceC2370d f21464c;

    public b(InterfaceC2370d interfaceC2370d, InterfaceC2375i interfaceC2375i) {
        this.f21462a = interfaceC2370d;
        this.f21463b = interfaceC2375i;
    }

    public c d() {
        InterfaceC2370d interfaceC2370d = this.f21462a;
        if (interfaceC2370d instanceof c) {
            return (c) interfaceC2370d;
        }
        return null;
    }

    @Override // h5.InterfaceC2370d
    public final void e(Object obj) {
        InterfaceC2370d interfaceC2370d = this;
        while (true) {
            b bVar = (b) interfaceC2370d;
            InterfaceC2370d interfaceC2370d2 = bVar.f21462a;
            i.b(interfaceC2370d2);
            try {
                obj = bVar.l(obj);
                if (obj == EnumC2380a.f20635a) {
                    return;
                }
            } catch (Throwable th) {
                obj = R2.a.d(th);
            }
            bVar.m();
            if (!(interfaceC2370d2 instanceof b)) {
                interfaceC2370d2.e(obj);
                return;
            }
            interfaceC2370d = interfaceC2370d2;
        }
    }

    @Override // h5.InterfaceC2370d
    public InterfaceC2375i getContext() {
        InterfaceC2375i interfaceC2375i = this.f21463b;
        i.b(interfaceC2375i);
        return interfaceC2375i;
    }

    public InterfaceC2370d j(InterfaceC2370d interfaceC2370d, Object obj) {
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public StackTraceElement k() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        int iIntValue;
        String strC;
        Method method;
        Object objInvoke;
        Method method2;
        Object objInvoke2;
        d dVar = (d) getClass().getAnnotation(d.class);
        String str = null;
        if (dVar == null) {
            return null;
        }
        int iV = dVar.v();
        if (iV > 1) {
            throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + iV + ". Please update the Kotlin standard library.").toString());
        }
        try {
            Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            iIntValue = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            iIntValue = -1;
        }
        int i = iIntValue >= 0 ? dVar.l()[iIntValue] : -1;
        e eVar = f.f21469b;
        e eVar2 = f.f21468a;
        if (eVar == null) {
            try {
                e eVar3 = new e(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                f.f21469b = eVar3;
                eVar = eVar3;
            } catch (Exception unused2) {
                f.f21469b = eVar2;
                eVar = eVar2;
            }
        }
        if (eVar != eVar2 && (method = eVar.f21465a) != null && (objInvoke = method.invoke(getClass(), null)) != null && (method2 = eVar.f21466b) != null && (objInvoke2 = method2.invoke(objInvoke, null)) != null) {
            Method method3 = eVar.f21467c;
            Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
            if (objInvoke3 instanceof String) {
                str = (String) objInvoke3;
            }
        }
        if (str == null) {
            strC = dVar.c();
        } else {
            strC = str + '/' + dVar.c();
        }
        return new StackTraceElement(strC, dVar.m(), dVar.f(), i);
    }

    public abstract Object l(Object obj);

    public void m() {
        InterfaceC2370d interfaceC2370d = this.f21464c;
        if (interfaceC2370d != null && interfaceC2370d != this) {
            InterfaceC2373g interfaceC2373gH = getContext().h(C2371e.f20485a);
            i.b(interfaceC2373gH);
            h hVar = (h) interfaceC2370d;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h.f1385h;
            while (atomicReferenceFieldUpdater.get(hVar) == E5.a.f1375d) {
            }
            Object obj = atomicReferenceFieldUpdater.get(hVar);
            C3030f c3030f = obj instanceof C3030f ? (C3030f) obj : null;
            if (c3030f != null) {
                c3030f.p();
            }
        }
        this.f21464c = a.f21461a;
    }

    public String toString() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object objK = k();
        if (objK == null) {
            objK = getClass().getName();
        }
        sb.append(objK);
        return sb.toString();
    }

    public b(InterfaceC2370d interfaceC2370d) {
        this(interfaceC2370d, interfaceC2370d != null ? interfaceC2370d.getContext() : null);
    }
}

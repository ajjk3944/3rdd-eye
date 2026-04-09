package rq;

import br.l;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import lf.t1;

/* loaded from: classes.dex */
public abstract class a implements pq.c, d, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final pq.c f21664a;

    public a(pq.c cVar) {
        this.f21664a = cVar;
    }

    public d e() {
        pq.c cVar = this.f21664a;
        if (cVar instanceof d) {
            return (d) cVar;
        }
        return null;
    }

    @Override // pq.c
    public final void g(Object obj) {
        pq.c cVar = this;
        while (true) {
            a aVar = (a) cVar;
            pq.c cVar2 = aVar.f21664a;
            l.b(cVar2);
            try {
                obj = aVar.q(obj);
                if (obj == qq.a.COROUTINE_SUSPENDED) {
                    return;
                }
            } catch (Throwable th2) {
                obj = t1.k(th2);
            }
            aVar.r();
            if (!(cVar2 instanceof a)) {
                cVar2.g(obj);
                return;
            }
            cVar = cVar2;
        }
    }

    public pq.c o(Object obj, pq.c cVar) {
        l.e(cVar, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public StackTraceElement p() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        int iIntValue;
        String strC;
        Method method;
        Object objInvoke;
        Method method2;
        Object objInvoke2;
        e eVar = (e) getClass().getAnnotation(e.class);
        String str = null;
        if (eVar == null || eVar.v() < 1) {
            return null;
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
        int i10 = iIntValue >= 0 ? eVar.l()[iIntValue] : -1;
        f fVar = g.f21672b;
        f fVar2 = g.f21671a;
        if (fVar == null) {
            try {
                f fVar3 = new f(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                g.f21672b = fVar3;
                fVar = fVar3;
            } catch (Exception unused2) {
                g.f21672b = fVar2;
                fVar = fVar2;
            }
        }
        if (fVar != fVar2 && (method = fVar.f21668a) != null && (objInvoke = method.invoke(getClass(), null)) != null && (method2 = fVar.f21669b) != null && (objInvoke2 = method2.invoke(objInvoke, null)) != null) {
            Method method3 = fVar.f21670c;
            Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
            if (objInvoke3 instanceof String) {
                str = (String) objInvoke3;
            }
        }
        if (str == null) {
            strC = eVar.c();
        } else {
            strC = str + '/' + eVar.c();
        }
        return new StackTraceElement(strC, eVar.m(), eVar.f(), i10);
    }

    public abstract Object q(Object obj);

    public String toString() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        StringBuilder sb2 = new StringBuilder("Continuation at ");
        Object objP = p();
        if (objP == null) {
            objP = getClass().getName();
        }
        sb2.append(objP);
        return sb2.toString();
    }

    public void r() {
    }
}

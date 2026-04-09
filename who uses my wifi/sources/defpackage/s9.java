package defpackage;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class s9 implements oj, sk, Serializable {
    public final oj f;

    public s9(oj ojVar) {
        this.f = ojVar;
    }

    public sk c() {
        oj ojVar = this.f;
        if (ojVar instanceof sk) {
            return (sk) ojVar;
        }
        return null;
    }

    @Override // defpackage.oj
    public final void e(Object obj) {
        oj ojVar = this;
        while (true) {
            s9 s9Var = (s9) ojVar;
            oj ojVar2 = s9Var.f;
            i30.j(ojVar2);
            try {
                obj = s9Var.m(obj);
                if (obj == rk.f) {
                    return;
                }
            } catch (Throwable th) {
                obj = bd2.k(th);
            }
            s9Var.n();
            if (!(ojVar2 instanceof s9)) {
                ojVar2.e(obj);
                return;
            }
            ojVar = ojVar2;
        }
    }

    public oj h(oj ojVar, Object obj) {
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public StackTraceElement i() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        int iIntValue;
        String strC;
        Method method;
        Object objInvoke;
        Method method2;
        Object objInvoke2;
        tm tmVar = (tm) getClass().getAnnotation(tm.class);
        String str = null;
        if (tmVar == null) {
            return null;
        }
        int iV = tmVar.v();
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
        int i = iIntValue >= 0 ? tmVar.l()[iIntValue] : -1;
        ve0 ve0Var = a30.j;
        ve0 ve0Var2 = a30.k;
        if (ve0Var2 == null) {
            try {
                ve0 ve0Var3 = new ve0(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                a30.k = ve0Var3;
                ve0Var2 = ve0Var3;
            } catch (Exception unused2) {
                a30.k = ve0Var;
                ve0Var2 = ve0Var;
            }
        }
        if (ve0Var2 != ve0Var && (method = ve0Var2.a) != null && (objInvoke = method.invoke(getClass(), null)) != null && (method2 = ve0Var2.b) != null && (objInvoke2 = method2.invoke(objInvoke, null)) != null) {
            Method method3 = ve0Var2.c;
            Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
            if (objInvoke3 instanceof String) {
                str = (String) objInvoke3;
            }
        }
        if (str == null) {
            strC = tmVar.c();
        } else {
            strC = str + '/' + tmVar.c();
        }
        return new StackTraceElement(strC, tmVar.m(), tmVar.f(), i);
    }

    public abstract Object m(Object obj);

    public String toString() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object objI = i();
        if (objI == null) {
            objI = getClass().getName();
        }
        sb.append(objI);
        return sb.toString();
    }

    public void n() {
    }
}

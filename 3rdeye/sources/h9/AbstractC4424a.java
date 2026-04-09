package h9;

import b9.C1992A;
import b9.n;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import f9.InterfaceC4347e;
import h9.f;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.jvm.internal.l;

/* compiled from: ContinuationImpl.kt */
/* renamed from: h9.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4424a implements InterfaceC4347e<Object>, d, Serializable {
    private final InterfaceC4347e<Object> completion;

    public AbstractC4424a(InterfaceC4347e<Object> interfaceC4347e) {
        this.completion = interfaceC4347e;
    }

    public InterfaceC4347e<C1992A> create(InterfaceC4347e<?> completion) {
        l.f(completion, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public d getCallerFrame() {
        InterfaceC4347e<Object> interfaceC4347e = this.completion;
        if (interfaceC4347e instanceof d) {
            return (d) interfaceC4347e;
        }
        return null;
    }

    public final InterfaceC4347e<Object> getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        int iIntValue;
        String strC;
        Method method;
        Object objInvoke;
        Method method2;
        Object objInvoke2;
        e eVar = (e) getClass().getAnnotation(e.class);
        String str = null;
        if (eVar == null) {
            return null;
        }
        int iV = eVar.v();
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
        int i = iIntValue >= 0 ? eVar.l()[iIntValue] : -1;
        f.a aVar = f.f38273b;
        f.a aVar2 = f.f38272a;
        if (aVar == null) {
            try {
                f.a aVar3 = new f.a(Class.class.getDeclaredMethod("getModule", new Class[0]), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod(AppMeasurementSdk.ConditionalUserProperty.NAME, new Class[0]));
                f.f38273b = aVar3;
                aVar = aVar3;
            } catch (Exception unused2) {
                f.f38273b = aVar2;
                aVar = aVar2;
            }
        }
        if (aVar != aVar2 && (method = aVar.f38274a) != null && (objInvoke = method.invoke(getClass(), new Object[0])) != null && (method2 = aVar.f38275b) != null && (objInvoke2 = method2.invoke(objInvoke, new Object[0])) != null) {
            Method method3 = aVar.f38276c;
            Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, new Object[0]) : null;
            if (objInvoke3 instanceof String) {
                str = (String) objInvoke3;
            }
        }
        if (str == null) {
            strC = eVar.c();
        } else {
            strC = str + '/' + eVar.c();
        }
        return new StackTraceElement(strC, eVar.m(), eVar.f(), i);
    }

    public abstract Object invokeSuspend(Object obj);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f9.InterfaceC4347e
    public final void resumeWith(Object obj) {
        InterfaceC4347e interfaceC4347e = this;
        while (true) {
            AbstractC4424a abstractC4424a = (AbstractC4424a) interfaceC4347e;
            InterfaceC4347e interfaceC4347e2 = abstractC4424a.completion;
            l.c(interfaceC4347e2);
            try {
                obj = abstractC4424a.invokeSuspend(obj);
                if (obj == g9.a.COROUTINE_SUSPENDED) {
                    return;
                }
            } catch (Throwable th) {
                obj = n.a(th);
            }
            abstractC4424a.releaseIntercepted();
            if (!(interfaceC4347e2 instanceof AbstractC4424a)) {
                interfaceC4347e2.resumeWith(obj);
                return;
            }
            interfaceC4347e = interfaceC4347e2;
        }
    }

    public String toString() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }

    public InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> completion) {
        l.f(completion, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public void releaseIntercepted() {
    }
}

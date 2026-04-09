package Z1;

import T.AbstractC3561w;
import T.H0;
import Yg.InterfaceC3661e;
import Yg.u;
import Yg.v;
import androidx.lifecycle.InterfaceC4017o;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6824a;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private static final H0 f25082a;

    /* renamed from: Z1.a$a, reason: collision with other inner class name */
    static final class C0961a extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final C0961a f25083a = new C0961a();

        C0961a() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC4017o invoke() {
            throw new IllegalStateException("CompositionLocal LocalLifecycleOwner not present");
        }
    }

    static {
        Object objC;
        H0 h02;
        try {
            u.a aVar = u.f25017b;
            ClassLoader classLoader = InterfaceC4017o.class.getClassLoader();
            AbstractC6492s.f(classLoader);
            Method method = classLoader.loadClass("androidx.compose.ui.platform.AndroidCompositionLocals_androidKt").getMethod("getLocalLifecycleOwner", null);
            Annotation[] annotations = method.getAnnotations();
            int length = annotations.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    Object objInvoke = method.invoke(null, null);
                    if (objInvoke instanceof H0) {
                        h02 = (H0) objInvoke;
                    }
                } else if (annotations[i10] instanceof InterfaceC3661e) {
                    break;
                } else {
                    i10++;
                }
            }
            h02 = null;
            objC = u.c(h02);
        } catch (Throwable th2) {
            u.a aVar2 = u.f25017b;
            objC = u.c(v.a(th2));
        }
        H0 h0F = (H0) (u.l(objC) ? null : objC);
        if (h0F == null) {
            h0F = AbstractC3561w.f(C0961a.f25083a);
        }
        f25082a = h0F;
    }

    public static final H0 a() {
        return f25082a;
    }
}

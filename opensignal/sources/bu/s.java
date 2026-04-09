package bu;

import lf.t1;

/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f2988a = 0;

    static {
        Object objK;
        Object objK2;
        Exception exc = new Exception();
        String simpleName = a.a.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            objK = rq.a.class.getCanonicalName();
        } catch (Throwable th2) {
            objK = t1.k(th2);
        }
        if (lq.o.a(objK) != null) {
            objK = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        try {
            objK2 = s.class.getCanonicalName();
        } catch (Throwable th3) {
            objK2 = t1.k(th3);
        }
        if (lq.o.a(objK2) != null) {
            objK2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
    }
}

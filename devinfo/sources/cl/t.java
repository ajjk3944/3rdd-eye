package cl;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f2940a = 0;

    static {
        Object objH;
        Object objH2;
        Exception exc = new Exception();
        String simpleName = a.a.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            objH = ek.a.class.getCanonicalName();
        } catch (Throwable th2) {
            objH = ci.b.h(th2);
        }
        if (yj.l.a(objH) != null) {
            objH = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        try {
            objH2 = t.class.getCanonicalName();
        } catch (Throwable th3) {
            objH2 = ci.b.h(th3);
        }
        if (yj.l.a(objH2) != null) {
            objH2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
    }
}

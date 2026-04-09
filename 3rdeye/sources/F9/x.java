package F9;

import a.C1641a;
import h9.AbstractC4424a;

/* compiled from: StackTraceRecovery.kt */
/* loaded from: classes3.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f1787a = 0;

    static {
        Object objA;
        Object objA2;
        Exception exc = new Exception();
        String simpleName = C1641a.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            objA = AbstractC4424a.class.getCanonicalName();
        } catch (Throwable th) {
            objA = b9.n.a(th);
        }
        if (b9.m.a(objA) != null) {
            objA = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        try {
            objA2 = x.class.getCanonicalName();
        } catch (Throwable th2) {
            objA2 = b9.n.a(th2);
        }
        if (b9.m.a(objA2) != null) {
            objA2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
    }
}

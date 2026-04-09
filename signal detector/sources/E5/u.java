package E5;

import a.AbstractC0241a;
import c5.C0409f;

/* loaded from: classes3.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f1414a = 0;

    static {
        Object objD;
        Object objD2;
        Exception exc = new Exception();
        String simpleName = AbstractC0241a.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            objD = j5.b.class.getCanonicalName();
        } catch (Throwable th) {
            objD = R2.a.d(th);
        }
        if (C0409f.a(objD) != null) {
            objD = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        try {
            objD2 = u.class.getCanonicalName();
        } catch (Throwable th2) {
            objD2 = R2.a.d(th2);
        }
        if (C0409f.a(objD2) != null) {
            objD2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
    }
}

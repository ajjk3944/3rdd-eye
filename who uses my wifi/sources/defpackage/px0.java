package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class px0 {
    public static final /* synthetic */ int a = 0;

    static {
        Object objK;
        Object objK2;
        Exception exc = new Exception();
        String simpleName = ob1.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            objK = s9.class.getCanonicalName();
        } catch (Throwable th) {
            objK = bd2.k(th);
        }
        if (jq0.a(objK) != null) {
            objK = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        try {
            objK2 = px0.class.getCanonicalName();
        } catch (Throwable th2) {
            objK2 = bd2.k(th2);
        }
        if (jq0.a(objK2) != null) {
            objK2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
    }
}

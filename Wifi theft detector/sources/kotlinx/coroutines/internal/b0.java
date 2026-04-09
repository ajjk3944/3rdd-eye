package kotlinx.coroutines.internal;

import kotlin.Result;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;

/* loaded from: classes4.dex */
public abstract class b0 {

    /* renamed from: a, reason: collision with root package name */
    public static final StackTraceElement f22521a = new a.a().a();

    /* renamed from: b, reason: collision with root package name */
    public static final String f22522b;

    /* renamed from: c, reason: collision with root package name */
    public static final String f22523c;

    static {
        Object objB;
        Object objB2;
        try {
            Result.Companion companion = Result.INSTANCE;
            objB = Result.b(BaseContinuationImpl.class.getCanonicalName());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objB = Result.b(kotlin.c.a(th));
        }
        if (Result.e(objB) != null) {
            objB = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        f22522b = (String) objB;
        try {
            objB2 = Result.b(b0.class.getCanonicalName());
        } catch (Throwable th2) {
            Result.Companion companion3 = Result.INSTANCE;
            objB2 = Result.b(kotlin.c.a(th2));
        }
        if (Result.e(objB2) != null) {
            objB2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        f22523c = (String) objB2;
    }

    public static final Throwable a(Throwable th) {
        return th;
    }
}

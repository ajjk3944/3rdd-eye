package kotlin;

import kotlin.Result;
import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public abstract class c {
    public static final Object a(Throwable exception) {
        p.e(exception, "exception");
        return new Result.Failure(exception);
    }

    public static final void b(Object obj) {
        if (obj instanceof Result.Failure) {
            throw ((Result.Failure) obj).exception;
        }
    }
}

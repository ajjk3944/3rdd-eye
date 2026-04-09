package E9;

import java.util.concurrent.CancellationException;

/* compiled from: FlowExceptions.kt */
/* loaded from: classes3.dex */
public final class a extends CancellationException {

    /* renamed from: b, reason: collision with root package name */
    public final transient Object f1484b;

    public a(Object obj) {
        super("Flow was aborted, no more elements needed");
        this.f1484b = obj;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}

package F9;

import f9.InterfaceC4350h;

/* compiled from: CoroutineExceptionHandlerImpl.kt */
/* loaded from: classes3.dex */
public final class h extends RuntimeException {

    /* renamed from: b, reason: collision with root package name */
    public final transient InterfaceC4350h f1754b;

    public h(InterfaceC4350h interfaceC4350h) {
        this.f1754b = interfaceC4350h;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return this.f1754b.toString();
    }
}

package E5;

import h5.InterfaceC2375i;

/* loaded from: classes3.dex */
public final class g extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    public final transient InterfaceC2375i f1384a;

    public g(InterfaceC2375i interfaceC2375i) {
        this.f1384a = interfaceC2375i;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return this.f1384a.toString();
    }
}

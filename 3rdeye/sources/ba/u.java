package ba;

import java.io.IOException;

/* compiled from: StreamResetException.kt */
/* loaded from: classes3.dex */
public final class u extends IOException {

    /* renamed from: b, reason: collision with root package name */
    public final b f18262b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(b errorCode) {
        super("stream was reset: " + errorCode);
        kotlin.jvm.internal.l.f(errorCode, "errorCode");
        this.f18262b = errorCode;
    }
}

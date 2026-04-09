package tb;

import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: tb.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8063i {

    /* renamed from: a, reason: collision with root package name */
    private final String f62031a;

    /* renamed from: b, reason: collision with root package name */
    private final kb.j f62032b;

    public C8063i(String requestId, kb.j message) {
        AbstractC6492s.i(requestId, "requestId");
        AbstractC6492s.i(message, "message");
        this.f62031a = requestId;
        this.f62032b = message;
    }

    public final kb.j a() {
        return this.f62032b;
    }

    public final String b() {
        return this.f62031a;
    }
}

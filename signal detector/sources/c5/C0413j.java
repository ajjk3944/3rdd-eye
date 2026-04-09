package c5;

import java.io.Serializable;

/* renamed from: c5.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0413j implements InterfaceC0405b, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public q5.j f5930a;

    /* renamed from: b, reason: collision with root package name */
    public Object f5931b;

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, p5.a, q5.j] */
    @Override // c5.InterfaceC0405b
    public final Object getValue() {
        if (this.f5931b == C0411h.f5928a) {
            ?? r02 = this.f5930a;
            q5.i.b(r02);
            this.f5931b = r02.b();
            this.f5930a = null;
        }
        return this.f5931b;
    }

    public final String toString() {
        return this.f5931b != C0411h.f5928a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}

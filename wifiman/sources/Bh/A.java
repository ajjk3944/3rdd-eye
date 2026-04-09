package Bh;

import kotlin.jvm.internal.AbstractC6492s;
import ri.InterfaceC7619j;

/* loaded from: classes4.dex */
public final class A extends q0 {

    /* renamed from: a, reason: collision with root package name */
    private final Zh.f f1749a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC7619j f1750b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(Zh.f underlyingPropertyName, InterfaceC7619j underlyingType) {
        super(null);
        AbstractC6492s.i(underlyingPropertyName, "underlyingPropertyName");
        AbstractC6492s.i(underlyingType, "underlyingType");
        this.f1749a = underlyingPropertyName;
        this.f1750b = underlyingType;
    }

    @Override // Bh.q0
    public boolean a(Zh.f name) {
        AbstractC6492s.i(name, "name");
        return AbstractC6492s.d(this.f1749a, name);
    }

    public final Zh.f c() {
        return this.f1749a;
    }

    public final InterfaceC7619j d() {
        return this.f1750b;
    }

    public String toString() {
        return "InlineClassRepresentation(underlyingPropertyName=" + this.f1749a + ", underlyingType=" + this.f1750b + ')';
    }
}

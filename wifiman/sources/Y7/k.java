package y7;

import kotlin.jvm.internal.AbstractC6492s;
import s7.InterfaceC7921h;

/* loaded from: classes3.dex */
public final class k implements InterfaceC7921h {

    /* renamed from: a, reason: collision with root package name */
    private final String f66392a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f66393b;

    public k(String value) {
        AbstractC6492s.i(value, "value");
        this.f66392a = value;
        this.f66393b = true;
    }

    public final String a() {
        return this.f66392a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && AbstractC6492s.d(this.f66392a, ((k) obj).f66392a);
    }

    public int hashCode() {
        return this.f66392a.hashCode();
    }

    @Override // s7.InterfaceC7921h
    public boolean isSingle() {
        return this.f66393b;
    }

    public String toString() {
        return "MikrotikVersion(value=" + this.f66392a + ")";
    }
}

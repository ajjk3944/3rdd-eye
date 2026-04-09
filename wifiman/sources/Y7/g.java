package y7;

import kotlin.jvm.internal.AbstractC6492s;
import s7.InterfaceC7921h;

/* loaded from: classes3.dex */
public final class g implements InterfaceC7921h {

    /* renamed from: a, reason: collision with root package name */
    private final String f66384a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f66385b;

    public g(String value) {
        AbstractC6492s.i(value, "value");
        this.f66384a = value;
        this.f66385b = true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && AbstractC6492s.d(this.f66384a, ((g) obj).f66384a);
    }

    public int hashCode() {
        return this.f66384a.hashCode();
    }

    @Override // s7.InterfaceC7921h
    public boolean isSingle() {
        return this.f66385b;
    }

    public String toString() {
        return "MikrotikInterfaceName(value=" + this.f66384a + ")";
    }
}

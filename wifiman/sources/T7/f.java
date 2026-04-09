package t7;

import kotlin.jvm.internal.AbstractC6492s;
import s7.InterfaceC7921h;

/* loaded from: classes3.dex */
public final class f implements InterfaceC7921h {

    /* renamed from: a, reason: collision with root package name */
    private final String f61838a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f61839b;

    public f(String value) {
        AbstractC6492s.i(value, "value");
        this.f61838a = value;
    }

    public final String a() {
        return this.f61838a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && AbstractC6492s.d(this.f61838a, ((f) obj).f61838a);
    }

    public int hashCode() {
        return this.f61838a.hashCode();
    }

    @Override // s7.InterfaceC7921h
    public boolean isSingle() {
        return this.f61839b;
    }

    public String toString() {
        return "UbiquitiSystemId(value=" + this.f61838a + ")";
    }
}

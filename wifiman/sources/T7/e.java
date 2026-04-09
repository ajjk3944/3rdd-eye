package t7;

import kotlin.jvm.internal.AbstractC6492s;
import s7.InterfaceC7921h;

/* loaded from: classes3.dex */
public final class e implements InterfaceC7921h {

    /* renamed from: a, reason: collision with root package name */
    private final String f61836a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f61837b;

    public e(String value) {
        AbstractC6492s.i(value, "value");
        this.f61836a = value;
    }

    public final String a() {
        return this.f61836a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && AbstractC6492s.d(this.f61836a, ((e) obj).f61836a);
    }

    public int hashCode() {
        return this.f61836a.hashCode();
    }

    @Override // s7.InterfaceC7921h
    public boolean isSingle() {
        return this.f61837b;
    }

    public String toString() {
        return "UbiquitiModel(value=" + this.f61836a + ")";
    }
}

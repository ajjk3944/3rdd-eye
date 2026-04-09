package y7;

import kotlin.jvm.internal.AbstractC6492s;
import s7.InterfaceC7921h;

/* loaded from: classes3.dex */
public final class o implements InterfaceC7921h {

    /* renamed from: a, reason: collision with root package name */
    private final String f66412a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f66413b;

    public o(String value) {
        AbstractC6492s.i(value, "value");
        this.f66412a = value;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && AbstractC6492s.d(this.f66412a, ((o) obj).f66412a);
    }

    public int hashCode() {
        return this.f66412a.hashCode();
    }

    @Override // s7.InterfaceC7921h
    public boolean isSingle() {
        return this.f66413b;
    }

    public String toString() {
        return "UbiquitiFirmwareInfoRaw(value=" + this.f66412a + ")";
    }
}

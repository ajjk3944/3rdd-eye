package y7;

import kotlin.jvm.internal.AbstractC6492s;
import s7.InterfaceC7921h;

/* loaded from: classes3.dex */
public final class r implements InterfaceC7921h {

    /* renamed from: a, reason: collision with root package name */
    private final String f66418a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f66419b;

    public r(String value) {
        AbstractC6492s.i(value, "value");
        this.f66418a = value;
    }

    public final String a() {
        return this.f66418a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && AbstractC6492s.d(this.f66418a, ((r) obj).f66418a);
    }

    public int hashCode() {
        return this.f66418a.hashCode();
    }

    @Override // s7.InterfaceC7921h
    public boolean isSingle() {
        return this.f66419b;
    }

    public String toString() {
        return "UbiquitiProductName(value=" + this.f66418a + ")";
    }
}

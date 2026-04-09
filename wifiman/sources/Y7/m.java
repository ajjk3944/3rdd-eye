package y7;

import kotlin.jvm.internal.AbstractC6492s;
import s7.InterfaceC7921h;

/* loaded from: classes3.dex */
public final class m implements InterfaceC7921h {

    /* renamed from: a, reason: collision with root package name */
    private final String f66397a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f66398b;

    public m(String value) {
        AbstractC6492s.i(value, "value");
        this.f66397a = value;
    }

    public final String a() {
        return this.f66397a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && AbstractC6492s.d(this.f66397a, ((m) obj).f66397a);
    }

    public int hashCode() {
        return this.f66397a.hashCode();
    }

    @Override // s7.InterfaceC7921h
    public boolean isSingle() {
        return this.f66398b;
    }

    public String toString() {
        return "UbiquitiEssid(value=" + this.f66397a + ")";
    }
}

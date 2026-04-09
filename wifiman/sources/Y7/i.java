package y7;

import kotlin.jvm.internal.AbstractC6492s;
import s7.InterfaceC7921h;

/* loaded from: classes3.dex */
public final class i implements InterfaceC7921h {

    /* renamed from: a, reason: collision with root package name */
    private final String f66388a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f66389b;

    public i(String value) {
        AbstractC6492s.i(value, "value");
        this.f66388a = value;
        this.f66389b = true;
    }

    public final String a() {
        return this.f66388a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && AbstractC6492s.d(this.f66388a, ((i) obj).f66388a);
    }

    public int hashCode() {
        return this.f66388a.hashCode();
    }

    @Override // s7.InterfaceC7921h
    public boolean isSingle() {
        return this.f66389b;
    }

    public String toString() {
        return "MikrotikSoftwareID(value=" + this.f66388a + ")";
    }
}

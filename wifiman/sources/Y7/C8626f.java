package y7;

import kotlin.jvm.internal.AbstractC6492s;
import s7.InterfaceC7921h;

/* renamed from: y7.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8626f implements InterfaceC7921h {

    /* renamed from: a, reason: collision with root package name */
    private final String f66382a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f66383b;

    public C8626f(String value) {
        AbstractC6492s.i(value, "value");
        this.f66382a = value;
        this.f66383b = true;
    }

    public final String a() {
        return this.f66382a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8626f) && AbstractC6492s.d(this.f66382a, ((C8626f) obj).f66382a);
    }

    public int hashCode() {
        return this.f66382a.hashCode();
    }

    @Override // s7.InterfaceC7921h
    public boolean isSingle() {
        return this.f66383b;
    }

    public String toString() {
        return "MikrotikIdentity(value=" + this.f66382a + ")";
    }
}

package y7;

import kotlin.jvm.internal.AbstractC6492s;
import s7.InterfaceC7921h;

/* loaded from: classes3.dex */
public final class h implements InterfaceC7921h {

    /* renamed from: a, reason: collision with root package name */
    private final String f66386a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f66387b;

    public h(String value) {
        AbstractC6492s.i(value, "value");
        this.f66386a = value;
        this.f66387b = true;
    }

    public final String a() {
        return this.f66386a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && AbstractC6492s.d(this.f66386a, ((h) obj).f66386a);
    }

    public int hashCode() {
        return this.f66386a.hashCode();
    }

    @Override // s7.InterfaceC7921h
    public boolean isSingle() {
        return this.f66387b;
    }

    public String toString() {
        return "MikrotikPlatform(value=" + this.f66386a + ")";
    }
}

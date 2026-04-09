package t7;

import kotlin.jvm.internal.AbstractC6492s;
import s7.InterfaceC7921h;

/* renamed from: t7.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8037a implements InterfaceC7921h {

    /* renamed from: a, reason: collision with root package name */
    private final String f61830a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f61831b;

    public C8037a(String value) {
        AbstractC6492s.i(value, "value");
        this.f61830a = value;
    }

    public final String a() {
        return this.f61830a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8037a) && AbstractC6492s.d(this.f61830a, ((C8037a) obj).f61830a);
    }

    public int hashCode() {
        return this.f61830a.hashCode();
    }

    @Override // s7.InterfaceC7921h
    public boolean isSingle() {
        return this.f61831b;
    }

    public String toString() {
        return "DeviceName(value=" + this.f61830a + ")";
    }
}

package y7;

import kotlin.jvm.internal.AbstractC6492s;
import s7.InterfaceC7921h;

/* renamed from: y7.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8625e implements InterfaceC7921h {

    /* renamed from: a, reason: collision with root package name */
    private final String f66380a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f66381b;

    public C8625e(String value) {
        AbstractC6492s.i(value, "value");
        this.f66380a = value;
        this.f66381b = true;
    }

    public final String a() {
        return this.f66380a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8625e) && AbstractC6492s.d(this.f66380a, ((C8625e) obj).f66380a);
    }

    public int hashCode() {
        return this.f66380a.hashCode();
    }

    @Override // s7.InterfaceC7921h
    public boolean isSingle() {
        return this.f66381b;
    }

    public String toString() {
        return "MikrotikBoard(value=" + this.f66380a + ")";
    }
}

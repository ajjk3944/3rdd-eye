package y0;

import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: y0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8580a implements InterfaceC8599t {

    /* renamed from: b, reason: collision with root package name */
    private final int f66273b;

    public C8580a(int i10) {
        this.f66273b = i10;
    }

    public final int a() {
        return this.f66273b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!AbstractC6492s.d(C8580a.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC6492s.g(obj, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIconType");
        return this.f66273b == ((C8580a) obj).f66273b;
    }

    public int hashCode() {
        return this.f66273b;
    }

    public String toString() {
        return "AndroidPointerIcon(type=" + this.f66273b + ')';
    }
}

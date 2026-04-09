package R0;

import L0.C3174d;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class J implements c0 {

    /* renamed from: b, reason: collision with root package name */
    private final char f19400b;

    public J(char c10) {
        this.f19400b = c10;
    }

    @Override // R0.c0
    public a0 a(C3174d c3174d) {
        return new a0(new C3174d(kotlin.text.t.H(String.valueOf(this.f19400b), c3174d.k().length()), null, null, 6, null), H.f19391a.a());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof J) && this.f19400b == ((J) obj).f19400b;
    }

    public int hashCode() {
        return Character.hashCode(this.f19400b);
    }

    public /* synthetic */ J(char c10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? (char) 8226 : c10);
    }
}

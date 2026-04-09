package ra;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: ra.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7580a {

    /* renamed from: a, reason: collision with root package name */
    private final d f60191a;

    /* renamed from: b, reason: collision with root package name */
    private final C7581b f60192b;

    public C7580a(d windowSize, C7581b margin) {
        AbstractC6492s.i(windowSize, "windowSize");
        AbstractC6492s.i(margin, "margin");
        this.f60191a = windowSize;
        this.f60192b = margin;
    }

    public final C7581b a() {
        return this.f60192b;
    }

    public final d b() {
        return this.f60191a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7580a)) {
            return false;
        }
        C7580a c7580a = (C7580a) obj;
        return this.f60191a == c7580a.f60191a && AbstractC6492s.d(this.f60192b, c7580a.f60192b);
    }

    public int hashCode() {
        return (this.f60191a.hashCode() * 31) + this.f60192b.hashCode();
    }

    public String toString() {
        return "UiWindow(windowSize=" + this.f60191a + ", margin=" + this.f60192b + ")";
    }

    public /* synthetic */ C7580a(d dVar, C7581b c7581b, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar, (i10 & 2) != 0 ? c.a(dVar) : c7581b);
    }
}

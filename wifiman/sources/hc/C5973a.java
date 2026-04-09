package hc;

import ec.AbstractC5452a;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: hc.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5973a {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC5452a f48575a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f48576b;

    public C5973a(AbstractC5452a text, boolean z10) {
        AbstractC6492s.i(text, "text");
        this.f48575a = text;
        this.f48576b = z10;
    }

    public final boolean a() {
        return this.f48576b;
    }

    public final AbstractC5452a b() {
        return this.f48575a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5973a)) {
            return false;
        }
        C5973a c5973a = (C5973a) obj;
        return AbstractC6492s.d(this.f48575a, c5973a.f48575a) && this.f48576b == c5973a.f48576b;
    }

    public int hashCode() {
        return (this.f48575a.hashCode() * 31) + Boolean.hashCode(this.f48576b);
    }

    public String toString() {
        return "Toast(text=" + this.f48575a + ", durationLong=" + this.f48576b + ")";
    }

    public /* synthetic */ C5973a(AbstractC5452a abstractC5452a, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC5452a, (i10 & 2) != 0 ? false : z10);
    }
}

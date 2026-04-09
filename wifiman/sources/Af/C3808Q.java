package af;

import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: af.Q, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3808Q {

    /* renamed from: a, reason: collision with root package name */
    private final S8.c f26032a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f26033b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f26034c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f26035d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f26036e;

    public C3808Q(S8.c band, boolean z10, boolean z11, boolean z12, boolean z13) {
        AbstractC6492s.i(band, "band");
        this.f26032a = band;
        this.f26033b = z10;
        this.f26034c = z11;
        this.f26035d = z12;
        this.f26036e = z13;
    }

    public final S8.c a() {
        return this.f26032a;
    }

    public final boolean b() {
        return this.f26036e;
    }

    public final boolean c() {
        return this.f26035d;
    }

    public final boolean d() {
        return this.f26034c;
    }

    public final boolean e() {
        return this.f26033b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3808Q)) {
            return false;
        }
        C3808Q c3808q = (C3808Q) obj;
        return this.f26032a == c3808q.f26032a && this.f26033b == c3808q.f26033b && this.f26034c == c3808q.f26034c && this.f26035d == c3808q.f26035d && this.f26036e == c3808q.f26036e;
    }

    public int hashCode() {
        return (((((((this.f26032a.hashCode() * 31) + Boolean.hashCode(this.f26033b)) * 31) + Boolean.hashCode(this.f26034c)) * 31) + Boolean.hashCode(this.f26035d)) * 31) + Boolean.hashCode(this.f26036e);
    }

    public String toString() {
        return "Tab(band=" + this.f26032a + ", isSelected=" + this.f26033b + ", isConnected=" + this.f26034c + ", isActive=" + this.f26035d + ", hasIssues=" + this.f26036e + ")";
    }
}

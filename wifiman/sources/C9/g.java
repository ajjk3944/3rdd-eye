package C9;

import kotlin.jvm.internal.DefaultConstructorMarker;
import m0.C6733v0;

/* loaded from: classes3.dex */
final class g {

    /* renamed from: a, reason: collision with root package name */
    private final long f2372a;

    /* renamed from: b, reason: collision with root package name */
    private final long f2373b;

    /* renamed from: c, reason: collision with root package name */
    private final long f2374c;

    /* renamed from: d, reason: collision with root package name */
    private final long f2375d;

    /* renamed from: e, reason: collision with root package name */
    private final long f2376e;

    /* renamed from: f, reason: collision with root package name */
    private final long f2377f;

    public /* synthetic */ g(long j10, long j11, long j12, long j13, long j14, long j15, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, j13, j14, j15);
    }

    public final long a() {
        return this.f2374c;
    }

    public final long b() {
        return this.f2375d;
    }

    public final long c() {
        return this.f2373b;
    }

    public final long d() {
        return this.f2372a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return C6733v0.m(this.f2372a, gVar.f2372a) && C6733v0.m(this.f2373b, gVar.f2373b) && C6733v0.m(this.f2374c, gVar.f2374c) && C6733v0.m(this.f2375d, gVar.f2375d) && C6733v0.m(this.f2376e, gVar.f2376e) && C6733v0.m(this.f2377f, gVar.f2377f);
    }

    public int hashCode() {
        return (((((((((C6733v0.s(this.f2372a) * 31) + C6733v0.s(this.f2373b)) * 31) + C6733v0.s(this.f2374c)) * 31) + C6733v0.s(this.f2375d)) * 31) + C6733v0.s(this.f2376e)) * 31) + C6733v0.s(this.f2377f);
    }

    public String toString() {
        return "NotificationColors(text=" + C6733v0.t(this.f2372a) + ", focusedText=" + C6733v0.t(this.f2373b) + ", background=" + C6733v0.t(this.f2374c) + ", focusedBackground=" + C6733v0.t(this.f2375d) + ", hiddenItem1Background=" + C6733v0.t(this.f2376e) + ", hiddenItem2Background=" + C6733v0.t(this.f2377f) + ")";
    }

    private g(long j10, long j11, long j12, long j13, long j14, long j15) {
        this.f2372a = j10;
        this.f2373b = j11;
        this.f2374c = j12;
        this.f2375d = j13;
        this.f2376e = j14;
        this.f2377f = j15;
    }
}

package Ka;

import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final b f10536a;

    /* renamed from: b, reason: collision with root package name */
    private final long f10537b;

    /* renamed from: c, reason: collision with root package name */
    private final long f10538c;

    /* renamed from: d, reason: collision with root package name */
    private final long f10539d;

    public c(b state, long j10, long j11, long j12) {
        AbstractC6492s.i(state, "state");
        this.f10536a = state;
        this.f10537b = j10;
        this.f10538c = j11;
        this.f10539d = j12;
    }

    public final long a() {
        return this.f10537b;
    }

    public final b b() {
        return this.f10536a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f10536a == cVar.f10536a && this.f10537b == cVar.f10537b && this.f10538c == cVar.f10538c && this.f10539d == cVar.f10539d;
    }

    public int hashCode() {
        return (((((this.f10536a.hashCode() * 31) + Long.hashCode(this.f10537b)) * 31) + Long.hashCode(this.f10538c)) * 31) + Long.hashCode(this.f10539d);
    }

    public String toString() {
        return "Status(state=" + this.f10536a + ", speedBps=" + this.f10537b + ", totalBytes=" + this.f10538c + ", durationMillis=" + this.f10539d + ")";
    }
}

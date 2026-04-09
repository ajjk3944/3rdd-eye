package oh;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final long f19449a;

    /* renamed from: b, reason: collision with root package name */
    public final ab.g f19450b;

    /* renamed from: c, reason: collision with root package name */
    public final int f19451c;

    /* renamed from: d, reason: collision with root package name */
    public final long f19452d;

    /* renamed from: e, reason: collision with root package name */
    public final long f19453e;

    /* renamed from: f, reason: collision with root package name */
    public final long f19454f;

    public b(long j, ab.g gVar, int i10, long j7, long j10, long j11) {
        this.f19449a = j;
        this.f19450b = gVar;
        this.f19451c = i10;
        this.f19452d = j7;
        this.f19453e = j10;
        this.f19454f = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f19449a == bVar.f19449a && br.l.a(this.f19450b, bVar.f19450b) && this.f19451c == bVar.f19451c && this.f19452d == bVar.f19452d && this.f19453e == bVar.f19453e && this.f19454f == bVar.f19454f;
    }

    public final int hashCode() {
        return Long.hashCode(this.f19454f) + h0.b.b(h0.b.b(c7.a.C(this.f19451c, (this.f19450b.hashCode() + (Long.hashCode(this.f19449a) * 31)) * 31, 31), 31, this.f19452d), 31, this.f19453e);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EventTime(realtimeMs=");
        sb2.append(this.f19449a);
        sb2.append(", timeline=");
        sb2.append(this.f19450b);
        sb2.append(", currentWindowIndex=");
        sb2.append(this.f19451c);
        sb2.append(", eventPlaybackPositionMs=");
        sb2.append(this.f19452d);
        sb2.append(", currentPlaybackPositionMs=");
        sb2.append(this.f19453e);
        sb2.append(", totalBufferedDurationMs=");
        return w.g.h(sb2, this.f19454f, ')');
    }
}

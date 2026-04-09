package r1;

import d3.l;
import nk.k;
import p1.q;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public d3.c f32713a;

    /* renamed from: b, reason: collision with root package name */
    public l f32714b;

    /* renamed from: c, reason: collision with root package name */
    public q f32715c;

    /* renamed from: d, reason: collision with root package name */
    public long f32716d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return k.a(this.f32713a, aVar.f32713a) && this.f32714b == aVar.f32714b && k.a(this.f32715c, aVar.f32715c) && o1.e.a(this.f32716d, aVar.f32716d);
    }

    public final int hashCode() {
        int iHashCode = (this.f32715c.hashCode() + ((this.f32714b.hashCode() + (this.f32713a.hashCode() * 31)) * 31)) * 31;
        long j = this.f32716d;
        return ((int) (j ^ (j >>> 32))) + iHashCode;
    }

    public final String toString() {
        return "DrawParams(density=" + this.f32713a + ", layoutDirection=" + this.f32714b + ", canvas=" + this.f32715c + ", size=" + ((Object) o1.e.d(this.f32716d)) + ')';
    }
}

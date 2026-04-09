package l8;

import android.graphics.drawable.Drawable;
import coil.memory.MemoryCache$Key;

/* loaded from: classes.dex */
public final class q extends k {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable f14963a;

    /* renamed from: b, reason: collision with root package name */
    public final j f14964b;

    /* renamed from: c, reason: collision with root package name */
    public final c8.h f14965c;

    /* renamed from: d, reason: collision with root package name */
    public final MemoryCache$Key f14966d;

    /* renamed from: e, reason: collision with root package name */
    public final String f14967e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f14968f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f14969g;

    public q(Drawable drawable, j jVar, c8.h hVar, MemoryCache$Key memoryCache$Key, String str, boolean z10, boolean z11) {
        this.f14963a = drawable;
        this.f14964b = jVar;
        this.f14965c = hVar;
        this.f14966d = memoryCache$Key;
        this.f14967e = str;
        this.f14968f = z10;
        this.f14969g = z11;
    }

    @Override // l8.k
    public final j a() {
        return this.f14964b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return br.l.a(this.f14963a, qVar.f14963a) && br.l.a(this.f14964b, qVar.f14964b) && this.f14965c == qVar.f14965c && br.l.a(this.f14966d, qVar.f14966d) && br.l.a(this.f14967e, qVar.f14967e) && this.f14968f == qVar.f14968f && this.f14969g == qVar.f14969g;
    }

    public final int hashCode() {
        int iHashCode = (this.f14965c.hashCode() + ((this.f14964b.hashCode() + (this.f14963a.hashCode() * 31)) * 31)) * 31;
        MemoryCache$Key memoryCache$Key = this.f14966d;
        int iHashCode2 = (iHashCode + (memoryCache$Key != null ? memoryCache$Key.hashCode() : 0)) * 31;
        String str = this.f14967e;
        return Boolean.hashCode(this.f14969g) + w.g.b((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31, this.f14968f, 31);
    }
}

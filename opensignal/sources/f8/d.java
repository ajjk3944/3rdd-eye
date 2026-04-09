package f8;

import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class d extends e {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable f8681a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f8682b;

    /* renamed from: c, reason: collision with root package name */
    public final c8.h f8683c;

    public d(Drawable drawable, boolean z10, c8.h hVar) {
        this.f8681a = drawable;
        this.f8682b = z10;
        this.f8683c = hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return br.l.a(this.f8681a, dVar.f8681a) && this.f8682b == dVar.f8682b && this.f8683c == dVar.f8683c;
    }

    public final int hashCode() {
        return this.f8683c.hashCode() + w.g.b(this.f8681a.hashCode() * 31, this.f8682b, 31);
    }
}

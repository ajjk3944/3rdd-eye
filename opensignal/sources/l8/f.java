package l8;

import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class f extends k {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable f14906a;

    /* renamed from: b, reason: collision with root package name */
    public final j f14907b;

    /* renamed from: c, reason: collision with root package name */
    public final Throwable f14908c;

    public f(Drawable drawable, j jVar, Throwable th2) {
        this.f14906a = drawable;
        this.f14907b = jVar;
        this.f14908c = th2;
    }

    @Override // l8.k
    public final j a() {
        return this.f14907b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return br.l.a(this.f14906a, fVar.f14906a) && br.l.a(this.f14907b, fVar.f14907b) && br.l.a(this.f14908c, fVar.f14908c);
    }

    public final int hashCode() {
        Drawable drawable = this.f14906a;
        return this.f14908c.hashCode() + ((this.f14907b.hashCode() + ((drawable != null ? drawable.hashCode() : 0) * 31)) * 31);
    }
}

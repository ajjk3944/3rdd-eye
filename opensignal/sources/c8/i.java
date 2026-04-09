package c8;

import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable f3347a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3348b;

    public i(Drawable drawable, boolean z10) {
        this.f3347a = drawable;
        this.f3348b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return br.l.a(this.f3347a, iVar.f3347a) && this.f3348b == iVar.f3348b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f3348b) + (this.f3347a.hashCode() * 31);
    }
}

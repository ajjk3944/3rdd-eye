package t6;

import android.net.Uri;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f34329a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f34330b;

    public d(boolean z3, Uri uri) {
        this.f34329a = uri;
        this.f34330b = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!d.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        nk.k.c(obj, "null cannot be cast to non-null type androidx.work.Constraints.ContentUriTrigger");
        d dVar = (d) obj;
        return nk.k.a(this.f34329a, dVar.f34329a) && this.f34330b == dVar.f34330b;
    }

    public final int hashCode() {
        return (this.f34329a.hashCode() * 31) + (this.f34330b ? 1231 : 1237);
    }
}

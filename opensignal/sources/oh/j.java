package oh;

import android.net.Uri;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f19475a;

    public j(Uri uri) {
        br.l.e(uri, "uri");
        this.f19475a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && br.l.a(this.f19475a, ((j) obj).f19475a);
    }

    public final int hashCode() {
        return this.f19475a.hashCode();
    }

    public final String toString() {
        return "VideoDataSpec(uri=" + this.f19475a + ')';
    }
}

package V0;

import android.net.Uri;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f3816a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3817b;

    public d(Uri uri, boolean z6) {
        this.f3816a = uri;
        this.f3817b = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f3817b == dVar.f3817b && this.f3816a.equals(dVar.f3816a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f3816a.hashCode() * 31) + (this.f3817b ? 1 : 0);
    }
}

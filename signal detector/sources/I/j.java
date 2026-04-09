package I;

import android.content.res.Resources;
import j$.util.Objects;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final Resources f1868a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources.Theme f1869b;

    public j(Resources resources, Resources.Theme theme) {
        this.f1868a = resources;
        this.f1869b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j.class == obj.getClass()) {
            j jVar = (j) obj;
            if (this.f1868a.equals(jVar.f1868a) && Objects.equals(this.f1869b, jVar.f1869b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f1868a, this.f1869b);
    }
}

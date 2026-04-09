package j3;

import android.content.res.Resources;
import java.util.Objects;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final Resources f13191a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources.Theme f13192b;

    public i(Resources resources, Resources.Theme theme) {
        this.f13191a = resources;
        this.f13192b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i.class == obj.getClass()) {
            i iVar = (i) obj;
            if (this.f13191a.equals(iVar.f13191a) && Objects.equals(this.f13192b, iVar.f13192b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f13191a, this.f13192b);
    }
}

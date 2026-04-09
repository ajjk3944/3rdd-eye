package R;

import android.view.DisplayCutout;
import j$.util.Objects;

/* renamed from: R.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0181h {

    /* renamed from: a, reason: collision with root package name */
    public final DisplayCutout f3338a;

    public C0181h(DisplayCutout displayCutout) {
        this.f3338a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0181h.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f3338a, ((C0181h) obj).f3338a);
    }

    public final int hashCode() {
        return this.f3338a.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f3338a + "}";
    }
}

package u3;

import android.view.DisplayCutout;
import java.util.Objects;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final DisplayCutout f23170a;

    public h(DisplayCutout displayCutout) {
        this.f23170a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f23170a, ((h) obj).f23170a);
    }

    public final int hashCode() {
        return this.f23170a.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f23170a + "}";
    }
}

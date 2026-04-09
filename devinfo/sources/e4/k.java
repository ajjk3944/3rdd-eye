package e4;

import android.view.DisplayCutout;
import j$.util.Objects;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final DisplayCutout f22363a;

    public k(DisplayCutout displayCutout) {
        this.f22363a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f22363a, ((k) obj).f22363a);
    }

    public final int hashCode() {
        DisplayCutout displayCutout = this.f22363a;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f22363a + "}";
    }
}

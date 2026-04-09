package L0;

import android.graphics.Rect;
import android.view.DisplayCutout;
import java.util.List;
import java.util.Objects;

/* compiled from: DisplayCutoutCompat.java */
/* renamed from: L0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0775f {

    /* renamed from: a, reason: collision with root package name */
    public final DisplayCutout f3910a;

    /* compiled from: DisplayCutoutCompat.java */
    /* renamed from: L0.f$a */
    public static class a {
        public static DisplayCutout a(Rect rect, List<Rect> list) {
            return new DisplayCutout(rect, list);
        }

        public static List<Rect> b(DisplayCutout displayCutout) {
            return displayCutout.getBoundingRects();
        }

        public static int c(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetBottom();
        }

        public static int d(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetLeft();
        }

        public static int e(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetRight();
        }

        public static int f(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetTop();
        }
    }

    public C0775f(DisplayCutout displayCutout) {
        this.f3910a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0775f.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f3910a, ((C0775f) obj).f3910a);
    }

    public final int hashCode() {
        return this.f3910a.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f3910a + "}";
    }
}

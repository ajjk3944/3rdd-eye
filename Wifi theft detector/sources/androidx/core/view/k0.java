package androidx.core.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build;
import android.view.PointerIcon;
import androidx.annotation.DoNotInline;

/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public final PointerIcon f2728a;

    public static class a {
        @DoNotInline
        public static PointerIcon a(Bitmap bitmap, float f10, float f11) {
            return PointerIcon.create(bitmap, f10, f11);
        }

        @DoNotInline
        public static PointerIcon b(Context context, int i10) {
            return PointerIcon.getSystemIcon(context, i10);
        }

        @DoNotInline
        public static PointerIcon c(Resources resources, int i10) {
            return PointerIcon.load(resources, i10);
        }
    }

    public k0(PointerIcon pointerIcon) {
        this.f2728a = pointerIcon;
    }

    public static k0 b(Context context, int i10) {
        return Build.VERSION.SDK_INT >= 24 ? new k0(a.b(context, i10)) : new k0(null);
    }

    public Object a() {
        return this.f2728a;
    }
}

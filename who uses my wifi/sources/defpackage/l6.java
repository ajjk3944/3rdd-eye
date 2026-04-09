package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class l6 {
    public static final PorterDuff.Mode b = PorterDuff.Mode.SRC_IN;
    public static l6 c;
    public zp0 a;

    public static synchronized l6 a() {
        try {
            if (c == null) {
                d();
            }
        } catch (Throwable th) {
            throw th;
        }
        return c;
    }

    public static synchronized PorterDuffColorFilter c(int i, PorterDuff.Mode mode) {
        return zp0.e(i, mode);
    }

    public static synchronized void d() {
        if (c == null) {
            l6 l6Var = new l6();
            c = l6Var;
            l6Var.a = zp0.b();
            zp0 zp0Var = c.a;
            bu1 bu1Var = new bu1(1);
            synchronized (zp0Var) {
                zp0Var.e = bu1Var;
            }
        }
    }

    public static void e(Drawable drawable, gc3 gc3Var, int[] iArr) {
        PorterDuff.Mode mode = zp0.f;
        int[] state = drawable.getState();
        if (drawable.mutate() == drawable) {
            if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
                drawable.setState(new int[0]);
                drawable.setState(state);
            }
            boolean z = gc3Var.b;
            if (!z && !gc3Var.a) {
                drawable.clearColorFilter();
                return;
            }
            PorterDuffColorFilter porterDuffColorFilterE = null;
            ColorStateList colorStateList = z ? (ColorStateList) gc3Var.c : null;
            PorterDuff.Mode mode2 = gc3Var.a ? (PorterDuff.Mode) gc3Var.d : zp0.f;
            if (colorStateList != null && mode2 != null) {
                porterDuffColorFilterE = zp0.e(colorStateList.getColorForState(iArr, 0), mode2);
            }
            drawable.setColorFilter(porterDuffColorFilterE);
        }
    }

    public final synchronized Drawable b(Context context, int i) {
        return this.a.c(context, i);
    }
}

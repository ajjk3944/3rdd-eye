package p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: b, reason: collision with root package name */
    public static final PorterDuff.Mode f20130b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c, reason: collision with root package name */
    public static p f20131c;

    /* renamed from: a, reason: collision with root package name */
    public a2 f20132a;

    public static synchronized p a() {
        try {
            if (f20131c == null) {
                d();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f20131c;
    }

    public static synchronized PorterDuffColorFilter c(int i10, PorterDuff.Mode mode) {
        return a2.e(i10, mode);
    }

    public static synchronized void d() {
        if (f20131c == null) {
            p pVar = new p();
            f20131c = pVar;
            pVar.f20132a = a2.b();
            a2 a2Var = f20131c.f20132a;
            h9.r2 r2Var = new h9.r2(15);
            synchronized (a2Var) {
                a2Var.f20027e = r2Var;
            }
        }
    }

    public static void e(Drawable drawable, d5.z0 z0Var, int[] iArr) {
        PorterDuff.Mode mode = a2.f20020f;
        int[] state = drawable.getState();
        if (drawable.mutate() == drawable) {
            if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
                drawable.setState(new int[0]);
                drawable.setState(state);
            }
            boolean z10 = z0Var.f7143c;
            if (!z10 && !z0Var.f7142b) {
                drawable.clearColorFilter();
                return;
            }
            PorterDuffColorFilter porterDuffColorFilterE = null;
            ColorStateList colorStateList = z10 ? (ColorStateList) z0Var.f7144d : null;
            PorterDuff.Mode mode2 = z0Var.f7142b ? (PorterDuff.Mode) z0Var.f7145e : a2.f20020f;
            if (colorStateList != null && mode2 != null) {
                porterDuffColorFilterE = a2.e(colorStateList.getColorForState(iArr, 0), mode2);
            }
            drawable.setColorFilter(porterDuffColorFilterE);
        }
    }

    public final synchronized Drawable b(Context context, int i10) {
        return this.f20132a.c(context, i10);
    }
}

package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.Log;
import q2.C2834o;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: b, reason: collision with root package name */
    public static final PorterDuff.Mode f22621b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c, reason: collision with root package name */
    public static r f22622c;

    /* renamed from: a, reason: collision with root package name */
    public I0 f22623a;

    public static synchronized r a() {
        try {
            if (f22622c == null) {
                d();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f22622c;
    }

    public static synchronized PorterDuffColorFilter c(int i, PorterDuff.Mode mode) {
        return I0.h(i, mode);
    }

    public static synchronized void d() {
        if (f22622c == null) {
            r rVar = new r();
            f22622c = rVar;
            rVar.f22623a = I0.d();
            f22622c.f22623a.m(new C2834o());
        }
    }

    public static void e(Drawable drawable, Y0 y02, int[] iArr) {
        PorterDuff.Mode mode = I0.f22384h;
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z6 = y02.f22474d;
        if (z6 || y02.f22473c) {
            PorterDuffColorFilter porterDuffColorFilterH = null;
            ColorStateList colorStateList = z6 ? y02.f22471a : null;
            PorterDuff.Mode mode2 = y02.f22473c ? y02.f22472b : I0.f22384h;
            if (colorStateList != null && mode2 != null) {
                porterDuffColorFilterH = I0.h(colorStateList.getColorForState(iArr, 0), mode2);
            }
            drawable.setColorFilter(porterDuffColorFilterH);
        } else {
            drawable.clearColorFilter();
        }
        if (Build.VERSION.SDK_INT <= 23) {
            drawable.invalidateSelf();
        }
    }

    public final synchronized Drawable b(Context context, int i) {
        return this.f22623a.f(context, i);
    }
}

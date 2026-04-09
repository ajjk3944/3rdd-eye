package p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.Log;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: b, reason: collision with root package name */
    public static final PorterDuff.Mode f30850b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c, reason: collision with root package name */
    public static s f30851c;

    /* renamed from: a, reason: collision with root package name */
    public k2 f30852a;

    public static synchronized s a() {
        try {
            if (f30851c == null) {
                d();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f30851c;
    }

    public static synchronized PorterDuffColorFilter c(int i4, PorterDuff.Mode mode) {
        return k2.h(i4, mode);
    }

    public static synchronized void d() {
        if (f30851c == null) {
            s sVar = new s();
            f30851c = sVar;
            sVar.f30852a = k2.d();
            f30851c.f30852a.m(new va.o(7));
        }
    }

    public static void e(Drawable drawable, ah.f fVar, int[] iArr) {
        PorterDuff.Mode mode = k2.f30750h;
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z3 = fVar.f381b;
        if (z3 || fVar.f380a) {
            PorterDuffColorFilter porterDuffColorFilterH = null;
            ColorStateList colorStateList = z3 ? (ColorStateList) fVar.f382c : null;
            PorterDuff.Mode mode2 = fVar.f380a ? (PorterDuff.Mode) fVar.f383d : k2.f30750h;
            if (colorStateList != null && mode2 != null) {
                porterDuffColorFilterH = k2.h(colorStateList.getColorForState(iArr, 0), mode2);
            }
            drawable.setColorFilter(porterDuffColorFilterH);
        } else {
            drawable.clearColorFilter();
        }
        if (Build.VERSION.SDK_INT <= 23) {
            drawable.invalidateSelf();
        }
    }

    public final synchronized Drawable b(int i4, Context context) {
        return this.f30852a.f(i4, context);
    }
}

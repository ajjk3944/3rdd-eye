package W2;

import A9.I;
import B0.g;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import m.C5306c;
import z0.C5848a;

/* compiled from: DrawableDecoderCompat.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static volatile boolean f13334a = true;

    public static Drawable a(Context context, Context context2, int i, Resources.Theme theme) {
        try {
            if (f13334a) {
                return b(context2, i, theme);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e4) {
            if (context.getPackageName().equals(context2.getPackageName())) {
                throw e4;
            }
            return C5848a.getDrawable(context2, i);
        } catch (NoClassDefFoundError unused2) {
            f13334a = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        Resources resources = context2.getResources();
        ThreadLocal<TypedValue> threadLocal = g.f359a;
        return g.a.a(resources, i, theme);
    }

    public static Drawable b(Context context, int i, Resources.Theme theme) {
        if (theme != null) {
            C5306c c5306c = new C5306c(context);
            c5306c.f43932b = theme;
            c5306c.a(theme.getResources().getConfiguration());
            context = c5306c;
        }
        return I.w(context, i);
    }
}

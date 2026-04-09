package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class b1 extends Resources {

    /* renamed from: b, reason: collision with root package name */
    private static boolean f893b = false;

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference<Context> f894a;

    public b1(Context context, Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f894a = new WeakReference<>(context);
    }

    public static boolean a() {
        return f893b;
    }

    public static boolean b() {
        return a() && Build.VERSION.SDK_INT <= 20;
    }

    final Drawable c(int i2) {
        return super.getDrawable(i2);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i2) {
        Context context = this.f894a.get();
        return context != null ? m0.h().t(context, this, i2) : super.getDrawable(i2);
    }
}

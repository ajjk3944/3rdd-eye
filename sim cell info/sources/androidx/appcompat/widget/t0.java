package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class t0 extends ContextWrapper {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f1127c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private static ArrayList<WeakReference<t0>> f1128d;

    /* renamed from: a, reason: collision with root package name */
    private final Resources f1129a;

    /* renamed from: b, reason: collision with root package name */
    private final Resources.Theme f1130b;

    private t0(Context context) {
        super(context);
        if (!b1.b()) {
            this.f1129a = new v0(this, context.getResources());
            this.f1130b = null;
            return;
        }
        b1 b1Var = new b1(this, context.getResources());
        this.f1129a = b1Var;
        Resources.Theme themeNewTheme = b1Var.newTheme();
        this.f1130b = themeNewTheme;
        themeNewTheme.setTo(context.getTheme());
    }

    private static boolean a(Context context) {
        if ((context instanceof t0) || (context.getResources() instanceof v0) || (context.getResources() instanceof b1)) {
            return false;
        }
        return Build.VERSION.SDK_INT < 21 || b1.b();
    }

    public static Context b(Context context) {
        if (!a(context)) {
            return context;
        }
        synchronized (f1127c) {
            ArrayList<WeakReference<t0>> arrayList = f1128d;
            if (arrayList == null) {
                f1128d = new ArrayList<>();
            } else {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    WeakReference<t0> weakReference = f1128d.get(size);
                    if (weakReference == null || weakReference.get() == null) {
                        f1128d.remove(size);
                    }
                }
                for (int size2 = f1128d.size() - 1; size2 >= 0; size2--) {
                    WeakReference<t0> weakReference2 = f1128d.get(size2);
                    t0 t0Var = weakReference2 != null ? weakReference2.get() : null;
                    if (t0Var != null && t0Var.getBaseContext() == context) {
                        return t0Var;
                    }
                }
            }
            t0 t0Var2 = new t0(context);
            f1128d.add(new WeakReference<>(t0Var2));
            return t0Var2;
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return this.f1129a.getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return this.f1129a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f1130b;
        return theme == null ? super.getTheme() : theme;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i2) {
        Resources.Theme theme = this.f1130b;
        if (theme == null) {
            super.setTheme(i2);
        } else {
            theme.applyStyle(i2, true);
        }
    }
}

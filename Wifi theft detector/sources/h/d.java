package h;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;

/* loaded from: classes.dex */
public class d extends ContextWrapper {

    /* renamed from: f, reason: collision with root package name */
    public static Configuration f21314f;

    /* renamed from: a, reason: collision with root package name */
    public int f21315a;

    /* renamed from: b, reason: collision with root package name */
    public Resources.Theme f21316b;

    /* renamed from: c, reason: collision with root package name */
    public LayoutInflater f21317c;

    /* renamed from: d, reason: collision with root package name */
    public Configuration f21318d;

    /* renamed from: e, reason: collision with root package name */
    public Resources f21319e;

    public d(Context context, int i10) {
        super(context);
        this.f21315a = i10;
    }

    public static boolean e(Configuration configuration) {
        if (configuration == null) {
            return true;
        }
        if (f21314f == null) {
            Configuration configuration2 = new Configuration();
            configuration2.fontScale = 0.0f;
            f21314f = configuration2;
        }
        return configuration.equals(f21314f);
    }

    public void a(Configuration configuration) {
        if (this.f21319e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f21318d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f21318d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final Resources b() {
        if (this.f21319e == null) {
            Configuration configuration = this.f21318d;
            if (configuration == null || (Build.VERSION.SDK_INT >= 26 && e(configuration))) {
                this.f21319e = super.getResources();
            } else {
                this.f21319e = createConfigurationContext(this.f21318d).getResources();
            }
        }
        return this.f21319e;
    }

    public int c() {
        return this.f21315a;
    }

    public final void d() {
        boolean z10 = this.f21316b == null;
        if (z10) {
            this.f21316b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f21316b.setTo(theme);
            }
        }
        f(this.f21316b, this.f21315a, z10);
    }

    public void f(Resources.Theme theme, int i10, boolean z10) {
        theme.applyStyle(i10, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return b();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f21317c == null) {
            this.f21317c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f21317c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f21316b;
        if (theme != null) {
            return theme;
        }
        if (this.f21315a == 0) {
            this.f21315a = c.i.Theme_AppCompat_Light;
        }
        d();
        return this.f21316b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i10) {
        if (this.f21315a != i10) {
            this.f21315a = i10;
            d();
        }
    }

    public d(Context context, Resources.Theme theme) {
        super(context);
        this.f21316b = theme;
    }
}

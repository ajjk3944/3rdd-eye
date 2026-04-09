package androidx.appcompat.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import h.AbstractC5935i;

/* loaded from: classes.dex */
public class d extends ContextWrapper {

    /* renamed from: f, reason: collision with root package name */
    private static Configuration f26675f;

    /* renamed from: a, reason: collision with root package name */
    private int f26676a;

    /* renamed from: b, reason: collision with root package name */
    private Resources.Theme f26677b;

    /* renamed from: c, reason: collision with root package name */
    private LayoutInflater f26678c;

    /* renamed from: d, reason: collision with root package name */
    private Configuration f26679d;

    /* renamed from: e, reason: collision with root package name */
    private Resources f26680e;

    public d(Context context, int i10) {
        super(context);
        this.f26676a = i10;
    }

    private Resources b() {
        if (this.f26680e == null) {
            Configuration configuration = this.f26679d;
            if (configuration == null || e(configuration)) {
                this.f26680e = super.getResources();
            } else {
                this.f26680e = createConfigurationContext(this.f26679d).getResources();
            }
        }
        return this.f26680e;
    }

    private void d() {
        boolean z10 = this.f26677b == null;
        if (z10) {
            this.f26677b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f26677b.setTo(theme);
            }
        }
        f(this.f26677b, this.f26676a, z10);
    }

    private static boolean e(Configuration configuration) {
        if (configuration == null) {
            return true;
        }
        if (f26675f == null) {
            Configuration configuration2 = new Configuration();
            configuration2.fontScale = 0.0f;
            f26675f = configuration2;
        }
        return configuration.equals(f26675f);
    }

    public void a(Configuration configuration) {
        if (this.f26680e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f26679d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f26679d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public int c() {
        return this.f26676a;
    }

    protected void f(Resources.Theme theme, int i10, boolean z10) {
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
        if (this.f26678c == null) {
            this.f26678c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f26678c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f26677b;
        if (theme != null) {
            return theme;
        }
        if (this.f26676a == 0) {
            this.f26676a = AbstractC5935i.f48084c;
        }
        d();
        return this.f26677b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i10) {
        if (this.f26676a != i10) {
            this.f26676a = i10;
            d();
        }
    }

    public d(Context context, Resources.Theme theme) {
        super(context);
        this.f26677b = theme;
    }
}

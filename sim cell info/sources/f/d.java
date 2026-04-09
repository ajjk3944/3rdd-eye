package f;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;

/* loaded from: classes.dex */
public class d extends ContextWrapper {

    /* renamed from: a, reason: collision with root package name */
    private int f2553a;

    /* renamed from: b, reason: collision with root package name */
    private Resources.Theme f2554b;

    /* renamed from: c, reason: collision with root package name */
    private LayoutInflater f2555c;

    /* renamed from: d, reason: collision with root package name */
    private Configuration f2556d;

    /* renamed from: e, reason: collision with root package name */
    private Resources f2557e;

    public d() {
        super(null);
    }

    public d(Context context, int i2) {
        super(context);
        this.f2553a = i2;
    }

    public d(Context context, Resources.Theme theme) {
        super(context);
        this.f2554b = theme;
    }

    private Resources a() {
        Resources resources;
        if (this.f2557e == null) {
            Configuration configuration = this.f2556d;
            if (configuration == null) {
                resources = super.getResources();
            } else if (Build.VERSION.SDK_INT >= 17) {
                resources = createConfigurationContext(configuration).getResources();
            }
            this.f2557e = resources;
        }
        return this.f2557e;
    }

    private void c() {
        boolean z2 = this.f2554b == null;
        if (z2) {
            this.f2554b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f2554b.setTo(theme);
            }
        }
        d(this.f2554b, this.f2553a, z2);
    }

    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public int b() {
        return this.f2553a;
    }

    protected void d(Resources.Theme theme, int i2, boolean z2) {
        theme.applyStyle(i2, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return a();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f2555c == null) {
            this.f2555c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f2555c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f2554b;
        if (theme != null) {
            return theme;
        }
        if (this.f2553a == 0) {
            this.f2553a = a.i.f132c;
        }
        c();
        return this.f2554b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i2) {
        if (this.f2553a != i2) {
            this.f2553a = i2;
            c();
        }
    }
}

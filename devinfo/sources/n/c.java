package n;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import com.liuzh.deviceinfo.R;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class c extends ContextWrapper {

    /* renamed from: f, reason: collision with root package name */
    public static Configuration f29441f;

    /* renamed from: a, reason: collision with root package name */
    public int f29442a;

    /* renamed from: b, reason: collision with root package name */
    public Resources.Theme f29443b;

    /* renamed from: c, reason: collision with root package name */
    public LayoutInflater f29444c;

    /* renamed from: d, reason: collision with root package name */
    public Configuration f29445d;

    /* renamed from: e, reason: collision with root package name */
    public Resources f29446e;

    public c(Context context, int i4) {
        super(context);
        this.f29442a = i4;
    }

    public final void a(Configuration configuration) {
        if (this.f29446e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f29445d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f29445d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final void b() {
        if (this.f29443b == null) {
            this.f29443b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f29443b.setTo(theme);
            }
        }
        this.f29443b.applyStyle(this.f29442a, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    @Override // android.content.ContextWrapper, android.content.Context
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.content.res.Resources getResources() {
        /*
            r3 = this;
            android.content.res.Resources r0 = r3.f29446e
            if (r0 != 0) goto L38
            android.content.res.Configuration r0 = r3.f29445d
            if (r0 == 0) goto L32
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            if (r1 < r2) goto L25
            android.content.res.Configuration r1 = n.c.f29441f
            if (r1 != 0) goto L1c
            android.content.res.Configuration r1 = new android.content.res.Configuration
            r1.<init>()
            r2 = 0
            r1.fontScale = r2
            n.c.f29441f = r1
        L1c:
            android.content.res.Configuration r1 = n.c.f29441f
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L25
            goto L32
        L25:
            android.content.res.Configuration r0 = r3.f29445d
            android.content.Context r0 = r3.createConfigurationContext(r0)
            android.content.res.Resources r0 = r0.getResources()
            r3.f29446e = r0
            goto L38
        L32:
            android.content.res.Resources r0 = super.getResources()
            r3.f29446e = r0
        L38:
            android.content.res.Resources r0 = r3.f29446e
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n.c.getResources():android.content.res.Resources");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f29444c == null) {
            this.f29444c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f29444c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f29443b;
        if (theme != null) {
            return theme;
        }
        if (this.f29442a == 0) {
            this.f29442a = R.style.Theme_AppCompat_Light;
        }
        b();
        return this.f29443b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i4) {
        if (this.f29442a != i4) {
            this.f29442a = i4;
            b();
        }
    }
}

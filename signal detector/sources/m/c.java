package m;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import com.apm.insight.R;

/* loaded from: classes.dex */
public final class c extends ContextWrapper {

    /* renamed from: f, reason: collision with root package name */
    public static Configuration f21867f;

    /* renamed from: a, reason: collision with root package name */
    public int f21868a;

    /* renamed from: b, reason: collision with root package name */
    public Resources.Theme f21869b;

    /* renamed from: c, reason: collision with root package name */
    public LayoutInflater f21870c;

    /* renamed from: d, reason: collision with root package name */
    public Configuration f21871d;

    /* renamed from: e, reason: collision with root package name */
    public Resources f21872e;

    public c(Context context, int i) {
        super(context);
        this.f21868a = i;
    }

    public final void a(Configuration configuration) {
        if (this.f21872e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f21871d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f21871d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final void b() {
        if (this.f21869b == null) {
            this.f21869b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f21869b.setTo(theme);
            }
        }
        this.f21869b.applyStyle(this.f21868a, true);
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
            android.content.res.Resources r0 = r3.f21872e
            if (r0 != 0) goto L38
            android.content.res.Configuration r0 = r3.f21871d
            if (r0 == 0) goto L32
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            if (r1 < r2) goto L25
            android.content.res.Configuration r1 = m.c.f21867f
            if (r1 != 0) goto L1c
            android.content.res.Configuration r1 = new android.content.res.Configuration
            r1.<init>()
            r2 = 0
            r1.fontScale = r2
            m.c.f21867f = r1
        L1c:
            android.content.res.Configuration r1 = m.c.f21867f
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L25
            goto L32
        L25:
            android.content.res.Configuration r0 = r3.f21871d
            android.content.Context r0 = r3.createConfigurationContext(r0)
            android.content.res.Resources r0 = r0.getResources()
            r3.f21872e = r0
            goto L38
        L32:
            android.content.res.Resources r0 = super.getResources()
            r3.f21872e = r0
        L38:
            android.content.res.Resources r0 = r3.f21872e
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m.c.getResources():android.content.res.Resources");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f21870c == null) {
            this.f21870c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f21870c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f21869b;
        if (theme != null) {
            return theme;
        }
        if (this.f21868a == 0) {
            this.f21868a = R.style.Theme_AppCompat_Light;
        }
        b();
        return this.f21869b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        if (this.f21868a != i) {
            this.f21868a = i;
            b();
        }
    }
}

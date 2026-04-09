package m;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;

/* compiled from: ContextThemeWrapper.java */
/* renamed from: m.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5306c extends ContextWrapper {

    /* renamed from: f, reason: collision with root package name */
    public static Configuration f43930f;

    /* renamed from: a, reason: collision with root package name */
    public int f43931a;

    /* renamed from: b, reason: collision with root package name */
    public Resources.Theme f43932b;

    /* renamed from: c, reason: collision with root package name */
    public LayoutInflater f43933c;

    /* renamed from: d, reason: collision with root package name */
    public Configuration f43934d;

    /* renamed from: e, reason: collision with root package name */
    public Resources f43935e;

    public C5306c() {
        super(null);
    }

    public final void a(Configuration configuration) {
        if (this.f43935e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f43934d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f43934d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final void b() {
        if (this.f43932b == null) {
            this.f43932b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f43932b.setTo(theme);
            }
        }
        this.f43932b.applyStyle(this.f43931a, true);
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
    public android.content.res.Resources getResources() {
        /*
            r3 = this;
            android.content.res.Resources r0 = r3.f43935e
            if (r0 != 0) goto L38
            android.content.res.Configuration r0 = r3.f43934d
            if (r0 == 0) goto L32
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            if (r1 < r2) goto L25
            android.content.res.Configuration r1 = m.C5306c.f43930f
            if (r1 != 0) goto L1c
            android.content.res.Configuration r1 = new android.content.res.Configuration
            r1.<init>()
            r2 = 0
            r1.fontScale = r2
            m.C5306c.f43930f = r1
        L1c:
            android.content.res.Configuration r1 = m.C5306c.f43930f
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L25
            goto L32
        L25:
            android.content.res.Configuration r0 = r3.f43934d
            android.content.Context r0 = r3.createConfigurationContext(r0)
            android.content.res.Resources r0 = r0.getResources()
            r3.f43935e = r0
            goto L38
        L32:
            android.content.res.Resources r0 = super.getResources()
            r3.f43935e = r0
        L38:
            android.content.res.Resources r0 = r3.f43935e
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m.C5306c.getResources():android.content.res.Resources");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f43933c == null) {
            this.f43933c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f43933c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f43932b;
        if (theme != null) {
            return theme;
        }
        if (this.f43931a == 0) {
            this.f43931a = 2132017798;
        }
        b();
        return this.f43932b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        if (this.f43931a != i) {
            this.f43931a = i;
            b();
        }
    }

    public C5306c(Context context, int i) {
        super(context);
        this.f43931a = i;
    }
}

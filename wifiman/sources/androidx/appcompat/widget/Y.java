package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class Y extends ContextWrapper {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f27304c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private static ArrayList f27305d;

    /* renamed from: a, reason: collision with root package name */
    private final Resources f27306a;

    /* renamed from: b, reason: collision with root package name */
    private final Resources.Theme f27307b;

    private Y(Context context) {
        super(context);
        if (!h0.c()) {
            this.f27306a = new a0(this, context.getResources());
            this.f27307b = null;
            return;
        }
        h0 h0Var = new h0(this, context.getResources());
        this.f27306a = h0Var;
        Resources.Theme themeNewTheme = h0Var.newTheme();
        this.f27307b = themeNewTheme;
        themeNewTheme.setTo(context.getTheme());
    }

    private static boolean a(Context context) {
        if ((context instanceof Y) || (context.getResources() instanceof a0) || (context.getResources() instanceof h0)) {
            return false;
        }
        return h0.c();
    }

    public static Context b(Context context) {
        if (!a(context)) {
            return context;
        }
        synchronized (f27304c) {
            try {
                ArrayList arrayList = f27305d;
                if (arrayList == null) {
                    f27305d = new ArrayList();
                } else {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        WeakReference weakReference = (WeakReference) f27305d.get(size);
                        if (weakReference == null || weakReference.get() == null) {
                            f27305d.remove(size);
                        }
                    }
                    for (int size2 = f27305d.size() - 1; size2 >= 0; size2--) {
                        WeakReference weakReference2 = (WeakReference) f27305d.get(size2);
                        Y y10 = weakReference2 != null ? (Y) weakReference2.get() : null;
                        if (y10 != null && y10.getBaseContext() == context) {
                            return y10;
                        }
                    }
                }
                Y y11 = new Y(context);
                f27305d.add(new WeakReference(y11));
                return y11;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return this.f27306a.getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return this.f27306a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f27307b;
        return theme == null ? super.getTheme() : theme;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i10) {
        Resources.Theme theme = this.f27307b;
        if (theme == null) {
            super.setTheme(i10);
        } else {
            theme.applyStyle(i10, true);
        }
    }
}

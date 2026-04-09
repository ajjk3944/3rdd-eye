package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class w0 extends ContextWrapper {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f1376c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static ArrayList f1377d;

    /* renamed from: a, reason: collision with root package name */
    public final Resources f1378a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources.Theme f1379b;

    public w0(Context context) {
        super(context);
        if (!j1.c()) {
            this.f1378a = new y0(this, context.getResources());
            this.f1379b = null;
            return;
        }
        j1 j1Var = new j1(this, context.getResources());
        this.f1378a = j1Var;
        Resources.Theme themeNewTheme = j1Var.newTheme();
        this.f1379b = themeNewTheme;
        themeNewTheme.setTo(context.getTheme());
    }

    public static boolean a(Context context) {
        return ((context instanceof w0) || (context.getResources() instanceof y0) || (context.getResources() instanceof j1) || !j1.c()) ? false : true;
    }

    public static Context b(Context context) {
        if (!a(context)) {
            return context;
        }
        synchronized (f1376c) {
            try {
                ArrayList arrayList = f1377d;
                if (arrayList == null) {
                    f1377d = new ArrayList();
                } else {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        WeakReference weakReference = (WeakReference) f1377d.get(size);
                        if (weakReference == null || weakReference.get() == null) {
                            f1377d.remove(size);
                        }
                    }
                    for (int size2 = f1377d.size() - 1; size2 >= 0; size2--) {
                        WeakReference weakReference2 = (WeakReference) f1377d.get(size2);
                        w0 w0Var = weakReference2 != null ? (w0) weakReference2.get() : null;
                        if (w0Var != null && w0Var.getBaseContext() == context) {
                            return w0Var;
                        }
                    }
                }
                w0 w0Var2 = new w0(context);
                f1377d.add(new WeakReference(w0Var2));
                return w0Var2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return this.f1378a.getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return this.f1378a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f1379b;
        return theme == null ? super.getTheme() : theme;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i10) {
        Resources.Theme theme = this.f1379b;
        if (theme == null) {
            super.setTheme(i10);
        } else {
            theme.applyStyle(i10, true);
        }
    }
}

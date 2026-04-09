package ub;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.util.SparseArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.internal.ads.kf;
import j1.f;
import j1.l;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import yj.h;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static Context f35283a;

    /* renamed from: b, reason: collision with root package name */
    public static Boolean f35284b;

    public static final f a(boolean z3) {
        if (Build.VERSION.SDK_INT >= 26) {
            return new f(AutofillValue.forToggle(z3));
        }
        return null;
    }

    public static Icon b(Bitmap bitmap) {
        return Icon.createWithAdaptiveBitmap(bitmap);
    }

    public static void c(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        int i4 = configuration.colorMode & 3;
        int i10 = configuration2.colorMode & 3;
        if (i4 != i10) {
            configuration3.colorMode |= i10;
        }
        int i11 = configuration.colorMode & 12;
        int i12 = configuration2.colorMode & 12;
        if (i11 != i12) {
            configuration3.colorMode |= i12;
        }
    }

    public static AutofillId d(View view) {
        return view.getAutofillId();
    }

    public static PackageInfo e() {
        return WebView.getCurrentWebViewPackage();
    }

    public static float f(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHorizontalScrollFactor();
    }

    public static float g(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledVerticalScrollFactor();
    }

    public static long h(Animator animator) {
        return animator.getTotalDuration();
    }

    public static WebViewClient i(WebView webView) {
        return webView.getWebViewClient();
    }

    public static synchronized boolean j(Context context) {
        Boolean bool;
        Context applicationContext = context.getApplicationContext();
        Context context2 = f35283a;
        if (context2 != null && (bool = f35284b) != null && context2 == applicationContext) {
            return bool.booleanValue();
        }
        f35284b = null;
        if (tb.b.g()) {
            f35284b = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
        } else {
            try {
                context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                f35284b = Boolean.TRUE;
            } catch (ClassNotFoundException unused) {
                f35284b = Boolean.FALSE;
            }
        }
        f35283a = applicationContext;
        return f35284b.booleanValue();
    }

    public static boolean k(File file, File file2) throws IOException {
        try {
            Files.move(file.toPath(), file2.toPath(), StandardCopyOption.REPLACE_EXISTING);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public static final void l(j1.a aVar, SparseArray sparseArray) {
        if (aVar.f27036b.f27052a.isEmpty()) {
            return;
        }
        int size = sparseArray.size();
        for (int i4 = 0; i4 < size; i4++) {
            int iKeyAt = sparseArray.keyAt(i4);
            AutofillValue autofillValueG = f4.b.g(sparseArray.get(iKeyAt));
            if (autofillValueG.isText()) {
                l lVar = aVar.f27036b;
                autofillValueG.getTextValue().toString();
                if (lVar.f27052a.get(Integer.valueOf(iKeyAt)) != null) {
                    throw new ClassCastException();
                }
            } else {
                if (autofillValueG.isDate()) {
                    throw new h("An operation is not implemented: b/138604541: Add onFill() callback for date");
                }
                if (autofillValueG.isList()) {
                    throw new h("An operation is not implemented: b/138604541: Add onFill() callback for list");
                }
                if (autofillValueG.isToggle()) {
                    throw new h("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                }
            }
        }
    }

    public static Intent m(Context context, kf kfVar, IntentFilter intentFilter) {
        return context.registerReceiver(kfVar, intentFilter, null, null, 0);
    }

    public static Intent n(Context context, kf kfVar, IntentFilter intentFilter) {
        return context.registerReceiver(kfVar, intentFilter, null, null, 2);
    }

    public static void o(MenuItem menuItem, char c9, int i4) {
        menuItem.setAlphabeticShortcut(c9, i4);
    }

    public static void p(MenuItem menuItem, CharSequence charSequence) {
        menuItem.setContentDescription(charSequence);
    }

    public static void q(Animator animator, long j) {
        ((AnimatorSet) animator).setCurrentPlayTime(j);
    }

    public static void r(MenuItem menuItem, ColorStateList colorStateList) {
        menuItem.setIconTintList(colorStateList);
    }

    public static void s(MenuItem menuItem, PorterDuff.Mode mode) {
        menuItem.setIconTintMode(mode);
    }

    public static void t(MenuItem menuItem, char c9, int i4) {
        menuItem.setNumericShortcut(c9, i4);
    }

    public static void u(MenuItem menuItem, CharSequence charSequence) {
        menuItem.setTooltipText(charSequence);
    }

    public static void v(Context context, Intent intent) {
        context.startForegroundService(intent);
    }
}

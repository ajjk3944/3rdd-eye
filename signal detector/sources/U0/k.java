package U0;

import android.content.pm.PackageInfo;
import android.os.Build;
import android.webkit.WebView;
import java.lang.reflect.InvocationTargetException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class k extends c {

    /* renamed from: d, reason: collision with root package name */
    public final Pattern f3678d;

    public k() {
        super("ALGORITHMIC_DARKENING", "ALGORITHMIC_DARKENING");
        this.f3678d = Pattern.compile("\\A\\d+");
    }

    @Override // U0.c
    public final boolean a() {
        return Build.VERSION.SDK_INT >= 33;
    }

    @Override // U0.c
    public final boolean b() {
        int i;
        PackageInfo packageInfoB;
        boolean zB = super.b();
        if (!zB || (i = Build.VERSION.SDK_INT) >= 29) {
            return zB;
        }
        int i3 = T0.f.f3557a;
        if (i >= 26) {
            packageInfoB = WebView.getCurrentWebViewPackage();
        } else {
            try {
                packageInfoB = T0.f.b();
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                packageInfoB = null;
            }
        }
        if (packageInfoB == null) {
            return false;
        }
        Matcher matcher = this.f3678d.matcher(packageInfoB.versionName);
        return matcher.find() && Integer.parseInt(packageInfoB.versionName.substring(matcher.start(), matcher.end())) >= 105;
    }
}

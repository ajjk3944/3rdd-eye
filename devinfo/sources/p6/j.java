package p6;

import android.content.pm.PackageInfo;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class j extends c {

    /* renamed from: d, reason: collision with root package name */
    public final Pattern f31386d;

    public j() {
        super("ALGORITHMIC_DARKENING", "ALGORITHMIC_DARKENING");
        this.f31386d = Pattern.compile("\\A\\d+");
    }

    @Override // p6.c
    public final boolean a() {
        return Build.VERSION.SDK_INT >= 33;
    }

    @Override // p6.c
    public final boolean b() {
        int i4;
        PackageInfo packageInfoB;
        boolean zB = super.b();
        if (!zB || (i4 = Build.VERSION.SDK_INT) >= 29) {
            return zB;
        }
        int i10 = o6.f.f30411a;
        if (i4 >= 26) {
            packageInfoB = ub.a.e();
        } else {
            try {
                packageInfoB = o6.f.b();
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                packageInfoB = null;
            }
        }
        if (packageInfoB == null) {
            return false;
        }
        Matcher matcher = this.f31386d.matcher(packageInfoB.versionName);
        return matcher.find() && Integer.parseInt(packageInfoB.versionName.substring(matcher.start(), matcher.end())) >= 105;
    }
}

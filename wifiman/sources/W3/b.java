package w3;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Binder;
import android.os.Process;
import com.google.android.gms.common.util.k;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    protected final Context f64364a;

    public b(Context context) {
        this.f64364a = context;
    }

    public int a(String str) {
        return this.f64364a.checkCallingOrSelfPermission(str);
    }

    public ApplicationInfo b(String str, int i10) {
        return this.f64364a.getPackageManager().getApplicationInfo(str, i10);
    }

    public CharSequence c(String str) {
        Context context = this.f64364a;
        return context.getPackageManager().getApplicationLabel(context.getPackageManager().getApplicationInfo(str, 0));
    }

    public PackageInfo d(String str, int i10) {
        return this.f64364a.getPackageManager().getPackageInfo(str, i10);
    }

    public boolean e() {
        String nameForUid;
        if (Binder.getCallingUid() == Process.myUid()) {
            return AbstractC8255a.a(this.f64364a);
        }
        if (!k.d() || (nameForUid = this.f64364a.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        return this.f64364a.getPackageManager().isInstantApp(nameForUid);
    }

    public final boolean f(int i10, String str) {
        try {
            AppOpsManager appOpsManager = (AppOpsManager) this.f64364a.getSystemService("appops");
            if (appOpsManager == null) {
                throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            }
            appOpsManager.checkPackage(i10, str);
            return true;
        } catch (SecurityException unused) {
            return false;
        }
    }
}

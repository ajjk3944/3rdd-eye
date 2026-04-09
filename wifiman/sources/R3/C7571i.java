package r3;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Log;
import s3.AbstractC7901p;

/* renamed from: r3.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C7571i {

    /* renamed from: c, reason: collision with root package name */
    private static C7571i f60093c;

    /* renamed from: a, reason: collision with root package name */
    private final Context f60094a;

    /* renamed from: b, reason: collision with root package name */
    private volatile String f60095b;

    public C7571i(Context context) {
        this.f60094a = context.getApplicationContext();
    }

    public static C7571i a(Context context) {
        AbstractC7901p.l(context);
        synchronized (C7571i.class) {
            try {
                if (f60093c == null) {
                    y.d(context);
                    f60093c = new C7571i(context);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f60093c;
    }

    static final u d(PackageInfo packageInfo, u... uVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            v vVar = new v(packageInfo.signatures[0].toByteArray());
            for (int i10 = 0; i10 < uVarArr.length; i10++) {
                if (uVarArr[i10].equals(vVar)) {
                    return uVarArr[i10];
                }
            }
        }
        return null;
    }

    public static final boolean e(PackageInfo packageInfo, boolean z10) {
        PackageInfo packageInfo2;
        if (!z10) {
            packageInfo2 = packageInfo;
        } else if (packageInfo != null) {
            if ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName)) {
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                z10 = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
            }
            packageInfo2 = packageInfo;
        } else {
            packageInfo2 = null;
        }
        if (packageInfo != null && packageInfo2.signatures != null) {
            if ((z10 ? d(packageInfo2, x.f60109a) : d(packageInfo2, x.f60109a[0])) != null) {
                return true;
            }
        }
        return false;
    }

    private final H f(String str, boolean z10, boolean z11) throws PackageManager.NameNotFoundException {
        H hC;
        ApplicationInfo applicationInfo;
        if (str == null) {
            return H.c("null pkg");
        }
        if (str.equals(this.f60095b)) {
            return H.b();
        }
        if (y.e()) {
            hC = y.b(str, AbstractC7570h.f(this.f60094a), false, false);
        } else {
            try {
                PackageInfo packageInfo = this.f60094a.getPackageManager().getPackageInfo(str, 64);
                boolean zF = AbstractC7570h.f(this.f60094a);
                if (packageInfo == null) {
                    hC = H.c("null pkg");
                } else {
                    Signature[] signatureArr = packageInfo.signatures;
                    if (signatureArr == null || signatureArr.length != 1) {
                        hC = H.c("single cert required");
                    } else {
                        v vVar = new v(packageInfo.signatures[0].toByteArray());
                        String str2 = packageInfo.packageName;
                        H hA = y.a(str2, vVar, zF, false);
                        hC = (!hA.f60064a || (applicationInfo = packageInfo.applicationInfo) == null || (applicationInfo.flags & 2) == 0 || !y.a(str2, vVar, false, true).f60064a) ? hA : H.c("debuggable release cert app rejected");
                    }
                }
            } catch (PackageManager.NameNotFoundException e10) {
                return H.d("no pkg ".concat(str), e10);
            }
        }
        if (hC.f60064a) {
            this.f60095b = str;
        }
        return hC;
    }

    public boolean b(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (e(packageInfo, false)) {
            return true;
        }
        if (e(packageInfo, true)) {
            if (AbstractC7570h.f(this.f60094a)) {
                return true;
            }
            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        }
        return false;
    }

    public boolean c(int i10) throws PackageManager.NameNotFoundException {
        H hC;
        int length;
        String[] packagesForUid = this.f60094a.getPackageManager().getPackagesForUid(i10);
        if (packagesForUid != null && (length = packagesForUid.length) != 0) {
            hC = null;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    AbstractC7901p.l(hC);
                    break;
                }
                hC = f(packagesForUid[i11], false, false);
                if (hC.f60064a) {
                    break;
                }
                i11++;
            }
        } else {
            hC = H.c("no pkgs");
        }
        hC.e();
        return hC.f60064a;
    }
}

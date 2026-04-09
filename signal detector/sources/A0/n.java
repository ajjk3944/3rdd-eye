package A0;

import G3.C0152f;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.File;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final w.l f91a = new w.l();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f92b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static C0152f f93c = null;

    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? l.a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static C0152f b() {
        C0152f c0152f = new C0152f(5);
        f93c = c0152f;
        f91a.j(c0152f);
        return f93c;
    }

    public static void c(Context context, boolean z6) {
        m mVarA;
        int i;
        if (z6 || f93c == null) {
            synchronized (f92b) {
                if (!z6) {
                    try {
                        if (f93c != null) {
                            return;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= 28 && i3 != 30) {
                    File file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                    long length = file.length();
                    int i6 = 0;
                    boolean z7 = file.exists() && length > 0;
                    File file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                    long length2 = file2.length();
                    boolean z8 = file2.exists() && length2 > 0;
                    try {
                        long jA = a(context);
                        File file3 = new File(context.getFilesDir(), "profileInstalled");
                        if (file3.exists()) {
                            try {
                                mVarA = m.a(file3);
                            } catch (IOException unused) {
                                b();
                                return;
                            }
                        } else {
                            mVarA = null;
                        }
                        if (mVarA != null && mVarA.f89c == jA && (i = mVarA.f88b) != 2) {
                            i6 = i;
                        } else if (z7) {
                            i6 = 1;
                        } else if (z8) {
                            i6 = 2;
                        }
                        if (z6 && z8 && i6 != 1) {
                            i6 = 2;
                        }
                        if (mVarA != null && mVarA.f88b == 2 && i6 == 1 && length < mVarA.f90d) {
                            i6 = 3;
                        }
                        m mVar = new m(1, i6, jA, length2);
                        if (mVarA == null || !mVarA.equals(mVar)) {
                            try {
                                mVar.b(file3);
                            } catch (IOException unused2) {
                            }
                        }
                        b();
                        return;
                    } catch (PackageManager.NameNotFoundException unused3) {
                        b();
                        return;
                    }
                }
                b();
            }
        }
    }
}

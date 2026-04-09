package J2;

import M2.u;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import f0.ThreadFactoryC2316a;
import java.io.InputStream;
import java.util.Locale;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import r1.C2872b;
import r1.r;
import r1.s;
import r1.x;

/* loaded from: classes.dex */
public final class i implements f0.i, s, r1.f {

    /* renamed from: c, reason: collision with root package name */
    public static i f2063c;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2064a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f2065b;

    public /* synthetic */ i(Context context, int i, boolean z6) {
        this.f2064a = i;
        this.f2065b = context;
    }

    public static void g(Context context) {
        u.e(context);
        synchronized (i.class) {
            try {
                if (f2063c == null) {
                    p.a(context);
                    f2063c = new i(context, 0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x00f7, code lost:
    
        r6 = r10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean j(android.content.pm.PackageInfo r13) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: J2.i.j(android.content.pm.PackageInfo):boolean");
    }

    public static String k(Locale locale) {
        return String.valueOf(locale.getLanguage()).concat(locale.getCountry().isEmpty() ? "" : "_".concat(String.valueOf(locale.getCountry())));
    }

    public static m l(PackageInfo packageInfo, m... mVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            n nVar = new n(packageInfo.signatures[0].toByteArray());
            for (int i = 0; i < mVarArr.length; i++) {
                if (mVarArr[i].equals(nVar)) {
                    return mVarArr[i];
                }
            }
        }
        return null;
    }

    @Override // r1.f
    public Class a() {
        return Drawable.class;
    }

    @Override // f0.i
    public void b(T2.g gVar) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC2316a("EmojiCompatInitializer"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new f0.l(this, gVar, threadPoolExecutor, 0));
    }

    @Override // r1.f
    public Object c(int i, Resources.Theme theme, Resources resources) {
        Context context = this.f2065b;
        return T2.g.p(context, context, i, theme);
    }

    @Override // r1.s
    public r d(x xVar) {
        switch (this.f2064a) {
            case 5:
                return new C2872b(this.f2065b, this);
            case 6:
                return new C2872b(this.f2065b, xVar.c(Integer.class, InputStream.class));
            default:
                return new r1.n(this.f2065b, 1);
        }
    }

    @Override // r1.f
    public /* bridge */ /* synthetic */ void e(Object obj) {
    }

    public ApplicationInfo f(int i, String str) {
        return this.f2065b.getPackageManager().getApplicationInfo(str, i);
    }

    public PackageInfo h(int i, String str) {
        return this.f2065b.getPackageManager().getPackageInfo(str, i);
    }

    public boolean i() {
        String nameForUid;
        int callingUid = Binder.getCallingUid();
        int iMyUid = Process.myUid();
        Context context = this.f2065b;
        if (callingUid == iMyUid) {
            return R2.a.v(context);
        }
        if (!Q2.b.e() || (nameForUid = context.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        return context.getPackageManager().isInstantApp(nameForUid);
    }

    public i(Context context, int i) {
        this.f2064a = i;
        switch (i) {
            case 4:
                this.f2065b = context.getApplicationContext();
                break;
            default:
                this.f2065b = context.getApplicationContext();
                break;
        }
    }
}

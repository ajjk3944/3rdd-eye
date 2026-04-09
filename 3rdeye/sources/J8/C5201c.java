package j8;

import A9.C0575f;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Process;
import androidx.fragment.app.ActivityC1762o;
import b9.C1992A;
import b9.m;
import b9.n;
import com.zipoapps.premiumhelper.e;
import java.util.List;
import kotlin.jvm.internal.l;

/* compiled from: ExternalUtilsImpl.kt */
/* renamed from: j8.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5201c implements InterfaceC5199a {
    @Override // j8.InterfaceC5199a
    public final long a(Context context) {
        l.f(context, "context");
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).firstInstallTime;
        } catch (Throwable unused) {
            return System.currentTimeMillis();
        }
    }

    @Override // j8.InterfaceC5199a
    public final String b(Context context) {
        l.f(context, "context");
        try {
            String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            return str == null ? "unknown" : str;
        } catch (PackageManager.NameNotFoundException e4) {
            va.a.f47104a.d(e4);
            return "NameNotFound";
        }
    }

    public final String c(Context context) {
        l.f(context, "context");
        try {
            if (context.getApplicationInfo().labelRes == 0) {
                return context.getApplicationInfo().nonLocalizedLabel.toString();
            }
            String string = context.getString(context.getApplicationInfo().labelRes);
            l.c(string);
            return string;
        } catch (Exception unused) {
            return "";
        }
    }

    public final int d(ContextWrapper context) {
        l.f(context, "context");
        return (int) ((System.currentTimeMillis() - a(context)) / com.vungle.ads.internal.signals.b.TWENTY_FOUR_HOURS_MILLIS);
    }

    public final String e(Application application) {
        try {
            int iMyPid = Process.myPid();
            Object systemService = application.getSystemService("activity");
            l.d(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
            if (runningAppProcesses != null) {
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (runningAppProcessInfo.pid == iMyPid) {
                        return runningAppProcessInfo.processName;
                    }
                }
            }
            C1992A c1992a = C1992A.f18074a;
            return null;
        } catch (Throwable th) {
            n.a(th);
            return null;
        }
    }

    public final boolean f(Application application) {
        String strE = e(application);
        return strE == null || strE.length() == 0 || strE.equals(application.getPackageName());
    }

    public final void g(ActivityC1762o activityC1762o, boolean z10) {
        C0575f.e(A2.l.y(activityC1762o), null, null, new C5200b(z10, this, activityC1762o, null), 3);
    }

    public final void h(Activity activity, String str) {
        Object objA;
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
            activity.startActivity(intent);
            e.f37006D.getClass();
            e.a.a().f();
            objA = C1992A.f18074a;
        } catch (Throwable th) {
            objA = n.a(th);
        }
        Throwable thA = m.a(objA);
        if (thA != null) {
            va.a.f47104a.d(thA);
        }
    }
}

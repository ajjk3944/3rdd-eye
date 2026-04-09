package q;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public class a extends r.a {

    /* renamed from: c, reason: collision with root package name */
    private static c f3148c;

    /* renamed from: q.a$a, reason: collision with other inner class name */
    class RunnableC0034a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String[] f3149b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Activity f3150c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f3151d;

        RunnableC0034a(String[] strArr, Activity activity, int i2) {
            this.f3149b = strArr;
            this.f3150c = activity;
            this.f3151d = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            int[] iArr = new int[this.f3149b.length];
            PackageManager packageManager = this.f3150c.getPackageManager();
            String packageName = this.f3150c.getPackageName();
            int length = this.f3149b.length;
            for (int i2 = 0; i2 < length; i2++) {
                iArr[i2] = packageManager.checkPermission(this.f3149b[i2], packageName);
            }
            ((b) this.f3150c).onRequestPermissionsResult(this.f3151d, this.f3149b, iArr);
        }
    }

    public interface b {
        void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr);
    }

    public interface c {
        boolean a(Activity activity, String[] strArr, int i2);

        boolean b(Activity activity, int i2, int i3, Intent intent);
    }

    public interface d {
        void b(int i2);
    }

    public static void e(Activity activity) {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.finishAffinity();
        } else {
            activity.finish();
        }
    }

    public static c f() {
        return f3148c;
    }

    public static void g(Activity activity) {
        if (Build.VERSION.SDK_INT < 28 && q.b.i(activity)) {
            return;
        }
        activity.recreate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void h(Activity activity, String[] strArr, int i2) {
        c cVar = f3148c;
        if (cVar == null || !cVar.a(activity, strArr, i2)) {
            if (Build.VERSION.SDK_INT >= 23) {
                if (activity instanceof d) {
                    ((d) activity).b(i2);
                }
                activity.requestPermissions(strArr, i2);
            } else if (activity instanceof b) {
                new Handler(Looper.getMainLooper()).post(new RunnableC0034a(strArr, activity, i2));
            }
        }
    }
}

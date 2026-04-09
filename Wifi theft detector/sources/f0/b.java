package f0;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashSet;

/* loaded from: classes.dex */
public abstract class b extends ContextCompat {

    public static class a {
        @DoNotInline
        public static void a(Object obj) {
            ((SharedElementCallback.OnSharedElementsReadyListener) obj).onSharedElementsReady();
        }

        @DoNotInline
        public static void b(Activity activity, String[] strArr, int i10) {
            activity.requestPermissions(strArr, i10);
        }

        @DoNotInline
        public static boolean c(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    /* renamed from: f0.b$b, reason: collision with other inner class name */
    public static class C0390b {
        @DoNotInline
        public static boolean a(@NonNull Activity activity) {
            return activity.isLaunchedFromBubble();
        }

        @DoNotInline
        @SuppressLint({"BanUncheckedReflection"})
        public static boolean b(Activity activity, String str) {
            try {
                return ((Boolean) PackageManager.class.getMethod("shouldShowRequestPermissionRationale", String.class).invoke(activity.getApplication().getPackageManager(), str)).booleanValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return activity.shouldShowRequestPermissionRationale(str);
            }
        }
    }

    public static class c {
        @DoNotInline
        public static boolean a(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    public interface d {
        void g(int i10);
    }

    public static /* synthetic */ void a(Activity activity) {
        if (activity.isFinishing() || f0.d.i(activity)) {
            return;
        }
        activity.recreate();
    }

    public static void b(Activity activity) {
        activity.finishAffinity();
    }

    public static void c(final Activity activity) {
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
        } else {
            new Handler(activity.getMainLooper()).post(new Runnable() { // from class: f0.a
                @Override // java.lang.Runnable
                public final void run() {
                    b.a(activity);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void d(Activity activity, String[] strArr, int i10) {
        HashSet hashSet = new HashSet();
        for (int i11 = 0; i11 < strArr.length; i11++) {
            if (TextUtils.isEmpty(strArr[i11])) {
                throw new IllegalArgumentException("Permission request for permissions " + Arrays.toString(strArr) + " must not contain null or empty values");
            }
            if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(strArr[i11], "android.permission.POST_NOTIFICATIONS")) {
                hashSet.add(Integer.valueOf(i11));
            }
        }
        int size = hashSet.size();
        String[] strArr2 = size > 0 ? new String[strArr.length - size] : strArr;
        if (size > 0) {
            if (size == strArr.length) {
                return;
            }
            int i12 = 0;
            for (int i13 = 0; i13 < strArr.length; i13++) {
                if (!hashSet.contains(Integer.valueOf(i13))) {
                    strArr2[i12] = strArr[i13];
                    i12++;
                }
            }
        }
        if (activity instanceof d) {
            ((d) activity).g(i10);
        }
        a.b(activity, strArr, i10);
    }

    public static boolean e(Activity activity, String str) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return i10 >= 32 ? c.a(activity, str) : i10 == 31 ? C0390b.b(activity, str) : a.c(activity, str);
        }
        return false;
    }

    public static void f(Activity activity, Intent intent, int i10, Bundle bundle) {
        activity.startActivityForResult(intent, i10, bundle);
    }

    public static void g(Activity activity, IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) {
        activity.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
    }
}

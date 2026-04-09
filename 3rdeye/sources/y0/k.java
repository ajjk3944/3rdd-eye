package y0;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;

/* compiled from: NavUtils.java */
/* loaded from: classes.dex */
public final class k {
    public static Intent a(AppCompatActivity appCompatActivity) {
        Intent parentActivityIntent = appCompatActivity.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        try {
            String strC = c(appCompatActivity, appCompatActivity.getComponentName());
            if (strC == null) {
                return null;
            }
            ComponentName componentName = new ComponentName(appCompatActivity, strC);
            try {
                return c(appCompatActivity, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + strC + "' in manifest");
                return null;
            }
        } catch (PackageManager.NameNotFoundException e4) {
            throw new IllegalArgumentException(e4);
        }
    }

    public static Intent b(AppCompatActivity appCompatActivity, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String strC = c(appCompatActivity, componentName);
        if (strC == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), strC);
        return c(appCompatActivity, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    public static String c(Activity activity, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String string;
        PackageManager packageManager = activity.getPackageManager();
        int i = Build.VERSION.SDK_INT;
        ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, i >= 29 ? 269222528 : i >= 24 ? 787072 : 640);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return activity.getPackageName() + string;
    }
}

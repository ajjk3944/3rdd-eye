package I2;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Locale;
import x2.AbstractActivityC5757a;
import z0.C5848a;

/* compiled from: Common.java */
/* loaded from: classes.dex */
public final class a {
    public static boolean a(Context context) {
        return Build.VERSION.SDK_INT < 33 || C5848a.checkSelfPermission(context, "android.permission.POST_NOTIFICATIONS") == 0;
    }

    public static boolean b(AbstractActivityC5757a abstractActivityC5757a) {
        int i = Build.VERSION.SDK_INT;
        return i < 33 ? C5848a.checkSelfPermission(abstractActivityC5757a, "android.permission.READ_EXTERNAL_STORAGE") == 0 : i < 33 || C5848a.checkSelfPermission(abstractActivityC5757a, "android.permission.READ_MEDIA_IMAGES") == 0;
    }

    public static void c(AppCompatActivity appCompatActivity) {
        Locale locale = new Locale(appCompatActivity.getSharedPreferences("PRIVATE", 0).getString("LOCALE", "en"));
        Locale.setDefault(locale);
        Configuration configuration = new Configuration();
        configuration.setLocale(locale);
        appCompatActivity.getResources().updateConfiguration(configuration, appCompatActivity.getResources().getDisplayMetrics());
    }
}

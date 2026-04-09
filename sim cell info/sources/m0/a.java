package m0;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.preference.PreferenceManager;
import java.util.Locale;

/* loaded from: classes.dex */
public class a {
    public static void a(Context context, String str) {
        c(context, str);
    }

    private static void b(Context context, String str) {
        SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        editorEdit.putString("Locale.Helper.Selected.Language", str);
        editorEdit.apply();
    }

    public static Context c(Context context, String str) {
        b(context, str);
        return d(context, str);
    }

    private static Context d(Context context, String str) {
        Locale locale = str.equals("zh_CN") ? Locale.SIMPLIFIED_CHINESE : str.equals("zh_TW") ? Locale.TRADITIONAL_CHINESE : new Locale(str);
        Locale.setDefault(locale);
        Resources resources = context.getResources();
        Configuration configuration = new Configuration(resources.getConfiguration());
        if (Build.VERSION.SDK_INT >= 17) {
            configuration.setLocale(locale);
        } else {
            configuration.locale = locale;
        }
        resources.updateConfiguration(configuration, resources.getDisplayMetrics());
        return context;
    }
}

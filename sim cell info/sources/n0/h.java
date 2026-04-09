package n0;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes.dex */
public class h {
    public static int a(SharedPreferences sharedPreferences, Context context) {
        String string = sharedPreferences.getString("theme_list", "4");
        if (string != null && !string.isEmpty()) {
            int iC = i0.b.c(string);
            if (iC == 1) {
                return 1;
            }
            if (iC == 2) {
                return 2;
            }
            if (iC == 3) {
                if ((context.getResources().getConfiguration().uiMode & 48) == 32) {
                    return 2;
                }
            } else if (iC == 4 && (context.getResources().getConfiguration().uiMode & 48) == 32) {
                return 1;
            }
        } else if (sharedPreferences.getBoolean("use_dark_theme", false)) {
            return 1;
        }
        return 0;
    }
}

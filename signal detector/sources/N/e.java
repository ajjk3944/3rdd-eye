package N;

import android.content.Context;
import android.content.res.Configuration;
import android.icu.text.DecimalFormatSymbols;
import android.icu.util.ULocale;
import android.os.LocaleList;
import android.view.PointerIcon;
import com.bytedance.sdk.openadsdk.api.reward.BackupConstant;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class e {
    public static ULocale a(Object obj) {
        return ULocale.addLikelySubtags((ULocale) obj);
    }

    public static LocaleList b(Locale... localeArr) {
        return new LocaleList(localeArr);
    }

    public static ULocale c(Locale locale) {
        return ULocale.forLocale(locale);
    }

    public static LocaleList d() {
        return LocaleList.getAdjustedDefault();
    }

    public static DecimalFormatSymbols e(Locale locale) {
        return DecimalFormatSymbols.getInstance(locale);
    }

    public static LocaleList f(Configuration configuration) {
        return configuration.getLocales();
    }

    public static String g(Object obj) {
        return ((ULocale) obj).getScript();
    }

    public static PointerIcon h(Context context) {
        return PointerIcon.getSystemIcon(context, BackupConstant.SCENE_BACKUP_RENDER_FAIL);
    }
}

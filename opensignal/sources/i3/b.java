package i3;

import android.content.Context;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;

/* loaded from: classes.dex */
public abstract /* synthetic */ class b {
    public static /* synthetic */ ShortcutInfo.Builder b(Context context, String str) {
        return new ShortcutInfo.Builder(context, str);
    }

    public static /* bridge */ /* synthetic */ ShortcutManager f(Object obj) {
        return (ShortcutManager) obj;
    }

    public static /* bridge */ /* synthetic */ Class g() {
        return ShortcutManager.class;
    }

    public static /* synthetic */ void i() {
    }
}

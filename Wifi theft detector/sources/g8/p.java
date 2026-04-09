package g8;

import android.content.Context;
import android.content.Intent;

/* loaded from: classes3.dex */
public abstract class p {
    public static void a(Context context, String str, int i10, Intent intent) {
        Intent intent2 = new Intent("com.android.launcher.action.INSTALL_SHORTCUT");
        intent2.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(context, i10));
        intent2.putExtra("android.intent.extra.shortcut.NAME", str);
        intent2.putExtra("android.intent.extra.shortcut.INTENT", intent);
        intent2.putExtra("duplicate", false);
        context.sendBroadcast(intent2);
    }
}

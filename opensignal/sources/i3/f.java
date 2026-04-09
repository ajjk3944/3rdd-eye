package i3;

import android.content.pm.ShortcutInfo;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class f {
    public static String a(List list) {
        Iterator it = list.iterator();
        int rank = -1;
        String id2 = null;
        while (it.hasNext()) {
            ShortcutInfo shortcutInfo = (ShortcutInfo) it.next();
            if (shortcutInfo.getRank() > rank) {
                id2 = shortcutInfo.getId();
                rank = shortcutInfo.getRank();
            }
        }
        return id2;
    }
}

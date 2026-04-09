package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.Menu;
import android.widget.ImageView;
import android.widget.PopupMenu;
import com.yandex.mobile.ads.impl.ja0;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class sa0 {
    public static PopupMenu a(Context context, ImageView view, List items) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(view, "view");
        kotlin.jvm.internal.l.f(items, "items");
        PopupMenu popupMenu = new PopupMenu(context, view, 5);
        Menu menu = popupMenu.getMenu();
        Iterator it = items.iterator();
        int i = 0;
        while (it.hasNext()) {
            menu.add(0, i, 0, ((ja0.a) it.next()).a());
            i++;
        }
        return popupMenu;
    }
}

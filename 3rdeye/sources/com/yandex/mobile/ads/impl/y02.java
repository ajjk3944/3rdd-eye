package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import com.yandex.mobile.ads.impl.vi0;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* loaded from: classes3.dex */
public final class y02 {

    /* renamed from: a, reason: collision with root package name */
    private final vi0 f35582a;

    /* renamed from: b, reason: collision with root package name */
    private final fj1 f35583b;

    public static final class a implements vi0.b {

        /* renamed from: c, reason: collision with root package name */
        static final /* synthetic */ w9.i<Object>[] f35584c = {fa.a(a.class, "weakContext", "getWeakContext()Landroid/content/Context;", 0), fa.a(a.class, "menuItem", "getMenuItem()Landroid/view/MenuItem;", 0)};

        /* renamed from: a, reason: collision with root package name */
        private final ao1 f35585a;

        /* renamed from: b, reason: collision with root package name */
        private final ao1 f35586b;

        public a(Context context, MenuItem menuItem) {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(menuItem, "menuItem");
            this.f35585a = bo1.a(context);
            this.f35586b = bo1.a(menuItem);
        }

        @Override // com.yandex.mobile.ads.impl.vi0.b
        public final void a(Bitmap bitmap) {
            MenuItem menuItem;
            if (bitmap != null) {
                ao1 ao1Var = this.f35585a;
                w9.i<?>[] iVarArr = f35584c;
                Context context = (Context) ao1Var.getValue(this, iVarArr[0]);
                if (context == null || (menuItem = (MenuItem) this.f35586b.getValue(this, iVarArr[1])) == null) {
                    return;
                }
                menuItem.setIcon(new BitmapDrawable(context.getResources(), bitmap));
            }
        }
    }

    public y02(vi0 imageForPresentProvider, fj1 iconsManager) {
        kotlin.jvm.internal.l.f(imageForPresentProvider, "imageForPresentProvider");
        kotlin.jvm.internal.l.f(iconsManager, "iconsManager");
        this.f35582a = imageForPresentProvider;
        this.f35583b = iconsManager;
    }

    public final PopupMenu a(View view, List<n02> items) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        kotlin.jvm.internal.l.f(view, "view");
        kotlin.jvm.internal.l.f(items, "items");
        PopupMenu popupMenu = new PopupMenu(view.getContext(), view, 5);
        this.f35583b.getClass();
        fj1.a(popupMenu);
        Menu menu = popupMenu.getMenu();
        Context context = view.getContext();
        int size = items.size();
        for (int i = 0; i < size; i++) {
            n02 n02Var = items.get(i);
            kotlin.jvm.internal.l.c(context);
            kotlin.jvm.internal.l.c(menu);
            p02 p02VarC = n02Var.c();
            MenuItem menuItemAdd = menu.add(0, i, i, p02VarC.b());
            kotlin.jvm.internal.l.c(menuItemAdd);
            this.f35582a.a(p02VarC.a(), new a(context, menuItemAdd));
        }
        return popupMenu;
    }
}

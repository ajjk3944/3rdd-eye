package c;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.Window;
import c.C4143L;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;

/* renamed from: c.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4164s {

    /* renamed from: a, reason: collision with root package name */
    private static final int f33583a = Color.argb(230, 255, 255, 255);

    /* renamed from: b, reason: collision with root package name */
    private static final int f33584b = Color.argb(128, 27, 27, 27);

    /* renamed from: c, reason: collision with root package name */
    private static InterfaceC4133B f33585c;

    public static final void a(AbstractActivityC4155j abstractActivityC4155j, C4143L statusBarStyle, C4143L navigationBarStyle) {
        AbstractC6492s.i(abstractActivityC4155j, "<this>");
        AbstractC6492s.i(statusBarStyle, "statusBarStyle");
        AbstractC6492s.i(navigationBarStyle, "navigationBarStyle");
        View decorView = abstractActivityC4155j.getWindow().getDecorView();
        AbstractC6492s.h(decorView, "window.decorView");
        InterfaceC6835l interfaceC6835lA = statusBarStyle.a();
        Resources resources = decorView.getResources();
        AbstractC6492s.h(resources, "view.resources");
        boolean zBooleanValue = ((Boolean) interfaceC6835lA.invoke(resources)).booleanValue();
        InterfaceC6835l interfaceC6835lA2 = navigationBarStyle.a();
        Resources resources2 = decorView.getResources();
        AbstractC6492s.h(resources2, "view.resources");
        boolean zBooleanValue2 = ((Boolean) interfaceC6835lA2.invoke(resources2)).booleanValue();
        InterfaceC4133B c4171z = f33585c;
        if (c4171z == null) {
            int i10 = Build.VERSION.SDK_INT;
            c4171z = i10 >= 30 ? new C4171z() : i10 >= 29 ? new C4170y() : i10 >= 28 ? new C4167v() : new C4165t();
        }
        Window window = abstractActivityC4155j.getWindow();
        AbstractC6492s.h(window, "window");
        c4171z.a(statusBarStyle, navigationBarStyle, window, decorView, zBooleanValue, zBooleanValue2);
        Window window2 = abstractActivityC4155j.getWindow();
        AbstractC6492s.h(window2, "window");
        c4171z.b(window2);
    }

    public static /* synthetic */ void b(AbstractActivityC4155j abstractActivityC4155j, C4143L c4143l, C4143L c4143l2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            c4143l = C4143L.a.b(C4143L.f33516e, 0, 0, null, 4, null);
        }
        if ((i10 & 2) != 0) {
            c4143l2 = C4143L.a.b(C4143L.f33516e, f33583a, f33584b, null, 4, null);
        }
        a(abstractActivityC4155j, c4143l, c4143l2);
    }
}

package c;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.Window;

/* renamed from: c.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0391p {

    /* renamed from: a, reason: collision with root package name */
    public static final int f5870a = Color.argb(230, 255, 255, 255);

    /* renamed from: b, reason: collision with root package name */
    public static final int f5871b = Color.argb(128, 27, 27, 27);

    public static void a(AbstractActivityC0389n abstractActivityC0389n) {
        C0374N c0374n = C0374N.f5814b;
        C0375O c0375o = new C0375O(0, 0, c0374n);
        C0375O c0375o2 = new C0375O(f5870a, f5871b, c0374n);
        q5.i.e(abstractActivityC0389n, "<this>");
        View decorView = abstractActivityC0389n.getWindow().getDecorView();
        q5.i.d(decorView, "window.decorView");
        Resources resources = decorView.getResources();
        q5.i.d(resources, "view.resources");
        boolean zBooleanValue = ((Boolean) c0374n.f(resources)).booleanValue();
        Resources resources2 = decorView.getResources();
        q5.i.d(resources2, "view.resources");
        boolean zBooleanValue2 = ((Boolean) c0374n.f(resources2)).booleanValue();
        int i = Build.VERSION.SDK_INT;
        a4.t uVar = i >= 30 ? new u() : i >= 29 ? new C0395t() : i >= 28 ? new C0394s() : i >= 26 ? new C0393r() : new C0392q();
        Window window = abstractActivityC0389n.getWindow();
        q5.i.d(window, "window");
        uVar.t(c0375o, c0375o2, window, decorView, zBooleanValue, zBooleanValue2);
        Window window2 = abstractActivityC0389n.getWindow();
        q5.i.d(window2, "window");
        uVar.b(window2);
    }
}

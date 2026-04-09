package c;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.AppCompatActivity;
import kotlin.KotlinVersion;

/* compiled from: EdgeToEdge.kt */
/* renamed from: c.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2012j {

    /* renamed from: a, reason: collision with root package name */
    public static final int f18292a = Color.argb(230, KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE);

    /* renamed from: b, reason: collision with root package name */
    public static final int f18293b = Color.argb(128, 27, 27, 27);

    public static void a(AppCompatActivity appCompatActivity, C2027y c2027y, int i) {
        int i10 = i & 1;
        C2026x detectDarkMode = C2026x.f18327g;
        if (i10 != 0) {
            kotlin.jvm.internal.l.f(detectDarkMode, "detectDarkMode");
            c2027y = new C2027y(0, 0, detectDarkMode);
        }
        C2027y c2027y2 = c2027y;
        kotlin.jvm.internal.l.f(detectDarkMode, "detectDarkMode");
        C2027y c2027y3 = new C2027y(f18292a, f18293b, detectDarkMode);
        View decorView = appCompatActivity.getWindow().getDecorView();
        kotlin.jvm.internal.l.e(decorView, "window.decorView");
        Resources resources = decorView.getResources();
        kotlin.jvm.internal.l.e(resources, "view.resources");
        boolean zBooleanValue = c2027y2.f18330c.invoke(resources).booleanValue();
        Resources resources2 = decorView.getResources();
        kotlin.jvm.internal.l.e(resources2, "view.resources");
        boolean zBooleanValue2 = detectDarkMode.invoke(resources2).booleanValue();
        int i11 = Build.VERSION.SDK_INT;
        InterfaceC2018p c2017o = i11 >= 30 ? new C2017o(23) : i11 >= 29 ? new C2016n(23) : i11 >= 28 ? new C2015m(23) : i11 >= 26 ? new C2014l(23) : new C2013k(23);
        Window window = appCompatActivity.getWindow();
        kotlin.jvm.internal.l.e(window, "window");
        c2017o.a(c2027y2, c2027y3, window, decorView, zBooleanValue, zBooleanValue2);
        Window window2 = appCompatActivity.getWindow();
        kotlin.jvm.internal.l.e(window2, "window");
        c2017o.d(window2);
    }
}

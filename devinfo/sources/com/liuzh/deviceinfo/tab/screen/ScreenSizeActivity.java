package com.liuzh.deviceinfo.tab.screen;

import android.graphics.Paint;
import android.graphics.Point;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.liuzh.deviceinfo.DeviceInfoApp;
import com.liuzh.deviceinfo.R;
import com.liuzh.deviceinfo.utilities.d;
import hg.a;
import java.util.Locale;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class ScreenSizeActivity extends a {
    @Override // hg.a, i.g, d.j, r3.g, android.app.Activity
    public final void onCreate(Bundle bundle) {
        float f10;
        super.onCreate(bundle);
        getWindow().getDecorView().setSystemUiVisibility(5894);
        d.g(this);
        vh.a aVar = new vh.a(this);
        Paint paint = new Paint(1);
        aVar.f36237a = paint;
        paint.setColor(-1);
        paint.setStrokeWidth(d.p(2.0f, aVar.getResources().getDisplayMetrics()));
        paint.setTextSize(d.q(13.0f, aVar.getResources().getDisplayMetrics()));
        paint.setFakeBoldText(true);
        aVar.setBackgroundColor(-16777216);
        Point point = new Point();
        WindowManager windowManager = (WindowManager) DeviceInfoApp.f21145f.getSystemService("window");
        if (windowManager != null) {
            windowManager.getDefaultDisplay().getRealSize(point);
        }
        aVar.g = point.x + aVar.getResources().getString(R.string.px);
        aVar.f36243h = point.y + aVar.getResources().getString(R.string.px);
        StringBuilder sb2 = new StringBuilder();
        Locale locale = Locale.US;
        Point point2 = new Point();
        WindowManager windowManager2 = (WindowManager) DeviceInfoApp.f21145f.getSystemService("window");
        float f11 = 0.0f;
        if (windowManager2 != null) {
            Display defaultDisplay = windowManager2.getDefaultDisplay();
            defaultDisplay.getRealSize(point2);
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getRealMetrics(displayMetrics);
            f10 = point2.x / displayMetrics.xdpi;
        } else {
            f10 = 0.0f;
        }
        sb2.append(String.format(locale, "%.1f", Float.valueOf(f10)));
        sb2.append(aVar.getResources().getString(R.string.inches));
        aVar.f36244i = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        Point point3 = new Point();
        WindowManager windowManager3 = (WindowManager) DeviceInfoApp.f21145f.getSystemService("window");
        if (windowManager3 != null) {
            Display defaultDisplay2 = windowManager3.getDefaultDisplay();
            defaultDisplay2.getRealSize(point3);
            DisplayMetrics displayMetrics2 = new DisplayMetrics();
            defaultDisplay2.getRealMetrics(displayMetrics2);
            f11 = point3.y / displayMetrics2.ydpi;
        }
        sb3.append(String.format(locale, "%.1f", Float.valueOf(f11)));
        sb3.append(aVar.getResources().getString(R.string.inches));
        aVar.j = sb3.toString();
        aVar.f36245k = String.format(locale, "%.1f", Float.valueOf(d.i())) + aVar.getResources().getString(R.string.inches);
        setContentView(aVar);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z3) {
        super.onWindowFocusChanged(z3);
        getWindow().getDecorView().setSystemUiVisibility(5894);
        d.g(this);
    }
}

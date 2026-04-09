package d;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static final int f21627a = Color.argb(230, 255, 255, 255);

    /* renamed from: b, reason: collision with root package name */
    public static final int f21628b = Color.argb(128, 27, 27, 27);

    /* renamed from: c, reason: collision with root package name */
    public static com.bumptech.glide.d f21629c;

    public static void a(j jVar) {
        b7.w wVar = new b7.w(5);
        d0 d0Var = new d0(0, 0, wVar);
        b7.w wVar2 = new b7.w(5);
        d0 d0Var2 = new d0(f21627a, f21628b, wVar2);
        nk.k.e(jVar, "<this>");
        View decorView = jVar.getWindow().getDecorView();
        nk.k.d(decorView, "getDecorView(...)");
        Resources resources = decorView.getResources();
        nk.k.d(resources, "getResources(...)");
        boolean zBooleanValue = ((Boolean) wVar.invoke(resources)).booleanValue();
        Resources resources2 = decorView.getResources();
        nk.k.d(resources2, "getResources(...)");
        boolean zBooleanValue2 = ((Boolean) wVar2.invoke(resources2)).booleanValue();
        com.bumptech.glide.d sVar = f21629c;
        if (sVar == null) {
            int i4 = Build.VERSION.SDK_INT;
            sVar = i4 >= 35 ? new s() : i4 >= 30 ? new r() : i4 >= 29 ? new q() : i4 >= 28 ? new p() : i4 >= 26 ? new o() : new n();
            f21629c = sVar;
        }
        com.bumptech.glide.d dVar = sVar;
        Window window = jVar.getWindow();
        nk.k.d(window, "getWindow(...)");
        dVar.z(d0Var, d0Var2, window, decorView, zBooleanValue, zBooleanValue2);
        Window window2 = jVar.getWindow();
        nk.k.d(window2, "getWindow(...)");
        dVar.b(window2);
    }
}

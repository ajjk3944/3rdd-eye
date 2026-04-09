package s6;

import android.app.Activity;
import android.content.ContextWrapper;
import android.graphics.Rect;
import android.view.WindowManager;
import nk.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class d implements b, g {

    /* renamed from: b, reason: collision with root package name */
    public static final d f33479b = new d();

    /* renamed from: c, reason: collision with root package name */
    public static final d f33480c = new d();

    @Override // s6.b
    public Rect a(Activity activity) {
        Rect bounds = ((WindowManager) activity.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getBounds();
        k.d(bounds, "getBounds(...)");
        return bounds;
    }

    @Override // s6.g
    public r6.a c(ContextWrapper contextWrapper, e eVar) {
        k.e(eVar, "densityCompatHelper");
        WindowManager windowManager = (WindowManager) contextWrapper.getSystemService(WindowManager.class);
        float f10 = contextWrapper.getResources().getDisplayMetrics().density;
        Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
        k.d(bounds, "getBounds(...)");
        return new r6.a(bounds, f10);
    }
}

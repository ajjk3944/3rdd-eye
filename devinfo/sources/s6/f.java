package s6;

import android.content.ContextWrapper;
import android.graphics.Rect;
import android.view.WindowManager;
import nk.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class f implements e, g {

    /* renamed from: b, reason: collision with root package name */
    public static final f f33481b = new f();

    /* renamed from: c, reason: collision with root package name */
    public static final f f33482c = new f();

    @Override // s6.e
    public float b(ContextWrapper contextWrapper) {
        return ((WindowManager) contextWrapper.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getDensity();
    }

    @Override // s6.g
    public r6.a c(ContextWrapper contextWrapper, e eVar) {
        k.e(eVar, "densityCompatHelper");
        WindowManager windowManager = contextWrapper.isUiContext() ? (WindowManager) contextWrapper.getSystemService(WindowManager.class) : (WindowManager) contextWrapper.getApplicationContext().getSystemService(WindowManager.class);
        Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
        k.d(bounds, "getBounds(...)");
        return new r6.a(bounds, windowManager.getCurrentWindowMetrics().getDensity());
    }
}

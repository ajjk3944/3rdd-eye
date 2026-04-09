package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import java.util.Map;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class os2 implements y32 {
    public final /* synthetic */ int f = 1;
    public final /* synthetic */ qs2 g;
    public final /* synthetic */ View h;
    public final /* synthetic */ WindowManager i;

    public /* synthetic */ os2(qs2 qs2Var, View view, WindowManager windowManager) {
        this.g = qs2Var;
        this.h = view;
        this.i = windowManager;
    }

    /* JADX WARN: Type inference failed for: r1v12, types: [ps2] */
    @Override // defpackage.y32
    public final void c(Object obj, Map map) throws NumberFormatException {
        switch (this.f) {
            case 0:
                ag2 ag2Var = (ag2) obj;
                gi2.U("Hide native ad policy validator overlay.");
                ag2Var.p0().setVisibility(8);
                if (ag2Var.p0().getWindowToken() != null) {
                    this.i.removeView(ag2Var.p0());
                }
                ag2Var.destroy();
                ViewTreeObserver viewTreeObserver = this.h.getViewTreeObserver();
                qs2 qs2Var = this.g;
                if (qs2Var.c != null && viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(qs2Var.c);
                    break;
                }
                break;
            default:
                final ag2 ag2Var2 = (ag2) obj;
                sg2 sg2VarE0 = ag2Var2.e0();
                qs2 qs2Var2 = this.g;
                sg2VarE0.l = new mr2(qs2Var2, map, 1, false);
                if (map != null) {
                    final View view = this.h;
                    Context context = view.getContext();
                    String str = (String) map.get("validator_width");
                    iz1 iz1Var = mz1.K8;
                    kz1 kz1Var = tw1.e.c;
                    int iB = qs2.b(((Integer) kz1Var.a(iz1Var)).intValue(), context, str);
                    int iB2 = qs2.b(((Integer) kz1Var.a(mz1.L8)).intValue(), context, (String) map.get("validator_height"));
                    int iB3 = qs2.b(0, context, (String) map.get("validator_x"));
                    int iB4 = qs2.b(0, context, (String) map.get("validator_y"));
                    ag2Var2.Z(new zq(1, iB, iB2));
                    try {
                        ag2Var2.t().getSettings().setUseWideViewPort(((Boolean) kz1Var.a(mz1.M8)).booleanValue());
                        ag2Var2.t().getSettings().setLoadWithOverviewMode(((Boolean) kz1Var.a(mz1.N8)).booleanValue());
                    } catch (NullPointerException unused) {
                    }
                    final WindowManager.LayoutParams layoutParamsG0 = uk2.g0();
                    layoutParamsG0.x = iB3;
                    layoutParamsG0.y = iB4;
                    View viewP0 = ag2Var2.p0();
                    final WindowManager windowManager = this.i;
                    windowManager.updateViewLayout(viewP0, layoutParamsG0);
                    final String str2 = (String) map.get("orientation");
                    Rect rect = new Rect();
                    if (view.getGlobalVisibleRect(rect)) {
                        final int i = (("1".equals(str2) || "2".equals(str2)) ? rect.bottom : rect.top) - iB4;
                        qs2Var2.c = new ViewTreeObserver.OnScrollChangedListener() { // from class: ps2
                            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                            public final /* synthetic */ void onScrollChanged() {
                                Rect rect2 = new Rect();
                                if (view.getGlobalVisibleRect(rect2)) {
                                    ag2 ag2Var3 = ag2Var2;
                                    if (ag2Var3.p0().getWindowToken() == null) {
                                        return;
                                    }
                                    String str3 = str2;
                                    boolean zEquals = "1".equals(str3);
                                    int i2 = i;
                                    WindowManager.LayoutParams layoutParams = layoutParamsG0;
                                    if (zEquals || "2".equals(str3)) {
                                        layoutParams.y = rect2.bottom - i2;
                                    } else {
                                        layoutParams.y = rect2.top - i2;
                                    }
                                    windowManager.updateViewLayout(ag2Var3.p0(), layoutParams);
                                }
                            }
                        };
                        ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
                        if (viewTreeObserver2 != null && viewTreeObserver2.isAlive()) {
                            viewTreeObserver2.addOnScrollChangedListener(qs2Var2.c);
                        }
                    }
                    String str3 = (String) map.get("overlay_url");
                    if (!TextUtils.isEmpty(str3)) {
                        ag2Var2.loadUrl(str3);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ os2(qs2 qs2Var, WindowManager windowManager, View view) {
        this.g = qs2Var;
        this.i = windowManager;
        this.h = view;
    }
}

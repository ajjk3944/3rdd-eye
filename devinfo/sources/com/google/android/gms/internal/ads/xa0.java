package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class xa0 implements oo {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18334a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ab0 f18335b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f18336c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ WindowManager f18337d;

    public /* synthetic */ xa0(ab0 ab0Var, View view, WindowManager windowManager) {
        this.f18335b = ab0Var;
        this.f18336c = view;
        this.f18337d = windowManager;
    }

    /* JADX WARN: Type inference failed for: r1v12, types: [com.google.android.gms.internal.ads.ya0] */
    @Override // com.google.android.gms.internal.ads.oo
    public final void k(Object obj, Map map) throws NumberFormatException {
        switch (this.f18334a) {
            case 0:
                qz qzVar = (qz) obj;
                za.i.c("Hide native ad policy validator overlay.");
                qzVar.N().setVisibility(8);
                if (qzVar.N().getWindowToken() != null) {
                    this.f18337d.removeView(qzVar.N());
                }
                qzVar.destroy();
                ViewTreeObserver viewTreeObserver = this.f18336c.getViewTreeObserver();
                ab0 ab0Var = this.f18335b;
                if (ab0Var.f9295c != null && viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(ab0Var.f9295c);
                    break;
                }
                break;
            default:
                final qz qzVar2 = (qz) obj;
                i00 i00VarX = qzVar2.X();
                ab0 ab0Var2 = this.f18335b;
                i00VarX.g = new ce1(ab0Var2, false, map, 12);
                if (map != null) {
                    final View view = this.f18336c;
                    Context context = view.getContext();
                    String str = (String) map.get("validator_width");
                    pk pkVar = sk.j9;
                    rk rkVar = va.s.f36163e.f36166c;
                    int iB = ab0.b(context, ((Integer) rkVar.a(pkVar)).intValue(), str);
                    int iB2 = ab0.b(context, ((Integer) rkVar.a(sk.k9)).intValue(), (String) map.get("validator_height"));
                    int iB3 = ab0.b(context, 0, (String) map.get("validator_x"));
                    int iB4 = ab0.b(context, 0, (String) map.get("validator_y"));
                    qzVar2.D0(new h0(1, iB, iB2));
                    try {
                        qzVar2.i().getSettings().setUseWideViewPort(((Boolean) rkVar.a(sk.f16213l9)).booleanValue());
                        qzVar2.i().getSettings().setLoadWithOverviewMode(((Boolean) rkVar.a(sk.f16227m9)).booleanValue());
                    } catch (NullPointerException unused) {
                    }
                    final WindowManager.LayoutParams layoutParamsQ = pk.a.Q();
                    layoutParamsQ.x = iB3;
                    layoutParamsQ.y = iB4;
                    View viewN = qzVar2.N();
                    final WindowManager windowManager = this.f18337d;
                    windowManager.updateViewLayout(viewN, layoutParamsQ);
                    final String str2 = (String) map.get("orientation");
                    Rect rect = new Rect();
                    if (view.getGlobalVisibleRect(rect)) {
                        final int i4 = (("1".equals(str2) || "2".equals(str2)) ? rect.bottom : rect.top) - iB4;
                        ab0Var2.f9295c = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.google.android.gms.internal.ads.ya0
                            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                            public final /* synthetic */ void onScrollChanged() {
                                Rect rect2 = new Rect();
                                if (view.getGlobalVisibleRect(rect2)) {
                                    qz qzVar3 = qzVar2;
                                    if (qzVar3.N().getWindowToken() == null) {
                                        return;
                                    }
                                    String str3 = str2;
                                    boolean zEquals = "1".equals(str3);
                                    int i10 = i4;
                                    WindowManager.LayoutParams layoutParams = layoutParamsQ;
                                    if (zEquals || "2".equals(str3)) {
                                        layoutParams.y = rect2.bottom - i10;
                                    } else {
                                        layoutParams.y = rect2.top - i10;
                                    }
                                    windowManager.updateViewLayout(qzVar3.N(), layoutParams);
                                }
                            }
                        };
                        ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
                        if (viewTreeObserver2 != null && viewTreeObserver2.isAlive()) {
                            viewTreeObserver2.addOnScrollChangedListener(ab0Var2.f9295c);
                        }
                    }
                    String str3 = (String) map.get("overlay_url");
                    if (!TextUtils.isEmpty(str3)) {
                        qzVar2.loadUrl(str3);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ xa0(ab0 ab0Var, WindowManager windowManager, View view) {
        this.f18335b = ab0Var;
        this.f18337d = windowManager;
        this.f18336c = view;
    }
}

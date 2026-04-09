package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import java.util.Map;
import q2.C2841s;

/* renamed from: com.google.android.gms.internal.ads.Cm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0460Cm implements InterfaceC0466Db {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7655a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0511Fm f7656b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f7657c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ WindowManager f7658d;

    public /* synthetic */ C0460Cm(C0511Fm c0511Fm, View view, WindowManager windowManager) {
        this.f7656b = c0511Fm;
        this.f7657c = view;
        this.f7658d = windowManager;
    }

    /* JADX WARN: Type inference failed for: r1v12, types: [com.google.android.gms.internal.ads.Dm] */
    @Override // com.google.android.gms.internal.ads.InterfaceC0466Db
    public final void e(Object obj, Map map) throws NumberFormatException {
        switch (this.f7655a) {
            case 0:
                InterfaceC0828Yg interfaceC0828Yg = (InterfaceC0828Yg) obj;
                u2.k.c("Hide native ad policy validator overlay.");
                interfaceC0828Yg.b0().setVisibility(8);
                if (interfaceC0828Yg.b0().getWindowToken() != null) {
                    this.f7658d.removeView(interfaceC0828Yg.b0());
                }
                interfaceC0828Yg.destroy();
                ViewTreeObserver viewTreeObserver = this.f7657c.getViewTreeObserver();
                C0511Fm c0511Fm = this.f7656b;
                if (c0511Fm.f8183c != null && viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(c0511Fm.f8183c);
                    break;
                }
                break;
            default:
                final InterfaceC0828Yg interfaceC0828Yg2 = (InterfaceC0828Yg) obj;
                C1649oh c1649ohL0 = interfaceC0828Yg2.l0();
                C0511Fm c0511Fm2 = this.f7656b;
                c1649ohL0.f16014g = new C0697Ql(c0511Fm2, 18, map);
                if (map != null) {
                    final View view = this.f7657c;
                    Context context = view.getContext();
                    String str = (String) map.get("validator_width");
                    E9 e9 = H9.h9;
                    G9 g9 = C2841s.f23267e.f23270c;
                    int iB = C0511Fm.b(context, ((Integer) g9.a(e9)).intValue(), str);
                    int iB2 = C0511Fm.b(context, ((Integer) g9.a(H9.i9)).intValue(), (String) map.get("validator_height"));
                    int iB3 = C0511Fm.b(context, 0, (String) map.get("validator_x"));
                    int iB4 = C0511Fm.b(context, 0, (String) map.get("validator_y"));
                    interfaceC0828Yg2.f1(new T2.d(1, iB, iB2));
                    try {
                        interfaceC0828Yg2.t().getSettings().setUseWideViewPort(((Boolean) g9.a(H9.j9)).booleanValue());
                        interfaceC0828Yg2.t().getSettings().setLoadWithOverviewMode(((Boolean) g9.a(H9.k9)).booleanValue());
                    } catch (NullPointerException unused) {
                    }
                    final WindowManager.LayoutParams layoutParamsG = a4.t.G();
                    layoutParamsG.x = iB3;
                    layoutParamsG.y = iB4;
                    View viewB0 = interfaceC0828Yg2.b0();
                    final WindowManager windowManager = this.f7658d;
                    windowManager.updateViewLayout(viewB0, layoutParamsG);
                    final String str2 = (String) map.get("orientation");
                    Rect rect = new Rect();
                    if (view.getGlobalVisibleRect(rect)) {
                        final int i = (("1".equals(str2) || "2".equals(str2)) ? rect.bottom : rect.top) - iB4;
                        c0511Fm2.f8183c = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.google.android.gms.internal.ads.Dm
                            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                            public final /* synthetic */ void onScrollChanged() {
                                Rect rect2 = new Rect();
                                if (view.getGlobalVisibleRect(rect2)) {
                                    InterfaceC0828Yg interfaceC0828Yg3 = interfaceC0828Yg2;
                                    if (interfaceC0828Yg3.b0().getWindowToken() == null) {
                                        return;
                                    }
                                    String str3 = str2;
                                    boolean zEquals = "1".equals(str3);
                                    int i3 = i;
                                    WindowManager.LayoutParams layoutParams = layoutParamsG;
                                    if (zEquals || "2".equals(str3)) {
                                        layoutParams.y = rect2.bottom - i3;
                                    } else {
                                        layoutParams.y = rect2.top - i3;
                                    }
                                    windowManager.updateViewLayout(interfaceC0828Yg3.b0(), layoutParams);
                                }
                            }
                        };
                        ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
                        if (viewTreeObserver2 != null && viewTreeObserver2.isAlive()) {
                            viewTreeObserver2.addOnScrollChangedListener(c0511Fm2.f8183c);
                        }
                    }
                    String str3 = (String) map.get("overlay_url");
                    if (!TextUtils.isEmpty(str3)) {
                        interfaceC0828Yg2.loadUrl(str3);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ C0460Cm(C0511Fm c0511Fm, WindowManager windowManager, View view) {
        this.f7656b = c0511Fm;
        this.f7658d = windowManager;
        this.f7657c = view;
    }
}

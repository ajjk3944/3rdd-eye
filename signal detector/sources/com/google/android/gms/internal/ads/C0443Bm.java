package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Bm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0443Bm {

    /* renamed from: a, reason: collision with root package name */
    public final C0427An f7405a;

    /* renamed from: b, reason: collision with root package name */
    public final C1547mn f7406b;

    /* renamed from: c, reason: collision with root package name */
    public final C0694Qi f7407c;

    /* renamed from: d, reason: collision with root package name */
    public final C0816Xl f7408d;

    public C0443Bm(C0427An c0427An, C1547mn c1547mn, C0694Qi c0694Qi, C0816Xl c0816Xl) {
        this.f7405a = c0427An;
        this.f7406b = c1547mn;
        this.f7407c = c0694Qi;
        this.f7408d = c0816Xl;
    }

    public final View a() {
        InterfaceC0828Yg interfaceC0828YgA = this.f7405a.a(q2.d1.a(), null, null);
        interfaceC0828YgA.b0().setVisibility(8);
        final int i = 4;
        interfaceC0828YgA.g0("/sendMessageToSdk", new InterfaceC0466Db(this) { // from class: com.google.android.gms.internal.ads.Am

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C0443Bm f7033b;

            {
                this.f7033b = this;
            }

            @Override // com.google.android.gms.internal.ads.InterfaceC0466Db
            public final void e(Object obj, Map map) {
                switch (i) {
                    case 0:
                        this.f7033b.f7408d.C();
                        break;
                    case 1:
                        InterfaceC0828Yg interfaceC0828Yg = (InterfaceC0828Yg) obj;
                        interfaceC0828Yg.l0().f16014g = new C0889ae(this.f7033b, 20, map);
                        String str = (String) map.get("overlayHtml");
                        String str2 = (String) map.get("baseUrl");
                        if (!TextUtils.isEmpty(str2)) {
                            interfaceC0828Yg.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
                            break;
                        } else {
                            interfaceC0828Yg.loadData(str, "text/html", "UTF-8");
                            break;
                        }
                    case 2:
                        u2.k.g("Showing native ads overlay.");
                        ((InterfaceC0828Yg) obj).b0().setVisibility(0);
                        this.f7033b.f7407c.f10679f = true;
                        break;
                    case 3:
                        u2.k.g("Hiding native ads overlay.");
                        ((InterfaceC0828Yg) obj).b0().setVisibility(8);
                        this.f7033b.f7407c.f10679f = false;
                        break;
                    default:
                        this.f7033b.f7406b.d(map);
                        break;
                }
            }
        });
        final int i3 = 0;
        interfaceC0828YgA.g0("/adMuted", new InterfaceC0466Db(this) { // from class: com.google.android.gms.internal.ads.Am

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C0443Bm f7033b;

            {
                this.f7033b = this;
            }

            @Override // com.google.android.gms.internal.ads.InterfaceC0466Db
            public final void e(Object obj, Map map) {
                switch (i3) {
                    case 0:
                        this.f7033b.f7408d.C();
                        break;
                    case 1:
                        InterfaceC0828Yg interfaceC0828Yg = (InterfaceC0828Yg) obj;
                        interfaceC0828Yg.l0().f16014g = new C0889ae(this.f7033b, 20, map);
                        String str = (String) map.get("overlayHtml");
                        String str2 = (String) map.get("baseUrl");
                        if (!TextUtils.isEmpty(str2)) {
                            interfaceC0828Yg.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
                            break;
                        } else {
                            interfaceC0828Yg.loadData(str, "text/html", "UTF-8");
                            break;
                        }
                    case 2:
                        u2.k.g("Showing native ads overlay.");
                        ((InterfaceC0828Yg) obj).b0().setVisibility(0);
                        this.f7033b.f7407c.f10679f = true;
                        break;
                    case 3:
                        u2.k.g("Hiding native ads overlay.");
                        ((InterfaceC0828Yg) obj).b0().setVisibility(8);
                        this.f7033b.f7407c.f10679f = false;
                        break;
                    default:
                        this.f7033b.f7406b.d(map);
                        break;
                }
            }
        });
        WeakReference weakReference = new WeakReference(interfaceC0828YgA);
        final int i6 = 1;
        InterfaceC0466Db interfaceC0466Db = new InterfaceC0466Db(this) { // from class: com.google.android.gms.internal.ads.Am

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C0443Bm f7033b;

            {
                this.f7033b = this;
            }

            @Override // com.google.android.gms.internal.ads.InterfaceC0466Db
            public final void e(Object obj, Map map) {
                switch (i6) {
                    case 0:
                        this.f7033b.f7408d.C();
                        break;
                    case 1:
                        InterfaceC0828Yg interfaceC0828Yg = (InterfaceC0828Yg) obj;
                        interfaceC0828Yg.l0().f16014g = new C0889ae(this.f7033b, 20, map);
                        String str = (String) map.get("overlayHtml");
                        String str2 = (String) map.get("baseUrl");
                        if (!TextUtils.isEmpty(str2)) {
                            interfaceC0828Yg.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
                            break;
                        } else {
                            interfaceC0828Yg.loadData(str, "text/html", "UTF-8");
                            break;
                        }
                    case 2:
                        u2.k.g("Showing native ads overlay.");
                        ((InterfaceC0828Yg) obj).b0().setVisibility(0);
                        this.f7033b.f7407c.f10679f = true;
                        break;
                    case 3:
                        u2.k.g("Hiding native ads overlay.");
                        ((InterfaceC0828Yg) obj).b0().setVisibility(8);
                        this.f7033b.f7407c.f10679f = false;
                        break;
                    default:
                        this.f7033b.f7406b.d(map);
                        break;
                }
            }
        };
        C1547mn c1547mn = this.f7406b;
        c1547mn.b("/loadHtml", new C0799Wl(c1547mn, weakReference, "/loadHtml", interfaceC0466Db));
        final int i7 = 2;
        c1547mn.b("/showOverlay", new C0799Wl(c1547mn, new WeakReference(interfaceC0828YgA), "/showOverlay", new InterfaceC0466Db(this) { // from class: com.google.android.gms.internal.ads.Am

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C0443Bm f7033b;

            {
                this.f7033b = this;
            }

            @Override // com.google.android.gms.internal.ads.InterfaceC0466Db
            public final void e(Object obj, Map map) {
                switch (i7) {
                    case 0:
                        this.f7033b.f7408d.C();
                        break;
                    case 1:
                        InterfaceC0828Yg interfaceC0828Yg = (InterfaceC0828Yg) obj;
                        interfaceC0828Yg.l0().f16014g = new C0889ae(this.f7033b, 20, map);
                        String str = (String) map.get("overlayHtml");
                        String str2 = (String) map.get("baseUrl");
                        if (!TextUtils.isEmpty(str2)) {
                            interfaceC0828Yg.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
                            break;
                        } else {
                            interfaceC0828Yg.loadData(str, "text/html", "UTF-8");
                            break;
                        }
                    case 2:
                        u2.k.g("Showing native ads overlay.");
                        ((InterfaceC0828Yg) obj).b0().setVisibility(0);
                        this.f7033b.f7407c.f10679f = true;
                        break;
                    case 3:
                        u2.k.g("Hiding native ads overlay.");
                        ((InterfaceC0828Yg) obj).b0().setVisibility(8);
                        this.f7033b.f7407c.f10679f = false;
                        break;
                    default:
                        this.f7033b.f7406b.d(map);
                        break;
                }
            }
        }));
        final int i8 = 3;
        c1547mn.b("/hideOverlay", new C0799Wl(c1547mn, new WeakReference(interfaceC0828YgA), "/hideOverlay", new InterfaceC0466Db(this) { // from class: com.google.android.gms.internal.ads.Am

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C0443Bm f7033b;

            {
                this.f7033b = this;
            }

            @Override // com.google.android.gms.internal.ads.InterfaceC0466Db
            public final void e(Object obj, Map map) {
                switch (i8) {
                    case 0:
                        this.f7033b.f7408d.C();
                        break;
                    case 1:
                        InterfaceC0828Yg interfaceC0828Yg = (InterfaceC0828Yg) obj;
                        interfaceC0828Yg.l0().f16014g = new C0889ae(this.f7033b, 20, map);
                        String str = (String) map.get("overlayHtml");
                        String str2 = (String) map.get("baseUrl");
                        if (!TextUtils.isEmpty(str2)) {
                            interfaceC0828Yg.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
                            break;
                        } else {
                            interfaceC0828Yg.loadData(str, "text/html", "UTF-8");
                            break;
                        }
                    case 2:
                        u2.k.g("Showing native ads overlay.");
                        ((InterfaceC0828Yg) obj).b0().setVisibility(0);
                        this.f7033b.f7407c.f10679f = true;
                        break;
                    case 3:
                        u2.k.g("Hiding native ads overlay.");
                        ((InterfaceC0828Yg) obj).b0().setVisibility(8);
                        this.f7033b.f7407c.f10679f = false;
                        break;
                    default:
                        this.f7033b.f7406b.d(map);
                        break;
                }
            }
        }));
        return interfaceC0828YgA.b0();
    }
}

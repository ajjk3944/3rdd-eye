package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class wa0 {

    /* renamed from: a, reason: collision with root package name */
    public final wc0 f17949a;

    /* renamed from: b, reason: collision with root package name */
    public final hc0 f17950b;

    /* renamed from: c, reason: collision with root package name */
    public final m30 f17951c;

    /* renamed from: d, reason: collision with root package name */
    public final r90 f17952d;

    public wa0(wc0 wc0Var, hc0 hc0Var, m30 m30Var, r90 r90Var) {
        this.f17949a = wc0Var;
        this.f17950b = hc0Var;
        this.f17951c = m30Var;
        this.f17952d = r90Var;
    }

    public final View a() {
        qz qzVarA = this.f17949a.a(va.c3.a(), null, null);
        qzVarA.N().setVisibility(8);
        final int i4 = 4;
        qzVarA.Z("/sendMessageToSdk", new oo(this) { // from class: com.google.android.gms.internal.ads.va0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ wa0 f17574b;

            {
                this.f17574b = this;
            }

            @Override // com.google.android.gms.internal.ads.oo
            public final void k(Object obj, Map map) {
                switch (i4) {
                    case 0:
                        this.f17574b.f17952d.C();
                        break;
                    case 1:
                        qz qzVar = (qz) obj;
                        qzVar.X().g = new l90(12, this.f17574b, map);
                        String str = (String) map.get("overlayHtml");
                        String str2 = (String) map.get("baseUrl");
                        if (!TextUtils.isEmpty(str2)) {
                            qzVar.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
                            break;
                        } else {
                            qzVar.loadData(str, "text/html", "UTF-8");
                            break;
                        }
                    case 2:
                        za.i.g("Showing native ads overlay.");
                        ((qz) obj).N().setVisibility(0);
                        this.f17574b.f17951c.f13746f = true;
                        break;
                    case 3:
                        za.i.g("Hiding native ads overlay.");
                        ((qz) obj).N().setVisibility(8);
                        this.f17574b.f17951c.f13746f = false;
                        break;
                    default:
                        this.f17574b.f17950b.d(map);
                        break;
                }
            }
        });
        final int i10 = 0;
        qzVarA.Z("/adMuted", new oo(this) { // from class: com.google.android.gms.internal.ads.va0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ wa0 f17574b;

            {
                this.f17574b = this;
            }

            @Override // com.google.android.gms.internal.ads.oo
            public final void k(Object obj, Map map) {
                switch (i10) {
                    case 0:
                        this.f17574b.f17952d.C();
                        break;
                    case 1:
                        qz qzVar = (qz) obj;
                        qzVar.X().g = new l90(12, this.f17574b, map);
                        String str = (String) map.get("overlayHtml");
                        String str2 = (String) map.get("baseUrl");
                        if (!TextUtils.isEmpty(str2)) {
                            qzVar.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
                            break;
                        } else {
                            qzVar.loadData(str, "text/html", "UTF-8");
                            break;
                        }
                    case 2:
                        za.i.g("Showing native ads overlay.");
                        ((qz) obj).N().setVisibility(0);
                        this.f17574b.f17951c.f13746f = true;
                        break;
                    case 3:
                        za.i.g("Hiding native ads overlay.");
                        ((qz) obj).N().setVisibility(8);
                        this.f17574b.f17951c.f13746f = false;
                        break;
                    default:
                        this.f17574b.f17950b.d(map);
                        break;
                }
            }
        });
        WeakReference weakReference = new WeakReference(qzVarA);
        final int i11 = 1;
        oo ooVar = new oo(this) { // from class: com.google.android.gms.internal.ads.va0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ wa0 f17574b;

            {
                this.f17574b = this;
            }

            @Override // com.google.android.gms.internal.ads.oo
            public final void k(Object obj, Map map) {
                switch (i11) {
                    case 0:
                        this.f17574b.f17952d.C();
                        break;
                    case 1:
                        qz qzVar = (qz) obj;
                        qzVar.X().g = new l90(12, this.f17574b, map);
                        String str = (String) map.get("overlayHtml");
                        String str2 = (String) map.get("baseUrl");
                        if (!TextUtils.isEmpty(str2)) {
                            qzVar.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
                            break;
                        } else {
                            qzVar.loadData(str, "text/html", "UTF-8");
                            break;
                        }
                    case 2:
                        za.i.g("Showing native ads overlay.");
                        ((qz) obj).N().setVisibility(0);
                        this.f17574b.f17951c.f13746f = true;
                        break;
                    case 3:
                        za.i.g("Hiding native ads overlay.");
                        ((qz) obj).N().setVisibility(8);
                        this.f17574b.f17951c.f13746f = false;
                        break;
                    default:
                        this.f17574b.f17950b.d(map);
                        break;
                }
            }
        };
        hc0 hc0Var = this.f17950b;
        hc0Var.b("/loadHtml", new q90(hc0Var, weakReference, "/loadHtml", ooVar));
        final int i12 = 2;
        hc0Var.b("/showOverlay", new q90(hc0Var, new WeakReference(qzVarA), "/showOverlay", new oo(this) { // from class: com.google.android.gms.internal.ads.va0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ wa0 f17574b;

            {
                this.f17574b = this;
            }

            @Override // com.google.android.gms.internal.ads.oo
            public final void k(Object obj, Map map) {
                switch (i12) {
                    case 0:
                        this.f17574b.f17952d.C();
                        break;
                    case 1:
                        qz qzVar = (qz) obj;
                        qzVar.X().g = new l90(12, this.f17574b, map);
                        String str = (String) map.get("overlayHtml");
                        String str2 = (String) map.get("baseUrl");
                        if (!TextUtils.isEmpty(str2)) {
                            qzVar.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
                            break;
                        } else {
                            qzVar.loadData(str, "text/html", "UTF-8");
                            break;
                        }
                    case 2:
                        za.i.g("Showing native ads overlay.");
                        ((qz) obj).N().setVisibility(0);
                        this.f17574b.f17951c.f13746f = true;
                        break;
                    case 3:
                        za.i.g("Hiding native ads overlay.");
                        ((qz) obj).N().setVisibility(8);
                        this.f17574b.f17951c.f13746f = false;
                        break;
                    default:
                        this.f17574b.f17950b.d(map);
                        break;
                }
            }
        }));
        final int i13 = 3;
        hc0Var.b("/hideOverlay", new q90(hc0Var, new WeakReference(qzVarA), "/hideOverlay", new oo(this) { // from class: com.google.android.gms.internal.ads.va0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ wa0 f17574b;

            {
                this.f17574b = this;
            }

            @Override // com.google.android.gms.internal.ads.oo
            public final void k(Object obj, Map map) {
                switch (i13) {
                    case 0:
                        this.f17574b.f17952d.C();
                        break;
                    case 1:
                        qz qzVar = (qz) obj;
                        qzVar.X().g = new l90(12, this.f17574b, map);
                        String str = (String) map.get("overlayHtml");
                        String str2 = (String) map.get("baseUrl");
                        if (!TextUtils.isEmpty(str2)) {
                            qzVar.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
                            break;
                        } else {
                            qzVar.loadData(str, "text/html", "UTF-8");
                            break;
                        }
                    case 2:
                        za.i.g("Showing native ads overlay.");
                        ((qz) obj).N().setVisibility(0);
                        this.f17574b.f17951c.f13746f = true;
                        break;
                    case 3:
                        za.i.g("Hiding native ads overlay.");
                        ((qz) obj).N().setVisibility(8);
                        this.f17574b.f17951c.f13746f = false;
                        break;
                    default:
                        this.f17574b.f17950b.d(map);
                        break;
                }
            }
        }));
        return qzVarA.N();
    }
}

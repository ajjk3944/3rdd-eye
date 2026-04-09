package defpackage;

import android.text.TextUtils;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ns2 {
    public final pu2 a;
    public final au2 b;
    public final zj2 c;
    public final dr2 d;

    public ns2(pu2 pu2Var, au2 au2Var, zj2 zj2Var, dr2 dr2Var) {
        this.a = pu2Var;
        this.b = au2Var;
        this.c = zj2Var;
        this.d = dr2Var;
    }

    public final View a() {
        ag2 ag2VarA = this.a.a(xe4.a(), null, null);
        ag2VarA.p0().setVisibility(8);
        final int i = 4;
        ag2VarA.v0("/sendMessageToSdk", new y32(this) { // from class: js2
            public final /* synthetic */ ns2 g;

            {
                this.g = this;
            }

            @Override // defpackage.y32
            public final void c(Object obj, Map map) {
                switch (i) {
                    case 0:
                        this.g.d.C();
                        break;
                    case 1:
                        ag2 ag2Var = (ag2) obj;
                        ag2Var.e0().l = new l92(this.g, map);
                        String str = (String) map.get("overlayHtml");
                        String str2 = (String) map.get("baseUrl");
                        if (!TextUtils.isEmpty(str2)) {
                            ag2Var.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
                            break;
                        } else {
                            ag2Var.loadData(str, "text/html", "UTF-8");
                            break;
                        }
                    case 2:
                        gi2.f0("Showing native ads overlay.");
                        ((ag2) obj).p0().setVisibility(0);
                        this.g.c.k = true;
                        break;
                    case 3:
                        gi2.f0("Hiding native ads overlay.");
                        ((ag2) obj).p0().setVisibility(8);
                        this.g.c.k = false;
                        break;
                    default:
                        this.g.b.d(map);
                        break;
                }
            }
        });
        final int i2 = 0;
        ag2VarA.v0("/adMuted", new y32(this) { // from class: js2
            public final /* synthetic */ ns2 g;

            {
                this.g = this;
            }

            @Override // defpackage.y32
            public final void c(Object obj, Map map) {
                switch (i2) {
                    case 0:
                        this.g.d.C();
                        break;
                    case 1:
                        ag2 ag2Var = (ag2) obj;
                        ag2Var.e0().l = new l92(this.g, map);
                        String str = (String) map.get("overlayHtml");
                        String str2 = (String) map.get("baseUrl");
                        if (!TextUtils.isEmpty(str2)) {
                            ag2Var.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
                            break;
                        } else {
                            ag2Var.loadData(str, "text/html", "UTF-8");
                            break;
                        }
                    case 2:
                        gi2.f0("Showing native ads overlay.");
                        ((ag2) obj).p0().setVisibility(0);
                        this.g.c.k = true;
                        break;
                    case 3:
                        gi2.f0("Hiding native ads overlay.");
                        ((ag2) obj).p0().setVisibility(8);
                        this.g.c.k = false;
                        break;
                    default:
                        this.g.b.d(map);
                        break;
                }
            }
        });
        WeakReference weakReference = new WeakReference(ag2VarA);
        final int i3 = 1;
        y32 y32Var = new y32(this) { // from class: js2
            public final /* synthetic */ ns2 g;

            {
                this.g = this;
            }

            @Override // defpackage.y32
            public final void c(Object obj, Map map) {
                switch (i3) {
                    case 0:
                        this.g.d.C();
                        break;
                    case 1:
                        ag2 ag2Var = (ag2) obj;
                        ag2Var.e0().l = new l92(this.g, map);
                        String str = (String) map.get("overlayHtml");
                        String str2 = (String) map.get("baseUrl");
                        if (!TextUtils.isEmpty(str2)) {
                            ag2Var.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
                            break;
                        } else {
                            ag2Var.loadData(str, "text/html", "UTF-8");
                            break;
                        }
                    case 2:
                        gi2.f0("Showing native ads overlay.");
                        ((ag2) obj).p0().setVisibility(0);
                        this.g.c.k = true;
                        break;
                    case 3:
                        gi2.f0("Hiding native ads overlay.");
                        ((ag2) obj).p0().setVisibility(8);
                        this.g.c.k = false;
                        break;
                    default:
                        this.g.b.d(map);
                        break;
                }
            }
        };
        au2 au2Var = this.b;
        au2Var.b("/loadHtml", new cr2(au2Var, weakReference, "/loadHtml", y32Var));
        final int i4 = 2;
        au2Var.b("/showOverlay", new cr2(au2Var, new WeakReference(ag2VarA), "/showOverlay", new y32(this) { // from class: js2
            public final /* synthetic */ ns2 g;

            {
                this.g = this;
            }

            @Override // defpackage.y32
            public final void c(Object obj, Map map) {
                switch (i4) {
                    case 0:
                        this.g.d.C();
                        break;
                    case 1:
                        ag2 ag2Var = (ag2) obj;
                        ag2Var.e0().l = new l92(this.g, map);
                        String str = (String) map.get("overlayHtml");
                        String str2 = (String) map.get("baseUrl");
                        if (!TextUtils.isEmpty(str2)) {
                            ag2Var.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
                            break;
                        } else {
                            ag2Var.loadData(str, "text/html", "UTF-8");
                            break;
                        }
                    case 2:
                        gi2.f0("Showing native ads overlay.");
                        ((ag2) obj).p0().setVisibility(0);
                        this.g.c.k = true;
                        break;
                    case 3:
                        gi2.f0("Hiding native ads overlay.");
                        ((ag2) obj).p0().setVisibility(8);
                        this.g.c.k = false;
                        break;
                    default:
                        this.g.b.d(map);
                        break;
                }
            }
        }));
        final int i5 = 3;
        au2Var.b("/hideOverlay", new cr2(au2Var, new WeakReference(ag2VarA), "/hideOverlay", new y32(this) { // from class: js2
            public final /* synthetic */ ns2 g;

            {
                this.g = this;
            }

            @Override // defpackage.y32
            public final void c(Object obj, Map map) {
                switch (i5) {
                    case 0:
                        this.g.d.C();
                        break;
                    case 1:
                        ag2 ag2Var = (ag2) obj;
                        ag2Var.e0().l = new l92(this.g, map);
                        String str = (String) map.get("overlayHtml");
                        String str2 = (String) map.get("baseUrl");
                        if (!TextUtils.isEmpty(str2)) {
                            ag2Var.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
                            break;
                        } else {
                            ag2Var.loadData(str, "text/html", "UTF-8");
                            break;
                        }
                    case 2:
                        gi2.f0("Showing native ads overlay.");
                        ((ag2) obj).p0().setVisibility(0);
                        this.g.c.k = true;
                        break;
                    case 3:
                        gi2.f0("Hiding native ads overlay.");
                        ((ag2) obj).p0().setVisibility(8);
                        this.g.c.k = false;
                        break;
                    default:
                        this.g.b.d(map);
                        break;
                }
            }
        }));
        return ag2VarA.p0();
    }
}

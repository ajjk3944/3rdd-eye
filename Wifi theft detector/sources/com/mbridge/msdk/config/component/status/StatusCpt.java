package com.mbridge.msdk.config.component.status;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class StatusCpt extends com.mbridge.msdk.config.component.base.a {

    /* renamed from: k, reason: collision with root package name */
    private static c f13682k;

    /* renamed from: l, reason: collision with root package name */
    private static e f13683l;

    /* renamed from: m, reason: collision with root package name */
    private static d f13684m;

    /* renamed from: n, reason: collision with root package name */
    private static a f13685n;

    /* renamed from: h, reason: collision with root package name */
    String f13686h = "";

    /* renamed from: i, reason: collision with root package name */
    Map<String, Object> f13687i = null;

    /* renamed from: j, reason: collision with root package name */
    Map<String, Object> f13688j = null;

    @Override // com.mbridge.msdk.config.component.base.a
    public void b(Map<String, Object> map) {
        this.f13092f = "916001";
        if (map == null) {
            return;
        }
        this.f13688j = map;
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void c(Map<String, Object> map) {
        if (map == null) {
            return;
        }
        this.f13687i = map;
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void d() {
        String strValueOf;
        List<String> list;
        super.d();
        Map<String, Object> map = this.f13687i;
        if (map == null || map.isEmpty()) {
            return;
        }
        if (f13685n == null) {
            f13685n = new a() { // from class: com.mbridge.msdk.config.component.status.f
                @Override // com.mbridge.msdk.config.component.status.a
                public final void a(com.mbridge.msdk.config.component.base.b bVar) {
                    this.f13713a.b(bVar);
                }
            };
        }
        if (d("916002")) {
            if (!c("916002")) {
                c cVar = f13682k;
                if (cVar != null) {
                    cVar.b(f13685n);
                    f13682k.d();
                }
                f13682k = null;
            } else if (f13682k == null) {
                c cVar2 = new c();
                f13682k = cVar2;
                cVar2.a(f13685n);
            }
        }
        if (d("916003") || d("916004")) {
            if (c("916003") || c("916004")) {
                b bVar = com.mbridge.msdk.foundation.controller.a.f14695s;
                if (bVar != null) {
                    bVar.a(f13685n);
                }
            } else {
                b bVar2 = com.mbridge.msdk.foundation.controller.a.f14695s;
                if (bVar2 != null) {
                    bVar2.b(f13685n);
                }
            }
        }
        if (d("916005")) {
            if (!c("916005")) {
                e eVar = f13683l;
                if (eVar != null) {
                    eVar.b(f13685n);
                    f13683l.d();
                }
                f13683l = null;
            } else if (f13683l == null) {
                e eVar2 = new e();
                f13683l = eVar2;
                eVar2.a(f13685n);
            }
        }
        if (d("916006")) {
            Map<String, Object> map2 = this.f13688j;
            if (map2 != null) {
                Object obj = map2.get(com.mbridge.msdk.config.component.common.util.c.a(DownloadModel.FILE_NAME));
                if (obj == null) {
                    obj = "";
                }
                strValueOf = String.valueOf(obj);
                list = (this.f13688j.containsKey(com.mbridge.msdk.config.component.common.util.c.a("key_list")) && (this.f13688j.get(com.mbridge.msdk.config.component.common.util.c.a("key_list")) instanceof List)) ? (List) this.f13688j.get(com.mbridge.msdk.config.component.common.util.c.a("key_list")) : null;
            } else {
                strValueOf = null;
                list = null;
            }
            if (!c("916006")) {
                d dVar = f13684m;
                if (dVar != null) {
                    dVar.b(f13685n);
                }
                f13684m = null;
            } else if (f13684m == null) {
                d dVar2 = new d(strValueOf);
                f13684m = dVar2;
                dVar2.a(list);
                f13684m.a(f13685n);
            }
        }
        g();
    }

    private boolean c(String str) {
        Object obj = this.f13687i.get(str);
        if (obj instanceof Map) {
            return String.valueOf(((Map) obj).get(com.mbridge.msdk.config.component.common.util.c.a("17"))).equals("1");
        }
        return false;
    }

    private void g() {
        boolean zC = c("916002");
        boolean zC2 = c("916005");
        boolean z10 = c("916004") || c("916003");
        boolean zC3 = c("916006");
        if (zC || zC2 || z10 || zC3) {
            return;
        }
        f13685n = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(com.mbridge.msdk.config.component.base.b bVar) {
        String strC = bVar.c();
        strC.getClass();
        switch (strC) {
            case "916002":
                String strValueOf = String.valueOf(bVar.b().get("networkType"));
                if (TextUtils.isEmpty(this.f13686h)) {
                    this.f13686h = strValueOf;
                    break;
                } else if (!this.f13686h.equals(strValueOf)) {
                    this.f13686h = strValueOf;
                    a(a(bVar.c(), bVar.b()));
                    break;
                }
                break;
            case "916003":
            case "916004":
            case "916005":
            case "916006":
                a(a(bVar.c(), bVar.b()));
                break;
        }
    }

    private boolean d(String str) {
        Object obj;
        Object obj2 = this.f13687i.get(str);
        if (!(obj2 instanceof Map) || (obj = ((Map) obj2).get(com.mbridge.msdk.config.component.common.util.c.a("17"))) == null) {
            return false;
        }
        String strValueOf = String.valueOf(obj);
        return strValueOf.equals("1") || strValueOf.equals(MBridgeConstans.ENDCARD_URL_TYPE_PL);
    }
}

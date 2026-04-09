package com.mbridge.msdk.videocommon.download;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Patterns;
import android.webkit.URLUtil;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public class d {

    /* renamed from: h, reason: collision with root package name */
    private static d f19636h;

    /* renamed from: a, reason: collision with root package name */
    private CopyOnWriteArrayList<String> f19637a;

    /* renamed from: b, reason: collision with root package name */
    private ConcurrentMap<String, Object> f19638b;

    /* renamed from: c, reason: collision with root package name */
    private i f19639c;

    /* renamed from: d, reason: collision with root package name */
    private f f19640d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f19641e;

    /* renamed from: f, reason: collision with root package name */
    private final String f19642f = CampaignEx.JSON_KEY_LOCAL_REQUEST_ID;

    /* renamed from: g, reason: collision with root package name */
    private final String f19643g = "down_type";

    private d() {
        this.f19641e = false;
        try {
            this.f19639c = i.a();
            this.f19640d = f.a();
            this.f19637a = new CopyOnWriteArrayList<>();
            this.f19638b = new ConcurrentHashMap();
            com.mbridge.msdk.setting.g gVarD = com.mbridge.msdk.setting.h.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
            if (gVarD != null) {
                this.f19641e = gVarD.b(1);
            }
        } catch (Throwable th) {
            q0.b("H5DownLoadManager", th.getMessage(), th);
        }
    }

    public static synchronized d a() {
        try {
            if (f19636h == null) {
                f19636h = new d();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f19636h;
    }

    private String b(String str) {
        f fVar = this.f19640d;
        return fVar != null ? fVar.b(str) : str;
    }

    public String c(String str) {
        i iVar = this.f19639c;
        if (iVar != null) {
            return iVar.a(str);
        }
        return null;
    }

    public String a(String str) {
        try {
            if (!Patterns.WEB_URL.matcher(str).matches() && !URLUtil.isValidUrl(str)) {
                return str;
            }
            Uri uri = Uri.parse(str);
            String path = uri.getPath();
            if (!TextUtils.isEmpty(path) && TextUtils.isEmpty(uri.getQueryParameter("urlDebug"))) {
                if (path.toLowerCase().endsWith(".zip")) {
                    return c(str);
                }
                return b(str);
            }
            return str;
        } catch (Exception e10) {
            e10.printStackTrace();
            return str;
        }
    }
}

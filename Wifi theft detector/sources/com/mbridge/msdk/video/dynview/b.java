package com.mbridge.msdk.video.dynview;

import android.content.Context;
import android.view.View;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.video.dynview.listener.h;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: b, reason: collision with root package name */
    private static volatile b f18694b;

    /* renamed from: a, reason: collision with root package name */
    public Map<String, SoftReference<View>> f18695a = new HashMap();

    private b() {
    }

    public static b a() {
        b bVar;
        if (f18694b != null) {
            return f18694b;
        }
        synchronized (b.class) {
            try {
                if (f18694b == null) {
                    f18694b = new b();
                }
                bVar = f18694b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVar;
    }

    public void a(Context context, List<CampaignEx> list, h hVar, Map<String, Object> map) {
        new com.mbridge.msdk.video.dynview.ui.a(context, list, hVar, map);
    }

    public void a(c cVar, h hVar) {
        new com.mbridge.msdk.video.dynview.ui.a(cVar, hVar, new HashMap());
    }

    public void a(c cVar, h hVar, Map<String, Object> map) {
        new com.mbridge.msdk.video.dynview.ui.a(cVar, hVar, map);
    }
}

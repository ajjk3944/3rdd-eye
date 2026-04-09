package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.net.Uri;
import com.yandex.mobile.ads.impl.v30;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public final class pa1 {

    /* renamed from: a, reason: collision with root package name */
    private final t30 f31694a;

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentHashMap<String, rd2> f31695b;

    public pa1(Context context) {
        kotlin.jvm.internal.l.f(context, "context");
        Context appContext = context.getApplicationContext();
        kotlin.jvm.internal.l.e(appContext, "appContext");
        this.f31694a = ae2.b(appContext);
        this.f31695b = new ConcurrentHashMap<>();
    }

    public final void a(String url, rd2 videoCacheListener, String requestId) {
        kotlin.jvm.internal.l.f(url, "url");
        kotlin.jvm.internal.l.f(videoCacheListener, "videoCacheListener");
        kotlin.jvm.internal.l.f(requestId, "requestId");
        if (this.f31694a == null) {
            videoCacheListener.b();
            a();
            return;
        }
        v30 v30VarA = new v30.b(Uri.parse(url), requestId).a();
        this.f31695b.put(requestId, videoCacheListener);
        this.f31694a.a(new dj2(requestId, videoCacheListener));
        this.f31694a.a(v30VarA);
        this.f31694a.a();
    }

    public final void a() {
        Iterator<Map.Entry<String, rd2>> it = this.f31695b.entrySet().iterator();
        while (it.hasNext()) {
            String key = it.next().getKey();
            t30 t30Var = this.f31694a;
            if (t30Var != null) {
                t30Var.a(key);
            }
        }
        this.f31695b.clear();
    }

    public final void a(String requestId) {
        kotlin.jvm.internal.l.f(requestId, "requestId");
        t30 t30Var = this.f31694a;
        if (t30Var != null) {
            t30Var.a(requestId);
        }
        this.f31695b.remove(requestId);
    }
}

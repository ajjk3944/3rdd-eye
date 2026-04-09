package com.yandex.mobile.ads.impl;

import C.RunnableC0615b;
import android.os.Handler;
import com.yandex.mobile.ads.impl.ip1;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class ev implements t32 {

    /* renamed from: a, reason: collision with root package name */
    private final wt f27047a;

    /* renamed from: b, reason: collision with root package name */
    private final f8 f27048b;

    /* renamed from: c, reason: collision with root package name */
    private final Handler f27049c;

    public final class a implements xt {
        public a() {
        }

        @Override // com.yandex.mobile.ads.impl.xt
        public final void onLeftApplication() {
            ev.this.f27048b.a(19, null);
        }

        @Override // com.yandex.mobile.ads.impl.xt
        public final void onReturnedToApplication() {
            ev.this.f27048b.a(20, null);
        }
    }

    public ev(wt customClickHandler, f8 resultReceiver, Handler handler) {
        kotlin.jvm.internal.l.f(customClickHandler, "customClickHandler");
        kotlin.jvm.internal.l.f(resultReceiver, "resultReceiver");
        kotlin.jvm.internal.l.f(handler, "handler");
        this.f27047a = customClickHandler;
        this.f27048b = resultReceiver;
        this.f27049c = handler;
    }

    @Override // com.yandex.mobile.ads.impl.t32
    public final void a(np1 reporter, String targetUrl) {
        kotlin.jvm.internal.l.f(reporter, "reporter");
        kotlin.jvm.internal.l.f(targetUrl, "targetUrl");
        HashMap map = new HashMap();
        map.put("click_type", "custom");
        i82.f28590a.getClass();
        map.put("click_url", i82.a(targetUrl));
        ip1.b bVar = ip1.b.f28803c;
        reporter.a(map);
        this.f27049c.post(new RunnableC0615b(22, this, targetUrl));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(ev this$0, String targetUrl) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        kotlin.jvm.internal.l.f(targetUrl, "$targetUrl");
        this$0.f27047a.a(targetUrl, this$0.new a());
    }
}

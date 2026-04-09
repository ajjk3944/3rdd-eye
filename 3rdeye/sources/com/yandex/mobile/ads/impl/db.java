package com.yandex.mobile.ads.impl;

import android.view.View;
import com.yandex.mobile.ads.impl.ip1;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class db implements InterfaceC4214v<cb> {

    /* renamed from: a, reason: collision with root package name */
    private final rb f26035a;

    /* renamed from: b, reason: collision with root package name */
    private final h9 f26036b;

    /* renamed from: c, reason: collision with root package name */
    private final np1 f26037c;

    public db(rb adtuneRenderer, h9 adTracker, np1 reporter) {
        kotlin.jvm.internal.l.f(adtuneRenderer, "adtuneRenderer");
        kotlin.jvm.internal.l.f(adTracker, "adTracker");
        kotlin.jvm.internal.l.f(reporter, "reporter");
        this.f26035a = adtuneRenderer;
        this.f26036b = adTracker;
        this.f26037c = reporter;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4214v
    public final af0 a(View view, InterfaceC4200t interfaceC4200t) {
        cb action = (cb) interfaceC4200t;
        kotlin.jvm.internal.l.f(view, "view");
        kotlin.jvm.internal.l.f(action, "action");
        Iterator<String> it = action.b().iterator();
        while (it.hasNext()) {
            this.f26036b.a(it.next(), m62.f30281b);
        }
        this.f26035a.a(view, action);
        this.f26037c.a(ip1.b.f28811j);
        return new af0(false);
    }
}

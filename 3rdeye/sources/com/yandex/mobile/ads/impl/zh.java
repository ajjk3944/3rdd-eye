package com.yandex.mobile.ads.impl;

import android.content.Context;
import b9.C1992A;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class zh implements xh {

    /* renamed from: a, reason: collision with root package name */
    private final wh f36496a;

    /* renamed from: b, reason: collision with root package name */
    private final ai f36497b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f36498c;

    /* renamed from: d, reason: collision with root package name */
    private final ArrayList f36499d;

    public zh(zw1 sensitiveModeChecker, wh autograbCollectionEnabledValidator, ai autograbProvider) {
        kotlin.jvm.internal.l.f(sensitiveModeChecker, "sensitiveModeChecker");
        kotlin.jvm.internal.l.f(autograbCollectionEnabledValidator, "autograbCollectionEnabledValidator");
        kotlin.jvm.internal.l.f(autograbProvider, "autograbProvider");
        this.f36496a = autograbCollectionEnabledValidator;
        this.f36497b = autograbProvider;
        this.f36498c = new Object();
        this.f36499d = new ArrayList();
    }

    @Override // com.yandex.mobile.ads.impl.xh
    public final void a() {
        HashSet hashSet;
        synchronized (this.f36498c) {
            hashSet = new HashSet(this.f36499d);
            this.f36499d.clear();
            C1992A c1992a = C1992A.f18074a;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            this.f36497b.b((bi) it.next());
        }
    }

    @Override // com.yandex.mobile.ads.impl.xh
    public final void a(Context context, bi autograbRequestListener) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(autograbRequestListener, "autograbRequestListener");
        if (this.f36496a.a(context)) {
            synchronized (this.f36498c) {
                this.f36499d.add(autograbRequestListener);
                this.f36497b.a(autograbRequestListener);
                C1992A c1992a = C1992A.f18074a;
            }
            return;
        }
        autograbRequestListener.a(null);
    }
}

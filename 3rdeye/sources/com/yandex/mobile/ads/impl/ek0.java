package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.dk0;

/* loaded from: classes3.dex */
public final class ek0 {
    public static dk0 a(Context context, dk0.a impressionListener, gk0 impressionReporter, C4101e4 adIdStorageManager, ck0 eventsObservable) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(impressionListener, "impressionListener");
        kotlin.jvm.internal.l.f(impressionReporter, "impressionReporter");
        kotlin.jvm.internal.l.f(adIdStorageManager, "adIdStorageManager");
        kotlin.jvm.internal.l.f(eventsObservable, "eventsObservable");
        dk0 dk0Var = new dk0(context, impressionListener, impressionReporter, adIdStorageManager, new fk0(impressionReporter));
        eventsObservable.b(dk0Var);
        eventsObservable.a(dk0Var);
        eventsObservable.c(dk0Var);
        eventsObservable.a((h11) dk0Var);
        return dk0Var;
    }
}

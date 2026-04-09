package io.appmetrica.analytics.impl;

import android.os.Handler;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.lang.ref.WeakReference;
import java.util.Set;

/* loaded from: classes3.dex */
public final class Ib implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f39623a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f39624b;

    public Ib(Handler handler, V2 v22) {
        this.f39623a = new WeakReference(handler);
        this.f39624b = new WeakReference(v22);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Handler handler = (Handler) this.f39623a.get();
        V2 v22 = (V2) this.f39624b.get();
        if (handler == null || v22 == null) {
            return;
        }
        boolean zF = v22.f40267b.f();
        if (!zF) {
            PublicLogger publicLogger = v22.f40268c;
            Set set = O9.f39923a;
            EnumC4997ub enumC4997ub = EnumC4997ub.EVENT_TYPE_UNDEFINED;
            C4681i4 c4681i4 = new C4681i4("", "", 3, 0, publicLogger);
            Gi gi = v22.f40273h;
            Qh qh = v22.f40267b;
            gi.getClass();
            gi.a(Gi.a(c4681i4, qh), qh, 1, null);
        }
        if (zF) {
            return;
        }
        Hb.a(handler, v22, this);
    }
}

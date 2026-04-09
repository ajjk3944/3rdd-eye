package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.zi, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5129zi {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f42196a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final C4986u0 f42197b;

    public C5129zi(C4986u0 c4986u0) {
        this.f42197b = c4986u0;
    }

    public static C5129zi a() {
        return AbstractC5104yi.f42146a;
    }

    public final C4927ri a(Context context, String str) {
        C4927ri c4927ri;
        C4927ri c4927ri2 = (C4927ri) this.f42196a.get(str);
        if (c4927ri2 != null) {
            return c4927ri2;
        }
        synchronized (this.f42196a) {
            try {
                c4927ri = (C4927ri) this.f42196a.get(str);
                if (c4927ri == null) {
                    IHandlerExecutor iHandlerExecutorA = C5065x4.l().f42014c.a();
                    this.f42197b.getClass();
                    if (C4961t0.f41657e == null) {
                        ((S9) iHandlerExecutorA).f40100b.post(new RunnableC5079xi(this, context));
                    }
                    c4927ri = new C4927ri(context.getApplicationContext(), str, new C4986u0());
                    this.f42196a.put(str, c4927ri);
                    c4927ri.c(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c4927ri;
    }
}

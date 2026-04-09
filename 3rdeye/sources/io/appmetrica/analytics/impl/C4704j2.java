package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;

/* renamed from: io.appmetrica.analytics.impl.j2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4704j2 {

    /* renamed from: a, reason: collision with root package name */
    public final C5123zc f41101a;

    /* renamed from: b, reason: collision with root package name */
    public final ICommonExecutor f41102b;

    /* renamed from: c, reason: collision with root package name */
    public final long f41103c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f41104d = true;

    /* renamed from: e, reason: collision with root package name */
    public final Runnable f41105e = new com.vungle.ads.internal.util.a(this, 5);

    public C4704j2(C5123zc c5123zc, IHandlerExecutor iHandlerExecutor, long j4) {
        this.f41101a = c5123zc;
        this.f41102b = iHandlerExecutor;
        this.f41103c = j4;
    }

    public static final void a(C4704j2 c4704j2) {
        Ac ac = c4704j2.f41101a.f42175a;
        Gi gi = ac.f40273h;
        gi.f39540c.a(ac.f40267b.f40683a);
    }
}

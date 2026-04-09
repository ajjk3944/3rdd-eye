package com.yandex.mobile.ads.impl;

import c9.C2079C;
import java.util.Set;
import s9.AbstractC5588a;

/* loaded from: classes3.dex */
public final class dd2 {

    /* renamed from: c, reason: collision with root package name */
    static final /* synthetic */ w9.i<Object>[] f26140c;

    /* renamed from: a, reason: collision with root package name */
    private final Set<cd2> f26141a = C2079C.b(cd2.f25601b);

    /* renamed from: b, reason: collision with root package name */
    private final a f26142b = new a(this);

    public static final class a extends AbstractC5588a<cd2> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ dd2 f26143a;

        /* JADX WARN: Illegal instructions before constructor call */
        public a(dd2 dd2Var) {
            cd2 cd2Var = cd2.f25601b;
            this.f26143a = dd2Var;
            super(cd2Var);
        }

        @Override // s9.AbstractC5588a
        public final void afterChange(w9.i<?> property, cd2 cd2Var, cd2 cd2Var2) {
            kotlin.jvm.internal.l.f(property, "property");
            this.f26143a.f26141a.add(cd2Var2);
        }
    }

    static {
        kotlin.jvm.internal.n nVar = new kotlin.jvm.internal.n(dd2.class, "status", "getStatus()Lcom/monetization/ads/instream/status/VideoAdStatus;");
        kotlin.jvm.internal.x.f43661a.getClass();
        f26140c = new w9.i[]{nVar};
    }

    public final void b() {
        this.f26141a.clear();
        cd2 cd2Var = cd2.f25601b;
        kotlin.jvm.internal.l.f(cd2Var, "<set-?>");
        this.f26142b.setValue(this, f26140c[0], cd2Var);
    }

    public final cd2 a() {
        return this.f26142b.getValue(this, f26140c[0]);
    }

    public final boolean a(cd2 videoAdStatus) {
        kotlin.jvm.internal.l.f(videoAdStatus, "videoAdStatus");
        return this.f26141a.contains(videoAdStatus);
    }

    public final void b(cd2 cd2Var) {
        kotlin.jvm.internal.l.f(cd2Var, "<set-?>");
        this.f26142b.setValue(this, f26140c[0], cd2Var);
    }
}

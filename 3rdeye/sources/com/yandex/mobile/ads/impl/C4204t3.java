package com.yandex.mobile.ads.impl;

import android.content.Context;
import b9.C1992A;
import com.yandex.mobile.ads.impl.nn0;

/* renamed from: com.yandex.mobile.ads.impl.t3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4204t3 {

    /* renamed from: a, reason: collision with root package name */
    private final zs f33383a;

    /* renamed from: b, reason: collision with root package name */
    private final lm0 f33384b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC4218v3 f33385c;

    /* renamed from: d, reason: collision with root package name */
    private final nn0 f33386d;

    /* renamed from: e, reason: collision with root package name */
    private final C4163n3 f33387e;

    /* renamed from: f, reason: collision with root package name */
    private final ab2 f33388f;

    /* renamed from: g, reason: collision with root package name */
    private final C4197s3 f33389g;

    /* renamed from: h, reason: collision with root package name */
    private final C4190r3 f33390h;
    private final sk1 i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f33391j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f33392k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f33393l;

    public C4204t3(Context context, zs coreInstreamAdBreak, wl0 adPlayerController, lm0 uiElementsManager, pm0 adViewsHolderManager, InterfaceC4218v3 adGroupPlaybackEventsListener) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(coreInstreamAdBreak, "coreInstreamAdBreak");
        kotlin.jvm.internal.l.f(adPlayerController, "adPlayerController");
        kotlin.jvm.internal.l.f(uiElementsManager, "uiElementsManager");
        kotlin.jvm.internal.l.f(adViewsHolderManager, "adViewsHolderManager");
        kotlin.jvm.internal.l.f(adGroupPlaybackEventsListener, "adGroupPlaybackEventsListener");
        this.f33383a = coreInstreamAdBreak;
        this.f33384b = uiElementsManager;
        this.f33385c = adGroupPlaybackEventsListener;
        this.f33386d = nn0.a.a();
        sk1 sk1Var = new sk1(context);
        this.i = sk1Var;
        ab2 ab2Var = new ab2();
        this.f33388f = ab2Var;
        C4211u3 c4211u3 = new C4211u3(ab2Var, new a(this, adGroupPlaybackEventsListener));
        C4163n3 c4163n3A = new C4170o3(context, coreInstreamAdBreak, adPlayerController, sk1Var, adViewsHolderManager, c4211u3).a();
        this.f33387e = c4163n3A;
        c4211u3.a(c4163n3A);
        this.f33389g = new C4197s3(c4163n3A);
        this.f33390h = new C4190r3(c4163n3A, uiElementsManager, adGroupPlaybackEventsListener, this);
    }

    public static final void a(C4204t3 c4204t3) {
        mb2<tn0> mb2VarB = c4204t3.f33387e.b();
        zf2 zf2VarD = c4204t3.f33387e.d();
        if (mb2VarB == null || zf2VarD == null) {
            fp0.b(new Object[0]);
        } else {
            c4204t3.f33384b.a(c4204t3.f33383a, mb2VarB, zf2VarD, c4204t3.f33388f, c4204t3.i);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.t3$a */
    public final class a implements dv {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC4218v3 f33394a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C4204t3 f33395b;

        public a(C4204t3 c4204t3, InterfaceC4218v3 adGroupPlaybackListener) {
            kotlin.jvm.internal.l.f(adGroupPlaybackListener, "adGroupPlaybackListener");
            this.f33395b = c4204t3;
            this.f33394a = adGroupPlaybackListener;
        }

        private static final void a(C4204t3 this$0) {
            kotlin.jvm.internal.l.f(this$0, "this$0");
            this$0.f33385c.g();
        }

        private static final void c(C4204t3 this$0) {
            kotlin.jvm.internal.l.f(this$0, "this$0");
            this$0.f33385c.j();
        }

        @Override // com.yandex.mobile.ads.impl.dv
        public final void b(mb2<tn0> videoAdInfo) {
            kotlin.jvm.internal.l.f(videoAdInfo, "videoAdInfo");
            this.f33394a.e();
        }

        @Override // com.yandex.mobile.ads.impl.dv
        public final void d(mb2<tn0> videoAdInfo) {
            kotlin.jvm.internal.l.f(videoAdInfo, "videoAdInfo");
            if (!this.f33395b.f33393l) {
                this.f33395b.f33393l = true;
                this.f33394a.h();
            }
            this.f33394a.i();
            if (this.f33395b.f33391j) {
                this.f33395b.f33391j = false;
                this.f33395b.d();
            }
        }

        @Override // com.yandex.mobile.ads.impl.dv
        public final void e(mb2<tn0> videoAdInfo) {
            kotlin.jvm.internal.l.f(videoAdInfo, "videoAdInfo");
            if (this.f33395b.f33387e.e() != null) {
                this.f33395b.f33384b.a();
                return;
            }
            C4204t3 c4204t3 = this.f33395b;
            c4204t3.f33384b.a();
            e(c4204t3);
        }

        @Override // com.yandex.mobile.ads.impl.dv
        public final void f(mb2<tn0> videoAdInfo) {
            kotlin.jvm.internal.l.f(videoAdInfo, "videoAdInfo");
            this.f33394a.d();
        }

        @Override // com.yandex.mobile.ads.impl.dv
        public final void g(mb2<tn0> videoAdInfo) {
            kotlin.jvm.internal.l.f(videoAdInfo, "videoAdInfo");
            C4204t3 c4204t3 = this.f33395b;
            if (c4204t3.f33387e.e() != null) {
                this.f33395b.f33390h.a(true);
            } else {
                this.f33395b.f33384b.a();
                a(c4204t3);
            }
        }

        private static final void b(C4204t3 this$0) {
            kotlin.jvm.internal.l.f(this$0, "this$0");
            this$0.f33389g.c();
            this$0.f33385c.k();
        }

        @Override // com.yandex.mobile.ads.impl.dv
        public final void a(mb2<tn0> videoAdInfo, kc2 videoAdPlayerError) {
            kotlin.jvm.internal.l.f(videoAdInfo, "videoAdInfo");
            kotlin.jvm.internal.l.f(videoAdPlayerError, "videoAdPlayerError");
            C4225w3 c4225w3A = this.f33395b.f33387e.a(videoAdInfo);
            dd2 dd2VarB = c4225w3A != null ? c4225w3A.b() : null;
            if ((dd2VarB != null ? dd2VarB.a() : null) == cd2.f25609k) {
                C4204t3 c4204t3 = this.f33395b;
                if (c4204t3.f33387e.e() != null) {
                    this.f33395b.f33390h.a(false);
                    return;
                } else {
                    this.f33395b.f33384b.a();
                    b(c4204t3);
                    return;
                }
            }
            C4204t3 c4204t32 = this.f33395b;
            if (c4204t32.f33387e.e() != null) {
                this.f33395b.f33390h.a(true);
            } else {
                this.f33395b.f33384b.a();
                c(c4204t32);
            }
        }

        @Override // com.yandex.mobile.ads.impl.dv
        public final void c(mb2<tn0> videoAdInfo) {
            kotlin.jvm.internal.l.f(videoAdInfo, "videoAdInfo");
            if (!this.f33395b.f33392k) {
                this.f33395b.f33392k = true;
                this.f33394a.f();
            }
            this.f33395b.f33391j = false;
            C4204t3.a(this.f33395b);
            this.f33394a.a();
        }

        private static final void e(C4204t3 this$0) {
            kotlin.jvm.internal.l.f(this$0, "this$0");
            this$0.f33385c.g();
        }

        private static final void d(C4204t3 this$0) {
            kotlin.jvm.internal.l.f(this$0, "this$0");
            this$0.f33385c.g();
        }

        @Override // com.yandex.mobile.ads.impl.dv
        public final void a(mb2<tn0> videoAdInfo) {
            kotlin.jvm.internal.l.f(videoAdInfo, "videoAdInfo");
            if (this.f33395b.f33386d.f()) {
                this.f33395b.f33389g.c();
                this.f33395b.f33387e.a();
            }
            C4204t3 c4204t3 = this.f33395b;
            if (c4204t3.f33387e.e() != null) {
                this.f33395b.f33390h.a(true);
            } else {
                this.f33395b.f33384b.a();
                d(c4204t3);
            }
        }
    }

    public final void b() {
        this.f33391j = true;
    }

    public final void c() {
        C1992A c1992a;
        qn0 qn0VarC = this.f33387e.c();
        if (qn0VarC != null) {
            qn0VarC.b();
            c1992a = C1992A.f18074a;
        } else {
            c1992a = null;
        }
        if (c1992a == null) {
            fp0.b(new Object[0]);
        }
    }

    public final void d() {
        C1992A c1992a;
        qn0 qn0VarC = this.f33387e.c();
        if (qn0VarC != null) {
            this.f33391j = false;
            qn0VarC.c();
            c1992a = C1992A.f18074a;
        } else {
            c1992a = null;
        }
        if (c1992a == null) {
            fp0.b(new Object[0]);
        }
        this.f33389g.b();
    }

    public final void e() {
        C1992A c1992a;
        qn0 qn0VarC = this.f33387e.c();
        if (qn0VarC != null) {
            qn0VarC.d();
            c1992a = C1992A.f18074a;
        } else {
            c1992a = null;
        }
        if (c1992a == null) {
            fp0.b(new Object[0]);
        }
    }

    public final void f() {
        C1992A c1992a;
        mb2<tn0> mb2VarB = this.f33387e.b();
        zf2 zf2VarD = this.f33387e.d();
        if (mb2VarB == null || zf2VarD == null) {
            fp0.b(new Object[0]);
        } else {
            this.f33384b.a(this.f33383a, mb2VarB, zf2VarD, this.f33388f, this.i);
        }
        qn0 qn0VarC = this.f33387e.c();
        if (qn0VarC != null) {
            qn0VarC.f();
            c1992a = C1992A.f18074a;
        } else {
            c1992a = null;
        }
        if (c1992a == null) {
            fp0.b(new Object[0]);
        }
    }

    public final void g() {
        C1992A c1992a;
        qn0 qn0VarC = this.f33387e.c();
        if (qn0VarC != null) {
            qn0VarC.g();
            c1992a = C1992A.f18074a;
        } else {
            c1992a = null;
        }
        if (c1992a == null) {
            fp0.b(new Object[0]);
        }
        this.f33389g.c();
    }

    public final void a() {
        qn0 qn0VarC = this.f33387e.c();
        if (qn0VarC != null) {
            qn0VarC.a();
        }
        this.f33389g.a();
        this.f33391j = false;
        this.f33393l = false;
        this.f33392k = false;
    }

    public final void a(yn0 yn0Var) {
        this.f33388f.a(yn0Var);
    }
}

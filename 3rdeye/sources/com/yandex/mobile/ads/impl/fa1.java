package com.yandex.mobile.ads.impl;

import A9.C0583j;
import A9.InterfaceC0581i;
import android.content.Context;
import b9.C1992A;
import f9.InterfaceC4347e;

/* loaded from: classes3.dex */
public final class fa1 {

    /* renamed from: a, reason: collision with root package name */
    private final oa2 f27252a;

    /* renamed from: b, reason: collision with root package name */
    private final ea1 f27253b;

    public static final class a implements pa2 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC0581i<C1992A> f27254a;

        public a(C0583j c0583j) {
            this.f27254a = c0583j;
        }

        @Override // com.yandex.mobile.ads.impl.pa2
        public final void a() {
            this.f27254a.resumeWith(C1992A.f18074a);
        }
    }

    public /* synthetic */ fa1(Context context, qa2 qa2Var) {
        this(context, qa2Var, qa2Var.a(context), new ea1());
    }

    public final void a() {
        oa2 oa2Var = this.f27252a;
        if (oa2Var != null) {
            oa2Var.a();
        }
    }

    public final Object a(j41 j41Var, InterfaceC4347e<? super C1992A> interfaceC4347e) {
        C0583j c0583j = new C0583j(1, com.google.gson.internal.c.r(interfaceC4347e));
        c0583j.s();
        if (this.f27252a == null || !this.f27253b.a(j41Var)) {
            c0583j.resumeWith(C1992A.f18074a);
        } else {
            this.f27252a.a(new a(c0583j));
        }
        Object objR = c0583j.r();
        return objR == g9.a.COROUTINE_SUSPENDED ? objR : C1992A.f18074a;
    }

    public fa1(Context context, qa2 verificationResourcesLoaderProvider, oa2 oa2Var, ea1 verificationPresenceValidator) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(verificationResourcesLoaderProvider, "verificationResourcesLoaderProvider");
        kotlin.jvm.internal.l.f(verificationPresenceValidator, "verificationPresenceValidator");
        this.f27252a = oa2Var;
        this.f27253b = verificationPresenceValidator;
    }
}

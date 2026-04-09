package com.yandex.mobile.ads.impl;

import A9.C0575f;
import android.content.Context;
import b9.C1992A;
import com.yandex.mobile.ads.impl.c11;
import com.yandex.mobile.ads.impl.ew1;
import com.yandex.mobile.ads.impl.l11;
import com.yandex.mobile.ads.impl.u01;
import f9.InterfaceC4350h;
import p9.InterfaceC5480a;

/* loaded from: classes3.dex */
public final class f11 {

    /* renamed from: a, reason: collision with root package name */
    public static final f11 f27170a = new f11();

    public static final class a extends kotlin.jvm.internal.m implements InterfaceC5480a<C1992A> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f27171b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ vu1 f27172c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ws f27173d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, vu1 vu1Var, ws wsVar) {
            super(0);
            this.f27171b = context;
            this.f27172c = vu1Var;
            this.f27173d = wsVar;
        }

        @Override // p9.InterfaceC5480a
        public final C1992A invoke() {
            f11.a(f11.f27170a, this.f27171b, this.f27172c, this.f27173d);
            return C1992A.f18074a;
        }
    }

    public static final class b extends kotlin.jvm.internal.m implements InterfaceC5480a<C1992A> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f27174b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ vu1 f27175c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ws f27176d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context, vu1 vu1Var, ws wsVar) {
            super(0);
            this.f27174b = context;
            this.f27175c = vu1Var;
            this.f27176d = wsVar;
        }

        @Override // p9.InterfaceC5480a
        public final C1992A invoke() {
            f11.b(f11.f27170a, this.f27174b, this.f27175c, this.f27176d);
            return C1992A.f18074a;
        }
    }

    private f11() {
    }

    public static final void a(f11 f11Var, Context context, vu1 vu1Var, ws wsVar) {
        f11Var.getClass();
        if (new di().a()) {
            return;
        }
        C0575f.e(A9.F.a(InterfaceC4350h.a.C0456a.d(C0575f.a(), A9.U.f212b)), new ss0(), null, new g11(context, vu1Var, null), 2);
        new hj2(new fl1()).a();
        new zs0(context).a();
        u01.a.a(vu1Var).a(context, wsVar);
    }

    public static final void b(f11 f11Var, Context context, vu1 vu1Var, ws wsVar) {
        f11Var.getClass();
        C0575f.e(A9.F.a(InterfaceC4350h.a.C0456a.d(C0575f.a(), A9.U.f212b)), new ss0(), null, new g11(context, vu1Var, null), 2);
        wsVar.onInitializationCompleted();
    }

    public static final void b(boolean z10) {
        ew1.a.a().c(z10);
    }

    public static final void a(boolean z10) {
        fp0.a(z10);
        uo0.a(z10);
        if (z10) {
            return;
        }
        l11.a.a().c();
        c11.a.a().c();
    }

    public static final void a(Context context, vu1 sdkEnvironmentModule, ws initializationListener) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(sdkEnvironmentModule, "sdkEnvironmentModule");
        kotlin.jvm.internal.l.f(initializationListener, "initializationListener");
        new p80(new ws0()).a(new a(context, sdkEnvironmentModule, initializationListener), new b(context, sdkEnvironmentModule, initializationListener));
    }
}

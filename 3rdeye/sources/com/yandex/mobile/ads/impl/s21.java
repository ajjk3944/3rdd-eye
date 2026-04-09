package com.yandex.mobile.ads.impl;

import A9.C0575f;
import A9.C0583j;
import A9.InterfaceC0581i;
import android.content.Context;
import b9.C1992A;
import com.yandex.mobile.ads.impl.m21;
import f9.InterfaceC4347e;

/* loaded from: classes3.dex */
public final class s21 {

    /* renamed from: a, reason: collision with root package name */
    private final bt1 f32843a;

    public interface a {
        void a();
    }

    public static final class b implements m21.a {

        /* renamed from: a, reason: collision with root package name */
        private final t21 f32844a;

        /* renamed from: b, reason: collision with root package name */
        private final ku0 f32845b;

        /* renamed from: c, reason: collision with root package name */
        private final a f32846c;

        public b(t21 mraidWebViewPool, ku0 media, c.a listener) {
            kotlin.jvm.internal.l.f(mraidWebViewPool, "mraidWebViewPool");
            kotlin.jvm.internal.l.f(media, "media");
            kotlin.jvm.internal.l.f(listener, "listener");
            this.f32844a = mraidWebViewPool;
            this.f32845b = media;
            this.f32846c = listener;
        }

        @Override // com.yandex.mobile.ads.impl.m21.a
        public final void a() {
            this.f32844a.b(this.f32845b);
            this.f32846c.a();
        }

        @Override // com.yandex.mobile.ads.impl.m21.a
        public final void b() {
            this.f32846c.a();
        }
    }

    @h9.e(c = "com.monetization.ads.base.webview.mraid.MraidWebViewLoader$loadWebView$2", f = "MraidWebViewLoader.kt", l = {62}, m = "invokeSuspend")
    public static final class c extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super C1992A>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f32847b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f32848c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ku0 f32849d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ s21 f32850e;

        public static final class a implements a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC0581i<C1992A> f32851a;

            public a(C0583j c0583j) {
                this.f32851a = c0583j;
            }

            @Override // com.yandex.mobile.ads.impl.s21.a
            public final void a() {
                if (this.f32851a.isActive()) {
                    this.f32851a.resumeWith(C1992A.f18074a);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context, ku0 ku0Var, s21 s21Var, InterfaceC4347e<? super c> interfaceC4347e) {
            super(2, interfaceC4347e);
            this.f32848c = context;
            this.f32849d = ku0Var;
            this.f32850e = s21Var;
        }

        @Override // h9.AbstractC4424a
        public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
            return new c(this.f32848c, this.f32849d, this.f32850e, interfaceC4347e);
        }

        @Override // p9.p
        public final Object invoke(A9.E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
            return ((c) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            m21 m21Var;
            g9.a aVar = g9.a.COROUTINE_SUSPENDED;
            int i = this.f32847b;
            if (i == 0) {
                b9.n.b(obj);
                t21 t21VarA = t21.f33379c.a(this.f32848c);
                String strB = this.f32849d.b();
                if (t21VarA.b() || t21VarA.a(this.f32849d) || strB == null) {
                    return C1992A.f18074a;
                }
                bt1 bt1Var = this.f32850e.f32843a;
                Context context = this.f32848c;
                bt1Var.getClass();
                kotlin.jvm.internal.l.f(context, "context");
                try {
                    m21Var = new m21(context);
                } catch (Throwable unused) {
                    m21Var = null;
                }
                if (m21Var == null) {
                    return C1992A.f18074a;
                }
                ku0 ku0Var = this.f32849d;
                this.f32847b = 1;
                C0583j c0583j = new C0583j(1, com.google.gson.internal.c.r(this));
                c0583j.s();
                m21Var.setPreloadListener(new b(t21VarA, ku0Var, new a(c0583j)));
                t21VarA.a(m21Var, ku0Var);
                m21Var.c(strB);
                Object objR = c0583j.r();
                g9.a aVar2 = g9.a.COROUTINE_SUSPENDED;
                if (objR == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b9.n.b(obj);
            }
            return C1992A.f18074a;
        }
    }

    public /* synthetic */ s21() {
        this(new bt1());
    }

    public final Object a(Context context, ku0 ku0Var, InterfaceC4347e<? super C1992A> interfaceC4347e) throws Throwable {
        I9.c cVar = A9.U.f211a;
        Object objH = C0575f.h(F9.q.f1782a.R0(), new c(context, ku0Var, this, null), interfaceC4347e);
        return objH == g9.a.COROUTINE_SUSPENDED ? objH : C1992A.f18074a;
    }

    public s21(bt1 safeMraidWebViewFactory) {
        kotlin.jvm.internal.l.f(safeMraidWebViewFactory, "safeMraidWebViewFactory");
        this.f32843a = safeMraidWebViewFactory;
    }
}

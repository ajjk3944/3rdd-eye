package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.mobile.ads.impl.ew1;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public final class fs1<V extends ViewGroup> implements w00<V> {

    /* renamed from: a, reason: collision with root package name */
    private final a8<?> f27445a;

    /* renamed from: b, reason: collision with root package name */
    private final C4070a1 f27446b;

    /* renamed from: c, reason: collision with root package name */
    private final tr f27447c;

    /* renamed from: d, reason: collision with root package name */
    private final s41 f27448d;

    /* renamed from: e, reason: collision with root package name */
    private final c91 f27449e;

    /* renamed from: f, reason: collision with root package name */
    private final s42 f27450f;

    /* renamed from: g, reason: collision with root package name */
    private final w20 f27451g;

    /* renamed from: h, reason: collision with root package name */
    private final qp f27452h;
    private sc0 i;

    /* renamed from: j, reason: collision with root package name */
    private fs1<V>.b f27453j;

    public static final class a implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        private final tr f27454a;

        public a(tr contentCloseListener) {
            kotlin.jvm.internal.l.f(contentCloseListener, "contentCloseListener");
            this.f27454a = contentCloseListener;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.f27454a.f();
        }
    }

    public final class b implements InterfaceC4077b1 {
        public b() {
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC4077b1
        public final void a() {
            sc0 sc0Var = ((fs1) fs1.this).i;
            if (sc0Var != null) {
                sc0Var.resume();
            }
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC4077b1
        public final void b() {
            sc0 sc0Var = ((fs1) fs1.this).i;
            if (sc0Var != null) {
                sc0Var.pause();
            }
        }
    }

    public static final class c implements tp {

        /* renamed from: a, reason: collision with root package name */
        private final WeakReference<View> f27456a;

        public c(View closeView, WeakReference<View> closeViewReference) {
            kotlin.jvm.internal.l.f(closeView, "closeView");
            kotlin.jvm.internal.l.f(closeViewReference, "closeViewReference");
            this.f27456a = closeViewReference;
        }

        @Override // com.yandex.mobile.ads.impl.tp
        public final void a() {
            View view = this.f27456a.get();
            if (view != null) {
                view.setVisibility(0);
            }
        }
    }

    public fs1(a8 adResponse, C4070a1 adActivityEventController, tr contentCloseListener, u41 nativeAdControlViewProvider, c91 nativeMediaContent, s42 timeProviderContainer, w20 w20Var, qp closeControllerProvider) {
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        kotlin.jvm.internal.l.f(adActivityEventController, "adActivityEventController");
        kotlin.jvm.internal.l.f(contentCloseListener, "contentCloseListener");
        kotlin.jvm.internal.l.f(nativeAdControlViewProvider, "nativeAdControlViewProvider");
        kotlin.jvm.internal.l.f(nativeMediaContent, "nativeMediaContent");
        kotlin.jvm.internal.l.f(timeProviderContainer, "timeProviderContainer");
        kotlin.jvm.internal.l.f(closeControllerProvider, "closeControllerProvider");
        this.f27445a = adResponse;
        this.f27446b = adActivityEventController;
        this.f27447c = contentCloseListener;
        this.f27448d = nativeAdControlViewProvider;
        this.f27449e = nativeMediaContent;
        this.f27450f = timeProviderContainer;
        this.f27451g = w20Var;
        this.f27452h = closeControllerProvider;
    }

    @Override // com.yandex.mobile.ads.impl.w00
    public final void c() {
        fs1<V>.b bVar = this.f27453j;
        if (bVar != null) {
            this.f27446b.b(bVar);
        }
        sc0 sc0Var = this.i;
        if (sc0Var != null) {
            sc0Var.invalidate();
        }
    }

    @Override // com.yandex.mobile.ads.impl.w00
    public final void a(V container) {
        sc0 e81Var;
        sc0 wb1Var;
        kotlin.jvm.internal.l.f(container, "container");
        View viewC = this.f27448d.c(container);
        if (viewC != null) {
            fs1<V>.b bVar = new b();
            this.f27446b.a(bVar);
            this.f27453j = bVar;
            Context context = viewC.getContext();
            ew1 ew1VarA = ew1.a.a();
            kotlin.jvm.internal.l.c(context);
            du1 du1VarA = ew1VarA.a(context);
            boolean z10 = false;
            boolean z11 = du1VarA != null && du1VarA.D0();
            if (kotlin.jvm.internal.l.b(b10.f25040c.a(), this.f27445a.w()) && z11) {
                z10 = true;
            }
            if (!z10) {
                viewC.setOnClickListener(new a(this.f27447c));
            }
            viewC.setVisibility(8);
            c cVar = new c(viewC, new WeakReference(viewC));
            qp qpVar = this.f27452h;
            a8<?> adResponse = this.f27445a;
            c91 nativeMediaContent = this.f27449e;
            s42 timeProviderContainer = this.f27450f;
            w20 w20Var = this.f27451g;
            qpVar.getClass();
            kotlin.jvm.internal.l.f(adResponse, "adResponse");
            kotlin.jvm.internal.l.f(nativeMediaContent, "nativeMediaContent");
            kotlin.jvm.internal.l.f(timeProviderContainer, "timeProviderContainer");
            ta1 ta1VarA = nativeMediaContent.a();
            yb1 yb1VarB = nativeMediaContent.b();
            sc0 sc0Var = null;
            if (kotlin.jvm.internal.l.b(w20Var != null ? w20Var.e() : null, c10.f25493d.a()) && timeProviderContainer.b().a()) {
                e81Var = new e81(adResponse, cVar, timeProviderContainer);
            } else {
                if (ta1VarA != null) {
                    wb1Var = new ra1(adResponse, ta1VarA, cVar, timeProviderContainer, adResponse.u(), timeProviderContainer.c(), timeProviderContainer.b());
                } else if (yb1VarB != null) {
                    wb1Var = new wb1(yb1VarB, cVar);
                } else {
                    e81Var = timeProviderContainer.b().a() ? new e81(adResponse, cVar, timeProviderContainer) : null;
                }
                e81Var = wb1Var;
            }
            if (e81Var != null) {
                e81Var.start();
                sc0Var = e81Var;
            }
            this.i = sc0Var;
        }
    }
}

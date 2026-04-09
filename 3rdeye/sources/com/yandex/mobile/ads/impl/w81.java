package com.yandex.mobile.ads.impl;

import A9.C0575f;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import b9.C1992A;
import com.yandex.mobile.ads.impl.uj0;
import f9.InterfaceC4347e;
import java.util.Set;

/* loaded from: classes3.dex */
public final class w81 {

    /* renamed from: a, reason: collision with root package name */
    private final A9.E f34846a;

    /* renamed from: b, reason: collision with root package name */
    private final C4198s4 f34847b;

    /* renamed from: c, reason: collision with root package name */
    private final ug f34848c;

    /* renamed from: d, reason: collision with root package name */
    private final oj0 f34849d;

    /* renamed from: e, reason: collision with root package name */
    private final wi0 f34850e;

    /* renamed from: f, reason: collision with root package name */
    private final uj0 f34851f;

    /* renamed from: g, reason: collision with root package name */
    private final p9.l<ej0, dj0> f34852g;

    @h9.e(c = "com.monetization.ads.nativeads.creator.NativeImagesLoader", f = "NativeImagesLoader.kt", l = {49}, m = "loadImages")
    public static final class a extends h9.c {

        /* renamed from: b, reason: collision with root package name */
        w81 f34853b;

        /* renamed from: c, reason: collision with root package name */
        ej0 f34854c;

        /* renamed from: d, reason: collision with root package name */
        j41 f34855d;

        /* renamed from: e, reason: collision with root package name */
        C4198s4 f34856e;

        /* renamed from: f, reason: collision with root package name */
        EnumC4191r4 f34857f;

        /* renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f34858g;
        int i;

        public a(InterfaceC4347e<? super a> interfaceC4347e) {
            super(interfaceC4347e);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            this.f34858g = obj;
            this.i |= RecyclerView.UNDEFINED_DURATION;
            return w81.a(w81.this, this);
        }
    }

    public /* synthetic */ w81(Context context, A9.E e4, C4198s4 c4198s4) {
        this(context, e4, c4198s4, new ug(), new oj0(), new wi0(context), new uj0(), v81.f34412b);
    }

    public static final /* synthetic */ Object a(w81 w81Var, InterfaceC4347e interfaceC4347e) {
        return w81Var.a(null, null, null, interfaceC4347e);
    }

    public final Object a(j41 j41Var, ej0 ej0Var, InterfaceC4347e<? super C1992A> interfaceC4347e) {
        dj0 dj0VarInvoke = this.f34852g.invoke(ej0Var);
        uj0.a aVarA = this.f34851f.a(j41Var);
        Set<jj0> setA = aVarA.a();
        Set<jj0> setB = aVarA.b();
        Set<jj0> setC = aVarA.c();
        dj0VarInvoke.a(setB);
        if (kotlin.jvm.internal.l.b(j41Var.b().E(), s81.f32896d.a())) {
            C0575f.e(this.f34846a, null, null, new x81(this.f34850e.a(setC), ej0Var, null), 3);
        }
        Object objA = a(setA, ej0Var, j41Var, interfaceC4347e);
        return objA == g9.a.COROUTINE_SUSPENDED ? objA : C1992A.f18074a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public w81(Context context, A9.E coroutineScope, C4198s4 adLoadingPhasesManager, ug assetsFilter, oj0 imageValuesFilter, wi0 imageLoadManager, uj0 imagesForPreloadingProvider, p9.l<? super ej0, dj0> previewPreloadingFactory) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(coroutineScope, "coroutineScope");
        kotlin.jvm.internal.l.f(adLoadingPhasesManager, "adLoadingPhasesManager");
        kotlin.jvm.internal.l.f(assetsFilter, "assetsFilter");
        kotlin.jvm.internal.l.f(imageValuesFilter, "imageValuesFilter");
        kotlin.jvm.internal.l.f(imageLoadManager, "imageLoadManager");
        kotlin.jvm.internal.l.f(imagesForPreloadingProvider, "imagesForPreloadingProvider");
        kotlin.jvm.internal.l.f(previewPreloadingFactory, "previewPreloadingFactory");
        this.f34846a = coroutineScope;
        this.f34847b = adLoadingPhasesManager;
        this.f34848c = assetsFilter;
        this.f34849d = imageValuesFilter;
        this.f34850e = imageLoadManager;
        this.f34851f = imagesForPreloadingProvider;
        this.f34852g = previewPreloadingFactory;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object a(java.util.Set<com.yandex.mobile.ads.impl.jj0> r7, com.yandex.mobile.ads.impl.ej0 r8, com.yandex.mobile.ads.impl.j41 r9, f9.InterfaceC4347e<? super b9.C1992A> r10) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.w81.a(java.util.Set, com.yandex.mobile.ads.impl.ej0, com.yandex.mobile.ads.impl.j41, f9.e):java.lang.Object");
    }
}

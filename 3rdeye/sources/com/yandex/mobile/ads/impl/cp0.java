package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;

/* loaded from: classes3.dex */
public final class cp0 {

    public static final class a implements bp0 {

        /* renamed from: a, reason: collision with root package name */
        private final ti f25745a;

        public a(ti viewController) {
            kotlin.jvm.internal.l.f(viewController, "viewController");
            this.f25745a = viewController;
        }

        @Override // com.yandex.mobile.ads.impl.bp0
        public final void a(Context context, View view) {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(view, "view");
        }

        @Override // com.yandex.mobile.ads.impl.bp0
        public final void b(Context context) {
            kotlin.jvm.internal.l.f(context, "context");
            int i = aa.f24578b;
            if (aa.a((lo) this.f25745a)) {
                return;
            }
            this.f25745a.v();
        }

        @Override // com.yandex.mobile.ads.impl.bp0
        public final void a(Context context) {
            kotlin.jvm.internal.l.f(context, "context");
            int i = aa.f24578b;
            if (aa.a((lo) this.f25745a)) {
                return;
            }
            this.f25745a.w();
        }
    }

    public static bp0 a(View view, ti controller) {
        kotlin.jvm.internal.l.f(view, "view");
        kotlin.jvm.internal.l.f(controller, "controller");
        return view.isInEditMode() ? new b() : new a(controller);
    }

    public static final class b implements bp0 {
        @Override // com.yandex.mobile.ads.impl.bp0
        public final void a(Context context, View view) {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(view, "view");
            view.setVisibility(0);
            view.setMinimumHeight(jh2.a(context, 50.0f));
        }

        @Override // com.yandex.mobile.ads.impl.bp0
        public final void b(Context context) {
            kotlin.jvm.internal.l.f(context, "context");
        }

        @Override // com.yandex.mobile.ads.impl.bp0
        public final void a(Context context) {
            kotlin.jvm.internal.l.f(context, "context");
        }
    }
}

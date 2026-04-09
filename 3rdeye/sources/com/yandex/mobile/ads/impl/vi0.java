package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Bitmap;
import c9.C2077A;
import com.yandex.mobile.ads.impl.aj0;

/* loaded from: classes3.dex */
public final class vi0 {

    /* renamed from: a, reason: collision with root package name */
    private final a f34546a;

    /* renamed from: b, reason: collision with root package name */
    private final ej0 f34547b;

    /* renamed from: c, reason: collision with root package name */
    private final aj0 f34548c;

    public interface a {
        boolean a();
    }

    public interface b {
        void a(Bitmap bitmap);
    }

    public static final class c implements aj0.d {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f34550b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f34551c;

        public c(String str, b bVar) {
            this.f34550b = str;
            this.f34551c = bVar;
        }

        @Override // com.yandex.mobile.ads.impl.rq1.a
        public final void a(fi2 fi2Var) {
        }

        @Override // com.yandex.mobile.ads.impl.aj0.d
        public final void a(aj0.c cVar, boolean z10) {
            Bitmap bitmapB = cVar.b();
            if (bitmapB != null) {
                vi0 vi0Var = vi0.this;
                String str = this.f34550b;
                b bVar = this.f34551c;
                vi0Var.f34547b.a(C2077A.m(new b9.l(str, bitmapB)));
                bVar.a(bitmapB);
            }
        }
    }

    public /* synthetic */ vi0(Context context, a aVar, ej0 ej0Var) {
        this(context, aVar, ej0Var, yc1.f35708c.a(context).b());
    }

    public final void a(jj0 imageValue, b listener) {
        kotlin.jvm.internal.l.f(imageValue, "imageValue");
        kotlin.jvm.internal.l.f(listener, "listener");
        Bitmap bitmapB = this.f34547b.b(imageValue);
        if (bitmapB != null) {
            listener.a(bitmapB);
            return;
        }
        listener.a(this.f34547b.a(imageValue));
        if (this.f34546a.a()) {
            String strF = imageValue.f();
            int iA = imageValue.a();
            this.f34548c.a(strF, new c(strF, listener), imageValue.g(), iA);
        }
    }

    public vi0(Context context, a configuration, ej0 imageProvider, aj0 imageLoader) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(configuration, "configuration");
        kotlin.jvm.internal.l.f(imageProvider, "imageProvider");
        kotlin.jvm.internal.l.f(imageLoader, "imageLoader");
        this.f34546a = configuration;
        this.f34547b = imageProvider;
        this.f34548c = imageLoader;
    }
}

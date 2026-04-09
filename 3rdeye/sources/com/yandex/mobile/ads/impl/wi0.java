package com.yandex.mobile.ads.impl;

import A9.C0583j;
import A9.InterfaceC0581i;
import D9.C0640b;
import D9.InterfaceC0644f;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import b9.C1992A;
import c9.C2100u;
import com.yandex.mobile.ads.impl.aj0;
import com.yandex.mobile.ads.impl.tj0;
import com.yandex.mobile.ads.impl.wi0;
import com.yandex.mobile.ads.impl.yc1;
import f9.C4351i;
import f9.InterfaceC4347e;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class wi0 {

    /* renamed from: a, reason: collision with root package name */
    private final aj0 f34975a;

    /* renamed from: b, reason: collision with root package name */
    private final yc1.c f34976b;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final aj0 f34977a;

        /* renamed from: b, reason: collision with root package name */
        private final Set<jj0> f34978b;

        /* renamed from: c, reason: collision with root package name */
        private final sj0 f34979c;

        /* renamed from: d, reason: collision with root package name */
        private final Handler f34980d;

        /* renamed from: e, reason: collision with root package name */
        private final AtomicInteger f34981e;

        /* renamed from: f, reason: collision with root package name */
        private final xz0 f34982f;

        public a(aj0 imageLoader, Set<jj0> imageValues, sj0 imagesFetchListener, Handler handler, AtomicInteger imageCounter, xz0 memoryUtils) {
            kotlin.jvm.internal.l.f(imageLoader, "imageLoader");
            kotlin.jvm.internal.l.f(imageValues, "imageValues");
            kotlin.jvm.internal.l.f(imagesFetchListener, "imagesFetchListener");
            kotlin.jvm.internal.l.f(handler, "handler");
            kotlin.jvm.internal.l.f(imageCounter, "imageCounter");
            kotlin.jvm.internal.l.f(memoryUtils, "memoryUtils");
            this.f34977a = imageLoader;
            this.f34978b = imageValues;
            this.f34979c = imagesFetchListener;
            this.f34980d = handler;
            this.f34981e = imageCounter;
            this.f34982f = memoryUtils;
        }

        public static final void a(a aVar, Map map) {
            if (aVar.f34981e.decrementAndGet() == 0) {
                aVar.f34979c.a(map);
            }
        }

        /* renamed from: com.yandex.mobile.ads.impl.wi0$a$a, reason: collision with other inner class name */
        public static final class C0424a implements aj0.d {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Map<String, Bitmap> f34984b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ jj0 f34985c;

            public C0424a(Map<String, Bitmap> map, jj0 jj0Var) {
                this.f34984b = map;
                this.f34985c = jj0Var;
            }

            @Override // com.yandex.mobile.ads.impl.rq1.a
            public final void a(fi2 error) {
                kotlin.jvm.internal.l.f(error, "error");
                fp0.a(error);
                a.a(a.this, this.f34984b);
            }

            @Override // com.yandex.mobile.ads.impl.aj0.d
            public final void a(aj0.c response, boolean z10) {
                kotlin.jvm.internal.l.f(response, "response");
                String strF = this.f34985c.f();
                Bitmap bitmapB = response.b();
                if (bitmapB != null) {
                    if (strF != null) {
                        this.f34984b.put(strF, bitmapB);
                        a.this.f34979c.a(strF, bitmapB);
                    }
                    a.a(a.this, this.f34984b);
                }
            }
        }

        private final boolean a(jj0 jj0Var) {
            int iA = jj0Var.a();
            int iG = jj0Var.g();
            this.f34982f.getClass();
            if (xz0.a() >= (iA * iG * 4) + 1048576.0f) {
                return true;
            }
            fp0.d(new Object[0]);
            return false;
        }

        public final void a() {
            final HashMap map = new HashMap();
            for (final jj0 jj0Var : this.f34978b) {
                final String strF = jj0Var.f();
                final int iA = jj0Var.a();
                final int iG = jj0Var.g();
                fp0.e(strF);
                if (a(jj0Var)) {
                    this.f34980d.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.V3
                        @Override // java.lang.Runnable
                        public final void run() {
                            HashMap map2 = map;
                            jj0 jj0Var2 = jj0Var;
                            wi0.a.a(this.f24287b, strF, iG, iA, (Map) map2, jj0Var2);
                        }
                    });
                } else if (this.f34981e.decrementAndGet() == 0) {
                    this.f34979c.a(map);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(a this$0, String fetchUrl, int i, int i10, Map loadedImages, jj0 imageValue) {
            kotlin.jvm.internal.l.f(this$0, "this$0");
            kotlin.jvm.internal.l.f(fetchUrl, "$fetchUrl");
            kotlin.jvm.internal.l.f(loadedImages, "$loadedImages");
            kotlin.jvm.internal.l.f(imageValue, "$imageValue");
            this$0.f34977a.a(fetchUrl, this$0.new C0424a(loadedImages, imageValue), i, i10);
        }
    }

    @h9.e(c = "com.monetization.ads.nativeads.ImageLoadManager$loadImageFlow$1", f = "ImageLoadManager.kt", l = {78}, m = "invokeSuspend")
    public static final class b extends h9.i implements p9.p<C9.u<? super ui0>, InterfaceC4347e<? super C1992A>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f34986b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f34987c;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Set<jj0> f34989e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Set<jj0> set, InterfaceC4347e<? super b> interfaceC4347e) {
            super(2, interfaceC4347e);
            this.f34989e = set;
        }

        @Override // h9.AbstractC4424a
        public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
            b bVar = wi0.this.new b(this.f34989e, interfaceC4347e);
            bVar.f34987c = obj;
            return bVar;
        }

        @Override // p9.p
        public final Object invoke(C9.u<? super ui0> uVar, InterfaceC4347e<? super C1992A> interfaceC4347e) {
            return ((b) create(uVar, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            g9.a aVar = g9.a.COROUTINE_SUSPENDED;
            int i = this.f34986b;
            if (i == 0) {
                b9.n.b(obj);
                C9.u uVar = (C9.u) this.f34987c;
                wi0.this.a(this.f34989e, new a(uVar));
                this.f34986b = 1;
                if (C9.s.a(uVar, C9.q.f1014g, this) == aVar) {
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

        public static final class a implements sj0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C9.u<ui0> f34990a;

            /* JADX WARN: Multi-variable type inference failed */
            public a(C9.u<? super ui0> uVar) {
                this.f34990a = uVar;
            }

            @Override // com.yandex.mobile.ads.impl.sj0
            public final void a(String url, Bitmap bitmap) {
                kotlin.jvm.internal.l.f(url, "url");
                kotlin.jvm.internal.l.f(bitmap, "bitmap");
                this.f34990a.i(new ui0(url, bitmap));
            }

            @Override // com.yandex.mobile.ads.impl.sj0
            public final void a(Map<String, Bitmap> images) {
                kotlin.jvm.internal.l.f(images, "images");
                this.f34990a.B().h(null);
            }
        }
    }

    public static final class c implements sj0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC0581i<tj0> f34991a;

        public c(C0583j c0583j) {
            this.f34991a = c0583j;
        }

        @Override // com.yandex.mobile.ads.impl.sj0
        public final void a(String url, Bitmap bitmap) {
            kotlin.jvm.internal.l.f(url, "url");
            kotlin.jvm.internal.l.f(bitmap, "bitmap");
        }

        @Override // com.yandex.mobile.ads.impl.sj0
        public final void a(Map<String, Bitmap> images) {
            kotlin.jvm.internal.l.f(images, "images");
            this.f34991a.resumeWith(new tj0.a(images));
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ wi0(Context context) {
        yc1 yc1VarA = yc1.f35708c.a(context);
        this(context, yc1VarA, yc1VarA.b(), yc1VarA.c());
    }

    public final InterfaceC0644f<ui0> a(Set<jj0> imageValuesToLoad) {
        kotlin.jvm.internal.l.f(imageValuesToLoad, "imageValuesToLoad");
        return new C0640b(new b(imageValuesToLoad, null), C4351i.f37871b, -2, C9.a.SUSPEND);
    }

    public wi0(Context context, yc1 networkingImage, aj0 imageLoader, yc1.c urlBitmapCache) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(networkingImage, "networkingImage");
        kotlin.jvm.internal.l.f(imageLoader, "imageLoader");
        kotlin.jvm.internal.l.f(urlBitmapCache, "urlBitmapCache");
        this.f34975a = imageLoader;
        this.f34976b = urlBitmapCache;
    }

    public final void a(Set<jj0> imageValuesToLoad, sj0 imagesFetchListener) {
        kotlin.jvm.internal.l.f(imageValuesToLoad, "imageValuesToLoad");
        kotlin.jvm.internal.l.f(imagesFetchListener, "imagesFetchListener");
        if (imageValuesToLoad.isEmpty()) {
            imagesFetchListener.a(C2100u.f18582b);
        } else {
            new a(this.f34975a, imageValuesToLoad, imagesFetchListener, new Handler(Looper.getMainLooper()), new AtomicInteger(imageValuesToLoad.size()), new xz0()).a();
        }
    }

    public final void a(LinkedHashMap images) {
        kotlin.jvm.internal.l.f(images, "images");
        for (Map.Entry entry : images.entrySet()) {
            this.f34976b.a((String) entry.getKey(), (Bitmap) entry.getValue());
        }
    }

    public final Object a(Set<jj0> set, InterfaceC4347e<? super tj0> interfaceC4347e) {
        C0583j c0583j = new C0583j(1, com.google.gson.internal.c.r(interfaceC4347e));
        c0583j.s();
        a(set, new c(c0583j));
        Object objR = c0583j.r();
        g9.a aVar = g9.a.COROUTINE_SUSPENDED;
        return objR;
    }
}

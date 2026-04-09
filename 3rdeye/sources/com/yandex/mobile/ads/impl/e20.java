package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.widget.ImageView;
import com.yandex.mobile.ads.impl.aj0;
import w6.C5738b;
import w6.C5739c;
import w6.EnumC5737a;
import w6.InterfaceC5740d;

/* loaded from: classes3.dex */
public final class e20 implements InterfaceC5740d {

    /* renamed from: a, reason: collision with root package name */
    private final yy1 f26645a;

    /* renamed from: b, reason: collision with root package name */
    private final vs0 f26646b;

    public static final class a implements aj0.d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ImageView f26647a;

        public a(ImageView imageView) {
            this.f26647a = imageView;
        }

        @Override // com.yandex.mobile.ads.impl.rq1.a
        public final void a(fi2 fi2Var) {
        }

        @Override // com.yandex.mobile.ads.impl.aj0.d
        public final void a(aj0.c cVar, boolean z10) {
            Bitmap bitmapB = cVar.b();
            if (bitmapB != null) {
                this.f26647a.setImageBitmap(bitmapB);
            }
        }
    }

    public static final class b implements aj0.d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C5739c f26648a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f26649b;

        public b(String str, C5739c c5739c) {
            this.f26648a = c5739c;
            this.f26649b = str;
        }

        @Override // com.yandex.mobile.ads.impl.rq1.a
        public final void a(fi2 fi2Var) {
            this.f26648a.a();
        }

        @Override // com.yandex.mobile.ads.impl.aj0.d
        public final void a(aj0.c cVar, boolean z10) {
            Bitmap bitmapB = cVar.b();
            if (bitmapB != null) {
                this.f26648a.c(new C5738b(bitmapB, Uri.parse(this.f26649b), z10 ? EnumC5737a.MEMORY : EnumC5737a.NETWORK));
            }
        }
    }

    public e20(Context context) {
        kotlin.jvm.internal.l.f(context, "context");
        this.f26645a = yc1.f35708c.a(context).b();
        this.f26646b = new vs0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r2v2, types: [T, com.yandex.mobile.ads.impl.aj0$c] */
    public static final void a(kotlin.jvm.internal.w imageContainer, e20 this$0, String imageUrl, ImageView imageView) {
        kotlin.jvm.internal.l.f(imageContainer, "$imageContainer");
        kotlin.jvm.internal.l.f(this$0, "this$0");
        kotlin.jvm.internal.l.f(imageUrl, "$imageUrl");
        kotlin.jvm.internal.l.f(imageView, "$imageView");
        imageContainer.f43660b = this$0.f26645a.a(imageUrl, new a(imageView), 0, 0);
    }

    @Override // w6.InterfaceC5740d
    public /* bridge */ /* synthetic */ Boolean hasSvgSupport() {
        return Boolean.FALSE;
    }

    public final w6.e loadImage(String imageUrl, ImageView imageView) {
        kotlin.jvm.internal.l.f(imageUrl, "imageUrl");
        kotlin.jvm.internal.l.f(imageView, "imageView");
        final kotlin.jvm.internal.w wVar = new kotlin.jvm.internal.w();
        this.f26646b.a(new D3.a(wVar, this, imageUrl, imageView, 6));
        return new w6.e() { // from class: com.yandex.mobile.ads.impl.C0
            @Override // w6.e
            public final void cancel() {
                e20.a(wVar);
            }
        };
    }

    @Override // w6.InterfaceC5740d
    public final w6.e loadImageBytes(String imageUrl, C5739c callback) {
        kotlin.jvm.internal.l.f(imageUrl, "imageUrl");
        kotlin.jvm.internal.l.f(callback, "callback");
        return a(imageUrl, callback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(kotlin.jvm.internal.w imageContainer) {
        kotlin.jvm.internal.l.f(imageContainer, "$imageContainer");
        aj0.c cVar = (aj0.c) imageContainer.f43660b;
        if (cVar != null) {
            cVar.a();
        }
    }

    public w6.e loadImageBytes(String str, C5739c c5739c, int i) {
        return loadImageBytes(str, c5739c);
    }

    @Override // w6.InterfaceC5740d
    public final w6.e loadImage(String imageUrl, C5739c callback) {
        kotlin.jvm.internal.l.f(imageUrl, "imageUrl");
        kotlin.jvm.internal.l.f(callback, "callback");
        return a(imageUrl, callback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(kotlin.jvm.internal.w imageContainer) {
        kotlin.jvm.internal.l.f(imageContainer, "$imageContainer");
        aj0.c cVar = (aj0.c) imageContainer.f43660b;
        if (cVar != null) {
            cVar.a();
        }
    }

    public w6.e loadImage(String str, C5739c c5739c, int i) {
        return loadImage(str, c5739c);
    }

    private final w6.e a(String str, C5739c c5739c) {
        final kotlin.jvm.internal.w wVar = new kotlin.jvm.internal.w();
        this.f26646b.a(new com.applovin.impl.mediation.r(wVar, this, str, c5739c, 1));
        return new w6.e() { // from class: com.yandex.mobile.ads.impl.D0
            @Override // w6.e
            public final void cancel() {
                e20.a(this.f24086a, wVar);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r2v2, types: [T, com.yandex.mobile.ads.impl.aj0$c] */
    public static final void a(kotlin.jvm.internal.w imageContainer, e20 this$0, String imageUrl, C5739c callback) {
        kotlin.jvm.internal.l.f(imageContainer, "$imageContainer");
        kotlin.jvm.internal.l.f(this$0, "this$0");
        kotlin.jvm.internal.l.f(imageUrl, "$imageUrl");
        kotlin.jvm.internal.l.f(callback, "$callback");
        imageContainer.f43660b = this$0.f26645a.a(imageUrl, new b(imageUrl, callback), 0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(e20 this$0, kotlin.jvm.internal.w imageContainer) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        kotlin.jvm.internal.l.f(imageContainer, "$imageContainer");
        this$0.f26646b.a(new N(imageContainer, 3));
    }
}

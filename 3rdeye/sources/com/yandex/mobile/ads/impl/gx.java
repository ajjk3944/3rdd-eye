package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.yandex.mobile.ads.impl.aj0;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class gx {

    /* renamed from: a, reason: collision with root package name */
    private final aj0 f28024a;

    /* renamed from: b, reason: collision with root package name */
    private final List<w6.e> f28025b;

    public static final class a implements aj0.d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ImageView f28026a;

        public a(ImageView imageView) {
            this.f28026a = imageView;
        }

        @Override // com.yandex.mobile.ads.impl.rq1.a
        public final void a(fi2 fi2Var) {
        }

        @Override // com.yandex.mobile.ads.impl.aj0.d
        public final void a(aj0.c response, boolean z10) {
            kotlin.jvm.internal.l.f(response, "response");
            Bitmap bitmapB = response.b();
            if (bitmapB != null) {
                this.f28026a.setImageBitmap(bitmapB);
            }
        }
    }

    public gx(yy1 imageLoader, List loadReferencesStorage) {
        kotlin.jvm.internal.l.f(imageLoader, "imageLoader");
        kotlin.jvm.internal.l.f(loadReferencesStorage, "loadReferencesStorage");
        this.f28024a = imageLoader;
        this.f28025b = loadReferencesStorage;
    }

    public final void a() {
        Iterator<T> it = this.f28025b.iterator();
        while (it.hasNext()) {
            ((w6.e) it.next()).cancel();
        }
        this.f28025b.clear();
    }

    public final w6.e a(String imageUrl, ImageView imageView) {
        kotlin.jvm.internal.l.f(imageUrl, "imageUrl");
        kotlin.jvm.internal.l.f(imageView, "imageView");
        final aj0.c cVarA = this.f28024a.a(imageUrl, new a(imageView), 0, 0);
        kotlin.jvm.internal.l.e(cVarA, "get(...)");
        w6.e eVar = new w6.e() { // from class: com.yandex.mobile.ads.impl.M0
            @Override // w6.e
            public final void cancel() {
                gx.a(cVarA);
            }
        };
        this.f28025b.add(eVar);
        return eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(aj0.c imageContainer) {
        kotlin.jvm.internal.l.f(imageContainer, "$imageContainer");
        imageContainer.a();
    }
}

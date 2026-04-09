package com.applovin.impl.sdk.utils;

import android.net.Uri;
import android.widget.ImageView;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5741a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Uri f5742b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ImageView f5743c;

    public /* synthetic */ a(Uri uri, ImageView imageView) {
        this.f5741a = 1;
        this.f5742b = uri;
        this.f5743c = imageView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5741a) {
            case 0:
                ImageViewUtils.b(this.f5743c, this.f5742b);
                break;
            case 1:
                ImageViewUtils.a(this.f5742b, this.f5743c);
                break;
            default:
                ImageViewUtils.setAndDownscaleBitmap(this.f5743c, this.f5742b);
                break;
        }
    }

    public /* synthetic */ a(ImageView imageView, Uri uri, int i4) {
        this.f5741a = i4;
        this.f5743c = imageView;
        this.f5742b = uri;
    }
}

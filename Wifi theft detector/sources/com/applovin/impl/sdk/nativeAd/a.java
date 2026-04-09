package com.applovin.impl.sdk.nativeAd;

import android.graphics.BitmapFactory;
import android.net.Uri;
import android.text.TextUtils;
import com.applovin.impl.f2;
import com.applovin.impl.i5;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.UUID;

/* loaded from: classes.dex */
public class a extends i5 {

    /* renamed from: g, reason: collision with root package name */
    private final AppLovinNativeAdImpl f7934g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC0085a f7935h;

    /* renamed from: i, reason: collision with root package name */
    private final String f7936i;

    /* renamed from: com.applovin.impl.sdk.nativeAd.a$a, reason: collision with other inner class name */
    public interface InterfaceC0085a {
        void a(AppLovinNativeAdImpl appLovinNativeAdImpl);
    }

    public a(AppLovinNativeAdImpl appLovinNativeAdImpl, com.applovin.impl.sdk.k kVar, InterfaceC0085a interfaceC0085a) {
        super("TaskCacheNativeAd", kVar);
        this.f7936i = UUID.randomUUID().toString();
        this.f7934g = appLovinNativeAdImpl;
        this.f7935h = interfaceC0085a;
    }

    private float a(Uri uri) throws IOException {
        FileInputStream fileInputStream;
        int i10;
        int i11;
        File file = new File(uri.getPath());
        if (!file.exists()) {
            return -1.0f;
        }
        try {
            fileInputStream = new FileInputStream(file);
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeStream(fileInputStream, null, options);
                i10 = options.outWidth;
                i11 = options.outHeight;
            } finally {
            }
        } catch (IOException e10) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f6220c.a(this.f6219b, "Failed to calculate aspect ratio", e10);
            }
        }
        if (i10 <= 0 || i11 <= 0) {
            fileInputStream.close();
            return -1.0f;
        }
        float f10 = i10 / i11;
        fileInputStream.close();
        return f10;
    }

    private Uri b(Uri uri) {
        if (uri == null) {
            return null;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f6220c.a(this.f6219b, "Attempting to cache resource: " + uri);
        }
        String strA = this.f6218a.G().a(a(), uri.toString(), this.f7934g.getCachePrefix(), Collections.EMPTY_LIST, false, false, 1, this.f7936i, f2.a(this.f7934g));
        if (TextUtils.isEmpty(strA)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f6220c.b(this.f6219b, "Unable to cache resource for uri: " + uri);
            }
            return null;
        }
        File fileA = this.f6218a.G().a(strA, a());
        if (fileA != null) {
            Uri uriFromFile = Uri.fromFile(fileA);
            if (uriFromFile != null) {
                return uriFromFile;
            }
            if (com.applovin.impl.sdk.o.a()) {
                this.f6220c.b(this.f6219b, "Unable to extract Uri from image file");
            }
            return null;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f6220c.b(this.f6219b, "Unable to retrieve File from cached image filename = " + strA);
        }
        return null;
    }

    @Override // java.lang.Runnable
    public void run() throws IOException {
        if (com.applovin.impl.sdk.o.a()) {
            this.f6220c.a(this.f6219b, "Begin caching ad #" + this.f7934g.getAdIdNumber() + "...");
        }
        Uri uriB = b(this.f7934g.getIconUri());
        if (uriB != null) {
            this.f7934g.setIconUri(uriB);
        }
        Uri uriB2 = b(this.f7934g.getMainImageUri());
        if (uriB2 != null) {
            this.f7934g.setMainImageUri(uriB2);
            float fA = a(uriB2);
            if (fA > 0.0f) {
                this.f7934g.setMainImageAspectRatio(fA);
            }
        }
        Uri uriB3 = b(this.f7934g.getPrivacyIconUri());
        if (uriB3 != null) {
            this.f7934g.setPrivacyIconUri(uriB3);
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f6220c.a(this.f6219b, "Finished caching ad #" + this.f7934g.getAdIdNumber());
        }
        this.f7935h.a(this.f7934g);
    }
}

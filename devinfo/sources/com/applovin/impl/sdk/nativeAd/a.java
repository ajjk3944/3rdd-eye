package com.applovin.impl.sdk.nativeAd;

import android.graphics.BitmapFactory;
import android.net.Uri;
import android.text.TextUtils;
import com.applovin.impl.f2;
import com.applovin.impl.i5;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.o;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.UUID;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class a extends i5 {
    private final AppLovinNativeAdImpl g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC0021a f5619h;

    /* renamed from: i, reason: collision with root package name */
    private final String f5620i;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    /* renamed from: com.applovin.impl.sdk.nativeAd.a$a, reason: collision with other inner class name */
    public interface InterfaceC0021a {
        void a(AppLovinNativeAdImpl appLovinNativeAdImpl);
    }

    public a(AppLovinNativeAdImpl appLovinNativeAdImpl, k kVar, InterfaceC0021a interfaceC0021a) {
        super("TaskCacheNativeAd", kVar);
        this.f5620i = UUID.randomUUID().toString();
        this.g = appLovinNativeAdImpl;
        this.f5619h = interfaceC0021a;
    }

    private float a(Uri uri) throws IOException {
        FileInputStream fileInputStream;
        int i4;
        int i10;
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
                i4 = options.outWidth;
                i10 = options.outHeight;
            } finally {
            }
        } catch (IOException e2) {
            if (o.a()) {
                this.f4289c.a(this.f4288b, "Failed to calculate aspect ratio", e2);
            }
        }
        if (i4 <= 0 || i10 <= 0) {
            fileInputStream.close();
            return -1.0f;
        }
        float f10 = i4 / i10;
        fileInputStream.close();
        return f10;
    }

    private Uri b(Uri uri) {
        if (uri == null) {
            return null;
        }
        if (o.a()) {
            this.f4289c.a(this.f4288b, "Attempting to cache resource: " + uri);
        }
        String strA = this.f4287a.G().a(a(), uri.toString(), this.g.getCachePrefix(), Collections.EMPTY_LIST, false, false, 1, this.f5620i, f2.a(this.g));
        if (TextUtils.isEmpty(strA)) {
            if (o.a()) {
                this.f4289c.b(this.f4288b, "Unable to cache resource for uri: " + uri);
            }
            return null;
        }
        File fileA = this.f4287a.G().a(strA, a());
        if (fileA != null) {
            Uri uriFromFile = Uri.fromFile(fileA);
            if (uriFromFile != null) {
                return uriFromFile;
            }
            if (o.a()) {
                this.f4289c.b(this.f4288b, "Unable to extract Uri from image file");
            }
            return null;
        }
        if (o.a()) {
            this.f4289c.b(this.f4288b, "Unable to retrieve File from cached image filename = " + strA);
        }
        return null;
    }

    @Override // java.lang.Runnable
    public void run() throws IOException {
        if (o.a()) {
            this.f4289c.a(this.f4288b, "Begin caching ad #" + this.g.getAdIdNumber() + "...");
        }
        Uri uriB = b(this.g.getIconUri());
        if (uriB != null) {
            this.g.setIconUri(uriB);
        }
        Uri uriB2 = b(this.g.getMainImageUri());
        if (uriB2 != null) {
            this.g.setMainImageUri(uriB2);
            float fA = a(uriB2);
            if (fA > 0.0f) {
                this.g.setMainImageAspectRatio(fA);
            }
        }
        Uri uriB3 = b(this.g.getPrivacyIconUri());
        if (uriB3 != null) {
            this.g.setPrivacyIconUri(uriB3);
        }
        if (o.a()) {
            this.f4289c.a(this.f4288b, "Finished caching ad #" + this.g.getAdIdNumber());
        }
        this.f5619h.a(this.g);
    }
}

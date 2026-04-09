package com.applovin.impl.sdk.nativeAd;

import android.graphics.BitmapFactory;
import android.net.Uri;
import android.text.TextUtils;
import com.applovin.impl.a2;
import com.applovin.impl.l4;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.o;
import com.applovin.impl.w4;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;

/* loaded from: classes.dex */
public class a extends w4 {

    /* renamed from: g, reason: collision with root package name */
    private final AppLovinNativeAdImpl f21300g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC0319a f21301h;

    /* renamed from: com.applovin.impl.sdk.nativeAd.a$a, reason: collision with other inner class name */
    public interface InterfaceC0319a {
        void a(AppLovinNativeAdImpl appLovinNativeAdImpl);
    }

    public a(AppLovinNativeAdImpl appLovinNativeAdImpl, k kVar, InterfaceC0319a interfaceC0319a) {
        super("TaskCacheNativeAd", kVar);
        this.f21300g = appLovinNativeAdImpl;
        this.f21301h = interfaceC0319a;
    }

    private float a(Uri uri) throws IOException {
        FileInputStream fileInputStream;
        int i;
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
                i = options.outWidth;
                i10 = options.outHeight;
            } finally {
            }
        } catch (IOException e4) {
            if (o.a()) {
                this.f21694c.a(this.f21693b, "Failed to calculate aspect ratio", e4);
            }
        }
        if (i <= 0 || i10 <= 0) {
            fileInputStream.close();
            return -1.0f;
        }
        float f10 = i / i10;
        fileInputStream.close();
        return f10;
    }

    private Uri b(Uri uri) {
        if (uri == null) {
            return null;
        }
        if (o.a()) {
            this.f21694c.a(this.f21693b, "Attempting to cache resource: " + uri);
        }
        String strA = this.f21692a.H().a(a(), uri.toString(), this.f21300g.getCachePrefix(), Collections.EMPTY_LIST, false, false, 1, (String) this.f21692a.a(l4.f19960k4), a2.a(this.f21300g));
        if (TextUtils.isEmpty(strA)) {
            if (o.a()) {
                this.f21694c.b(this.f21693b, "Unable to cache resource for uri: " + uri);
            }
            return null;
        }
        File fileA = this.f21692a.H().a(strA, a());
        if (fileA != null) {
            Uri uriFromFile = Uri.fromFile(fileA);
            if (uriFromFile != null) {
                return uriFromFile;
            }
            if (o.a()) {
                this.f21694c.b(this.f21693b, "Unable to extract Uri from image file");
            }
            return null;
        }
        if (o.a()) {
            this.f21694c.b(this.f21693b, "Unable to retrieve File from cached image filename = " + strA);
        }
        return null;
    }

    @Override // java.lang.Runnable
    public void run() throws IOException {
        if (o.a()) {
            this.f21694c.a(this.f21693b, "Begin caching ad #" + this.f21300g.getAdIdNumber() + "...");
        }
        Uri uriB = b(this.f21300g.getIconUri());
        if (uriB != null) {
            this.f21300g.setIconUri(uriB);
        }
        Uri uriB2 = b(this.f21300g.getMainImageUri());
        if (uriB2 != null) {
            this.f21300g.setMainImageUri(uriB2);
            float fA = a(uriB2);
            if (fA > 0.0f) {
                this.f21300g.setMainImageAspectRatio(fA);
            }
        }
        Uri uriB3 = b(this.f21300g.getPrivacyIconUri());
        if (uriB3 != null) {
            this.f21300g.setPrivacyIconUri(uriB3);
        }
        if (o.a()) {
            this.f21694c.a(this.f21693b, "Finished caching ad #" + this.f21300g.getAdIdNumber());
        }
        this.f21301h.a(this.f21300g);
    }
}

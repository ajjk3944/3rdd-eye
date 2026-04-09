package com.applovin.impl;

import N7.G8;
import a6.C1653b;
import android.net.Uri;
import android.text.TextUtils;
import com.applovin.impl.k3;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinErrorCodes;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.android.gms.common.internal.ImagesContract;
import java.io.File;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public abstract class z4 extends w4 implements k3.a {

    /* renamed from: g, reason: collision with root package name */
    protected final com.applovin.impl.sdk.ad.b f21896g;

    /* renamed from: h, reason: collision with root package name */
    private AppLovinAdLoadListener f21897h;
    private final com.applovin.impl.sdk.m i;

    /* renamed from: j, reason: collision with root package name */
    private final Collection f21898j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f21899k;

    public z4(String str, com.applovin.impl.sdk.ad.b bVar, com.applovin.impl.sdk.k kVar, AppLovinAdLoadListener appLovinAdLoadListener) {
        super(str, kVar);
        if (bVar == null) {
            throw new IllegalArgumentException("No ad specified.");
        }
        this.f21896g = bVar;
        this.f21897h = appLovinAdLoadListener;
        this.i = kVar.H();
        this.f21898j = g();
    }

    private Collection g() {
        HashSet hashSet = new HashSet();
        for (char c10 : ((String) this.f21692a.a(l4.f19726E0)).toCharArray()) {
            hashSet.add(Character.valueOf(c10));
        }
        hashSet.add('\"');
        return hashSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h() {
        AppLovinAdLoadListener appLovinAdLoadListener = this.f21897h;
        if (appLovinAdLoadListener != null) {
            appLovinAdLoadListener.adReceived(this.f21896g);
            this.f21897h = null;
        }
    }

    @Override // com.applovin.impl.k3.a
    public void a(q2 q2Var) {
        if (q2Var.O().equalsIgnoreCase(this.f21896g.M())) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21694c.b(this.f21693b, "Updating flag for timeout...");
            }
            f();
        }
        this.f21692a.Z().b(this);
    }

    public Uri b(String str, List list, boolean z10) {
        if (!StringUtils.isValidString(str)) {
            return null;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f21694c.a(this.f21693b, "Caching video " + str + "...");
        }
        String strA = this.i.a(a(), str, this.f21896g.getCachePrefix(), list, z10, this.f21692a.H().a(str, this.f21896g), this.f21896g.i0(), a2.a((AppLovinAdImpl) this.f21896g));
        if (!StringUtils.isValidString(strA)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21694c.b(this.f21693b, "Failed to cache video: " + str);
            }
            this.f21692a.E().a(y1.f21816r0, "cacheVideo", CollectionUtils.hashMap(ImagesContract.URL, str));
            a(AppLovinErrorCodes.UNABLE_TO_PRECACHE_VIDEO_RESOURCES);
            return null;
        }
        File fileA = this.i.a(strA, a());
        if (fileA == null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21694c.b(this.f21693b, "Unable to retrieve File from cached video filename = " + strA);
            }
            this.f21692a.E().a(y1.f21816r0, "retrieveVideoFile", CollectionUtils.hashMap(ImagesContract.URL, strA));
            return null;
        }
        Uri uriFromFile = Uri.fromFile(fileA);
        if (uriFromFile != null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21694c.a(this.f21693b, "Finish caching video for ad #" + this.f21896g.getAdIdNumber() + ". Updating ad with cachedVideoFilename = " + strA);
            }
            return uriFromFile;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f21694c.b(this.f21693b, "Unable to create URI from cached video file = " + fileA);
        }
        this.f21692a.E().a(y1.f21816r0, "extractUriFromVideoFile", CollectionUtils.hashMap(ImagesContract.URL, strA));
        return null;
    }

    public Uri c(String str) {
        return b(str, this.f21896g.c0(), true);
    }

    public void f() {
        this.f21899k = true;
    }

    public void i() {
        if (AbstractC2128k0.d()) {
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f21694c.a(this.f21693b, "Caching mute images...");
        }
        Uri uriA = a(this.f21896g.Q(), "mute");
        if (uriA != null) {
            this.f21896g.b(uriA);
        }
        Uri uriA2 = a(this.f21896g.j0(), "unmute");
        if (uriA2 != null) {
            this.f21896g.c(uriA2);
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f21694c.a(this.f21693b, "Ad updated with muteImageFilename = " + this.f21896g.Q() + ", unmuteImageFilename = " + this.f21896g.j0());
        }
    }

    public void j() {
        this.f21692a.Z().b(this);
        MaxAdFormat maxAdFormatD = this.f21896g.getAdZone().d();
        if (((Boolean) this.f21692a.a(l4.f19833T0)).booleanValue() && maxAdFormatD != null && maxAdFormatD.isFullscreenAd()) {
            this.f21692a.h().b(this.f21896g);
        }
    }

    public boolean k() {
        return this.f21899k;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f21896g.k1()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21694c.a(this.f21693b, "Subscribing to timeout events...");
            }
            this.f21692a.Z().a(this);
        }
    }

    public String c(String str, List list, boolean z10) {
        try {
            InputStream inputStreamA = this.i.a(str, list, z10, a2.a((AppLovinAdImpl) this.f21896g));
            if (inputStreamA == null) {
                if (inputStreamA == null) {
                    return null;
                }
                inputStreamA.close();
                return null;
            }
            try {
                String strA = this.i.a(inputStreamA);
                inputStreamA.close();
                return strA;
            } finally {
            }
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21694c.a(this.f21693b, "Unknown failure to read input stream.", th);
            }
            this.f21694c.a(this.f21693b, th);
            this.f21692a.E().a(this.f21693b, "readInputStreamAsString", th);
            return null;
        }
    }

    public void e() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f21694c.a(this.f21693b, "Rendered new ad:" + this.f21896g);
        }
        AppLovinSdkUtils.runOnUiThread(new L0(this, 10));
    }

    public Uri a(Uri uri, String str) {
        if (uri == null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21694c.a(this.f21693b, "No " + str + " image to cache");
            }
            return null;
        }
        String string = uri.toString();
        if (TextUtils.isEmpty(string)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21694c.a(this.f21693b, "Failed to cache " + str + " image");
            }
            return null;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f21694c.a(this.f21693b, "Caching " + str + " image...");
        }
        return b(string);
    }

    public Uri a(String str, List list, boolean z10) {
        try {
            String strA = this.i.a(a(), str, this.f21896g.getCachePrefix(), list, z10, this.f21692a.H().a(str, this.f21896g), this.f21896g.i0(), a2.a((AppLovinAdImpl) this.f21896g));
            if (StringUtils.isValidString(strA)) {
                File fileA = this.i.a(strA, a());
                if (fileA != null) {
                    Uri uriFromFile = Uri.fromFile(fileA);
                    if (uriFromFile != null) {
                        return uriFromFile;
                    }
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f21694c.b(this.f21693b, "Unable to extract Uri from image file");
                    }
                    this.f21692a.E().a(y1.f21816r0, "extractUriFromImageFile", CollectionUtils.hashMap(ImagesContract.URL, strA));
                    return null;
                }
                if (com.applovin.impl.sdk.o.a()) {
                    this.f21694c.b(this.f21693b, "Unable to retrieve File from cached image filename = " + strA);
                }
                this.f21692a.E().a(y1.f21816r0, "retrieveImageFile", CollectionUtils.hashMap(ImagesContract.URL, strA));
                return null;
            }
            if (com.applovin.impl.sdk.o.a()) {
                this.f21694c.b(this.f21693b, "Failed to cache image: " + str);
            }
            this.f21692a.E().a(y1.f21816r0, "cacheImageResource", CollectionUtils.hashMap(ImagesContract.URL, str));
            return null;
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21694c.a(this.f21693b, "Failed to cache image at url = " + str, th);
            }
            this.f21692a.E().a(this.f21693b, "cacheImageResource", th, CollectionUtils.hashMap(ImagesContract.URL, str));
            return null;
        }
    }

    public Uri b(String str) {
        return a(str, this.f21896g.c0(), true);
    }

    public void a(com.applovin.impl.sdk.ad.b bVar) {
        String strL0 = bVar.l0();
        if (bVar.V0() && StringUtils.isValidString(strL0)) {
            String strA = a(strL0, bVar.c0(), bVar);
            bVar.c(strA);
            this.f21694c.f(this.f21693b, "Ad updated with video button HTML assets cached = " + strA);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0039, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String a(java.lang.String r12, java.util.List r13, com.applovin.impl.sdk.ad.b r14) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.z4.a(java.lang.String, java.util.List, com.applovin.impl.sdk.ad.b):java.lang.String");
    }

    private Uri a(String str, String str2) {
        File fileA = this.i.a(a7.a(Uri.parse(str2), this.f21896g.getCachePrefix(), this.f21692a), com.applovin.impl.sdk.k.o());
        if (fileA == null) {
            return null;
        }
        if (!((Boolean) this.f21692a.a(l4.f19977m6)).booleanValue() && this.i.a(fileA)) {
            return Uri.parse(C1653b.FILE_SCHEME + fileA.getAbsolutePath());
        }
        String strS = G8.s(str, str2);
        if (!this.i.a(fileA, strS, Arrays.asList(str), this.f21692a.H().a(strS, this.f21896g), this.f21896g.i0(), a2.a((AppLovinAdImpl) this.f21896g))) {
            return null;
        }
        return Uri.parse(C1653b.FILE_SCHEME + fileA.getAbsolutePath());
    }

    public void a(int i) {
        if (this.f21897h != null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21694c.a(this.f21693b, "Calling back ad load failed with error code: " + i);
            }
            this.f21897h.failedToReceiveAd(i);
            this.f21897h = null;
        }
        f();
    }
}

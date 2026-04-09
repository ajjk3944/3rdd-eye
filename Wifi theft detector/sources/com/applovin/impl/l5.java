package com.applovin.impl;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.applovin.impl.d0;
import com.applovin.impl.e0;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.v3;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinErrorCodes;
import com.applovin.sdk.AppLovinSdkUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public abstract class l5 extends i5 implements v3.a {

    /* renamed from: g, reason: collision with root package name */
    protected final com.applovin.impl.sdk.ad.b f6396g;

    /* renamed from: h, reason: collision with root package name */
    private AppLovinAdLoadListener f6397h;

    /* renamed from: i, reason: collision with root package name */
    protected final String f6398i;

    /* renamed from: j, reason: collision with root package name */
    private final com.applovin.impl.sdk.m f6399j;

    /* renamed from: k, reason: collision with root package name */
    private final Collection f6400k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f6401l;

    /* renamed from: m, reason: collision with root package name */
    protected ExecutorService f6402m;

    /* renamed from: n, reason: collision with root package name */
    protected ExecutorService f6403n;

    /* renamed from: o, reason: collision with root package name */
    protected List f6404o;

    /* renamed from: p, reason: collision with root package name */
    private d0 f6405p;

    public class a implements e0.a {
        public a() {
        }

        @Override // com.applovin.impl.e0.a
        public void a(Uri uri) {
            l5.this.f6396g.a(uri);
            com.applovin.impl.sdk.o oVar = l5.this.f6220c;
            if (com.applovin.impl.sdk.o.a()) {
                l5 l5Var = l5.this;
                l5Var.f6220c.a(l5Var.f6219b, "Ad updated with muteImageUri = " + uri);
            }
        }
    }

    public class b implements e0.a {
        public b() {
        }

        @Override // com.applovin.impl.e0.a
        public void a(Uri uri) {
            l5.this.f6396g.b(uri);
            com.applovin.impl.sdk.o oVar = l5.this.f6220c;
            if (com.applovin.impl.sdk.o.a()) {
                l5 l5Var = l5.this;
                l5Var.f6220c.a(l5Var.f6219b, "Ad updated with unmuteImageUri = " + uri);
            }
        }
    }

    public class c implements e0.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ e0.a f6408a;

        public c(e0.a aVar) {
            this.f6408a = aVar;
        }

        @Override // com.applovin.impl.e0.a
        public void a(Uri uri) {
            if (uri == null) {
                com.applovin.impl.sdk.o oVar = l5.this.f6220c;
                if (com.applovin.impl.sdk.o.a()) {
                    l5 l5Var = l5.this;
                    l5Var.f6220c.b(l5Var.f6219b, "Failed to cache video");
                }
                l5.this.a(AppLovinErrorCodes.UNABLE_TO_PRECACHE_VIDEO_RESOURCES);
                Bundle bundle = new Bundle();
                bundle.putLong("ad_id", l5.this.f6396g.getAdIdNumber());
                l5.this.f6218a.t().a(bundle, "video_caching_failed");
                return;
            }
            com.applovin.impl.sdk.o oVar2 = l5.this.f6220c;
            if (com.applovin.impl.sdk.o.a()) {
                l5 l5Var2 = l5.this;
                l5Var2.f6220c.a(l5Var2.f6219b, "Finish caching video for ad #" + l5.this.f6396g.getAdIdNumber() + ". Updating ad with cachedVideoURL = " + uri);
            }
            this.f6408a.a(uri);
        }
    }

    public class d implements d0.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ e f6410a;

        public d(e eVar) {
            this.f6410a = eVar;
        }

        @Override // com.applovin.impl.d0.c
        public void a(String str, boolean z10) {
            if (z10) {
                l5.this.a(AppLovinErrorCodes.UNABLE_TO_PRECACHE_HTML_RESOURCES);
                return;
            }
            e eVar = this.f6410a;
            if (eVar != null) {
                eVar.a(str);
            }
        }
    }

    public interface e {
        void a(String str);
    }

    public l5(String str, com.applovin.impl.sdk.ad.b bVar, com.applovin.impl.sdk.k kVar, AppLovinAdLoadListener appLovinAdLoadListener) {
        super(str, kVar);
        this.f6398i = UUID.randomUUID().toString();
        if (bVar == null) {
            throw new IllegalArgumentException("No ad specified.");
        }
        this.f6396g = bVar;
        this.f6397h = appLovinAdLoadListener;
        this.f6399j = kVar.G();
        this.f6400k = h();
        if (((Boolean) kVar.a(x4.I0)).booleanValue()) {
            if (kVar.q0().e()) {
                this.f6402m = kVar.q0().a();
                this.f6403n = kVar.q0().d();
                return;
            }
            String mediationServeId = StringUtils.isValidString(bVar.getMediationServeId()) ? bVar.getMediationServeId() : UUID.randomUUID().toString();
            this.f6402m = kVar.q0().a("com.applovin.sdk.caching." + mediationServeId, ((Integer) kVar.a(x4.K0)).intValue());
            this.f6403n = kVar.q0().a("com.applovin.sdk.caching.html." + mediationServeId, ((Integer) kVar.a(x4.L0)).intValue());
        }
    }

    private Collection h() {
        HashSet hashSet = new HashSet();
        for (char c10 : ((String) this.f6218a.a(x4.D0)).toCharArray()) {
            hashSet.add(Character.valueOf(c10));
        }
        hashSet.add('\"');
        return hashSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i() {
        AppLovinAdLoadListener appLovinAdLoadListener = this.f6397h;
        if (appLovinAdLoadListener != null) {
            appLovinAdLoadListener.adReceived(this.f6396g);
            this.f6397h = null;
        }
    }

    @Override // com.applovin.impl.v3.a
    public void a(y2 y2Var) {
        if (y2Var.Q().equalsIgnoreCase(this.f6396g.getMediationServeId())) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f6220c.b(this.f6219b, "Updating flag for timeout...");
            }
            g();
        }
        this.f6218a.Z().b(this);
    }

    public e0 b(String str, e0.a aVar) {
        return a(str, this.f6396g.S(), true, aVar);
    }

    public Uri c(String str) {
        return b(str, this.f6396g.S(), true);
    }

    public void f() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f6220c.a(this.f6219b, "Rendered new ad:" + this.f6396g);
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.ec
            @Override // java.lang.Runnable
            public final void run() {
                this.f5964a.i();
            }
        });
    }

    public void g() {
        this.f6401l = true;
        List list = this.f6404o;
        if (list != null && !list.isEmpty()) {
            Iterator it = this.f6404o.iterator();
            while (it.hasNext()) {
                ((c0) it.next()).a(true);
            }
        }
        if (this.f6218a.q0().e()) {
            d0 d0Var = this.f6405p;
            if (d0Var != null) {
                d0Var.c();
                return;
            }
            return;
        }
        ExecutorService executorService = this.f6402m;
        if (executorService != null) {
            executorService.shutdown();
            this.f6402m = null;
        }
        ExecutorService executorService2 = this.f6403n;
        if (executorService2 != null) {
            executorService2.shutdown();
            this.f6403n = null;
        }
    }

    public void j() {
        if (o0.d()) {
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f6220c.a(this.f6219b, "Caching mute images...");
        }
        Uri uriA = a(this.f6396g.G(), CampaignEx.JSON_NATIVE_VIDEO_MUTE);
        if (uriA != null) {
            this.f6396g.a(uriA);
        }
        Uri uriA2 = a(this.f6396g.Y(), CampaignEx.JSON_NATIVE_VIDEO_UNMUTE);
        if (uriA2 != null) {
            this.f6396g.b(uriA2);
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f6220c.a(this.f6219b, "Ad updated with muteImageFilename = " + this.f6396g.G() + ", unmuteImageFilename = " + this.f6396g.Y());
        }
    }

    public void k() {
        this.f6218a.Z().b(this);
        if (!this.f6218a.q0().e()) {
            ExecutorService executorService = this.f6402m;
            if (executorService != null) {
                executorService.shutdown();
                this.f6402m = null;
            }
            ExecutorService executorService2 = this.f6403n;
            if (executorService2 != null) {
                executorService2.shutdown();
                this.f6403n = null;
            }
        }
        MaxAdFormat maxAdFormatD = this.f6396g.getAdZone().d();
        if (((Boolean) this.f6218a.a(x4.X0)).booleanValue() && maxAdFormatD != null && maxAdFormatD.isFullscreenAd()) {
            this.f6218a.h().b(this.f6396g);
        }
        this.f6218a.d0().a(this.f6398i);
    }

    public boolean l() {
        return this.f6401l;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f6396g.b1()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f6220c.a(this.f6219b, "Subscribing to timeout events...");
            }
            this.f6218a.Z().a(this);
        }
    }

    public Uri b(String str, List list, boolean z10) {
        if (!StringUtils.isValidString(str)) {
            return null;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f6220c.a(this.f6219b, "Caching video " + str + "...");
        }
        int iA = this.f6218a.G().a(str, this.f6396g);
        Map mapA = f2.a((AppLovinAdImpl) this.f6396g);
        String strA = this.f6399j.a(a(), str, this.f6396g.getCachePrefix(), list, z10, iA, this.f6398i, mapA);
        if (!StringUtils.isValidString(strA)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f6220c.b(this.f6219b, "Failed to cache video: " + str);
            }
            a(str, "cacheVideo", mapA);
            a(AppLovinErrorCodes.UNABLE_TO_PRECACHE_VIDEO_RESOURCES);
            return null;
        }
        File fileA = this.f6399j.a(strA, a());
        if (fileA == null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f6220c.b(this.f6219b, "Unable to retrieve File from cached video filename = " + strA);
            }
            a(strA, "retrieveVideoFile", mapA);
            return null;
        }
        Uri uriFromFile = Uri.fromFile(fileA);
        if (uriFromFile == null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f6220c.b(this.f6219b, "Unable to create URI from cached video file = " + fileA);
            }
            a(strA, "extractUriFromVideoFile", mapA);
            return null;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f6220c.a(this.f6219b, "Finish caching video for ad #" + this.f6396g.getAdIdNumber() + ". Updating ad with cachedVideoFilename = " + strA);
        }
        return uriFromFile;
    }

    public String c(String str, List list, boolean z10) {
        try {
            InputStream inputStreamA = this.f6399j.a(str, list, z10, f2.a((AppLovinAdImpl) this.f6396g));
            if (inputStreamA == null) {
                if (inputStreamA == null) {
                    return null;
                }
                inputStreamA.close();
                return null;
            }
            try {
                String strA = this.f6399j.a(inputStreamA);
                inputStreamA.close();
                return strA;
            } finally {
            }
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f6220c.a(this.f6219b, "Unknown failure to read input stream.", th);
            }
            this.f6220c.a(this.f6219b, th);
            this.f6218a.D().a(this.f6219b, "readInputStreamAsString", th);
            return null;
        }
    }

    public List e() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f6220c.a(this.f6219b, "Caching mute images...");
        }
        ArrayList arrayList = new ArrayList();
        if (this.f6396g.G() != null) {
            arrayList.add(a(this.f6396g.G().toString(), new a()));
        }
        if (this.f6396g.Y() != null) {
            arrayList.add(a(this.f6396g.Y().toString(), new b()));
        }
        return arrayList;
    }

    public List a(List list) {
        this.f6404o = list;
        return this.f6218a.q0().a(list, this.f6402m);
    }

    public e0 a(String str, e0.a aVar) {
        return new e0(str, this.f6396g, this.f6398i, this.f6218a, aVar);
    }

    public e0 a(String str, List list, boolean z10, e0.a aVar) {
        if (TextUtils.isEmpty(str)) {
            if (!com.applovin.impl.sdk.o.a()) {
                return null;
            }
            this.f6220c.a(this.f6219b, "No video to cache, skipping...");
            return null;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f6220c.a(this.f6219b, "Caching video " + str + "...");
        }
        return new e0(str, this.f6396g, list, z10, this.f6398i, this.f6218a, new c(aVar));
    }

    public d0 a(String str, List list, e eVar) {
        d0 d0Var = new d0(str, this.f6396g, list, this.f6403n, this.f6398i, this.f6218a, new d(eVar));
        this.f6405p = d0Var;
        return d0Var;
    }

    public Uri a(Uri uri, String str) {
        if (uri == null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f6220c.a(this.f6219b, "No " + str + " image to cache");
            }
            return null;
        }
        String string = uri.toString();
        if (TextUtils.isEmpty(string)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f6220c.a(this.f6219b, "Failed to cache " + str + " image");
            }
            return null;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f6220c.a(this.f6219b, "Caching " + str + " image...");
        }
        return b(string);
    }

    public Uri b(String str) {
        return a(str, this.f6396g.S(), true);
    }

    public Uri a(String str, List list, boolean z10) {
        String str2;
        int iA;
        Map mapA;
        try {
            iA = this.f6218a.G().a(str, this.f6396g);
            mapA = f2.a((AppLovinAdImpl) this.f6396g);
            str2 = str;
        } catch (Throwable th) {
            th = th;
            str2 = str;
        }
        try {
            String strA = this.f6399j.a(a(), str2, this.f6396g.getCachePrefix(), list, z10, iA, this.f6398i, mapA);
            if (StringUtils.isValidString(strA)) {
                File fileA = this.f6399j.a(strA, a());
                if (fileA != null) {
                    Uri uriFromFile = Uri.fromFile(fileA);
                    if (uriFromFile != null) {
                        return uriFromFile;
                    }
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f6220c.b(this.f6219b, "Unable to extract Uri from image file");
                    }
                    a(strA, "extractUriFromImageFile", mapA);
                    return null;
                }
                if (com.applovin.impl.sdk.o.a()) {
                    this.f6220c.b(this.f6219b, "Unable to retrieve File from cached image filename = " + strA);
                }
                a(strA, "retrieveImageFile", mapA);
                return null;
            }
            if (com.applovin.impl.sdk.o.a()) {
                this.f6220c.b(this.f6219b, "Failed to cache image: " + str2);
            }
            a(str2, "cacheImageResource", mapA);
            return null;
        } catch (Throwable th2) {
            th = th2;
            Throwable th3 = th;
            if (com.applovin.impl.sdk.o.a()) {
                this.f6220c.a(this.f6219b, "Failed to cache image at url = " + str2, th3);
            }
            Map mapA2 = f2.a((AppLovinAdImpl) this.f6396g);
            CollectionUtils.putStringIfValid("url", str2, mapA2);
            this.f6218a.D().a(this.f6219b, "cacheImageResource", th3, mapA2);
            return null;
        }
    }

    public void a(com.applovin.impl.sdk.ad.b bVar) {
        String strA0 = bVar.a0();
        if (bVar.J0() && StringUtils.isValidString(strA0)) {
            String strA = a(strA0, bVar.S(), bVar);
            bVar.c(strA);
            this.f6220c.f(this.f6219b, "Ad updated with video button HTML assets cached = " + strA);
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
            Method dump skipped, instructions count: 288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.l5.a(java.lang.String, java.util.List, com.applovin.impl.sdk.ad.b):java.lang.String");
    }

    private Uri a(String str, String str2) {
        File fileA = this.f6399j.a(n7.a(Uri.parse(str2), this.f6396g.getCachePrefix(), this.f6218a), com.applovin.impl.sdk.k.o());
        if (fileA == null) {
            return null;
        }
        if (!((Boolean) this.f6218a.a(x4.Q6)).booleanValue() && this.f6399j.a(fileA)) {
            return Uri.parse(q7.a.FILE_SCHEME + fileA.getAbsolutePath());
        }
        String str3 = str + str2;
        if (!this.f6399j.a(fileA, str3, Arrays.asList(str), this.f6218a.G().a(str3, this.f6396g), this.f6398i, f2.a((AppLovinAdImpl) this.f6396g))) {
            return null;
        }
        return Uri.parse(q7.a.FILE_SCHEME + fileA.getAbsolutePath());
    }

    public void a(int i10) {
        if (this.f6397h != null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f6220c.a(this.f6219b, "Calling back ad load failed with error code: " + i10);
            }
            this.f6397h.failedToReceiveAd(i10);
            this.f6397h = null;
        }
        g();
    }

    public void a(String str, String str2, Map map) {
        HashMap map2 = new HashMap(map);
        CollectionUtils.putStringIfValid("url", str, map2);
        this.f6218a.D().a(d2.M0, str2, map2);
    }
}

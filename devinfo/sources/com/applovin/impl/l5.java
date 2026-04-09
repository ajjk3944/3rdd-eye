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

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class l5 extends i5 implements v3.a {
    protected final com.applovin.impl.sdk.ad.b g;

    /* renamed from: h, reason: collision with root package name */
    private AppLovinAdLoadListener f4426h;

    /* renamed from: i, reason: collision with root package name */
    protected final String f4427i;
    private final com.applovin.impl.sdk.m j;

    /* renamed from: k, reason: collision with root package name */
    private final Collection f4428k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f4429l;

    /* renamed from: m, reason: collision with root package name */
    protected ExecutorService f4430m;

    /* renamed from: n, reason: collision with root package name */
    protected ExecutorService f4431n;

    /* renamed from: o, reason: collision with root package name */
    protected List f4432o;

    /* renamed from: p, reason: collision with root package name */
    private d0 f4433p;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public class a implements e0.a {
        public a() {
        }

        @Override // com.applovin.impl.e0.a
        public void a(Uri uri) {
            l5.this.g.a(uri);
            com.applovin.impl.sdk.o oVar = l5.this.f4289c;
            if (com.applovin.impl.sdk.o.a()) {
                l5 l5Var = l5.this;
                l5Var.f4289c.a(l5Var.f4288b, "Ad updated with muteImageUri = " + uri);
            }
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public class b implements e0.a {
        public b() {
        }

        @Override // com.applovin.impl.e0.a
        public void a(Uri uri) {
            l5.this.g.b(uri);
            com.applovin.impl.sdk.o oVar = l5.this.f4289c;
            if (com.applovin.impl.sdk.o.a()) {
                l5 l5Var = l5.this;
                l5Var.f4289c.a(l5Var.f4288b, "Ad updated with unmuteImageUri = " + uri);
            }
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public class c implements e0.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ e0.a f4436a;

        public c(e0.a aVar) {
            this.f4436a = aVar;
        }

        @Override // com.applovin.impl.e0.a
        public void a(Uri uri) {
            if (uri == null) {
                com.applovin.impl.sdk.o oVar = l5.this.f4289c;
                if (com.applovin.impl.sdk.o.a()) {
                    l5 l5Var = l5.this;
                    l5Var.f4289c.b(l5Var.f4288b, "Failed to cache video");
                }
                l5.this.a(AppLovinErrorCodes.UNABLE_TO_PRECACHE_VIDEO_RESOURCES);
                Bundle bundle = new Bundle();
                bundle.putLong("ad_id", l5.this.g.getAdIdNumber());
                l5.this.f4287a.t().a(bundle, "video_caching_failed");
                return;
            }
            com.applovin.impl.sdk.o oVar2 = l5.this.f4289c;
            if (com.applovin.impl.sdk.o.a()) {
                l5 l5Var2 = l5.this;
                l5Var2.f4289c.a(l5Var2.f4288b, "Finish caching video for ad #" + l5.this.g.getAdIdNumber() + ". Updating ad with cachedVideoURL = " + uri);
            }
            this.f4436a.a(uri);
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public class d implements d0.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ e f4438a;

        public d(e eVar) {
            this.f4438a = eVar;
        }

        @Override // com.applovin.impl.d0.c
        public void a(String str, boolean z3) {
            if (z3) {
                l5.this.a(AppLovinErrorCodes.UNABLE_TO_PRECACHE_HTML_RESOURCES);
                return;
            }
            e eVar = this.f4438a;
            if (eVar != null) {
                eVar.a(str);
            }
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public interface e {
        void a(String str);
    }

    public l5(String str, com.applovin.impl.sdk.ad.b bVar, com.applovin.impl.sdk.k kVar, AppLovinAdLoadListener appLovinAdLoadListener) {
        super(str, kVar);
        this.f4427i = UUID.randomUUID().toString();
        if (bVar == null) {
            throw new IllegalArgumentException("No ad specified.");
        }
        this.g = bVar;
        this.f4426h = appLovinAdLoadListener;
        this.j = kVar.G();
        this.f4428k = h();
        if (((Boolean) kVar.a(x4.I0)).booleanValue()) {
            if (kVar.q0().e()) {
                this.f4430m = kVar.q0().a();
                this.f4431n = kVar.q0().d();
            } else {
                String mediationServeId = StringUtils.isValidString(bVar.getMediationServeId()) ? bVar.getMediationServeId() : UUID.randomUUID().toString();
                this.f4430m = kVar.q0().a(je.u.t("com.applovin.sdk.caching.", mediationServeId), ((Integer) kVar.a(x4.K0)).intValue());
                this.f4431n = kVar.q0().a(je.u.t("com.applovin.sdk.caching.html.", mediationServeId), ((Integer) kVar.a(x4.L0)).intValue());
            }
        }
    }

    private Collection h() {
        HashSet hashSet = new HashSet();
        for (char c9 : ((String) this.f4287a.a(x4.D0)).toCharArray()) {
            hashSet.add(Character.valueOf(c9));
        }
        hashSet.add('\"');
        return hashSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i() {
        AppLovinAdLoadListener appLovinAdLoadListener = this.f4426h;
        if (appLovinAdLoadListener != null) {
            appLovinAdLoadListener.adReceived(this.g);
            this.f4426h = null;
        }
    }

    @Override // com.applovin.impl.v3.a
    public void a(y2 y2Var) {
        if (y2Var.Q().equalsIgnoreCase(this.g.getMediationServeId())) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f4289c.b(this.f4288b, "Updating flag for timeout...");
            }
            g();
        }
        this.f4287a.Z().b(this);
    }

    public e0 b(String str, e0.a aVar) {
        return a(str, this.g.S(), true, aVar);
    }

    public Uri c(String str) {
        return b(str, this.g.S(), true);
    }

    public void f() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f4289c.a(this.f4288b, "Rendered new ad:" + this.g);
        }
        AppLovinSdkUtils.runOnUiThread(new v9(11, this));
    }

    public void g() {
        this.f4429l = true;
        List list = this.f4432o;
        if (list != null && !list.isEmpty()) {
            Iterator it = this.f4432o.iterator();
            while (it.hasNext()) {
                ((c0) it.next()).a(true);
            }
        }
        if (this.f4287a.q0().e()) {
            d0 d0Var = this.f4433p;
            if (d0Var != null) {
                d0Var.c();
                return;
            }
            return;
        }
        ExecutorService executorService = this.f4430m;
        if (executorService != null) {
            executorService.shutdown();
            this.f4430m = null;
        }
        ExecutorService executorService2 = this.f4431n;
        if (executorService2 != null) {
            executorService2.shutdown();
            this.f4431n = null;
        }
    }

    public void j() {
        if (o0.d()) {
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f4289c.a(this.f4288b, "Caching mute images...");
        }
        Uri uriA = a(this.g.G(), "mute");
        if (uriA != null) {
            this.g.a(uriA);
        }
        Uri uriA2 = a(this.g.Y(), "unmute");
        if (uriA2 != null) {
            this.g.b(uriA2);
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f4289c.a(this.f4288b, "Ad updated with muteImageFilename = " + this.g.G() + ", unmuteImageFilename = " + this.g.Y());
        }
    }

    public void k() {
        this.f4287a.Z().b(this);
        if (!this.f4287a.q0().e()) {
            ExecutorService executorService = this.f4430m;
            if (executorService != null) {
                executorService.shutdown();
                this.f4430m = null;
            }
            ExecutorService executorService2 = this.f4431n;
            if (executorService2 != null) {
                executorService2.shutdown();
                this.f4431n = null;
            }
        }
        MaxAdFormat maxAdFormatD = this.g.getAdZone().d();
        if (((Boolean) this.f4287a.a(x4.X0)).booleanValue() && maxAdFormatD != null && maxAdFormatD.isFullscreenAd()) {
            this.f4287a.h().b(this.g);
        }
        this.f4287a.d0().a(this.f4427i);
    }

    public boolean l() {
        return this.f4429l;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.g.b1()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f4289c.a(this.f4288b, "Subscribing to timeout events...");
            }
            this.f4287a.Z().a(this);
        }
    }

    public Uri b(String str, List list, boolean z3) {
        if (!StringUtils.isValidString(str)) {
            return null;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f4289c.a(this.f4288b, "Caching video " + str + "...");
        }
        int iA = this.f4287a.G().a(str, this.g);
        Map mapA = f2.a((AppLovinAdImpl) this.g);
        String strA = this.j.a(a(), str, this.g.getCachePrefix(), list, z3, iA, this.f4427i, mapA);
        if (!StringUtils.isValidString(strA)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f4289c.b(this.f4288b, "Failed to cache video: " + str);
            }
            a(str, "cacheVideo", mapA);
            a(AppLovinErrorCodes.UNABLE_TO_PRECACHE_VIDEO_RESOURCES);
            return null;
        }
        File fileA = this.j.a(strA, a());
        if (fileA == null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f4289c.b(this.f4288b, "Unable to retrieve File from cached video filename = " + strA);
            }
            a(strA, "retrieveVideoFile", mapA);
            return null;
        }
        Uri uriFromFile = Uri.fromFile(fileA);
        if (uriFromFile == null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f4289c.b(this.f4288b, "Unable to create URI from cached video file = " + fileA);
            }
            a(strA, "extractUriFromVideoFile", mapA);
            return null;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f4289c.a(this.f4288b, "Finish caching video for ad #" + this.g.getAdIdNumber() + ". Updating ad with cachedVideoFilename = " + strA);
        }
        return uriFromFile;
    }

    public String c(String str, List list, boolean z3) {
        try {
            InputStream inputStreamA = this.j.a(str, list, z3, f2.a((AppLovinAdImpl) this.g));
            if (inputStreamA == null) {
                if (inputStreamA == null) {
                    return null;
                }
                inputStreamA.close();
                return null;
            }
            try {
                String strA = this.j.a(inputStreamA);
                inputStreamA.close();
                return strA;
            } finally {
            }
        } catch (Throwable th2) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f4289c.a(this.f4288b, "Unknown failure to read input stream.", th2);
            }
            this.f4289c.a(this.f4288b, th2);
            this.f4287a.D().a(this.f4288b, "readInputStreamAsString", th2);
            return null;
        }
    }

    public List e() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f4289c.a(this.f4288b, "Caching mute images...");
        }
        ArrayList arrayList = new ArrayList();
        if (this.g.G() != null) {
            arrayList.add(a(this.g.G().toString(), new a()));
        }
        if (this.g.Y() != null) {
            arrayList.add(a(this.g.Y().toString(), new b()));
        }
        return arrayList;
    }

    public List a(List list) {
        this.f4432o = list;
        return this.f4287a.q0().a(list, this.f4430m);
    }

    public e0 a(String str, e0.a aVar) {
        return new e0(str, this.g, this.f4427i, this.f4287a, aVar);
    }

    public e0 a(String str, List list, boolean z3, e0.a aVar) {
        if (TextUtils.isEmpty(str)) {
            if (!com.applovin.impl.sdk.o.a()) {
                return null;
            }
            this.f4289c.a(this.f4288b, "No video to cache, skipping...");
            return null;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f4289c.a(this.f4288b, "Caching video " + str + "...");
        }
        return new e0(str, this.g, list, z3, this.f4427i, this.f4287a, new c(aVar));
    }

    public d0 a(String str, List list, e eVar) {
        d0 d0Var = new d0(str, this.g, list, this.f4431n, this.f4427i, this.f4287a, new d(eVar));
        this.f4433p = d0Var;
        return d0Var;
    }

    public Uri a(Uri uri, String str) {
        if (uri == null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f4289c.a(this.f4288b, "No " + str + " image to cache");
            }
            return null;
        }
        String string = uri.toString();
        if (TextUtils.isEmpty(string)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f4289c.a(this.f4288b, "Failed to cache " + str + " image");
            }
            return null;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f4289c.a(this.f4288b, "Caching " + str + " image...");
        }
        return b(string);
    }

    public Uri b(String str) {
        return a(str, this.g.S(), true);
    }

    public Uri a(String str, List list, boolean z3) {
        try {
            int iA = this.f4287a.G().a(str, this.g);
            Map mapA = f2.a((AppLovinAdImpl) this.g);
            String strA = this.j.a(a(), str, this.g.getCachePrefix(), list, z3, iA, this.f4427i, mapA);
            if (StringUtils.isValidString(strA)) {
                File fileA = this.j.a(strA, a());
                if (fileA != null) {
                    Uri uriFromFile = Uri.fromFile(fileA);
                    if (uriFromFile != null) {
                        return uriFromFile;
                    }
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f4289c.b(this.f4288b, "Unable to extract Uri from image file");
                    }
                    a(strA, "extractUriFromImageFile", mapA);
                    return null;
                }
                if (com.applovin.impl.sdk.o.a()) {
                    this.f4289c.b(this.f4288b, "Unable to retrieve File from cached image filename = " + strA);
                }
                a(strA, "retrieveImageFile", mapA);
                return null;
            }
            if (com.applovin.impl.sdk.o.a()) {
                this.f4289c.b(this.f4288b, "Failed to cache image: " + str);
            }
            a(str, "cacheImageResource", mapA);
            return null;
        } catch (Throwable th2) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f4289c.a(this.f4288b, "Failed to cache image at url = " + str, th2);
            }
            Map mapA2 = f2.a((AppLovinAdImpl) this.g);
            CollectionUtils.putStringIfValid("url", str, mapA2);
            this.f4287a.D().a(this.f4288b, "cacheImageResource", th2, mapA2);
            return null;
        }
    }

    public void a(com.applovin.impl.sdk.ad.b bVar) {
        String strA0 = bVar.a0();
        if (bVar.J0() && StringUtils.isValidString(strA0)) {
            String strA = a(strA0, bVar.S(), bVar);
            bVar.c(strA);
            this.f4289c.f(this.f4288b, "Ad updated with video button HTML assets cached = " + strA);
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
            r11 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            if (r0 == 0) goto L8
            goto Lfd
        L8:
            com.applovin.impl.sdk.k r0 = r11.f4287a
            com.applovin.impl.x4 r1 = com.applovin.impl.x4.E0
            java.lang.Object r0 = r0.a(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L28
            boolean r13 = com.applovin.impl.sdk.o.a()
            if (r13 == 0) goto Lfd
            com.applovin.impl.sdk.o r13 = r11.f4289c
            java.lang.String r14 = r11.f4288b
            java.lang.String r0 = "Resource caching is disabled, skipping cache..."
            r13.a(r14, r0)
            return r12
        L28:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r12)
            java.util.List r1 = r14.Q()
            java.util.List r2 = r14.H()
            java.util.Iterator r13 = r13.iterator()
        L39:
            boolean r3 = r13.hasNext()
            if (r3 == 0) goto Lfe
            java.lang.Object r3 = r13.next()
            java.lang.String r3 = (java.lang.String) r3
            r4 = 0
            r5 = r4
        L47:
            int r6 = r0.length()
            if (r4 >= r6) goto L39
            boolean r4 = r11.l()
            if (r4 == 0) goto L55
            goto Lfd
        L55:
            int r4 = r0.indexOf(r3, r5)
            r5 = -1
            if (r4 != r5) goto L5d
            goto L39
        L5d:
            int r5 = r0.length()
            r6 = r4
        L62:
            java.util.Collection r7 = r11.f4428k
            char r8 = r0.charAt(r6)
            java.lang.Character r8 = java.lang.Character.valueOf(r8)
            boolean r7 = r7.contains(r8)
            if (r7 != 0) goto L77
            if (r6 >= r5) goto L77
            int r6 = r6 + 1
            goto L62
        L77:
            if (r6 <= r4) goto Lee
            if (r6 == r5) goto Lee
            int r5 = r3.length()
            int r5 = r5 + r4
            java.lang.String r5 = r0.substring(r5, r6)
            java.lang.String r7 = d.h.s(r3, r5)
            boolean r8 = com.applovin.impl.sdk.utils.StringUtils.isValidString(r5)
            if (r8 == 0) goto Ldc
            boolean r8 = r2.contains(r7)
            if (r8 != 0) goto Ldc
            android.net.Uri r5 = r11.a(r3, r5)
            if (r5 == 0) goto La9
            java.lang.String r8 = r5.toString()
            r0.replace(r4, r6, r8)
            java.lang.String r5 = r5.toString()
            r14.a(r5, r7)
            goto Leb
        La9:
            boolean r5 = r1.contains(r7)
            if (r5 == 0) goto Lb7
            r5 = -203(0xffffffffffffff35, float:NaN)
            r11.a(r5)
            r5 = 1
            r11.f4429l = r5
        Lb7:
            boolean r5 = com.applovin.impl.sdk.o.a()
            if (r5 == 0) goto Ld2
            com.applovin.impl.sdk.o r5 = r11.f4289c
            java.lang.String r8 = r11.f4288b
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "Failed to cache HTML Resource: "
            r9.<init>(r10)
            r9.append(r7)
            java.lang.String r9 = r9.toString()
            r5.b(r8, r9)
        Ld2:
            java.util.Map r5 = com.applovin.impl.f2.a(r14)
            java.lang.String r8 = "cacheHtmlResource"
            r11.a(r7, r8, r5)
            goto Leb
        Ldc:
            boolean r7 = com.applovin.impl.sdk.o.a()
            if (r7 == 0) goto Leb
            com.applovin.impl.sdk.o r7 = r11.f4289c
            java.lang.String r8 = r11.f4288b
            java.lang.String r9 = "Skip caching of optional or non-resource: "
            a0.g.x(r9, r5, r7, r8)
        Leb:
            r5 = r6
            goto L47
        Lee:
            boolean r13 = com.applovin.impl.sdk.o.a()
            if (r13 == 0) goto Lfd
            com.applovin.impl.sdk.o r13 = r11.f4289c
            java.lang.String r14 = r11.f4288b
            java.lang.String r0 = "Unable to cache resource; ad HTML is invalid."
            r13.b(r14, r0)
        Lfd:
            return r12
        Lfe:
            java.lang.String r12 = r0.toString()
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.l5.a(java.lang.String, java.util.List, com.applovin.impl.sdk.ad.b):java.lang.String");
    }

    private Uri a(String str, String str2) {
        File fileA = this.j.a(n7.a(Uri.parse(str2), this.g.getCachePrefix(), this.f4287a), com.applovin.impl.sdk.k.o());
        if (fileA == null) {
            return null;
        }
        if (!((Boolean) this.f4287a.a(x4.Q6)).booleanValue() && this.j.a(fileA)) {
            return Uri.parse("file://" + fileA.getAbsolutePath());
        }
        String strS = d.h.s(str, str2);
        if (!this.j.a(fileA, strS, Arrays.asList(str), this.f4287a.G().a(strS, this.g), this.f4427i, f2.a((AppLovinAdImpl) this.g))) {
            return null;
        }
        return Uri.parse("file://" + fileA.getAbsolutePath());
    }

    public void a(int i4) {
        if (this.f4426h != null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f4289c.a(this.f4288b, "Calling back ad load failed with error code: " + i4);
            }
            this.f4426h.failedToReceiveAd(i4);
            this.f4426h = null;
        }
        g();
    }

    public void a(String str, String str2, Map map) {
        HashMap map2 = new HashMap(map);
        CollectionUtils.putStringIfValid("url", str, map2);
        this.f4287a.D().a(d2.M0, str2, map2);
    }
}

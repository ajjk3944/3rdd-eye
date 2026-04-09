package com.applovin.impl;

import android.os.Bundle;
import android.text.TextUtils;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.d6;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class j implements AppLovinCommunicatorSubscriber {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f4318a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f4319b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final LinkedHashMap f4320c = new a();

    /* renamed from: d, reason: collision with root package name */
    private final Set f4321d = DesugarCollections.synchronizedSet(new HashSet());

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public class a extends LinkedHashMap {
        public a() {
        }

        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry entry) {
            return size() > 16;
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public interface b {
        void onCreativeIdGenerated(String str, String str2);
    }

    public j(com.applovin.impl.sdk.k kVar) {
        this.f4318a = kVar;
        if (c()) {
            AppLovinCommunicator.getInstance(com.applovin.impl.sdk.k.o()).subscribe(this, "safedk_ad_info");
        }
    }

    public void b(b bVar) {
        this.f4321d.remove(bVar);
    }

    public void c(String str) {
        this.f4318a.O();
        if (com.applovin.impl.sdk.o.a()) {
            a0.g.x("Removing ad info for serve id: ", str, this.f4318a.O(), "AdReviewManager");
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (this.f4319b) {
            this.f4320c.remove(str);
        }
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "j";
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("safedk_ad_info".equals(appLovinCommunicatorMessage.getTopic())) {
            Bundle bundle = appLovinCommunicatorMessage.getMessageData().getBundle("public");
            if (bundle == null) {
                this.f4318a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f4318a.O().k("AdReviewManager", "Received SafeDK ad info without public data");
                    return;
                }
                return;
            }
            Bundle bundle2 = appLovinCommunicatorMessage.getMessageData().getBundle("private");
            if (bundle2 == null) {
                this.f4318a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f4318a.O().k("AdReviewManager", "Received SafeDK ad info without private data");
                    return;
                }
                return;
            }
            if (MaxAdFormat.formatFromString(bundle2.getString("ad_format")) == null) {
                this.f4318a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f4318a.O().k("AdReviewManager", "Received SafeDK ad info without ad format");
                    return;
                }
                return;
            }
            String string = bundle2.getString(FacebookMediationAdapter.KEY_ID);
            if (TextUtils.isEmpty(string)) {
                this.f4318a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f4318a.O().k("AdReviewManager", "Received SafeDK ad info without serve id");
                    return;
                }
                return;
            }
            synchronized (this.f4319b) {
                try {
                    this.f4318a.O();
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f4318a.O().a("AdReviewManager", "Storing current SafeDK ad info for serve id: " + string + ", public data: " + bundle);
                    }
                    this.f4320c.put(string, bundle);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            String string2 = bundle.getString("ad_review_creative_id");
            this.f4318a.O();
            if (com.applovin.impl.sdk.o.a()) {
                a0.g.x("Received SafeDK ad info with Ad Review creative id: ", string2, this.f4318a.O(), "AdReviewManager");
            }
            if (!StringUtils.isValidString(string2) || this.f4321d.isEmpty()) {
                return;
            }
            HashSet hashSet = new HashSet(this.f4321d);
            this.f4318a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f4318a.O().a("AdReviewManager", "Notifying listeners: " + this.f4321d);
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                this.f4318a.q0().a((i5) new r6(this.f4318a, "creativeIdGenerated", new ci.a(this, (b) it.next(), string, string2)), d6.b.OTHER);
            }
        }
    }

    public static String b() {
        return b("getVersion");
    }

    public Bundle a(String str) {
        Bundle bundle;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.f4319b) {
            bundle = (Bundle) this.f4320c.get(str);
        }
        this.f4318a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f4318a.O().a("AdReviewManager", "Retrieved ad info (" + bundle + ") for serve id: " + str);
        }
        return bundle;
    }

    private static String b(String str) {
        Class<?> cls;
        try {
            try {
                cls = Class.forName("com.applovin.quality.AppLovinQualityService");
            } catch (Throwable unused) {
                cls = Class.forName("com.safedk.android.SafeDK");
            }
            return (String) cls.getMethod(str, null).invoke(null, null);
        } catch (Throwable unused2) {
            return "";
        }
    }

    public void a(b bVar) {
        this.f4321d.add(bVar);
    }

    public static String a() {
        return b("getSdkKey");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(b bVar, String str, String str2) {
        this.f4318a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f4318a.O().a("AdReviewManager", "Notifying Ad Review creative id generated for listener: " + bVar);
        }
        bVar.onCreativeIdGenerated(str, str2);
    }

    public static boolean c() {
        return StringUtils.isValidString(b());
    }
}

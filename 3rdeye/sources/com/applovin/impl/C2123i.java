package com.applovin.impl;

import N7.C1154e9;
import android.os.Bundle;
import android.text.TextUtils;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.r5;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.singular.sdk.internal.SingularParamsBase;
import io.appmetrica.analytics.BuildConfig;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.applovin.impl.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2123i implements AppLovinCommunicatorSubscriber {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f19512a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f19513b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final LinkedHashMap f19514c = new a();

    /* renamed from: d, reason: collision with root package name */
    private final Set f19515d = Collections.synchronizedSet(new HashSet());

    /* renamed from: com.applovin.impl.i$a */
    public class a extends LinkedHashMap {
        public a() {
        }

        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry entry) {
            return size() > 16;
        }
    }

    /* renamed from: com.applovin.impl.i$b */
    public interface b {
        void onCreativeIdGenerated(String str, String str2);
    }

    public C2123i(com.applovin.impl.sdk.k kVar) {
        this.f19512a = kVar;
        if (c()) {
            AppLovinCommunicator.getInstance(com.applovin.impl.sdk.k.o()).subscribe(this, "safedk_ad_info");
        }
    }

    public void b(b bVar) {
        this.f19515d.remove(bVar);
    }

    public void c(String str) {
        this.f19512a.O();
        if (com.applovin.impl.sdk.o.a()) {
            C1154e9.m("Removing ad info for serve id: ", str, this.f19512a.O(), "AdReviewManager");
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (this.f19513b) {
            this.f19514c.remove(str);
        }
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return SingularParamsBase.Constants.PACKAGE_NAME_KEY;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("safedk_ad_info".equals(appLovinCommunicatorMessage.getTopic())) {
            Bundle bundle = appLovinCommunicatorMessage.getMessageData().getBundle(BuildConfig.SDK_BUILD_FLAVOR);
            if (bundle == null) {
                this.f19512a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f19512a.O().k("AdReviewManager", "Received SafeDK ad info without public data");
                    return;
                }
                return;
            }
            Bundle bundle2 = appLovinCommunicatorMessage.getMessageData().getBundle("private");
            if (bundle2 == null) {
                this.f19512a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f19512a.O().k("AdReviewManager", "Received SafeDK ad info without private data");
                    return;
                }
                return;
            }
            if (MaxAdFormat.formatFromString(bundle2.getString("ad_format")) == null) {
                this.f19512a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f19512a.O().k("AdReviewManager", "Received SafeDK ad info without ad format");
                    return;
                }
                return;
            }
            String string = bundle2.getString(FacebookMediationAdapter.KEY_ID);
            if (TextUtils.isEmpty(string)) {
                this.f19512a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f19512a.O().k("AdReviewManager", "Received SafeDK ad info without serve id");
                    return;
                }
                return;
            }
            synchronized (this.f19513b) {
                try {
                    this.f19512a.O();
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f19512a.O().a("AdReviewManager", "Storing current SafeDK ad info for serve id: " + string + ", public data: " + bundle);
                    }
                    this.f19514c.put(string, bundle);
                } catch (Throwable th) {
                    throw th;
                }
            }
            String string2 = bundle.getString("ad_review_creative_id");
            this.f19512a.O();
            if (com.applovin.impl.sdk.o.a()) {
                C1154e9.m("Received SafeDK ad info with Ad Review creative id: ", string2, this.f19512a.O(), "AdReviewManager");
            }
            if (!StringUtils.isValidString(string2) || this.f19515d.isEmpty()) {
                return;
            }
            HashSet hashSet = new HashSet(this.f19515d);
            this.f19512a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f19512a.O().a("AdReviewManager", "Notifying listeners: " + this.f19515d);
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                this.f19512a.q0().a((w4) new f6(this.f19512a, "creativeIdGenerated", new T1.p(this, (b) it.next(), string, string2, 3)), r5.b.OTHER);
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
        synchronized (this.f19513b) {
            bundle = (Bundle) this.f19514c.get(str);
        }
        this.f19512a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f19512a.O().a("AdReviewManager", "Retrieved ad info (" + bundle + ") for serve id: " + str);
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
        this.f19515d.add(bVar);
    }

    public static String a() {
        return b("getSdkKey");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(b bVar, String str, String str2) {
        this.f19512a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f19512a.O().a("AdReviewManager", "Notifying Ad Review creative id generated for listener: " + bVar);
        }
        bVar.onCreativeIdGenerated(str, str2);
    }

    public static boolean c() {
        return StringUtils.isValidString(b());
    }
}

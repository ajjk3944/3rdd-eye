package com.applovin.impl;

import android.os.Bundle;
import android.text.TextUtils;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.d6;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridge;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class j implements AppLovinCommunicatorSubscriber {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f6257a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f6258b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final LinkedHashMap f6259c = new a();

    /* renamed from: d, reason: collision with root package name */
    private final Set f6260d = Collections.synchronizedSet(new HashSet());

    public class a extends LinkedHashMap {
        public a() {
        }

        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry entry) {
            return size() > 16;
        }
    }

    public interface b {
        void onCreativeIdGenerated(String str, String str2);
    }

    public j(com.applovin.impl.sdk.k kVar) {
        this.f6257a = kVar;
        if (c()) {
            AppLovinCommunicator.getInstance(com.applovin.impl.sdk.k.o()).subscribe(this, "safedk_ad_info");
        }
    }

    public void b(b bVar) {
        this.f6260d.remove(bVar);
    }

    public void c(String str) {
        this.f6257a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f6257a.O().a("AdReviewManager", "Removing ad info for serve id: " + str);
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (this.f6258b) {
            this.f6259c.remove(str);
        }
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return j.class.getSimpleName();
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("safedk_ad_info".equals(appLovinCommunicatorMessage.getTopic())) {
            Bundle bundle = appLovinCommunicatorMessage.getMessageData().getBundle("public");
            if (bundle == null) {
                this.f6257a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f6257a.O().k("AdReviewManager", "Received SafeDK ad info without public data");
                    return;
                }
                return;
            }
            Bundle bundle2 = appLovinCommunicatorMessage.getMessageData().getBundle("private");
            if (bundle2 == null) {
                this.f6257a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f6257a.O().k("AdReviewManager", "Received SafeDK ad info without private data");
                    return;
                }
                return;
            }
            if (MaxAdFormat.formatFromString(bundle2.getString("ad_format")) == null) {
                this.f6257a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f6257a.O().k("AdReviewManager", "Received SafeDK ad info without ad format");
                    return;
                }
                return;
            }
            final String string = bundle2.getString("id");
            if (TextUtils.isEmpty(string)) {
                this.f6257a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f6257a.O().k("AdReviewManager", "Received SafeDK ad info without serve id");
                    return;
                }
                return;
            }
            synchronized (this.f6258b) {
                try {
                    this.f6257a.O();
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f6257a.O().a("AdReviewManager", "Storing current SafeDK ad info for serve id: " + string + ", public data: " + bundle);
                    }
                    this.f6259c.put(string, bundle);
                } catch (Throwable th) {
                    throw th;
                }
            }
            final String string2 = bundle.getString("ad_review_creative_id");
            this.f6257a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f6257a.O().a("AdReviewManager", "Received SafeDK ad info with Ad Review creative id: " + string2);
            }
            if (!StringUtils.isValidString(string2) || this.f6260d.isEmpty()) {
                return;
            }
            HashSet hashSet = new HashSet(this.f6260d);
            this.f6257a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f6257a.O().a("AdReviewManager", "Notifying listeners: " + this.f6260d);
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                final b bVar = (b) it.next();
                this.f6257a.q0().a((i5) new r6(this.f6257a, "creativeIdGenerated", new Runnable() { // from class: com.applovin.impl.fb
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f6027a.a(bVar, string, string2);
                    }
                }), d6.b.OTHER);
            }
        }
    }

    public static String b() {
        return b(MobileAdsBridge.versionMethodName);
    }

    public Bundle a(String str) {
        Bundle bundle;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.f6258b) {
            bundle = (Bundle) this.f6259c.get(str);
        }
        this.f6257a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f6257a.O().a("AdReviewManager", "Retrieved ad info (" + bundle + ") for serve id: " + str);
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

    public static boolean c() {
        return StringUtils.isValidString(b());
    }

    public void a(b bVar) {
        this.f6260d.add(bVar);
    }

    public static String a() {
        return b("getSdkKey");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(b bVar, String str, String str2) {
        this.f6257a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f6257a.O().a("AdReviewManager", "Notifying Ad Review creative id generated for listener: " + bVar);
        }
        bVar.onCreativeIdGenerated(str, str2);
    }
}

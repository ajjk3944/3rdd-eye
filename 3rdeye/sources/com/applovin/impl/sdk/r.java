package com.applovin.impl.sdk;

import C.E;
import C.T;
import K6.C0707a;
import N7.C1154e9;
import android.adservices.measurement.MeasurementManager;
import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.GetTopicsResponse;
import android.adservices.topics.Topic;
import android.adservices.topics.TopicsManager;
import android.content.Context;
import android.net.Uri;
import android.os.OutcomeReceiver;
import android.text.TextUtils;
import android.view.InputEvent;
import com.applovin.impl.e4;
import com.applovin.impl.f6;
import com.applovin.impl.l4;
import com.applovin.impl.r5;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    private final k f21415a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f21416b;

    /* renamed from: e, reason: collision with root package name */
    private final MeasurementManager f21419e;

    /* renamed from: h, reason: collision with root package name */
    private final TopicsManager f21422h;

    /* renamed from: c, reason: collision with root package name */
    private final Set f21417c = new HashSet();

    /* renamed from: d, reason: collision with root package name */
    private final Object f21418d = new Object();

    /* renamed from: f, reason: collision with root package name */
    private final AtomicReference f21420f = new AtomicReference(new JSONArray());

    /* renamed from: g, reason: collision with root package name */
    private final d f21421g = new d(this, null);

    public class a implements OutcomeReceiver {
        public a() {
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onError(Exception exc) {
            r.this.f21415a.O();
            if (o.a()) {
                r.this.f21415a.O().a("PrivacySandboxService", "Failed to register impression", exc);
            }
        }

        public void onResult(Object obj) {
            r.this.f21415a.O();
            if (o.a()) {
                r.this.f21415a.O().a("PrivacySandboxService", "Successfully registered impression");
            }
        }
    }

    public class b implements OutcomeReceiver {
        public b() {
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onError(Exception exc) {
            r.this.f21415a.O();
            if (o.a()) {
                r.this.f21415a.O().a("PrivacySandboxService", "Failed to register click", exc);
            }
        }

        public void onResult(Object obj) {
            r.this.f21415a.O();
            if (o.a()) {
                r.this.f21415a.O().a("PrivacySandboxService", "Successfully registered click");
            }
        }
    }

    public class c implements OutcomeReceiver {
        public c() {
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onError(Exception exc) {
            r.this.f21415a.O();
            if (o.a()) {
                r.this.f21415a.O().a("PrivacySandboxService", "Failed to register conversion", exc);
            }
        }

        public void onResult(Object obj) {
            r.this.f21415a.O();
            if (o.a()) {
                r.this.f21415a.O().a("PrivacySandboxService", "Successfully registered conversion");
            }
        }
    }

    public class d implements OutcomeReceiver {
        private d() {
        }

        public void a(GetTopicsResponse getTopicsResponse) {
            List topics = getTopicsResponse.getTopics();
            int size = topics.size();
            r.this.f21415a.O();
            if (o.a()) {
                r.this.f21415a.O().d("PrivacySandboxService", size + " topic(s) received");
            }
            JSONArray jSONArray = new JSONArray();
            Iterator it = topics.iterator();
            while (it.hasNext()) {
                Topic topicE = O8.c.e(it.next());
                JSONObject jSONObject = new JSONObject();
                JsonUtils.putInt(jSONObject, FacebookMediationAdapter.KEY_ID, topicE.getTopicId());
                JsonUtils.putLong(jSONObject, CommonUrlParts.MODEL, topicE.getModelVersion());
                JsonUtils.putLong(jSONObject, "taxonomy", topicE.getTaxonomyVersion());
                jSONArray.put(jSONObject);
            }
            r.this.f21420f.set(jSONArray);
            r.this.b(((Boolean) r.this.f21415a.a(l4.f19724D6)).booleanValue(), ((Long) r.this.f21415a.a(l4.f19708B6)).longValue());
        }

        public /* bridge */ /* synthetic */ void onResult(Object obj) {
            a(C0707a.c(obj));
        }

        public /* synthetic */ d(r rVar, a aVar) {
            this();
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onError(Exception exc) {
            String str;
            Long l5 = (Long) r.this.f21415a.a(l4.f19716C6);
            boolean z10 = l5.longValue() == -1;
            r.this.f21415a.O();
            if (o.a()) {
                o oVarO = r.this.f21415a.O();
                StringBuilder sb = new StringBuilder("Failed to retrieve topics");
                if (z10) {
                    str = "";
                } else {
                    str = ", retrying in " + l5 + " ms";
                }
                sb.append(str);
                oVarO.a("PrivacySandboxService", sb.toString(), exc);
            }
            if (z10) {
                return;
            }
            r.this.b(((Boolean) r.this.f21415a.a(l4.f19732E6)).booleanValue(), l5.longValue());
        }
    }

    public r(k kVar) {
        this.f21415a = kVar;
        this.f21416b = kVar.q0().a();
        Context contextO = k.o();
        this.f21419e = O8.c.b(contextO.getSystemService(O8.b.c()));
        this.f21422h = C0707a.d(contextO.getSystemService(Q9.r.c()));
        if (((Boolean) kVar.a(l4.f19700A6)).booleanValue()) {
            b(((Boolean) kVar.a(l4.f19724D6)).booleanValue(), 0L);
        }
    }

    private boolean c(String str) {
        synchronized (this.f21418d) {
            try {
                if (this.f21417c.contains(str)) {
                    return false;
                }
                this.f21417c.add(str);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b(List list) {
        a("register impression", new B.c(23, this, list));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(List list) {
        if (list == null || list.isEmpty() || this.f21419e == null || !e4.e(k.f21162D0)) {
            return;
        }
        this.f21415a.O();
        if (o.a()) {
            this.f21415a.O().a("PrivacySandboxService", "Registering impression...");
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.f21419e.registerSource(Uri.parse((String) it.next()), null, this.f21416b, new a());
        }
    }

    public void b(List list, InputEvent inputEvent) {
        a("register click", new J4.h(this, list, inputEvent, 13));
    }

    public void b(String str) {
        a("register conversion trigger event", new E(12, this, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(boolean z10, long j4) {
        a("retrieve topics", new v(this, z10, j4, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(List list, InputEvent inputEvent) {
        if (list == null || list.isEmpty() || this.f21419e == null || !e4.e(k.f21162D0)) {
            return;
        }
        this.f21415a.O();
        if (o.a()) {
            this.f21415a.O().a("PrivacySandboxService", "Registering click...");
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.f21419e.registerSource(Uri.parse((String) it.next()), inputEvent, this.f21416b, new b());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str) {
        if (TextUtils.isEmpty(str) || this.f21419e == null || !e4.e(k.f21162D0)) {
            return;
        }
        this.f21415a.O();
        if (o.a()) {
            C1154e9.m("Registering conversion: ", str, this.f21415a.O(), "PrivacySandboxService");
        }
        this.f21419e.registerTrigger(Uri.parse(str), this.f21416b, new c());
    }

    public JSONArray a() {
        return (JSONArray) this.f21420f.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(boolean z10, long j4) {
        if (this.f21422h == null) {
            return;
        }
        GetTopicsRequest getTopicsRequestBuild = Q9.r.b().setShouldRecordObservation(z10).setAdsSdkName("AppLovin").build();
        if (j4 <= 0) {
            this.f21422h.getTopics(getTopicsRequestBuild, this.f21416b, this.f21421g);
        } else {
            this.f21415a.q0().a(new f6(this.f21415a, true, "getTopics", new T(24, this, getTopicsRequestBuild)), r5.b.OTHER, j4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(GetTopicsRequest getTopicsRequest) {
        this.f21422h.getTopics(getTopicsRequest, this.f21416b, this.f21421g);
    }

    private void a(String str, Runnable runnable) {
        try {
            this.f21415a.O();
            if (o.a()) {
                this.f21415a.O().a("PrivacySandboxService", "Running operation: " + str);
            }
            runnable.run();
        } catch (Throwable th) {
            this.f21415a.O();
            if (o.a()) {
                this.f21415a.O().a("PrivacySandboxService", "Failed to run operation: " + str, th);
            }
            if (c(str)) {
                this.f21415a.E().a("PrivacySandboxService", str, th);
            }
        }
    }
}

package com.applovin.impl.adview.activity;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.impl.C2145t;
import com.applovin.impl.a2;
import com.applovin.impl.adview.activity.FullscreenAdService;
import com.applovin.impl.h2;
import com.applovin.impl.r1;
import com.applovin.impl.s5;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.y1;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    private final k f19011a;

    /* renamed from: b, reason: collision with root package name */
    private final o f19012b;

    /* renamed from: c, reason: collision with root package name */
    private final WeakReference f19013c;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f19014d = new AtomicBoolean();

    /* renamed from: e, reason: collision with root package name */
    private Messenger f19015e;

    /* renamed from: com.applovin.impl.adview.activity.a$a, reason: collision with other inner class name */
    public class C0306a implements AppLovinAdLoadListener {
        public C0306a() {
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void adReceived(AppLovinAd appLovinAd) {
            AppLovinFullscreenActivity appLovinFullscreenActivity = (AppLovinFullscreenActivity) a.this.f19013c.get();
            if (appLovinFullscreenActivity != null) {
                o unused = a.this.f19012b;
                if (o.a()) {
                    a.this.f19012b.a("AppLovinFullscreenActivity", "Presenting ad...");
                }
                b bVar = new b(a.this, null);
                r1.a((com.applovin.impl.sdk.ad.b) appLovinAd, bVar, bVar, bVar, null, a.this.f19011a, appLovinFullscreenActivity, new C0307a(appLovinFullscreenActivity, appLovinAd, bVar));
                return;
            }
            o unused2 = a.this.f19012b;
            if (o.a()) {
                a.this.f19012b.b("AppLovinFullscreenActivity", "Unable to present ad, parent activity has been GC'd - " + appLovinAd);
            }
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void failedToReceiveAd(int i) {
            a.this.a("failed_to_receive_ad");
        }

        /* renamed from: com.applovin.impl.adview.activity.a$a$a, reason: collision with other inner class name */
        public class C0307a implements r1.f {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ AppLovinFullscreenActivity f19017a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AppLovinAd f19018b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ b f19019c;

            public C0307a(AppLovinFullscreenActivity appLovinFullscreenActivity, AppLovinAd appLovinAd, b bVar) {
                this.f19017a = appLovinFullscreenActivity;
                this.f19018b = appLovinAd;
                this.f19019c = bVar;
            }

            @Override // com.applovin.impl.r1.f
            public void a(r1 r1Var) {
                this.f19017a.setPresenter(r1Var);
                r1Var.x();
            }

            @Override // com.applovin.impl.r1.f
            public void a(String str, Throwable th) {
                h2.a((com.applovin.impl.sdk.ad.b) this.f19018b, this.f19019c, str, th, this.f19017a);
                Map mapA = a2.a((AppLovinAdImpl) this.f19018b);
                CollectionUtils.putStringIfValid(AdRevenueConstants.SOURCE_KEY, "processAdResponse", mapA);
                CollectionUtils.putStringIfValid("error_message", str, mapA);
                CollectionUtils.putStringIfValid("top_main_method", th.toString(), mapA);
                a.this.f19011a.g().d(y1.f21817s, mapA);
            }
        }
    }

    public class b implements AppLovinAdDisplayListener, AppLovinAdClickListener, AppLovinAdVideoPlaybackListener {
        private b() {
        }

        private void a(FullscreenAdService.c cVar) throws RemoteException {
            a(null, cVar);
        }

        @Override // com.applovin.sdk.AppLovinAdClickListener
        public void adClicked(AppLovinAd appLovinAd) throws RemoteException {
            a(FullscreenAdService.c.AD_CLICKED);
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adDisplayed(AppLovinAd appLovinAd) throws RemoteException {
            a(FullscreenAdService.c.AD_DISPLAYED);
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adHidden(AppLovinAd appLovinAd) throws RemoteException {
            a(FullscreenAdService.c.AD_HIDDEN);
        }

        @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
        public void videoPlaybackBegan(AppLovinAd appLovinAd) throws RemoteException {
            a(FullscreenAdService.c.AD_VIDEO_STARTED);
        }

        @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
        public void videoPlaybackEnded(AppLovinAd appLovinAd, double d10, boolean z10) throws RemoteException {
            Bundle bundle = new Bundle();
            bundle.putDouble("percent_viewed", d10);
            bundle.putBoolean("fully_watched", z10);
            a(bundle, FullscreenAdService.c.AD_VIDEO_ENDED);
        }

        public /* synthetic */ b(a aVar, C0306a c0306a) {
            this();
        }

        private void a(Bundle bundle, FullscreenAdService.c cVar) throws RemoteException {
            Message messageObtain = Message.obtain((Handler) null, cVar.b());
            if (bundle != null) {
                messageObtain.setData(bundle);
            }
            try {
                a.this.f19015e.send(messageObtain);
            } catch (RemoteException e4) {
                o unused = a.this.f19012b;
                if (o.a()) {
                    a.this.f19012b.a("AppLovinFullscreenActivity", "Failed to forward callback (" + cVar.b() + ")", e4);
                }
            }
        }
    }

    public static class c extends Handler {

        /* renamed from: a, reason: collision with root package name */
        private final WeakReference f19022a;

        public /* synthetic */ c(a aVar, C0306a c0306a) {
            this(aVar);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            a aVar;
            if (message.what != FullscreenAdService.c.AD.b() || (aVar = (a) this.f19022a.get()) == null) {
                super.handleMessage(message);
            } else {
                aVar.b(message.getData().getString(FullscreenAdService.DATA_KEY_RAW_FULL_AD_RESPONSE));
            }
        }

        private c(a aVar) {
            this.f19022a = new WeakReference(aVar);
        }
    }

    public a(AppLovinFullscreenActivity appLovinFullscreenActivity, k kVar) {
        this.f19011a = kVar;
        this.f19012b = kVar.O();
        this.f19013c = new WeakReference(appLovinFullscreenActivity);
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) throws RemoteException {
        if (this.f19014d.compareAndSet(false, true)) {
            if (o.a()) {
                this.f19012b.a("AppLovinFullscreenActivity", "Fullscreen ad service connected to " + componentName);
            }
            this.f19015e = new Messenger(iBinder);
            Message messageObtain = Message.obtain((Handler) null, FullscreenAdService.c.AD.b());
            messageObtain.replyTo = new Messenger(new c(this, null));
            try {
                if (o.a()) {
                    this.f19012b.a("AppLovinFullscreenActivity", "Requesting ad from FullscreenAdService...");
                }
                this.f19015e.send(messageObtain);
            } catch (RemoteException e4) {
                if (o.a()) {
                    this.f19012b.a("AppLovinFullscreenActivity", "Failed to send ad request message to FullscreenAdService", e4);
                }
                a("failed_to_send_ad_request");
            }
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        if (this.f19014d.compareAndSet(true, false) && o.a()) {
            this.f19012b.a("AppLovinFullscreenActivity", "FullscreenAdService disconnected from " + componentName);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        AppLovinFullscreenActivity appLovinFullscreenActivity = (AppLovinFullscreenActivity) this.f19013c.get();
        if (appLovinFullscreenActivity != null) {
            if (o.a()) {
                this.f19012b.a("AppLovinFullscreenActivity", "Dismissing...");
            }
            appLovinFullscreenActivity.dismiss(str);
        } else if (o.a()) {
            this.f19012b.b("AppLovinFullscreenActivity", "Unable to dismiss parent Activity");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = JsonUtils.getString(jSONObject, AppLovinUtils.ServerParameterKeys.ZONE_ID, "");
            if (TextUtils.isEmpty(string)) {
                throw new IllegalStateException("No zone identifier found in ad response: " + jSONObject);
            }
            this.f19011a.q0().a(new s5(jSONObject, C2145t.a(string), true, new C0306a(), this.f19011a));
        } catch (JSONException e4) {
            if (o.a()) {
                this.f19012b.a("AppLovinFullscreenActivity", "Unable to process ad: " + str, e4);
            }
            a("failed_to_process_ad");
        }
    }
}

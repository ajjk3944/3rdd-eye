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
import com.applovin.impl.adview.activity.FullscreenAdService;
import com.applovin.impl.d2;
import com.applovin.impl.e6;
import com.applovin.impl.f2;
import com.applovin.impl.n2;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.u;
import com.applovin.impl.w1;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class a implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    private final k f3651a;

    /* renamed from: b, reason: collision with root package name */
    private final o f3652b;

    /* renamed from: c, reason: collision with root package name */
    private final WeakReference f3653c;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f3654d = new AtomicBoolean();

    /* renamed from: e, reason: collision with root package name */
    private Messenger f3655e;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    /* renamed from: com.applovin.impl.adview.activity.a$a, reason: collision with other inner class name */
    public class C0006a implements AppLovinAdLoadListener {
        public C0006a() {
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void adReceived(AppLovinAd appLovinAd) {
            AppLovinFullscreenActivity appLovinFullscreenActivity = (AppLovinFullscreenActivity) a.this.f3653c.get();
            if (appLovinFullscreenActivity != null) {
                o unused = a.this.f3652b;
                if (o.a()) {
                    a.this.f3652b.a("AppLovinFullscreenActivity", "Presenting ad...");
                }
                b bVar = new b(a.this, null);
                w1.a((com.applovin.impl.sdk.ad.b) appLovinAd, bVar, bVar, bVar, null, a.this.f3651a, appLovinFullscreenActivity, new C0007a(appLovinFullscreenActivity, appLovinAd, bVar));
                return;
            }
            o unused2 = a.this.f3652b;
            if (o.a()) {
                a.this.f3652b.b("AppLovinFullscreenActivity", "Unable to present ad, parent activity has been GC'd - " + appLovinAd);
            }
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void failedToReceiveAd(int i4) {
            a.this.a("failed_to_receive_ad");
        }

        /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
        /* renamed from: com.applovin.impl.adview.activity.a$a$a, reason: collision with other inner class name */
        public class C0007a implements w1.g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ AppLovinFullscreenActivity f3657a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AppLovinAd f3658b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ b f3659c;

            public C0007a(AppLovinFullscreenActivity appLovinFullscreenActivity, AppLovinAd appLovinAd, b bVar) {
                this.f3657a = appLovinFullscreenActivity;
                this.f3658b = appLovinAd;
                this.f3659c = bVar;
            }

            @Override // com.applovin.impl.w1.g
            public void a(w1 w1Var) {
                this.f3657a.setPresenter(w1Var);
                w1Var.w();
            }

            @Override // com.applovin.impl.w1.g
            public void a(String str, Throwable th2) {
                n2.a((com.applovin.impl.sdk.ad.b) this.f3658b, this.f3659c, str, th2, this.f3657a);
                Map mapA = f2.a((AppLovinAdImpl) this.f3658b);
                CollectionUtils.putStringIfValid("source", "processAdResponse", mapA);
                CollectionUtils.putStringIfValid("error_message", str, mapA);
                CollectionUtils.putStringIfValid("top_main_method", th2.toString(), mapA);
                a.this.f3651a.g().d(d2.F, mapA);
            }
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
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
        public void videoPlaybackEnded(AppLovinAd appLovinAd, double d10, boolean z3) throws RemoteException {
            Bundle bundle = new Bundle();
            bundle.putDouble("percent_viewed", d10);
            bundle.putBoolean("fully_watched", z3);
            a(bundle, FullscreenAdService.c.AD_VIDEO_ENDED);
        }

        public /* synthetic */ b(a aVar, C0006a c0006a) {
            this();
        }

        private void a(Bundle bundle, FullscreenAdService.c cVar) throws RemoteException {
            Message messageObtain = Message.obtain((Handler) null, cVar.b());
            if (bundle != null) {
                messageObtain.setData(bundle);
            }
            try {
                a.this.f3655e.send(messageObtain);
            } catch (RemoteException e2) {
                o unused = a.this.f3652b;
                if (o.a()) {
                    a.this.f3652b.a("AppLovinFullscreenActivity", "Failed to forward callback (" + cVar.b() + ")", e2);
                }
            }
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class c extends Handler {

        /* renamed from: a, reason: collision with root package name */
        private final WeakReference f3662a;

        public /* synthetic */ c(a aVar, C0006a c0006a) {
            this(aVar);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            a aVar;
            if (message.what != FullscreenAdService.c.AD.b() || (aVar = (a) this.f3662a.get()) == null) {
                super.handleMessage(message);
            } else {
                aVar.b(message.getData().getString(FullscreenAdService.DATA_KEY_RAW_FULL_AD_RESPONSE));
            }
        }

        private c(a aVar) {
            this.f3662a = new WeakReference(aVar);
        }
    }

    public a(AppLovinFullscreenActivity appLovinFullscreenActivity, k kVar) {
        this.f3651a = kVar;
        this.f3652b = kVar.O();
        this.f3653c = new WeakReference(appLovinFullscreenActivity);
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) throws RemoteException {
        if (this.f3654d.compareAndSet(false, true)) {
            if (o.a()) {
                this.f3652b.a("AppLovinFullscreenActivity", "Fullscreen ad service connected to " + componentName);
            }
            this.f3655e = new Messenger(iBinder);
            Message messageObtain = Message.obtain((Handler) null, FullscreenAdService.c.AD.b());
            messageObtain.replyTo = new Messenger(new c(this, null));
            try {
                if (o.a()) {
                    this.f3652b.a("AppLovinFullscreenActivity", "Requesting ad from FullscreenAdService...");
                }
                this.f3655e.send(messageObtain);
            } catch (RemoteException e2) {
                if (o.a()) {
                    this.f3652b.a("AppLovinFullscreenActivity", "Failed to send ad request message to FullscreenAdService", e2);
                }
                a("failed_to_send_ad_request");
            }
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        if (this.f3654d.compareAndSet(true, false) && o.a()) {
            this.f3652b.a("AppLovinFullscreenActivity", "FullscreenAdService disconnected from " + componentName);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        AppLovinFullscreenActivity appLovinFullscreenActivity = (AppLovinFullscreenActivity) this.f3653c.get();
        if (appLovinFullscreenActivity != null) {
            if (o.a()) {
                this.f3652b.a("AppLovinFullscreenActivity", "Dismissing...");
            }
            appLovinFullscreenActivity.dismiss(str);
        } else if (o.a()) {
            this.f3652b.b("AppLovinFullscreenActivity", "Unable to dismiss parent Activity");
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
            this.f3651a.q0().a(new e6(jSONObject, u.a(string), true, new C0006a(), this.f3651a));
        } catch (JSONException e2) {
            if (o.a()) {
                this.f3652b.a("AppLovinFullscreenActivity", "Unable to process ad: " + str, e2);
            }
            a("failed_to_process_ad");
        }
    }
}

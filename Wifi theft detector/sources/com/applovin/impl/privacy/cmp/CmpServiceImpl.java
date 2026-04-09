package com.applovin.impl.privacy.cmp;

import android.app.Activity;
import android.os.Bundle;
import androidx.annotation.NonNull;
import com.applovin.impl.k0;
import com.applovin.impl.n7;
import com.applovin.impl.privacy.cmp.a;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.o;
import com.applovin.sdk.AppLovinCmpError;
import com.applovin.sdk.AppLovinCmpService;
import com.applovin.sdk.AppLovinSdkUtils;

/* loaded from: classes.dex */
public class CmpServiceImpl implements AppLovinCmpService, a.InterfaceC0081a {

    /* renamed from: a, reason: collision with root package name */
    private final k f7292a;

    /* renamed from: e, reason: collision with root package name */
    private AppLovinCmpError f7296e;

    /* renamed from: f, reason: collision with root package name */
    private e f7297f;

    /* renamed from: g, reason: collision with root package name */
    private f f7298g;

    /* renamed from: c, reason: collision with root package name */
    private final Object f7294c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private d f7295d = d.NONE;

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.privacy.cmp.a f7293b = c();

    public class a implements e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AppLovinCmpService.OnCompletedListener f7299a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Activity f7300b;

        /* renamed from: com.applovin.impl.privacy.cmp.CmpServiceImpl$a$a, reason: collision with other inner class name */
        public class C0080a implements f {
            public C0080a() {
            }

            @Override // com.applovin.impl.privacy.cmp.CmpServiceImpl.f
            public void a(AppLovinCmpError appLovinCmpError) {
                a.this.f7299a.onCompleted(appLovinCmpError);
            }
        }

        public a(AppLovinCmpService.OnCompletedListener onCompletedListener, Activity activity) {
            this.f7299a = onCompletedListener;
            this.f7300b = activity;
        }

        @Override // com.applovin.impl.privacy.cmp.CmpServiceImpl.e
        public void a(AppLovinCmpError appLovinCmpError) {
            if (appLovinCmpError != null) {
                this.f7299a.onCompleted(appLovinCmpError);
            } else {
                CmpServiceImpl.this.showCmp(this.f7300b, new C0080a());
            }
        }
    }

    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Activity f7303a;

        public b(Activity activity) {
            this.f7303a = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            CmpServiceImpl.this.f7293b.b(this.f7303a, CmpServiceImpl.this.a(), CmpServiceImpl.this);
        }
    }

    public class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Activity f7305a;

        public c(Activity activity) {
            this.f7305a = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            CmpServiceImpl.this.f7293b.a(this.f7305a, CmpServiceImpl.this.a(), CmpServiceImpl.this);
        }
    }

    public enum d {
        NONE,
        LOADING,
        COMPLETED
    }

    public interface e {
        void a(AppLovinCmpError appLovinCmpError);
    }

    public interface f {
        void a(AppLovinCmpError appLovinCmpError);
    }

    public CmpServiceImpl(k kVar) {
        this.f7292a = kVar;
    }

    private com.applovin.impl.privacy.cmp.a c() {
        if (n7.a("com.google.android.ump.ConsentForm")) {
            return new com.applovin.impl.privacy.cmp.a(this.f7292a);
        }
        if (!this.f7292a.x().j()) {
            return null;
        }
        o.h("AppLovinSdk", "Could not load Google UMP. Please add the Google User Messaging Platform SDK into your application. Instructions can be found here: https://support.axon.ai/en/max/android/overview/terms-and-privacy-policy-flow#enabling-google-ump");
        return null;
    }

    private void d() {
        if (hasSupportedCmp()) {
            this.f7293b.c();
        }
    }

    @Override // com.applovin.sdk.AppLovinCmpService
    public boolean hasSupportedCmp() {
        return this.f7293b != null;
    }

    public void loadCmp(Activity activity, e eVar) {
        a(activity, eVar);
    }

    @Override // com.applovin.impl.privacy.cmp.a.InterfaceC0081a
    public void onFlowHidden(Bundle bundle) {
        b((AppLovinCmpError) null);
        b();
    }

    @Override // com.applovin.impl.privacy.cmp.a.InterfaceC0081a
    public void onFlowLoadFailed(CmpErrorImpl cmpErrorImpl) {
        b();
        synchronized (this.f7294c) {
            try {
                if (this.f7297f == null) {
                    this.f7295d = d.COMPLETED;
                    this.f7296e = cmpErrorImpl;
                } else {
                    this.f7295d = d.NONE;
                    a(cmpErrorImpl);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.applovin.impl.privacy.cmp.a.InterfaceC0081a
    public void onFlowLoaded(Bundle bundle) {
        synchronized (this.f7294c) {
            try {
                if (this.f7297f == null) {
                    this.f7295d = d.COMPLETED;
                } else {
                    this.f7295d = d.NONE;
                    a((AppLovinCmpError) null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.applovin.impl.privacy.cmp.a.InterfaceC0081a
    public void onFlowShowFailed(CmpErrorImpl cmpErrorImpl) {
        b(cmpErrorImpl);
        b();
    }

    public void preloadCmp(Activity activity) {
        a(activity, null);
    }

    public void showCmp(Activity activity, f fVar) {
        b bVar = new b(activity);
        this.f7298g = fVar;
        if (this.f7293b.e()) {
            AppLovinSdkUtils.runOnUiThread(bVar);
        } else {
            bVar.run();
        }
    }

    @Override // com.applovin.sdk.AppLovinCmpService
    public void showCmpForExistingUser(@NonNull Activity activity, @NonNull AppLovinCmpService.OnCompletedListener onCompletedListener) {
        this.f7292a.O();
        if (o.a()) {
            this.f7292a.O().a("AppLovinCmpService", "showCmpForExistingUser(activity=" + activity + ", completedListener=" + onCompletedListener + ")");
        }
        if (!this.f7292a.x().j()) {
            o.h("AppLovinCmpService", "Unable to show CMP for existing user. Please enable the consent flow.");
            onCompletedListener.onCompleted(new CmpErrorImpl(AppLovinCmpError.Code.INTEGRATION_ERROR, "Consent flow is not enabled"));
        } else if (!hasSupportedCmp()) {
            onCompletedListener.onCompleted(new CmpErrorImpl(AppLovinCmpError.Code.INTEGRATION_ERROR, "A supported CMP is not integrated"));
        } else {
            d();
            loadCmp(activity, new a(onCompletedListener, activity));
        }
    }

    @NonNull
    public String toString() {
        return "[CmpService]";
    }

    private void a(AppLovinCmpError appLovinCmpError) {
        e eVar = this.f7297f;
        if (eVar == null) {
            return;
        }
        eVar.a(appLovinCmpError);
        this.f7297f = null;
        this.f7296e = null;
    }

    private void b(AppLovinCmpError appLovinCmpError) {
        f fVar = this.f7298g;
        if (fVar == null) {
            return;
        }
        fVar.a(appLovinCmpError);
        this.f7298g = null;
    }

    private void b() {
        com.applovin.impl.privacy.cmp.a aVar = this.f7293b;
        if (aVar == null) {
            return;
        }
        aVar.a();
    }

    private void a(Activity activity, e eVar) {
        boolean z10;
        if (!hasSupportedCmp()) {
            if (eVar != null) {
                eVar.a(new CmpErrorImpl(AppLovinCmpError.Code.INTEGRATION_ERROR, "A supported CMP is not integrated"));
                return;
            }
            return;
        }
        synchronized (this.f7294c) {
            if (eVar != null) {
                try {
                    this.f7297f = eVar;
                } catch (Throwable th) {
                    throw th;
                }
            }
            d dVar = this.f7295d;
            d dVar2 = d.NONE;
            if (dVar == dVar2) {
                this.f7295d = d.LOADING;
                z10 = false;
            } else {
                if (dVar == d.LOADING) {
                    return;
                }
                this.f7295d = dVar2;
                z10 = true;
            }
            if (z10) {
                a(this.f7296e);
                return;
            }
            c cVar = new c(activity);
            if (this.f7293b.d()) {
                AppLovinSdkUtils.runOnUiThread(cVar);
            } else {
                cVar.run();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public k0 a() {
        return new k0(this.f7292a.x().d());
    }
}

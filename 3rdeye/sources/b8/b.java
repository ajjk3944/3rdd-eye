package B8;

import A9.C0575f;
import C.S;
import F3.f;
import I.m;
import L0.InterfaceC0788t;
import L0.X;
import T1.B;
import android.content.Context;
import android.location.LocationManager;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.camera.core.impl.InterfaceC1700l0;
import androidx.preference.Preference;
import com.applovin.impl.g4;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.internal.c;
import com.yandex.mobile.ads.impl.A3;
import com.zipoapps.premiumhelper.e;
import com.zipoapps.premiumhelper.ui.splash.WarmSplashActivity;
import d0.s;
import g0.C4366m;
import g5.InterfaceC4391a;
import g5.InterfaceC4392b;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import io.appmetrica.analytics.location.impl.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.l;
import o0.b;
import v.C5664t;
import v.C5670z;
import v.i0;
import v.z0;
import v3.g;
import w5.w;
import w5.x;
import y7.c;
import y9.C5819a;
import z.C5841k;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Preference.c, b.c, InterfaceC0788t, InterfaceC4391a.InterfaceC0459a, FunctionWithThrowable, c.f, g4.b, OnSuccessListener, SuccessContinuation, I.a, InterfaceC1700l0.a, g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f585b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f586c;

    public /* synthetic */ b(Object obj, int i) {
        this.f585b = i;
        this.f586c = obj;
    }

    @Override // com.applovin.impl.g4.b
    public void a(boolean z10, Object obj, Object obj2) {
        g4.a((Runnable) this.f586c, z10, obj, obj2);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable, I.a
    public Object apply(Object obj) {
        switch (this.f585b) {
            case 4:
                return r.a((r) this.f586c, (LocationManager) obj);
            default:
                ((A3.c) this.f586c).getClass();
                x.f47477a.getClass();
                String strA = x.f47478b.a((w) obj);
                l.e(strA, "SessionEvents.SESSION_EVENT_ENCODER.encode(value)");
                Log.d("EventGDTLogger", "Session Event: ".concat(strA));
                byte[] bytes = strA.getBytes(C5819a.f48359b);
                l.e(bytes, "this as java.lang.String).getBytes(charset)");
                return bytes;
        }
    }

    @Override // androidx.camera.core.impl.InterfaceC1700l0.a
    public void c(InterfaceC1700l0 interfaceC1700l0) {
        z0 z0Var = (z0) this.f586c;
        z0Var.getClass();
        try {
            androidx.camera.core.c cVarB = interfaceC1700l0.b();
            if (cVarB != null) {
                z0Var.f47000b.b(cVarB);
            }
        } catch (IllegalStateException e4) {
            S.b("ZslControlImpl", "Failed to acquire latest image IllegalStateException = " + e4.getMessage());
        }
    }

    @Override // L0.InterfaceC0788t
    public X d(View view, X x10) {
        int i = WarmSplashActivity.f37181f;
        l.f(view, "view");
        C0.e eVarF = x10.f3850a.f(7);
        l.e(eVarF, "getInsets(...)");
        WarmSplashActivity warmSplashActivity = (WarmSplashActivity) this.f586c;
        TextView textView = warmSplashActivity.f37183d;
        if (textView != null) {
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.bottomMargin = warmSplashActivity.getResources().getDimensionPixelSize(R.dimen.ph_warm_splash_title_bottom_margin) + eVarF.f804d;
            textView.setLayoutParams(marginLayoutParams);
        }
        return X.f3849b;
    }

    @Override // androidx.preference.Preference.c
    public boolean e(Preference it) {
        switch (this.f585b) {
            case 0:
                l.f(it, "it");
                com.zipoapps.premiumhelper.ui.settings.a aVar = (com.zipoapps.premiumhelper.ui.settings.a) this.f586c;
                C0575f.e(A2.l.y(aVar), null, null, new d(aVar, null), 3);
                break;
            default:
                l.f(it, "it");
                com.zipoapps.premiumhelper.e.f37006D.getClass();
                e.a.a().f37011C.getClass();
                Context context = (Context) this.f586c;
                AppCompatActivity appCompatActivity = context instanceof AppCompatActivity ? (AppCompatActivity) context : null;
                if (appCompatActivity != null) {
                    androidx.fragment.app.x supportFragmentManager = appCompatActivity.getSupportFragmentManager();
                    l.e(supportFragmentManager, "getSupportFragmentManager(...)");
                    com.zipoapps.premiumhelper.e.m(e.a.a(), supportFragmentManager, 10);
                    break;
                }
                break;
        }
        return true;
    }

    @Override // g5.InterfaceC4391a.InterfaceC0459a
    public void h(InterfaceC4392b interfaceC4392b) {
        K4.a aVar = (K4.a) this.f586c;
        aVar.getClass();
        L4.e eVar = L4.e.f4061a;
        eVar.b("AnalyticsConnector now available.");
        F4.a aVar2 = (F4.a) interfaceC4392b.get();
        f fVar = new f(aVar2);
        K4.b bVar = new K4.b();
        B bE = aVar2.e("clx", bVar);
        if (bE == null) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not register AnalyticsConnectorListener with Crashlytics origin.", null);
            }
            B bE2 = aVar2.e(AppMeasurement.CRASH_ORIGIN, bVar);
            if (bE2 != null) {
                Log.w("FirebaseCrashlytics", "A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.", null);
            }
            bE = bE2;
        }
        if (bE == null) {
            eVar.d("Could not register Firebase Analytics listener; a listener is already registered.", null);
            return;
        }
        eVar.b("Registered Firebase Analytics listener.");
        M4.c cVar = new M4.c();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        A6.b bVar2 = new A6.b(fVar);
        synchronized (aVar) {
            try {
                Iterator it = aVar.f3141c.iterator();
                while (it.hasNext()) {
                    cVar.e((N4.a) it.next());
                }
                bVar.f3144d = cVar;
                bVar.f3143c = bVar2;
                aVar.f3140b = cVar;
                aVar.f3139a = bVar2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // o0.b.c
    public Object i(b.a aVar) {
        switch (this.f585b) {
            case 1:
                ((E.B) this.f586c).f1283f = aVar;
                return "RequestCompleteFuture";
            case 9:
                s.a aVar2 = (s.a) this.f586c;
                s.this.f37265h.execute(new A3(4, aVar2, aVar));
                return "acquireBuffer";
            case 11:
                ((C4366m) this.f586c).f37935k.set(aVar);
                return "textureViewImpl_waitForNextFrame";
            case 13:
                C5664t c5664t = (C5664t) this.f586c;
                c5664t.getClass();
                try {
                    c5664t.f46874d.execute(new A3(8, c5664t, aVar));
                    return "isMeteringRepeatingAttached";
                } catch (RejectedExecutionException unused) {
                    aVar.d(new RuntimeException("Unable to check if MeteringRepeating is attached. Camera executor shut down."));
                    return "isMeteringRepeatingAttached";
                }
            case 14:
                ((C5670z.c) this.f586c).f46968b.i.c();
                aVar.b(null);
                return "invokePostCaptureFuture";
            default:
                C5841k.a aVar3 = (C5841k.a) this.f586c;
                aVar3.f48398b = aVar;
                return "RequestCompleteListener[" + aVar3 + "]";
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        com.vungle.ads.internal.platform.a.m87updateAppSetID$lambda2((com.vungle.ads.internal.platform.a) this.f586c, (AppSetIdInfo) obj);
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        return Tasks.forResult((c.a) this.f586c);
    }

    @Override // y7.c.f
    public List a() {
        return (ArrayList) this.f586c;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable, I.a
    public A4.a apply(Object obj) {
        C5670z.h hVar = (C5670z.h) this.f586c;
        if (hVar.f46998f) {
            i0 i0Var = hVar.f46993a.f46758h;
            i0Var.getClass();
            return o0.b.a(new B.d(i0Var, 28));
        }
        return m.c.f2366c;
    }
}

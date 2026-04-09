package C;

import W.F;
import W.Z;
import android.app.Activity;
import android.os.Process;
import android.os.StrictMode;
import android.view.Surface;
import android.webkit.WebView;
import androidx.camera.core.impl.C1704n0;
import androidx.camera.core.impl.H0;
import androidx.camera.core.impl.InterfaceC1700l0;
import com.applovin.impl.g4;
import com.applovin.impl.h2;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinBidTokenCollectionListener;
import com.yandex.mobile.ads.impl.C4108f4;
import com.yandex.mobile.ads.impl.bs1;
import com.yandex.mobile.ads.impl.c40;
import com.yandex.mobile.ads.impl.c6;
import com.yandex.mobile.ads.impl.ev;
import com.yandex.mobile.ads.impl.fn;
import com.yandex.mobile.ads.impl.g01;
import com.yandex.mobile.ads.impl.h7;
import com.yandex.mobile.ads.impl.if2;
import com.yandex.mobile.ads.impl.ip1;
import com.yandex.mobile.ads.impl.jm1;
import com.yandex.mobile.ads.impl.km1;
import com.yandex.mobile.ads.impl.ky;
import com.yandex.mobile.ads.impl.lc;
import com.yandex.mobile.ads.impl.lm1;
import com.yandex.mobile.ads.impl.nc;
import com.yandex.mobile.ads.impl.np0;
import d0.k;
import d5.C4276a;
import g5.InterfaceC4391a;
import g5.InterfaceC4392b;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import o0.b;

/* compiled from: R8$$SyntheticClass */
/* renamed from: C.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0615b implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f682b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f683c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f684d;

    public /* synthetic */ RunnableC0615b(int i, Object obj, Object obj2) {
        this.f682b = i;
        this.f683c = obj;
        this.f684d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        InterfaceC4391a.InterfaceC0459a<T> interfaceC0459a;
        ScheduledFuture<?> scheduledFuture;
        d0.s sVar;
        switch (this.f682b) {
            case 0:
                C0616c c0616c = (C0616c) this.f683c;
                c0616c.getClass();
                ((InterfaceC1700l0.a) this.f684d).c(c0616c);
                return;
            case 1:
                E.B b10 = ((E.A) this.f683c).f1274f;
                G.n.a();
                if (b10.f1284g) {
                    return;
                }
                A2.l.q("onImageCaptured() must be called before onFinalResult()", b10.f1280c.f44804c.isDone());
                b10.a();
                K k10 = (K) this.f684d;
                G.n.a();
                E.E e4 = b10.f1278a;
                e4.a().execute(new g0(e4, k10));
                return;
            case 2:
                ((E.D) this.f683c).f1292e.remove((E.B) this.f684d);
                return;
            case 3:
                I0.k splashScreenViewProvider = (I0.k) this.f683c;
                kotlin.jvm.internal.l.f(splashScreenViewProvider, "$splashScreenViewProvider");
                B.d finalListener = (B.d) this.f684d;
                kotlin.jvm.internal.l.f(finalListener, "$finalListener");
                splashScreenViewProvider.f2403a.c().bringToFront();
                finalListener.d(splashScreenViewProvider);
                return;
            case 4:
                I4.r rVar = (I4.r) this.f683c;
                InterfaceC4392b<T> interfaceC4392b = (InterfaceC4392b) this.f684d;
                if (rVar.f2480b != I4.r.f2478d) {
                    throw new IllegalStateException("provide() can be called only once.");
                }
                synchronized (rVar) {
                    interfaceC0459a = rVar.f2479a;
                    rVar.f2479a = null;
                    rVar.f2480b = interfaceC4392b;
                }
                interfaceC0459a.h(interfaceC4392b);
                return;
            case 5:
                ((d5.b) ((Map.Entry) this.f683c).getKey()).a((C4276a) this.f684d);
                return;
            case 6:
                J4.a aVar = (J4.a) this.f683c;
                Process.setThreadPriority(aVar.f2755c);
                StrictMode.ThreadPolicy threadPolicy = aVar.f2756d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                ((Runnable) this.f684d).run();
                return;
            case 7:
                N.j jVar = (N.j) this.f683c;
                H.c cVar = jVar.f4399d;
                d0 d0Var = (d0) this.f684d;
                Surface surfaceN0 = d0Var.n0(cVar, new N.f(0, jVar, d0Var));
                jVar.f4397b.g(surfaceN0);
                jVar.i.put(d0Var, surfaceN0);
                return;
            case 8:
                W.F f10 = (W.F) this.f683c;
                Z.a aVar2 = f10.f13103W;
                Z.a aVar3 = (Z.a) this.f684d;
                f10.f13103W = aVar3;
                if (aVar2 == aVar3) {
                    S.a("Recorder", "Video source transitions to the same state: " + aVar3);
                    return;
                }
                S.a("Recorder", "Video source has transitioned to state: " + aVar3);
                if (aVar3 != Z.a.INACTIVE) {
                    if (aVar3 != Z.a.ACTIVE_NON_STREAMING || (scheduledFuture = f10.f13104X) == null || !scheduledFuture.cancel(false) || (sVar = f10.f13084D) == null) {
                        return;
                    }
                    W.F.q(sVar);
                    return;
                }
                if (f10.f13134z != null) {
                    f10.f13105Y = true;
                    F.h hVar = f10.f13123o;
                    if (hVar == null || hVar.B()) {
                        return;
                    }
                    f10.r(f10.f13123o, 4, null);
                    return;
                }
                F.i iVar = f10.f13112c0;
                if (iVar != null) {
                    if (!iVar.f13160d) {
                        iVar.f13160d = true;
                        ScheduledFuture<?> scheduledFuture2 = iVar.f13162f;
                        if (scheduledFuture2 != null) {
                            scheduledFuture2.cancel(false);
                            iVar.f13162f = null;
                        }
                    }
                    f10.f13112c0 = null;
                }
                f10.t(false);
                return;
            case 9:
                W.U u8 = (W.U) this.f683c;
                u8.getClass();
                H0.b bVar = (H0.b) this.f684d;
                bVar.f14887b.f14952e.remove(u8);
                bVar.f14890e.remove(u8);
                return;
            case 10:
                Z.h hVar2 = (Z.h) this.f683c;
                int iOrdinal = hVar2.f13916g.ordinal();
                if (iOrdinal != 0 && iOrdinal != 1) {
                    if (iOrdinal == 2) {
                        throw new AssertionError("AudioSource is released");
                    }
                    return;
                }
                k.a aVar4 = hVar2.f13920l;
                k.a aVar5 = (k.a) this.f684d;
                if (aVar4 != aVar5) {
                    hVar2.b(aVar5);
                    return;
                }
                return;
            case 11:
                W.F.this.f13110b0 = ((Z.h) this.f683c).f13928t;
                return;
            case 12:
                C1704n0.b bVar2 = (C1704n0.b) ((C1704n0) this.f683c).f15099a.d();
                b.a aVar6 = (b.a) this.f684d;
                if (bVar2 == null) {
                    aVar6.d(new IllegalStateException("Observable has not yet been initialized with a value."));
                    return;
                } else {
                    aVar6.b(bVar2.f15104a);
                    return;
                }
            case 13:
                ((g4) this.f683c).a((g4.b) this.f684d);
                return;
            case 14:
                ((h2) this.f683c).a((AppLovinAd) this.f684d);
                return;
            case 15:
                ((AppLovinAdLoadListener) this.f683c).adReceived((com.applovin.impl.sdk.ad.b) this.f684d);
                return;
            case 16:
                ((com.applovin.impl.sdk.k) this.f683c).b((String) this.f684d);
                return;
            case 17:
                ((com.applovin.impl.sdk.l) this.f683c).b((AppLovinBidTokenCollectionListener) this.f684d);
                return;
            case 18:
                com.vungle.ads.internal.network.e.m84sendWinNotification$lambda0((com.vungle.ads.internal.network.e) this.f683c, (String) this.f684d);
                return;
            case 19:
                com.vungle.ads.internal.ui.e.m109shouldOverrideUrlLoading$lambda4$lambda3$lambda2$lambda1((com.vungle.ads.internal.ui.e) this.f683c, (WebView) this.f684d);
                return;
            case 20:
                bs1.a((bs1) this.f683c, (Activity) this.f684d);
                return;
            case 21:
                ((c40.a) this.f683c).d((c40) this.f684d);
                return;
            case 22:
                ev.a((ev) this.f683c, (String) this.f684d);
                return;
            case 23:
                fn.c((fn) this.f683c, (h7) this.f684d);
                return;
            case 24:
                g01.a((g01) this.f683c, (ip1) this.f684d);
                return;
            case 25:
                ((if2.a) this.f683c).d((ky) this.f684d);
                return;
            case 26:
                jm1.a((c6) this.f683c, (jm1) this.f684d);
                return;
            case 27:
                km1.a((km1) this.f683c, (np0) this.f684d);
                return;
            case 28:
                lm1.a((lm1) this.f683c, (C4108f4) this.f684d);
                return;
            default:
                nc.a((nc) this.f683c, (lc) this.f684d);
                return;
        }
    }
}

package C;

import C.k0;
import E.z;
import W.F;
import android.adservices.topics.GetTopicsRequest;
import android.app.job.JobParameters;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.util.Size;
import android.view.Surface;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import androidx.camera.core.impl.InterfaceC1700l0;
import androidx.fragment.app.S;
import c.ActivityC2008f;
import c.C2023u;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.impl.a7;
import com.applovin.impl.h2;
import com.applovin.impl.l2;
import com.applovin.impl.mediation.ads.MaxAdViewImpl;
import com.applovin.impl.s2;
import com.applovin.impl.sdk.utils.ImageViewUtils;
import com.applovin.impl.v1;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdk;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.util.concurrent.Callable;
import o0.b;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class T implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f654b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f655c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f656d;

    public /* synthetic */ T(int i, Object obj, Object obj2) {
        this.f654b = i;
        this.f655c = obj;
        this.f656d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() throws Exception {
        int i = 1;
        Object obj = this.f656d;
        Object obj2 = this.f655c;
        switch (this.f654b) {
            case 0:
                androidx.camera.core.d dVar = (androidx.camera.core.d) obj2;
                dVar.getClass();
                ((InterfaceC1700l0.a) obj).c(dVar);
                return;
            case 1:
                ((k0.e) obj2).f((C0624k) obj);
                return;
            case 2:
                E.z zVar = (E.z) obj2;
                z.b bVar = (z.b) obj;
                E.A aB = bVar.b();
                try {
                    bVar.b().getClass();
                    E.u.H().execute(new B.c(2, aB, zVar.a(bVar)));
                    return;
                } catch (K e4) {
                    E.u.H().execute(new RunnableC0615b(i, aB, e4));
                    return;
                } catch (OutOfMemoryError e10) {
                    E.u.H().execute(new RunnableC0615b(i, aB, new K("Processing failed due to low memory.", e10)));
                    return;
                } catch (RuntimeException e11) {
                    E.u.H().execute(new RunnableC0615b(i, aB, new K("Processing failed.", e11)));
                    return;
                }
            case 3:
                int i10 = JobInfoSchedulerService.f22440b;
                ((JobInfoSchedulerService) obj2).jobFinished((JobParameters) obj, false);
                return;
            case 4:
                ((b.a) obj2).b(null);
                ((b.d) obj).cancel(true);
                return;
            case 5:
                try {
                    ((Runnable) obj2).run();
                    return;
                } catch (Exception e12) {
                    J4.j.this.j(e12);
                    throw e12;
                }
            case 6:
                Callable callable = (Callable) obj2;
                J4.j jVar = J4.j.this;
                try {
                    jVar.i(callable.call());
                    return;
                } catch (Exception e13) {
                    jVar.j(e13);
                    return;
                }
            case 7:
                final N.j jVar2 = (N.j) obj2;
                jVar2.f4404j++;
                N.l lVar = jVar2.f4397b;
                P.d.d(true, lVar.f4408a);
                P.d.c(lVar.f4410c);
                final SurfaceTexture surfaceTexture = new SurfaceTexture(lVar.f4419m);
                final k0 k0Var = (k0) obj;
                Size size = k0Var.f732b;
                surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
                final Surface surface = new Surface(surfaceTexture);
                N.g gVar = new N.g(jVar2, k0Var);
                H.c cVar = jVar2.f4399d;
                k0Var.c(cVar, gVar);
                k0Var.b(surface, cVar, new K0.b() { // from class: N.h
                    @Override // K0.b
                    public final void accept(Object obj3) {
                        j jVar3 = jVar2;
                        k0 k0Var2 = k0Var;
                        SurfaceTexture surfaceTexture2 = surfaceTexture;
                        Surface surface2 = surface;
                        jVar3.getClass();
                        synchronized (k0Var2.f731a) {
                            k0Var2.f743n = null;
                            k0Var2.f744o = null;
                        }
                        surfaceTexture2.setOnFrameAvailableListener(null);
                        surfaceTexture2.release();
                        surface2.release();
                        jVar3.f4404j--;
                        jVar3.d();
                    }
                });
                surfaceTexture.setOnFrameAvailableListener(jVar2, jVar2.f4400e);
                return;
            case 8:
                final O.h hVar = (O.h) obj2;
                hVar.f10154f++;
                k0 k0Var2 = (k0) obj;
                O.c cVar2 = hVar.f10150b;
                P.d.d(true, cVar2.f4408a);
                P.d.c(cVar2.f4410c);
                boolean z10 = k0Var2.f736f;
                final SurfaceTexture surfaceTexture2 = new SurfaceTexture(z10 ? cVar2.f10136n : cVar2.f10137o);
                Size size2 = k0Var2.f732b;
                surfaceTexture2.setDefaultBufferSize(size2.getWidth(), size2.getHeight());
                final Surface surface2 = new Surface(surfaceTexture2);
                k0Var2.b(surface2, hVar.f10152d, new K0.b() { // from class: O.g
                    @Override // K0.b
                    public final void accept(Object obj3) {
                        h hVar2 = hVar;
                        hVar2.getClass();
                        SurfaceTexture surfaceTexture3 = surfaceTexture2;
                        surfaceTexture3.setOnFrameAvailableListener(null);
                        surfaceTexture3.release();
                        surface2.release();
                        hVar2.f10154f--;
                        hVar2.d();
                    }
                });
                if (z10) {
                    hVar.f10157j = surfaceTexture2;
                    return;
                } else {
                    hVar.f10158k = surfaceTexture2;
                    surfaceTexture2.setOnFrameAvailableListener(hVar, hVar.f10153e);
                    return;
                }
            case 9:
                U1.d this$0 = (U1.d) obj2;
                kotlin.jvm.internal.l.f(this$0, "this$0");
                this$0.f12374b.c((T1.r) obj, 3);
                return;
            case 10:
                ((F.h) obj2).e().accept((W.a0) obj);
                return;
            case 11:
                F.c cVar3 = (F.c) obj2;
                cVar3.getClass();
                Throwable th = (Throwable) obj;
                S.c("Recorder", "Error occurred after audio source started.", th);
                if (th instanceof Z.i) {
                    cVar3.f13139a.accept(th);
                    return;
                }
                return;
            case 12:
                androidx.fragment.app.N.g((View) obj2, (Rect) obj);
                return;
            case 13:
                androidx.fragment.app.S this$02 = (androidx.fragment.app.S) obj2;
                kotlin.jvm.internal.l.f(this$02, "this$0");
                S.a aVar = (S.a) obj;
                this$02.f15834b.remove(aVar);
                this$02.f15835c.remove(aVar);
                return;
            case 14:
                ActivityC2008f this$03 = (ActivityC2008f) obj2;
                kotlin.jvm.internal.l.f(this$03, "this$0");
                C2023u dispatcher = (C2023u) obj;
                kotlin.jvm.internal.l.f(dispatcher, "$dispatcher");
                this$03.addObserverForBackInvoker(dispatcher);
                return;
            case 15:
                ((AppLovinFullscreenActivity) obj2).a((Long) obj);
                return;
            case 16:
                a7.a((Context) obj2, (String) obj);
                return;
            case 17:
                ((com.applovin.impl.adview.a) obj2).a((AppLovinAd) obj);
                return;
            case 18:
                ((WebView) obj2).loadUrl((String) obj);
                return;
            case 19:
                ((h2) obj2).a((com.applovin.impl.sdk.ad.b) obj);
                return;
            case 20:
                l2.c((AppLovinAdDisplayListener) obj2, (AppLovinAd) obj);
                return;
            case 21:
                l2.b((AppLovinAdVideoPlaybackListener) obj2, (AppLovinAd) obj);
                return;
            case 22:
                ((MaxAdViewImpl) obj2).b((s2) obj);
                return;
            case 23:
                ((com.applovin.impl.sdk.k) obj2).b((AppLovinSdk.SdkInitializationListener) obj);
                return;
            case 24:
                ((com.applovin.impl.sdk.r) obj2).a((GetTopicsRequest) obj);
                return;
            case 25:
                ImageViewUtils.b((ImageView) obj2, (Uri) obj);
                return;
            case 26:
                ((v1) obj2).h((String) obj);
                return;
            case 27:
                com.vungle.ads.internal.j.m64onInitError$lambda11((com.vungle.ads.internal.j) obj2, (com.vungle.ads.k0) obj);
                return;
            case 28:
                ((d0.s) obj2).f37268l.remove((b.a) obj);
                return;
            default:
                ((d0.s) obj2).f37269m.remove((d0.x) obj);
                return;
        }
    }

    public /* synthetic */ T(androidx.fragment.app.N n9, View view, Rect rect) {
        this.f654b = 12;
        this.f655c = view;
        this.f656d = rect;
    }
}

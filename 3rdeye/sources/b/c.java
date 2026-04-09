package B;

import A2.l;
import C.C0623j;
import C.C0626m;
import E.A;
import E.B;
import E.E;
import G.n;
import W.F;
import W.Y;
import Z.h;
import Z.p;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import androidx.camera.core.impl.InterfaceC1715t0;
import androidx.camera.core.impl.V;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.impl.C2114d0;
import com.applovin.impl.h2;
import com.applovin.impl.l2;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.ads.MaxFullscreenAdImpl;
import com.applovin.impl.r1;
import com.applovin.impl.s3;
import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdLoadListener;
import com.applovin.impl.sdk.r;
import com.applovin.impl.sdk.utils.ImageViewUtils;
import com.applovin.impl.t2;
import com.applovin.impl.t5;
import com.applovin.impl.y7;
import com.applovin.mediation.MaxAd;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinBidTokenCollectionListener;
import com.applovin.sdk.AppLovinSdk;
import com.vungle.ads.L;
import com.yandex.mobile.ads.impl.bk;
import com.yandex.mobile.ads.impl.h7;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import o0.b;
import v.C5658m;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f308b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f309c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f310d;

    public /* synthetic */ c(int i, Object obj, Object obj2) {
        this.f308b = i;
        this.f309c = obj;
        this.f310d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() throws Exception {
        switch (this.f308b) {
            case 0:
                b.a<Void> aVar = (b.a) this.f310d;
                g gVar = (g) this.f309c;
                gVar.f319b = true;
                C0626m c0626m = new C0626m("Camera2CameraControl was updated with new options.");
                b.a<Void> aVar2 = gVar.f324g;
                if (aVar2 != null) {
                    aVar2.d(c0626m);
                    gVar.f324g = null;
                }
                gVar.f324g = aVar;
                if (gVar.f318a) {
                    C5658m c5658m = gVar.f320c;
                    c5658m.getClass();
                    I.j.f(o0.b.a(new D7.c(c5658m, 20))).addListener(new b(gVar, 0), gVar.f321d);
                    gVar.f319b = false;
                    break;
                }
                break;
            case 1:
                ((K0.b) this.f309c).accept(new C0623j(3, (Surface) this.f310d));
                break;
            case 2:
                B b10 = ((A) this.f309c).f1274f;
                n.a();
                boolean z10 = b10.f1284g;
                androidx.camera.core.c cVar = (androidx.camera.core.c) this.f310d;
                if (!z10) {
                    l.q("onImageCaptured() must be called before onFinalResult()", b10.f1280c.f44804c.isDone());
                    b10.a();
                    E e4 = b10.f1278a;
                    e4.a().execute(new c(3, e4, cVar));
                    break;
                } else {
                    cVar.close();
                    break;
                }
            case 3:
                ((E) this.f309c).d();
                Objects.requireNonNull(null);
                Objects.requireNonNull((androidx.camera.core.c) this.f310d);
                break;
            case 4:
                try {
                    ((Runnable) this.f309c).run();
                    break;
                } catch (Exception e10) {
                    J4.j.this.j(e10);
                    return;
                }
            case 5:
                ((N.j) this.f309c).f4406l.add((N.a) this.f310d);
                break;
            case 6:
                d dVar = ((Y) this.f309c).f13225h;
                ((F) dVar.f312c).A((Surface) this.f310d);
                break;
            case 7:
                b.a aVar3 = (b.a) this.f310d;
                Z.h hVar = (Z.h) this.f309c;
                hVar.getClass();
                try {
                    int iOrdinal = hVar.f13916g.ordinal();
                    if (iOrdinal == 0 || iOrdinal == 1) {
                        hVar.b(null);
                        hVar.f13914e.f13976b.getAndSet(true);
                        p pVar = hVar.f13913d;
                        if (!pVar.f13961b.getAndSet(true)) {
                            pVar.f13963d.execute(new Z.n(pVar, 1));
                        }
                        hVar.d();
                        hVar.c(h.b.RELEASED);
                    }
                    aVar3.b(null);
                    break;
                } catch (Throwable th) {
                    aVar3.d(th);
                    return;
                }
            case 8:
                List listenersList = (List) this.f309c;
                kotlin.jvm.internal.l.f(listenersList, "$listenersList");
                Z1.h this$0 = (Z1.h) this.f310d;
                kotlin.jvm.internal.l.f(this$0, "this$0");
                Iterator it = listenersList.iterator();
                while (it.hasNext()) {
                    ((X1.a) it.next()).a(this$0.f13999e);
                }
                break;
            case 9:
                InterfaceC1715t0.a aVar4 = (InterfaceC1715t0.a) this.f310d;
                V v10 = (V) this.f309c;
                v10.getClass();
                try {
                    aVar4.a(v10.f14978a.f2367b);
                    break;
                } catch (InterruptedException | ExecutionException e11) {
                    aVar4.onError(e11);
                    return;
                }
            case 10:
                ((AppLovinFullscreenActivity) this.f309c).a((h2) this.f310d);
                break;
            case 11:
                ((com.applovin.impl.adview.a) this.f309c).b((MotionEvent) this.f310d);
                break;
            case 12:
                ((C2114d0) this.f309c).a((View) this.f310d);
                break;
            case 13:
                ((h2) this.f309c).a((Context) this.f310d);
                break;
            case 14:
                l2.d((AppLovinAdDisplayListener) this.f309c, (AppLovinAd) this.f310d);
                break;
            case 15:
                l2.a((AppLovinNativeAdLoadListener) this.f309c, (AppLovinError) this.f310d);
                break;
            case 16:
                l2.d((AppLovinBidTokenCollectionListener) this.f309c, (String) this.f310d);
                break;
            case 17:
                ((MaxFullscreenAdImpl.b) this.f309c).a((MaxAd) this.f310d);
                break;
            case 18:
                ((MaxFullscreenAdImpl.b) this.f309c).a((t2) this.f310d);
                break;
            case 19:
                r1.a((com.applovin.impl.adview.g) this.f309c, (Runnable) this.f310d);
                break;
            case 20:
                ((s3) this.f309c).a((String) this.f310d);
                break;
            case 21:
                ((k) this.f309c).a((AppLovinSdk.SdkInitializationListener) this.f310d);
                break;
            case 22:
                ((com.applovin.impl.sdk.nativeAd.b) this.f309c).b((AppLovinNativeAdImpl) this.f310d);
                break;
            case 23:
                ((r) this.f309c).a((List) this.f310d);
                break;
            case 24:
                ImageViewUtils.a((Uri) this.f309c, (ImageView) this.f310d);
                break;
            case 25:
                ((t5) this.f309c).b((MaxErrorImpl) this.f310d);
                break;
            case 26:
                ((y7) this.f309c).b((WebView) this.f310d);
                break;
            case 27:
                L.c.m24invoke$lambda0((ImageView) this.f309c, (Bitmap) this.f310d);
                break;
            case 28:
                com.vungle.ads.internal.util.b.m111init$lambda1((Context) this.f309c, (com.vungle.ads.internal.util.b) this.f310d);
                break;
            default:
                bk.a((bk) this.f309c, (h7) this.f310d);
                break;
        }
    }
}

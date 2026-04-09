package B;

import A2.l;
import B0.g;
import C.C0622i;
import C.C0624k;
import C.C0626m;
import C.E;
import C.S;
import C.k0;
import E.u;
import E.z;
import I4.o;
import N.m;
import N.s;
import N.t;
import Q4.f0;
import T1.K;
import W.T;
import Y.c;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.media.MediaCodec;
import android.net.Uri;
import android.util.Log;
import android.widget.ImageView;
import androidx.camera.core.impl.C1704n0;
import androidx.camera.core.impl.InterfaceC1715t0;
import androidx.camera.core.impl.X;
import androidx.camera.view.PreviewView;
import androidx.lifecycle.C1773f;
import com.applovin.impl.sdk.utils.ImageViewUtils;
import com.applovin.mediation.adapters.AppLovinAdapterAdViewListener;
import com.applovin.sdk.AppLovinAd;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.vungle.ads.AbstractC4059q;
import com.vungle.ads.AbstractC4062u;
import d2.AbstractC4266a;
import d2.C4268c;
import g0.C4366m;
import g5.InterfaceC4392b;
import io.appmetrica.analytics.impl.C4951sg;
import io.appmetrica.analytics.impl.C4977tg;
import io.appmetrica.analytics.impl.Dg;
import io.appmetrica.analytics.impl.G0;
import io.appmetrica.analytics.impl.U;
import io.appmetrica.analytics.impl.Wb;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import o0.b;
import v.C5652g;
import v.C5658m;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f303b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f304c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f305d;

    public /* synthetic */ a(int i, Object obj, Object obj2) {
        this.f303b = i;
        this.f304c = obj;
        this.f305d = obj2;
    }

    private final void a() {
        X x10 = (X) this.f304c;
        String str = (String) this.f305d;
        x10.getClass();
        try {
            x10.f14991e.get();
            x10.e(X.f14986n.decrementAndGet(), X.f14985m.get(), "Surface terminated");
        } catch (Exception e4) {
            S.b("DeferrableSurface", "Unexpected surface termination for " + x10 + "\nStack Trace:\n" + str);
            synchronized (x10.f14987a) {
                throw new IllegalArgumentException(String.format("DeferrableSurface %s [closed: %b, use_count: %s] terminated with unexpected exception.", x10, Boolean.valueOf(x10.f14989c), Integer.valueOf(x10.f14988b)), e4);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() throws Exception {
        byte b10 = 0;
        switch (this.f303b) {
            case 0:
                b.a<Void> aVar = (b.a) this.f305d;
                g gVar = (g) this.f304c;
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
                    I.j.f(o0.b.a(new D7.c(c5658m, 20))).addListener(new b(gVar, b10 == true ? 1 : 0), gVar.f321d);
                    gVar.f319b = false;
                    return;
                }
                return;
            case 1:
                ((g.e) this.f304c).lambda$callbackSuccessAsync$0((Typeface) this.f305d);
                return;
            case 2:
                ((k0.e) this.f304c).f((C0624k) this.f305d);
                return;
            case 3:
                z zVar = (z) this.f304c;
                int i = zVar.f1350b.f1311d;
                l.k("Postview only support YUV and JPEG output formats. Output format: " + i, i == 35 || i == 256);
                z.b bVar = (z.b) this.f305d;
                try {
                    u.H().execute(new E(3, bVar.b(), (Bitmap) zVar.f1357j.a((m) zVar.f1351c.a(bVar))));
                    return;
                } catch (Exception e4) {
                    bVar.a().close();
                    S.c("ProcessingNode", "process postview input packet failed.", e4);
                    return;
                }
            case 4:
                o oVar = (o) this.f304c;
                InterfaceC4392b interfaceC4392b = (InterfaceC4392b) this.f305d;
                synchronized (oVar) {
                    try {
                        if (oVar.f2475b == null) {
                            oVar.f2474a.add(interfaceC4392b);
                        } else {
                            oVar.f2475b.add(interfaceC4392b.get());
                        }
                    } finally {
                    }
                }
                return;
            case 5:
                Runnable runnable = (Runnable) this.f304c;
                J4.j jVar = J4.j.this;
                try {
                    runnable.run();
                    jVar.i(null);
                    return;
                } catch (Exception e10) {
                    jVar.j(e10);
                    return;
                }
            case 6:
                t tVar = (t) this.f304c;
                tVar.getClass();
                ((K0.b) ((AtomicReference) this.f305d).get()).accept(new C0622i(tVar));
                return;
            case 7:
                K k10 = (K) this.f304c;
                C4268c c4268c = (C4268c) this.f305d;
                if (k10.f12155r.f37349b instanceof AbstractC4266a.b) {
                    c4268c.cancel(true);
                    return;
                }
                return;
            case 8:
                U4.c cVar = (U4.c) this.f304c;
                cVar.getClass();
                try {
                    v3.h<f0> hVar = cVar.f12483h;
                    v3.e eVar = v3.e.HIGHEST;
                    if (hVar instanceof y3.t) {
                        y3.u.a().f48105d.a(((y3.t) hVar).f48096a.e(eVar), 1);
                    } else {
                        String strC = C3.a.c("ForcedSender");
                        if (Log.isLoggable(strC, 5)) {
                            Log.w(strC, String.format("Expected instance of `TransportImpl`, got `%s`.", hVar));
                        }
                    }
                } catch (Exception unused) {
                }
                ((CountDownLatch) this.f305d).countDown();
                return;
            case 9:
                ((H.g) this.f304c).execute((Runnable) this.f305d);
                return;
            case 10:
                T t10 = (T) this.f304c;
                if (((s.a) this.f305d) == t10.f13190p) {
                    t10.F();
                    return;
                }
                return;
            case 11:
                a();
                return;
            case 12:
                C1704n0.a aVar3 = (C1704n0.a) this.f304c;
                if (aVar3.f15101a.get()) {
                    C1704n0.b bVar2 = (C1704n0.b) this.f305d;
                    bVar2.getClass();
                    aVar3.f15102b.a(bVar2.f15104a);
                    return;
                }
                return;
            case 13:
                C1773f this$0 = (C1773f) this.f304c;
                kotlin.jvm.internal.l.f(this$0, "this$0");
                Runnable runnable2 = (Runnable) this.f305d;
                kotlin.jvm.internal.l.f(runnable2, "$runnable");
                if (!this$0.f16149d.offer(runnable2)) {
                    throw new IllegalStateException("cannot enqueue any more runnables");
                }
                this$0.a();
                return;
            case 14:
                ImageViewUtils.setAndDownscaleBitmap((ImageView) this.f304c, (Uri) this.f305d);
                return;
            case 15:
                ((AppLovinAdapterAdViewListener) this.f304c).lambda$adReceived$0((AppLovinAd) this.f305d);
                return;
            case 16:
                AbstractC4059q.m122onLoadFailure$lambda1((AbstractC4059q) this.f304c, (com.vungle.ads.k0) this.f305d);
                return;
            case 17:
                AbstractC4062u.a.m130onFailure$lambda6((AbstractC4062u) this.f304c, (com.vungle.ads.k0) this.f305d);
                return;
            case 18:
                com.vungle.ads.internal.platform.a.m86getUserAgentLazy$lambda0((com.vungle.ads.internal.platform.a) this.f304c, (K0.b) this.f305d);
                return;
            case 19:
                ((InterfaceC1715t0.a) this.f304c).a((c.a) this.f305d);
                return;
            case 20:
                d0.s sVar = d0.s.this;
                switch (sVar.f37276t.ordinal()) {
                    case 0:
                    case 7:
                    case 8:
                        return;
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        MediaCodec.CodecException codecException = (MediaCodec.CodecException) this.f305d;
                        sVar.b(1, codecException.getMessage(), codecException);
                        return;
                    default:
                        throw new IllegalStateException("Unknown state: " + sVar.f37276t);
                }
            case 21:
                ((d0.l) this.f304c).d((d0.j) this.f305d);
                return;
            case 22:
                PreviewView.this.f15168m.c((k0) this.f305d);
                return;
            case 23:
                C4366m c4366m = (C4366m) this.f304c;
                k0 k0Var = c4366m.f37933h;
                if (k0Var != null && k0Var == ((k0) this.f305d)) {
                    c4366m.f37933h = null;
                    c4366m.f37932g = null;
                }
                D3.b bVar3 = c4366m.f37936l;
                if (bVar3 != null) {
                    bVar3.b();
                    c4366m.f37936l = null;
                    return;
                }
                return;
            case 24:
                G0.a((G0) this.f304c, (PluginErrorDetails) this.f305d);
                return;
            case 25:
                Wb.a((Wb) this.f304c, (U) this.f305d);
                return;
            case 26:
                C4951sg.a((C4977tg) this.f304c, (Dg) this.f305d);
                return;
            case 27:
                C4977tg.b((Dg) this.f304c, (Throwable) this.f305d);
                return;
            case 28:
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f305d;
                try {
                    taskCompletionSource.setResult(((n5.m) this.f304c).a());
                    return;
                } catch (Exception e11) {
                    taskCompletionSource.setException(e11);
                    return;
                }
            default:
                C5658m c5658m2 = (C5658m) this.f304c;
                I.j.g(o0.b.a(new C5652g(c5658m2, c5658m2.v())), (b.a) this.f305d);
                return;
        }
    }
}

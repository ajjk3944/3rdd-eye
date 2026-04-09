package J4;

import J4.j;
import T1.InterfaceC1591c;
import T1.K;
import W.U;
import android.content.Context;
import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;
import androidx.camera.core.impl.H0;
import b2.C1834o;
import com.applovin.impl.AbstractC2108b;
import com.applovin.impl.g4;
import com.applovin.impl.l2;
import com.applovin.impl.r1;
import com.applovin.impl.sdk.AppLovinAdServiceImpl;
import com.applovin.impl.sdk.AppLovinError;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdRewardListener;
import com.google.android.gms.common.util.BiConsumer;
import com.vungle.ads.internal.load.e;
import com.yandex.mobile.ads.impl.ah2;
import com.yandex.mobile.ads.impl.dx0;
import com.yandex.mobile.ads.impl.fh2;
import com.yandex.mobile.ads.impl.u01;
import com.yandex.mobile.ads.impl.ws;
import d2.C4268c;
import java.io.File;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import w.C5688b;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2776b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2777c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2778d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2779e;

    public /* synthetic */ f(d0.l lVar, int i, String str, Throwable th) {
        this.f2776b = 10;
        this.f2777c = lVar;
        this.f2778d = str;
        this.f2779e = th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        boolean zBooleanValue;
        switch (this.f2776b) {
            case 0:
                ((i) this.f2777c).f2787b.execute(new B.a(5, (Runnable) this.f2778d, (j.a) this.f2779e));
                return;
            case 1:
                T1.l lVar = (T1.l) this.f2777c;
                C4268c c4268c = (C4268c) this.f2778d;
                K k10 = (K) this.f2779e;
                lVar.getClass();
                try {
                    zBooleanValue = ((Boolean) c4268c.get()).booleanValue();
                } catch (InterruptedException | ExecutionException unused) {
                    zBooleanValue = true;
                }
                synchronized (lVar.f12198k) {
                    try {
                        C1834o c1834oL = B7.d.l(k10.f12143e);
                        String str = c1834oL.f17128a;
                        if (lVar.d(str) == k10) {
                            lVar.b(str);
                        }
                        androidx.work.m.e().a(T1.l.f12188l, T1.l.class.getSimpleName() + " " + str + " executed; reschedule = " + zBooleanValue);
                        Iterator it = lVar.f12197j.iterator();
                        while (it.hasNext()) {
                            ((InterfaceC1591c) it.next()).c(c1834oL, zBooleanValue);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 2:
                A2.l.q("Surface update cancellation should only occur on main thread.", G.n.b());
                ((AtomicBoolean) this.f2777c).set(true);
                U u8 = (U) this.f2779e;
                H0.b bVar = (H0.b) this.f2778d;
                bVar.f14887b.f14952e.remove(u8);
                bVar.f14890e.remove(u8);
                return;
            case 3:
                l2.e((AppLovinAdRewardListener) this.f2777c, (AppLovinAd) this.f2778d, (Map) this.f2779e);
                return;
            case 4:
                ((r1) this.f2777c).a((AbstractC2108b) this.f2778d, (g4) this.f2779e);
                return;
            case 5:
                ((AppLovinAdServiceImpl) this.f2777c).a((AppLovinError) this.f2778d, (AppLovinAdLoadListener) this.f2779e);
                return;
            case 6:
                ((com.applovin.impl.sdk.m) this.f2777c).b((com.applovin.impl.sdk.ad.b) this.f2778d, (Context) this.f2779e);
                return;
            case 7:
                e.b.m80onSuccess$lambda1((File) this.f2777c, (File) this.f2778d, (File) this.f2779e);
                return;
            case 8:
                dx0.a((dx0) this.f2777c, (fh2) this.f2778d, (ah2) this.f2779e);
                return;
            case 9:
                u01.a((u01) this.f2777c, (Context) this.f2778d, (ws) this.f2779e);
                return;
            case 10:
                ((d0.l) this.f2777c).c(new d0.h((String) this.f2778d, (Throwable) this.f2779e));
                return;
            case 11:
                ((BiConsumer) this.f2777c).accept((String) this.f2778d, (com.google.firebase.remoteconfig.internal.b) this.f2779e);
                return;
            default:
                ((C5688b.c) this.f2777c).f47115a.onSurfacePrepared((CameraCaptureSession) this.f2778d, (Surface) this.f2779e);
                return;
        }
    }

    public /* synthetic */ f(Object obj, Object obj2, Object obj3, int i) {
        this.f2776b = i;
        this.f2777c = obj;
        this.f2778d = obj2;
        this.f2779e = obj3;
    }
}

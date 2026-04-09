package C;

import C.W;
import C.d0;
import T1.InterfaceC1591c;
import W.Y;
import android.graphics.Bitmap;
import android.hardware.camera2.CameraCaptureSession;
import android.media.MediaFormat;
import android.util.Log;
import android.view.Surface;
import android.webkit.WebView;
import android.widget.ImageView;
import androidx.camera.core.impl.AbstractC1707p;
import androidx.camera.core.impl.C1704n0;
import androidx.camera.core.impl.InterfaceC1715t0;
import androidx.camera.core.impl.S0;
import androidx.fragment.app.C1754g;
import androidx.fragment.app.S;
import b2.C1834o;
import c2.RunnableC2045A;
import com.applovin.sdk.AppLovinSdkInitializationConfiguration;
import com.vungle.ads.L;
import com.vungle.ads.internal.c;
import com.vungle.ads.internal.load.c;
import d0.s;
import d2.AbstractC4266a;
import d2.C4268c;
import d6.C4277a;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Objects;
import o0.b;
import v.C5658m;
import v.C5664t;
import w.C5688b;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class E implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f623b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f624c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f625d;

    public /* synthetic */ E(int i, Object obj, Object obj2) {
        this.f623b = i;
        this.f624c = obj;
        this.f625d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        H.g gVar;
        switch (this.f623b) {
            case 0:
                ((androidx.camera.core.e) this.f624c).c();
                androidx.camera.core.e eVar = (androidx.camera.core.e) this.f625d;
                if (eVar != null) {
                    eVar.c();
                    return;
                }
                return;
            case 1:
                ((W.c) this.f624c).c((k0) this.f625d);
                return;
            case 2:
                ((K0.b) this.f624c).accept(new C0623j(4, (Surface) this.f625d));
                return;
            case 3:
                E.B b10 = ((E.A) this.f624c).f1274f;
                G.n.a();
                if (b10.f1284g) {
                    return;
                }
                E.E e4 = b10.f1278a;
                e4.a().execute(new C2.h(e4, (Bitmap) this.f625d));
                return;
            case 4:
                final O.h hVar = (O.h) this.f624c;
                H.c cVar = hVar.f10152d;
                final d0 d0Var = (d0) this.f625d;
                Surface surfaceN0 = d0Var.n0(cVar, new K0.b() { // from class: O.f
                    @Override // K0.b
                    public final void accept(Object obj) throws IOException {
                        h hVar2 = hVar;
                        hVar2.getClass();
                        d0 d0Var2 = d0Var;
                        d0Var2.close();
                        Surface surface = (Surface) hVar2.i.remove(d0Var2);
                        if (surface != null) {
                            c cVar2 = hVar2.f10150b;
                            P.d.d(true, cVar2.f4408a);
                            P.d.c(cVar2.f4410c);
                            cVar2.i(surface, true);
                        }
                    }
                });
                hVar.f10150b.g(surfaceN0);
                hVar.i.put(d0Var, surfaceN0);
                return;
            case 5:
                T1.l lVar = (T1.l) this.f624c;
                C1834o c1834o = (C1834o) this.f625d;
                synchronized (lVar.f12198k) {
                    try {
                        Iterator it = lVar.f12197j.iterator();
                        while (it.hasNext()) {
                            ((InterfaceC1591c) it.next()).c(c1834o, false);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 6:
                ((C1704n0) this.f624c).f15099a.i((C1704n0.a) this.f625d);
                return;
            case 7:
                C1754g.c transitionInfo = (C1754g.c) this.f624c;
                kotlin.jvm.internal.l.f(transitionInfo, "$transitionInfo");
                S.b operation = (S.b) this.f625d;
                kotlin.jvm.internal.l.f(operation, "$operation");
                transitionInfo.a();
                if (androidx.fragment.app.x.G(2)) {
                    Log.v("FragmentManager", "Transition for operation " + operation + " has completed");
                    return;
                }
                return;
            case 8:
                RunnableC2045A runnableC2045A = (RunnableC2045A) this.f624c;
                C4268c c4268c = (C4268c) this.f625d;
                if (runnableC2045A.f18377b.f37349b instanceof AbstractC4266a.b) {
                    c4268c.cancel(true);
                    return;
                } else {
                    c4268c.k(runnableC2045A.f18380e.getForegroundInfoAsync());
                    return;
                }
            case 9:
                ((com.applovin.impl.adview.a) this.f624c).b((WebView) this.f625d);
                return;
            case 10:
                ((com.applovin.impl.sdk.k) this.f624c).a((AppLovinSdkInitializationConfiguration) this.f625d);
                return;
            case 11:
                ((com.applovin.impl.sdk.n) this.f624c).a((Long) this.f625d);
                return;
            case 12:
                ((com.applovin.impl.sdk.r) this.f624c).a((String) this.f625d);
                return;
            case 13:
                ((ImageView) this.f624c).setImageBitmap((Bitmap) this.f625d);
                return;
            case 14:
                L.b.m23onFailure$lambda5((com.vungle.ads.L) this.f624c, (com.vungle.ads.k0) this.f625d);
                return;
            case 15:
                c.a.m39onFailure$lambda5((com.vungle.ads.internal.c) this.f624c, (com.vungle.ads.k0) this.f625d);
                return;
            case 16:
                c.C0383c.m74onError$lambda0((com.vungle.ads.internal.load.c) this.f624c, (com.vungle.ads.internal.downloader.c) this.f625d);
                return;
            case 17:
                LinkedHashMap linkedHashMap = ((s.a) this.f624c).f37283a;
                InterfaceC1715t0.a aVar = (InterfaceC1715t0.a) this.f625d;
                aVar.getClass();
                linkedHashMap.remove(aVar);
                return;
            case 18:
                ((d0.l) this.f624c).b(new B8.b((MediaFormat) this.f625d, 10));
                return;
            case 19:
                W.X x10 = (W.X) this.f624c;
                Surface surface = (Surface) this.f625d;
                W.Y y10 = (W.Y) x10.f13215b;
                int iOrdinal = y10.i.ordinal();
                b.a aVar2 = (b.a) x10.f13216c;
                if (iOrdinal != 0) {
                    if (iOrdinal == 1) {
                        k0 k0Var = (k0) x10.f13217d;
                        if (k0Var.a()) {
                            S.a("VideoEncoderSession", "Not provide surface, " + Objects.toString(k0Var, "EMPTY") + " is already serviced.");
                            aVar2.b(null);
                            y10.a();
                            return;
                        }
                        y10.f13222e = surface;
                        S.a("VideoEncoderSession", "provide surface: " + surface);
                        k0Var.b(surface, y10.f13219b, new E.j(y10, 3));
                        y10.i = Y.a.READY;
                        aVar2.b(y10.f13221d);
                        return;
                    }
                    if (iOrdinal != 2) {
                        if (iOrdinal == 3) {
                            if (y10.f13225h != null && (gVar = y10.f13224g) != null) {
                                gVar.execute(new B.c(6, y10, surface));
                            }
                            S.g("VideoEncoderSession", "Surface is updated in READY state: " + surface);
                            return;
                        }
                        if (iOrdinal != 4) {
                            throw new IllegalStateException("State " + y10.i + " is not handled");
                        }
                    }
                }
                S.a("VideoEncoderSession", "Not provide surface in " + y10.i);
                aVar2.b(null);
                return;
            case 20:
                C4277a.m135apply$lambda0((C4277a) this.f624c, (HashMap) this.f625d);
                return;
            case 21:
                C5658m.a aVar3 = ((C5658m) this.f624c).f46775z;
                HashSet hashSet = aVar3.f46776a;
                AbstractC1707p abstractC1707p = (AbstractC1707p) this.f625d;
                hashSet.remove(abstractC1707p);
                aVar3.f46777b.remove(abstractC1707p);
                return;
            case 22:
                C5664t c5664t = (C5664t) this.f624c;
                c5664t.getClass();
                StringBuilder sb = new StringBuilder("Use case ");
                String str = (String) this.f625d;
                sb.append(str);
                sb.append(" INACTIVE");
                c5664t.u(sb.toString(), null);
                LinkedHashMap linkedHashMap2 = c5664t.f46872b.f14957b;
                if (linkedHashMap2.containsKey(str)) {
                    S0.a aVar4 = (S0.a) linkedHashMap2.get(str);
                    aVar4.f14963f = false;
                    if (!aVar4.f14962e) {
                        linkedHashMap2.remove(str);
                    }
                }
                c5664t.L();
                return;
            default:
                ((C5688b.c) this.f624c).f47115a.onCaptureQueueEmpty((CameraCaptureSession) this.f625d);
                return;
        }
    }
}

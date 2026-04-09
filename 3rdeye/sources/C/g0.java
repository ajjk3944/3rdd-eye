package C;

import W.F;
import Z.h;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import androidx.fragment.app.ComponentCallbacksC1759l;
import c.ActivityC2008f;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.vungle.ads.L;
import com.vungle.ads.internal.c;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import o0.b;
import p4.C5457g;
import v.C5664t;
import v.o0;
import w.C5704r;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class g0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f707b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f708c;

    public /* synthetic */ g0(E.E e4, K k10) {
        this.f707b = 1;
        this.f708c = e4;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalAccessException, IOException, SecurityException, IllegalArgumentException, InvocationTargetException {
        switch (this.f707b) {
            case 0:
                ((k0) this.f708c).f737g.cancel(true);
                return;
            case 1:
                E.E e4 = (E.E) this.f708c;
                e4.d();
                e4.f();
                throw new IllegalStateException("One and only one callback is allowed.");
            case 2:
                Process.setThreadPriority(-16);
                ((Runnable) this.f708c).run();
                return;
            case 3:
                ((b.a) this.f708c).b(null);
                return;
            case 4:
                I6.f fVar = (I6.f) this.f708c;
                if (fVar.f2528d) {
                    fVar.a(fVar.f2525a, true);
                }
                fVar.f2528d = false;
                return;
            case 5:
                ((d0) this.f708c).close();
                return;
            case 6:
                O.h hVar = (O.h) this.f708c;
                hVar.f10155g = true;
                hVar.d();
                return;
            case 7:
                S5.f this$0 = (S5.f) this.f708c;
                kotlin.jvm.internal.l.f(this$0, "this$0");
                new Handler(Looper.getMainLooper()).postDelayed(new V(this$0, 4), 0L);
                return;
            case 8:
                F.i iVar = ((W.L) this.f708c).f13168c;
                if (iVar.f13160d) {
                    return;
                }
                S.a("Recorder", "Retry setupVideo #" + iVar.f13161e);
                W.F f10 = W.F.this;
                f10.x().addListener(new J4.h(iVar, iVar.f13157a, iVar.f13158b, 2), f10.f13113d);
                return;
            case 9:
                Z.h hVar2 = (Z.h) this.f708c;
                int iOrdinal = hVar2.f13916g.ordinal();
                if (iOrdinal == 1) {
                    hVar2.c(h.b.CONFIGURED);
                    hVar2.e();
                    return;
                } else {
                    if (iOrdinal != 2) {
                        return;
                    }
                    S.g("AudioSource", "AudioSource is released. Calling stop() is a no-op.");
                    return;
                }
            case 10:
                ((F.c) this.f708c).getClass();
                return;
            case 11:
                Z.h hVar3 = Z.h.this;
                hVar3.f13925q = true;
                if (hVar3.f13916g == h.b.STARTED) {
                    hVar3.a();
                    return;
                }
                return;
            case 12:
                C5664t.c cVar = (C5664t.c) this.f708c;
                if (C5664t.this.f46876f == C5664t.f.OPENED) {
                    C5664t.this.C();
                    return;
                }
                return;
            case 13:
                ((ComponentCallbacksC1759l) this.f708c).lambda$performCreateView$0();
                return;
            case 14:
                ActivityC2008f this$02 = (ActivityC2008f) this.f708c;
                kotlin.jvm.internal.l.f(this$02, "this$0");
                try {
                    super/*android.app.Activity*/.onBackPressed();
                    return;
                } catch (IllegalStateException e10) {
                    if (!kotlin.jvm.internal.l.b(e10.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        throw e10;
                    }
                    return;
                } catch (NullPointerException e11) {
                    if (!kotlin.jvm.internal.l.b(e11.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                        throw e11;
                    }
                    return;
                }
            case 15:
                ((AppLovinFullscreenActivity) this.f708c).c();
                return;
            case 16:
                ((com.applovin.impl.sdk.f) this.f708c).i();
                return;
            case 17:
                ((com.applovin.impl.sdk.k) this.f708c).L0();
                return;
            case 18:
                ((com.applovin.impl.sdk.l) this.f708c).S();
                return;
            case 19:
                L.b.m21onAdLeftApplication$lambda4((com.vungle.ads.L) this.f708c);
                return;
            case 20:
                c.a.m37onAdLeftApplication$lambda4((com.vungle.ads.internal.c) this.f708c);
                return;
            case 21:
                com.vungle.ads.internal.presenter.g.m95processCommand$lambda9((com.vungle.ads.internal.presenter.g) this.f708c);
                return;
            case 22:
                ((D3.b) this.f708c).b();
                return;
            case 23:
                n5.w wVar = (n5.w) this.f708c;
                synchronized (wVar.f44383d) {
                    SharedPreferences.Editor editorEdit = wVar.f44380a.edit();
                    String str = wVar.f44381b;
                    StringBuilder sb = new StringBuilder();
                    Iterator<String> it = wVar.f44383d.iterator();
                    while (it.hasNext()) {
                        sb.append(it.next());
                        sb.append(wVar.f44382c);
                    }
                    editorEdit.putString(str, sb.toString()).commit();
                }
                return;
            case 24:
                C5457g c5457g = (C5457g) this.f708c;
                boolean zIsPopupShowing = c5457g.f45138h.isPopupShowing();
                c5457g.t(zIsPopupShowing);
                c5457g.f45142m = zIsPopupShowing;
                return;
            case 25:
                C5664t c5664t = (C5664t) this.f708c;
                c5664t.f46892w = false;
                c5664t.f46891v = false;
                c5664t.u("OpenCameraConfigAndClose is done, state: " + c5664t.f46876f, null);
                int iOrdinal2 = c5664t.f46876f.ordinal();
                if (iOrdinal2 == 1 || iOrdinal2 == 4) {
                    A2.l.q(null, c5664t.f46884o.isEmpty());
                    c5664t.v();
                    return;
                }
                if (iOrdinal2 != 6) {
                    c5664t.u("OpenCameraConfigAndClose finished while in state: " + c5664t.f46876f, null);
                    return;
                }
                int i = c5664t.f46882m;
                if (i == 0) {
                    c5664t.K(false);
                    return;
                } else {
                    c5664t.u("OpenCameraConfigAndClose in error: ".concat(C5664t.w(i)), null);
                    c5664t.f46879j.b();
                    return;
                }
            case 26:
                for (o0 o0Var : (LinkedHashSet) this.f708c) {
                    o0Var.b().h(o0Var);
                }
                return;
            case 27:
                v.l0.f46738n.remove((androidx.camera.core.impl.X) this.f708c);
                return;
            default:
                ((C5704r.a) this.f708c).f47154b.onCameraAccessPrioritiesChanged();
                return;
        }
    }

    public /* synthetic */ g0(F.c cVar, boolean z10) {
        this.f707b = 10;
        this.f708c = cVar;
    }

    public /* synthetic */ g0(Object obj, int i) {
        this.f707b = i;
        this.f708c = obj;
    }
}

package d4;

import A1.n;
import A2.RunnableC0114b;
import B4.E;
import B4.InterfaceC0140b;
import U0.j;
import android.app.Dialog;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Handler;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import com.apm.insight.R;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdInteractionListener;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardItem;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionListener;
import com.google.ads.mediation.pangle.PangleMediationAdapter;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.android.gms.internal.ads.InterfaceC0703Ra;
import com.google.android.gms.internal.ads.InterfaceC0828Yg;
import com.google.android.gms.internal.ads.InterfaceC1864sh;
import com.lefan.base.activity.SuggestActivity;
import e.C2284a;
import e.InterfaceC2285b;
import h.C;
import h.k;
import h0.C2352b;
import h0.C2359i;
import i2.m;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import k0.AbstractComponentCallbacksC2617v;
import k0.D;
import k0.G;
import k0.K;
import n.C2670d;
import n.InterfaceC2675i;
import n.MenuC2677k;
import n.ViewOnKeyListenerC2671e;
import n1.l;
import n1.p;
import o.B0;
import o.C2723l;
import o.InterfaceC2729o;
import o.f1;
import o.m1;
import r1.C2872b;
import r1.InterfaceC2871a;
import r1.r;
import r1.s;
import r1.x;
import s1.C2890a;
import s2.BinderC2894d;
import w2.t;
import w4.C2976b;
import x3.C2997b;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements i, PAGAppOpenAdInteractionListener, PAGRewardedAdInteractionListener, InterfaceC2285b, B0, I1.a, InterfaceC2675i, s, InterfaceC2871a, InterfaceC1864sh, InterfaceC0140b, E, D3.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19806a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f19807b;

    public /* synthetic */ h(int i, Object obj) {
        this.f19806a = i;
        this.f19807b = obj;
    }

    @Override // d4.i
    /* renamed from: a */
    public void mo0a() {
        C2268b c2268b = (C2268b) this.f19807b;
        c2268b.a("split-install-errors", new j(26, c2268b));
    }

    @Override // e.InterfaceC2285b
    public void b(Object obj) {
        C2284a c2284a = (C2284a) obj;
        K k6 = (K) this.f19807b;
        G g2 = (G) k6.f21493D.pollFirst();
        if (g2 == null) {
            Log.w("FragmentManager", "No IntentSenders were started for " + this);
            return;
        }
        String str = g2.f21482a;
        int i = g2.f21483b;
        AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617vO = k6.f21505c.o(str);
        if (abstractComponentCallbacksC2617vO != null) {
            abstractComponentCallbacksC2617vO.z(i, c2284a.f19838a, c2284a.f19839b);
            return;
        }
        Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
    }

    @Override // o.B0
    public void c(MenuC2677k menuC2677k, MenuItem menuItem) {
        ((ViewOnKeyListenerC2671e) this.f19807b).f22044f.removeCallbacksAndMessages(menuC2677k);
    }

    @Override // r1.s
    public r d(x xVar) {
        switch (this.f19806a) {
            case 14:
                return new C2872b((AssetManager) this.f19807b, 0, this);
            case 15:
                return new C2872b((Resources) this.f19807b, xVar.c(Uri.class, AssetFileDescriptor.class));
            default:
                return new C2890a((h2.d) this.f19807b);
        }
    }

    public void e() {
        ((k0.x) this.f19807b).f21728l.O();
    }

    @Override // n.InterfaceC2675i
    public boolean f(MenuC2677k menuC2677k, MenuItem menuItem) {
        boolean zOnMenuItemSelected;
        switch (this.f19806a) {
            case 10:
                InterfaceC2729o interfaceC2729o = ((ActionMenuView) this.f19807b).f4854O;
                if (interfaceC2729o == null) {
                    return false;
                }
                Toolbar toolbar = (Toolbar) ((C2352b) interfaceC2729o).f20444b;
                Iterator it = ((CopyOnWriteArrayList) toolbar.f5002U.f3869c).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        f1 f1Var = toolbar.f5004W;
                        zOnMenuItemSelected = f1Var != null ? ((C) ((A0.e) f1Var).f73b).f20260b.onMenuItemSelected(0, menuItem) : false;
                    } else if (((D) it.next()).f21478a.o()) {
                        zOnMenuItemSelected = true;
                    }
                }
                return zOnMenuItemSelected;
            default:
                return false;
        }
    }

    @Override // r1.InterfaceC2871a
    public com.bumptech.glide.load.data.d g(AssetManager assetManager, String str) {
        return new com.bumptech.glide.load.data.j(assetManager, str, 0);
    }

    @Override // I1.a
    public Object h() {
        m1 m1Var = (m1) this.f19807b;
        return new p((q1.d) m1Var.f22583c, (q1.d) m1Var.f22584d, (q1.d) m1Var.f22582b, (q1.d) m1Var.f22585e, (l) m1Var.f22586f, (l) m1Var.f22587g, (V2.e) m1Var.f22588h);
    }

    @Override // B4.InterfaceC0140b
    public void i(Dialog dialog) {
        if (dialog != null) {
            dialog.dismiss();
        }
        N.h hVarB = N.h.b(((C2976b) this.f19807b).f23971a.toLanguageTag());
        q5.i.b(hVarB);
        k.k(hVarB);
    }

    @Override // D3.a
    public void j(Typeface typeface) {
        C2997b c2997b = (C2997b) this.f19807b;
        if (c2997b.z(typeface)) {
            c2997b.l(false);
        }
    }

    public void k(ImageView.ScaleType scaleType) {
        InterfaceC0703Ra interfaceC0703Ra = ((NativeAdView) this.f19807b).f6887b;
        if (interfaceC0703Ra == null || scaleType == null) {
            return;
        }
        try {
            interfaceC0703Ra.I3(new S2.b(scaleType));
        } catch (RemoteException e6) {
            u2.k.f("Unable to call setMediaViewImageScaleType on delegate", e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1864sh
    public /* synthetic */ void l(String str, int i, String str2, boolean z6) {
        InterfaceC0828Yg interfaceC0828Yg = ((BinderC2894d) this.f19807b).f23462d;
        if (interfaceC0828Yg != null) {
            interfaceC0828Yg.j0();
        }
    }

    @Override // B4.InterfaceC0140b
    public void m(Dialog dialog) {
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    @Override // B4.E
    public void n(int i) {
        SuggestActivity suggestActivity = (SuggestActivity) this.f19807b;
        HashMap map = suggestActivity.f18768P;
        if (i != 0) {
            if (i != 1) {
                return;
            }
            suggestActivity.f18772T = 1;
            suggestActivity.f18774V.a("image/*");
            return;
        }
        map.remove(1);
        ImageView imageView = suggestActivity.f18770R;
        if (imageView != null) {
            imageView.setImageResource(R.drawable.base_add_img);
        }
        Button button = suggestActivity.f18773U;
        if (button != null) {
            button.setEnabled(map.isEmpty());
        }
    }

    @Override // n.InterfaceC2675i
    public void o(MenuC2677k menuC2677k) {
        switch (this.f19806a) {
            case 10:
                InterfaceC2675i interfaceC2675i = ((ActionMenuView) this.f19807b).f4850J;
                if (interfaceC2675i != null) {
                    interfaceC2675i.o(menuC2677k);
                    break;
                }
                break;
            default:
                Toolbar toolbar = (Toolbar) this.f19807b;
                C2723l c2723l = toolbar.f5005a.f4848H;
                if (c2723l == null || !c2723l.i()) {
                    Iterator it = ((CopyOnWriteArrayList) toolbar.f5002U.f3869c).iterator();
                    while (it.hasNext()) {
                        ((D) it.next()).f21478a.s();
                    }
                }
                j jVar = toolbar.f5015f0;
                if (jVar != null) {
                    jVar.o(menuC2677k);
                    break;
                }
                break;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public void onAdClicked() {
        switch (this.f19806a) {
            case 4:
                w2.h hVar = ((i2.c) this.f19807b).f20552d;
                if (hVar != null) {
                    hVar.e();
                    break;
                }
                break;
            default:
                t tVar = ((m) this.f19807b).f20583d;
                if (tVar != null) {
                    tVar.e();
                    break;
                }
                break;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public void onAdDismissed() {
        switch (this.f19806a) {
            case 4:
                w2.h hVar = ((i2.c) this.f19807b).f20552d;
                if (hVar != null) {
                    hVar.c();
                    break;
                }
                break;
            default:
                t tVar = ((m) this.f19807b).f20583d;
                if (tVar != null) {
                    tVar.c();
                    break;
                }
                break;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public void onAdShowed() {
        switch (this.f19806a) {
            case 4:
                i2.c cVar = (i2.c) this.f19807b;
                w2.h hVar = cVar.f20552d;
                if (hVar != null) {
                    hVar.b();
                    cVar.f20552d.d();
                    break;
                }
                break;
            default:
                m mVar = (m) this.f19807b;
                t tVar = mVar.f20583d;
                if (tVar != null) {
                    tVar.b();
                    mVar.f20583d.d();
                    break;
                }
                break;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionListener
    public void onUserEarnedReward(PAGRewardItem pAGRewardItem) {
        t tVar = ((m) this.f19807b).f20583d;
        if (tVar != null) {
            tVar.a();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionListener
    public void onUserEarnedRewardFail(int i, String str) {
        Log.d(PangleMediationAdapter.TAG, R3.b.g(i, "Failed to reward user: " + str).toString());
    }

    @Override // o.B0
    public void p(MenuC2677k menuC2677k, n.m mVar) {
        ViewOnKeyListenerC2671e viewOnKeyListenerC2671e = (ViewOnKeyListenerC2671e) this.f19807b;
        Handler handler = viewOnKeyListenerC2671e.f22044f;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = viewOnKeyListenerC2671e.f22046h;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (menuC2677k == ((C2670d) arrayList.get(i)).f22027b) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        int i3 = i + 1;
        handler.postAtTime(new RunnableC0114b(this, i3 < arrayList.size() ? (C2670d) arrayList.get(i3) : null, mVar, menuC2677k, 6, false), menuC2677k, SystemClock.uptimeMillis() + 200);
    }

    public h(Context context) {
        this.f19806a = 12;
        this.f19807b = new n(context, 1);
    }

    public h(int i) {
        this.f19806a = i;
        switch (i) {
            case 18:
                this.f19807b = new ConcurrentHashMap();
                new AtomicInteger(0);
                break;
            default:
                this.f19807b = new h2.d(10);
                break;
        }
    }

    public h(TextView textView) {
        this.f19806a = 3;
        this.f19807b = new C2359i(textView);
    }

    public h(Matcher matcher, String str) {
        this.f19806a = 24;
        this.f19807b = matcher;
    }
}

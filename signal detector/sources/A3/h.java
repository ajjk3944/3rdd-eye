package A3;

import android.content.Context;
import android.os.Looper;
import androidx.recyclerview.widget.C0305b;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.impl.foreground.SystemForegroundService;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.android.gms.internal.ads.AbstractC0582Jp;
import com.google.android.gms.internal.ads.C0697Ql;
import com.google.android.gms.internal.ads.C0784Vn;
import com.google.android.gms.internal.ads.C0946bg;
import com.google.android.gms.internal.ads.C1109eg;
import com.google.android.gms.internal.ads.C1136f6;
import com.google.android.gms.internal.ads.C1231gt;
import com.google.android.gms.internal.ads.CD;
import com.google.android.gms.internal.ads.Cr;
import com.google.android.gms.internal.ads.DO;
import com.google.android.gms.internal.ads.GO;
import com.google.android.gms.internal.ads.Gz;
import com.google.android.gms.internal.ads.MN;
import com.google.android.gms.internal.ads.NN;
import com.google.android.gms.internal.ads.P9;
import com.google.android.gms.internal.ads.PP;
import com.google.android.gms.internal.ads.TextureViewSurfaceTextureListenerC0793Wf;
import com.google.android.gms.internal.ads.TextureViewSurfaceTextureListenerC1648og;
import com.google.android.gms.internal.ads.Vt;
import com.google.android.gms.internal.ads.Vu;
import com.google.android.gms.internal.ads.X6;
import com.google.android.gms.internal.ads.ZN;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
public final class h implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f373a;

    /* renamed from: b, reason: collision with root package name */
    public int f374b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f375c;

    public /* synthetic */ h(int i, int i3, Object obj) {
        this.f373a = i3;
        this.f375c = obj;
        this.f374b = i;
    }

    @Override // java.lang.Runnable
    public final void run() throws InterruptedException {
        C1136f6 c1136f6E;
        switch (this.f373a) {
            case 0:
                ((k) this.f375c).j(this.f374b);
                break;
            case 1:
                ((I3.e) this.f375c).f1969h.x(this.f374b, 4);
                break;
            case 2:
                ((L2.k) this.f375c).f(this.f374b);
                break;
            case 3:
                U0.j jVar = (U0.j) this.f375c;
                int i = this.f374b;
                I.b bVar = (I.b) jVar.f3677b;
                if (bVar != null) {
                    bVar.h(i);
                    break;
                }
                break;
            case 4:
                ((RecyclerView) this.f375c).e0(this.f374b);
                break;
            case 5:
                int i3 = this.f374b;
                X6 x6 = (X6) this.f375c;
                if (i3 > 0) {
                    try {
                        Thread.sleep(i3 * TTAdConstant.STYLE_SIZE_RADIO_1_1);
                    } catch (InterruptedException unused) {
                    }
                }
                try {
                    Context context = x6.f12375a;
                    c1136f6E = Cr.e(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
                } catch (Throwable unused2) {
                    c1136f6E = null;
                }
                X6 x62 = (X6) this.f375c;
                x62.f12382h = c1136f6E;
                int i6 = this.f374b;
                if (i6 < 4) {
                    if (c1136f6E == null || !c1136f6E.a0() || c1136f6E.v0().equals("0000000000000000000000000000000000000000000000000000000000000000") || !c1136f6E.z0() || !c1136f6E.A0().A() || c1136f6E.A0().B() == -2) {
                        int i7 = i6 + 1;
                        if (x62.f12385l) {
                            Future<?> futureSubmit = x62.f12376b.submit(new h(i7, 5, x62));
                            if (i7 == 0) {
                                x62.i = futureSubmit;
                                break;
                            }
                        }
                    }
                }
                break;
            case 6:
                P9 p9 = (P9) this.f375c;
                int i8 = this.f374b;
                C0784Vn c0784Vn = p9.f10328d;
                if (c0784Vn != null) {
                    C0697Ql c0697QlA = c0784Vn.a();
                    c0697QlA.r("action", "cct_nav");
                    c0697QlA.r("cct_navs", String.valueOf(i8));
                    c0697QlA.s();
                    break;
                }
                break;
            case 7:
                ((C1109eg) this.f375c).f13922b.onAudioFocusChange(this.f374b);
                break;
            case 8:
                TextureViewSurfaceTextureListenerC0793Wf textureViewSurfaceTextureListenerC0793Wf = (TextureViewSurfaceTextureListenerC0793Wf) this.f375c;
                int i9 = this.f374b;
                C0946bg c0946bg = textureViewSurfaceTextureListenerC0793Wf.f12233E;
                if (c0946bg != null) {
                    c0946bg.onWindowVisibilityChanged(i9);
                    break;
                }
                break;
            case 9:
                TextureViewSurfaceTextureListenerC1648og textureViewSurfaceTextureListenerC1648og = (TextureViewSurfaceTextureListenerC1648og) this.f375c;
                int i10 = this.f374b;
                C0946bg c0946bg2 = textureViewSurfaceTextureListenerC1648og.f15981g;
                if (c0946bg2 != null) {
                    c0946bg2.onWindowVisibilityChanged(i10);
                    break;
                }
                break;
            case 10:
                ((Gz) this.f375c).b(this.f374b + 1);
                break;
            case 11:
                ZN zn = (ZN) this.f375c;
                int i11 = ((PP) zn.f12853a[this.f374b].f2416e).f10398b;
                GO go = zn.f12837J;
                go.t(go.y(), 1033, new DO(9));
                break;
            case 12:
                Vu vu = (Vu) this.f375c;
                int i12 = this.f374b;
                vu.getClass();
                String str = Vt.f12096a;
                NN nn = (NN) vu.f12106b;
                MN mn = new MN(i12);
                C0305b c0305b = nn.f9997a.f11657P;
                AbstractC0582Jp.h0(Looper.myLooper() == ((C1231gt) c0305b.f5432c).f14397a.getLooper());
                c0305b.f5430a++;
                CD cd = new CD(c0305b, 23, mn);
                C1231gt c1231gt = (C1231gt) c0305b.f5431b;
                if (c1231gt.f14397a.getLooper().getThread().isAlive()) {
                    c1231gt.e(cd);
                }
                c0305b.y(Integer.valueOf(i12));
                break;
            case 13:
                ((com.google.android.material.datepicker.j) this.f375c).f18287r0.e0(this.f374b);
                break;
            case 14:
                ((SystemForegroundService) this.f375c).f5697e.cancel(this.f374b);
                break;
            default:
                ArrayList arrayList = (ArrayList) this.f375c;
                int size = arrayList.size();
                if (this.f374b != 1) {
                    for (int i13 = 0; i13 < size; i13++) {
                        ((f0.h) arrayList.get(i13)).a();
                    }
                    break;
                } else {
                    for (int i14 = 0; i14 < size; i14++) {
                        ((f0.h) arrayList.get(i14)).b();
                    }
                    break;
                }
        }
    }

    public /* synthetic */ h(ZN zn, int i, boolean z6) {
        this.f373a = 11;
        this.f375c = zn;
        this.f374b = i;
    }

    public h(int i, S0.l lVar) {
        this.f373a = 4;
        this.f374b = i;
        this.f375c = lVar;
    }

    public h(List list, int i, Throwable th) {
        this.f373a = 15;
        a4.t.e(list, "initCallbacks cannot be null");
        this.f375c = new ArrayList(list);
        this.f374b = i;
    }

    public h(I3.e eVar) {
        this.f373a = 1;
        this.f375c = eVar;
        this.f374b = -1;
    }
}

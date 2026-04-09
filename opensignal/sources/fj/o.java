package fj;

import android.graphics.Bitmap;
import android.os.Handler;
import android.telephony.TelephonyManager;
import android.view.LayoutInflater;
import android.view.PixelCopy;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.lifecycle.f0;
import com.staircase3.opensignal.activities.MainActivity;
import h7.r1;
import io.sentry.android.replay.ReplayIntegration;
import io.sentry.android.replay.a0;
import io.sentry.b5;
import io.sentry.x5;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import lf.t1;
import p.l2;
import u3.i0;
import u3.z;

/* loaded from: classes.dex */
public final class o implements io.sentry.android.replay.screenshot.f {

    /* renamed from: a, reason: collision with root package name */
    public final Object f8942a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f8943b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f8944c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f8945d;

    /* renamed from: e, reason: collision with root package name */
    public Object f8946e;

    /* renamed from: f, reason: collision with root package name */
    public Object f8947f;

    /* renamed from: g, reason: collision with root package name */
    public Object f8948g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f8949h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f8950i;
    public final Object j;
    public final Object k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f8951l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f8952m;

    public o(cj.a aVar, ch.f fVar, df.c cVar, df.c cVar2, xj.j jVar, ag.b bVar, ch.i iVar, b bVar2, l2 l2Var, l2 l2Var2, q3.a aVar2, Executor executor) {
        br.l.e(cVar2, "phoneStateListenerFactory");
        this.f8942a = aVar;
        this.f8943b = fVar;
        this.f8944c = cVar;
        this.f8945d = cVar2;
        this.f8946e = jVar;
        this.f8947f = bVar;
        this.f8948g = iVar;
        this.f8949h = bVar2;
        this.f8950i = l2Var;
        this.j = l2Var2;
        this.k = aVar2;
        this.f8951l = executor;
        this.f8952m = new LinkedHashMap();
        ch.n.b("TelephonyPhoneStateRepositoryProvider", "createTelephonyPhoneStateRepositories() called");
        HashMap map = new HashMap();
        for (Map.Entry entry : aVar.v().entrySet()) {
            map.put(entry.getKey(), d((TelephonyManager) entry.getValue()));
        }
        for (Map.Entry entry2 : map.entrySet()) {
            int iIntValue = ((Number) entry2.getKey()).intValue();
            n nVar = (n) entry2.getValue();
            ((LinkedHashMap) this.f8952m).put(Integer.valueOf(iIntValue), nVar);
            nVar.d();
        }
    }

    @Override // io.sentry.android.replay.screenshot.f
    public boolean a() {
        return ((AtomicBoolean) this.j).get();
    }

    @Override // io.sentry.android.replay.screenshot.f
    public void b(View view) throws IllegalAccessException, IllegalArgumentException {
        x5 x5Var = (x5) this.f8943b;
        Window windowT = t1.t(view);
        if (windowT == null) {
            x5Var.getLogger().m(b5.DEBUG, "Window is invalid, not capturing screenshot", new Object[0]);
            return;
        }
        if (((AtomicBoolean) this.f8952m).get()) {
            x5Var.getLogger().m(b5.DEBUG, "PixelCopyStrategy is closed, not capturing screenshot", new Object[0]);
            return;
        }
        try {
            ((AtomicBoolean) this.f8951l).set(false);
            PixelCopy.request(windowT, (Bitmap) this.f8948g, new io.sentry.android.core.internal.util.l(this, 1, view), (Handler) ((r1) this.f8946e).f10199d);
        } catch (Throwable th2) {
            x5Var.getLogger().g(b5.WARNING, "Failed to capture replay recording", th2);
            ((AtomicBoolean) this.j).set(false);
        }
    }

    @Override // io.sentry.android.replay.screenshot.f
    public void c() {
        Bitmap bitmap = (Bitmap) this.f8948g;
        if (!((AtomicBoolean) this.j).get() || bitmap.isRecycled()) {
            return;
        }
        ((ReplayIntegration) this.f8942a).V(bitmap);
    }

    @Override // io.sentry.android.replay.screenshot.f
    public void close() {
        ((AtomicBoolean) this.f8952m).set(true);
        ((ScheduledExecutorService) this.f8945d).submit(new io.sentry.android.replay.util.c(new f0(26, this), "PixelCopyStrategy.close"));
    }

    public n d(TelephonyManager telephonyManager) {
        br.l.e(telephonyManager, "telephonyManager");
        return new n((df.c) this.f8944c, (df.c) this.f8945d, telephonyManager, (ch.f) this.f8943b, (ag.b) this.f8947f, (xj.j) this.f8946e, (ch.i) this.f8948g, (b) this.f8949h, (Executor) this.f8951l, (q3.a) this.k, (l2) this.j, (l2) this.f8950i);
    }

    public n e(int i10) {
        n nVar;
        TelephonyManager telephonyManager;
        synchronized (((LinkedHashMap) this.f8952m)) {
            try {
                if (((n) ((LinkedHashMap) this.f8952m).get(Integer.valueOf(i10))) == null && (telephonyManager = (TelephonyManager) ((cj.a) this.f8942a).v().get(Integer.valueOf(i10))) != null) {
                    n nVarD = d(telephonyManager);
                    nVarD.d();
                    ((LinkedHashMap) this.f8952m).put(Integer.valueOf(i10), nVarD);
                }
                nVar = (n) ((LinkedHashMap) this.f8952m).get(Integer.valueOf(i10));
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return nVar;
    }

    @Override // io.sentry.android.replay.screenshot.f
    public void onContentChanged() {
        ((AtomicBoolean) this.f8951l).set(true);
    }

    public o(a0 a0Var, ReplayIntegration replayIntegration, x5 x5Var, io.sentry.android.replay.t tVar, io.sentry.android.replay.util.a aVar) {
        br.l.e(a0Var, "executorProvider");
        this.f8942a = replayIntegration;
        this.f8943b = x5Var;
        this.f8944c = tVar;
        this.f8945d = a0Var.f11842x;
        this.f8946e = a0Var.f11841r;
        lq.j jVar = lq.j.NONE;
        this.f8947f = kc.f.E(jVar, io.sentry.android.replay.screenshot.d.f11973r);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(tVar.f11985a, tVar.f11986b, Bitmap.Config.ARGB_8888);
        br.l.d(bitmapCreateBitmap, "createBitmap(...)");
        this.f8948g = bitmapCreateBitmap;
        this.f8949h = kc.f.E(jVar, new io.sentry.android.replay.screenshot.e(this, 1));
        this.f8950i = kc.f.E(jVar, new io.sentry.android.replay.screenshot.e(this, 0));
        this.j = new AtomicBoolean(false);
        this.k = kc.f.E(jVar, io.sentry.android.replay.screenshot.d.f11972g);
        this.f8951l = new AtomicBoolean(false);
        this.f8952m = new AtomicBoolean(false);
    }

    public o(MainActivity mainActivity, int i10, RelativeLayout relativeLayout) {
        this.f8952m = mainActivity;
        this.f8943b = relativeLayout;
        RelativeLayout relativeLayout2 = (RelativeLayout) relativeLayout.findViewById(qk.h.dialog);
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(mainActivity).inflate(i10, (ViewGroup) null);
        this.f8942a = viewGroup;
        WeakHashMap weakHashMap = i0.f23177a;
        z.i(viewGroup, 4.0f);
        this.f8944c = (Button) ((ViewGroup) this.f8942a).findViewById(qk.h.btLeft);
        this.f8945d = (Button) ((ViewGroup) this.f8942a).findViewById(qk.h.btRight);
        this.f8949h = (TextView) ((ViewGroup) this.f8942a).findViewById(qk.h.tvHeader);
        this.f8950i = (TextView) ((ViewGroup) this.f8942a).findViewById(qk.h.tvContent);
        this.j = (TextView) ((ViewGroup) this.f8942a).findViewById(qk.h.tvBottomContent);
        this.k = (ImageView) ((ViewGroup) this.f8942a).findViewById(qk.h.ivBackground);
        this.f8951l = (ImageView) ((ViewGroup) this.f8942a).findViewById(qk.h.ivHero);
        ((Button) this.f8944c).setOnClickListener(new yk.a(this, 0));
        ((Button) this.f8945d).setOnClickListener(new yk.a(this, 1));
        ViewGroup viewGroup2 = (ViewGroup) this.f8942a;
        if (relativeLayout2 == null || relativeLayout2.indexOfChild(viewGroup2) == -1) {
            relativeLayout2.addView((ViewGroup) this.f8942a);
        }
    }
}

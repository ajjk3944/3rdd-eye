package km;

import al.i1;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.widget.Toast;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.applovin.sdk.AppLovinEventParameters;
import com.google.android.gms.internal.ads.gx;
import com.google.android.gms.internal.ads.ja;
import com.google.android.gms.internal.ads.ka;
import com.google.android.gms.internal.ads.o21;
import com.google.android.gms.internal.ads.sk;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.liuzh.deviceinfo.R;
import com.liuzh.deviceinfo.diskpartition.DiskPartitionActivity;
import com.liuzh.deviceinfo.splash.SplashActivity;
import com.liuzho.lib.appinfo.AppInfoActivity;
import com.liuzho.module.app_analyzer.ui.AppsAnalyzeActivity;
import e4.c2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import p.v2;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class y implements g, ga.b, mi.b, e4.s, p.u0, p6.n, qd.c, rf.b, p1.t, com.google.android.gms.common.api.internal.j, mg.a, pi.i, v2, f.b, wi.b, ja, Continuation {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28521a;

    /* renamed from: b, reason: collision with root package name */
    public Object f28522b;

    public /* synthetic */ y(int i4, Object obj) {
        this.f28521a = i4;
        this.f28522b = obj;
    }

    public void B(String str) {
        ArrayList arrayList = (ArrayList) this.f28522b;
        int i4 = 0;
        while (i4 < arrayList.size()) {
            if (str.equalsIgnoreCase((String) arrayList.get(i4))) {
                arrayList.remove(i4);
                arrayList.remove(i4);
                i4 -= 2;
            }
            i4 += 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void C(p4.b1 r6) {
        /*
            r5 = this;
            java.lang.String r0 = "newState"
            nk.k.e(r6, r0)
            java.lang.Object r0 = r5.f28522b
            al.i1 r0 = (al.i1) r0
        L9:
            java.lang.Object r1 = r0.getValue()
            r2 = r1
            p4.b1 r2 = (p4.b1) r2
            boolean r3 = r2 instanceof p4.u0
            if (r3 == 0) goto L16
            r3 = 1
            goto L1c
        L16:
            p4.c1 r3 = p4.c1.f31177b
            boolean r3 = nk.k.a(r2, r3)
        L1c:
            if (r3 == 0) goto L1f
            goto L29
        L1f:
            boolean r3 = r2 instanceof p4.d
            if (r3 == 0) goto L2b
            int r3 = r6.f31175a
            int r4 = r2.f31175a
            if (r3 <= r4) goto L2f
        L29:
            r2 = r6
            goto L2f
        L2b:
            boolean r3 = r2 instanceof p4.j0
            if (r3 == 0) goto L36
        L2f:
            boolean r1 = r0.i(r1, r2)
            if (r1 == 0) goto L9
            return
        L36:
            ac.m r6 = new ac.m
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: km.y.C(p4.b1):void");
    }

    public void D(o21 o21Var) {
        com.google.android.gms.common.api.internal.p pVar = (com.google.android.gms.common.api.internal.p) this.f28522b;
        pVar.getClass();
        String str = o21Var.f14517b;
        int i4 = o21Var.f14516a;
        if (!TextUtils.isEmpty(str)) {
            if (!((Boolean) va.s.f36163e.f36166c.a(sk.Lc)).booleanValue()) {
                pVar.f9115b = str;
            }
        }
        switch (i4) {
            case 8152:
                pVar.f(new HashMap(), "onLMDOverlayOpened");
                break;
            case 8153:
                pVar.f(new HashMap(), "onLMDOverlayClicked");
                break;
            case 8155:
                pVar.f(new HashMap(), "onLMDOverlayClose");
                break;
            case 8157:
                pVar.f9115b = null;
                pVar.f9116c = null;
                pVar.f9114a = false;
                break;
            case 8160:
            case 8161:
            case 8162:
                HashMap map = new HashMap();
                map.put("error", String.valueOf(i4));
                pVar.f(map, "onLMDOverlayFailedToOpen");
                break;
        }
    }

    @Override // pi.i
    public void a() {
        switch (this.f28521a) {
            case 16:
                break;
            default:
                ((AppsAnalyzeActivity) this.f28522b).finish();
                break;
        }
    }

    @Override // com.google.android.gms.common.api.internal.j
    public void accept(Object obj, Object obj2) {
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        rb.a aVar = (rb.a) ((rb.c) obj).t();
        pb.m mVar = (pb.m) this.f28522b;
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(aVar.f304c);
        int i4 = zb.a.f38165a;
        if (mVar == null) {
            parcelObtain.writeInt(0);
        } else {
            parcelObtain.writeInt(1);
            mVar.writeToParcel(parcelObtain, 0);
        }
        try {
            aVar.f303b.transact(1, parcelObtain, null, 1);
            parcelObtain.recycle();
            taskCompletionSource.setResult(null);
        } catch (Throwable th2) {
            parcelObtain.recycle();
            throw th2;
        }
    }

    @Override // qd.c
    public Object b() {
        pd.f fVar = (pd.f) ((qd.c) this.f28522b).b();
        if (fVar != null) {
            return fVar;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // mg.a
    public void c() {
        SplashActivity.D((SplashActivity) this.f28522b);
    }

    @Override // p6.n
    public WebViewProviderBoundaryInterface createWebView(WebView webView) {
        return (WebViewProviderBoundaryInterface) jm.a.f(WebViewProviderBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f28522b).createWebView(webView));
    }

    @Override // mg.a
    public void d() {
        SplashActivity.D((SplashActivity) this.f28522b);
    }

    @Override // p1.t
    public long e() {
        r0.q qVar = (r0.q) this.f28522b;
        long jE = qVar.f32631t.e();
        if (jE != 16) {
            return jE;
        }
        r0.b0 b0Var = (r0.b0) i2.k.h(qVar, r0.d0.f32505a);
        if (b0Var != null) {
            long j = b0Var.f32493a;
            if (j != 16) {
                return j;
            }
        }
        return ((p1.s) i2.k.h(qVar, r0.o.f32614a)).f31020a;
    }

    @Override // com.google.android.gms.internal.ads.ja
    public void f(ka kaVar) {
        ((gx) this.f28522b).d(kaVar);
    }

    @Override // km.g
    public void g(d dVar, Throwable th2) {
        ((xk.h) this.f28522b).resumeWith(ci.b.h(th2));
    }

    @Override // xj.a
    public Object get() {
        switch (this.f28521a) {
            case 2:
                String packageName = ((Context) ((xj.a) this.f28522b).get()).getPackageName();
                if (packageName != null) {
                    return packageName;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
            default:
                return new pf.l((cf.b) ((rf.c) this.f28522b).f32941a);
        }
    }

    @Override // p6.n
    public ProfileStoreBoundaryInterface getProfileStore() {
        return (ProfileStoreBoundaryInterface) jm.a.f(ProfileStoreBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f28522b).getProfileStore());
    }

    @Override // p6.n
    public StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) jm.a.f(StaticsBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f28522b).getStatics());
    }

    @Override // p6.n
    public String[] h() {
        return ((WebViewProviderFactoryBoundaryInterface) this.f28522b).getSupportedFeatures();
    }

    @Override // p.v2
    public boolean i(String str) {
        nk.k.e(str, "newText");
        DiskPartitionActivity diskPartitionActivity = (DiskPartitionActivity) this.f28522b;
        int i4 = DiskPartitionActivity.D;
        sg.f fVar = (sg.f) diskPartitionActivity.C.getValue();
        if (fVar.f33607b.isEmpty()) {
            return true;
        }
        fVar.f33610e.h(new ng.a(true));
        i5.a aVarG = androidx.lifecycle.y0.g(fVar);
        el.e eVar = xk.g0.f37189a;
        xk.x.v(aVarG, el.d.f23561c, null, new androidx.lifecycle.u(fVar, str, (ck.c) null), 2).m(new b7.u(18, fVar));
        return true;
    }

    @Override // e4.s
    public c2 j(View view, c2 c2Var) {
        oc.f fVar = (oc.f) this.f28522b;
        oc.e eVar = fVar.f30511n;
        if (eVar != null) {
            fVar.g.Y.remove(eVar);
        }
        oc.e eVar2 = new oc.e(fVar.j, c2Var);
        fVar.f30511n = eVar2;
        eVar2.e(fVar.getWindow());
        BottomSheetBehavior bottomSheetBehavior = fVar.g;
        oc.e eVar3 = fVar.f30511n;
        ArrayList arrayList = bottomSheetBehavior.Y;
        if (!arrayList.contains(eVar3)) {
            arrayList.add(eVar3);
        }
        return c2Var;
    }

    @Override // f.b
    public void k(Object obj) {
        ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.f28522b;
        f.a aVar = (f.a) obj;
        proxyBillingActivityV2.getClass();
        Intent intent = aVar.f23582b;
        int i4 = com.google.android.gms.internal.play_billing.u.e(intent, "ProxyBillingActivityV2").f34435a;
        ResultReceiver resultReceiver = proxyBillingActivityV2.f2997y;
        if (resultReceiver != null) {
            resultReceiver.send(i4, intent == null ? null : intent.getExtras());
        }
        int i10 = aVar.f23581a;
        if (i10 != -1 || i4 != 0) {
            com.google.android.gms.internal.play_billing.u.h("ProxyBillingActivityV2", "External offer dialog finished with resultCode: " + i10 + " and billing's responseCode: " + i4);
        }
        proxyBillingActivityV2.finish();
    }

    @Override // wi.b
    public void m() {
        AppInfoActivity appInfoActivity = (AppInfoActivity) this.f28522b;
        if (t6.i0.l(appInfoActivity)) {
            return;
        }
        Toast.makeText(appInfoActivity, R.string.appi_failed, 0).show();
    }

    @Override // p.v2
    public void n(String str) {
        nk.k.e(str, AppLovinEventParameters.SEARCH_QUERY);
    }

    @Override // wi.b
    public void onSuccess() {
        AppInfoActivity appInfoActivity = (AppInfoActivity) this.f28522b;
        if (t6.i0.l(appInfoActivity)) {
            return;
        }
        appInfoActivity.F.getClass();
        Toast.makeText(appInfoActivity, R.string.appi_save_successful, 0).show();
    }

    @Override // km.g
    public void p(d dVar, v0 v0Var) {
        xk.h hVar = (xk.h) this.f28522b;
        if (v0Var.f28510a.f33217p) {
            hVar.resumeWith(v0Var.f28511b);
        } else {
            hVar.resumeWith(ci.b.h(new s(v0Var)));
        }
    }

    @Override // mg.a
    public void q() {
        SplashActivity.D((SplashActivity) this.f28522b);
    }

    @Override // pi.i
    public void r() {
        switch (this.f28521a) {
            case 16:
                SplashActivity splashActivity = ((rh.e) this.f28522b).f32959h;
                splashActivity.findViewById(android.R.id.content).setAlpha(0.0f);
                splashActivity.f32744a.a(new jg.n(4, this));
                break;
        }
    }

    @Override // pi.i
    public void t(String str) {
        switch (this.f28521a) {
            case 16:
                SplashActivity splashActivity = ((rh.e) this.f28522b).f32959h;
                int i4 = SplashActivity.K;
                splashActivity.F(false);
                break;
            default:
                ((AppsAnalyzeActivity) this.f28522b).finish();
                break;
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        yb.i iVar = (yb.i) this.f28522b;
        if (task.isSuccessful() || task.isCanceled()) {
            return task;
        }
        Exception exception = task.getException();
        if (!(exception instanceof ob.d)) {
            return task;
        }
        int i4 = ((ob.d) exception).f30482a.f9060a;
        return (i4 == 43001 || i4 == 43002 || i4 == 43003 || i4 == 17) ? ((yb.e) iVar.f37517c).getAppSetIdInfo() : i4 == 43000 ? Tasks.forException(new Exception("Failed to get app set ID due to an internal error. Please try again later.")) : i4 != 15 ? task : Tasks.forException(new Exception("The operation to get app set ID timed out. Please try again later."));
    }

    public void u(String str, String str2) {
        nk.k.e(str, "name");
        nk.k.e(str2, "value");
        com.bumptech.glide.d.r(str);
        com.bumptech.glide.d.s(str2, str);
        com.bumptech.glide.d.j(this, str, str2);
    }

    public void v(String str, String str2) {
        nk.k.e(str, "name");
        nk.k.e(str2, "value");
        com.bumptech.glide.d.j(this, str, str2);
    }

    public void w(x5.b bVar) {
        nk.k.e(bVar, "migration");
        int i4 = bVar.f36975a;
        int i10 = bVar.f36976b;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f28522b;
        Integer numValueOf = Integer.valueOf(i4);
        Object treeMap = linkedHashMap.get(numValueOf);
        if (treeMap == null) {
            treeMap = new TreeMap();
            linkedHashMap.put(numValueOf, treeMap);
        }
        TreeMap treeMap2 = (TreeMap) treeMap;
        if (treeMap2.containsKey(Integer.valueOf(i10))) {
            Log.w("ROOM", "Overriding migration " + treeMap2.get(Integer.valueOf(i10)) + " with " + bVar);
        }
        treeMap2.put(Integer.valueOf(i10), bVar);
    }

    public rl.m x() {
        return new rl.m((String[]) ((ArrayList) this.f28522b).toArray(new String[0]));
    }

    public p4.b1 y() {
        return (p4.b1) ((i1) this.f28522b).getValue();
    }

    public /* synthetic */ y(int i4, boolean z3) {
        this.f28521a = i4;
    }

    public y(int i4) {
        this.f28521a = i4;
        switch (i4) {
            case 17:
                this.f28522b = new ArrayList(20);
                break;
            case 19:
                this.f28522b = new LinkedHashMap();
                break;
            case 23:
                this.f28522b = com.bumptech.glide.e.r(Looper.getMainLooper());
                break;
            default:
                this.f28522b = al.z0.b(p4.c1.f31177b);
                break;
        }
    }

    public y(sl.g gVar) {
        this.f28521a = 24;
        this.f28522b = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), gVar);
    }

    public y(AppInfoActivity appInfoActivity, String str) {
        this.f28521a = 22;
        this.f28522b = appInfoActivity;
    }

    private final /* synthetic */ void A() {
    }

    private final void z() {
    }

    @Override // p.u0
    public void l(int i4) {
    }

    @Override // p.u0
    public void o(int i4) {
    }

    @Override // p.u0
    public void s(int i4, float f10) {
    }
}

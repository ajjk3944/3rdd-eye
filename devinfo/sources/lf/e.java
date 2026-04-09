package lf;

import al.i1;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Environment;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.y0;
import androidx.recyclerview.widget.RecyclerView;
import bh.o;
import bh.w;
import com.applovin.shadow.okhttp3.Call;
import com.applovin.shadow.okhttp3.EventListener;
import com.applovin.shadow.okhttp3.internal.Util;
import com.google.android.gms.internal.ads.xz;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.liuzh.deviceinfo.R;
import com.liuzh.deviceinfo.analyzer.StorageAnalyzeActivity;
import com.liuzh.deviceinfo.common.WebViewActivity;
import com.liuzh.deviceinfo.monitor.CustomMonitorActivity;
import com.liuzh.deviceinfo.sensors.SensorDetailActivity;
import com.liuzh.deviceinfo.settings.HelperCenterActivity;
import com.liuzho.lib.appinfo.ManifestActivity;
import com.liuzho.module.app_analyzer.ui.AppsAnalyzeActivity;
import e4.c2;
import e4.s;
import e4.v0;
import java.util.Map;
import p.u2;
import sh.x0;
import t6.i0;
import xk.a0;
import xk.x;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class e implements SuccessContinuation, h3.i, OnSuccessListener, OnFailureListener, s, ki.c, mi.c, f.b, u2, EventListener.Factory, zg.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28757a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f28758b;

    public /* synthetic */ e(int i4, Object obj) {
        this.f28757a = i4;
        this.f28758b = obj;
    }

    @Override // p.u2
    public void a() {
        i1 i1Var = ((th.i) this.f28758b).f34621b.f34650d;
        i1Var.getClass();
        i1Var.j(null, "");
    }

    @Override // ki.c
    public void b(int i4) {
        ((TextView) this.f28758b).setBackgroundColor(i4);
    }

    public void c(t7.c cVar) {
        yb.e eVar = (yb.e) this.f28758b;
        nk.k.e(cVar, "billingResult");
        if (cVar.f34435a != 0) {
            eVar.q();
            return;
        }
        w wVar = (w) eVar.f37509b;
        x.v(y0.g(wVar), null, null, new o((String) eVar.f37510c, (String) eVar.f37511d, wVar, null, 1), 3);
    }

    @Override // com.applovin.shadow.okhttp3.EventListener.Factory
    public EventListener create(Call call) {
        return Util.asFactory$lambda$8((EventListener) this.f28758b, call);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean d(android.view.MotionEvent r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f28758b
            ql.c r0 = (ql.c) r0
            android.view.View r1 = r0.j
            boolean r2 = r0.f32460l
            r3 = 0
            if (r2 != 0) goto Lc
            return r3
        Lc:
            float r2 = r8.getX()
            float r4 = r8.getY()
            android.graphics.Rect r5 = r0.a()
            int r8 = r8.getAction()
            r6 = 1
            if (r8 == 0) goto L86
            if (r8 == r6) goto L82
            r2 = 2
            if (r8 == r2) goto L29
            r1 = 3
            if (r8 == r1) goto L82
            goto La2
        L29:
            boolean r8 = r0.f32467s
            if (r8 != 0) goto L72
            android.view.View r8 = r0.f32458i
            float r2 = r0.f32462n
            float r3 = r0.f32463o
            boolean r8 = r0.d(r8, r2, r3)
            if (r8 == 0) goto L72
            float r8 = r0.f32463o
            float r8 = r4 - r8
            float r8 = java.lang.Math.abs(r8)
            int r2 = r0.f32452b
            float r2 = (float) r2
            int r8 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r8 <= 0) goto L72
            float r8 = r0.f32462n
            float r2 = r0.f32463o
            boolean r8 = r0.d(r1, r8, r2)
            if (r8 == 0) goto L5b
            float r8 = r0.f32464p
            r0.f32465q = r8
            int r8 = r0.f32461m
            r0.f32466r = r8
            goto L6f
        L5b:
            r0.f32465q = r4
            int r8 = r5.top
            float r8 = (float) r8
            float r8 = r4 - r8
            int r1 = r0.f32457h
            float r1 = (float) r1
            r2 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r2
            float r8 = r8 - r1
            int r8 = (int) r8
            r0.f32466r = r8
            r0.g(r8)
        L6f:
            r0.h(r6)
        L72:
            boolean r8 = r0.f32467s
            if (r8 == 0) goto La2
            int r8 = r0.f32466r
            float r1 = r0.f32465q
            float r1 = r4 - r1
            int r1 = (int) r1
            int r8 = r8 + r1
            r0.g(r8)
            goto La2
        L82:
            r0.h(r3)
            goto La2
        L86:
            r0.f32462n = r2
            r0.f32463o = r4
            float r8 = r1.getAlpha()
            r3 = 0
            int r8 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r8 <= 0) goto La2
            boolean r8 = r0.d(r1, r2, r4)
            if (r8 == 0) goto La2
            r0.f32465q = r4
            int r8 = r0.f32461m
            r0.f32466r = r8
            r0.h(r6)
        La2:
            r0.f32464p = r4
            boolean r8 = r0.f32467s
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: lf.e.d(android.view.MotionEvent):boolean");
    }

    @Override // zg.b
    public void e() {
        switch (this.f28757a) {
            case 21:
                ((f.d) this.f28758b).a(zg.c.f38279a[0]);
                break;
            default:
                zg.c.h((i.g) this.f28758b);
                break;
        }
    }

    @Override // h3.i
    public Object i(h3.h hVar) {
        a0 a0Var = (a0) this.f28758b;
        a0Var.m(new c2.w(8, hVar, a0Var));
        return "Deferred.asListenableFuture";
    }

    @Override // e4.s
    public c2 j(View view, c2 c2Var) throws Resources.NotFoundException {
        int i4 = this.f28757a;
        Object obj = this.f28758b;
        switch (i4) {
            case 4:
                WebViewActivity webViewActivity = (WebViewActivity) obj;
                int i10 = WebViewActivity.C;
                v3.b bVarX = nh.a.x(c2Var);
                zh.i.a(webViewActivity.B.f32330c, bVarX);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) webViewActivity.B.f32331d.getLayoutParams();
                marginLayoutParams.leftMargin = bVarX.f35793a;
                marginLayoutParams.topMargin = webViewActivity.B.f32330c.getLayoutParams().height;
                marginLayoutParams.rightMargin = bVarX.f35795c;
                marginLayoutParams.bottomMargin = bVarX.f35796d;
                webViewActivity.B.f32331d.setLayoutParams(marginLayoutParams);
                return v0.j(view, c2Var);
            case 6:
                int i11 = SensorDetailActivity.C;
                nk.k.e(view, "v");
                zh.i.a(((qg.b) obj).f32327c, nh.a.x(c2Var));
                return v0.j(view, c2Var);
            case 7:
                i0.f fVar = (i0.f) obj;
                int i12 = HelperCenterActivity.B;
                nk.k.e(view, "v");
                v3.b bVarX2 = nh.a.x(c2Var);
                Toolbar toolbar = (Toolbar) fVar.f25418d;
                zh.i.a(toolbar, bVarX2);
                ((LinearLayout) fVar.f25417c).setPadding(bVarX2.f35793a, toolbar.getLayoutParams().height, bVarX2.f35795c, bVarX2.f35796d);
                return v0.j(view, c2Var);
            case 15:
                ManifestActivity manifestActivity = (ManifestActivity) obj;
                int i13 = ManifestActivity.E;
                v3.b bVarX3 = nh.a.x(c2Var);
                ViewGroup.LayoutParams layoutParams = manifestActivity.D.f32330c.getLayoutParams();
                int iN = cm.g.n(R.attr.actionBarSize, manifestActivity);
                int i14 = bVarX3.f35794b;
                layoutParams.height = iN + i14;
                manifestActivity.D.f32330c.setLayoutParams(layoutParams);
                Toolbar toolbar2 = manifestActivity.D.f32330c;
                int i15 = bVarX3.f35793a;
                int i16 = bVarX3.f35795c;
                toolbar2.setPadding(i15, i14, i16, toolbar2.getPaddingBottom());
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) manifestActivity.D.f32329b.getLayoutParams();
                marginLayoutParams2.topMargin = layoutParams.height;
                marginLayoutParams2.leftMargin = i15;
                marginLayoutParams2.rightMargin = i16;
                int i17 = bVarX3.f35796d;
                marginLayoutParams2.bottomMargin = i17;
                manifestActivity.D.f32329b.setLayoutParams(marginLayoutParams2);
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) manifestActivity.D.f32331d.getLayoutParams();
                marginLayoutParams3.topMargin = layoutParams.height;
                marginLayoutParams3.leftMargin = i15;
                marginLayoutParams3.rightMargin = i16;
                marginLayoutParams3.bottomMargin = i17;
                manifestActivity.D.f32331d.setLayoutParams(marginLayoutParams3);
                return v0.j(view, c2Var);
            case 18:
                CustomMonitorActivity customMonitorActivity = (CustomMonitorActivity) obj;
                int i18 = CustomMonitorActivity.F;
                nk.k.e(view, "v");
                v3.b bVarX4 = nh.a.x(c2Var);
                xz xzVar = customMonitorActivity.B;
                if (xzVar == null) {
                    nk.k.k("viewBinding");
                    throw null;
                }
                zh.i.a((Toolbar) xzVar.f18590h, bVarX4);
                int dimensionPixelSize = view.getResources().getDimensionPixelSize(R.dimen.content_padding);
                int dimensionPixelSize2 = view.getResources().getDimensionPixelSize(R.dimen.toolbar_height);
                xz xzVar2 = customMonitorActivity.B;
                if (xzVar2 == null) {
                    nk.k.k("viewBinding");
                    throw null;
                }
                ((LinearLayout) xzVar2.f18587d).setPadding(bVarX4.f35793a, bVarX4.f35794b + dimensionPixelSize2 + dimensionPixelSize, bVarX4.f35795c, bVarX4.f35796d);
                return v0.j(view, c2Var);
            default:
                AppsAnalyzeActivity appsAnalyzeActivity = (AppsAnalyzeActivity) obj;
                int i19 = AppsAnalyzeActivity.S;
                appsAnalyzeActivity.Q = nh.a.x(c2Var);
                ViewGroup.LayoutParams layoutParams2 = appsAnalyzeActivity.N.getLayoutParams();
                layoutParams2.height = cm.g.n(R.attr.actionBarSize, appsAnalyzeActivity) + appsAnalyzeActivity.Q.f35794b;
                appsAnalyzeActivity.N.setLayoutParams(layoutParams2);
                Toolbar toolbar3 = appsAnalyzeActivity.N;
                v3.b bVar = appsAnalyzeActivity.Q;
                toolbar3.setPadding(bVar.f35793a, bVar.f35794b, bVar.f35795c, toolbar3.getPaddingBottom());
                RecyclerView recyclerView = appsAnalyzeActivity.C;
                v3.b bVar2 = appsAnalyzeActivity.Q;
                recyclerView.setPadding(bVar2.f35793a, 0, bVar2.f35795c, cm.g.n(R.attr.appa_content_padding_half, appsAnalyzeActivity) + appsAnalyzeActivity.Q.f35796d);
                ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) appsAnalyzeActivity.H.getLayoutParams();
                marginLayoutParams4.leftMargin = a4.a.b(4.0f) + appsAnalyzeActivity.Q.f35793a;
                marginLayoutParams4.rightMargin = a4.a.b(4.0f) + appsAnalyzeActivity.Q.f35795c;
                marginLayoutParams4.topMargin = a4.a.b(4.0f) + layoutParams2.height;
                View view2 = appsAnalyzeActivity.B;
                v3.b bVar3 = appsAnalyzeActivity.Q;
                view2.setPadding(bVar3.f35793a, 0, bVar3.f35795c, bVar3.f35796d);
                return v0.j(view, c2Var);
        }
    }

    @Override // f.b
    public void k(Object obj) {
        ti.m mVar;
        int i4 = this.f28757a;
        Object obj2 = this.f28758b;
        switch (i4) {
            case 12:
                sh.a0 a0Var = (sh.a0) obj2;
                a0Var.getClass();
                if (Boolean.TRUE.equals(((Map) obj).get("android.permission.ACCESS_FINE_LOCATION"))) {
                    a0Var.n0();
                    a0Var.k0();
                    break;
                }
                break;
            case 13:
                x0 x0Var = (x0) obj2;
                if (((Boolean) obj).booleanValue()) {
                    Context contextW = x0Var.W();
                    String str = com.liuzh.deviceinfo.utilities.c.f21249b;
                    int i10 = StorageAnalyzeActivity.C;
                    Intent intent = new Intent(contextW, (Class<?>) StorageAnalyzeActivity.class);
                    intent.putExtra("analyze_path", str);
                    contextW.startActivity(intent);
                    break;
                }
                break;
            case 14:
            case 15:
            default:
                ((f.b) obj2).k(Boolean.valueOf(Environment.isExternalStorageManager()));
                break;
            case 16:
                i0.f fVar = (i0.f) obj2;
                Uri uri = (Uri) obj;
                if (uri != null && (mVar = (ti.m) fVar.f25417c) != null) {
                    mVar.b(uri);
                    fVar.f25417c = null;
                    break;
                }
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        Activity activity = (Activity) this.f28758b;
        nk.k.e(exc, "e");
        i0.l(activity);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) throws Exception {
        ((b7.b) this.f28758b).invoke(obj);
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        return Tasks.forResult((f) this.f28758b);
    }
}

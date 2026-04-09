package p6;

import a0.r;
import a0.v0;
import a0.x0;
import ah.o;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.Toast;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.f1;
import b5.d0;
import b5.i0;
import b5.p0;
import b5.z;
import com.bytedance.sdk.component.vt.ouw.lh;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardItem;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionListener;
import com.google.ads.mediation.pangle.PangleMediationAdapter;
import com.google.android.gms.internal.ads.bn;
import com.google.android.gms.internal.ads.m91;
import com.google.android.gms.internal.ads.p81;
import com.google.android.gms.internal.ads.y80;
import com.google.android.gms.internal.play_billing.q;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.liuzh.deviceinfo.DeviceInfoApp;
import com.liuzh.deviceinfo.R;
import com.liuzh.deviceinfo.pro.ProActivity;
import com.liuzho.lib.ui.CardRecyclerView;
import d8.b0;
import d8.w;
import ec.g4;
import ec.k4;
import ec.o1;
import ec.q2;
import ec.u0;
import i.u;
import i.v;
import j$.util.Optional;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import o.x;
import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;
import org.json.JSONObject;
import rl.c0;
import z7.y;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class i implements WebMessageListenerBoundaryInterface, v0, PAGRewardedAdInteractionListener, si.e, s.a, f.b, si.i, w, d8.a, k4, u0, lh, p81, OnCompleteListener, x, e4.j, ej.a, km.f, km.m, l8.a, OnSuccessListener, OnFailureListener, OnCanceledListener {

    /* renamed from: a, reason: collision with root package name */
    public Object f31385a;

    public /* synthetic */ i(Object obj) {
        this.f31385a = obj;
    }

    public static void C(FrameLayout frameLayout) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams();
        marginLayoutParams.height = 0;
        marginLayoutParams.topMargin = 0;
        marginLayoutParams.bottomMargin = 0;
        frameLayout.setLayoutParams(marginLayoutParams);
        frameLayout.setVisibility(8);
    }

    public static String J(String str, String str2, String str3, String str4) {
        int iIndexOf = str2.indexOf(str3);
        return str.replace(str.substring(iIndexOf, str3.length() + iIndexOf), str4);
    }

    public void A(CardRecyclerView cardRecyclerView) {
        zh.e.a(cardRecyclerView.getContext(), cardRecyclerView);
    }

    public boolean B() {
        com.liuzh.deviceinfo.utilities.f fVar = com.liuzh.deviceinfo.utilities.f.f21256b;
        return !com.liuzh.deviceinfo.utilities.f.g();
    }

    public int D() {
        String strF = F();
        if (!TextUtils.isEmpty(strF)) {
            String lowerCase = strF.toLowerCase();
            if (lowerCase.contains("snapdragon")) {
                return R.drawable.ic_soc_qualcomm_snapdragon;
            }
            if (lowerCase.contains("kirin")) {
                return R.drawable.ic_soc_hislicon_kirin;
            }
            if (lowerCase.contains("exynos")) {
                return R.drawable.ic_soc_samsung_exynos;
            }
            if (lowerCase.contains("helio")) {
                return R.drawable.ic_soc_mediatek_helio;
            }
            if (lowerCase.contains("dimensity")) {
                return R.drawable.ic_soc_mediatek_dimensity;
            }
        }
        String strK = K();
        if (TextUtils.isEmpty(strK)) {
            return R.drawable.ic_cpu;
        }
        String lowerCase2 = strK.toLowerCase();
        return lowerCase2.contains("nvidia") ? R.drawable.ic_soc_nvidia : lowerCase2.contains("mediatek") ? R.drawable.ic_soc_mediatek : lowerCase2.contains("qualcomm") ? R.drawable.ic_soc_qualcomm : lowerCase2.contains("unisoc") ? R.drawable.ic_soc_unisoc : lowerCase2.equals("google") ? R.drawable.ic_soc_google_tensor : R.drawable.ic_cpu;
    }

    public boolean E() {
        o.f400d.getClass();
        boolean z3 = mg.d.f29372a;
        return !r0.c();
    }

    public String F() {
        return ((JSONObject) this.f31385a).optString("NAME");
    }

    public String G() {
        String strF = F();
        if (TextUtils.isEmpty(strF) || !DeviceInfoApp.f21145f.getResources().getBoolean(R.bool.is_zh_rcn)) {
            return strF;
        }
        String lowerCase = strF.toLowerCase();
        return lowerCase.contains("snapdragon") ? J(strF, lowerCase, "snapdragon", "骁龙").replace("™", "") : lowerCase.contains("dimensity") ? J(strF, lowerCase, "dimensity", "天玑") : lowerCase.contains("kirin") ? J(strF, lowerCase, "kirin", "麒麟") : lowerCase.contains("exynos") ? J(strF, lowerCase, "exynos", "猎户座") : lowerCase.contains("helio") ? J(strF, lowerCase, "helio", "曦力") : lowerCase.contains("tiger") ? J(strF, lowerCase, "tiger", "虎贲") : lowerCase.contains("kompanio") ? J(strF, lowerCase, "kompanio", "迅鲲") : lowerCase.contains("tanggula") ? J(strF, lowerCase, "tanggula", "唐古拉") : lowerCase.contains("xring") ? J(strF, lowerCase, "xring", "玄戒") : strF;
    }

    public void H(Context context) {
        ProActivity.D(context);
    }

    /* JADX WARN: Type inference failed for: r10v5, types: [eg.c] */
    public void I(Context context, Set set, final ej.a aVar) {
        t7.m mVar = new t7.m(context);
        i.b bVar = (i.b) mVar.f34474c;
        mVar.y(R.string.confirm_delete_files);
        ArrayList arrayList = new ArrayList(set);
        StringBuilder sb2 = new StringBuilder();
        int iMin = Math.min(arrayList.size(), 3);
        final int i4 = 0;
        for (int i10 = 0; i10 < iMin; i10++) {
            sb2.append(com.liuzh.deviceinfo.utilities.h.a((String) arrayList.get(i10)));
            sb2.append(" , ");
        }
        String string = sb2.toString();
        if (string.endsWith(" , ")) {
            string = string.substring(0, string.length() - 2);
        }
        final int i11 = 1;
        bVar.f25235f = iMin == arrayList.size() ? context.getString(R.string.confirm_delete_files_msg, string) : context.getString(R.string.confirm_delete_files_and_so_on_msg, string, Integer.valueOf(set.size()));
        mVar.x(android.R.string.ok, new DialogInterface.OnClickListener() { // from class: eg.b
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i12) {
                switch (i4) {
                    case 0:
                        aVar.w();
                        break;
                    default:
                        aVar.u();
                        break;
                }
            }
        });
        mVar.w(android.R.string.cancel, new DialogInterface.OnClickListener() { // from class: eg.b
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i12) {
                switch (i11) {
                    case 0:
                        aVar.w();
                        break;
                    default:
                        aVar.u();
                        break;
                }
            }
        });
        bVar.f25241n = new DialogInterface.OnCancelListener() { // from class: eg.c
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                aVar.u();
            }
        };
        mVar.A().setCanceledOnTouchOutside(false);
    }

    public String K() {
        return ((JSONObject) this.f31385a).optString("VENDOR");
    }

    public void L() {
        bn bnVar = ((eb.e) this.f31385a).f22531b;
        if (bnVar == null) {
            return;
        }
        try {
            bnVar.U3(null);
        } catch (RemoteException e2) {
            za.i.f("Unable to call setMediaContent on delegate", e2);
        }
    }

    @Override // ec.k4
    public void M(String str, String str2, Bundle bundle) {
        q2 q2Var = (q2) this.f31385a;
        if (!TextUtils.isEmpty(str)) {
            q2Var.getClass();
            throw new IllegalStateException("Unexpected call on client side");
        }
        ((o1) q2Var.f218b).f22957k.getClass();
        q2Var.G("auto", "_err", bundle, true, true, System.currentTimeMillis());
    }

    @Override // si.e
    public void a(km.o oVar) {
        ProActivity proActivity = (ProActivity) this.f31385a;
        ah.e eVar = proActivity.K;
        nk.k.e(eVar, "payCallback");
        f1 f1Var = (f1) oVar.f28445a;
        t7.g gVar = (t7.g) oVar.f28446b;
        ri.h hVar = new ri.h(f1Var, gVar, eVar);
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) f1Var.f1138f;
        copyOnWriteArrayList.add(hVar);
        km.n nVar = new km.n((char) 0, 19);
        nVar.f28442b = gVar;
        if (gVar.a() != null) {
            gVar.a().getClass();
            String str = gVar.a().f34440c;
            if (str != null) {
                nVar.f28443c = str;
            }
        }
        if (nk.k.a(gVar.f34453d, "subs")) {
            nk.k.b(null);
            if (TextUtils.isEmpty(null)) {
                throw new IllegalArgumentException("offerToken can not be empty");
            }
            nVar.f28443c = null;
        }
        ArrayList arrayList = new ArrayList(cm.g.s(new t7.b(nVar)));
        boolean zIsEmpty = arrayList.isEmpty();
        if (zIsEmpty) {
            throw new IllegalArgumentException("Details of the products must be provided.");
        }
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            if (((t7.b) obj) == null) {
                throw new IllegalArgumentException("ProductDetailsParams cannot be null.");
            }
        }
        i0 i0Var = new i0();
        i0Var.f1820a = (zIsEmpty || ((t7.b) arrayList.get(0)).f34433a.f34451b.optString("packageName").isEmpty()) ? false : true;
        boolean z3 = (TextUtils.isEmpty(null) && TextUtils.isEmpty(null)) ? false : true;
        boolean zIsEmpty2 = TextUtils.isEmpty(null);
        if (z3 && !zIsEmpty2) {
            throw new IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
        }
        i0Var.f1822c = new j6.i(16);
        i0Var.f1821b = new ArrayList();
        i0Var.f1823d = q.l(arrayList);
        t7.c cVarD = ((t7.a) f1Var.f1134b).d(proActivity, i0Var);
        nk.k.d(cVarD, "launchBillingFlow(...)");
        if (cVarD.f34435a != 0) {
            ((Handler) f1Var.f1135c).post(new ri.g(eVar, 0));
            copyOnWriteArrayList.remove(hVar);
        }
    }

    @Override // s.a
    public Object apply(Object obj) {
        z zVar = (z) this.f31385a;
        d0 d0Var = zVar.f1948v;
        return d0Var != null ? d0Var.f1769e.f21610i : zVar.U().f21610i;
    }

    @Override // ec.u0
    public /* synthetic */ void b(String str, int i4, Throwable th2, byte[] bArr, Map map) {
        ((g4) this.f31385a).A(str, i4, th2, bArr, map);
    }

    @Override // si.e
    public void c() {
        Toast.makeText((ProActivity) this.f31385a, R.string.failed_try_again_later, 0).show();
    }

    @Override // a0.v0
    public void d() {
        ((x0) this.f31385a).getClass();
    }

    @Override // o.x
    public void e(o.m mVar, boolean z3) {
        u uVar;
        v vVar = (v) this.f31385a;
        o.m mVarK = mVar.k();
        int i4 = 0;
        boolean z10 = mVarK != mVar;
        if (z10) {
            mVar = mVarK;
        }
        u[] uVarArr = vVar.L;
        int length = uVarArr != null ? uVarArr.length : 0;
        while (true) {
            if (i4 < length) {
                uVar = uVarArr[i4];
                if (uVar != null && uVar.f25356h == mVar) {
                    break;
                } else {
                    i4++;
                }
            } else {
                uVar = null;
                break;
            }
        }
        if (uVar != null) {
            if (!z10) {
                vVar.t(uVar, z3);
            } else {
                vVar.q(uVar.f25350a, uVar, mVarK);
                vVar.t(uVar, true);
            }
        }
    }

    @Override // a0.v0
    public long g(r rVar, r rVar2, r rVar3) {
        return ((x0) this.f31385a).g(rVar, rVar2, rVar3);
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_LISTENER", "WEB_MESSAGE_ARRAY_BUFFER"};
    }

    @Override // com.google.android.gms.internal.ads.p81
    /* renamed from: h */
    public /* synthetic */ void mo163h(Object obj) {
        ((y80) this.f31385a).v1((fb.o) obj);
    }

    @Override // d8.w
    public d8.v i(b0 b0Var) {
        return new d8.b(0, (AssetManager) this.f31385a, this);
    }

    @Override // a0.v0
    public r j(long j, r rVar, r rVar2, r rVar3) {
        return ((x0) this.f31385a).j(j, rVar, rVar2, rVar3);
    }

    @Override // f.b
    public void k(Object obj) {
        f.a aVar = (f.a) obj;
        b5.u0 u0Var = (b5.u0) this.f31385a;
        p0 p0Var = (p0) u0Var.G.pollFirst();
        if (p0Var == null) {
            Log.w("FragmentManager", "No IntentSenders were started for " + this);
            return;
        }
        String str = p0Var.f1849a;
        int i4 = p0Var.f1850b;
        z zVarX = u0Var.f1879c.x(str);
        if (zVarX != null) {
            zVarX.D(i4, aVar.f23581a, aVar.f23582b);
            return;
        }
        Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
    }

    @Override // km.m
    public Object l(Object obj) {
        return Optional.ofNullable(((km.m) this.f31385a).l((c0) obj));
    }

    @Override // l8.a
    public y m(y yVar, x7.h hVar) {
        Resources resources = (Resources) this.f31385a;
        if (yVar == null) {
            return null;
        }
        return new g8.c(resources, yVar);
    }

    @Override // com.google.android.gms.internal.ads.p81
    public void n(Throwable th2) {
        y80 y80Var = (y80) this.f31385a;
        String message = th2.getMessage();
        synchronized (y80Var) {
            y80Var.p1(new m91(message, 8));
        }
    }

    @Override // km.f
    public Type o() {
        return (Type) this.f31385a;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public void onAdClicked() {
        bb.x xVar = ((aa.n) this.f31385a).f295d;
        if (xVar != null) {
            xVar.h();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public void onAdDismissed() {
        bb.x xVar = ((aa.n) this.f31385a).f295d;
        if (xVar != null) {
            xVar.onAdClosed();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public void onAdShowed() {
        aa.n nVar = (aa.n) this.f31385a;
        bb.x xVar = nVar.f295d;
        if (xVar != null) {
            xVar.e();
            nVar.f295d.g();
        }
    }

    @Override // com.google.android.gms.tasks.OnCanceledListener
    public void onCanceled() {
        ((CountDownLatch) this.f31385a).countDown();
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        xk.h hVar = (xk.h) this.f31385a;
        Exception exception = task.getException();
        if (exception != null) {
            hVar.resumeWith(ci.b.h(exception));
        } else if (task.isCanceled()) {
            hVar.i(null);
        } else {
            hVar.resumeWith(task.getResult());
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        ((CountDownLatch) this.f31385a).countDown();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    @Override // org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onPostMessage(android.webkit.WebView r8, java.lang.reflect.InvocationHandler r9, android.net.Uri r10, boolean r11, java.lang.reflect.InvocationHandler r12) {
        /*
            r7 = this;
            java.lang.Class<org.chromium.support_lib_boundary.WebMessageBoundaryInterface> r0 = org.chromium.support_lib_boundary.WebMessageBoundaryInterface.class
            java.lang.Object r9 = jm.a.f(r0, r9)
            org.chromium.support_lib_boundary.WebMessageBoundaryInterface r9 = (org.chromium.support_lib_boundary.WebMessageBoundaryInterface) r9
            java.lang.reflect.InvocationHandler[] r0 = r9.getPorts()
            int r1 = r0.length
            nm.d0[] r1 = new nm.d0[r1]
            r2 = 0
        L10:
            int r3 = r0.length
            if (r2 >= r3) goto L2a
            nm.d0 r3 = new nm.d0
            r4 = r0[r2]
            r5 = 4
            r3.<init>(r5)
            java.lang.Class<org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface> r5 = org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface.class
            java.lang.Object r4 = jm.a.f(r5, r4)
            org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface r4 = (org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface) r4
            r3.f30011b = r4
            r1[r2] = r3
            int r2 = r2 + 1
            goto L10
        L2a:
            p6.b r0 = p6.l.f31387a
            boolean r0 = r0.b()
            if (r0 == 0) goto L5f
            java.lang.Class<org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface> r0 = org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface.class
            java.lang.reflect.InvocationHandler r9 = r9.getMessagePayload()
            java.lang.Object r9 = jm.a.f(r0, r9)
            org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface r9 = (org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface) r9
            int r0 = r9.getType()
            if (r0 == 0) goto L55
            r1 = 1
            if (r0 == r1) goto L4a
            r9 = 0
            r3 = r9
            goto L69
        L4a:
            o6.d r0 = new o6.d
            byte[] r9 = r9.getAsArrayBuffer()
            r0.<init>(r9)
        L53:
            r3 = r0
            goto L69
        L55:
            o6.d r0 = new o6.d
            java.lang.String r9 = r9.getAsString()
            r0.<init>(r9)
            goto L53
        L5f:
            o6.d r0 = new o6.d
            java.lang.String r9 = r9.getData()
            r0.<init>(r9)
            goto L53
        L69:
            if (r3 == 0) goto L8b
            java.lang.Class<org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface> r9 = org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface.class
            java.lang.Object r9 = jm.a.f(r9, r12)
            org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface r9 = (org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface) r9
            f7.l r12 = new f7.l
            r0 = 4
            r12.<init>(r0, r9)
            java.lang.Object r9 = r9.getOrCreatePeer(r12)
            r6 = r9
            p6.f r6 = (p6.f) r6
            java.lang.Object r9 = r7.f31385a
            r1 = r9
            o6.e r1 = (o6.e) r1
            r2 = r8
            r4 = r10
            r5 = r11
            r1.onPostMessage(r2, r3, r4, r5, r6)
        L8b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p6.i.onPostMessage(android.webkit.WebView, java.lang.reflect.InvocationHandler, android.net.Uri, boolean, java.lang.reflect.InvocationHandler):void");
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        ((CountDownLatch) this.f31385a).countDown();
    }

    @Override // com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionListener
    public void onUserEarnedReward(PAGRewardItem pAGRewardItem) {
        bb.x xVar = ((aa.n) this.f31385a).f295d;
        if (xVar != null) {
            xVar.d();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionListener
    public void onUserEarnedRewardFail(int i4, String str) {
        Log.d(PangleMediationAdapter.TAG, wb.e.m(i4, "Failed to reward user: " + str).toString());
    }

    @Override // com.bytedance.sdk.component.vt.ouw.lh
    public void ouw(IOException iOException) {
        f9.a.b((f9.a) this.f31385a, 30000, iOException.getMessage());
    }

    @Override // si.i
    public void p() {
        bh.w wVar = (bh.w) this.f31385a;
        o oVar = o.f400d;
        DeviceInfoApp deviceInfoApp = fi.a.f24058a;
        oVar.t(deviceInfoApp, 1, new o7.d(6, wVar));
        oVar.t(deviceInfoApp, 0, new bh.v(true));
    }

    @Override // a0.v0
    public r q(r rVar, r rVar2, r rVar3) {
        return ((x0) this.f31385a).q(rVar, rVar2, rVar3);
    }

    @Override // a0.v0
    public r r(long j, r rVar, r rVar2, r rVar3) {
        return ((x0) this.f31385a).r(j, rVar, rVar2, rVar3);
    }

    @Override // d8.a
    public com.bumptech.glide.load.data.d s(AssetManager assetManager, String str) {
        return new com.bumptech.glide.load.data.j(assetManager, str, 0);
    }

    @Override // e4.j
    public boolean t(float f10) {
        if (f10 == 0.0f) {
            return false;
        }
        z();
        ((NestedScrollView) this.f31385a).j((int) f10);
        return true;
    }

    @Override // o.x
    public boolean v(o.m mVar) {
        Window.Callback callback;
        v vVar = (v) this.f31385a;
        if (mVar != mVar.k() || !vVar.F || (callback = vVar.f25375l.getCallback()) == null || vVar.Q) {
            return true;
        }
        callback.onMenuOpened(108, mVar);
        return true;
    }

    @Override // ej.a
    public void w() {
        jj.i iVar = (jj.i) this.f31385a;
        xk.x.v(iVar.f27712e, null, null, new al.k(iVar, null, 10), 3);
    }

    @Override // e4.j
    public float x() {
        return -((NestedScrollView) this.f31385a).getVerticalScrollFactorCompat();
    }

    @Override // km.f
    public Object y(km.d0 d0Var) {
        km.j jVar = new km.j(d0Var);
        d0Var.c(new km.h(jVar, 1));
        return jVar;
    }

    @Override // e4.j
    public void z() {
        ((NestedScrollView) this.f31385a).f911d.abortAnimation();
    }

    public i(int i4) {
        switch (i4) {
            case 29:
                this.f31385a = new CountDownLatch(1);
                break;
            default:
                this.f31385a = new HashMap();
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x02bc A[Catch: all -> 0x02b8, TryCatch #11 {all -> 0x02b8, blocks: (B:121:0x02b4, B:125:0x02bc, B:126:0x02bf, B:128:0x02ca, B:130:0x02de), top: B:172:0x02b4 }] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02b4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x016a A[Catch: all -> 0x01cc, TryCatch #4 {all -> 0x01cc, blocks: (B:59:0x0141, B:61:0x016a, B:62:0x0170, B:85:0x01ca, B:86:0x01cb, B:95:0x01f0, B:99:0x022d, B:63:0x0171, B:74:0x019c, B:76:0x01a4, B:78:0x01ac, B:80:0x01b9, B:83:0x01c5, B:73:0x0199), top: B:160:0x0141, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01b9 A[Catch: all -> 0x01c3, TryCatch #0 {all -> 0x01c3, blocks: (B:63:0x0171, B:74:0x019c, B:76:0x01a4, B:78:0x01ac, B:80:0x01b9, B:83:0x01c5, B:73:0x0199), top: B:152:0x0171, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01d1  */
    @Override // com.bytedance.sdk.component.vt.ouw.lh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void ouw(com.bytedance.sdk.component.vt.ouw.jg r33) {
        /*
            Method dump skipped, instructions count: 816
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p6.i.ouw(com.bytedance.sdk.component.vt.ouw.jg):void");
    }

    @Override // si.i
    public void f() {
    }

    @Override // ej.a
    public void u() {
    }
}

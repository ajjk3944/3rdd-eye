package b5;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.work.impl.WorkDatabase;
import com.applovin.impl.c3;
import com.applovin.impl.c5;
import com.applovin.impl.d2;
import com.applovin.impl.d5;
import com.applovin.impl.e2;
import com.applovin.impl.f4;
import com.applovin.impl.k7;
import com.applovin.impl.l8;
import com.applovin.impl.mediation.ads.MaxAdViewImpl;
import com.applovin.impl.mediation.ads.MaxFullscreenAdImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.o8;
import com.applovin.impl.p5;
import com.applovin.impl.s4;
import com.applovin.impl.sdk.utils.ImageViewUtils;
import com.applovin.impl.t2;
import com.applovin.impl.w1;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdReviewListener;
import com.applovin.mediation.MaxError;
import com.applovin.sdk.AppLovinPostbackListener;
import com.liuzh.deviceinfo.DeviceInfoApp;
import com.liuzh.deviceinfo.R;
import com.liuzh.deviceinfo.card.CpuCard;
import com.liuzh.deviceinfo.card.DeviceOverviewCard;
import com.liuzh.deviceinfo.card.SystemInfoCard;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1776a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1777b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1778c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1779d;

    public /* synthetic */ e(Object obj, Object obj2, Object obj3, int i4) {
        this.f1776a = i4;
        this.f1777b = obj;
        this.f1778c = obj2;
        this.f1779d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        JSONObject jSONObjectOptJSONObject;
        boolean z3 = false;
        switch (this.f1776a) {
            case 0:
                ViewGroup viewGroup = (ViewGroup) this.f1777b;
                View view = (View) this.f1778c;
                g gVar = (g) this.f1779d;
                nk.k.e(viewGroup, "$container");
                nk.k.e(gVar, "this$0");
                viewGroup.endViewTransition(view);
                ((g1) gVar.f1797c.f218b).c(gVar);
                return;
            case 1:
                WorkDatabase workDatabase = (WorkDatabase) this.f1777b;
                String str = (String) this.f1778c;
                u6.r rVar = (u6.r) this.f1779d;
                b7.y yVarW = workDatabase.w();
                yVarW.getClass();
                Iterator it = ((List) com.bumptech.glide.f.r(yVarW.f2066a, true, false, new b7.c(str, 9))).iterator();
                while (it.hasNext()) {
                    c7.i.a(rVar, (String) it.next());
                }
                return;
            case 2:
                ((com.applovin.impl.adview.a) this.f1777b).a((String) this.f1778c, (String) this.f1779d);
                return;
            case 3:
                ((e2) this.f1777b).b((d2) this.f1778c, (List) this.f1779d);
                return;
            case 4:
                ((com.applovin.impl.f1) this.f1777b).a((List) this.f1778c, (u.p) this.f1779d);
                return;
            case 5:
                ((com.applovin.impl.f1) this.f1777b).b((com.applovin.impl.g1) this.f1778c, (u.p) this.f1779d);
                return;
            case 6:
                ((f4) this.f1777b).a((String) this.f1778c, (Runnable) this.f1779d);
                return;
            case 7:
                ((f4) this.f1777b).a((View) this.f1778c, (List) this.f1779d);
                return;
            case 8:
                k7.a((com.applovin.impl.sdk.k) this.f1777b, (String) this.f1778c, (com.applovin.impl.sdk.ad.b) this.f1779d);
                return;
            case 9:
                ((l8) this.f1777b).b((com.applovin.impl.sdk.network.e) this.f1778c, (AppLovinPostbackListener) this.f1779d);
                return;
            case 10:
                ((MaxAdViewImpl) this.f1777b).a((a.InterfaceC0014a) this.f1778c, (com.applovin.impl.i) this.f1779d);
                return;
            case 11:
                ((MaxFullscreenAdImpl.b) this.f1777b).a((c3) this.f1778c, (MaxAd) this.f1779d);
                return;
            case 12:
                ((MaxFullscreenAdImpl.b) this.f1777b).a((String) this.f1778c, (MaxError) this.f1779d);
                return;
            case 13:
                o8.a((WebView) this.f1777b, (String) this.f1778c, (s4) this.f1779d);
                return;
            case 14:
                ((p5) this.f1777b).b((d5) this.f1778c, (c5.a) this.f1779d);
                return;
            case 15:
                ((s4) this.f1777b).b((Executor) this.f1778c, (s4.b) this.f1779d);
                return;
            case 16:
                ((com.applovin.impl.sdk.network.b) this.f1777b).b((com.applovin.impl.sdk.network.d) this.f1778c, (AppLovinPostbackListener) this.f1779d);
                return;
            case 17:
                ImageViewUtils.a((com.applovin.impl.sdk.k) this.f1777b, (Bitmap) this.f1778c, (ImageView) this.f1779d);
                return;
            case 18:
                t2.a((MaxAdReviewListener) this.f1777b, (String) this.f1778c, (MaxAd) this.f1779d);
                return;
            case 19:
                ((w1) this.f1777b).a((com.applovin.impl.b) this.f1778c, (s4) this.f1779d);
                return;
            case 20:
                ((com.applovin.impl.z0) this.f1777b).a((com.applovin.impl.v0) this.f1778c, (Activity) this.f1779d);
                return;
            case 21:
                eg.i iVar = (eg.i) this.f1777b;
                nk.s sVar = (nk.s) this.f1778c;
                nk.t tVar = (nk.t) this.f1779d;
                if (iVar.C || t6.i0.l(iVar.n())) {
                    return;
                }
                int i4 = sVar.f29984a;
                long j = tVar.f29985a;
                if (iVar.C || t6.i0.l(iVar.n())) {
                    return;
                }
                qg.f fVar = iVar.f23466q0;
                if (fVar == null) {
                    nk.k.k("binding");
                    throw null;
                }
                fVar.f32380w.setText(wi.c.e(j));
                qg.f fVar2 = iVar.f23466q0;
                if (fVar2 != null) {
                    fVar2.g.setText(DeviceInfoApp.f21145f.getString(R.string.appa_item_count_template, Integer.valueOf(i4)));
                    return;
                } else {
                    nk.k.k("binding");
                    throw null;
                }
            case 22:
                CpuCard cpuCard = (CpuCard) this.f1777b;
                String str2 = (String) this.f1778c;
                String str3 = (String) this.f1779d;
                int i10 = CpuCard.f21169b;
                LayoutInflater layoutInflaterFrom = LayoutInflater.from(cpuCard.getContext());
                if (!TextUtils.isEmpty(str2)) {
                    cpuCard.addView(cpuCard.a(layoutInflaterFrom, R.string.struct, str2), 1);
                    z3 = true;
                }
                if (TextUtils.isEmpty(str3)) {
                    return;
                }
                cpuCard.addView(cpuCard.a(layoutInflaterFrom, R.string.cpu_fabrication, str3), z3 ? 3 : 2);
                return;
            case 23:
                aj.d dVar = (aj.d) this.f1777b;
                TextView textView = (TextView) this.f1778c;
                OutOfMemoryError outOfMemoryError = (OutOfMemoryError) this.f1779d;
                dVar.run();
                textView.setText("OutOfMemory: " + outOfMemoryError.getMessage());
                return;
            case 24:
                aj.d dVar2 = (aj.d) this.f1777b;
                TextView textView2 = (TextView) this.f1778c;
                Spanned spanned = (Spanned) this.f1779d;
                dVar2.run();
                textView2.setText(spanned);
                return;
            case 25:
                TextView textView3 = (TextView) this.f1777b;
                String str4 = (String) this.f1778c;
                TextView textView4 = (TextView) this.f1779d;
                int i11 = DeviceOverviewCard.f21172h;
                textView3.setText(str4);
                textView4.setText(str4);
                return;
            case 26:
                SystemInfoCard systemInfoCard = (SystemInfoCard) this.f1777b;
                i0 i0Var = (i0) this.f1778c;
                TextView textView5 = (TextView) this.f1779d;
                int i12 = SystemInfoCard.f21219b;
                systemInfoCard.getClass();
                if (i0Var == null) {
                    textView5.setText(R.string.unknown);
                    return;
                }
                if (!i0Var.f1820a) {
                    textView5.setText(R.string.not_supported);
                    return;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(systemInfoCard.getContext().getString(R.string.supported));
                if (((Boolean) i0Var.f1823d) != null) {
                    sb2.append("(");
                    sb2.append(systemInfoCard.getContext().getString(R.string.legacy));
                    sb2.append(")");
                }
                if (((Boolean) i0Var.f1821b) != null || ((String) i0Var.f1822c) != null) {
                    sb2.append(" (VNDK ");
                    Boolean bool = (Boolean) i0Var.f1821b;
                    if (bool != null && bool.booleanValue()) {
                        sb2.append("lite ");
                    }
                    String str5 = (String) i0Var.f1822c;
                    if (str5 != null) {
                        sb2.append(str5);
                    }
                    sb2.append(")");
                }
                textView5.setText(sb2.toString());
                return;
            case 27:
                km.o oVar = (km.o) this.f1777b;
                km.g gVar2 = (km.g) this.f1778c;
                km.v0 v0Var = (km.v0) this.f1779d;
                km.p pVar = (km.p) oVar.f28446b;
                if (pVar.f28451b.isCanceled()) {
                    gVar2.g(pVar, new IOException("Canceled"));
                    return;
                } else {
                    gVar2.p(pVar, v0Var);
                    return;
                }
            case 28:
                ((km.g) this.f1778c).g((km.p) ((km.o) this.f1777b).f28446b, (Throwable) this.f1779d);
                return;
            default:
                kf.g gVar3 = (kf.g) this.f1777b;
                String str6 = (String) this.f1778c;
                lf.c cVar = (lf.c) this.f1779d;
                km.o oVar2 = gVar3.f28271a;
                ae.b bVar = (ae.b) ((cf.b) oVar2.f28445a).get();
                if (bVar == null) {
                    return;
                }
                JSONObject jSONObject = cVar.f28750e;
                if (jSONObject.length() < 1) {
                    return;
                }
                JSONObject jSONObject2 = cVar.f28747b;
                if (jSONObject2.length() >= 1 && (jSONObjectOptJSONObject = jSONObject.optJSONObject(str6)) != null) {
                    String strOptString = jSONObjectOptJSONObject.optString("choiceId");
                    if (strOptString.isEmpty()) {
                        return;
                    }
                    synchronized (((Map) oVar2.f28446b)) {
                        try {
                            if (!strOptString.equals(((Map) oVar2.f28446b).get(str6))) {
                                ((Map) oVar2.f28446b).put(str6, strOptString);
                                Bundle bundleG = r5.c.g("arm_key", str6);
                                bundleG.putString("arm_value", jSONObject2.optString(str6));
                                bundleG.putString("personalization_id", jSONObjectOptJSONObject.optString("personalizationId"));
                                bundleG.putInt("arm_index", jSONObjectOptJSONObject.optInt("armIndex", -1));
                                bundleG.putString("group", jSONObjectOptJSONObject.optString("group"));
                                ae.c cVar2 = (ae.c) bVar;
                                cVar2.a("fp", "personalization_assignment", bundleG);
                                Bundle bundle = new Bundle();
                                bundle.putString("_fpid", strOptString);
                                cVar2.a("fp", "_fpc", bundle);
                            }
                        } finally {
                        }
                    }
                    return;
                }
                return;
        }
    }
}

package com.applovin.mediation.nativeAds.adPlacer;

import aa.j;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.f1;
import com.applovin.impl.mediation.l;
import com.google.android.gms.internal.play_billing.o;
import com.google.android.gms.internal.play_billing.q;
import com.google.android.gms.internal.play_billing.v;
import com.google.android.material.button.MaterialButton;
import com.liuzh.deviceinfo.DeviceInfoApp;
import com.liuzh.deviceinfo.R;
import com.liuzh.deviceinfo.card.CpuOverviewCard;
import com.liuzh.deviceinfo.location.RealtimeSatelliteActivity;
import com.liuzh.deviceinfo.view.kv.KvCard;
import d0.z0;
import f.b;
import f.f;
import fb.r;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import jf.c;
import jg.d;
import sh.k0;
import sh.p0;
import yb.i;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6431a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6432b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6433c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f6434d;

    public /* synthetic */ a(int i4, f1 f1Var, i iVar) {
        this.f6431a = 9;
        this.f6432b = i4;
        this.f6433c = f1Var;
        this.f6434d = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws Resources.NotFoundException {
        int i4 = this.f6431a;
        int i10 = 9;
        int i11 = 25;
        View viewInflate = null;
        int i12 = 1;
        int i13 = this.f6432b;
        Object obj = this.f6434d;
        Object obj2 = this.f6433c;
        switch (i4) {
            case 0:
                ((MaxAdPlacer) obj2).a(i13, (Collection) obj);
                break;
            case 1:
                d.i iVar = (d.i) obj2;
                Serializable serializable = (Serializable) ((c) obj).f27642b;
                String str = (String) iVar.f21597a.get(Integer.valueOf(i13));
                if (str != null) {
                    f fVar = (f) iVar.f21601e.get(str);
                    if ((fVar != null ? fVar.f23587a : null) != null) {
                        b bVar = fVar.f23587a;
                        if (iVar.f21600d.remove(str)) {
                            bVar.k(serializable);
                            break;
                        }
                    } else {
                        iVar.g.remove(str);
                        iVar.f21602f.put(str, serializable);
                        break;
                    }
                }
                break;
            case 2:
                ((d.i) obj2).a(i13, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) obj));
                break;
            case 3:
                CpuOverviewCard cpuOverviewCard = (CpuOverviewCard) obj2;
                int i14 = CpuOverviewCard.f21171q;
                ((TextView) cpuOverviewCard.findViewById(R.id.hardware)).setText(ii.a.C((String) obj));
                ((ImageView) cpuOverviewCard.findViewById(R.id.logo)).setImageResource(i13);
                break;
            case 4:
                ((jg.c) obj2).notifyItemRangeChanged(i13, ((d) obj).f27654b.size() + 1, 0);
                break;
            case 5:
                qj.a aVar = (qj.a) obj2;
                qj.a.g((TextView) aVar.f32441c.f19300f, i13, 0, new k1.b(i10, aVar, (kj.f) obj));
                break;
            case 6:
                qj.a.g((TextView) ((qj.a) obj2).f32441c.f19298d, i13, 0, (a) obj);
                break;
            case 7:
                qj.a.g((TextView) ((qj.a) obj2).f32441c.f19297c, i13, 0, (a) obj);
                break;
            case 8:
                ((r5.d) ((z0) obj2).f21914c).m(i13, obj);
                break;
            case 9:
                f1 f1Var = (f1) obj2;
                i iVar2 = (i) obj;
                String str2 = i13 == 2 ? "subs" : "inapp";
                t7.a aVar2 = (t7.a) f1Var.f1134b;
                com.applovin.impl.sdk.ad.f fVar2 = new com.applovin.impl.sdk.ad.f(16, f1Var, iVar2);
                aVar2.getClass();
                if (t7.a.h(new com.google.android.gms.internal.consent_sdk.i(aVar2, fVar2, str2), 30000L, new r(18, aVar2, fVar2), aVar2.u(), aVar2.g()) == null) {
                    t7.c cVarX = aVar2.x();
                    aVar2.B(25, 9, cVarX);
                    o oVar = q.f20213b;
                    fVar2.f(cVarX, v.f20241e);
                    break;
                }
                break;
            case 10:
                final k0 k0Var = (k0) obj2;
                final Context context = (Context) obj;
                int i15 = 0;
                final ArrayList arrayListK0 = k0Var.k0();
                final ArrayList arrayListI0 = k0.i0();
                ArrayList arrayListJ0 = k0.j0();
                final ArrayList arrayList = new ArrayList();
                int size = arrayListJ0.size();
                while (i15 < size) {
                    Object obj3 = arrayListJ0.get(i15);
                    i15++;
                    KvCard kvCard = new KvCard(context, null);
                    kvCard.setPermissionRequester(k0Var.f33709h0);
                    kvCard.b("SIM " + i12, (List) obj3);
                    arrayList.add(kvCard);
                    i12++;
                }
                final int i16 = this.f6432b;
                bi.d.b(new Runnable() { // from class: sh.g0
                    @Override // java.lang.Runnable
                    public final void run() {
                        k0 k0Var2 = k0Var;
                        if (k0Var2.c0()) {
                            return;
                        }
                        k0Var2.f33708g0.removeAllViews();
                        ArrayList arrayList2 = arrayList;
                        int size2 = arrayList2.size();
                        int i17 = 0;
                        int i18 = 0;
                        while (i18 < size2) {
                            Object obj4 = arrayList2.get(i18);
                            i18++;
                            k0Var2.f33708g0.addView((View) obj4, -1, -2);
                        }
                        if (a4.a.w()) {
                            i17 = 1;
                        } else if (a4.a.t()) {
                            i17 = 2;
                        }
                        int i19 = i16;
                        Context context2 = context;
                        ArrayList arrayList3 = arrayListK0;
                        ArrayList arrayList4 = arrayListI0;
                        if (i19 == 0) {
                            if (i17 == 0) {
                                k0Var2.f33706e0.a(context2.getString(R.string.wifi), arrayList3);
                                k0Var2.f33707f0.a(context2.getString(R.string.mobile_data), arrayList4);
                            } else if (i17 == 1) {
                                k0Var2.f33706e0.b(context2.getString(R.string.wifi), arrayList3);
                                k0Var2.f33707f0.a(context2.getString(R.string.mobile_data), arrayList4);
                            } else {
                                k0Var2.f33706e0.a(context2.getString(R.string.wifi), arrayList3);
                                k0Var2.f33707f0.b(context2.getString(R.string.mobile_data), arrayList4);
                            }
                        } else if (i19 == 1) {
                            if (i17 == 0) {
                                k0Var2.f33706e0.b(context2.getString(R.string.wifi), arrayList3);
                                k0Var2.f33707f0.a(context2.getString(R.string.mobile_data), arrayList4);
                            } else if (i17 == 1) {
                                k0Var2.f33706e0.a(context2.getString(R.string.wifi), arrayList3);
                                k0Var2.f33707f0.a(context2.getString(R.string.mobile_data), arrayList4);
                            } else {
                                k0Var2.f33706e0.b(context2.getString(R.string.wifi), arrayList3);
                                k0Var2.f33707f0.b(context2.getString(R.string.mobile_data), arrayList4);
                            }
                        } else if (i17 == 0) {
                            k0Var2.f33706e0.a(context2.getString(R.string.wifi), arrayList3);
                            k0Var2.f33707f0.b(context2.getString(R.string.mobile_data), arrayList4);
                        } else if (i17 == 1) {
                            k0Var2.f33706e0.b(context2.getString(R.string.wifi), arrayList3);
                            k0Var2.f33707f0.b(context2.getString(R.string.mobile_data), arrayList4);
                        } else {
                            k0Var2.f33706e0.a(context2.getString(R.string.wifi), arrayList3);
                            k0Var2.f33707f0.a(context2.getString(R.string.mobile_data), arrayList4);
                        }
                        k0Var2.f33714m0 = i17;
                    }
                });
                break;
            case 11:
                p0 p0Var = (p0) obj2;
                LayoutInflater layoutInflater = (LayoutInflater) obj;
                if (p0Var.f33751f0 == null) {
                    p6.i iVarQ = ii.a.q();
                    p0Var.f33751f0 = iVarQ;
                    if (iVarQ == null) {
                        bi.d.c(new bg.a(6));
                    }
                }
                vg.c cVar = new vg.c(DeviceInfoApp.f21145f);
                cVar.e();
                View viewInflate2 = layoutInflater.inflate(R.layout.item_tab_storage, (ViewGroup) p0Var.f33746a0, false);
                p0Var.h0(viewInflate2, "RAM", cVar, true);
                ((MaterialButton) viewInflate2.findViewById(R.id.btn_analyze_topend)).setVisibility(8);
                vg.c cVar2 = new vg.c(DeviceInfoApp.f21145f);
                cVar2.f();
                String string = DeviceInfoApp.f21145f.getString(R.string.system_storage);
                View viewInflate3 = layoutInflater.inflate(R.layout.item_tab_storage, (ViewGroup) p0Var.f33746a0, false);
                p0Var.h0(viewInflate3, string, cVar2, false);
                vg.c cVar3 = new vg.c(DeviceInfoApp.f21145f);
                cVar3.b();
                String string2 = DeviceInfoApp.f21145f.getString(R.string.internal_storage);
                View viewInflate4 = layoutInflater.inflate(R.layout.item_tab_storage, (ViewGroup) p0Var.f33746a0, false);
                p0Var.h0(viewInflate4, string2, cVar3, false);
                vg.c cVar4 = new vg.c(DeviceInfoApp.f21145f);
                cVar4.d();
                p0Var.f33747b0 = cVar4.f36226f;
                String string3 = DeviceInfoApp.f21145f.getString(R.string.internal_storage);
                View viewInflate5 = layoutInflater.inflate(R.layout.item_tab_storage, (ViewGroup) p0Var.f33746a0, false);
                p0Var.h0(viewInflate5, string3, cVar4, false);
                ViewGroup viewGroup = (ViewGroup) viewInflate5;
                MaterialButton materialButton = (MaterialButton) viewGroup.findViewById(R.id.btn_analyze);
                materialButton.setIconResource(R.drawable.ic_analyze);
                materialButton.setOnClickListener(new com.applovin.mediation.nativeAds.a(24, p0Var));
                materialButton.setVisibility(0);
                MaterialButton materialButton2 = (MaterialButton) viewGroup.findViewById(R.id.btn_clean);
                materialButton2.setVisibility(0);
                materialButton2.setOnClickListener(new j(13, p0Var));
                vg.c cVar5 = new vg.c(DeviceInfoApp.f21145f);
                if (cVar5.c()) {
                    String string4 = DeviceInfoApp.f21145f.getString(R.string.external_storage);
                    viewInflate = layoutInflater.inflate(R.layout.item_tab_storage, (ViewGroup) p0Var.f33746a0, false);
                    p0Var.h0(viewInflate, string4, cVar5, false);
                }
                MaterialButton materialButton3 = (MaterialButton) layoutInflater.inflate(R.layout.button_text, (ViewGroup) p0Var.f33746a0, false);
                materialButton3.setAllCaps(false);
                materialButton3.setText(R.string.view_disk_partition);
                dj.b.q(materialButton3, i13);
                materialButton3.setOnClickListener(new oi.i(4));
                bi.d.b(new l(p0Var, viewInflate2, viewGroup, viewInflate3, viewInflate4, viewInflate, materialButton3, 3));
                break;
            default:
                RealtimeSatelliteActivity realtimeSatelliteActivity = (RealtimeSatelliteActivity) obj2;
                ViewGroup viewGroup2 = (ViewGroup) obj;
                int i17 = RealtimeSatelliteActivity.S;
                View viewInflate6 = LayoutInflater.from(realtimeSatelliteActivity).inflate(R.layout.satellite_map_legend_card, viewGroup2, false);
                ((TextView) viewInflate6.findViewById(R.id.sky_legend_title)).setTextColor(i13);
                realtimeSatelliteActivity.runOnUiThread(new k1.b(i11, viewGroup2, viewInflate6));
                break;
        }
    }

    public /* synthetic */ a(Object obj, int i4, Object obj2, int i10) {
        this.f6431a = i10;
        this.f6433c = obj;
        this.f6432b = i4;
        this.f6434d = obj2;
    }

    public /* synthetic */ a(Object obj, Object obj2, int i4, int i10) {
        this.f6431a = i10;
        this.f6433c = obj;
        this.f6434d = obj2;
        this.f6432b = i4;
    }
}

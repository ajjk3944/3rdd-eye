package com.bytedance.sdk.openadsdk.component;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.bly.bly;
import com.bytedance.sdk.openadsdk.core.bly.pno;
import com.bytedance.sdk.openadsdk.core.bly.qbp;
import com.bytedance.sdk.openadsdk.core.lh.lh;
import com.bytedance.sdk.openadsdk.core.lh.vt;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.utils.osn;
import java.util.HashMap;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class vt extends lh {

    /* renamed from: lh, reason: collision with root package name */
    com.bytedance.sdk.openadsdk.component.bly.ra f8043lh;
    public com.bytedance.sdk.openadsdk.component.bly.vt ouw;
    boolean vt;
    private final com.bytedance.sdk.openadsdk.component.le.vt zih;

    public vt(Activity activity, vpp vppVar, FrameLayout frameLayout, ouw ouwVar, int i4, boolean z3, com.bytedance.sdk.openadsdk.component.pno.ouw ouwVar2, com.bytedance.sdk.openadsdk.component.le.vt vtVar) {
        super(activity, vppVar, frameLayout, ouwVar, i4, z3, ouwVar2);
        this.zih = vtVar;
    }

    @Override // com.bytedance.sdk.openadsdk.component.lh
    public final void fkw() {
        com.bytedance.sdk.openadsdk.component.bly.vt vtVar = this.ouw;
        if (vtVar != null) {
            vtVar.jg();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.lh
    public final void lh() {
        super.lh();
        com.bytedance.sdk.openadsdk.component.bly.vt vtVar = this.ouw;
        if (vtVar != null) {
            vtVar.mwh();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.lh
    public final int yu() {
        return this.ouw.getDynamicShowType();
    }

    @Override // com.bytedance.sdk.openadsdk.component.lh
    public final void vt() {
        this.ouw.ko();
    }

    @Override // com.bytedance.sdk.openadsdk.component.lh
    public final void ouw(ViewGroup viewGroup) {
        Window window = this.yu.getWindow();
        int i4 = this.tlj;
        View decorView = window.getDecorView();
        float[] fArr = {decorView.getWidth() - (decorView.getPaddingLeft() * 2), decorView.getHeight() - (decorView.getPaddingTop() * 2)};
        fArr[0] = osn.vt(window.getContext(), fArr[0]);
        float fVt = osn.vt(window.getContext(), fArr[1]);
        fArr[1] = fVt;
        if (fArr[0] < 10.0f || fVt < 10.0f) {
            ko.vt("DynamicViewUtils", "get root view size error, so run backup");
            int iVt = osn.vt(window.getContext(), osn.ouw());
            Context context = window.getContext();
            float fVt2 = osn.vt(context, osn.mwh(context));
            float fVt3 = osn.vt(context, osn.jg(context));
            if ((i4 == 1) != (fVt2 > fVt3)) {
                float f10 = fVt2 + fVt3;
                fVt3 = f10 - fVt3;
                fVt2 = f10 - fVt3;
            }
            if (i4 == 1) {
                fVt2 -= iVt;
            } else {
                fVt3 -= iVt;
            }
            fArr = new float[]{fVt3, fVt2};
        }
        float fMax = Math.max(fArr[0], fArr[1]);
        float fMin = Math.min(fArr[0], fArr[1]);
        if (i4 == 1) {
            fArr[0] = fMin;
            fArr[1] = fMax;
        } else {
            fArr[0] = fMax;
            fArr[1] = fMin;
        }
        Pair pair = new Pair(Float.valueOf(fArr[0]), Float.valueOf(fArr[1]));
        com.bytedance.sdk.openadsdk.component.bly.vt vtVar = new com.bytedance.sdk.openadsdk.component.bly.vt(this.yu, this.fkw, new AdSlot.Builder().setCodeId(String.valueOf(this.fkw.fqk())).setExpressViewAcceptedSize(((Float) pair.first).floatValue(), ((Float) pair.second).floatValue()).build(), "open_ad", this.pno, this.zih, this.ko);
        this.ouw = vtVar;
        vtVar.setTopListener(this.pno);
        this.ouw.setExpressVideoListenerProxy(this.pno);
        this.ouw.setExpressInteractionListener(new PAGExpressAdWrapperListener() { // from class: com.bytedance.sdk.openadsdk.component.vt.1
            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public final void onRenderFail(View view, String str, int i10) {
                vt.this.pno.le();
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public final void onRenderSuccess(View view, float f11, float f12) {
                if (vt.this.ouw.zih()) {
                    vt vtVar2 = vt.this;
                    vtVar2.vt = true;
                    com.bytedance.sdk.openadsdk.component.bly.ra raVar = vtVar2.f8043lh;
                    if (raVar != null && vtVar2.ra == raVar.getParent()) {
                        vt vtVar3 = vt.this;
                        vtVar3.ra.removeView(vtVar3.f8043lh);
                    }
                    vt vtVar4 = vt.this;
                    vt.super.ouw((ViewGroup) vtVar4.ra);
                    vt.super.ouw();
                    vt.super.vt();
                    return;
                }
                if (vt.this.fkw.ra()) {
                    vt.this.pno.fkw();
                    return;
                }
                vt vtVar5 = vt.this;
                if (!vtVar5.f7894le) {
                    vtVar5.pno.fkw();
                } else {
                    if (!vtVar5.ouw(vtVar5.ouw.getVideoFrameLayout())) {
                        vt.this.pno.le();
                        return;
                    }
                    vt vtVar6 = vt.this;
                    vtVar6.ouw.setVideoManager(vtVar6.rn);
                    vt.this.pno.fkw();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
            public final void onAdClicked() {
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public final void onAdDismissed() {
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public final void onAdShow(View view, int i10) {
            }
        });
        this.fkw.yw = 1;
        this.ra.addView(this.ouw, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.component.bly.ra raVar = new com.bytedance.sdk.openadsdk.component.bly.ra(this.yu);
        this.f8043lh = raVar;
        this.ra.addView(raVar);
        this.ryl = this.f8043lh.getTopDislike();
        this.mwh = this.f8043lh.getTopSkip();
        this.f7893jg = this.f8043lh.getTopCountDown();
    }

    @Override // com.bytedance.sdk.openadsdk.component.lh
    public final void ouw() {
        final vpp vppVar = this.fkw;
        final Activity activity = this.yu;
        final com.bytedance.sdk.openadsdk.component.pno.ouw ouwVar = this.ko;
        com.bytedance.sdk.openadsdk.component.bly.vt vtVar = this.ouw;
        final String str = "open_ad";
        bly blyVar = new bly(activity, vppVar, str) { // from class: com.bytedance.sdk.openadsdk.component.ouw.vt.1
            final /* synthetic */ com.bytedance.sdk.openadsdk.component.pno.ouw ouw;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(final Context activity2, final vpp vppVar2, final String str2, final com.bytedance.sdk.openadsdk.component.pno.ouw ouwVar2) {
                super(activity2, vppVar2, str2, 4);
                ouwVar = ouwVar2;
            }

            @Override // com.bytedance.sdk.openadsdk.core.lh.vt, com.bytedance.sdk.openadsdk.core.lh.lh
            public final void ouw(View view, float f10, float f11, float f12, float f13, SparseArray<lh.ouw> sparseArray, boolean z3) {
                HashMap map = new HashMap();
                map.put("duration", Long.valueOf(ouwVar.vt));
                ouw(map);
                super.ouw(view, f10, f11, f12, f13, sparseArray, z3);
            }
        };
        blyVar.ouw(vtVar);
        com.bytedance.sdk.openadsdk.component.ouw.vt.ouw(activity2.getApplicationContext(), vppVar2, blyVar);
        com.bytedance.sdk.openadsdk.component.ouw.vt.ouw(blyVar, vppVar2);
        blyVar.ouw(new vt.ouw() { // from class: com.bytedance.sdk.openadsdk.component.vt.2
            @Override // com.bytedance.sdk.openadsdk.core.lh.vt.ouw
            public final void ouw(View view, int i4) {
                vt.this.pno.ra();
            }
        });
        this.ouw.setClickListener(blyVar);
        final vpp vppVar2 = this.fkw;
        Activity activity2 = this.yu;
        final com.bytedance.sdk.openadsdk.component.pno.ouw ouwVar2 = this.ko;
        com.bytedance.sdk.openadsdk.component.bly.vt vtVar2 = this.ouw;
        final Context applicationContext = activity2.getApplicationContext();
        pno pnoVar = new pno(applicationContext, vppVar2, str2) { // from class: com.bytedance.sdk.openadsdk.component.ouw.vt.2
            final /* synthetic */ com.bytedance.sdk.openadsdk.component.pno.ouw ouw;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(final Context applicationContext2, final vpp vppVar22, final String str2, final com.bytedance.sdk.openadsdk.component.pno.ouw ouwVar22) {
                super(applicationContext2, vppVar22, str2, 4);
                ouwVar = ouwVar22;
            }

            @Override // com.bytedance.sdk.openadsdk.core.lh.ouw, com.bytedance.sdk.openadsdk.core.lh.vt, com.bytedance.sdk.openadsdk.core.lh.lh
            public final void ouw(View view, float f10, float f11, float f12, float f13, SparseArray<lh.ouw> sparseArray, boolean z3) {
                HashMap map = new HashMap();
                map.put("duration", Long.valueOf(ouwVar.vt));
                ouw(map);
                super.ouw(view, f10, f11, f12, f13, sparseArray, z3);
            }
        };
        pnoVar.ouw((View) vtVar2);
        com.bytedance.sdk.openadsdk.component.ouw.vt.ouw(activity2.getApplicationContext(), vppVar22, pnoVar);
        com.bytedance.sdk.openadsdk.component.ouw.vt.ouw(pnoVar, vppVar22);
        this.ouw.setClickCreativeListener(pnoVar);
        pnoVar.ouw(new vt.ouw() { // from class: com.bytedance.sdk.openadsdk.component.vt.3
            @Override // com.bytedance.sdk.openadsdk.core.lh.vt.ouw
            public final void ouw(View view, int i4) {
                vt.this.pno.ra();
            }
        });
        le();
        this.ouw.setBackupListener(new com.bytedance.sdk.component.adexpress.vt.lh() { // from class: com.bytedance.sdk.openadsdk.component.vt.4
            @Override // com.bytedance.sdk.component.adexpress.vt.lh
            public final boolean ouw(ViewGroup viewGroup) {
                ko.ouw("AppOpenAdExpressManager", "open_ad", "isUseBackup() called with: view = [" + viewGroup + "], errCode = [0]");
                try {
                    ((qbp) viewGroup).rn();
                    com.bytedance.sdk.openadsdk.component.bly.ouw ouwVar3 = new com.bytedance.sdk.openadsdk.component.bly.ouw(vt.this.yu);
                    com.bytedance.sdk.openadsdk.component.bly.vt vtVar3 = vt.this.ouw;
                    ouwVar3.ouw = vtVar3;
                    vtVar3.addView(ouwVar3, new FrameLayout.LayoutParams(-1, -1));
                    return true;
                } catch (Exception e2) {
                    Log.e("AppOpenAdExpressManager", "", e2);
                    return false;
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.component.lh
    public final void ouw(int i4, boolean z3) {
        super.ouw(i4, z3);
    }

    @Override // com.bytedance.sdk.openadsdk.component.lh
    public final JSONObject ouw(JSONObject jSONObject) {
        return this.ouw.ouw(jSONObject, this.fkw);
    }
}

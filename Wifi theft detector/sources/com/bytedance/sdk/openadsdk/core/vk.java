package com.bytedance.sdk.openadsdk.core;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoMediaView;
import com.bytedance.sdk.openadsdk.core.uym;
import com.bytedance.sdk.openadsdk.core.xq.xq;
import com.bytedance.sdk.openadsdk.core.xq.ypw;
import com.bytedance.sdk.openadsdk.utils.ra;
import com.bytedance.sdk.openadsdk.utils.vw;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import s2.b;

/* loaded from: classes.dex */
public class vk {
    private final PAGNativeAd dg;
    private final com.bytedance.sdk.openadsdk.core.model.rie emc;
    private b gbl;
    private long msw;
    private com.bytedance.sdk.openadsdk.core.xq.emc qh;
    private final com.bytedance.sdk.openadsdk.emc.ypw.emc ru;
    private com.bytedance.sdk.openadsdk.core.xq.ypw sz;
    private com.bytedance.sdk.openadsdk.emc.ypw.ycc uym;
    private final Context xq;
    private final String ycc;
    private com.bytedance.sdk.openadsdk.ul.emc.emc.xq ypw;
    private List<View> bw = new ArrayList();
    private final com.bytedance.sdk.openadsdk.dg.uym zz = new com.bytedance.sdk.openadsdk.dg.uym();
    private final AtomicBoolean sup = new AtomicBoolean(false);

    public static class emc implements View.OnLayoutChangeListener {
        private final com.bytedance.sdk.openadsdk.dg.uym emc;
        private final ViewGroup ypw;

        public emc(com.bytedance.sdk.openadsdk.dg.uym uymVar, ViewGroup viewGroup) {
            this.emc = uymVar;
            this.ypw = viewGroup;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            this.emc.emc(System.currentTimeMillis(), mkp.emc(this.ypw));
        }
    }

    public vk(Context context, PAGNativeAd pAGNativeAd, com.bytedance.sdk.openadsdk.core.model.rie rieVar, String str, com.bytedance.sdk.openadsdk.emc.ypw.emc emcVar) {
        this.dg = pAGNativeAd;
        this.emc = rieVar;
        this.xq = context;
        this.ycc = str;
        this.ru = emcVar;
        if (rieVar.sx() == 4) {
            this.ypw = com.bytedance.sdk.openadsdk.ul.emc.emc.dg.emc(context, str);
        }
    }

    private uym bw(ViewGroup viewGroup) {
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt instanceof uym) {
                return (uym) childAt;
            }
        }
        return null;
    }

    private void dg(ViewGroup viewGroup) throws JSONException {
        com.bytedance.sdk.openadsdk.core.model.rie rieVar;
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.bw != null) {
                JSONArray jSONArray = new JSONArray();
                for (View view : this.bw) {
                    if (view != null) {
                        JSONObject jSONObject2 = new JSONObject();
                        try {
                            jSONObject2.put("width", view.getWidth());
                            jSONObject2.put("height", view.getHeight());
                            jSONObject2.put("alpha", view.getAlpha());
                        } catch (Throwable unused) {
                        }
                        jSONArray.put(jSONObject2);
                    }
                }
                jSONObject.put("image_view", jSONArray.toString());
            }
            if (viewGroup != null) {
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("width", viewGroup.getWidth());
                    jSONObject3.put("height", viewGroup.getHeight());
                    jSONObject3.put("alpha", viewGroup.getAlpha());
                } catch (Throwable unused2) {
                }
                jSONObject.put("root_view", jSONObject3.toString());
            }
            if (this.ru.msw() != null) {
                JSONObject jSONObject4 = new JSONObject();
                try {
                    jSONObject4.put("width", vw.xq(this.xq, r11.getWidth()) * 1.0f);
                    jSONObject4.put("height", vw.xq(this.xq, r11.getHeight()) * 1.0f);
                } catch (Throwable unused3) {
                }
                jSONObject.put("media_view", jSONObject4.toString());
            }
            com.bytedance.sdk.openadsdk.core.zz.ul ulVarYpw = this.ru.ypw();
            if (ulVarYpw != null && (rieVar = this.emc) != null) {
                jSONObject.put("dynamic_show_type", rieVar.ej());
                ulVarYpw.emc(jSONObject, this.emc);
            }
            com.bytedance.sdk.openadsdk.dg.xq.emc(this.emc, this.ycc, jSONObject, (JSONObject) null);
            com.bytedance.sdk.openadsdk.ee.emc.xq.emc(this.emc);
        } catch (JSONException e10) {
            com.bytedance.sdk.component.utils.ul.emc("InteractionManager", "onShowFun json error", e10);
        }
    }

    private uym xq(@NonNull ViewGroup viewGroup, List<View> list, List<View> list2, @Nullable List<View> list3, com.bytedance.sdk.openadsdk.emc.ypw.ycc yccVar) {
        this.uym = yccVar;
        viewGroup.addOnLayoutChangeListener(new emc(this.zz, viewGroup));
        this.bw = list;
        uym uymVarBw = bw(viewGroup);
        if (uymVarBw == null) {
            uymVarBw = new uym(this.xq, viewGroup, false);
            viewGroup.addView(uymVarBw);
        }
        uymVarBw.emc();
        uymVarBw.setRefClickViews(list2);
        if (list != null) {
            for (View view : this.bw) {
                if (view != null) {
                    view.setTag(520093762, Boolean.TRUE);
                }
            }
            if (list3 != null) {
                list3.addAll(list);
            }
        }
        uymVarBw.setRefCreativeViews(list3);
        return uymVarBw;
    }

    private void ypw(@NonNull ViewGroup viewGroup, List<View> list, List<View> list2, @Nullable List<View> list3, com.bytedance.sdk.openadsdk.emc.ypw.ycc yccVar) {
        this.uym = yccVar;
        viewGroup.addOnLayoutChangeListener(new emc(this.zz, viewGroup));
        this.bw = list;
        emc(list2, (com.bytedance.sdk.openadsdk.core.xq.xq) null);
        if (list != null) {
            for (View view : this.bw) {
                if (view != null) {
                    view.setTag(520093762, Boolean.TRUE);
                }
            }
            if (list3 != null) {
                list3.addAll(list);
            }
        }
        emc(list3, (com.bytedance.sdk.openadsdk.core.xq.xq) null);
    }

    public com.bytedance.sdk.openadsdk.dg.uym emc() {
        return this.zz;
    }

    public void emc(View view, int i10) {
        com.bytedance.sdk.openadsdk.emc.ypw.ycc yccVar = this.uym;
        if (yccVar != null) {
            yccVar.onAdClicked();
        }
    }

    public void emc(@NonNull ViewGroup viewGroup, List<View> list, List<View> list2, @Nullable List<View> list3, com.bytedance.sdk.openadsdk.emc.ypw.ycc yccVar) {
        ypw(viewGroup, list, list2, list3, yccVar);
        emc(viewGroup);
        emc(viewGroup, list2, list3);
    }

    private void ypw(com.bytedance.sdk.openadsdk.core.xq.ypw ypwVar, com.bytedance.sdk.openadsdk.core.xq.emc emcVar) {
        com.bytedance.sdk.openadsdk.emc.ypw.emc emcVar2 = this.ru;
        if (emcVar2 != null && emcVar2.ypw() != null) {
            com.bytedance.sdk.openadsdk.core.zz.ul ulVarYpw = this.ru.ypw();
            if ((ypwVar instanceof com.bytedance.sdk.openadsdk.core.zz.zz) && (emcVar instanceof com.bytedance.sdk.openadsdk.core.zz.msw)) {
                ulVarYpw.setClickListener((com.bytedance.sdk.openadsdk.core.zz.zz) ypwVar);
                ulVarYpw.setClickCreativeListener((com.bytedance.sdk.openadsdk.core.zz.msw) emcVar);
            }
            ulVarYpw.setJsbLandingPageOpenListener(new com.bytedance.sdk.openadsdk.core.widget.bw() { // from class: com.bytedance.sdk.openadsdk.core.vk.3
                @Override // com.bytedance.sdk.openadsdk.core.widget.bw
                public void emc() {
                    if (vk.this.uym != null) {
                        vk.this.uym.onAdClicked();
                    }
                }
            });
        }
        com.bytedance.sdk.openadsdk.emc.ypw.emc emcVar3 = this.ru;
        if (emcVar3 != null && emcVar3.emc() != null) {
            this.ru.emc().setOnClickListener(emcVar);
            this.ru.emc().setOnTouchListener(emcVar);
        }
        com.bytedance.sdk.openadsdk.emc.ypw.emc emcVar4 = this.ru;
        if (emcVar4 != null) {
            emcVar4.emc(emcVar);
            this.ru.emc(ypwVar);
        }
    }

    private void emc(List<View> list, com.bytedance.sdk.openadsdk.core.xq.xq xqVar) {
        if (com.bytedance.sdk.component.utils.sz.ypw(list)) {
            for (View view : list) {
                if (view != null) {
                    view.setOnClickListener(xqVar);
                    view.setOnTouchListener(xqVar);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void xq(ViewGroup viewGroup) {
        this.zz.emc(System.currentTimeMillis(), mkp.emc(viewGroup));
    }

    public void emc(b bVar) {
        this.gbl = bVar;
        com.bytedance.sdk.openadsdk.core.xq.ypw ypwVar = this.sz;
        if (ypwVar != null) {
            ypwVar.emc(bVar);
        }
        com.bytedance.sdk.openadsdk.core.xq.emc emcVar = this.qh;
        if (emcVar != null) {
            emcVar.emc(bVar);
        }
    }

    private void emc(@NonNull ViewGroup viewGroup) {
        HashMap map = new HashMap();
        map.put("click_scence", 1);
        Context contextEmc = viewGroup != null ? com.bytedance.sdk.component.utils.ypw.emc(viewGroup) : null;
        if (contextEmc == null) {
            contextEmc = this.xq;
        }
        if (this.emc.yid() == 2) {
            com.bytedance.sdk.openadsdk.core.model.rie rieVar = this.emc;
            String str = this.ycc;
            this.sz = new com.bytedance.sdk.openadsdk.core.zz.zz(contextEmc, rieVar, str, com.bytedance.sdk.openadsdk.utils.tp.emc(str));
        } else {
            com.bytedance.sdk.openadsdk.core.model.rie rieVar2 = this.emc;
            String str2 = this.ycc;
            this.sz = new com.bytedance.sdk.openadsdk.core.xq.ypw(contextEmc, rieVar2, str2, com.bytedance.sdk.openadsdk.utils.tp.emc(str2));
        }
        this.sz.emc(viewGroup);
        this.sz.emc(this.gbl);
        this.sz.emc(this.ypw);
        this.sz.emc(this.dg);
        this.sz.emc(map);
        this.sz.emc(new ypw.emc() { // from class: com.bytedance.sdk.openadsdk.core.vk.1
            @Override // com.bytedance.sdk.openadsdk.core.xq.ypw.emc
            public void emc(View view, int i10) {
                if (vk.this.uym != null) {
                    vk.this.uym.onAdClicked();
                }
            }
        });
        if (this.emc.yid() == 2) {
            Context context = this.xq;
            com.bytedance.sdk.openadsdk.core.model.rie rieVar3 = this.emc;
            String str3 = this.ycc;
            this.qh = new com.bytedance.sdk.openadsdk.core.zz.msw(context, rieVar3, str3, com.bytedance.sdk.openadsdk.utils.tp.emc(str3));
        } else {
            Context context2 = this.xq;
            com.bytedance.sdk.openadsdk.core.model.rie rieVar4 = this.emc;
            String str4 = this.ycc;
            this.qh = new com.bytedance.sdk.openadsdk.core.xq.emc(context2, rieVar4, str4, com.bytedance.sdk.openadsdk.utils.tp.emc(str4));
        }
        this.qh.emc(viewGroup);
        this.qh.emc(this.gbl);
        this.qh.emc(this.ypw);
        this.qh.emc(this.dg);
        this.qh.emc(map);
        this.qh.emc(new ypw.emc() { // from class: com.bytedance.sdk.openadsdk.core.vk.2
            @Override // com.bytedance.sdk.openadsdk.core.xq.ypw.emc
            public void emc(View view, int i10) {
                if (vk.this.uym != null) {
                    vk.this.uym.onAdClicked();
                }
                com.bytedance.sdk.openadsdk.ee.ypw.bw.emc(vk.this.emc, 9);
                vk.this.ru.sz();
            }
        });
    }

    private void ypw(final ViewGroup viewGroup) {
        ra.emc(viewGroup, true, 5, false, new ra.ypw() { // from class: com.bytedance.sdk.openadsdk.core.vk.6
            @Override // com.bytedance.sdk.openadsdk.utils.ra.ypw
            public void emc(boolean z10) {
                vk.this.emc(z10, viewGroup);
            }

            @Override // com.bytedance.sdk.openadsdk.utils.ra.ypw
            public void ypw() {
                vk.this.ypw();
            }

            @Override // com.bytedance.sdk.openadsdk.utils.ra.ypw
            public void emc() {
                vk.this.xq(viewGroup);
            }

            @Override // com.bytedance.sdk.openadsdk.utils.ra.ypw
            public void emc(View view, boolean z10) throws JSONException {
                if (!z10) {
                    com.bytedance.sdk.openadsdk.ee.emc.xq.emc(vk.this.emc, 8);
                } else {
                    com.bytedance.sdk.openadsdk.ee.emc.xq.emc(vk.this.emc, 4);
                    vk.this.emc(viewGroup, view);
                }
            }
        }, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ypw() {
        if (this.msw > 0) {
            com.bytedance.sdk.openadsdk.dg.xq.emc(String.valueOf(SystemClock.elapsedRealtime() - this.msw), this.emc, this.ycc, this.zz);
            this.msw = 0L;
        }
    }

    private void emc(@NonNull ViewGroup viewGroup, uym uymVar, List<View> list, @Nullable List<View> list2) {
        com.bytedance.sdk.openadsdk.core.xq.ypw ypwVar = this.sz;
        if (ypwVar == null || this.qh == null) {
            return;
        }
        uymVar.emc(list, ypwVar);
        uymVar.emc(list2, this.qh);
        emc(this.sz, this.qh);
        emc(uymVar, viewGroup);
    }

    private void emc(@NonNull ViewGroup viewGroup, List<View> list, @Nullable List<View> list2) {
        com.bytedance.sdk.openadsdk.core.xq.ypw ypwVar = this.sz;
        if (ypwVar == null || this.qh == null) {
            return;
        }
        emc(list, ypwVar);
        emc(list2, this.qh);
        emc(this.sz, this.qh);
        ypw(viewGroup);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void emc(com.bytedance.sdk.openadsdk.core.xq.ypw ypwVar, com.bytedance.sdk.openadsdk.core.xq.emc emcVar) {
        if (this.emc.yid() == 2) {
            ypw(ypwVar, emcVar);
        } else {
            emc(emcVar);
        }
    }

    private void emc(com.bytedance.sdk.openadsdk.core.xq.emc emcVar) {
        if (com.bytedance.sdk.openadsdk.core.settings.gbl.xq().dg(String.valueOf(this.emc.tx()))) {
            com.bytedance.sdk.openadsdk.emc.ypw.emc emcVar2 = this.ru;
            if (emcVar2 != null && emcVar2.emc() != null) {
                this.ru.emc().setOnClickListener(emcVar);
                this.ru.emc().setOnTouchListener(emcVar);
            }
            com.bytedance.sdk.openadsdk.emc.ypw.emc emcVar3 = this.ru;
            if (emcVar3 != null) {
                emcVar3.emc(emcVar);
                return;
            }
            return;
        }
        com.bytedance.sdk.openadsdk.emc.ypw.emc emcVar4 = this.ru;
        if (emcVar4 != null && emcVar4.emc() != null) {
            PAGMediaView pAGMediaViewEmc = this.ru.emc();
            com.bytedance.sdk.openadsdk.core.xq.xq xqVar = new com.bytedance.sdk.openadsdk.core.xq.xq() { // from class: com.bytedance.sdk.openadsdk.core.vk.4
                @Override // com.bytedance.sdk.openadsdk.core.xq.xq
                public void emc(View view, float f10, float f11, float f12, float f13, SparseArray<xq.emc> sparseArray, boolean z10) {
                    if (view instanceof PAGVideoMediaView) {
                        ((PAGVideoMediaView) view).handleInterruptVideo();
                    }
                }
            };
            pAGMediaViewEmc.setOnClickListener(xqVar);
            pAGMediaViewEmc.setOnTouchListener(xqVar);
        }
        com.bytedance.sdk.openadsdk.emc.ypw.emc emcVar5 = this.ru;
        if (emcVar5 != null) {
            emcVar5.emc((com.bytedance.sdk.openadsdk.core.xq.emc) null);
        }
    }

    private void emc(uym uymVar, final ViewGroup viewGroup) {
        uymVar.setCallback(new uym.emc() { // from class: com.bytedance.sdk.openadsdk.core.vk.5
            @Override // com.bytedance.sdk.openadsdk.core.uym.emc
            public void emc(boolean z10) {
                vk.this.emc(z10, viewGroup);
            }

            @Override // com.bytedance.sdk.openadsdk.core.uym.emc
            public void ypw() {
                vk.this.ypw();
            }

            @Override // com.bytedance.sdk.openadsdk.core.uym.emc
            public void emc() {
                vk.this.xq(viewGroup);
            }

            @Override // com.bytedance.sdk.openadsdk.core.uym.emc
            public void emc(View view) throws JSONException {
                vk.this.emc(viewGroup, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void emc(boolean z10, ViewGroup viewGroup) {
        if (z10 && this.emc.pdv() && !this.emc.sb()) {
            this.emc.ycc(true);
            com.bytedance.sdk.openadsdk.core.model.rie rieVar = this.emc;
            com.bytedance.sdk.openadsdk.dg.xq.emc(rieVar, this.ycc, rieVar.du());
        }
        if (!z10 && this.msw > 0) {
            String strValueOf = String.valueOf(SystemClock.elapsedRealtime() - this.msw);
            this.zz.emc(System.currentTimeMillis(), mkp.emc(viewGroup));
            com.bytedance.sdk.openadsdk.dg.xq.emc(strValueOf, this.emc, this.ycc, this.zz);
            this.msw = 0L;
            return;
        }
        this.zz.emc(System.currentTimeMillis(), mkp.emc(viewGroup));
        this.msw = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void emc(ViewGroup viewGroup, View view) throws JSONException {
        com.bytedance.sdk.openadsdk.core.sup.dg dgVarEmc;
        if (this.sup.get()) {
            return;
        }
        this.sup.set(true);
        if (this.dg instanceof com.bytedance.sdk.openadsdk.emc.ypw.emc.xq) {
            com.bytedance.sdk.openadsdk.core.zz.ul ulVarYpw = this.ru.ypw();
            if (ulVarYpw != null) {
                ulVarYpw.sba();
            }
            ((com.bytedance.sdk.openadsdk.emc.ypw.emc.xq) this.dg).emc(true);
        }
        this.zz.emc(System.currentTimeMillis(), mkp.emc(viewGroup));
        this.msw = SystemClock.elapsedRealtime();
        dg(viewGroup);
        com.bytedance.sdk.openadsdk.emc.ypw.ycc yccVar = this.uym;
        if (yccVar != null) {
            yccVar.emc(this.dg);
        }
        if (this.emc.dsx()) {
            com.bytedance.sdk.openadsdk.utils.tp.emc(this.emc, view);
        }
        com.bytedance.sdk.openadsdk.core.model.dg dgVarEh = this.emc.eh();
        if (dgVarEh == null || (dgVarEmc = dgVarEh.emc()) == null) {
            return;
        }
        dgVarEmc.emc(0L);
    }
}

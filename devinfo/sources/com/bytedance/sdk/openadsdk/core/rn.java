package com.bytedance.sdk.openadsdk.core;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import b9.e;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoMediaView;
import com.bytedance.sdk.openadsdk.core.lh.lh;
import com.bytedance.sdk.openadsdk.core.lh.vt;
import com.bytedance.sdk.openadsdk.core.ra;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class rn {
    private final PAGNativeAd bly;

    /* renamed from: cf, reason: collision with root package name */
    private final String f8386cf;
    public com.bytedance.sdk.openadsdk.core.lh.vt fkw;

    /* renamed from: le, reason: collision with root package name */
    public com.bytedance.sdk.openadsdk.core.lh.ouw f8388le;
    private e mwh;
    final com.bytedance.sdk.openadsdk.core.model.vpp ouw;
    private final Context pno;
    private com.bytedance.sdk.openadsdk.qbp.ouw.ouw.lh ra;
    private long ryl;
    public com.bytedance.sdk.openadsdk.ouw.vt.le vt;
    final com.bytedance.sdk.openadsdk.ouw.vt.ouw yu;
    private List<View> tlj = new ArrayList();

    /* renamed from: lh, reason: collision with root package name */
    public final com.bytedance.sdk.openadsdk.yu.ra f8389lh = new com.bytedance.sdk.openadsdk.yu.ra();

    /* renamed from: jg, reason: collision with root package name */
    private final AtomicBoolean f8387jg = new AtomicBoolean(false);

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    /* renamed from: com.bytedance.sdk.openadsdk.core.rn$5, reason: invalid class name */
    public class AnonymousClass5 implements ra.ouw {
        final /* synthetic */ ViewGroup ouw;

        public AnonymousClass5(ViewGroup viewGroup) {
            this.ouw = viewGroup;
        }

        @Override // com.bytedance.sdk.openadsdk.core.ra.ouw
        public final void ouw(boolean z3) {
            rn.ouw(rn.this, z3, this.ouw);
        }

        @Override // com.bytedance.sdk.openadsdk.core.ra.ouw
        public final void vt() {
            rn.ouw(rn.this);
        }

        @Override // com.bytedance.sdk.openadsdk.core.ra.ouw
        public final void ouw() {
            rn.ouw(rn.this, this.ouw);
        }

        @Override // com.bytedance.sdk.openadsdk.core.ra.ouw
        public final void ouw(View view) throws JSONException {
            rn.vt(rn.this, this.ouw);
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class ouw implements View.OnLayoutChangeListener {
        private final com.bytedance.sdk.openadsdk.yu.ra ouw;
        private final ViewGroup vt;

        public ouw(com.bytedance.sdk.openadsdk.yu.ra raVar, ViewGroup viewGroup) {
            this.ouw = raVar;
            this.vt = viewGroup;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i4, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
            this.ouw.ouw(System.currentTimeMillis(), fak.ouw(this.vt));
        }
    }

    public rn(Context context, PAGNativeAd pAGNativeAd, com.bytedance.sdk.openadsdk.core.model.vpp vppVar, String str, com.bytedance.sdk.openadsdk.ouw.vt.ouw ouwVar) {
        this.bly = pAGNativeAd;
        this.ouw = vppVar;
        this.pno = context;
        this.f8386cf = str;
        this.yu = ouwVar;
        if (vppVar.f8305pd == 4) {
            this.ra = com.bytedance.sdk.openadsdk.qbp.ouw.ouw.yu.ouw(context, str);
        }
    }

    public final void ouw(ViewGroup viewGroup, List<View> list, List<View> list2, List<View> list3, com.bytedance.sdk.openadsdk.ouw.vt.le leVar) {
        this.vt = leVar;
        viewGroup.addOnLayoutChangeListener(new ouw(this.f8389lh, viewGroup));
        this.tlj = list;
        ouw(list2, (com.bytedance.sdk.openadsdk.core.lh.lh) null);
        if (list != null) {
            for (View view : this.tlj) {
                if (view != null) {
                    view.setTag(520093762, Boolean.TRUE);
                }
            }
            if (list3 != null) {
                list3.addAll(list);
            }
        }
        ouw(list3, (com.bytedance.sdk.openadsdk.core.lh.lh) null);
    }

    public final ra vt(ViewGroup viewGroup, List<View> list, List<View> list2, List<View> list3, com.bytedance.sdk.openadsdk.ouw.vt.le leVar) {
        ra raVar;
        this.vt = leVar;
        viewGroup.addOnLayoutChangeListener(new ouw(this.f8389lh, viewGroup));
        this.tlj = list;
        int i4 = 0;
        while (true) {
            if (i4 >= viewGroup.getChildCount()) {
                raVar = null;
                break;
            }
            View childAt = viewGroup.getChildAt(i4);
            if (childAt instanceof ra) {
                raVar = (ra) childAt;
                break;
            }
            i4++;
        }
        if (raVar == null) {
            raVar = new ra(viewGroup, false);
            viewGroup.addView(raVar);
        }
        ra.ouw(raVar.ouw, (com.bytedance.sdk.openadsdk.core.lh.lh) null);
        ra.ouw(raVar.vt, (com.bytedance.sdk.openadsdk.core.lh.lh) null);
        raVar.setRefClickViews(list2);
        if (list != null) {
            for (View view : this.tlj) {
                if (view != null) {
                    view.setTag(520093762, Boolean.TRUE);
                }
            }
            if (list3 != null) {
                list3.addAll(list);
            }
        }
        raVar.setRefCreativeViews(list3);
        return raVar;
    }

    public static void ouw(List<View> list, com.bytedance.sdk.openadsdk.core.lh.lh lhVar) {
        if (com.bytedance.sdk.component.utils.mwh.ouw(list)) {
            for (View view : list) {
                if (view != null) {
                    view.setOnClickListener(lhVar);
                    view.setOnTouchListener(lhVar);
                }
            }
        }
    }

    public final void ouw(e eVar) {
        this.mwh = eVar;
        com.bytedance.sdk.openadsdk.core.lh.vt vtVar = this.fkw;
        if (vtVar != null) {
            vtVar.ouw(eVar);
        }
        com.bytedance.sdk.openadsdk.core.lh.ouw ouwVar = this.f8388le;
        if (ouwVar != null) {
            ouwVar.ouw(eVar);
        }
    }

    private void vt(com.bytedance.sdk.openadsdk.core.lh.vt vtVar, com.bytedance.sdk.openadsdk.core.lh.ouw ouwVar) {
        PAGMediaView pAGMediaView;
        com.bytedance.sdk.openadsdk.core.bly.qbp qbpVar;
        com.bytedance.sdk.openadsdk.ouw.vt.ouw ouwVar2 = this.yu;
        if (ouwVar2 != null && (qbpVar = ouwVar2.ra) != null) {
            if ((vtVar instanceof com.bytedance.sdk.openadsdk.core.bly.bly) && (ouwVar instanceof com.bytedance.sdk.openadsdk.core.bly.pno)) {
                qbpVar.setClickListener((com.bytedance.sdk.openadsdk.core.bly.bly) vtVar);
                qbpVar.setClickCreativeListener((com.bytedance.sdk.openadsdk.core.bly.pno) ouwVar);
            }
            qbpVar.setJsbLandingPageOpenListener(new com.bytedance.sdk.openadsdk.core.widget.fkw() { // from class: com.bytedance.sdk.openadsdk.core.rn.3
                @Override // com.bytedance.sdk.openadsdk.core.widget.fkw
                public final void ouw() {
                    com.bytedance.sdk.openadsdk.ouw.vt.le leVar = rn.this.vt;
                    if (leVar != null) {
                        leVar.onAdClicked();
                    }
                }
            });
        }
        com.bytedance.sdk.openadsdk.ouw.vt.ouw ouwVar3 = this.yu;
        if (ouwVar3 != null && (pAGMediaView = ouwVar3.f8610le) != null) {
            pAGMediaView.setOnClickListener(ouwVar);
            this.yu.f8610le.setOnTouchListener(ouwVar);
        }
        com.bytedance.sdk.openadsdk.ouw.vt.ouw ouwVar4 = this.yu;
        if (ouwVar4 != null) {
            ouwVar4.bly = ouwVar;
            ouwVar4.tlj = vtVar;
        }
    }

    public final void ouw(ViewGroup viewGroup) {
        HashMap map = new HashMap();
        map.put("click_scence", 1);
        Context contextOuw = viewGroup != null ? com.bytedance.sdk.component.utils.vt.ouw(viewGroup) : null;
        if (contextOuw == null) {
            contextOuw = this.pno;
        }
        if (this.ouw.rn() == 2) {
            com.bytedance.sdk.openadsdk.core.model.vpp vppVar = this.ouw;
            String str = this.f8386cf;
            this.fkw = new com.bytedance.sdk.openadsdk.core.bly.bly(contextOuw, vppVar, str, com.bytedance.sdk.openadsdk.utils.uoy.ouw(str));
        } else {
            com.bytedance.sdk.openadsdk.core.model.vpp vppVar2 = this.ouw;
            String str2 = this.f8386cf;
            this.fkw = new com.bytedance.sdk.openadsdk.core.lh.vt(contextOuw, vppVar2, str2, com.bytedance.sdk.openadsdk.utils.uoy.ouw(str2));
        }
        this.fkw.ouw(viewGroup);
        this.fkw.ouw(this.mwh);
        this.fkw.ouw(this.ra);
        this.fkw.ouw(this.bly);
        this.fkw.ouw(map);
        this.fkw.ouw(new vt.ouw() { // from class: com.bytedance.sdk.openadsdk.core.rn.1
            @Override // com.bytedance.sdk.openadsdk.core.lh.vt.ouw
            public final void ouw(View view, int i4) {
                com.bytedance.sdk.openadsdk.ouw.vt.le leVar = rn.this.vt;
                if (leVar != null) {
                    leVar.onAdClicked();
                }
            }
        });
        if (this.ouw.rn() == 2) {
            Context context = this.pno;
            com.bytedance.sdk.openadsdk.core.model.vpp vppVar3 = this.ouw;
            String str3 = this.f8386cf;
            this.f8388le = new com.bytedance.sdk.openadsdk.core.bly.pno(context, vppVar3, str3, com.bytedance.sdk.openadsdk.utils.uoy.ouw(str3));
        } else {
            Context context2 = this.pno;
            com.bytedance.sdk.openadsdk.core.model.vpp vppVar4 = this.ouw;
            String str4 = this.f8386cf;
            this.f8388le = new com.bytedance.sdk.openadsdk.core.lh.ouw(context2, vppVar4, str4, com.bytedance.sdk.openadsdk.utils.uoy.ouw(str4));
        }
        this.f8388le.ouw(viewGroup);
        this.f8388le.ouw(this.mwh);
        this.f8388le.ouw(this.ra);
        this.f8388le.ouw(this.bly);
        this.f8388le.ouw(map);
        this.f8388le.ouw(new vt.ouw() { // from class: com.bytedance.sdk.openadsdk.core.rn.2
            @Override // com.bytedance.sdk.openadsdk.core.lh.vt.ouw
            public final void ouw(View view, int i4) {
                com.bytedance.sdk.openadsdk.core.ryl.le leVar;
                com.bytedance.sdk.openadsdk.ouw.vt.le leVar2 = rn.this.vt;
                if (leVar2 != null) {
                    leVar2.onAdClicked();
                }
                com.bytedance.sdk.openadsdk.tc.vt.fkw.ouw(rn.this.ouw, 9);
                WeakReference<com.bytedance.sdk.openadsdk.core.ryl.le> weakReference = rn.this.yu.f8608cf;
                if (weakReference == null || (leVar = weakReference.get()) == null) {
                    return;
                }
                leVar.ouw(13);
            }
        });
    }

    public static /* synthetic */ void vt(rn rnVar, ViewGroup viewGroup) throws JSONException {
        com.bytedance.sdk.openadsdk.core.ryl.yu yuVar;
        com.bytedance.sdk.openadsdk.core.model.vpp vppVar;
        if (rnVar.f8387jg.get()) {
            return;
        }
        rnVar.f8387jg.set(true);
        if (rnVar.bly instanceof com.bytedance.sdk.openadsdk.ouw.vt.ouw.lh) {
            com.bytedance.sdk.openadsdk.core.bly.qbp qbpVar = rnVar.yu.ra;
            if (qbpVar != null) {
                qbpVar.jg();
            }
            ((com.bytedance.sdk.openadsdk.ouw.vt.ouw.lh) rnVar.bly).ryl = true;
        }
        rnVar.f8389lh.ouw(System.currentTimeMillis(), fak.ouw(viewGroup));
        rnVar.ryl = SystemClock.elapsedRealtime();
        try {
            JSONObject jSONObject = new JSONObject();
            if (rnVar.tlj != null) {
                JSONArray jSONArray = new JSONArray();
                for (View view : rnVar.tlj) {
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
            if (rnVar.yu.pno != null) {
                JSONObject jSONObject4 = new JSONObject();
                try {
                    jSONObject4.put("width", com.bytedance.sdk.openadsdk.utils.osn.vt(rnVar.pno, r11.getWidth()) * 1.0f);
                    jSONObject4.put("height", com.bytedance.sdk.openadsdk.utils.osn.vt(rnVar.pno, r11.getHeight()) * 1.0f);
                } catch (Throwable unused3) {
                }
                jSONObject.put("media_view", jSONObject4.toString());
            }
            com.bytedance.sdk.openadsdk.core.bly.qbp qbpVar2 = rnVar.yu.ra;
            if (qbpVar2 != null && (vppVar = rnVar.ouw) != null) {
                jSONObject.put("dynamic_show_type", vppVar.kfa);
                qbpVar2.ouw(jSONObject, rnVar.ouw);
            }
            com.bytedance.sdk.openadsdk.yu.lh.ouw(rnVar.ouw, rnVar.f8386cf, jSONObject, (JSONObject) null);
            com.bytedance.sdk.openadsdk.tc.ouw.lh.ouw(rnVar.ouw);
        } catch (JSONException e2) {
            com.bytedance.sdk.component.utils.qbp.ouw("InteractionManager", "onShowFun json error", e2);
        }
        com.bytedance.sdk.openadsdk.ouw.vt.le leVar = rnVar.vt;
        if (leVar != null) {
            leVar.ouw();
        }
        if (rnVar.ouw.odc) {
            com.bytedance.sdk.openadsdk.utils.uoy.vt();
        }
        com.bytedance.sdk.openadsdk.core.model.yu yuVarSd = rnVar.ouw.sd();
        if (yuVarSd == null || (yuVar = yuVarSd.ouw) == null) {
            return;
        }
        yuVar.ouw();
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void ouw(com.bytedance.sdk.openadsdk.core.lh.vt vtVar, com.bytedance.sdk.openadsdk.core.lh.ouw ouwVar) {
        if (this.ouw.rn() == 2) {
            vt(vtVar, ouwVar);
        } else {
            ouw(ouwVar);
        }
    }

    private void ouw(com.bytedance.sdk.openadsdk.core.lh.ouw ouwVar) {
        PAGMediaView pAGMediaView;
        PAGMediaView pAGMediaView2;
        com.bytedance.sdk.openadsdk.core.settings.cf.vt();
        if (com.bytedance.sdk.openadsdk.core.settings.cf.lh(String.valueOf(this.ouw.fqk()))) {
            com.bytedance.sdk.openadsdk.ouw.vt.ouw ouwVar2 = this.yu;
            if (ouwVar2 != null && (pAGMediaView2 = ouwVar2.f8610le) != null) {
                pAGMediaView2.setOnClickListener(ouwVar);
                this.yu.f8610le.setOnTouchListener(ouwVar);
            }
            com.bytedance.sdk.openadsdk.ouw.vt.ouw ouwVar3 = this.yu;
            if (ouwVar3 != null) {
                ouwVar3.bly = ouwVar;
                return;
            }
            return;
        }
        com.bytedance.sdk.openadsdk.ouw.vt.ouw ouwVar4 = this.yu;
        if (ouwVar4 != null && (pAGMediaView = ouwVar4.f8610le) != null) {
            com.bytedance.sdk.openadsdk.core.lh.lh lhVar = new com.bytedance.sdk.openadsdk.core.lh.lh() { // from class: com.bytedance.sdk.openadsdk.core.rn.4
                @Override // com.bytedance.sdk.openadsdk.core.lh.lh
                public final void ouw(View view, float f10, float f11, float f12, float f13, SparseArray<lh.ouw> sparseArray, boolean z3) {
                    if (view instanceof PAGVideoMediaView) {
                        ((PAGVideoMediaView) view).handleInterruptVideo();
                    }
                }
            };
            pAGMediaView.setOnClickListener(lhVar);
            pAGMediaView.setOnTouchListener(lhVar);
        }
        com.bytedance.sdk.openadsdk.ouw.vt.ouw ouwVar5 = this.yu;
        if (ouwVar5 != null) {
            ouwVar5.bly = null;
        }
    }

    public static /* synthetic */ void ouw(rn rnVar, boolean z3, ViewGroup viewGroup) {
        if (z3 && rnVar.ouw.cj()) {
            com.bytedance.sdk.openadsdk.core.model.vpp vppVar = rnVar.ouw;
            if (!vppVar.vr) {
                vppVar.vr = true;
                com.bytedance.sdk.openadsdk.yu.lh.ouw(vppVar, rnVar.f8386cf, vppVar.f8304od);
            }
        }
        if (!z3 && rnVar.ryl > 0) {
            String strValueOf = String.valueOf(SystemClock.elapsedRealtime() - rnVar.ryl);
            rnVar.f8389lh.ouw(System.currentTimeMillis(), fak.ouw(viewGroup));
            com.bytedance.sdk.openadsdk.yu.lh.ouw(strValueOf, rnVar.ouw, rnVar.f8386cf, rnVar.f8389lh);
            rnVar.ryl = 0L;
            return;
        }
        rnVar.f8389lh.ouw(System.currentTimeMillis(), fak.ouw(viewGroup));
        rnVar.ryl = SystemClock.elapsedRealtime();
    }

    public static /* synthetic */ void ouw(rn rnVar, ViewGroup viewGroup) {
        rnVar.f8389lh.ouw(System.currentTimeMillis(), fak.ouw(viewGroup));
    }

    public static /* synthetic */ void ouw(rn rnVar) {
        if (rnVar.ryl > 0) {
            com.bytedance.sdk.openadsdk.yu.lh.ouw(String.valueOf(SystemClock.elapsedRealtime() - rnVar.ryl), rnVar.ouw, rnVar.f8386cf, rnVar.f8389lh);
            rnVar.ryl = 0L;
        }
    }
}

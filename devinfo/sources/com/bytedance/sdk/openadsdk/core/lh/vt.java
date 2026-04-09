package com.bytedance.sdk.openadsdk.core.lh;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import b9.e;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.core.bly;
import com.bytedance.sdk.openadsdk.core.lh.lh;
import com.bytedance.sdk.openadsdk.core.model.cf;
import com.bytedance.sdk.openadsdk.core.model.ko;
import com.bytedance.sdk.openadsdk.core.model.od;
import com.bytedance.sdk.openadsdk.core.model.ryl;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.bytedance.sdk.openadsdk.utils.rn;
import com.bytedance.sdk.openadsdk.utils.uoy;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class vt extends lh {
    private static int vt = Integer.MIN_VALUE;
    public ko bly;

    /* renamed from: cf, reason: collision with root package name */
    protected final String f8207cf;
    public String ex;

    /* renamed from: jg, reason: collision with root package name */
    protected cf f8208jg;
    protected int jqy;
    protected ouw ko;
    protected WeakReference<View> mwh;
    private boolean ouw;
    protected Context pno;
    protected Map<String, Object> qbp;
    protected PAGNativeAd rn;
    protected final int ryl;
    public WeakReference<Activity> tc;

    /* renamed from: th, reason: collision with root package name */
    protected com.bytedance.sdk.openadsdk.qbp.ouw.ouw.lh f8209th;
    protected final vpp tlj;
    protected boolean vm;
    protected com.bytedance.sdk.openadsdk.core.bly.vt vpp;
    protected e zih;
    protected com.bytedance.sdk.openadsdk.core.yu.ouw zin;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public interface ouw {
        void ouw(View view, int i4);
    }

    public vt(Context context, vpp vppVar, String str, int i4) {
        this.vm = false;
        this.jqy = 0;
        this.ouw = false;
        this.pno = context;
        this.tlj = vppVar;
        this.f8207cf = str;
        this.ryl = i4;
    }

    public final void lh() {
        this.vm = true;
    }

    public boolean ouw(cf cfVar, Map<String, Object> map) {
        return false;
    }

    public final void vt(int i4) {
        this.bs = i4;
    }

    public final void yu(int i4) {
        this.jqy = i4;
    }

    public static boolean vt(View view) {
        return 520093705 == view.getId() || 520093707 == view.getId() || 520093703 == view.getId() || ouw(view.getContext()) == view.getId() || rn.yw == view.getId() || rn.zu == view.getId();
    }

    public final void lh(int i4) {
        this.fvf = i4;
    }

    public final void ouw(com.bytedance.sdk.openadsdk.qbp.ouw.ouw.lh lhVar) {
        this.f8209th = lhVar;
    }

    public final void ouw(com.bytedance.sdk.openadsdk.core.bly.vt vtVar) {
        this.vpp = vtVar;
    }

    public final void ouw(PAGNativeAd pAGNativeAd) {
        this.rn = pAGNativeAd;
    }

    public final void ouw(com.bytedance.sdk.openadsdk.core.yu.ouw ouwVar) {
        this.zin = ouwVar;
    }

    public final void ouw(e eVar) {
        this.zih = eVar;
    }

    public final void ouw(ouw ouwVar) {
        this.ko = ouwVar;
    }

    public final void ouw(View view) {
        if (view == null) {
            return;
        }
        this.mwh = new WeakReference<>(view);
    }

    public vt(Context context, vpp vppVar, String str, int i4, byte b10) {
        this(context, vppVar, str, i4);
        this.ouw = true;
    }

    public final void ouw(Map<String, Object> map) {
        Map<String, Object> map2 = this.qbp;
        if (map2 != null) {
            map2.putAll(map);
            map.putAll(this.qbp);
        }
        this.qbp = map;
    }

    public final void ouw(int i4) {
        this.fak = i4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [android.content.Context] */
    @Override // com.bytedance.sdk.openadsdk.core.lh.lh
    public void ouw(View view, float f10, float f11, float f12, float f13, SparseArray<lh.ouw> sparseArray, boolean z3) {
        int i4;
        boolean z10;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        com.bytedance.sdk.openadsdk.core.ryl.yu yuVar;
        ryl rylVar;
        if (this.pno == null) {
            this.pno = zih.ouw();
        }
        if ((this.ouw || !ouw(view, 1, f10, f11, f12, f13, sparseArray, z3)) && this.pno != null) {
            ko koVar = this.bly;
            if (koVar != null) {
                int i10 = koVar.pno;
                JSONObject jSONObject3 = koVar.bly;
                JSONObject jSONObject4 = koVar.mwh;
                z10 = koVar.f8233jg;
                i4 = i10;
                jSONObject = jSONObject3;
                jSONObject2 = jSONObject4;
            } else {
                i4 = -1;
                z10 = false;
                jSONObject = null;
                jSONObject2 = null;
            }
            long j = this.uq;
            long j8 = this.f8203pd;
            WeakReference<View> weakReference = this.mwh;
            cf cfVarOuw = ouw(f10, f11, f12, f13, sparseArray, j, j8, weakReference == null ? null : weakReference.get(), this.ex, osn.bly(this.pno), osn.cf(this.pno), osn.tlj(this.pno), i4, jSONObject, jSONObject2);
            this.f8208jg = cfVarOuw;
            if (ouw(cfVarOuw, this.qbp)) {
                return;
            }
            if (this.zih != null) {
                if (this.qbp == null) {
                    this.qbp = new HashMap();
                }
                this.qbp.put("duration", Long.valueOf(this.zih.rn()));
            }
            vpp vppVar = this.tlj;
            if (!this.ouw && !z10) {
                ouw ouwVar = this.ko;
                if (ouwVar != null) {
                    ouwVar.ouw(view, -1);
                }
                if (ouw(view, z3)) {
                    boolean zVt = od.vt(vppVar);
                    String strOuw = zVt ? this.f8207cf : uoy.ouw(this.ryl);
                    if (view != null) {
                        try {
                            if (Boolean.TRUE.equals(view.getTag(520093762))) {
                                com.bytedance.sdk.openadsdk.core.uoy.ouw(true);
                            }
                        } catch (Exception unused) {
                        }
                    }
                    Activity activityOuw = view != null ? com.bytedance.sdk.component.utils.vt.ouw(view) : null;
                    boolean zOuw = com.bytedance.sdk.openadsdk.core.uoy.ouw(activityOuw == null ? this.pno : activityOuw, vppVar, this.ryl, this.rn, this.zin, strOuw, this.f8209th, zVt, 0);
                    com.bytedance.sdk.openadsdk.core.uoy.ouw(false);
                    if (zOuw || vppVar == null || (rylVar = vppVar.kn) == null || rylVar.f8261lh != 2) {
                        if (vppVar != null && !zOuw && TextUtils.isEmpty(vppVar.osn) && com.bytedance.sdk.openadsdk.yu.vt.ouw(this.f8207cf)) {
                            com.bytedance.sdk.openadsdk.qbp.ouw.ouw.yu.ouw(this.pno, this.f8207cf).ouw(vppVar);
                        }
                        com.bytedance.sdk.openadsdk.yu.lh.ouw("click", vppVar, this.f8208jg, this.f8207cf, zOuw, this.qbp, z3 ? 1 : 2);
                        return;
                    }
                    return;
                }
                return;
            }
            com.bytedance.sdk.openadsdk.yu.lh.ouw("click", vppVar, this.f8208jg, this.f8207cf, true, this.qbp, z3 ? 1 : 2);
            com.bytedance.sdk.openadsdk.core.model.yu yuVarSd = vppVar.sd();
            if (yuVarSd == null || vppVar.cd() || (yuVar = yuVarSd.ouw) == null) {
                return;
            }
            e eVar = this.zih;
            yuVar.le(eVar != null ? eVar.rn() : 0L);
        }
    }

    public final boolean ouw(View view, boolean z3) {
        return ouw(view, this.tlj, z3);
    }

    private static boolean ouw(View view, vpp vppVar, boolean z3) {
        if (view != null && vppVar != null) {
            try {
                int i4 = com.bytedance.sdk.component.adexpress.dynamic.ouw.qbp;
                String strValueOf = String.valueOf(view.getTag(i4));
                if (view.getTag(i4) != null && !TextUtils.isEmpty(strValueOf)) {
                    if ("click".equals(strValueOf)) {
                        return z3;
                    }
                    return true;
                }
            } catch (Exception unused) {
            }
            if (vt(view)) {
                return vppVar.lai != 1 || z3;
            }
            if (vppVar.ajl == 1 && !z3) {
                return false;
            }
        }
        return true;
    }

    public cf ouw(float f10, float f11, float f12, float f13, SparseArray<lh.ouw> sparseArray, long j, long j8, View view, String str, float f14, int i4, float f15, int i10, JSONObject jSONObject, JSONObject jSONObject2) {
        cf.ouw ouwVar = new cf.ouw();
        ouwVar.f8216le = f10;
        ouwVar.fkw = f11;
        ouwVar.yu = f12;
        ouwVar.f8217lh = f13;
        ouwVar.vt = j;
        ouwVar.ouw = j8;
        ouwVar.ra = osn.ouw(view);
        ouwVar.pno = osn.lh(view);
        ouwVar.bly = this.fvf;
        ouwVar.tlj = this.bs;
        ouwVar.f8214cf = this.fak;
        ouwVar.ryl = sparseArray;
        ouwVar.mwh = bly.ouw().tlj ? 1 : 2;
        ouwVar.zih = str;
        ouwVar.f8215jg = f14;
        ouwVar.ko = i4;
        ouwVar.rn = f15;
        ouwVar.vm = i10;
        ouwVar.f8218th = jSONObject;
        ouwVar.qbp = jSONObject2;
        return ouwVar.ouw();
    }

    public final boolean ouw(View view, int i4, float f10, float f11, float f12, float f13, SparseArray<lh.ouw> sparseArray, boolean z3) {
        if (this.vpp == null) {
            return false;
        }
        ko.ouw ouwVar = new ko.ouw();
        ouwVar.f8238le = f10;
        ouwVar.fkw = f11;
        ouwVar.yu = f12;
        ouwVar.f8239lh = f13;
        ouwVar.vt = this.uq;
        ouwVar.ouw = this.f8203pd;
        ko.ouw ouwVarOuw = ouwVar.ouw(sparseArray);
        ouwVarOuw.ko = z3;
        this.vpp.ouw(view, i4, ouwVarOuw.ouw());
        return true;
    }

    private static int ouw(Context context) {
        if (vt == Integer.MIN_VALUE) {
            vt = com.bytedance.sdk.component.utils.vpp.fkw(context, "btn_native_creative");
        }
        return vt;
    }
}

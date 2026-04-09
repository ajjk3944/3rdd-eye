package com.bytedance.sdk.component.adexpress.dynamic.fkw;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.dynamic.fkw.vt;
import com.bytedance.sdk.component.adexpress.vt.mwh;
import com.bytedance.sdk.component.utils.ko;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class fkw {

    /* renamed from: lh, reason: collision with root package name */
    ouw f7238lh;
    public com.bytedance.sdk.component.adexpress.dynamic.yu.vt ouw;
    protected vt vt;
    private com.bytedance.sdk.component.adexpress.dynamic.yu.pno yu;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class ouw {

        /* renamed from: lh, reason: collision with root package name */
        float f7239lh;
        float ouw;
        float vt;
    }

    public fkw(double d10, int i4, double d11, String str, mwh mwhVar) {
        this.vt = new vt(d10, i4, d11, str, mwhVar);
    }

    public final void ouw() {
        this.vt.ouw();
    }

    public final void ouw(com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVar) throws JSONException, NumberFormatException {
        if (pnoVar != null) {
            this.yu = pnoVar;
        }
        com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVar2 = this.yu;
        float f10 = pnoVar2.f7305le;
        float f11 = pnoVar2.ra;
        float f12 = TextUtils.equals(pnoVar2.bly.f7280lh.rn, "fixed") ? f11 : 65536.0f;
        this.vt.ouw();
        this.vt.ouw(pnoVar2, f10, f12);
        vt.lh lhVarOuw = this.vt.ouw(pnoVar2);
        com.bytedance.sdk.component.adexpress.dynamic.yu.vt vtVar = new com.bytedance.sdk.component.adexpress.dynamic.yu.vt();
        vtVar.ouw = 0.0f;
        vtVar.vt = 0.0f;
        if (lhVarOuw != null) {
            f10 = lhVarOuw.ouw;
        }
        vtVar.f7312lh = f10;
        if (lhVarOuw != null) {
            f11 = lhVarOuw.vt;
        }
        vtVar.yu = f11;
        vtVar.fkw = "root";
        vtVar.bly = 1280.0f;
        vtVar.f7311le = pnoVar2;
        pnoVar2.vt = 0.0f;
        pnoVar2.f7306lh = 0.0f;
        pnoVar2.f7305le = f10;
        pnoVar2.ra = f11;
        com.bytedance.sdk.component.adexpress.dynamic.yu.vt vtVarOuw = ouw(vtVar, 0.0f);
        this.ouw = vtVarOuw;
        ouw(vtVarOuw);
    }

    private void ouw(com.bytedance.sdk.component.adexpress.dynamic.yu.vt vtVar) {
        if (vtVar == null) {
            return;
        }
        ko.vt("DynamicCanvas", "native parser: type = " + vtVar.f7311le.bly.ouw + "; width = " + vtVar.f7312lh + "; height = " + vtVar.yu + "; x = " + vtVar.ouw + "; y = " + vtVar.vt);
        List<List<com.bytedance.sdk.component.adexpress.dynamic.yu.vt>> list = vtVar.ra;
        if (list == null || list.size() <= 0) {
            return;
        }
        for (List<com.bytedance.sdk.component.adexpress.dynamic.yu.vt> list2 : list) {
            if (list2 != null && list2.size() > 0) {
                Iterator<com.bytedance.sdk.component.adexpress.dynamic.yu.vt> it = list2.iterator();
                while (it.hasNext()) {
                    ouw(it.next());
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:143:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.bytedance.sdk.component.adexpress.dynamic.yu.vt ouw(com.bytedance.sdk.component.adexpress.dynamic.yu.vt r38, float r39) {
        /*
            Method dump skipped, instructions count: 933
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.adexpress.dynamic.fkw.fkw.ouw(com.bytedance.sdk.component.adexpress.dynamic.yu.vt, float):com.bytedance.sdk.component.adexpress.dynamic.yu.vt");
    }

    private static com.bytedance.sdk.component.adexpress.dynamic.yu.bly ouw(com.bytedance.sdk.component.adexpress.dynamic.yu.vt vtVar, com.bytedance.sdk.component.adexpress.dynamic.yu.le leVar, float f10, float f11) {
        float f12;
        float f13;
        float f14 = vtVar.ouw;
        float f15 = vtVar.vt;
        float f16 = leVar.mt;
        float f17 = leVar.zvq;
        float f18 = leVar.xdk;
        float f19 = leVar.myk;
        boolean z3 = leVar.lso;
        boolean z10 = leVar.f7294ub;
        boolean z11 = leVar.f7283cj;
        boolean z12 = leVar.pv;
        String str = leVar.ux;
        float f20 = vtVar.f7312lh;
        float f21 = vtVar.yu;
        if (TextUtils.equals(str, "0")) {
            if (z3) {
                f14 = vtVar.ouw + f16;
            } else if (z10) {
                f14 = ((vtVar.ouw + f20) - f18) - f10;
            }
            if (z11) {
                f13 = vtVar.vt;
                f15 = f13 + f17;
            } else if (z12) {
                f12 = vtVar.vt;
                f15 = ((f12 + f21) - f19) - f11;
            }
        } else if (TextUtils.equals(str, "1")) {
            f14 = ((f20 - f10) / 2.0f) + vtVar.ouw;
            if (z11) {
                f13 = vtVar.vt;
                f15 = f13 + f17;
            } else if (z12) {
                f12 = vtVar.vt;
                f15 = ((f12 + f21) - f19) - f11;
            }
        } else if (TextUtils.equals(str, "2")) {
            f15 = ((f21 - f11) / 2.0f) + vtVar.vt;
            if (z3) {
                f14 = vtVar.ouw + f16;
            } else if (z10) {
                f14 = ((vtVar.ouw + f20) - f18) - f10;
            }
        } else if (TextUtils.equals(str, "3")) {
            f14 = ((f20 - f10) / 2.0f) + vtVar.ouw;
            f15 = ((f21 - f11) / 2.0f) + vtVar.vt;
        }
        return new com.bytedance.sdk.component.adexpress.dynamic.yu.bly(f14, f15);
    }

    private com.bytedance.sdk.component.adexpress.dynamic.yu.bly ouw(com.bytedance.sdk.component.adexpress.dynamic.yu.le leVar, vt.lh lhVar, vt.lh lhVar2) {
        float fMin = leVar.mt;
        float f10 = leVar.zvq;
        float f11 = leVar.xdk;
        float f12 = leVar.myk;
        boolean z3 = leVar.lso;
        boolean z10 = leVar.f7294ub;
        boolean z11 = leVar.f7283cj;
        boolean z12 = leVar.pv;
        if (!z3) {
            if (z10) {
                float f13 = this.f7238lh.ouw;
                fMin = ((f13 != 0.0f ? Math.min(f13, lhVar.ouw) : lhVar.ouw) - f11) - lhVar2.ouw;
            } else {
                fMin = 0.0f;
            }
        }
        if (!z11) {
            if (z12) {
                float f14 = this.f7238lh.vt;
                if (f14 == 0.0f) {
                    f14 = lhVar.vt;
                }
                f10 = (f14 - f12) - lhVar2.vt;
            } else {
                f10 = 0.0f;
            }
        }
        return new com.bytedance.sdk.component.adexpress.dynamic.yu.bly(fMin, f10);
    }
}

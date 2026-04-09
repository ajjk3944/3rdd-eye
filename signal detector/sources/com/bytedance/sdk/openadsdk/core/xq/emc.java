package com.bytedance.sdk.openadsdk.core.xq;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.component.utils.sba;
import com.bytedance.sdk.openadsdk.core.aa;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.zz.msw;
import com.bytedance.sdk.openadsdk.utils.tp;
import com.bytedance.sdk.openadsdk.utils.vk;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class emc extends ypw {
    private boolean emc;
    private int iyl;
    private boolean mkp;
    private WeakReference<InterfaceC0081emc> rtt;
    private boolean xq;
    private boolean ypw;

    /* renamed from: com.bytedance.sdk.openadsdk.core.xq.emc$emc, reason: collision with other inner class name */
    public interface InterfaceC0081emc {
        long getVideoProgress();
    }

    public emc(Context context, rie rieVar, String str, int i) {
        super(context, rieVar, str, i);
        this.emc = true;
        this.ypw = false;
        this.xq = false;
        this.mkp = false;
    }

    private boolean msw() {
        return this instanceof msw;
    }

    private boolean uym() {
        rie rieVar = ((ypw) this).ycc;
        return rie.bw(rieVar) && rieVar.jxk() == 1;
    }

    private boolean zz() {
        rie rieVar = ((ypw) this).ycc;
        if (rieVar == null || msw()) {
            return false;
        }
        if (rieVar.in() != 5 && rieVar.in() != 15) {
            return false;
        }
        if (this.iyl == 0) {
            this.iyl = rieVar.mfx();
        }
        ypw();
        emc();
        xq();
        if (this.iyl == 5 && uym() && emc() && !ypw() && !xq()) {
            return false;
        }
        int i = this.iyl;
        return i == 1 || i == 2 || i == 5;
    }

    public void dg(boolean z6) {
        this.mkp = z6;
    }

    public void emc(boolean z6) {
        this.emc = z6;
    }

    public boolean xq() {
        return false;
    }

    public boolean ypw() {
        return false;
    }

    private boolean xq(View view) {
        if (view == null) {
            return false;
        }
        if ((view instanceof com.bytedance.sdk.openadsdk.core.sz.ypw.ycc) || view.getId() == vk.etw || view.getId() == vk.wo || view.getId() == vk.xxg || view.getId() == vk.yz || view.getId() == vk.wpn || view.getId() == 520093726 || view.getId() == vk.hs) {
            return true;
        }
        if (view instanceof ViewGroup) {
            int i = 0;
            while (true) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (i >= viewGroup.getChildCount()) {
                    break;
                }
                if (xq(viewGroup.getChildAt(i))) {
                    return true;
                }
                i++;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00fc  */
    /* JADX WARN: Type inference failed for: r0v20, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r0v7, types: [android.content.Context] */
    @Override // com.bytedance.sdk.openadsdk.core.xq.ypw, com.bytedance.sdk.openadsdk.core.xq.xq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void emc(android.view.View r27, float r28, float r29, float r30, float r31, android.util.SparseArray<com.bytedance.sdk.openadsdk.core.xq.xq.emc> r32, boolean r33) {
        /*
            Method dump skipped, instructions count: 931
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.xq.emc.emc(android.view.View, float, float, float, float, android.util.SparseArray, boolean):void");
    }

    public void ypw(boolean z6) {
        this.ypw = z6;
    }

    private String ypw(String str) {
        str.getClass();
        switch (str) {
            case "banner_ad":
                return "banner_call";
            case "open_ad":
                return "open_ad";
            case "embeded_ad":
                return "feed_call";
            case "interaction":
                return "interaction_call";
            case "slide_banner_ad":
                return "banner_call";
            default:
                return "";
        }
    }

    public void xq(boolean z6) {
        this.xq = z6;
    }

    public boolean emc() {
        rie rieVar = ((ypw) this).ycc;
        if (rieVar == null) {
            return true;
        }
        int iYpw = aa.dg().ypw(rieVar.tx());
        int iXq = sba.xq(aa.emc());
        if (iYpw == 1) {
            return tp.dg(iXq);
        }
        if (iYpw == 2) {
            return tp.bw(iXq) || tp.dg(iXq) || tp.ycc(iXq);
        }
        if (iYpw != 3) {
            return iYpw != 5 || tp.dg(iXq) || tp.ycc(iXq);
        }
        return false;
    }

    public void emc(InterfaceC0081emc interfaceC0081emc) {
        this.rtt = new WeakReference<>(interfaceC0081emc);
    }
}

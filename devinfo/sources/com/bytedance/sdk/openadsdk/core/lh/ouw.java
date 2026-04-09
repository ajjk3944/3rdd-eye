package com.bytedance.sdk.openadsdk.core.lh;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.component.utils.ksc;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.settings.cf;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.utils.rn;
import com.bytedance.sdk.openadsdk.utils.uoy;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class ouw extends vt {
    public boolean fkw;

    /* renamed from: le, reason: collision with root package name */
    public boolean f8205le;
    private WeakReference<InterfaceC0087ouw> ouw;
    public boolean ra;
    private int vt;
    public boolean yu;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    /* renamed from: com.bytedance.sdk.openadsdk.core.lh.ouw$ouw, reason: collision with other inner class name */
    public interface InterfaceC0087ouw {
        long getVideoProgress();
    }

    public ouw(Context context, vpp vppVar, String str, int i4) {
        super(context, vppVar, str, i4);
        this.yu = true;
        this.fkw = false;
        this.f8205le = false;
        this.ra = false;
    }

    private boolean fkw() {
        vpp vppVar = this.tlj;
        if (vppVar == null) {
            return true;
        }
        int iFqk = vppVar.fqk();
        zih.yu();
        int iVt = cf.vt(iFqk);
        int iOuw = ksc.ouw(zih.ouw(), 60000L);
        if (iVt == 1) {
            return uoy.yu(iOuw);
        }
        if (iVt == 2) {
            return uoy.fkw(iOuw) || uoy.yu(iOuw) || uoy.le(iOuw);
        }
        if (iVt != 3) {
            return iVt != 5 || uoy.yu(iOuw) || uoy.le(iOuw);
        }
        return false;
    }

    private boolean lh(View view) {
        if (view == null) {
            return false;
        }
        if (view instanceof com.bytedance.sdk.openadsdk.core.mwh.vt.le) {
            ko.lh("ClickCreativeListener", "NativeVideoTsView....");
            return true;
        }
        if (view.getId() == rn.qni || view.getId() == rn.rrs || view.getId() == rn.jvy || view.getId() == rn.fqk || view.getId() == rn.hun) {
            ko.lh("ClickCreativeListener", "tt_video_ad_cover_center_layout....");
            return true;
        }
        if (view.getId() == 520093726 || view.getId() == rn.f8719ki) {
            ko.lh("ClickCreativeListener", "tt_root_view....");
            return true;
        }
        if (view instanceof ViewGroup) {
            int i4 = 0;
            while (true) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (i4 >= viewGroup.getChildCount()) {
                    break;
                }
                if (lh(viewGroup.getChildAt(i4))) {
                    return true;
                }
                i4++;
            }
        }
        return false;
    }

    public boolean ouw() {
        return false;
    }

    public boolean vt() {
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:105:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f5  */
    @Override // com.bytedance.sdk.openadsdk.core.lh.vt, com.bytedance.sdk.openadsdk.core.lh.lh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void ouw(android.view.View r28, float r29, float r30, float r31, float r32, android.util.SparseArray<com.bytedance.sdk.openadsdk.core.lh.lh.ouw> r33, boolean r34) {
        /*
            Method dump skipped, instructions count: 1166
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.lh.ouw.ouw(android.view.View, float, float, float, float, android.util.SparseArray, boolean):void");
    }

    public final void ouw(InterfaceC0087ouw interfaceC0087ouw) {
        this.ouw = new WeakReference<>(interfaceC0087ouw);
    }
}

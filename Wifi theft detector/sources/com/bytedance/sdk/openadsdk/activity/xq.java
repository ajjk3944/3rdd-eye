package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import com.bytedance.sdk.openadsdk.activity.ypw;
import com.bytedance.sdk.openadsdk.core.model.dr;
import com.bytedance.sdk.openadsdk.core.model.rie;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class xq {
    protected String bw;
    protected final ypw dg;
    protected final Activity emc;
    protected String xq;
    protected final rie ypw;

    public xq(Activity activity, rie rieVar, ypw ypwVar) {
        this.emc = activity;
        this.ypw = rieVar;
        if (rieVar != null) {
            this.xq = dr.hxp(rieVar);
        }
        if (activity != null) {
            this.bw = String.valueOf(activity.hashCode());
        }
        this.dg = ypwVar;
    }

    public void aa() {
    }

    public boolean bw() {
        return true;
    }

    public abstract List<rie> cf();

    public boolean dg() {
        return false;
    }

    public void emc() {
    }

    public abstract void emc(int i10);

    public abstract boolean emc(msw mswVar, int i10);

    public msw gbl() {
        return null;
    }

    public abstract int msw();

    public bw qh() {
        return null;
    }

    public abstract int ru();

    public abstract void sba();

    public abstract com.bytedance.sdk.openadsdk.component.reward.top.xq sup();

    public msw sz() {
        return null;
    }

    public void uym() {
    }

    public void vk() {
    }

    public void xq() {
    }

    public void ycc() {
    }

    public void ypw() {
    }

    public abstract void ypw(msw mswVar, int i10);

    public abstract void yzg();

    public void zz() {
    }

    public void emc(float f10) {
    }

    public void ypw(Activity activity) {
    }

    public void emc(int i10, int i11) {
    }

    public void emc(Activity activity) {
    }

    public void emc(Bundle bundle) {
    }

    public void emc(View view) {
    }

    public void emc(View view, boolean z10) {
    }

    public void emc(emc emcVar, boolean z10) {
    }

    public void emc(msw mswVar) {
    }

    public void emc(msw mswVar, msw mswVar2, ypw.bw bwVar) {
    }

    public void emc(msw mswVar, ypw.bw bwVar) {
    }

    public void emc(msw mswVar, boolean z10) {
    }

    public void emc(msw mswVar, boolean z10, boolean z11, boolean z12, int i10) {
    }

    public void emc(Map<String, Object> map, msw mswVar, float f10, float f11) {
    }

    public void emc(boolean z10) {
    }
}

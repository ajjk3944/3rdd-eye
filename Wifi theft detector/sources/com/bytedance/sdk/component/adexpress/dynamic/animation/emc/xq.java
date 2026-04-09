package com.bytedance.sdk.component.adexpress.dynamic.animation.emc;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class xq {
    private static volatile xq emc;

    private xq() {
    }

    public static xq emc() {
        if (emc == null) {
            synchronized (xq.class) {
                try {
                    if (emc == null) {
                        emc = new xq();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return emc;
    }

    public dg emc(View view, com.bytedance.sdk.component.adexpress.dynamic.dg.emc emcVar) {
        if (emcVar == null) {
            return null;
        }
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).setClipChildren(false);
        }
        if (view.getParent().getParent() != null) {
            ((ViewGroup) view.getParent().getParent()).setClipChildren(false);
        }
        if ("scale".equals(emcVar.zz())) {
            return new gbl(view, emcVar);
        }
        if ("translate".equals(emcVar.zz())) {
            return new cf(view, emcVar);
        }
        if ("ripple".equals(emcVar.zz())) {
            return new msw(view, emcVar);
        }
        if ("marquee".equals(emcVar.zz())) {
            return new uym(view, emcVar);
        }
        if ("waggle".equals(emcVar.zz())) {
            return new vk(view, emcVar);
        }
        if ("shine".equals(emcVar.zz())) {
            return new sup(view, emcVar);
        }
        if ("swing".equals(emcVar.zz())) {
            return new qh(view, emcVar);
        }
        if ("fade".equals(emcVar.zz())) {
            return new emc(view, emcVar);
        }
        if ("rubIn".equals(emcVar.zz())) {
            return new ru(view, emcVar);
        }
        if ("rotate".equals(emcVar.zz())) {
            return new zz(view, emcVar);
        }
        if ("cutIn".equals(emcVar.zz())) {
            return new ycc(view, emcVar);
        }
        if ("stretch".equals(emcVar.zz())) {
            return new sz(view, emcVar);
        }
        if ("bounce".equals(emcVar.zz())) {
            return new bw(view, emcVar);
        }
        return null;
    }
}

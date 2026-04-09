package com.bytedance.sdk.component.adexpress.dynamic.animation.ouw;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class lh {
    private static volatile lh ouw;

    private lh() {
    }

    public static lh ouw() {
        if (ouw == null) {
            synchronized (lh.class) {
                try {
                    if (ouw == null) {
                        ouw = new lh();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return ouw;
    }

    public static yu ouw(View view, com.bytedance.sdk.component.adexpress.dynamic.yu.ouw ouwVar) {
        if (ouwVar == null) {
            return null;
        }
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).setClipChildren(false);
        }
        if (view.getParent().getParent() != null) {
            ((ViewGroup) view.getParent().getParent()).setClipChildren(false);
        }
        if ("scale".equals(ouwVar.ouw)) {
            return new cf(view, ouwVar);
        }
        if ("translate".equals(ouwVar.ouw)) {
            return new ko(view, ouwVar);
        }
        if ("ripple".equals(ouwVar.ouw)) {
            return new pno(view, ouwVar);
        }
        if ("marquee".equals(ouwVar.ouw)) {
            return new ra(view, ouwVar);
        }
        if ("waggle".equals(ouwVar.ouw)) {
            return new rn(view, ouwVar);
        }
        if ("shine".equals(ouwVar.ouw)) {
            return new ryl(view, ouwVar);
        }
        if ("swing".equals(ouwVar.ouw)) {
            return new jg(view, ouwVar);
        }
        if ("fade".equals(ouwVar.ouw)) {
            return new ouw(view, ouwVar);
        }
        if ("rubIn".equals(ouwVar.ouw)) {
            return new tlj(view, ouwVar);
        }
        if ("rotate".equals(ouwVar.ouw)) {
            return new bly(view, ouwVar);
        }
        if ("cutIn".equals(ouwVar.ouw)) {
            return new le(view, ouwVar);
        }
        if ("stretch".equals(ouwVar.ouw)) {
            return new mwh(view, ouwVar);
        }
        if ("bounce".equals(ouwVar.ouw)) {
            return new fkw(view, ouwVar);
        }
        return null;
    }
}

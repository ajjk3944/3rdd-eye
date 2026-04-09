package com.bytedance.sdk.component.ycc.emc;

import android.content.Context;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class msw {
    private static volatile com.bytedance.sdk.component.ycc.emc.bw.emc ru;
    private static msw sz;
    private volatile com.bytedance.sdk.component.ycc.emc.dg.ypw.emc bw;
    private long cf;
    private volatile com.bytedance.sdk.component.ycc.emc.dg.ypw.emc dg;
    private volatile Context emc;
    private volatile com.bytedance.sdk.component.ycc.emc.ypw.xq gbl;
    private volatile boolean msw;
    private final AtomicBoolean qh = new AtomicBoolean(false);
    private volatile Map<Integer, com.bytedance.sdk.component.ycc.emc.ypw.xq> sup;
    private volatile com.bytedance.sdk.component.ycc.emc.emc.bw uym;
    private volatile com.bytedance.sdk.component.ycc.emc.dg.ypw.emc xq;
    private volatile com.bytedance.sdk.component.ycc.emc.dg.ypw.emc ycc;
    private volatile com.bytedance.sdk.component.ycc.emc.dg.ypw.emc ypw;
    private volatile bw zz;

    private msw() {
    }

    public static com.bytedance.sdk.component.ycc.emc.bw.emc bw() {
        if (ru == null) {
            synchronized (msw.class) {
                try {
                    if (ru == null) {
                        ru = new com.bytedance.sdk.component.ycc.emc.bw.ypw();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return ru;
    }

    public static synchronized msw uym() {
        try {
            if (sz == null) {
                sz = new msw();
            }
        } catch (Throwable th) {
            throw th;
        }
        return sz;
    }

    public long aa() {
        return this.cf * 86400000;
    }

    public com.bytedance.sdk.component.ycc.emc.dg.ypw.emc cf() {
        return this.bw;
    }

    public com.bytedance.sdk.component.ycc.emc.emc.bw dg() {
        return this.uym;
    }

    public boolean emc() {
        return this.qh.get();
    }

    public void gbl() {
        com.bytedance.sdk.component.ycc.emc.ypw.dg.emc.xq();
    }

    public com.bytedance.sdk.component.ycc.emc.ypw.xq msw() {
        return this.gbl;
    }

    public com.bytedance.sdk.component.ycc.emc.dg.ypw.emc qh() {
        return this.dg;
    }

    public com.bytedance.sdk.component.ycc.emc.dg.ypw.emc ru() {
        return this.ycc;
    }

    public com.bytedance.sdk.component.ycc.emc.dg.ypw.emc sup() {
        return this.ypw;
    }

    public com.bytedance.sdk.component.ycc.emc.dg.ypw.emc sz() {
        return this.xq;
    }

    public bw vk() {
        return this.zz;
    }

    public Map<Integer, com.bytedance.sdk.component.ycc.emc.ypw.xq> xq() {
        return this.sup;
    }

    public Context ycc() {
        return this.emc;
    }

    public boolean ypw() {
        return this.msw;
    }

    public void zz() {
        com.bytedance.sdk.component.ycc.emc.ypw.dg.emc.ypw();
    }

    public void dg(com.bytedance.sdk.component.ycc.emc.dg.ypw.emc emcVar) {
        this.dg = emcVar;
    }

    public void emc(boolean z6) {
        this.qh.set(z6);
    }

    public void xq(com.bytedance.sdk.component.ycc.emc.dg.ypw.emc emcVar) {
        this.xq = emcVar;
    }

    public void ypw(boolean z6) {
        this.msw = z6;
    }

    public void emc(com.bytedance.sdk.component.ycc.emc.emc.bw bwVar) {
        this.uym = bwVar;
    }

    public void ypw(com.bytedance.sdk.component.ycc.emc.dg.ypw.emc emcVar) {
        this.ypw = emcVar;
    }

    public void emc(Context context) {
        this.emc = context;
    }

    public void emc(com.bytedance.sdk.component.ycc.emc.ypw.xq xqVar) {
        this.gbl = xqVar;
    }

    public void emc(com.bytedance.sdk.component.ycc.emc.dg.ypw.emc emcVar) {
        this.ycc = emcVar;
    }

    public void bw(com.bytedance.sdk.component.ycc.emc.dg.ypw.emc emcVar) {
        this.bw = emcVar;
    }

    public void emc(com.bytedance.sdk.component.ycc.emc.dg.emc emcVar) {
        if (emcVar == null) {
            return;
        }
        emcVar.emc(System.currentTimeMillis());
        com.bytedance.sdk.component.ycc.emc.ypw.dg.emc.emc(emcVar, emcVar.dg());
    }

    public void emc(String str, boolean z6) {
        com.bytedance.sdk.component.ycc.emc.ycc.emc.emc().emc(str, z6);
    }

    public void emc(String str, List<String> list, boolean z6, Map<String, String> map, int i, String str2) {
        com.bytedance.sdk.component.ycc.emc.ycc.emc.emc().emc(str, list, z6, map, i, str2);
    }

    public void emc(bw bwVar) {
        this.zz = bwVar;
    }

    public void emc(long j6) {
        this.cf = j6;
    }
}

package com.bytedance.adsdk.ugeno;

import com.bytedance.adsdk.ugeno.yu.pno;
import com.bytedance.adsdk.ugeno.yu.tlj;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class fkw {
    private static volatile fkw ra;
    public com.bytedance.adsdk.ugeno.core.vt.yu fkw;

    /* renamed from: le, reason: collision with root package name */
    public com.bytedance.adsdk.ugeno.core.ouw.ouw f6877le;

    /* renamed from: lh, reason: collision with root package name */
    public ouw f6878lh;
    public List<com.bytedance.adsdk.ugeno.core.vt> ouw;
    public com.bytedance.adsdk.ugeno.core.lh vt;
    public com.bytedance.adsdk.ugeno.lh.ouw yu;

    private fkw() {
    }

    public static fkw ouw() {
        if (ra == null) {
            synchronized (fkw.class) {
                try {
                    if (ra == null) {
                        ra = new fkw();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return ra;
    }

    public static void ouw(pno pnoVar) {
        ArrayList arrayList = new ArrayList(new com.bytedance.adsdk.ugeno.yu.ouw().ouw());
        arrayList.addAll(pnoVar.ouw());
        tlj.ouw(arrayList);
    }

    public static void ouw(com.bytedance.adsdk.ugeno.yu.lh lhVar) {
        ArrayList arrayList = new ArrayList(new com.bytedance.adsdk.ugeno.yu.fkw().ouw());
        arrayList.addAll(lhVar.ouw());
        com.bytedance.adsdk.ugeno.yu.yu.ouw(arrayList);
    }
}

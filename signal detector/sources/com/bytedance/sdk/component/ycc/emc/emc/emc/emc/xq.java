package com.bytedance.sdk.component.ycc.emc.emc.emc.emc;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.ul;
import com.bytedance.sdk.component.ycc.emc.msw;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class xq {
    private static int xq = 20;
    private boolean bw;
    private final Context emc;
    private boolean msw;
    protected final List<com.bytedance.sdk.component.ycc.emc.dg.emc> ypw = new ArrayList();
    private final List<com.bytedance.sdk.component.ycc.emc.dg.emc> dg = new ArrayList();
    private boolean ycc = false;
    private volatile boolean uym = false;
    private final Runnable zz = new Runnable() { // from class: com.bytedance.sdk.component.ycc.emc.emc.emc.emc.xq.1
        @Override // java.lang.Runnable
        public void run() {
            ArrayList arrayList;
            synchronized (xq.this) {
                try {
                    xq.this.uym = false;
                    if (xq.this.ypw.isEmpty()) {
                        xq.this.ycc = false;
                        return;
                    }
                    if (xq.this.bw) {
                        int size = xq.this.ypw.size();
                        for (int i = 0; i < size; i++) {
                            xq.this.dg.add(xq.this.ypw.get(i));
                        }
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(xq.this.ypw);
                    }
                    xq.this.ypw.clear();
                    xq.this.ycc = false;
                    if (arrayList != null) {
                        xq.this.dg(arrayList);
                        return;
                    }
                    xq xqVar = xq.this;
                    xqVar.dg(xqVar.dg);
                    xq.this.dg.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    };

    public xq(Context context) {
        this.msw = true;
        this.emc = context;
        try {
            com.bytedance.sdk.component.ycc.emc.bw bwVarVk = msw.uym().vk();
            if (bwVarVk != null) {
                this.msw = bwVarVk.cf();
                this.bw = bwVarVk.vk();
                xq = bwVarVk.aa();
            }
            ul.emc("DBInsertMemRepo", "enableOpt:" + this.msw + ",BATCH_SIZE:" + xq, Boolean.valueOf(this.bw));
        } catch (Throwable unused) {
        }
    }

    public Context bw() {
        return this.emc;
    }

    public void dg(List<com.bytedance.sdk.component.ycc.emc.dg.emc> list) {
        com.bytedance.sdk.component.ycc.emc.emc.emc.xq.emc(bw(), ypw(), list);
    }

    public synchronized void xq(List<String> list) {
        if (list != null) {
            if (!list.isEmpty()) {
                try {
                    Iterator<com.bytedance.sdk.component.ycc.emc.dg.emc> it = this.ypw.iterator();
                    while (it.hasNext()) {
                        com.bytedance.sdk.component.ycc.emc.dg.emc next = it.next();
                        if (next != null) {
                            String strXq = next.xq();
                            if (!TextUtils.isEmpty(strXq) && list.contains(strXq)) {
                                it.remove();
                            }
                        }
                    }
                } catch (Throwable th) {
                    ypw();
                    th.getMessage();
                }
            }
        }
    }

    public long ycc() {
        return 10000L;
    }

    public abstract String ypw();

    private void emc() {
        if (!this.ycc) {
            com.bytedance.sdk.component.ycc.emc.uym.emc.emc().postDelayed(this.zz, this.bw ? ycc() : com.bytedance.sdk.component.ycc.emc.uym.emc.ypw());
            this.ycc = true;
        }
        if (this.msw && this.ypw.size() >= xq && !this.uym) {
            com.bytedance.sdk.component.ycc.emc.uym.emc.emc().removeCallbacks(this.zz);
            com.bytedance.sdk.component.ycc.emc.uym.emc.emc().post(this.zz);
            this.ycc = true;
            this.uym = true;
        }
    }

    public synchronized void emc(com.bytedance.sdk.component.ycc.emc.dg.emc emcVar) {
        if (emcVar.uym() != null && !TextUtils.isEmpty(emcVar.xq())) {
            this.ypw.add(emcVar);
            emc();
        }
    }
}

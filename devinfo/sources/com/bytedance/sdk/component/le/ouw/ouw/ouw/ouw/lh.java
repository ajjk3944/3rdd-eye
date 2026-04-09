package com.bytedance.sdk.component.le.ouw.ouw.ouw.ouw;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.le.ouw.pno;
import com.bytedance.sdk.component.utils.qbp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class lh {

    /* renamed from: lh, reason: collision with root package name */
    private static int f7546lh = 20;
    private boolean fkw;
    private final Context ouw;
    private boolean pno;
    protected final List<com.bytedance.sdk.component.le.ouw.yu.ouw> vt = new ArrayList();
    private final List<com.bytedance.sdk.component.le.ouw.yu.ouw> yu = new ArrayList();

    /* renamed from: le, reason: collision with root package name */
    private boolean f7547le = false;
    private volatile boolean ra = false;
    private final Runnable bly = new Runnable() { // from class: com.bytedance.sdk.component.le.ouw.ouw.ouw.ouw.lh.1
        @Override // java.lang.Runnable
        public final void run() {
            ArrayList arrayList;
            synchronized (lh.this) {
                try {
                    lh.ouw(lh.this);
                    if (lh.this.vt.isEmpty()) {
                        lh.vt(lh.this);
                        return;
                    }
                    if (lh.this.fkw) {
                        int size = lh.this.vt.size();
                        for (int i4 = 0; i4 < size; i4++) {
                            lh.this.yu.add(lh.this.vt.get(i4));
                        }
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(lh.this.vt);
                    }
                    lh.this.vt.clear();
                    lh.vt(lh.this);
                    if (arrayList != null) {
                        lh.this.lh(arrayList);
                        return;
                    }
                    lh lhVar = lh.this;
                    lhVar.lh(lhVar.yu);
                    lh.this.yu.clear();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    };

    public lh(Context context) {
        this.pno = true;
        this.ouw = context;
        try {
            com.bytedance.sdk.component.le.ouw.fkw fkwVar = pno.vt().bly;
            if (fkwVar != null) {
                this.pno = fkwVar.bly();
                this.fkw = fkwVar.tlj();
                f7546lh = fkwVar.cf();
            }
            qbp.ouw("DBInsertMemRepo", "enableOpt:" + this.pno + ",BATCH_SIZE:" + f7546lh, Boolean.valueOf(this.fkw));
        } catch (Throwable unused) {
        }
    }

    public static /* synthetic */ boolean ouw(lh lhVar) {
        lhVar.ra = false;
        return false;
    }

    public static /* synthetic */ boolean vt(lh lhVar) {
        lhVar.f7547le = false;
        return false;
    }

    public long fkw() {
        return 10000L;
    }

    public abstract String ouw();

    public final void lh(List<com.bytedance.sdk.component.le.ouw.yu.ouw> list) {
        Context context = this.ouw;
        String strOuw = ouw();
        if (list == null || TextUtils.isEmpty(strOuw)) {
            return;
        }
        try {
            com.bytedance.sdk.component.le.ouw.ouw.ouw.ouw.ouw(context).ouw().ouw(strOuw, (String) null, list);
        } catch (Throwable unused) {
            com.bytedance.sdk.component.le.ouw.lh.vt.ouw();
        }
    }

    public final synchronized void ouw(com.bytedance.sdk.component.le.ouw.yu.ouw ouwVar) {
        try {
            if (ouwVar.ra() != null && !TextUtils.isEmpty(ouwVar.lh())) {
                this.vt.add(ouwVar);
                if (!this.f7547le) {
                    com.bytedance.sdk.component.le.ouw.ra.ouw.ouw().postDelayed(this.bly, this.fkw ? fkw() : com.bytedance.sdk.component.le.ouw.ra.ouw.vt());
                    this.f7547le = true;
                }
                if (this.pno && this.vt.size() >= f7546lh && !this.ra) {
                    com.bytedance.sdk.component.le.ouw.ra.ouw.ouw().removeCallbacks(this.bly);
                    com.bytedance.sdk.component.le.ouw.ra.ouw.ouw().post(this.bly);
                    this.f7547le = true;
                    this.ra = true;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void vt(List<String> list) {
        if (list != null) {
            if (!list.isEmpty()) {
                try {
                    Iterator<com.bytedance.sdk.component.le.ouw.yu.ouw> it = this.vt.iterator();
                    while (it.hasNext()) {
                        com.bytedance.sdk.component.le.ouw.yu.ouw next = it.next();
                        if (next != null) {
                            String strLh = next.lh();
                            if (!TextUtils.isEmpty(strLh) && list.contains(strLh)) {
                                it.remove();
                            }
                        }
                    }
                } catch (Throwable th2) {
                    ouw();
                    th2.getMessage();
                    com.bytedance.sdk.component.le.ouw.lh.vt.fkw();
                }
            }
        }
    }

    public final Context yu() {
        return this.ouw;
    }
}

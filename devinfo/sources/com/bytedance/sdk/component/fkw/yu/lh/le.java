package com.bytedance.sdk.component.fkw.yu.lh;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;
import com.bytedance.sdk.component.fkw.mwh;
import com.bytedance.sdk.component.fkw.qbp;
import com.bytedance.sdk.component.fkw.vm;
import com.bytedance.sdk.component.fkw.zih;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class le {
    private ExecutorService bly;
    ExecutorService fkw;

    /* renamed from: le, reason: collision with root package name */
    public Context f7495le;

    /* renamed from: lh, reason: collision with root package name */
    volatile vm f7496lh;
    public Map<String, List<lh>> ouw = new ConcurrentHashMap();
    private Map<String, com.bytedance.sdk.component.fkw.lh> pno = new ConcurrentHashMap();
    private volatile zih ra;
    public final mwh vt;
    public com.bytedance.sdk.component.fkw.yu yu;

    public le(Context context, mwh mwhVar) {
        this.vt = mwhVar;
        this.f7495le = context;
        com.bytedance.sdk.component.fkw.yu.lh.ouw.vt.ouw(context, mwhVar.pno());
    }

    private com.bytedance.sdk.component.fkw.lh yu(com.bytedance.sdk.component.fkw.vt vtVar) {
        com.bytedance.sdk.component.fkw.lh lhVarRa = this.vt.ra();
        return lhVarRa != null ? lhVarRa : new com.bytedance.sdk.component.fkw.yu.lh.ouw.ouw.vt(vtVar.pno(), vtVar.ouw());
    }

    public final com.bytedance.sdk.component.fkw.lh lh(com.bytedance.sdk.component.fkw.vt vtVar) {
        if (vtVar == null) {
            vtVar = com.bytedance.sdk.component.fkw.yu.lh.ouw.vt.bly();
        }
        String string = vtVar.pno().toString();
        com.bytedance.sdk.component.fkw.lh lhVar = this.pno.get(string);
        if (lhVar != null) {
            return lhVar;
        }
        com.bytedance.sdk.component.fkw.lh lhVarYu = yu(vtVar);
        this.pno.put(string, lhVarYu);
        return lhVarYu;
    }

    public final Collection<com.bytedance.sdk.component.fkw.lh> ouw() {
        return this.pno.values();
    }

    public final vm vt(com.bytedance.sdk.component.fkw.vt vtVar) {
        if (vtVar == null) {
            vtVar = com.bytedance.sdk.component.fkw.yu.lh.ouw.vt.bly();
        }
        if (this.f7496lh == null) {
            synchronized (com.bytedance.sdk.component.fkw.yu.lh.ouw.vt.vt.class) {
                try {
                    if (this.f7496lh == null) {
                        this.f7496lh = new com.bytedance.sdk.component.fkw.yu.lh.ouw.vt.vt(vtVar.vt(), vtVar.yu());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f7496lh;
    }

    public final zih ouw(com.bytedance.sdk.component.fkw.vt vtVar) {
        if (vtVar == null) {
            vtVar = com.bytedance.sdk.component.fkw.yu.lh.ouw.vt.bly();
        }
        if (this.ra == null) {
            synchronized (com.bytedance.sdk.component.fkw.yu.lh.ouw.vt.lh.class) {
                try {
                    if (this.ra == null) {
                        this.ra = new com.bytedance.sdk.component.fkw.yu.lh.ouw.vt.lh(new com.bytedance.sdk.component.fkw.yu.lh.ouw.vt.ouw(vtVar.vt(), vtVar.lh()));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.ra;
    }

    public final ExecutorService vt() {
        ExecutorService executorServiceVt;
        qbp qbpVarLh = this.vt.lh();
        if (qbpVarLh != null && (executorServiceVt = qbpVarLh.vt()) != null) {
            return executorServiceVt;
        }
        if (this.bly == null) {
            this.bly = com.bytedance.sdk.component.fkw.yu.ouw.vt.ouw();
        }
        return this.bly;
    }

    public static com.bytedance.sdk.component.fkw.yu.lh.vt.vt ouw(lh lhVar) {
        ImageView.ScaleType scaleType = lhVar.fkw;
        if (scaleType == null) {
            scaleType = com.bytedance.sdk.component.fkw.yu.lh.vt.vt.ouw;
        }
        ImageView.ScaleType scaleType2 = scaleType;
        Bitmap.Config config = lhVar.f7500le;
        if (config == null) {
            config = com.bytedance.sdk.component.fkw.yu.lh.vt.vt.vt;
        }
        return new com.bytedance.sdk.component.fkw.yu.lh.vt.vt(lhVar.ra, lhVar.pno, scaleType2, config, lhVar.vpp, lhVar.jqy);
    }
}

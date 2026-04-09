package com.bytedance.sdk.component.bw.dg.xq;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;
import com.bytedance.sdk.component.bw.aa;
import com.bytedance.sdk.component.bw.sba;
import com.bytedance.sdk.component.bw.sz;
import com.bytedance.sdk.component.bw.ul;
import com.bytedance.sdk.component.bw.ylm;
import java.io.File;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public class ycc {
    private volatile sba dg;
    private ExecutorService msw;
    private ExecutorService uym;
    private volatile aa xq;
    private com.bytedance.sdk.component.bw.dg ycc;
    private final sz ypw;
    private Context zz;
    private Map<String, List<xq>> emc = new ConcurrentHashMap();
    private Map<String, com.bytedance.sdk.component.bw.xq> bw = new ConcurrentHashMap();

    public ycc(Context context, sz szVar) {
        this.ypw = (sz) uym.emc(szVar);
        this.zz = context;
        com.bytedance.sdk.component.bw.dg.xq.emc.ypw.emc(context, szVar.msw());
    }

    private com.bytedance.sdk.component.bw.xq dg(com.bytedance.sdk.component.bw.ypw ypwVar) {
        com.bytedance.sdk.component.bw.xq xqVarUym = this.ypw.uym();
        return xqVarUym != null ? xqVarUym : new com.bytedance.sdk.component.bw.dg.xq.emc.emc.ypw(ypwVar.msw(), ypwVar.emc());
    }

    private ExecutorService gbl() {
        ExecutorService executorServiceYpw = this.ypw.ypw();
        return executorServiceYpw != null ? executorServiceYpw : com.bytedance.sdk.component.bw.dg.emc.ypw.emc();
    }

    private com.bytedance.sdk.component.bw.dg ru() {
        com.bytedance.sdk.component.bw.dg dgVarDg = this.ypw.dg();
        return dgVarDg == null ? new com.bytedance.sdk.component.bw.ypw.emc() : dgVarDg;
    }

    public ExecutorService bw() {
        ExecutorService executorServiceEmc;
        ul ulVarXq = this.ypw.xq();
        if (ulVarXq != null && (executorServiceEmc = ulVarXq.emc()) != null) {
            return executorServiceEmc;
        }
        if (this.uym == null) {
            this.uym = gbl();
        }
        return this.uym;
    }

    public Context emc() {
        return this.zz;
    }

    public ExecutorService msw() {
        ExecutorService executorServiceYpw;
        ul ulVarXq = this.ypw.xq();
        if (ulVarXq != null && (executorServiceYpw = ulVarXq.ypw()) != null) {
            return executorServiceYpw;
        }
        if (this.msw == null) {
            this.msw = com.bytedance.sdk.component.bw.dg.emc.ypw.emc();
        }
        return this.msw;
    }

    public boolean uym() {
        sz szVar = this.ypw;
        if (szVar != null) {
            return szVar.ru();
        }
        return false;
    }

    public Collection<com.bytedance.sdk.component.bw.xq> xq() {
        return this.bw.values();
    }

    public ylm ycc() {
        sz szVar = this.ypw;
        if (szVar != null) {
            return szVar.zz();
        }
        return null;
    }

    public sba ypw() {
        return this.dg;
    }

    public Map<String, List<xq>> zz() {
        return this.emc;
    }

    public aa emc(com.bytedance.sdk.component.bw.ypw ypwVar) {
        if (ypwVar == null) {
            ypwVar = com.bytedance.sdk.component.bw.dg.xq.emc.ypw.ru();
        }
        if (this.xq == null) {
            synchronized (com.bytedance.sdk.component.bw.dg.xq.emc.ypw.xq.class) {
                try {
                    if (this.xq == null) {
                        this.xq = new com.bytedance.sdk.component.bw.dg.xq.emc.ypw.xq(new com.bytedance.sdk.component.bw.dg.xq.emc.ypw.emc(ypwVar.ypw(), ypwVar.xq()));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.xq;
    }

    public com.bytedance.sdk.component.bw.xq xq(com.bytedance.sdk.component.bw.ypw ypwVar) {
        if (ypwVar == null) {
            ypwVar = com.bytedance.sdk.component.bw.dg.xq.emc.ypw.ru();
        }
        String string = ypwVar.msw().toString();
        com.bytedance.sdk.component.bw.xq xqVar = this.bw.get(string);
        if (xqVar != null) {
            return xqVar;
        }
        com.bytedance.sdk.component.bw.xq xqVarDg = dg(ypwVar);
        this.bw.put(string, xqVarDg);
        return xqVarDg;
    }

    public sba ypw(com.bytedance.sdk.component.bw.ypw ypwVar) {
        if (ypwVar == null) {
            ypwVar = com.bytedance.sdk.component.bw.dg.xq.emc.ypw.ru();
        }
        if (this.dg == null) {
            synchronized (com.bytedance.sdk.component.bw.dg.xq.emc.ypw.ypw.class) {
                try {
                    if (this.dg == null) {
                        this.dg = new com.bytedance.sdk.component.bw.dg.xq.emc.ypw.ypw(ypwVar.ypw(), ypwVar.dg());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.dg;
    }

    public com.bytedance.sdk.component.bw.dg dg() {
        if (this.ycc == null) {
            this.ycc = ru();
        }
        return this.ycc;
    }

    public com.bytedance.sdk.component.bw.xq emc(String str) {
        return xq(com.bytedance.sdk.component.bw.dg.xq.emc.ypw.emc(new File(str)));
    }

    public com.bytedance.sdk.component.bw.dg.xq.ypw.ypw emc(xq xqVar) {
        ImageView.ScaleType scaleTypeDg = xqVar.dg();
        if (scaleTypeDg == null) {
            scaleTypeDg = com.bytedance.sdk.component.bw.dg.xq.ypw.ypw.emc;
        }
        ImageView.ScaleType scaleType = scaleTypeDg;
        Bitmap.Config configGbl = xqVar.gbl();
        if (configGbl == null) {
            configGbl = com.bytedance.sdk.component.bw.dg.xq.ypw.ypw.ypw;
        }
        return new com.bytedance.sdk.component.bw.dg.xq.ypw.ypw(xqVar.ypw(), xqVar.xq(), scaleType, configGbl, xqVar.ycc(), xqVar.uym());
    }
}

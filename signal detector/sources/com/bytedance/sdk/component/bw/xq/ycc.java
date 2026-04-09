package com.bytedance.sdk.component.bw.xq;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;
import com.bytedance.sdk.component.bw.aa;
import com.bytedance.sdk.component.bw.sba;
import com.bytedance.sdk.component.bw.sup;
import com.bytedance.sdk.component.bw.sz;
import com.bytedance.sdk.component.bw.ul;
import com.bytedance.sdk.component.bw.ylm;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public class ycc {
    private ExecutorService msw;
    private sup uym;
    private com.bytedance.sdk.component.bw.dg ycc;
    private final sz ypw;
    private Map<String, List<xq>> emc = new ConcurrentHashMap();
    private Map<String, aa> xq = new HashMap();
    private Map<String, sba> dg = new HashMap();
    private Map<String, com.bytedance.sdk.component.bw.xq> bw = new HashMap();

    public ycc(Context context, sz szVar) {
        this.ypw = (sz) uym.emc(szVar);
        com.bytedance.sdk.component.bw.xq.emc.emc.emc(context, szVar.msw());
    }

    private sba bw(com.bytedance.sdk.component.bw.ypw ypwVar) {
        sba sbaVarYcc = this.ypw.ycc();
        return sbaVarYcc != null ? sbaVarYcc : com.bytedance.sdk.component.bw.xq.emc.ypw.bw.emc(ypwVar.ypw());
    }

    private aa dg(com.bytedance.sdk.component.bw.ypw ypwVar) {
        aa aaVarBw = this.ypw.bw();
        return aaVarBw != null ? com.bytedance.sdk.component.bw.xq.emc.ypw.emc.emc(aaVarBw) : com.bytedance.sdk.component.bw.xq.emc.ypw.emc.emc(ypwVar.ypw());
    }

    private ExecutorService gbl() {
        ExecutorService executorServiceYpw = this.ypw.ypw();
        return executorServiceYpw != null ? executorServiceYpw : com.bytedance.sdk.component.bw.emc.xq.emc();
    }

    private sup ru() {
        sup supVarEmc = this.ypw.emc();
        return supVarEmc != null ? supVarEmc : com.bytedance.sdk.component.bw.emc.ypw.emc();
    }

    private com.bytedance.sdk.component.bw.xq ycc(com.bytedance.sdk.component.bw.ypw ypwVar) {
        com.bytedance.sdk.component.bw.xq xqVarUym = this.ypw.uym();
        return xqVarUym != null ? xqVarUym : new com.bytedance.sdk.component.bw.xq.emc.emc.ypw(ypwVar.msw(), ypwVar.emc(), uym());
    }

    private com.bytedance.sdk.component.bw.dg zz() {
        com.bytedance.sdk.component.bw.dg dgVarDg = this.ypw.dg();
        return dgVarDg == null ? new com.bytedance.sdk.component.bw.ypw.emc() : dgVarDg;
    }

    public Collection<aa> emc() {
        return this.xq.values();
    }

    public Map<String, List<xq>> msw() {
        return this.emc;
    }

    public ExecutorService uym() {
        ExecutorService executorServiceEmc;
        ul ulVarXq = this.ypw.xq();
        if (ulVarXq != null && (executorServiceEmc = ulVarXq.emc()) != null) {
            return executorServiceEmc;
        }
        if (this.msw == null) {
            this.msw = gbl();
        }
        return this.msw;
    }

    public Collection<com.bytedance.sdk.component.bw.xq> xq() {
        return this.bw.values();
    }

    public Collection<sba> ypw() {
        return this.dg.values();
    }

    public aa emc(com.bytedance.sdk.component.bw.ypw ypwVar) {
        if (ypwVar == null) {
            ypwVar = com.bytedance.sdk.component.bw.xq.emc.emc.ru();
        }
        String string = ypwVar.msw().toString();
        aa aaVar = this.xq.get(string);
        if (aaVar != null) {
            return aaVar;
        }
        aa aaVarDg = dg(ypwVar);
        this.xq.put(string, aaVarDg);
        return aaVarDg;
    }

    public com.bytedance.sdk.component.bw.xq xq(com.bytedance.sdk.component.bw.ypw ypwVar) {
        if (ypwVar == null) {
            ypwVar = com.bytedance.sdk.component.bw.xq.emc.emc.ru();
        }
        String string = ypwVar.msw().toString();
        com.bytedance.sdk.component.bw.xq xqVar = this.bw.get(string);
        if (xqVar != null) {
            return xqVar;
        }
        com.bytedance.sdk.component.bw.xq xqVarYcc = ycc(ypwVar);
        this.bw.put(string, xqVarYcc);
        return xqVarYcc;
    }

    public sba ypw(com.bytedance.sdk.component.bw.ypw ypwVar) {
        if (ypwVar == null) {
            ypwVar = com.bytedance.sdk.component.bw.xq.emc.emc.ru();
        }
        String string = ypwVar.msw().toString();
        sba sbaVar = this.dg.get(string);
        if (sbaVar != null) {
            return sbaVar;
        }
        sba sbaVarBw = bw(ypwVar);
        this.dg.put(string, sbaVarBw);
        return sbaVarBw;
    }

    public ylm bw() {
        sz szVar = this.ypw;
        if (szVar != null) {
            return szVar.zz();
        }
        return null;
    }

    public sup ycc() {
        if (this.uym == null) {
            this.uym = ru();
        }
        return this.uym;
    }

    public com.bytedance.sdk.component.bw.dg dg() {
        if (this.ycc == null) {
            this.ycc = zz();
        }
        return this.ycc;
    }

    public com.bytedance.sdk.component.bw.xq emc(String str) {
        return xq(com.bytedance.sdk.component.bw.xq.emc.emc.emc(new File(str)));
    }

    public com.bytedance.sdk.component.bw.xq.ypw.emc emc(xq xqVar) {
        ImageView.ScaleType scaleTypeDg = xqVar.dg();
        if (scaleTypeDg == null) {
            scaleTypeDg = com.bytedance.sdk.component.bw.xq.ypw.emc.emc;
        }
        ImageView.ScaleType scaleType = scaleTypeDg;
        Bitmap.Config configGbl = xqVar.gbl();
        if (configGbl == null) {
            configGbl = com.bytedance.sdk.component.bw.xq.ypw.emc.ypw;
        }
        return new com.bytedance.sdk.component.bw.xq.ypw.emc(xqVar.ypw(), xqVar.xq(), scaleType, configGbl, xqVar.ycc(), xqVar.uym());
    }
}

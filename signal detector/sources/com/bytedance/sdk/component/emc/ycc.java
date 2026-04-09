package com.bytedance.sdk.component.emc;

import com.bytedance.sdk.component.emc.xq;
import j$.util.Objects;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
class ycc {
    private final uym emc;
    private final com.bytedance.sdk.component.emc.emc msw;
    private final gbl uym;
    private final Map<String, ypw> ypw = new HashMap();
    private final aa<String, sba> xq = new aa<>();
    private final Map<String, xq.ypw> dg = new HashMap();
    private final List<qh> bw = new ArrayList();
    private final Set<xq> ycc = new HashSet();

    public static final class emc {
        boolean emc;
        String ypw;

        private emc(boolean z6, String str) {
            this.emc = z6;
            this.ypw = str;
        }
    }

    public ycc(zz zzVar, com.bytedance.sdk.component.emc.emc emcVar) {
        this.msw = emcVar;
        this.emc = zzVar.dg;
        this.uym = zzVar.msw;
    }

    public emc emc(qh qhVar, bw bwVar) {
        ypw ypwVar = this.ypw.get(qhVar.dg);
        if (ypwVar != null) {
            try {
                if (ypwVar instanceof dg) {
                    qhVar.toString();
                    return emc(qhVar, (dg) ypwVar, bwVar);
                }
            } catch (IllegalStateException unused) {
                qhVar.toString();
                this.bw.add(qhVar);
                return new emc(false, yzg.emc());
            }
        }
        sba sbaVarEmc = this.xq.emc(qhVar.dg);
        if (sbaVarEmc != null) {
            qhVar.toString();
            return emc(qhVar, sbaVarEmc, bwVar);
        }
        xq.ypw ypwVar2 = this.dg.get(qhVar.dg);
        if (ypwVar2 == null) {
            qhVar.toString();
            return null;
        }
        xq xqVarEmc = ypwVar2.emc();
        xqVarEmc.emc(qhVar.dg);
        qhVar.toString();
        return emc(qhVar, xqVarEmc, bwVar);
    }

    public void emc(String str, dg<?, ?> dgVar) {
        dgVar.emc(str);
        this.ypw.put(str, dgVar);
    }

    public void emc(Set<String> set, sba<?, ?> sbaVar) {
        sbaVar.emc(set);
        this.xq.emc(set, sbaVar);
        Objects.toString(set);
    }

    public void emc(String str, xq.ypw ypwVar) {
        this.dg.put(str, ypwVar);
    }

    public void emc() {
        Iterator<xq> it = this.ycc.iterator();
        while (it.hasNext()) {
            it.next().bw();
        }
        this.ycc.clear();
        this.ypw.clear();
        this.dg.clear();
        this.xq.emc();
    }

    private emc emc(qh qhVar, dg dgVar, bw bwVar) {
        return new emc(true, yzg.emc(this.emc.emc((uym) dgVar.emc(qhVar.dg, emc(qhVar.bw, (ypw) dgVar), bwVar)), dgVar.ypw()));
    }

    private emc emc(final qh qhVar, final xq xqVar, bw bwVar) {
        this.ycc.add(xqVar);
        xqVar.emc(emc(qhVar.bw, xqVar), bwVar, new xq.emc() { // from class: com.bytedance.sdk.component.emc.ycc.1
            @Override // com.bytedance.sdk.component.emc.xq.emc
            public void emc(Object obj) {
                if (ycc.this.msw == null) {
                    return;
                }
                ycc.this.msw.ypw(yzg.emc(ycc.this.emc.emc((uym) obj), xqVar.ypw()), qhVar);
                ycc.this.ycc.remove(xqVar);
            }

            @Override // com.bytedance.sdk.component.emc.xq.emc
            public void emc(Throwable th) {
                if (ycc.this.msw == null) {
                    return;
                }
                ycc.this.msw.ypw(yzg.emc(th), qhVar);
                ycc.this.ycc.remove(xqVar);
            }
        });
        return new emc(false, yzg.emc());
    }

    private Object emc(String str, ypw ypwVar) {
        return this.emc.emc(str, emc(ypwVar)[0]);
    }

    private static Type[] emc(Object obj) {
        Type genericSuperclass = obj.getClass().getGenericSuperclass();
        if (genericSuperclass != null) {
            return ((ParameterizedType) genericSuperclass).getActualTypeArguments();
        }
        throw new IllegalStateException("Method is not parameterized?!");
    }
}

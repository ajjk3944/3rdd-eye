package com.bytedance.sdk.openadsdk.component.reward;

import A2.C0115c;
import K1.c;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.bykv.vk.openvk.emc.emc.emc.xq.b;
import com.bytedance.sdk.component.utils.sb;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.model.dr;
import com.bytedance.sdk.openadsdk.core.model.ee;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.sra;
import com.bytedance.sdk.openadsdk.core.sz.xq.emc;
import com.bytedance.sdk.openadsdk.core.ylm;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class emc<L, A> {
    protected com.bytedance.sdk.component.msw.msw dg;
    protected final Context emc;
    protected final AtomicBoolean ypw = new AtomicBoolean(false);
    protected final List<emc<L, A>.dg> xq = Collections.synchronizedList(new ArrayList());
    private final sb.emc bw = new sb.emc() { // from class: com.bytedance.sdk.openadsdk.component.reward.emc.2
        @Override // com.bytedance.sdk.component.utils.sb.emc
        public void emc(Context context, Intent intent, boolean z6, int i) {
            if (z6) {
                emc emcVar = emc.this;
                if (emcVar.dg == null) {
                    emcVar.dg = new ypw("net connect task", emcVar.xq);
                    com.bytedance.sdk.component.utils.zz.emc().post(emc.this.dg);
                }
            }
        }
    };

    public class dg extends com.bytedance.sdk.component.msw.msw {
        final rie emc;
        final com.bytedance.sdk.openadsdk.core.model.emc xq;
        final AdSlot ypw;

        public dg(rie rieVar, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.emc emcVar) {
            super("VideoPreloadTask");
            this.emc = rieVar;
            this.ypw = adSlot;
            this.xq = emcVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            rie rieVar = this.emc;
            if (rieVar == null || rieVar.iat() == null) {
                return;
            }
            com.bytedance.sdk.openadsdk.core.sz.emc.ypw ypwVarEmc = rie.emc(((C0115c) CacheDirFactory.getICacheDir(this.emc.zxw())).b(), this.emc);
            ypwVarEmc.emc("material_meta", this.emc);
            ypwVarEmc.emc("ad_slot", this.ypw);
            com.bytedance.sdk.openadsdk.core.sz.bw.emc.emc(ypwVarEmc, new c() { // from class: com.bytedance.sdk.openadsdk.component.reward.emc.dg.1
                @Override // K1.a
                public void emc(b bVar, int i, String str) {
                }

                @Override // K1.a
                public void emc(b bVar, int i) {
                    qh qhVarEmc = emc.this.emc();
                    dg dgVar = dg.this;
                    qhVarEmc.emc(dgVar.ypw, dgVar.xq);
                }
            });
        }
    }

    public class xq {
        protected final com.bytedance.sdk.openadsdk.core.model.emc dg;
        protected final emc<L, A>.C0051emc emc;
        protected final AtomicInteger xq;
        protected final AtomicBoolean ypw;

        private int emc() {
            if (!this.dg.bw()) {
                return 0;
            }
            int i = 0;
            for (int i3 = 0; i3 < this.dg.dg().size(); i3++) {
                rie rieVar = this.dg.dg().get(i3);
                if (rieVar != null && !dr.xq(rieVar) && rieVar.iat() != null) {
                    i++;
                }
            }
            return i;
        }

        private xq(emc<L, A>.C0051emc c0051emc, com.bytedance.sdk.openadsdk.core.model.emc emcVar) {
            this.ypw = new AtomicBoolean(false);
            this.emc = c0051emc;
            this.dg = emcVar;
            this.xq = new AtomicInteger(emc());
        }

        public void emc(int i, String str) {
            if (this.xq.decrementAndGet() > 0 || !this.ypw.compareAndSet(false, true)) {
                return;
            }
            this.emc.emc(i, str);
            com.bytedance.sdk.openadsdk.vk.xq.emc("choose_ad_load_error", false, new com.bytedance.sdk.openadsdk.vk.ypw() { // from class: com.bytedance.sdk.openadsdk.component.reward.emc.xq.1
                @Override // com.bytedance.sdk.openadsdk.vk.ypw
                public com.bytedance.sdk.openadsdk.vk.emc.xq emc() throws JSONException {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("req_id", xq.this.dg.ypw());
                    return com.bytedance.sdk.openadsdk.vk.emc.dg.ypw().emc("choose_ad_load_error").ypw(jSONObject.toString());
                }
            });
        }

        public void emc(A a6) {
            this.xq.decrementAndGet();
            if (this.emc == null || !this.ypw.compareAndSet(false, true)) {
                return;
            }
            this.emc.emc(a6);
        }
    }

    public class ypw extends com.bytedance.sdk.component.msw.msw {
        private final List<emc<L, A>.dg> ypw;

        public ypw(String str, List<emc<L, A>.dg> list) {
            super(str);
            this.ypw = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            List<emc<L, A>.dg> list = this.ypw;
            if (list == null || list.isEmpty()) {
                emc.this.dg = null;
                return;
            }
            ArrayList arrayList = new ArrayList(this.ypw);
            this.ypw.clear();
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                try {
                    ((dg) obj).run();
                } catch (Exception e6) {
                    com.bytedance.sdk.component.utils.ul.emc("BVL", "continue download task error", e6);
                }
            }
            emc.this.dg = null;
        }
    }

    public emc(Context context) {
        this.emc = context == null ? com.bytedance.sdk.openadsdk.core.aa.emc() : context.getApplicationContext();
        xq();
    }

    private void dg(final AdSlot adSlot, final L l2) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        com.bytedance.sdk.openadsdk.core.aa.xq().emc(adSlot, emc(adSlot, false), ypw(), new sra.emc() { // from class: com.bytedance.sdk.openadsdk.component.reward.emc.6
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bytedance.sdk.openadsdk.core.sra.emc
            public void emc(int i, String str) {
                Object obj = l2;
                if (obj != null) {
                    emc.this.emc((emc) obj, i, str);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bytedance.sdk.openadsdk.core.sra.emc
            public void emc(com.bytedance.sdk.openadsdk.core.model.emc emcVar, com.bytedance.sdk.openadsdk.core.model.xq xqVar) {
                com.bytedance.sdk.openadsdk.core.model.emc emcVar2;
                if (emcVar.dg() != null && !emcVar.dg().isEmpty()) {
                    emc emcVar3 = emc.this;
                    Object objEmc = emcVar3.emc(emcVar3.emc, emcVar, adSlot);
                    if (!TextUtils.isEmpty(adSlot.getBidAdm())) {
                        com.bytedance.sdk.openadsdk.ylm.emc.dg.emc().emc(emcVar.dg().isEmpty() ? null : emcVar.dg().get(0));
                        com.bytedance.sdk.openadsdk.vk.xq.emc(emcVar.ycc(), System.currentTimeMillis() - jCurrentTimeMillis);
                    }
                    if (l2 == null || com.bytedance.sdk.openadsdk.core.aa.dg().sf() != 0) {
                        emcVar2 = emcVar;
                    } else {
                        emc.this.emc(adSlot, emcVar, (com.bytedance.sdk.openadsdk.core.model.emc) l2, objEmc, false);
                        emcVar2 = emcVar;
                        objEmc = objEmc;
                    }
                    emc.this.emc(emcVar2, (com.bytedance.sdk.openadsdk.core.model.emc) objEmc, adSlot, false, (boolean) l2);
                    return;
                }
                Object obj = l2;
                if (obj != null) {
                    emc.this.emc((emc) obj, -3, com.bytedance.sdk.openadsdk.core.msw.emc(-3));
                    xqVar.emc(-3);
                    xqVar.xq(emc.this.ycc());
                    com.bytedance.sdk.openadsdk.core.model.xq.emc(xqVar);
                }
            }
        });
    }

    private void xq(final AdSlot adSlot) {
        if (emc().ypw(adSlot.getCodeId(), false) != null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.aa.xq().emc(adSlot, emc(adSlot, true), ypw(), new sra.emc() { // from class: com.bytedance.sdk.openadsdk.component.reward.emc.3
            @Override // com.bytedance.sdk.openadsdk.core.sra.emc
            public void emc(int i, String str) {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bytedance.sdk.openadsdk.core.sra.emc
            public void emc(com.bytedance.sdk.openadsdk.core.model.emc emcVar, com.bytedance.sdk.openadsdk.core.model.xq xqVar) {
                if (emcVar.dg() == null || emcVar.dg().isEmpty()) {
                    return;
                }
                emc emcVar2 = emc.this;
                emc.this.emc(emcVar, (com.bytedance.sdk.openadsdk.core.model.emc) emcVar2.emc(emcVar2.emc, emcVar, adSlot), adSlot, true, (boolean) null);
            }
        });
    }

    private void ypw(final AdSlot adSlot) {
        com.bytedance.sdk.openadsdk.core.aa.xq().emc(adSlot, emc(adSlot, true), ypw(), (com.bytedance.sdk.openadsdk.core.ul) new ylm() { // from class: com.bytedance.sdk.openadsdk.component.reward.emc.1
            boolean emc = false;

            @Override // com.bytedance.sdk.openadsdk.core.ylm, com.bytedance.sdk.openadsdk.core.sra.emc
            public void emc(int i, String str) {
            }

            @Override // com.bytedance.sdk.openadsdk.core.ylm, com.bytedance.sdk.openadsdk.core.ul
            public String emc() {
                return emc.this.emc().emc(adSlot.getCodeId(), false);
            }

            @Override // com.bytedance.sdk.openadsdk.core.ylm, com.bytedance.sdk.openadsdk.core.ul
            public boolean emc(com.bytedance.sdk.openadsdk.core.model.emc emcVar) {
                boolean zEmc = emc.this.emc().emc(emcVar);
                this.emc = zEmc;
                return zEmc;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bytedance.sdk.openadsdk.core.ylm, com.bytedance.sdk.openadsdk.core.sra.emc
            public void emc(com.bytedance.sdk.openadsdk.core.model.emc emcVar, com.bytedance.sdk.openadsdk.core.model.xq xqVar) {
                if (this.emc || emcVar.dg() == null || emcVar.dg().isEmpty()) {
                    return;
                }
                emc emcVar2 = emc.this;
                emc.this.emc(emcVar, (com.bytedance.sdk.openadsdk.core.model.emc) emcVar2.emc(emcVar2.emc, emcVar, adSlot), adSlot, true, (boolean) null);
            }
        });
    }

    public void bw() {
        try {
            emc().emc();
        } catch (Throwable unused) {
        }
    }

    public abstract qh emc();

    public abstract A emc(Context context, com.bytedance.sdk.openadsdk.core.model.emc emcVar, AdSlot adSlot);

    public abstract Object emc(A a6);

    public abstract void emc(L l2, int i, String str);

    public abstract void emc(L l2, Object obj);

    public void finalize() throws Throwable {
        super.finalize();
        if (this.dg != null) {
            try {
                com.bytedance.sdk.component.utils.zz.emc().removeCallbacks(this.dg);
            } catch (Throwable unused) {
            }
            this.dg = null;
        }
        dg();
    }

    public abstract int ycc();

    public abstract int ypw();

    public abstract void ypw(A a6);

    /* renamed from: com.bytedance.sdk.openadsdk.component.reward.emc$emc, reason: collision with other inner class name */
    public class C0051emc {
        protected final boolean dg;
        protected final AdSlot emc;
        protected final L xq;
        protected final com.bytedance.sdk.openadsdk.core.model.emc ypw;

        public C0051emc(AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.emc emcVar, L l2, boolean z6) {
            this.emc = adSlot;
            this.ypw = emcVar;
            this.xq = l2;
            this.dg = z6;
        }

        public void emc(int i, String str) {
            L l2 = this.xq;
            if (l2 != null) {
                emc.this.emc((emc) l2, i, str);
            }
        }

        public void emc(A a6) {
            emc.this.emc(this.emc, this.ypw, (com.bytedance.sdk.openadsdk.core.model.emc) this.xq, (L) a6, this.dg);
        }
    }

    private void ypw(final AdSlot adSlot, final L l2) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        com.bytedance.sdk.openadsdk.core.aa.xq().emc(adSlot, emc(adSlot, false), ypw(), (com.bytedance.sdk.openadsdk.core.ul) new ylm() { // from class: com.bytedance.sdk.openadsdk.component.reward.emc.4
            boolean emc = false;

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bytedance.sdk.openadsdk.core.ylm, com.bytedance.sdk.openadsdk.core.sra.emc
            public void emc(int i, String str) {
                Object obj = l2;
                if (obj != null) {
                    emc.this.emc((emc) obj, i, str);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bytedance.sdk.openadsdk.core.ylm, com.bytedance.sdk.openadsdk.core.sra.emc
            public void emc(com.bytedance.sdk.openadsdk.core.model.emc emcVar, com.bytedance.sdk.openadsdk.core.model.xq xqVar) {
                com.bytedance.sdk.openadsdk.core.model.emc emcVar2;
                if (emcVar.dg() != null && !emcVar.dg().isEmpty()) {
                    emc emcVar3 = emc.this;
                    Object objEmc = emcVar3.emc(emcVar3.emc, emcVar, adSlot);
                    if (!TextUtils.isEmpty(adSlot.getBidAdm())) {
                        com.bytedance.sdk.openadsdk.ylm.emc.dg.emc().emc(emcVar.dg().isEmpty() ? null : emcVar.dg().get(0));
                        com.bytedance.sdk.openadsdk.vk.xq.emc(emcVar.ycc(), System.currentTimeMillis() - jCurrentTimeMillis);
                    }
                    if (l2 == null || com.bytedance.sdk.openadsdk.core.aa.dg().sf() != 0) {
                        emcVar2 = emcVar;
                    } else {
                        emc.this.emc(adSlot, emcVar, (com.bytedance.sdk.openadsdk.core.model.emc) l2, objEmc, this.emc);
                        emcVar2 = emcVar;
                        objEmc = objEmc;
                    }
                    emc.this.emc(emcVar2, (com.bytedance.sdk.openadsdk.core.model.emc) objEmc, adSlot, false, (boolean) l2);
                    return;
                }
                Object obj = l2;
                if (obj != null) {
                    emc.this.emc((emc) obj, -3, com.bytedance.sdk.openadsdk.core.msw.emc(-3));
                    xqVar.emc(-3);
                    xqVar.xq(emc.this.ycc());
                    com.bytedance.sdk.openadsdk.core.model.xq.emc(xqVar);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.ylm, com.bytedance.sdk.openadsdk.core.ul
            public String emc() {
                if (!TextUtils.isEmpty(adSlot.getBidAdm())) {
                    return null;
                }
                String strEmc = emc.this.emc().emc(adSlot.getCodeId(), true);
                TextUtils.isEmpty(strEmc);
                if (TextUtils.isEmpty(strEmc)) {
                    return null;
                }
                return strEmc;
            }

            @Override // com.bytedance.sdk.openadsdk.core.ylm, com.bytedance.sdk.openadsdk.core.ul
            public boolean emc(com.bytedance.sdk.openadsdk.core.model.emc emcVar) {
                boolean zEmc = emc.this.emc().emc(emcVar);
                this.emc = zEmc;
                return zEmc;
            }
        });
    }

    public void emc(AdSlot adSlot) {
        if (adSlot == null || TextUtils.isEmpty(adSlot.getCodeId()) || !TextUtils.isEmpty(adSlot.getBidAdm())) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.utils.ypw.emc()) {
            ypw(adSlot);
        } else {
            xq(adSlot);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dg(AdSlot adSlot) {
        emc().emc(adSlot.getCodeId());
    }

    private void xq(AdSlot adSlot, L l2) throws Throwable {
        com.bytedance.sdk.openadsdk.core.model.emc emcVarYpw;
        if (TextUtils.isEmpty(adSlot.getBidAdm()) && (emcVarYpw = emc().ypw(adSlot.getCodeId(), true)) != null && emcVarYpw.bw()) {
            emc(adSlot, emcVarYpw, (com.bytedance.sdk.openadsdk.core.model.emc) l2);
        } else {
            dg(adSlot, l2);
        }
    }

    public void dg() {
        if (this.ypw.get()) {
            this.ypw.set(false);
            try {
                sb.emc(this.bw);
            } catch (Exception unused) {
            }
        }
    }

    public void emc(AdSlot adSlot, L l2) throws Throwable {
        if (com.bytedance.sdk.openadsdk.utils.ypw.emc()) {
            Objects.toString(adSlot);
            Objects.toString(l2);
            ypw(adSlot, l2);
        } else {
            Objects.toString(adSlot);
            Objects.toString(l2);
            xq(adSlot, l2);
        }
    }

    public void xq() {
        if (this.ypw.get()) {
            return;
        }
        this.ypw.set(true);
        sb.emc(this.bw, this.emc);
    }

    private void emc(AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.emc emcVar, L l2) throws Throwable {
        rie rieVarYcc = emcVar.ycc();
        for (rie rieVar : emcVar.dg()) {
            if (rieVar.vaf() == null) {
                rieVar.emc(adSlot);
            }
        }
        A aEmc = emc(this.emc, emcVar, adSlot);
        if (!dr.xq(rieVarYcc)) {
            ypw((emc<L, A>) aEmc);
        }
        if (l2 != null) {
            com.bytedance.sdk.openadsdk.core.sup.xq.dg.emc(emcVar);
            if (com.bytedance.sdk.openadsdk.core.aa.dg().sf() == 0) {
                emc(adSlot, emcVar, (com.bytedance.sdk.openadsdk.core.model.emc) l2, (L) aEmc, true);
            }
            emc<L, A>.xq xqVar = new xq(new C0051emc(adSlot, emcVar, l2, true), emcVar);
            for (int i = 0; i < emcVar.dg().size(); i++) {
                emc(emcVar.dg().get(i), adSlot, xqVar, aEmc);
                if (emcVar.ru()) {
                    break;
                }
            }
        }
        for (final int i3 = 0; i3 < emcVar.dg().size(); i3++) {
            com.bytedance.sdk.openadsdk.core.sz.xq.emc.emc().emc(emcVar.dg().get(i3), new emc.InterfaceC0078emc() { // from class: com.bytedance.sdk.openadsdk.component.reward.emc.5
                @Override // com.bytedance.sdk.openadsdk.core.sz.xq.emc.InterfaceC0078emc
                public void emc(boolean z6) {
                    com.bytedance.sdk.component.utils.ul.emc("BVL", "onCachedResponse: i=" + i3 + ", isSuccess=" + z6);
                }
            });
        }
    }

    public void emc(com.bytedance.sdk.openadsdk.core.model.emc emcVar, A a6, AdSlot adSlot, boolean z6, L l2) {
        if (!z6) {
            com.bytedance.sdk.openadsdk.qh.emc.emc().emc(emcVar.ycc());
        }
        emc<L, A> emcVar2 = this;
        AdSlot adSlot2 = adSlot;
        emc<L, A>.xq xqVar = new xq(emcVar2.new C0051emc(adSlot2, emcVar, l2, false), emcVar);
        emc(emcVar);
        int i = 0;
        while (i < emcVar.dg().size()) {
            rie rieVar = emcVar.dg().get(i);
            int iFu = rieVar.fu();
            if (i == 0 && iFu == 43) {
                rieVar.iat().f6593o = 0;
            }
            A a7 = a6;
            boolean z7 = z6;
            AdSlot adSlot3 = adSlot2;
            emcVar2.emc(emcVar, rieVar, (rie) a7, adSlot3, z7, (emc<L, rie>.xq) xqVar);
            adSlot2 = adSlot3;
            if (emcVar.ru() && iFu != 43) {
                return;
            }
            i++;
            emcVar2 = this;
            a6 = a7;
            z6 = z7;
        }
    }

    public void emc(com.bytedance.sdk.openadsdk.core.model.emc emcVar) {
        ee eeVarSup = emcVar.sup();
        int iVk = emcVar.ru() ? 10 : 1;
        if (eeVarSup != null) {
            iVk = eeVarSup.vk();
        }
        for (final int i = 0; i < emcVar.dg().size() && i < iVk; i++) {
            com.bytedance.sdk.openadsdk.core.sz.xq.emc.emc().emc(emcVar.dg().get(i), new emc.InterfaceC0078emc() { // from class: com.bytedance.sdk.openadsdk.component.reward.emc.7
                @Override // com.bytedance.sdk.openadsdk.core.sz.xq.emc.InterfaceC0078emc
                public void emc(boolean z6) {
                    com.bytedance.sdk.component.utils.ul.emc("BVL", "onCachedResponse: i=" + i + ", isSuccess=" + z6);
                }
            });
        }
    }

    private boolean emc(boolean z6, rie rieVar, AdSlot adSlot) {
        if (z6) {
            return !dr.xq(rieVar) && rie.bw(rieVar) && com.bytedance.sdk.openadsdk.core.aa.dg().db(adSlot.getCodeId()).dg == 1 && !com.bytedance.sdk.component.utils.sba.dg(this.emc);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean emc(emc<L, A>.xq xqVar) {
        return xqVar != null && com.bytedance.sdk.openadsdk.core.aa.dg().sf() == 1;
    }

    private void emc(rie rieVar, final AdSlot adSlot, final com.bytedance.sdk.openadsdk.core.model.emc emcVar, final A a6, final boolean z6, final emc<L, A>.xq xqVar) {
        com.bytedance.sdk.openadsdk.core.sz.emc.ypw ypwVarEmc = rie.emc(((C0115c) CacheDirFactory.getICacheDir(rieVar.zxw())).b(), rieVar);
        ypwVarEmc.emc("material_meta", rieVar);
        ypwVarEmc.emc("ad_slot", adSlot);
        com.bytedance.sdk.openadsdk.core.sz.bw.emc.emc(ypwVarEmc, new c() { // from class: com.bytedance.sdk.openadsdk.component.reward.emc.8
            /* JADX WARN: Multi-variable type inference failed */
            @Override // K1.a
            public void emc(b bVar, int i) {
                emc.this.ypw((emc) a6);
                if (z6) {
                    emc.this.emc().emc(adSlot, emcVar);
                } else if (emc.this.emc(xqVar)) {
                    xqVar.emc(a6);
                }
            }

            @Override // K1.a
            public void emc(b bVar, int i, String str) {
                if (emc.this.emc(xqVar)) {
                    xqVar.emc(i, str);
                }
            }
        });
    }

    public void emc(com.bytedance.sdk.openadsdk.core.model.emc emcVar, rie rieVar, A a6, AdSlot adSlot, boolean z6, emc<L, A>.xq xqVar) {
        A a7;
        emc<L, A>.xq xqVar2;
        if (emc(z6, rieVar, adSlot)) {
            emc((dg) new dg(rieVar, adSlot, emcVar));
            return;
        }
        boolean zEmc = emc((xq) xqVar);
        if (dr.xq(rieVar)) {
            a7 = a6;
            xqVar2 = xqVar;
            if (z6) {
                emc().emc(adSlot, emcVar);
            }
        } else if (!rie.bw(rieVar)) {
            a7 = a6;
            xqVar2 = xqVar;
            if (z6) {
                emc().emc(adSlot, emcVar);
            }
        } else {
            if (rieVar.iat() == null) {
                return;
            }
            a7 = a6;
            xqVar2 = xqVar;
            emc(rieVar, adSlot, emcVar, (com.bytedance.sdk.openadsdk.core.model.emc) a7, z6, (emc<L, com.bytedance.sdk.openadsdk.core.model.emc>.xq) xqVar2);
            zEmc = false;
        }
        if (zEmc) {
            xqVar2.emc(a7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void emc(com.bytedance.sdk.openadsdk.core.model.rie r4, com.bytedance.sdk.openadsdk.AdSlot r5, final com.bytedance.sdk.openadsdk.component.reward.emc<L, A>.xq r6, final A r7) {
        /*
            r3 = this;
            r0 = 0
            if (r6 == 0) goto Lf
            com.bytedance.sdk.openadsdk.core.settings.gbl r1 = com.bytedance.sdk.openadsdk.core.aa.dg()
            int r1 = r1.sf()
            r2 = 1
            if (r1 != r2) goto Lf
            goto L10
        Lf:
            r2 = r0
        L10:
            boolean r1 = com.bytedance.sdk.openadsdk.core.model.dr.xq(r4)
            if (r1 != 0) goto L41
            boolean r1 = com.bytedance.sdk.openadsdk.core.model.rie.bw(r4)
            if (r1 == 0) goto L41
            int r1 = r4.zxw()
            M1.b r1 = com.bytedance.sdk.openadsdk.CacheDirFactory.getICacheDir(r1)
            A2.c r1 = (A2.C0115c) r1
            java.lang.String r1 = r1.b()
            com.bytedance.sdk.openadsdk.core.sz.emc.ypw r1 = com.bytedance.sdk.openadsdk.core.model.rie.emc(r1, r4)
            java.lang.String r2 = "material_meta"
            r1.emc(r2, r4)
            java.lang.String r4 = "ad_slot"
            r1.emc(r4, r5)
            com.bytedance.sdk.openadsdk.component.reward.emc$9 r4 = new com.bytedance.sdk.openadsdk.component.reward.emc$9
            r4.<init>()
            com.bytedance.sdk.openadsdk.core.sz.bw.emc.emc(r1, r4)
            goto L42
        L41:
            r0 = r2
        L42:
            if (r0 == 0) goto L47
            r6.emc(r7)
        L47:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.reward.emc.emc(com.bytedance.sdk.openadsdk.core.model.rie, com.bytedance.sdk.openadsdk.AdSlot, com.bytedance.sdk.openadsdk.component.reward.emc$xq, java.lang.Object):void");
    }

    public void emc(final AdSlot adSlot, final com.bytedance.sdk.openadsdk.core.model.emc emcVar, L l2, A a6, final boolean z6) {
        com.bytedance.sdk.openadsdk.core.qh.ypw().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.emc.10
            @Override // java.lang.Runnable
            public void run() {
                if (z6) {
                    emc.this.dg(adSlot);
                } else {
                    emc.this.emc().emc(adSlot, emcVar);
                    emc.this.dg(adSlot);
                }
            }
        });
        if (l2 != null) {
            emc((emc<L, A>) l2, emc((emc<L, A>) a6));
        }
    }

    public void emc(emc<L, A>.dg dgVar) {
        if (dgVar == null) {
            return;
        }
        if (this.xq.size() > 0) {
            this.xq.remove(0);
        }
        this.xq.add(dgVar);
    }

    public com.bytedance.sdk.openadsdk.core.model.sb emc(AdSlot adSlot, boolean z6) {
        com.bytedance.sdk.openadsdk.core.model.sb sbVar = new com.bytedance.sdk.openadsdk.core.model.sb();
        if (adSlot != null && (com.bytedance.sdk.openadsdk.core.aa.dg().sup(adSlot.getCodeId()) || adSlot.getExpressViewAcceptedWidth() > 0.0f || adSlot.isExpressAd())) {
            sbVar.zz = 2;
        }
        if (ypw() == 7) {
            sbVar.ypw = z6 ? 2 : 1;
            return sbVar;
        }
        sbVar.xq = z6 ? 2 : 1;
        return sbVar;
    }

    public void emc(String str, rie rieVar) {
        emc().emc(str, rieVar);
    }
}

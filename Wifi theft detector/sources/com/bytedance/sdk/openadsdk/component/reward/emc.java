package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.sb;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.model.dr;
import com.bytedance.sdk.openadsdk.core.model.ee;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.sra;
import com.bytedance.sdk.openadsdk.core.sz.xq.emc;
import com.bytedance.sdk.openadsdk.core.ylm;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;
import r2.b;

/* loaded from: classes.dex */
public abstract class emc<L, A> {
    protected com.bytedance.sdk.component.msw.msw dg;
    protected final Context emc;
    protected final AtomicBoolean ypw = new AtomicBoolean(false);
    protected final List<emc<L, A>.dg> xq = Collections.synchronizedList(new ArrayList());
    private final sb.emc bw = new sb.emc() { // from class: com.bytedance.sdk.openadsdk.component.reward.emc.2
        @Override // com.bytedance.sdk.component.utils.sb.emc
        public void emc(Context context, Intent intent, boolean z10, int i10) {
            if (z10) {
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
            com.bytedance.sdk.openadsdk.core.sz.emc.ypw ypwVarEmc = rie.emc(CacheDirFactory.getICacheDir(this.emc.zxw()).emc(), this.emc);
            ypwVarEmc.emc("material_meta", this.emc);
            ypwVarEmc.emc("ad_slot", this.ypw);
            com.bytedance.sdk.openadsdk.core.sz.bw.emc.emc(ypwVarEmc, new b() { // from class: com.bytedance.sdk.openadsdk.component.reward.emc.dg.1
                @Override // r2.a.InterfaceC0474a
                public void emc(com.bykv.vk.openvk.emc.emc.emc.xq.xq xqVar, int i10, String str) {
                }

                @Override // r2.a.InterfaceC0474a
                public void emc(com.bykv.vk.openvk.emc.emc.emc.xq.xq xqVar, int i10) {
                    qh qhVarEmc = emc.this.emc();
                    dg dgVar = dg.this;
                    qhVarEmc.emc(dgVar.ypw, dgVar.xq);
                }
            });
        }
    }

    public class xq {
        protected final com.bytedance.sdk.openadsdk.core.model.emc dg;
        protected final emc<L, A>.C0136emc emc;
        protected final AtomicInteger xq;
        protected final AtomicBoolean ypw;

        private int emc() {
            if (!this.dg.bw()) {
                return 0;
            }
            int i10 = 0;
            for (int i11 = 0; i11 < this.dg.dg().size(); i11++) {
                rie rieVar = this.dg.dg().get(i11);
                if (rieVar != null && !dr.xq(rieVar) && rieVar.iat() != null) {
                    i10++;
                }
            }
            return i10;
        }

        private xq(emc<L, A>.C0136emc c0136emc, com.bytedance.sdk.openadsdk.core.model.emc emcVar) {
            this.ypw = new AtomicBoolean(false);
            this.emc = c0136emc;
            this.dg = emcVar;
            this.xq = new AtomicInteger(emc());
        }

        public void emc(int i10, String str) {
            if (this.xq.decrementAndGet() > 0 || !this.ypw.compareAndSet(false, true)) {
                return;
            }
            this.emc.emc(i10, str);
            com.bytedance.sdk.openadsdk.vk.xq.emc("choose_ad_load_error", false, new com.bytedance.sdk.openadsdk.vk.ypw() { // from class: com.bytedance.sdk.openadsdk.component.reward.emc.xq.1
                @Override // com.bytedance.sdk.openadsdk.vk.ypw
                @Nullable
                public com.bytedance.sdk.openadsdk.vk.emc.xq emc() throws Exception {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("req_id", xq.this.dg.ypw());
                    return com.bytedance.sdk.openadsdk.vk.emc.dg.ypw().emc("choose_ad_load_error").ypw(jSONObject.toString());
                }
            });
        }

        public void emc(A a10) {
            this.xq.decrementAndGet();
            if (this.emc == null || !this.ypw.compareAndSet(false, true)) {
                return;
            }
            this.emc.emc(a10);
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
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                try {
                    ((dg) obj).run();
                } catch (Exception e10) {
                    com.bytedance.sdk.component.utils.ul.emc("BVL", "continue download task error", e10);
                }
            }
            emc.this.dg = null;
        }
    }

    public emc(Context context) {
        this.emc = context == null ? com.bytedance.sdk.openadsdk.core.aa.emc() : context.getApplicationContext();
        xq();
    }

    private void dg(final AdSlot adSlot, final L l10) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        com.bytedance.sdk.openadsdk.core.aa.xq().emc(adSlot, emc(adSlot, false), ypw(), new sra.emc() { // from class: com.bytedance.sdk.openadsdk.component.reward.emc.6
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bytedance.sdk.openadsdk.core.sra.emc
            public void emc(int i10, String str) {
                Object obj = l10;
                if (obj != null) {
                    emc.this.emc((emc) obj, i10, str);
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
                    if (l10 == null || com.bytedance.sdk.openadsdk.core.aa.dg().sf() != 0) {
                        emcVar2 = emcVar;
                    } else {
                        emc.this.emc(adSlot, emcVar, (com.bytedance.sdk.openadsdk.core.model.emc) l10, objEmc, false);
                        emcVar2 = emcVar;
                        objEmc = objEmc;
                    }
                    emc.this.emc(emcVar2, (com.bytedance.sdk.openadsdk.core.model.emc) objEmc, adSlot, false, (boolean) l10);
                    return;
                }
                Object obj = l10;
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
            public void emc(int i10, String str) {
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
            public void emc(int i10, String str) {
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

    public abstract Object emc(A a10);

    public abstract void emc(L l10, int i10, String str);

    public abstract void emc(L l10, Object obj);

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

    public abstract void ypw(A a10);

    /* renamed from: com.bytedance.sdk.openadsdk.component.reward.emc$emc, reason: collision with other inner class name */
    public class C0136emc {
        protected final boolean dg;
        protected final AdSlot emc;
        protected final L xq;
        protected final com.bytedance.sdk.openadsdk.core.model.emc ypw;

        public C0136emc(AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.emc emcVar, L l10, boolean z10) {
            this.emc = adSlot;
            this.ypw = emcVar;
            this.xq = l10;
            this.dg = z10;
        }

        public void emc(int i10, String str) {
            L l10 = this.xq;
            if (l10 != null) {
                emc.this.emc((emc) l10, i10, str);
            }
        }

        public void emc(A a10) {
            emc.this.emc(this.emc, this.ypw, (com.bytedance.sdk.openadsdk.core.model.emc) this.xq, (L) a10, this.dg);
        }
    }

    private void ypw(final AdSlot adSlot, final L l10) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        com.bytedance.sdk.openadsdk.core.aa.xq().emc(adSlot, emc(adSlot, false), ypw(), (com.bytedance.sdk.openadsdk.core.ul) new ylm() { // from class: com.bytedance.sdk.openadsdk.component.reward.emc.4
            boolean emc = false;

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bytedance.sdk.openadsdk.core.ylm, com.bytedance.sdk.openadsdk.core.sra.emc
            public void emc(int i10, String str) {
                Object obj = l10;
                if (obj != null) {
                    emc.this.emc((emc) obj, i10, str);
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
                    if (l10 == null || com.bytedance.sdk.openadsdk.core.aa.dg().sf() != 0) {
                        emcVar2 = emcVar;
                    } else {
                        emc.this.emc(adSlot, emcVar, (com.bytedance.sdk.openadsdk.core.model.emc) l10, objEmc, this.emc);
                        emcVar2 = emcVar;
                        objEmc = objEmc;
                    }
                    emc.this.emc(emcVar2, (com.bytedance.sdk.openadsdk.core.model.emc) objEmc, adSlot, false, (boolean) l10);
                    return;
                }
                Object obj = l10;
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
                this.emc = emc.this.emc().emc(emcVar);
                return this.emc;
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

    private void xq(AdSlot adSlot, L l10) {
        com.bytedance.sdk.openadsdk.core.model.emc emcVarYpw;
        if (TextUtils.isEmpty(adSlot.getBidAdm()) && (emcVarYpw = emc().ypw(adSlot.getCodeId(), true)) != null && emcVarYpw.bw()) {
            emc(adSlot, emcVarYpw, (com.bytedance.sdk.openadsdk.core.model.emc) l10);
        } else {
            dg(adSlot, l10);
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

    public void emc(AdSlot adSlot, L l10) {
        if (com.bytedance.sdk.openadsdk.utils.ypw.emc()) {
            Objects.toString(adSlot);
            Objects.toString(l10);
            ypw(adSlot, l10);
        } else {
            Objects.toString(adSlot);
            Objects.toString(l10);
            xq(adSlot, l10);
        }
    }

    public void xq() {
        if (this.ypw.get()) {
            return;
        }
        this.ypw.set(true);
        sb.emc(this.bw, this.emc);
    }

    private void emc(AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.emc emcVar, L l10) {
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
        if (l10 != null) {
            com.bytedance.sdk.openadsdk.core.sup.xq.dg.emc(emcVar);
            if (com.bytedance.sdk.openadsdk.core.aa.dg().sf() == 0) {
                emc(adSlot, emcVar, (com.bytedance.sdk.openadsdk.core.model.emc) l10, (L) aEmc, true);
            }
            emc<L, A>.xq xqVar = new xq(new C0136emc(adSlot, emcVar, l10, true), emcVar);
            for (int i10 = 0; i10 < emcVar.dg().size(); i10++) {
                emc(emcVar.dg().get(i10), adSlot, xqVar, aEmc);
                if (emcVar.ru()) {
                    break;
                }
            }
        }
        for (final int i11 = 0; i11 < emcVar.dg().size(); i11++) {
            com.bytedance.sdk.openadsdk.core.sz.xq.emc.emc().emc(emcVar.dg().get(i11), new emc.InterfaceC0163emc() { // from class: com.bytedance.sdk.openadsdk.component.reward.emc.5
                @Override // com.bytedance.sdk.openadsdk.core.sz.xq.emc.InterfaceC0163emc
                public void emc(boolean z10) {
                    com.bytedance.sdk.component.utils.ul.emc("BVL", "onCachedResponse: i=" + i11 + ", isSuccess=" + z10);
                }
            });
        }
    }

    public void emc(com.bytedance.sdk.openadsdk.core.model.emc emcVar, A a10, AdSlot adSlot, boolean z10, L l10) {
        if (!z10) {
            com.bytedance.sdk.openadsdk.qh.emc.emc().emc(emcVar.ycc());
        }
        emc<L, A> emcVar2 = this;
        AdSlot adSlot2 = adSlot;
        emc<L, A>.xq xqVar = new xq(emcVar2.new C0136emc(adSlot2, emcVar, l10, false), emcVar);
        emc(emcVar);
        int i10 = 0;
        while (i10 < emcVar.dg().size()) {
            rie rieVar = emcVar.dg().get(i10);
            int iFu = rieVar.fu();
            if (i10 == 0 && iFu == 43) {
                rieVar.iat().F(0);
            }
            A a11 = a10;
            boolean z11 = z10;
            AdSlot adSlot3 = adSlot2;
            emcVar2.emc(emcVar, rieVar, (rie) a11, adSlot3, z11, (emc<L, rie>.xq) xqVar);
            adSlot2 = adSlot3;
            if (emcVar.ru() && iFu != 43) {
                return;
            }
            i10++;
            emcVar2 = this;
            a10 = a11;
            z10 = z11;
        }
    }

    public void emc(com.bytedance.sdk.openadsdk.core.model.emc emcVar) {
        ee eeVarSup = emcVar.sup();
        int iVk = emcVar.ru() ? 10 : 1;
        if (eeVarSup != null) {
            iVk = eeVarSup.vk();
        }
        for (final int i10 = 0; i10 < emcVar.dg().size() && i10 < iVk; i10++) {
            com.bytedance.sdk.openadsdk.core.sz.xq.emc.emc().emc(emcVar.dg().get(i10), new emc.InterfaceC0163emc() { // from class: com.bytedance.sdk.openadsdk.component.reward.emc.7
                @Override // com.bytedance.sdk.openadsdk.core.sz.xq.emc.InterfaceC0163emc
                public void emc(boolean z10) {
                    com.bytedance.sdk.component.utils.ul.emc("BVL", "onCachedResponse: i=" + i10 + ", isSuccess=" + z10);
                }
            });
        }
    }

    private boolean emc(boolean z10, rie rieVar, AdSlot adSlot) {
        if (z10) {
            return !dr.xq(rieVar) && rie.bw(rieVar) && com.bytedance.sdk.openadsdk.core.aa.dg().db(adSlot.getCodeId()).dg == 1 && !com.bytedance.sdk.component.utils.sba.dg(this.emc);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean emc(emc<L, A>.xq xqVar) {
        return xqVar != null && com.bytedance.sdk.openadsdk.core.aa.dg().sf() == 1;
    }

    private void emc(rie rieVar, final AdSlot adSlot, final com.bytedance.sdk.openadsdk.core.model.emc emcVar, final A a10, final boolean z10, final emc<L, A>.xq xqVar) {
        com.bytedance.sdk.openadsdk.core.sz.emc.ypw ypwVarEmc = rie.emc(CacheDirFactory.getICacheDir(rieVar.zxw()).emc(), rieVar);
        ypwVarEmc.emc("material_meta", rieVar);
        ypwVarEmc.emc("ad_slot", adSlot);
        com.bytedance.sdk.openadsdk.core.sz.bw.emc.emc(ypwVarEmc, new b() { // from class: com.bytedance.sdk.openadsdk.component.reward.emc.8
            /* JADX WARN: Multi-variable type inference failed */
            @Override // r2.a.InterfaceC0474a
            public void emc(com.bykv.vk.openvk.emc.emc.emc.xq.xq xqVar2, int i10) {
                emc.this.ypw((emc) a10);
                if (z10) {
                    emc.this.emc().emc(adSlot, emcVar);
                } else if (emc.this.emc(xqVar)) {
                    xqVar.emc(a10);
                }
            }

            @Override // r2.a.InterfaceC0474a
            public void emc(com.bykv.vk.openvk.emc.emc.emc.xq.xq xqVar2, int i10, String str) {
                if (emc.this.emc(xqVar)) {
                    xqVar.emc(i10, str);
                }
            }
        });
    }

    public void emc(com.bytedance.sdk.openadsdk.core.model.emc emcVar, rie rieVar, A a10, AdSlot adSlot, boolean z10, emc<L, A>.xq xqVar) {
        A a11;
        emc<L, A>.xq xqVar2;
        if (emc(z10, rieVar, adSlot)) {
            emc((dg) new dg(rieVar, adSlot, emcVar));
            return;
        }
        boolean zEmc = emc((xq) xqVar);
        if (dr.xq(rieVar)) {
            a11 = a10;
            xqVar2 = xqVar;
            if (z10) {
                emc().emc(adSlot, emcVar);
            }
        } else if (!rie.bw(rieVar)) {
            a11 = a10;
            xqVar2 = xqVar;
            if (z10) {
                emc().emc(adSlot, emcVar);
            }
        } else {
            if (rieVar.iat() == null) {
                return;
            }
            a11 = a10;
            xqVar2 = xqVar;
            emc(rieVar, adSlot, emcVar, (com.bytedance.sdk.openadsdk.core.model.emc) a11, z10, (emc<L, com.bytedance.sdk.openadsdk.core.model.emc>.xq) xqVar2);
            zEmc = false;
        }
        if (zEmc) {
            xqVar2.emc(a11);
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
            if (r1 != 0) goto L3f
            boolean r1 = com.bytedance.sdk.openadsdk.core.model.rie.bw(r4)
            if (r1 == 0) goto L3f
            int r1 = r4.zxw()
            t2.b r1 = com.bytedance.sdk.openadsdk.CacheDirFactory.getICacheDir(r1)
            java.lang.String r1 = r1.emc()
            com.bytedance.sdk.openadsdk.core.sz.emc.ypw r1 = com.bytedance.sdk.openadsdk.core.model.rie.emc(r1, r4)
            java.lang.String r2 = "material_meta"
            r1.emc(r2, r4)
            java.lang.String r4 = "ad_slot"
            r1.emc(r4, r5)
            com.bytedance.sdk.openadsdk.component.reward.emc$9 r4 = new com.bytedance.sdk.openadsdk.component.reward.emc$9
            r4.<init>()
            com.bytedance.sdk.openadsdk.core.sz.bw.emc.emc(r1, r4)
            goto L40
        L3f:
            r0 = r2
        L40:
            if (r0 == 0) goto L45
            r6.emc(r7)
        L45:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.reward.emc.emc(com.bytedance.sdk.openadsdk.core.model.rie, com.bytedance.sdk.openadsdk.AdSlot, com.bytedance.sdk.openadsdk.component.reward.emc$xq, java.lang.Object):void");
    }

    public void emc(final AdSlot adSlot, final com.bytedance.sdk.openadsdk.core.model.emc emcVar, L l10, A a10, final boolean z10) {
        com.bytedance.sdk.openadsdk.core.qh.ypw().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.emc.10
            @Override // java.lang.Runnable
            public void run() {
                if (z10) {
                    emc.this.dg(adSlot);
                } else {
                    emc.this.emc().emc(adSlot, emcVar);
                    emc.this.dg(adSlot);
                }
            }
        });
        if (l10 != null) {
            emc((emc<L, A>) l10, emc((emc<L, A>) a10));
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

    public com.bytedance.sdk.openadsdk.core.model.sb emc(AdSlot adSlot, boolean z10) {
        com.bytedance.sdk.openadsdk.core.model.sb sbVar = new com.bytedance.sdk.openadsdk.core.model.sb();
        if (adSlot != null && (com.bytedance.sdk.openadsdk.core.aa.dg().sup(adSlot.getCodeId()) || adSlot.getExpressViewAcceptedWidth() > 0.0f || adSlot.isExpressAd())) {
            sbVar.zz = 2;
        }
        if (ypw() == 7) {
            sbVar.ypw = z10 ? 2 : 1;
            return sbVar;
        }
        sbVar.xq = z10 ? 2 : 1;
        return sbVar;
    }

    public void emc(String str, rie rieVar) {
        emc().emc(str, rieVar);
    }
}

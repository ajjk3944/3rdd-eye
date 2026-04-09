package com.bytedance.sdk.openadsdk.core.sz.dg;

import c3.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import q2.a;

/* loaded from: classes.dex */
public class xq extends a {
    private final emc dg;
    private final List<ypw> emc = Collections.synchronizedList(new ArrayList());
    private int ypw = 1;
    private int xq = 1;

    public interface ypw extends a.InterfaceC0459a {
        @Override // q2.a.InterfaceC0459a
        /* synthetic */ void bw(q2.a aVar);

        @Override // q2.a.InterfaceC0459a
        /* synthetic */ void dg(q2.a aVar);

        void emc(int i10, int i11);

        @Override // q2.a.InterfaceC0459a
        /* synthetic */ void emc(q2.a aVar);

        @Override // q2.a.InterfaceC0459a
        /* synthetic */ void emc(q2.a aVar, int i10);

        @Override // q2.a.InterfaceC0459a
        /* synthetic */ void emc(q2.a aVar, int i10, int i11);

        @Override // q2.a.InterfaceC0459a
        /* synthetic */ void emc(q2.a aVar, int i10, int i11, int i12);

        @Override // q2.a.InterfaceC0459a
        /* synthetic */ void emc(q2.a aVar, long j10);

        @Override // q2.a.InterfaceC0459a
        /* synthetic */ void emc(q2.a aVar, long j10, long j11);

        @Override // q2.a.InterfaceC0459a
        /* synthetic */ void emc(q2.a aVar, com.bykv.vk.openvk.emc.emc.emc.xq.a aVar2);

        @Override // q2.a.InterfaceC0459a
        /* synthetic */ void emc(q2.a aVar, boolean z10);

        @Override // q2.a.InterfaceC0459a
        /* synthetic */ void xq(q2.a aVar);

        @Override // q2.a.InterfaceC0459a
        /* synthetic */ void ypw(q2.a aVar);

        @Override // q2.a.InterfaceC0459a
        /* synthetic */ void ypw(q2.a aVar, int i10);
    }

    public xq() {
        emc emcVar = new emc();
        this.dg = emcVar;
        super.emc(emcVar);
        emc(500);
    }

    public static /* synthetic */ int emc(xq xqVar) {
        int i10 = xqVar.xq;
        xqVar.xq = i10 + 1;
        return i10;
    }

    @Override // c3.a
    public long aa() {
        return super.aa() * this.ypw;
    }

    @Override // c3.a
    public long sba() {
        long jSba = super.sba();
        return this.ypw == 1 ? jSba : jSba + ((this.xq - 1) * super.aa());
    }

    public int ylm() {
        return this.xq;
    }

    public class emc implements a.InterfaceC0459a {
        private emc() {
        }

        @Override // q2.a.InterfaceC0459a
        public void bw(q2.a aVar) {
            Iterator it = xq.this.emc.iterator();
            while (it.hasNext()) {
                ((ypw) it.next()).bw(aVar);
            }
        }

        @Override // q2.a.InterfaceC0459a
        public void dg(q2.a aVar) {
            Iterator it = xq.this.emc.iterator();
            while (it.hasNext()) {
                ((ypw) it.next()).dg(aVar);
            }
        }

        @Override // q2.a.InterfaceC0459a
        public void emc(q2.a aVar) {
            xq.emc(xq.this);
            if (xq.this.xq > xq.this.ypw) {
                Iterator it = xq.this.emc.iterator();
                while (it.hasNext()) {
                    ((ypw) it.next()).emc(aVar);
                }
            } else {
                Iterator it2 = xq.this.emc.iterator();
                while (it2.hasNext()) {
                    ((ypw) it2.next()).emc(xq.this.xq, xq.this.ypw);
                }
                xq.this.zz();
            }
        }

        @Override // q2.a.InterfaceC0459a
        public void xq(q2.a aVar) {
            Iterator it = xq.this.emc.iterator();
            while (it.hasNext()) {
                ((ypw) it.next()).xq(aVar);
            }
        }

        @Override // q2.a.InterfaceC0459a
        public void ypw(q2.a aVar) {
            Iterator it = xq.this.emc.iterator();
            while (it.hasNext()) {
                ((ypw) it.next()).ypw(aVar);
            }
        }

        @Override // q2.a.InterfaceC0459a
        public void ypw(q2.a aVar, int i10) {
            Iterator it = xq.this.emc.iterator();
            while (it.hasNext()) {
                ((ypw) it.next()).ypw(aVar, i10);
            }
        }

        @Override // q2.a.InterfaceC0459a
        public void emc(q2.a aVar, long j10) {
            Iterator it = xq.this.emc.iterator();
            while (it.hasNext()) {
                ((ypw) it.next()).emc(aVar, j10);
            }
        }

        @Override // q2.a.InterfaceC0459a
        public void emc(q2.a aVar, com.bykv.vk.openvk.emc.emc.emc.xq.a aVar2) {
            Iterator it = xq.this.emc.iterator();
            while (it.hasNext()) {
                ((ypw) it.next()).emc(aVar, aVar2);
            }
        }

        @Override // q2.a.InterfaceC0459a
        public void emc(q2.a aVar, boolean z10) {
            Iterator it = xq.this.emc.iterator();
            while (it.hasNext()) {
                ((ypw) it.next()).emc(aVar, z10);
            }
        }

        @Override // q2.a.InterfaceC0459a
        public void emc(q2.a aVar, int i10, int i11) {
            Iterator it = xq.this.emc.iterator();
            while (it.hasNext()) {
                ((ypw) it.next()).emc(aVar, i10, i11);
            }
        }

        @Override // q2.a.InterfaceC0459a
        public void emc(q2.a aVar, int i10, int i11, int i12) {
            Iterator it = xq.this.emc.iterator();
            while (it.hasNext()) {
                ((ypw) it.next()).emc(aVar, i10, i11, i12);
            }
        }

        @Override // q2.a.InterfaceC0459a
        public void emc(q2.a aVar, int i10) {
            Iterator it = xq.this.emc.iterator();
            while (it.hasNext()) {
                ((ypw) it.next()).emc(aVar, i10);
            }
        }

        @Override // q2.a.InterfaceC0459a
        public void emc(q2.a aVar, long j10, long j11) {
            Iterator it = xq.this.emc.iterator();
            while (it.hasNext()) {
                ((ypw) it.next()).emc(aVar, j10, j11);
            }
        }
    }

    @Override // c3.a
    public void emc(a.InterfaceC0459a interfaceC0459a) {
        if (!(interfaceC0459a instanceof ypw)) {
            super.emc(interfaceC0459a);
        } else {
            if (this.emc.contains(interfaceC0459a)) {
                return;
            }
            this.emc.add((ypw) interfaceC0459a);
        }
    }

    public void xq(int i10) {
        this.ypw = Math.max(1, i10);
    }
}

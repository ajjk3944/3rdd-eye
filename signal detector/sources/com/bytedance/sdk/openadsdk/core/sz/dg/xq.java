package com.bytedance.sdk.openadsdk.core.sz.dg;

import J1.a;
import J1.b;
import V1.e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class xq extends e {
    private final emc dg;
    private final List<ypw> emc = Collections.synchronizedList(new ArrayList());
    private int ypw = 1;
    private int xq = 1;

    public interface ypw extends a {
        @Override // J1.a
        /* synthetic */ void bw(b bVar);

        @Override // J1.a
        /* synthetic */ void dg(b bVar);

        void emc(int i, int i3);

        @Override // J1.a
        /* synthetic */ void emc(b bVar);

        @Override // J1.a
        /* synthetic */ void emc(b bVar, int i);

        @Override // J1.a
        /* synthetic */ void emc(b bVar, int i, int i3);

        @Override // J1.a
        /* synthetic */ void emc(b bVar, int i, int i3, int i6);

        @Override // J1.a
        /* synthetic */ void emc(b bVar, long j6);

        @Override // J1.a
        /* synthetic */ void emc(b bVar, long j6, long j7);

        @Override // J1.a
        /* synthetic */ void emc(b bVar, com.bykv.vk.openvk.emc.emc.emc.xq.a aVar);

        @Override // J1.a
        /* synthetic */ void emc(b bVar, boolean z6);

        @Override // J1.a
        /* synthetic */ void xq(b bVar);

        @Override // J1.a
        /* synthetic */ void ypw(b bVar);

        @Override // J1.a
        /* synthetic */ void ypw(b bVar, int i);
    }

    public xq() {
        emc emcVar = new emc();
        this.dg = emcVar;
        super.emc(emcVar);
        emc(500);
    }

    public static /* synthetic */ int emc(xq xqVar) {
        int i = xqVar.xq;
        xqVar.xq = i + 1;
        return i;
    }

    @Override // V1.e
    public long aa() {
        return super.aa() * this.ypw;
    }

    @Override // V1.e
    public long sba() {
        long jSba = super.sba();
        return this.ypw == 1 ? jSba : ((this.xq - 1) * super.aa()) + jSba;
    }

    public int ylm() {
        return this.xq;
    }

    public class emc implements a {
        private emc() {
        }

        @Override // J1.a
        public void bw(b bVar) {
            Iterator it = xq.this.emc.iterator();
            while (it.hasNext()) {
                ((ypw) it.next()).bw(bVar);
            }
        }

        @Override // J1.a
        public void dg(b bVar) {
            Iterator it = xq.this.emc.iterator();
            while (it.hasNext()) {
                ((ypw) it.next()).dg(bVar);
            }
        }

        @Override // J1.a
        public void emc(b bVar) {
            xq.emc(xq.this);
            if (xq.this.xq > xq.this.ypw) {
                Iterator it = xq.this.emc.iterator();
                while (it.hasNext()) {
                    ((ypw) it.next()).emc(bVar);
                }
            } else {
                Iterator it2 = xq.this.emc.iterator();
                while (it2.hasNext()) {
                    ((ypw) it2.next()).emc(xq.this.xq, xq.this.ypw);
                }
                xq.this.zz();
            }
        }

        @Override // J1.a
        public void xq(b bVar) {
            Iterator it = xq.this.emc.iterator();
            while (it.hasNext()) {
                ((ypw) it.next()).xq(bVar);
            }
        }

        @Override // J1.a
        public void ypw(b bVar) {
            Iterator it = xq.this.emc.iterator();
            while (it.hasNext()) {
                ((ypw) it.next()).ypw(bVar);
            }
        }

        @Override // J1.a
        public void ypw(b bVar, int i) {
            Iterator it = xq.this.emc.iterator();
            while (it.hasNext()) {
                ((ypw) it.next()).ypw(bVar, i);
            }
        }

        @Override // J1.a
        public void emc(b bVar, long j6) {
            Iterator it = xq.this.emc.iterator();
            while (it.hasNext()) {
                ((ypw) it.next()).emc(bVar, j6);
            }
        }

        @Override // J1.a
        public void emc(b bVar, com.bykv.vk.openvk.emc.emc.emc.xq.a aVar) {
            Iterator it = xq.this.emc.iterator();
            while (it.hasNext()) {
                ((ypw) it.next()).emc(bVar, aVar);
            }
        }

        @Override // J1.a
        public void emc(b bVar, boolean z6) {
            Iterator it = xq.this.emc.iterator();
            while (it.hasNext()) {
                ((ypw) it.next()).emc(bVar, z6);
            }
        }

        @Override // J1.a
        public void emc(b bVar, int i, int i3) {
            Iterator it = xq.this.emc.iterator();
            while (it.hasNext()) {
                ((ypw) it.next()).emc(bVar, i, i3);
            }
        }

        @Override // J1.a
        public void emc(b bVar, int i, int i3, int i6) {
            Iterator it = xq.this.emc.iterator();
            while (it.hasNext()) {
                ((ypw) it.next()).emc(bVar, i, i3, i6);
            }
        }

        @Override // J1.a
        public void emc(b bVar, int i) {
            Iterator it = xq.this.emc.iterator();
            while (it.hasNext()) {
                ((ypw) it.next()).emc(bVar, i);
            }
        }

        @Override // J1.a
        public void emc(b bVar, long j6, long j7) {
            Iterator it = xq.this.emc.iterator();
            while (it.hasNext()) {
                ((ypw) it.next()).emc(bVar, j6, j7);
            }
        }
    }

    @Override // V1.e
    public void emc(a aVar) {
        if (!(aVar instanceof ypw)) {
            super.emc(aVar);
        } else {
            if (this.emc.contains(aVar)) {
                return;
            }
            this.emc.add((ypw) aVar);
        }
    }

    public void xq(int i) {
        this.ypw = Math.max(1, i);
    }
}

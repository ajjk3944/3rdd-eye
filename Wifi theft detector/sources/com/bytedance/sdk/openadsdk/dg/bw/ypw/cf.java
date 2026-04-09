package com.bytedance.sdk.openadsdk.dg.bw.ypw;

import com.bykv.vk.openvk.emc.emc.emc.xq.a;
import com.bytedance.sdk.openadsdk.core.model.rie;

/* loaded from: classes.dex */
public class cf {
    private rie bw;
    private com.bykv.vk.openvk.emc.emc.emc.xq.xq dg;
    private long emc;
    private int xq;
    private String ypw;

    public static class emc {
        private boolean bw;
        private boolean dg;
        private int gbl;
        private int msw;
        private a qh;
        private int ru;
        private int sup;
        private int zz;
        private long emc = 0;
        private long ypw = 0;
        private long xq = 0;
        private long ycc = 0;
        private boolean uym = false;
        private boolean sz = false;

        private void vk() {
            long j10 = this.xq;
            if (j10 > 0) {
                long j11 = this.emc;
                if (j11 > j10) {
                    long j12 = j11 % j10;
                    this.emc = j12;
                    if (j12 == 0) {
                        this.emc = j10;
                    }
                }
            }
        }

        public int bw() {
            return this.msw;
        }

        public boolean cf() {
            return this.bw;
        }

        public long dg() {
            return this.xq;
        }

        public long emc() {
            return this.ycc;
        }

        public boolean gbl() {
            return this.sz;
        }

        public int msw() {
            return this.ru;
        }

        public boolean qh() {
            return this.dg;
        }

        public int ru() {
            return this.sup;
        }

        public boolean sup() {
            return this.uym;
        }

        public a sz() {
            return this.qh;
        }

        public int uym() {
            long j10 = this.xq;
            if (j10 <= 0) {
                return 0;
            }
            return Math.min((int) ((this.emc * 100) / j10), 100);
        }

        public long xq() {
            return this.ypw;
        }

        public int ycc() {
            return this.zz;
        }

        public long ypw() {
            return this.emc;
        }

        public int zz() {
            return this.gbl;
        }

        public void dg(long j10) {
            this.xq = j10;
            vk();
        }

        public void emc(long j10) {
            this.ycc = j10;
        }

        public void xq(long j10) {
            this.ypw = j10;
        }

        public void ypw(long j10) {
            this.emc = j10;
            vk();
        }

        public void emc(int i10) {
            this.msw = i10;
        }

        public void xq(int i10) {
            this.ru = i10;
        }

        public void dg(int i10) {
            this.sup = i10;
        }

        public void emc(boolean z10) {
            this.uym = z10;
        }

        public void xq(boolean z10) {
            this.bw = z10;
        }

        public void ypw(int i10) {
            this.zz = i10;
        }

        public void emc(a aVar) {
            this.qh = aVar;
        }

        public void ypw(boolean z10) {
            this.dg = z10;
        }
    }

    public cf(long j10, String str, int i10, com.bykv.vk.openvk.emc.emc.emc.xq.xq xqVar, rie rieVar) {
        this.emc = j10;
        this.ypw = str;
        this.xq = i10;
        this.dg = xqVar;
        this.bw = rieVar;
    }

    public rie bw() {
        return this.bw;
    }

    public com.bykv.vk.openvk.emc.emc.emc.xq.xq dg() {
        return this.dg;
    }

    public long emc() {
        return this.emc;
    }

    public int xq() {
        return this.xq;
    }

    public String ypw() {
        return this.ypw;
    }
}

package com.bytedance.sdk.openadsdk.dg.bw.ypw;

import com.bykv.vk.openvk.emc.emc.emc.xq.a;
import com.bykv.vk.openvk.emc.emc.emc.xq.b;
import com.bytedance.sdk.openadsdk.core.model.rie;

/* loaded from: classes.dex */
public class cf {
    private rie bw;
    private b dg;
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
            long j6 = this.xq;
            if (j6 > 0) {
                long j7 = this.emc;
                if (j7 > j6) {
                    long j8 = j7 % j6;
                    this.emc = j8;
                    if (j8 == 0) {
                        this.emc = j6;
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
            long j6 = this.xq;
            if (j6 <= 0) {
                return 0;
            }
            return Math.min((int) ((this.emc * 100) / j6), 100);
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

        public void dg(long j6) {
            this.xq = j6;
            vk();
        }

        public void emc(long j6) {
            this.ycc = j6;
        }

        public void xq(long j6) {
            this.ypw = j6;
        }

        public void ypw(long j6) {
            this.emc = j6;
            vk();
        }

        public void emc(int i) {
            this.msw = i;
        }

        public void xq(int i) {
            this.ru = i;
        }

        public void dg(int i) {
            this.sup = i;
        }

        public void emc(boolean z6) {
            this.uym = z6;
        }

        public void xq(boolean z6) {
            this.bw = z6;
        }

        public void ypw(int i) {
            this.zz = i;
        }

        public void emc(a aVar) {
            this.qh = aVar;
        }

        public void ypw(boolean z6) {
            this.dg = z6;
        }
    }

    public cf(long j6, String str, int i, b bVar, rie rieVar) {
        this.emc = j6;
        this.ypw = str;
        this.xq = i;
        this.dg = bVar;
        this.bw = rieVar;
    }

    public rie bw() {
        return this.bw;
    }

    public b dg() {
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

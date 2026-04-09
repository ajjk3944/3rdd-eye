package com.bytedance.sdk.openadsdk.yu.fkw.vt;

import com.bykv.vk.openvk.ouw.ouw.ouw.lh.a;
import com.bykv.vk.openvk.ouw.ouw.ouw.lh.b;
import com.bytedance.sdk.openadsdk.core.model.vpp;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ko {
    public vpp fkw;

    /* renamed from: lh, reason: collision with root package name */
    public int f8760lh;
    public long ouw;
    public String vt;
    public a yu;

    public ko(long j, String str, int i4, a aVar, vpp vppVar) {
        this.ouw = j;
        this.vt = str;
        this.f8760lh = i4;
        this.yu = aVar;
        this.fkw = vppVar;
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class ouw {
        public int bly;

        /* renamed from: cf, reason: collision with root package name */
        public int f8761cf;
        public boolean fkw;

        /* renamed from: jg, reason: collision with root package name */
        public b f8762jg;
        public int pno;
        public int ryl;
        public int tlj;
        public boolean yu;
        public long ouw = 0;
        public long vt = 0;

        /* renamed from: lh, reason: collision with root package name */
        public long f8764lh = 0;

        /* renamed from: le, reason: collision with root package name */
        public long f8763le = 0;
        public boolean ra = false;
        public boolean mwh = false;

        private void vt() {
            long j = this.f8764lh;
            if (j > 0) {
                long j8 = this.ouw;
                if (j8 > j) {
                    long j9 = j8 % j;
                    this.ouw = j9;
                    if (j9 == 0) {
                        this.ouw = j;
                    }
                }
            }
        }

        public final void ouw(long j) {
            this.ouw = j;
            vt();
        }

        public final int ouw() {
            long j = this.f8764lh;
            if (j <= 0) {
                return 0;
            }
            return Math.min((int) ((this.ouw * 100) / j), 100);
        }

        public final void vt(long j) {
            this.f8764lh = j;
            vt();
        }
    }
}

package com.bytedance.sdk.openadsdk.component.reward;

import a9.a;
import android.os.CountDownTimer;
import b9.b;
import b9.e;
import b9.g;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.mwh.yu.ouw;
import com.bytedance.sdk.openadsdk.yu.fkw.vt.ko;
import org.json.JSONException;
import v8.c;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class lh implements e {

    /* renamed from: lh, reason: collision with root package name */
    private final ouw f7930lh;
    public final a ouw;
    private long pno;
    public ouw.InterfaceC0093ouw vt;
    private final vpp yu;
    private boolean fkw = true;

    /* renamed from: le, reason: collision with root package name */
    private long f7929le = 0;
    private boolean ra = false;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class ouw implements c {
        long bly;
        int fkw = 0;

        /* renamed from: le, reason: collision with root package name */
        CountDownTimer f7931le;

        /* renamed from: lh, reason: collision with root package name */
        final com.bytedance.sdk.openadsdk.yu.ra f7932lh;
        final long ouw;
        long pno;
        b ra;
        final a vt;
        long yu;

        public ouw(long j, a aVar, com.bytedance.sdk.openadsdk.yu.ra raVar) {
            this.ouw = j;
            this.vt = aVar;
            this.f7932lh = raVar;
        }

        public final void bly() {
            if (this.fkw == 1) {
                return;
            }
            this.fkw = 1;
            final long j = this.ouw;
            if (this.yu >= j) {
                this.yu = 0L;
            }
            final long j8 = j - this.yu;
            CountDownTimer countDownTimer = new CountDownTimer(j8) { // from class: com.bytedance.sdk.openadsdk.component.reward.lh.ouw.1
                @Override // android.os.CountDownTimer
                public final void onFinish() throws JSONException {
                    b bVar = ouw.this.ra;
                    if (bVar != null) {
                        long j9 = j;
                        bVar.ouw(j9, j9);
                    }
                    ouw ouwVar = ouw.this;
                    ouwVar.fkw = 4;
                    long j10 = j;
                    ouwVar.pno = j10;
                    ouwVar.yu = j10;
                    b bVar2 = ouwVar.ra;
                    if (bVar2 != null) {
                        bVar2.ouw(j10, 100);
                    }
                    ko.ouw ouwVar2 = new ko.ouw();
                    ouwVar2.ouw(j);
                    ouwVar2.vt(j);
                    ouwVar2.vt = 0L;
                    ouwVar2.ryl = 0;
                    ouw ouwVar3 = ouw.this;
                    ouwVar2.f8763le = ouwVar3.bly;
                    com.bytedance.sdk.openadsdk.yu.fkw.ouw.ouw.vt(ouwVar3.vt, ouwVar2, ouwVar3.f7932lh);
                }

                @Override // android.os.CountDownTimer
                public final void onTick(long j9) {
                    long j10 = j8 - j9;
                    ouw ouwVar = ouw.this;
                    long j11 = j10 + ouwVar.yu;
                    ouwVar.pno = j11;
                    b bVar = ouwVar.ra;
                    if (bVar != null) {
                        bVar.ouw(j11, j);
                    }
                }
            };
            this.f7931le = countDownTimer;
            countDownTimer.start();
        }

        @Override // v8.c
        public final int fkw() {
            return 0;
        }

        @Override // v8.c
        public final boolean le() {
            return this.fkw == 1;
        }

        @Override // v8.c
        public final boolean lh() {
            return false;
        }

        @Override // v8.c
        public final boolean ouw() {
            return false;
        }

        @Override // v8.c
        public final boolean pno() {
            return this.fkw == 0;
        }

        @Override // v8.c
        public final boolean ra() {
            return this.fkw == 2;
        }

        @Override // v8.c
        public final boolean vt() {
            return this.fkw == 4;
        }

        @Override // v8.c
        public final int yu() {
            return 0;
        }
    }

    public lh(vpp vppVar, com.bytedance.sdk.openadsdk.yu.ra raVar) {
        a aVar = new a() { // from class: com.bytedance.sdk.openadsdk.component.reward.lh.1
        };
        this.ouw = aVar;
        this.yu = vppVar;
        com.bykv.vk.openvk.ouw.ouw.ouw.lh.c cVar = vppVar.f8309sd;
        long j = 10;
        long j8 = cVar != null ? (long) cVar.f6576d : 10L;
        if (j8 <= 0) {
            cVar.f6576d = 10.0d;
        } else {
            j = j8;
        }
        this.f7930lh = new ouw(j * 1000, aVar, raVar);
    }

    @Override // b9.e
    public final void bly() {
        ouw ouwVar = this.f7930lh;
        ouwVar.pno = 0L;
        ouwVar.bly();
    }

    @Override // b9.e
    public final void cf() throws JSONException {
        ouw ouwVar = this.f7930lh;
        ouwVar.fkw = 2;
        ouwVar.yu = ouwVar.pno;
        CountDownTimer countDownTimer = ouwVar.f7931le;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            ouwVar.f7931le = null;
        }
        ko.ouw ouwVar2 = new ko.ouw();
        ouwVar2.ouw(this.f7930lh.pno);
        ouwVar2.vt(this.f7930lh.ouw);
        ouwVar2.vt = 0L;
        ouwVar2.f8763le = this.pno;
        com.bytedance.sdk.openadsdk.yu.fkw.ouw.ouw.ouw(this.ouw, ouwVar2);
        ouw.InterfaceC0093ouw interfaceC0093ouw = this.vt;
        if (interfaceC0093ouw != null) {
            interfaceC0093ouw.ouw(2);
        }
    }

    @Override // b9.e
    public final boolean ex() {
        return false;
    }

    public final void jg() {
        mwh();
    }

    @Override // b9.e
    public final boolean jqy() {
        return this.f7930lh.vt();
    }

    @Override // b9.e
    public final void ko() {
        mwh();
    }

    @Override // b9.e
    public final void mwh() {
        ouw ouwVar = this.f7930lh;
        ouwVar.fkw = 0;
        CountDownTimer countDownTimer = ouwVar.f7931le;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            ouwVar.f7931le = null;
        }
        if (ouwVar.ra != null) {
            ouwVar.ra = null;
        }
    }

    @Override // b9.e
    public final boolean ouw(float f10) {
        return false;
    }

    @Override // b9.e
    public final int qbp() {
        ouw ouwVar = this.f7930lh;
        return i9.a.a(ouwVar.pno, ouwVar.ouw);
    }

    @Override // b9.e
    public final long rn() {
        return this.f7930lh.pno;
    }

    @Override // b9.e
    public final void ryl() throws JSONException {
        this.f7930lh.bly();
        ko.ouw ouwVar = new ko.ouw();
        ouwVar.ouw(this.f7930lh.pno);
        ouwVar.vt(this.f7930lh.ouw);
        ouwVar.vt = 0L;
        com.bytedance.sdk.openadsdk.yu.fkw.ouw.ouw.vt(this.ouw, ouwVar);
        ouw.InterfaceC0093ouw interfaceC0093ouw = this.vt;
        if (interfaceC0093ouw != null) {
            interfaceC0093ouw.ouw(1);
        }
    }

    @Override // b9.e
    public final boolean tc() {
        return false;
    }

    @Override // b9.e
    public final long th() {
        return this.f7930lh.ouw;
    }

    @Override // b9.e
    public final int vm() {
        return 0;
    }

    @Override // b9.e
    public final g vpp() {
        return null;
    }

    @Override // b9.e
    public final long zih() {
        return 0L;
    }

    @Override // b9.e
    public final c zin() {
        return this.f7930lh;
    }

    @Override // b9.e
    public final void ouw(long j) {
        this.pno = j;
        ouw ouwVar = this.f7930lh;
        if (ouwVar != null) {
            ouwVar.bly = j;
        }
    }

    @Override // b9.e
    public final void ouw(boolean z3, String str) {
        this.ra = z3;
    }

    @Override // b9.e
    public final void ouw(b bVar) {
        this.f7930lh.ra = bVar;
    }

    @Override // b9.e
    public final boolean ouw(com.bykv.vk.openvk.ouw.ouw.ouw.lh.a aVar) throws JSONException {
        this.ra = aVar.f6564cf;
        long j = aVar.tlj;
        if (j > 0) {
            this.f7930lh.yu = j;
        }
        aVar.yu = com.bytedance.sdk.openadsdk.vpp.ouw.ouw("player_force_raw_url", 0) == 1;
        com.bytedance.sdk.openadsdk.yu.fkw.ouw.ouw.ouw(this.yu, this.ouw, aVar);
        this.f7930lh.bly();
        ouw.InterfaceC0093ouw interfaceC0093ouw = this.vt;
        if (interfaceC0093ouw != null) {
            interfaceC0093ouw.ouw(1);
        }
        return true;
    }

    @Override // b9.e
    public final void tlj() {
    }
}

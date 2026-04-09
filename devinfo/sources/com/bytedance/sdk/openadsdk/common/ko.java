package com.bytedance.sdk.openadsdk.common;

import com.bytedance.sdk.openadsdk.common.ouw;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ko {
    boolean fkw;

    /* renamed from: le, reason: collision with root package name */
    zih f7834le;

    /* renamed from: lh, reason: collision with root package name */
    final Runnable f7835lh;
    final com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouw;
    ouw.InterfaceC0068ouw ra;
    final String vt;
    final ouw.vt yu;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class ouw {

        /* renamed from: lh, reason: collision with root package name */
        final Runnable f7837lh;
        final com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouw;
        final String vt;
        final ouw.vt yu;
        public boolean fkw = false;

        /* renamed from: le, reason: collision with root package name */
        public zih f7836le = null;
        public ouw.InterfaceC0068ouw ra = null;

        public ouw(com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar, String str, Runnable runnable, ouw.vt vtVar) {
            this.ouw = ouwVar;
            this.vt = str;
            this.f7837lh = runnable;
            this.yu = vtVar;
        }

        public final ko ouw() {
            if (this.ouw == null) {
                throw new IllegalArgumentException("RewardFullContext cannot be null");
            }
            if (this.f7837lh == null) {
                throw new IllegalArgumentException("Runnable finishAction cannot be null");
            }
            if (this.yu != null) {
                return new ko(this, (byte) 0);
            }
            throw new IllegalArgumentException("SkipResultHandler cannot be null");
        }
    }

    public /* synthetic */ ko(ouw ouwVar, byte b10) {
        this(ouwVar);
    }

    private ko(ouw ouwVar) {
        this.ouw = ouwVar.ouw;
        this.vt = ouwVar.vt;
        this.f7835lh = ouwVar.f7837lh;
        this.yu = ouwVar.yu;
        this.fkw = ouwVar.fkw;
        this.f7834le = ouwVar.f7836le;
        this.ra = ouwVar.ra;
    }
}

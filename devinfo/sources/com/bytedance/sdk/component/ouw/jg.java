package com.bytedance.sdk.component.ouw;

import d.h;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class jg {
    public final String fkw;

    /* renamed from: le, reason: collision with root package name */
    public final String f7594le;

    /* renamed from: lh, reason: collision with root package name */
    public final String f7595lh;
    public final int ouw;
    public final String pno;
    public final String ra;
    public final String vt;
    public final String yu;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static final class ouw {
        String fkw;

        /* renamed from: le, reason: collision with root package name */
        String f7596le;

        /* renamed from: lh, reason: collision with root package name */
        String f7597lh;
        String ouw;
        String ra;
        String vt;
        String yu;

        public /* synthetic */ ouw(byte b10) {
            this();
        }

        private ouw() {
        }
    }

    public /* synthetic */ jg(ouw ouwVar, byte b10) {
        this(ouwVar);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("methodName: ");
        sb2.append(this.yu);
        sb2.append(", params: ");
        sb2.append(this.fkw);
        sb2.append(", callbackId: ");
        sb2.append(this.f7594le);
        sb2.append(", type: ");
        sb2.append(this.f7595lh);
        sb2.append(", version: ");
        return h.w(sb2, this.vt, ", ");
    }

    public jg(String str) {
        this.vt = null;
        this.f7595lh = null;
        this.yu = null;
        this.fkw = null;
        this.f7594le = str;
        this.ra = null;
        this.ouw = -1;
        this.pno = null;
    }

    private jg(ouw ouwVar) {
        this.vt = ouwVar.ouw;
        this.f7595lh = ouwVar.vt;
        this.yu = ouwVar.f7597lh;
        this.fkw = ouwVar.yu;
        this.f7594le = ouwVar.fkw;
        this.ra = ouwVar.f7596le;
        this.ouw = 1;
        this.pno = ouwVar.ra;
    }
}

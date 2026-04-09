package com.bytedance.sdk.component.vt.ouw;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class cf implements Cloneable {
    public TimeUnit fkw;

    /* renamed from: le, reason: collision with root package name */
    public long f7646le;

    /* renamed from: lh, reason: collision with root package name */
    public TimeUnit f7647lh;
    public List<pno> ouw;
    public TimeUnit ra;
    public long vt;
    public long yu;

    public cf(ouw ouwVar) {
        this.vt = ouwVar.vt;
        this.yu = ouwVar.yu;
        this.f7646le = ouwVar.f7648le;
        List<pno> list = ouwVar.ouw;
        this.f7647lh = ouwVar.f7649lh;
        this.fkw = ouwVar.fkw;
        this.ra = ouwVar.ra;
        this.ouw = list;
    }

    public abstract vt ouw(ryl rylVar);

    public abstract yu ouw();

    public final ouw vt() {
        return new ouw(this);
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static final class ouw {
        public TimeUnit fkw;

        /* renamed from: le, reason: collision with root package name */
        public long f7648le;

        /* renamed from: lh, reason: collision with root package name */
        public TimeUnit f7649lh;
        public final List<pno> ouw;
        public TimeUnit ra;
        public long vt;
        public long yu;

        public ouw() {
            this.ouw = new ArrayList();
            this.vt = 10000L;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.f7649lh = timeUnit;
            this.yu = 10000L;
            this.fkw = timeUnit;
            this.f7648le = 10000L;
            this.ra = timeUnit;
        }

        public final ouw lh(long j, TimeUnit timeUnit) {
            this.f7648le = j;
            this.ra = timeUnit;
            return this;
        }

        public final ouw ouw(long j, TimeUnit timeUnit) {
            this.vt = j;
            this.f7649lh = timeUnit;
            return this;
        }

        public final ouw vt(long j, TimeUnit timeUnit) {
            this.yu = j;
            this.fkw = timeUnit;
            return this;
        }

        public ouw(byte b10) {
            this.ouw = new ArrayList();
            this.vt = 10000L;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.f7649lh = timeUnit;
            this.yu = 10000L;
            this.fkw = timeUnit;
            this.f7648le = 10000L;
            this.ra = timeUnit;
        }

        public ouw(cf cfVar) {
            this.ouw = new ArrayList();
            this.vt = 10000L;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.f7649lh = timeUnit;
            this.yu = 10000L;
            this.fkw = timeUnit;
            this.f7648le = 10000L;
            this.ra = timeUnit;
            this.vt = cfVar.vt;
            this.f7649lh = cfVar.f7647lh;
            this.yu = cfVar.yu;
            this.fkw = cfVar.fkw;
            this.f7648le = cfVar.f7646le;
            this.ra = cfVar.ra;
        }
    }
}

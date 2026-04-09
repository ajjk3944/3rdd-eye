package com.bytedance.sdk.component.ouw;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class lh<P, R> extends com.bytedance.sdk.component.ouw.vt<P, R> {
    private fkw fkw;

    /* renamed from: lh, reason: collision with root package name */
    private boolean f7602lh = true;
    private ouw yu;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public interface ouw {
        void ouw(Object obj);

        void ouw(Throwable th2);
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public interface vt {
        lh ouw();
    }

    private boolean yu() {
        if (this.f7602lh) {
            return true;
        }
        pno.ouw(new IllegalStateException("Jsb async call already finished: " + super.ouw() + ", hashcode: " + hashCode()));
        return false;
    }

    public final void lh() {
        this.f7602lh = false;
        this.fkw = null;
    }

    @Override // com.bytedance.sdk.component.ouw.vt
    public final /* bridge */ /* synthetic */ String ouw() {
        return super.ouw();
    }

    public abstract void ouw(P p10) throws Exception;

    public final void vt(R r10) {
        if (yu()) {
            this.yu.ouw(r10);
            lh();
        }
    }

    public final void ouw(P p10, fkw fkwVar, ouw ouwVar) throws Exception {
        this.fkw = fkwVar;
        this.yu = ouwVar;
        ouw(p10);
    }

    public final void vt() {
        if (yu()) {
            this.yu.ouw((Throwable) null);
            lh();
        }
    }
}

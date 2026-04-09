package com.bytedance.adsdk.vt.ouw.vt;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class ouw<K, A> {
    private final lh<K> fkw;
    protected com.bytedance.adsdk.vt.ra.vt<A> yu;
    final List<InterfaceC0040ouw> ouw = new ArrayList(1);
    public boolean vt = false;

    /* renamed from: lh, reason: collision with root package name */
    protected float f7182lh = 0.0f;

    /* renamed from: le, reason: collision with root package name */
    private A f7181le = null;
    private float ra = -1.0f;
    private float pno = -1.0f;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static final class fkw<T> implements lh<T> {
        private final com.bytedance.adsdk.vt.ra.ouw<T> ouw;
        private float vt = -1.0f;

        public fkw(List<? extends com.bytedance.adsdk.vt.ra.ouw<T>> list) {
            this.ouw = list.get(0);
        }

        @Override // com.bytedance.adsdk.vt.ouw.vt.ouw.lh
        public final float lh() {
            return this.ouw.vt();
        }

        @Override // com.bytedance.adsdk.vt.ouw.vt.ouw.lh
        public final boolean ouw() {
            return false;
        }

        @Override // com.bytedance.adsdk.vt.ouw.vt.ouw.lh
        public final com.bytedance.adsdk.vt.ra.ouw<T> vt() {
            return this.ouw;
        }

        @Override // com.bytedance.adsdk.vt.ouw.vt.ouw.lh
        public final float yu() {
            return this.ouw.lh();
        }

        @Override // com.bytedance.adsdk.vt.ouw.vt.ouw.lh
        public final boolean ouw(float f10) {
            return !this.ouw.yu();
        }

        @Override // com.bytedance.adsdk.vt.ouw.vt.ouw.lh
        public final boolean vt(float f10) {
            if (this.vt == f10) {
                return true;
            }
            this.vt = f10;
            return false;
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public interface lh<T> {
        float lh();

        boolean ouw();

        boolean ouw(float f10);

        com.bytedance.adsdk.vt.ra.ouw<T> vt();

        boolean vt(float f10);

        float yu();
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    /* renamed from: com.bytedance.adsdk.vt.ouw.vt.ouw$ouw, reason: collision with other inner class name */
    public interface InterfaceC0040ouw {
        void ouw();
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static final class vt<T> implements lh<T> {
        private vt() {
        }

        @Override // com.bytedance.adsdk.vt.ouw.vt.ouw.lh
        public final float lh() {
            return 0.0f;
        }

        @Override // com.bytedance.adsdk.vt.ouw.vt.ouw.lh
        public final boolean ouw() {
            return true;
        }

        @Override // com.bytedance.adsdk.vt.ouw.vt.ouw.lh
        public final com.bytedance.adsdk.vt.ra.ouw<T> vt() {
            throw new IllegalStateException("not implemented");
        }

        @Override // com.bytedance.adsdk.vt.ouw.vt.ouw.lh
        public final float yu() {
            return 1.0f;
        }

        public /* synthetic */ vt(byte b10) {
            this();
        }

        @Override // com.bytedance.adsdk.vt.ouw.vt.ouw.lh
        public final boolean ouw(float f10) {
            return false;
        }

        @Override // com.bytedance.adsdk.vt.ouw.vt.ouw.lh
        public final boolean vt(float f10) {
            throw new IllegalStateException("not implemented");
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static final class yu<T> implements lh<T> {
        private final List<? extends com.bytedance.adsdk.vt.ra.ouw<T>> ouw;

        /* renamed from: lh, reason: collision with root package name */
        private com.bytedance.adsdk.vt.ra.ouw<T> f7183lh = null;
        private float yu = -1.0f;
        private com.bytedance.adsdk.vt.ra.ouw<T> vt = lh(0.0f);

        public yu(List<? extends com.bytedance.adsdk.vt.ra.ouw<T>> list) {
            this.ouw = list;
        }

        private com.bytedance.adsdk.vt.ra.ouw<T> lh(float f10) {
            com.bytedance.adsdk.vt.ra.ouw<T> ouwVar = this.ouw.get(r0.size() - 1);
            if (f10 >= ouwVar.vt()) {
                return ouwVar;
            }
            for (int size = this.ouw.size() - 2; size > 0; size--) {
                com.bytedance.adsdk.vt.ra.ouw<T> ouwVar2 = this.ouw.get(size);
                if (this.vt != ouwVar2 && ouwVar2.ouw(f10)) {
                    return ouwVar2;
                }
            }
            return this.ouw.get(0);
        }

        @Override // com.bytedance.adsdk.vt.ouw.vt.ouw.lh
        public final boolean ouw() {
            return false;
        }

        @Override // com.bytedance.adsdk.vt.ouw.vt.ouw.lh
        public final com.bytedance.adsdk.vt.ra.ouw<T> vt() {
            return this.vt;
        }

        @Override // com.bytedance.adsdk.vt.ouw.vt.ouw.lh
        public final float yu() {
            return this.ouw.get(r0.size() - 1).lh();
        }

        @Override // com.bytedance.adsdk.vt.ouw.vt.ouw.lh
        public final boolean ouw(float f10) {
            if (this.vt.ouw(f10)) {
                return !this.vt.yu();
            }
            this.vt = lh(f10);
            return true;
        }

        @Override // com.bytedance.adsdk.vt.ouw.vt.ouw.lh
        public final boolean vt(float f10) {
            com.bytedance.adsdk.vt.ra.ouw<T> ouwVar = this.f7183lh;
            com.bytedance.adsdk.vt.ra.ouw<T> ouwVar2 = this.vt;
            if (ouwVar == ouwVar2 && this.yu == f10) {
                return true;
            }
            this.f7183lh = ouwVar2;
            this.yu = f10;
            return false;
        }

        @Override // com.bytedance.adsdk.vt.ouw.vt.ouw.lh
        public final float lh() {
            return this.ouw.get(0).vt();
        }
    }

    public ouw(List<? extends com.bytedance.adsdk.vt.ra.ouw<K>> list) {
        lh fkwVar;
        byte b10 = 0;
        if (list.isEmpty()) {
            fkwVar = new vt(b10);
        } else {
            fkwVar = list.size() == 1 ? new fkw(list) : new yu(list);
        }
        this.fkw = fkwVar;
    }

    private float pno() {
        if (this.ra == -1.0f) {
            this.ra = this.fkw.lh();
        }
        return this.ra;
    }

    public float fkw() {
        if (this.pno == -1.0f) {
            this.pno = this.fkw.yu();
        }
        return this.pno;
    }

    public A le() {
        float fLh = lh();
        if (this.yu == null && this.fkw.vt(fLh)) {
            return this.f7181le;
        }
        com.bytedance.adsdk.vt.ra.ouw<K> ouwVarVt = vt();
        Interpolator interpolator = ouwVarVt.fkw;
        A aOuw = (interpolator == null || ouwVarVt.f7204le == null) ? ouw(ouwVarVt, yu()) : ouw(ouwVarVt, interpolator.getInterpolation(fLh), ouwVarVt.f7204le.getInterpolation(fLh));
        this.f7181le = aOuw;
        return aOuw;
    }

    public final float lh() {
        if (this.vt) {
            return 0.0f;
        }
        com.bytedance.adsdk.vt.ra.ouw<K> ouwVarVt = vt();
        if (ouwVarVt.yu()) {
            return 0.0f;
        }
        return (this.f7182lh - ouwVarVt.vt()) / (ouwVarVt.lh() - ouwVarVt.vt());
    }

    public abstract A ouw(com.bytedance.adsdk.vt.ra.ouw<K> ouwVar, float f10);

    public final void ouw(InterfaceC0040ouw interfaceC0040ouw) {
        this.ouw.add(interfaceC0040ouw);
    }

    public final float ra() {
        return this.f7182lh;
    }

    public final com.bytedance.adsdk.vt.ra.ouw<K> vt() {
        com.bytedance.adsdk.vt.fkw.ouw("BaseKeyframeAnimation#getCurrentKeyframe");
        com.bytedance.adsdk.vt.ra.ouw<K> ouwVarVt = this.fkw.vt();
        com.bytedance.adsdk.vt.fkw.vt("BaseKeyframeAnimation#getCurrentKeyframe");
        return ouwVarVt;
    }

    public final float yu() {
        com.bytedance.adsdk.vt.ra.ouw<K> ouwVarVt = vt();
        if (ouwVarVt == null || ouwVarVt.yu()) {
            return 0.0f;
        }
        return ouwVarVt.yu.getInterpolation(lh());
    }

    public void ouw(float f10) {
        if (this.fkw.ouw()) {
            return;
        }
        if (f10 < pno()) {
            f10 = pno();
        } else if (f10 > fkw()) {
            f10 = fkw();
        }
        if (f10 == this.f7182lh) {
            return;
        }
        this.f7182lh = f10;
        if (this.fkw.ouw(f10)) {
            ouw();
        }
    }

    public void ouw() {
        for (int i4 = 0; i4 < this.ouw.size(); i4++) {
            this.ouw.get(i4).ouw();
        }
    }

    public A ouw(com.bytedance.adsdk.vt.ra.ouw<K> ouwVar, float f10, float f11) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }
}

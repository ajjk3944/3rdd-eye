package com.bytedance.adsdk.ypw.emc.ypw;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class emc<K, A> {
    private final xq<K> bw;
    protected com.bytedance.adsdk.ypw.uym.ypw<A> xq;
    final List<InterfaceC0106emc> emc = new ArrayList(1);
    private boolean dg = false;
    protected float ypw = 0.0f;
    private A ycc = null;
    private float uym = -1.0f;
    private float msw = -1.0f;

    public static final class bw<T> implements xq<T> {
        private final com.bytedance.adsdk.ypw.uym.emc<T> emc;
        private float ypw = -1.0f;

        public bw(List<? extends com.bytedance.adsdk.ypw.uym.emc<T>> list) {
            this.emc = list.get(0);
        }

        @Override // com.bytedance.adsdk.ypw.emc.ypw.emc.xq
        public float dg() {
            return this.emc.dg();
        }

        @Override // com.bytedance.adsdk.ypw.emc.ypw.emc.xq
        public boolean emc() {
            return false;
        }

        @Override // com.bytedance.adsdk.ypw.emc.ypw.emc.xq
        public float xq() {
            return this.emc.xq();
        }

        @Override // com.bytedance.adsdk.ypw.emc.ypw.emc.xq
        public com.bytedance.adsdk.ypw.uym.emc<T> ypw() {
            return this.emc;
        }

        @Override // com.bytedance.adsdk.ypw.emc.ypw.emc.xq
        public boolean emc(float f10) {
            return !this.emc.bw();
        }

        @Override // com.bytedance.adsdk.ypw.emc.ypw.emc.xq
        public boolean ypw(float f10) {
            if (this.ypw == f10) {
                return true;
            }
            this.ypw = f10;
            return false;
        }
    }

    public static final class dg<T> implements xq<T> {
        private final List<? extends com.bytedance.adsdk.ypw.uym.emc<T>> emc;
        private com.bytedance.adsdk.ypw.uym.emc<T> xq = null;
        private float dg = -1.0f;
        private com.bytedance.adsdk.ypw.uym.emc<T> ypw = xq(0.0f);

        public dg(List<? extends com.bytedance.adsdk.ypw.uym.emc<T>> list) {
            this.emc = list;
        }

        private com.bytedance.adsdk.ypw.uym.emc<T> xq(float f10) {
            com.bytedance.adsdk.ypw.uym.emc<T> emcVar = this.emc.get(r0.size() - 1);
            if (f10 >= emcVar.xq()) {
                return emcVar;
            }
            for (int size = this.emc.size() - 2; size > 0; size--) {
                com.bytedance.adsdk.ypw.uym.emc<T> emcVar2 = this.emc.get(size);
                if (this.ypw != emcVar2 && emcVar2.emc(f10)) {
                    return emcVar2;
                }
            }
            return this.emc.get(0);
        }

        @Override // com.bytedance.adsdk.ypw.emc.ypw.emc.xq
        public float dg() {
            return this.emc.get(r0.size() - 1).dg();
        }

        @Override // com.bytedance.adsdk.ypw.emc.ypw.emc.xq
        public boolean emc() {
            return false;
        }

        @Override // com.bytedance.adsdk.ypw.emc.ypw.emc.xq
        public com.bytedance.adsdk.ypw.uym.emc<T> ypw() {
            return this.ypw;
        }

        @Override // com.bytedance.adsdk.ypw.emc.ypw.emc.xq
        public boolean emc(float f10) {
            if (this.ypw.emc(f10)) {
                return !this.ypw.bw();
            }
            this.ypw = xq(f10);
            return true;
        }

        @Override // com.bytedance.adsdk.ypw.emc.ypw.emc.xq
        public boolean ypw(float f10) {
            com.bytedance.adsdk.ypw.uym.emc<T> emcVar = this.xq;
            com.bytedance.adsdk.ypw.uym.emc<T> emcVar2 = this.ypw;
            if (emcVar == emcVar2 && this.dg == f10) {
                return true;
            }
            this.xq = emcVar2;
            this.dg = f10;
            return false;
        }

        @Override // com.bytedance.adsdk.ypw.emc.ypw.emc.xq
        public float xq() {
            return this.emc.get(0).xq();
        }
    }

    /* renamed from: com.bytedance.adsdk.ypw.emc.ypw.emc$emc, reason: collision with other inner class name */
    public interface InterfaceC0106emc {
        void emc();
    }

    public interface xq<T> {
        float dg();

        boolean emc();

        boolean emc(float f10);

        float xq();

        com.bytedance.adsdk.ypw.uym.emc<T> ypw();

        boolean ypw(float f10);
    }

    public static final class ypw<T> implements xq<T> {
        private ypw() {
        }

        @Override // com.bytedance.adsdk.ypw.emc.ypw.emc.xq
        public float dg() {
            return 1.0f;
        }

        @Override // com.bytedance.adsdk.ypw.emc.ypw.emc.xq
        public boolean emc() {
            return true;
        }

        @Override // com.bytedance.adsdk.ypw.emc.ypw.emc.xq
        public float xq() {
            return 0.0f;
        }

        @Override // com.bytedance.adsdk.ypw.emc.ypw.emc.xq
        public com.bytedance.adsdk.ypw.uym.emc<T> ypw() {
            throw new IllegalStateException("not implemented");
        }

        @Override // com.bytedance.adsdk.ypw.emc.ypw.emc.xq
        public boolean emc(float f10) {
            return false;
        }

        @Override // com.bytedance.adsdk.ypw.emc.ypw.emc.xq
        public boolean ypw(float f10) {
            throw new IllegalStateException("not implemented");
        }
    }

    public emc(List<? extends com.bytedance.adsdk.ypw.uym.emc<K>> list) {
        this.bw = emc(list);
    }

    private float zz() {
        if (this.uym == -1.0f) {
            this.uym = this.bw.xq();
        }
        return this.uym;
    }

    public float bw() {
        com.bytedance.adsdk.ypw.uym.emc<K> emcVarXq = xq();
        if (emcVarXq == null || emcVarXq.bw()) {
            return 0.0f;
        }
        return emcVarXq.xq.getInterpolation(dg());
    }

    public float dg() {
        if (this.dg) {
            return 0.0f;
        }
        com.bytedance.adsdk.ypw.uym.emc<K> emcVarXq = xq();
        if (emcVarXq.bw()) {
            return 0.0f;
        }
        return (this.ypw - emcVarXq.xq()) / (emcVarXq.dg() - emcVarXq.xq());
    }

    public abstract A emc(com.bytedance.adsdk.ypw.uym.emc<K> emcVar, float f10);

    public void emc() {
        this.dg = true;
    }

    public float msw() {
        return this.ypw;
    }

    public A uym() {
        float fDg = dg();
        if (this.xq == null && this.bw.ypw(fDg)) {
            return this.ycc;
        }
        com.bytedance.adsdk.ypw.uym.emc<K> emcVarXq = xq();
        Interpolator interpolator = emcVarXq.dg;
        A aEmc = (interpolator == null || emcVarXq.bw == null) ? emc(emcVarXq, bw()) : emc(emcVarXq, fDg, interpolator.getInterpolation(fDg), emcVarXq.bw.getInterpolation(fDg));
        this.ycc = aEmc;
        return aEmc;
    }

    public com.bytedance.adsdk.ypw.uym.emc<K> xq() {
        com.bytedance.adsdk.ypw.bw.emc("BaseKeyframeAnimation#getCurrentKeyframe");
        com.bytedance.adsdk.ypw.uym.emc<K> emcVarYpw = this.bw.ypw();
        com.bytedance.adsdk.ypw.bw.ypw("BaseKeyframeAnimation#getCurrentKeyframe");
        return emcVarYpw;
    }

    public float ycc() {
        if (this.msw == -1.0f) {
            this.msw = this.bw.dg();
        }
        return this.msw;
    }

    public void ypw() {
        for (int i10 = 0; i10 < this.emc.size(); i10++) {
            this.emc.get(i10).emc();
        }
    }

    public void emc(InterfaceC0106emc interfaceC0106emc) {
        this.emc.add(interfaceC0106emc);
    }

    public void emc(float f10) {
        if (this.bw.emc()) {
            return;
        }
        if (f10 < zz()) {
            f10 = zz();
        } else if (f10 > ycc()) {
            f10 = ycc();
        }
        if (f10 == this.ypw) {
            return;
        }
        this.ypw = f10;
        if (this.bw.emc(f10)) {
            ypw();
        }
    }

    public A emc(com.bytedance.adsdk.ypw.uym.emc<K> emcVar, float f10, float f11, float f12) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    private static <T> xq<T> emc(List<? extends com.bytedance.adsdk.ypw.uym.emc<T>> list) {
        if (list.isEmpty()) {
            return new ypw();
        }
        if (list.size() == 1) {
            return new bw(list);
        }
        return new dg(list);
    }
}

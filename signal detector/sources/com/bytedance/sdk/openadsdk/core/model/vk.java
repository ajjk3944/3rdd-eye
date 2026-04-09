package com.bytedance.sdk.openadsdk.core.model;

import android.util.SparseArray;
import com.bytedance.sdk.openadsdk.core.xq.xq;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class vk implements com.bytedance.sdk.component.adexpress.xq {
    public final long bw;
    public int cf;
    public final float dg;
    public final float emc;
    public final boolean gbl;
    public int msw;
    public boolean qh;
    public SparseArray<xq.emc> ru;
    public int sup;
    public JSONObject sz;
    public final String uym;
    public final float xq;
    public final long ycc;
    public final float ypw;
    public JSONObject zz;

    public static class emc {
        private float bw;
        private boolean cf;
        private float dg;
        private JSONObject gbl;
        private int msw;
        private int ru;
        private int sup;
        private JSONObject sz;
        private float uym;
        private long xq;
        private float ycc;
        private long ypw;
        private String zz;
        private boolean qh = false;
        protected SparseArray<xq.emc> emc = new SparseArray<>();

        public emc dg(float f2) {
            this.uym = f2;
            return this;
        }

        public emc emc(int i) {
            this.sup = i;
            return this;
        }

        public emc xq(int i) {
            this.msw = i;
            return this;
        }

        public emc ypw(int i) {
            this.ru = i;
            return this;
        }

        public emc emc(JSONObject jSONObject) {
            this.gbl = jSONObject;
            return this;
        }

        public emc xq(float f2) {
            this.ycc = f2;
            return this;
        }

        public emc ypw(long j6) {
            this.xq = j6;
            return this;
        }

        public emc emc(boolean z6) {
            this.cf = z6;
            return this;
        }

        public emc ypw(float f2) {
            this.bw = f2;
            return this;
        }

        public emc emc(long j6) {
            this.ypw = j6;
            return this;
        }

        public emc ypw(JSONObject jSONObject) {
            this.sz = jSONObject;
            return this;
        }

        public emc emc(float f2) {
            this.dg = f2;
            return this;
        }

        public emc ypw(boolean z6) {
            this.qh = z6;
            return this;
        }

        public emc emc(String str) {
            this.zz = str;
            return this;
        }

        public emc emc(SparseArray<xq.emc> sparseArray) {
            this.emc = sparseArray;
            return this;
        }

        public vk emc() {
            return new vk(this);
        }
    }

    private vk(emc emcVar) {
        this.qh = false;
        this.emc = emcVar.uym;
        this.ypw = emcVar.ycc;
        this.xq = emcVar.bw;
        this.dg = emcVar.dg;
        this.bw = emcVar.xq;
        this.ycc = emcVar.ypw;
        this.uym = emcVar.zz;
        this.ru = emcVar.emc;
        this.gbl = emcVar.cf;
        this.msw = emcVar.ru;
        this.zz = emcVar.gbl;
        this.sup = emcVar.sup;
        this.sz = emcVar.sz;
        this.qh = emcVar.qh;
        this.cf = emcVar.msw;
    }
}

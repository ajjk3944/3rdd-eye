package com.bytedance.adsdk.ypw;

import android.graphics.Rect;
import android.util.LongSparseArray;
import android.util.SparseArray;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

/* loaded from: classes.dex */
public class uym {
    private Map<String, com.bytedance.adsdk.ypw.xq.xq> bw;
    private Map<String, ru> dg;
    private float gbl;
    private LongSparseArray<com.bytedance.adsdk.ypw.xq.xq.bw> msw;
    private boolean qh;
    private Rect ru;
    private emc sba;
    private float sup;
    private float sz;
    private SparseArray<com.bytedance.adsdk.ypw.xq.dg> uym;
    private xq vk;
    private Map<String, List<com.bytedance.adsdk.ypw.xq.xq.bw>> xq;
    private List<com.bytedance.adsdk.ypw.xq.ycc> ycc;
    private ypw yzg;
    private List<com.bytedance.adsdk.ypw.xq.xq.bw> zz;
    private final sba emc = new sba();
    private final HashSet<String> ypw = new HashSet<>();
    private int cf = 0;

    /* renamed from: aa, reason: collision with root package name */
    private String f9221aa = "";

    public static class emc {
        public int bw;
        public int dg;
        public int emc;
        public JSONArray uym;
        public Map<String, Object> xq;
        public String ycc;
        public Map<String, Object> ypw;
    }

    public static class xq {
        public int[] bw;
        public String dg;
        public int emc;
        public JSONArray uym;
        public String xq;
        public String ycc;
        public String ypw;
    }

    public static class ypw {
        public String emc;
        public JSONArray xq;
        public int[][] ypw;
    }

    public float aa() {
        return this.sup - this.gbl;
    }

    public float bw() {
        return (long) ((aa() / this.sz) * 1000.0f);
    }

    public Map<String, com.bytedance.adsdk.ypw.xq.xq> cf() {
        return this.bw;
    }

    public Rect dg() {
        return this.ru;
    }

    public void emc(Rect rect, float f10, float f11, float f12, List<com.bytedance.adsdk.ypw.xq.xq.bw> list, LongSparseArray<com.bytedance.adsdk.ypw.xq.xq.bw> longSparseArray, Map<String, List<com.bytedance.adsdk.ypw.xq.xq.bw>> map, Map<String, ru> map2, SparseArray<com.bytedance.adsdk.ypw.xq.dg> sparseArray, Map<String, com.bytedance.adsdk.ypw.xq.xq> map3, List<com.bytedance.adsdk.ypw.xq.ycc> list2, xq xqVar, String str, emc emcVar, ypw ypwVar) {
        this.ru = rect;
        this.gbl = f10;
        this.sup = f11;
        this.sz = f12;
        this.zz = list;
        this.msw = longSparseArray;
        this.xq = map;
        this.dg = map2;
        this.uym = sparseArray;
        this.bw = map3;
        this.ycc = list2;
        this.vk = xqVar;
        this.f9221aa = str;
        this.sba = emcVar;
        this.yzg = ypwVar;
    }

    public emc gbl() {
        return this.sba;
    }

    public xq msw() {
        return this.vk;
    }

    public SparseArray<com.bytedance.adsdk.ypw.xq.dg> qh() {
        return this.uym;
    }

    public ypw ru() {
        return this.yzg;
    }

    public float sup() {
        return this.sz;
    }

    public List<com.bytedance.adsdk.ypw.xq.xq.bw> sz() {
        return this.zz;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        Iterator<com.bytedance.adsdk.ypw.xq.xq.bw> it = this.zz.iterator();
        while (it.hasNext()) {
            sb.append(it.next().emc("\t"));
        }
        return sb.toString();
    }

    public float uym() {
        return this.sup;
    }

    public Map<String, ru> vk() {
        return this.dg;
    }

    public sba xq() {
        return this.emc;
    }

    public float ycc() {
        return this.gbl;
    }

    public int ypw() {
        return this.cf;
    }

    public String zz() {
        return this.f9221aa;
    }

    public com.bytedance.adsdk.ypw.xq.ycc xq(String str) {
        int size = this.ycc.size();
        for (int i10 = 0; i10 < size; i10++) {
            com.bytedance.adsdk.ypw.xq.ycc yccVar = this.ycc.get(i10);
            if (yccVar.emc(str)) {
                return yccVar;
            }
        }
        return null;
    }

    public void ypw(boolean z10) {
        this.emc.emc(z10);
    }

    public List<com.bytedance.adsdk.ypw.xq.xq.bw> ypw(String str) {
        return this.xq.get(str);
    }

    public void emc(String str) {
        this.ypw.add(str);
    }

    public void emc(boolean z10) {
        this.qh = z10;
    }

    public void emc(int i10) {
        this.cf += i10;
    }

    public boolean emc() {
        return this.qh;
    }

    public com.bytedance.adsdk.ypw.xq.xq.bw emc(long j10) {
        return this.msw.get(j10);
    }

    public float emc(float f10) {
        return com.bytedance.adsdk.ypw.ycc.bw.emc(this.gbl, this.sup, f10);
    }
}

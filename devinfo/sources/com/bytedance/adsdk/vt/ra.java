package com.bytedance.adsdk.vt;

import android.graphics.Rect;
import android.util.LongSparseArray;
import android.util.SparseArray;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class ra {
    public Rect bly;

    /* renamed from: cf, reason: collision with root package name */
    public float f7195cf;
    List<com.bytedance.adsdk.vt.lh.le> fkw;
    lh ko;

    /* renamed from: le, reason: collision with root package name */
    public SparseArray<com.bytedance.adsdk.vt.lh.yu> f7197le;

    /* renamed from: lh, reason: collision with root package name */
    Map<String, tlj> f7198lh;
    public boolean mwh;
    public List<com.bytedance.adsdk.vt.lh.lh.fkw> pno;
    LongSparseArray<com.bytedance.adsdk.vt.lh.lh.fkw> ra;
    public float ryl;
    public float tlj;
    vt vm;
    public Map<String, List<com.bytedance.adsdk.vt.lh.lh.fkw>> vt;
    public Map<String, com.bytedance.adsdk.vt.lh.lh> yu;
    ouw zih;
    public final th ouw = new th();

    /* renamed from: th, reason: collision with root package name */
    private final HashSet<String> f7199th = new HashSet<>();

    /* renamed from: jg, reason: collision with root package name */
    int f7196jg = 0;
    String rn = "";

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class lh {
        public int[] fkw;

        /* renamed from: le, reason: collision with root package name */
        public String f7200le;

        /* renamed from: lh, reason: collision with root package name */
        public String f7201lh;
        public int ouw;
        public JSONArray ra;
        public String vt;
        public String yu;
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class ouw {
        public int fkw;

        /* renamed from: le, reason: collision with root package name */
        public String f7206le;

        /* renamed from: lh, reason: collision with root package name */
        public Map<String, Object> f7207lh;
        public int ouw;
        public JSONArray ra;
        public Map<String, Object> vt;
        public int yu;
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class vt {

        /* renamed from: lh, reason: collision with root package name */
        public JSONArray f7208lh;
        public String ouw;
        public int[][] vt;
    }

    public final void ouw(String str) {
        com.bytedance.adsdk.vt.le.yu.vt(str);
        this.f7199th.add(str);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("LottieComposition:\n");
        Iterator<com.bytedance.adsdk.vt.lh.lh.fkw> it = this.pno.iterator();
        while (it.hasNext()) {
            sb2.append(it.next().ouw("\t"));
        }
        return sb2.toString();
    }

    public final com.bytedance.adsdk.vt.lh.le vt(String str) {
        int size = this.fkw.size();
        for (int i4 = 0; i4 < size; i4++) {
            com.bytedance.adsdk.vt.lh.le leVar = this.fkw.get(i4);
            if (leVar.ouw.equalsIgnoreCase(str)) {
                return leVar;
            }
            if (leVar.ouw.endsWith("\r")) {
                if (leVar.ouw.substring(0, r4.length() - 1).equalsIgnoreCase(str)) {
                    return leVar;
                }
            }
        }
        return null;
    }

    public final void ouw(int i4) {
        this.f7196jg += i4;
    }

    public final void ouw(boolean z3) {
        this.ouw.ouw = z3;
    }

    public final float vt() {
        return this.f7195cf - this.tlj;
    }

    public final com.bytedance.adsdk.vt.lh.lh.fkw ouw(long j) {
        return this.ra.get(j);
    }

    public final float ouw() {
        return (long) ((vt() / this.ryl) * 1000.0f);
    }

    public final float ouw(float f10) {
        return com.bytedance.adsdk.vt.le.ra.ouw(this.tlj, this.f7195cf, f10);
    }
}

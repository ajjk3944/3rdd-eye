package com.bytedance.adsdk.ugeno.emc;

import java.util.Map;
import java.util.TreeMap;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class xq {
    private long bw;
    private String dg;
    private Map<String, TreeMap<Float, String>> emc;
    private String msw;
    private JSONObject ru;
    private String uym;
    private int xq;
    private emc ycc;
    private long ypw;
    private int zz = 1;

    public static class emc {
        public String emc;
        public String ypw;
    }

    public String bw() {
        return this.dg;
    }

    public int dg() {
        return this.xq;
    }

    public JSONObject emc() {
        return this.ru;
    }

    public String msw() {
        return this.uym;
    }

    public int ru() {
        return this.zz;
    }

    public String toString() {
        return "AnimationModel{mKeyFramesMap=" + this.emc + ", mDuration=" + this.ypw + ", mPlayCount=" + this.xq + ", mPlayDirection=" + this.dg + ", mDelay=" + this.bw + ", mName=" + this.msw + ", mPlayState=" + this.zz + ", mTransformOrigin='" + this.ycc + "', mTimingFunction='" + this.uym + "'}";
    }

    public emc uym() {
        return this.ycc;
    }

    public long xq() {
        return this.ypw;
    }

    public long ycc() {
        return this.bw;
    }

    public Map<String, TreeMap<Float, String>> ypw() {
        return this.emc;
    }

    public String zz() {
        return this.msw;
    }

    public void emc(JSONObject jSONObject) {
        this.ru = jSONObject;
    }

    public void xq(String str) {
        this.msw = str;
    }

    public void ypw(long j10) {
        this.bw = j10;
    }

    public void emc(Map<String, TreeMap<Float, String>> map) {
        this.emc = map;
    }

    public void ypw(String str) {
        this.uym = str;
    }

    public void emc(long j10) {
        this.ypw = j10;
    }

    public void ypw(int i10) {
        this.zz = i10;
    }

    public void emc(int i10) {
        this.xq = i10;
    }

    public void emc(String str) {
        this.dg = str;
    }

    public void emc(emc emcVar) {
        this.ycc = emcVar;
    }
}

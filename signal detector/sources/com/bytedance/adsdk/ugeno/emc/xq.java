package com.bytedance.adsdk.ugeno.emc;

import A.f;
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
        StringBuilder sb = new StringBuilder("AnimationModel{mKeyFramesMap=");
        sb.append(this.emc);
        sb.append(", mDuration=");
        sb.append(this.ypw);
        sb.append(", mPlayCount=");
        sb.append(this.xq);
        sb.append(", mPlayDirection=");
        sb.append(this.dg);
        sb.append(", mDelay=");
        sb.append(this.bw);
        sb.append(", mName=");
        sb.append(this.msw);
        sb.append(", mPlayState=");
        sb.append(this.zz);
        sb.append(", mTransformOrigin='");
        sb.append(this.ycc);
        sb.append("', mTimingFunction='");
        return f.p(sb, this.uym, "'}");
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

    public void ypw(long j6) {
        this.bw = j6;
    }

    public void emc(Map<String, TreeMap<Float, String>> map) {
        this.emc = map;
    }

    public void ypw(String str) {
        this.uym = str;
    }

    public void emc(long j6) {
        this.ypw = j6;
    }

    public void ypw(int i) {
        this.zz = i;
    }

    public void emc(int i) {
        this.xq = i;
    }

    public void emc(String str) {
        this.dg = str;
    }

    public void emc(emc emcVar) {
        this.ycc = emcVar;
    }
}

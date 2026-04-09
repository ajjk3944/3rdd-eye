package com.bytedance.adsdk.ypw.xq;

import com.bytedance.adsdk.ypw.xq.ypw.vk;
import java.util.List;

/* loaded from: classes.dex */
public class dg {
    private final String bw;
    private final double dg;
    private final List<vk> emc;
    private final double xq;
    private final String ycc;
    private final char ypw;

    public dg(List<vk> list, char c6, double d6, double d7, String str, String str2) {
        this.emc = list;
        this.ypw = c6;
        this.xq = d6;
        this.dg = d7;
        this.bw = str;
        this.ycc = str2;
    }

    public static int emc(char c6, String str, String str2) {
        return str2.hashCode() + ((str.hashCode() + (c6 * 31)) * 31);
    }

    public int hashCode() {
        return emc(this.ypw, this.ycc, this.bw);
    }

    public double ypw() {
        return this.dg;
    }

    public List<vk> emc() {
        return this.emc;
    }
}

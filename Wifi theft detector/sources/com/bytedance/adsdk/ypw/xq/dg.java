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

    public dg(List<vk> list, char c10, double d10, double d11, String str, String str2) {
        this.emc = list;
        this.ypw = c10;
        this.xq = d10;
        this.dg = d11;
        this.bw = str;
        this.ycc = str2;
    }

    public static int emc(char c10, String str, String str2) {
        return (((c10 * 31) + str.hashCode()) * 31) + str2.hashCode();
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

package com.bytedance.adsdk.ypw;

import android.graphics.Bitmap;
import java.util.List;
import org.json.JSONArray;

/* loaded from: classes.dex */
public class ru {
    private final String bw;
    private final String dg;
    private final int emc;
    private Bitmap gbl;
    private final String msw;
    private final JSONArray ru;
    private final List<emc> uym;
    private final String xq;
    private final String ycc;
    private final int ypw;
    private final int[][] zz;

    public static class emc {
        public int bw;
        public String dg;
        public int emc;
        public String uym;
        public String xq;
        public int ycc;
        public int ypw;
    }

    public ru(int i10, int i11, String str, String str2, String str3, String str4, List<emc> list, String str5, int[][] iArr, JSONArray jSONArray) {
        this.emc = i10;
        this.ypw = i11;
        this.xq = str;
        this.dg = str2;
        this.bw = str3;
        this.ycc = str4;
        this.uym = list;
        this.msw = str5;
        this.zz = iArr;
        this.ru = jSONArray;
    }

    public String bw() {
        return this.msw;
    }

    public String dg() {
        return this.ycc;
    }

    public int emc() {
        return this.emc;
    }

    public Bitmap gbl() {
        return this.gbl;
    }

    public String msw() {
        return this.xq;
    }

    public String ru() {
        return this.bw;
    }

    public JSONArray uym() {
        return this.ru;
    }

    public List<emc> xq() {
        return this.uym;
    }

    public int[][] ycc() {
        return this.zz;
    }

    public int ypw() {
        return this.ypw;
    }

    public String zz() {
        return this.dg;
    }

    public void emc(Bitmap bitmap) {
        this.gbl = bitmap;
    }
}

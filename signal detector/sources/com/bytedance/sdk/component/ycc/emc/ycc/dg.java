package com.bytedance.sdk.component.ycc.emc.ycc;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes.dex */
public class dg {
    private final int bw;
    private final String emc;
    private boolean gbl;
    private String msw;
    private String uym;
    private final boolean xq;
    private final String ycc;
    private final String ypw;
    private int dg = -1;
    private int zz = 0;
    private String ru = null;

    public dg(String str, String str2, boolean z6, int i, String str3) {
        this.emc = str;
        this.ypw = str2;
        this.xq = z6;
        this.bw = i;
        this.ycc = str3;
    }

    public int bw() {
        return this.bw;
    }

    public int dg() {
        return this.dg;
    }

    public String emc() {
        return this.emc;
    }

    public boolean gbl() {
        return this.dg == -1;
    }

    public int msw() {
        return this.zz;
    }

    public boolean ru() {
        return this.gbl;
    }

    public String uym() {
        return this.uym;
    }

    public boolean xq() {
        return this.xq;
    }

    public String ycc() {
        return this.ycc;
    }

    public String ypw() {
        return this.ypw;
    }

    public String zz() {
        return this.msw;
    }

    public void emc(int i) {
        this.dg = i;
    }

    public void xq(String str) {
        this.ru = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (TextUtils.isEmpty(this.msw)) {
            this.msw = String.valueOf(this.ru);
            return;
        }
        this.msw += "," + this.ru;
    }

    public void ypw(int i) {
        this.zz = i;
        if (i == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.uym)) {
            this.uym = String.valueOf(this.zz);
            return;
        }
        this.uym += "," + this.zz;
    }

    public void emc(String str) {
        this.uym = str;
    }

    public void emc(boolean z6) {
        this.gbl = z6;
    }

    public Runnable emc(String str, Map<String, String> map) {
        return emc.emc().emc(this, str, map);
    }

    public void ypw(String str) {
        this.msw = str;
    }
}

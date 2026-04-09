package com.bytedance.sdk.component.uym;

import com.bytedance.sdk.component.ypw.emc.ru;
import java.io.File;
import java.util.Map;

/* loaded from: classes.dex */
public class ypw {
    final long bw;
    final String dg;
    final int emc;
    private File msw = null;
    private byte[] ru = null;
    ru uym;
    final Map<String, String> xq;
    final long ycc;
    final String ypw;
    private final boolean zz;

    public ypw(boolean z10, int i10, String str, Map<String, String> map, String str2, long j10, long j11) {
        this.zz = z10;
        this.emc = i10;
        this.ypw = str;
        this.xq = map;
        this.dg = str2;
        this.bw = j10;
        this.ycc = j11;
    }

    public File bw() {
        return this.msw;
    }

    public String dg() {
        return this.dg;
    }

    public int emc() {
        return this.emc;
    }

    public ru uym() {
        return this.uym;
    }

    public Map<String, String> xq() {
        return this.xq;
    }

    public boolean ycc() {
        return this.zz;
    }

    public String ypw() {
        return this.ypw;
    }

    public void emc(File file) {
        this.msw = file;
    }

    public void emc(byte[] bArr) {
        this.ru = bArr;
    }

    public void emc(ru ruVar) {
        this.uym = ruVar;
    }
}

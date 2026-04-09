package com.bytedance.sdk.component.ypw.emc;

import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class zz {
    private String emc;
    private String ypw;

    private zz(String str) {
        this.emc = str;
    }

    public static zz emc(String str) {
        return new zz(str);
    }

    public String emc() {
        return this.emc;
    }

    public Charset emc(Charset charset) {
        try {
            String str = this.ypw;
            return str != null ? Charset.forName(str) : charset;
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }
}

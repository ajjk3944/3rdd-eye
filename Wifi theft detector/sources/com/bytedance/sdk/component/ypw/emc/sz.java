package com.bytedance.sdk.component.ypw.emc;

/* loaded from: classes.dex */
public class sz {
    public byte[] bw;
    public String dg;
    public zz xq;
    public emc ycc;

    public enum emc {
        STRING_TYPE,
        BYTE_ARRAY_TYPE
    }

    public sz() {
    }

    public static sz emc(zz zzVar, String str) {
        return new sz(zzVar, str, emc.STRING_TYPE);
    }

    public sz(zz zzVar, String str, emc emcVar) {
        this.xq = zzVar;
        this.dg = str;
        this.ycc = emcVar;
    }

    public static sz emc(zz zzVar, byte[] bArr) {
        return new sz(zzVar, bArr, emc.BYTE_ARRAY_TYPE);
    }

    public sz(zz zzVar, byte[] bArr, emc emcVar) {
        this.xq = zzVar;
        this.bw = bArr;
        this.ycc = emcVar;
    }
}

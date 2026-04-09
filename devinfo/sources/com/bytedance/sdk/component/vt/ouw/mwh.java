package com.bytedance.sdk.component.vt.ouw;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class mwh {
    public byte[] fkw;

    /* renamed from: le, reason: collision with root package name */
    public ouw f7650le;

    /* renamed from: lh, reason: collision with root package name */
    public bly f7651lh;
    public String yu;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public enum ouw {
        STRING_TYPE,
        BYTE_ARRAY_TYPE
    }

    public mwh() {
    }

    public static mwh ouw(bly blyVar, String str) {
        return new mwh(blyVar, str, ouw.STRING_TYPE);
    }

    private mwh(bly blyVar, String str, ouw ouwVar) {
        this.f7651lh = blyVar;
        this.yu = str;
        this.f7650le = ouwVar;
    }

    public mwh(bly blyVar, byte[] bArr, ouw ouwVar) {
        this.f7651lh = blyVar;
        this.fkw = bArr;
        this.f7650le = ouwVar;
    }
}

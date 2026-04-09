package com.applovin.impl;

import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private final int f4185a;

    /* renamed from: b, reason: collision with root package name */
    private final int f4186b;

    /* renamed from: c, reason: collision with root package name */
    private final int f4187c;

    /* renamed from: d, reason: collision with root package name */
    private final int f4188d;

    public h(int i4, int i10, int i11, int i12) {
        this.f4185a = i4;
        this.f4186b = i10;
        this.f4187c = i11;
        this.f4188d = i12;
    }

    public boolean a(Object obj) {
        return obj instanceof h;
    }

    public int b() {
        return this.f4187c;
    }

    public int c() {
        return this.f4186b;
    }

    public int d() {
        return this.f4185a;
    }

    public Map e() {
        HashMap map = new HashMap(4);
        map.put("asr_num", Integer.valueOf(this.f4185a));
        map.put("air_num", Integer.valueOf(this.f4186b));
        map.put("fsr_num", Integer.valueOf(this.f4187c));
        map.put("fir_num", Integer.valueOf(this.f4188d));
        return map;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return hVar.a(this) && d() == hVar.d() && c() == hVar.c() && b() == hVar.b() && a() == hVar.a();
    }

    public int hashCode() {
        return a() + ((b() + ((c() + ((d() + 59) * 59)) * 59)) * 59);
    }

    public String toString() {
        return "AdRequestNumberInfo(adUnitSessionAdRequestNumber=" + d() + ", adUnitInstallAdRequestNumber=" + c() + ", adFormatSessionAdRequestNumber=" + b() + ", adFormatInstallAdRequestNumber=" + a() + ")";
    }

    public int a() {
        return this.f4188d;
    }
}

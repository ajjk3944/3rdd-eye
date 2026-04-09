package com.applovin.impl;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private final int f6100a;

    /* renamed from: b, reason: collision with root package name */
    private final int f6101b;

    /* renamed from: c, reason: collision with root package name */
    private final int f6102c;

    /* renamed from: d, reason: collision with root package name */
    private final int f6103d;

    public h(int i10, int i11, int i12, int i13) {
        this.f6100a = i10;
        this.f6101b = i11;
        this.f6102c = i12;
        this.f6103d = i13;
    }

    public boolean a(Object obj) {
        return obj instanceof h;
    }

    public int b() {
        return this.f6102c;
    }

    public int c() {
        return this.f6101b;
    }

    public int d() {
        return this.f6100a;
    }

    public Map e() {
        HashMap map = new HashMap(4);
        map.put("asr_num", Integer.valueOf(this.f6100a));
        map.put("air_num", Integer.valueOf(this.f6101b));
        map.put("fsr_num", Integer.valueOf(this.f6102c));
        map.put("fir_num", Integer.valueOf(this.f6103d));
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
        return ((((((d() + 59) * 59) + c()) * 59) + b()) * 59) + a();
    }

    public String toString() {
        return "AdRequestNumberInfo(adUnitSessionAdRequestNumber=" + d() + ", adUnitInstallAdRequestNumber=" + c() + ", adFormatSessionAdRequestNumber=" + b() + ", adFormatInstallAdRequestNumber=" + a() + ")";
    }

    public int a() {
        return this.f6103d;
    }
}

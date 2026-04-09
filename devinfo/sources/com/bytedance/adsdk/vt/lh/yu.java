package com.bytedance.adsdk.vt.lh;

import com.bytedance.adsdk.vt.lh.vt.rn;
import java.util.List;
import je.u;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class yu {
    private final String fkw;

    /* renamed from: le, reason: collision with root package name */
    private final String f7136le;

    /* renamed from: lh, reason: collision with root package name */
    private final char f7137lh;
    public final List<rn> ouw;
    public final double vt;
    private final double yu;

    public yu(List<rn> list, char c9, double d10, double d11, String str, String str2) {
        this.ouw = list;
        this.f7137lh = c9;
        this.yu = d10;
        this.vt = d11;
        this.fkw = str;
        this.f7136le = str2;
    }

    public static int ouw(char c9, String str, String str2) {
        return str2.hashCode() + u.m(c9 * 31, 31, str);
    }

    public final int hashCode() {
        return ouw(this.f7137lh, this.f7136le, this.fkw);
    }
}

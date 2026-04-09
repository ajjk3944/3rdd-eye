package com.bytedance.adsdk.vt;

import android.graphics.Bitmap;
import java.util.List;
import org.json.JSONArray;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class tlj {
    final int[][] bly;

    /* renamed from: cf, reason: collision with root package name */
    public Bitmap f7211cf;
    public final String fkw;

    /* renamed from: le, reason: collision with root package name */
    public final String f7212le;

    /* renamed from: lh, reason: collision with root package name */
    public final String f7213lh;
    public final int ouw;
    final String pno;
    public final List<ouw> ra;
    final JSONArray tlj;
    public final int vt;
    public final String yu;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class ouw {
        public int fkw;

        /* renamed from: le, reason: collision with root package name */
        public int f7214le;

        /* renamed from: lh, reason: collision with root package name */
        public String f7215lh;
        public int ouw;
        public String ra;
        public int vt;
        public String yu;
    }

    public tlj(int i4, int i10, String str, String str2, String str3, String str4, List<ouw> list, String str5, int[][] iArr, JSONArray jSONArray) {
        this.ouw = i4;
        this.vt = i10;
        this.f7213lh = str;
        this.yu = str2;
        this.fkw = str3;
        this.f7212le = str4;
        this.ra = list;
        this.pno = str5;
        this.bly = iArr;
        this.tlj = jSONArray;
    }
}

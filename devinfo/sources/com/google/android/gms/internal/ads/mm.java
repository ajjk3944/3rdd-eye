package com.google.android.gms.internal.ads;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class mm extends sm {

    /* renamed from: i, reason: collision with root package name */
    public static final int f13944i;
    public static final int j;

    /* renamed from: a, reason: collision with root package name */
    public final String f13945a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f13946b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f13947c;

    /* renamed from: d, reason: collision with root package name */
    public final int f13948d;

    /* renamed from: e, reason: collision with root package name */
    public final int f13949e;

    /* renamed from: f, reason: collision with root package name */
    public final int f13950f;
    public final int g;

    /* renamed from: h, reason: collision with root package name */
    public final int f13951h;

    static {
        int iRgb = Color.rgb(12, 174, 206);
        f13944i = Color.rgb(204, 204, 204);
        j = iRgb;
    }

    public mm(String str, List list, Integer num, Integer num2, Integer num3, int i4, int i10) {
        super("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
        this.f13946b = new ArrayList();
        this.f13947c = new ArrayList();
        this.f13945a = str;
        for (int i11 = 0; i11 < list.size(); i11++) {
            om omVar = (om) list.get(i11);
            this.f13946b.add(omVar);
            this.f13947c.add(omVar);
        }
        this.f13948d = num != null ? num.intValue() : f13944i;
        this.f13949e = num2 != null ? num2.intValue() : j;
        this.f13950f = num3 != null ? num3.intValue() : 12;
        this.g = i4;
        this.f13951h = i10;
    }

    @Override // com.google.android.gms.internal.ads.tm
    public final String a() {
        return this.f13945a;
    }

    @Override // com.google.android.gms.internal.ads.tm
    public final ArrayList zzc() {
        return this.f13947c;
    }
}

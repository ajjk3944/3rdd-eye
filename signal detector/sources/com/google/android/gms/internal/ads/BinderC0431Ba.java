package com.google.android.gms.internal.ads;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Ba, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC0431Ba extends AbstractBinderC0533Ha {
    public static final int i;

    /* renamed from: j, reason: collision with root package name */
    public static final int f7356j;

    /* renamed from: a, reason: collision with root package name */
    public final String f7357a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f7358b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f7359c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7360d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7361e;

    /* renamed from: f, reason: collision with root package name */
    public final int f7362f;

    /* renamed from: g, reason: collision with root package name */
    public final int f7363g;

    /* renamed from: h, reason: collision with root package name */
    public final int f7364h;

    static {
        int iRgb = Color.rgb(12, 174, 206);
        i = Color.rgb(204, 204, 204);
        f7356j = iRgb;
    }

    public BinderC0431Ba(String str, List list, Integer num, Integer num2, Integer num3, int i3, int i6) {
        super("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
        this.f7358b = new ArrayList();
        this.f7359c = new ArrayList();
        this.f7357a = str;
        for (int i7 = 0; i7 < list.size(); i7++) {
            BinderC0465Da binderC0465Da = (BinderC0465Da) list.get(i7);
            this.f7358b.add(binderC0465Da);
            this.f7359c.add(binderC0465Da);
        }
        this.f7360d = num != null ? num.intValue() : i;
        this.f7361e = num2 != null ? num2.intValue() : f7356j;
        this.f7362f = num3 != null ? num3.intValue() : 12;
        this.f7363g = i3;
        this.f7364h = i6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0550Ia
    public final String c() {
        return this.f7357a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0550Ia
    public final ArrayList f() {
        return this.f7359c;
    }
}

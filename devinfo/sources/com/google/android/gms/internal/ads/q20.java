package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;
import java.util.HashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class q20 implements h20 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f15192a;

    /* renamed from: b, reason: collision with root package name */
    public final ya.c0 f15193b = ua.j.C.f35265h.i();

    public q20(Context context) {
        this.f15192a = context;
    }

    @Override // com.google.android.gms.internal.ads.h20
    public final void a(HashMap map) throws IOException {
        String str;
        if (map.isEmpty() || (str = (String) map.get("gad_idless")) == null) {
            return;
        }
        boolean z3 = Boolean.parseBoolean(str);
        this.f15193b.D(z3);
        if (z3) {
            nh.a.z(this.f15192a);
        }
    }
}

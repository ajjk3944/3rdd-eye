package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a21 implements w11 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f9191a = new ArrayList();

    @Override // com.google.android.gms.internal.ads.w11
    public final synchronized void d(HashMap map, Context context, View view) {
        ArrayList arrayList = this.f9191a;
        map.put("vst", new ArrayList(arrayList));
        arrayList.clear();
    }

    @Override // com.google.android.gms.internal.ads.w11
    public final void a(HashMap map) {
    }

    @Override // com.google.android.gms.internal.ads.w11
    public final void c(HashMap map) {
    }
}

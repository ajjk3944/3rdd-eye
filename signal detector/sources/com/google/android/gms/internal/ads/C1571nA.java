package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.nA, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1571nA implements InterfaceC1409kA {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f15758a = new ArrayList();

    @Override // com.google.android.gms.internal.ads.InterfaceC1409kA
    public final synchronized void d(HashMap map, Context context, View view) {
        ArrayList arrayList = this.f15758a;
        map.put("vst", new ArrayList(arrayList));
        arrayList.clear();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1409kA
    public final void b(HashMap map) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1409kA
    public final void c(HashMap map) {
    }
}

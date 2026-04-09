package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.jA, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1355jA {

    /* renamed from: a, reason: collision with root package name */
    public final Set f14910a;

    /* renamed from: b, reason: collision with root package name */
    public final C1571nA f14911b;

    public C1355jA(C1571nA c1571nA, Set set) {
        this.f14910a = set;
        this.f14911b = c1571nA;
    }

    public final HashMap a() {
        HashMap map = new HashMap();
        Iterator it = this.f14910a.iterator();
        while (it.hasNext()) {
            ((InterfaceC1409kA) it.next()).c(map);
        }
        return map;
    }

    public final HashMap b(Context context, View view) {
        HashMap map = new HashMap();
        Iterator it = this.f14910a.iterator();
        while (it.hasNext()) {
            ((InterfaceC1409kA) it.next()).d(map, context, view);
        }
        return map;
    }

    public final HashMap c() {
        HashMap map = new HashMap();
        Iterator it = this.f14910a.iterator();
        while (it.hasNext()) {
            ((InterfaceC1409kA) it.next()).b(map);
        }
        return map;
    }
}

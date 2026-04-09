package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class v11 {

    /* renamed from: a, reason: collision with root package name */
    public final Set f17428a;

    /* renamed from: b, reason: collision with root package name */
    public final a21 f17429b;

    public v11(a21 a21Var, Set set) {
        this.f17428a = set;
        this.f17429b = a21Var;
    }

    public final HashMap a() {
        HashMap map = new HashMap();
        Iterator it = this.f17428a.iterator();
        while (it.hasNext()) {
            ((w11) it.next()).c(map);
        }
        return map;
    }

    public final HashMap b(Context context, View view) {
        HashMap map = new HashMap();
        Iterator it = this.f17428a.iterator();
        while (it.hasNext()) {
            ((w11) it.next()).d(map, context, view);
        }
        return map;
    }

    public final HashMap c() {
        HashMap map = new HashMap();
        Iterator it = this.f17428a.iterator();
        while (it.hasNext()) {
            ((w11) it.next()).a(map);
        }
        return map;
    }
}

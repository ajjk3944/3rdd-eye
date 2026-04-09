package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class p4 {

    /* renamed from: a, reason: collision with root package name */
    public static final x.e f19863a = new x.e(0);

    public static synchronized void a() {
        x.e eVar = f19863a;
        Iterator it = ((x.d) eVar.values()).iterator();
        if (it.hasNext()) {
            ((p4) it.next()).getClass();
            throw null;
        }
        eVar.clear();
    }
}

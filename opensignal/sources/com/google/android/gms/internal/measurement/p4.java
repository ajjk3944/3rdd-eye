package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class p4 {

    /* renamed from: a, reason: collision with root package name */
    public static final u.e f5157a = new u.e(0);

    public static synchronized void a() {
        u.e eVar = f5157a;
        Iterator it = ((u.d) eVar.values()).iterator();
        if (it.hasNext()) {
            ((p4) it.next()).getClass();
            throw null;
        }
        eVar.clear();
    }
}

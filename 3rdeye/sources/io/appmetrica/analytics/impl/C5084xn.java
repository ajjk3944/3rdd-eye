package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.BiFunction;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: io.appmetrica.analytics.impl.xn, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5084xn {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC5059wn f42092a;

    /* renamed from: b, reason: collision with root package name */
    public final BiFunction f42093b;

    /* renamed from: c, reason: collision with root package name */
    public final J6 f42094c;

    public C5084xn() {
        this(new C5009un(), new Ea(), C5065x4.l().n());
    }

    public final ArrayList a(Thread thread, Thread thread2) {
        Map mapC;
        ArrayList arrayList = new ArrayList();
        TreeMap treeMap = new TreeMap(new C5034vn());
        try {
            mapC = this.f42092a.c();
        } catch (SecurityException unused) {
            mapC = null;
        }
        if (mapC != null) {
            treeMap.putAll(mapC);
        }
        if (thread2 != null) {
            treeMap.remove(thread2);
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            Thread thread3 = (Thread) entry.getKey();
            if (thread3 != thread && thread3 != thread2) {
                arrayList.add((C4907qn) this.f42093b.apply(thread3, (StackTraceElement[]) entry.getValue()));
            }
        }
        return arrayList;
    }

    public C5084xn(InterfaceC5059wn interfaceC5059wn, Ea ea2, J6 j62) {
        this.f42092a = interfaceC5059wn;
        this.f42093b = ea2;
        this.f42094c = j62;
    }
}

package com.google.mlkit.vision.common.internal;

import f5.InterfaceC5536b;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import s3.AbstractC7901p;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final Map f39132a = new HashMap();

    /* renamed from: com.google.mlkit.vision.common.internal.a$a, reason: collision with other inner class name */
    public static class C1227a {

        /* renamed from: a, reason: collision with root package name */
        private final Class f39133a;

        /* renamed from: b, reason: collision with root package name */
        private final InterfaceC5536b f39134b;

        /* renamed from: c, reason: collision with root package name */
        private final int f39135c;

        public C1227a(Class cls, InterfaceC5536b interfaceC5536b, int i10) {
            this.f39133a = cls;
            this.f39134b = interfaceC5536b;
            this.f39135c = i10;
        }

        final int a() {
            return this.f39135c;
        }

        final InterfaceC5536b b() {
            return this.f39134b;
        }

        final Class c() {
            return this.f39133a;
        }

        public C1227a(Class cls, InterfaceC5536b interfaceC5536b) {
            this(cls, interfaceC5536b, 100);
        }
    }

    a(Set set) {
        HashMap map = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C1227a c1227a = (C1227a) it.next();
            Class clsC = c1227a.c();
            if (!this.f39132a.containsKey(clsC) || c1227a.a() >= ((Integer) AbstractC7901p.l((Integer) map.get(clsC))).intValue()) {
                this.f39132a.put(clsC, c1227a.b());
                map.put(clsC, Integer.valueOf(c1227a.a()));
            }
        }
    }
}

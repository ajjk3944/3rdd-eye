package com.yandex.mobile.ads.impl;

import b9.C1992A;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes3.dex */
public final class x22 {

    /* renamed from: b, reason: collision with root package name */
    private static volatile x22 f35161b;

    /* renamed from: c, reason: collision with root package name */
    private static final Object f35162c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f35163d = 0;

    /* renamed from: a, reason: collision with root package name */
    private final LinkedHashMap f35164a;

    public static final class a {
        public static x22 a() {
            if (x22.f35161b == null) {
                synchronized (x22.f35162c) {
                    try {
                        if (x22.f35161b == null) {
                            x22.f35161b = new x22(0);
                        }
                        C1992A c1992a = C1992A.f18074a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            x22 x22Var = x22.f35161b;
            if (x22Var != null) {
                return x22Var;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    private x22() {
        this.f35164a = new LinkedHashMap();
    }

    public final void b(kq0 referenceType, Object keepingObject) {
        kotlin.jvm.internal.l.f(referenceType, "referenceType");
        kotlin.jvm.internal.l.f(keepingObject, "keepingObject");
        synchronized (f35162c) {
            try {
                Set linkedHashSet = (Set) this.f35164a.get(referenceType);
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                    this.f35164a.put(referenceType, linkedHashSet);
                }
                linkedHashSet.add(keepingObject);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(kq0 referenceType, Object keepingObject) {
        kotlin.jvm.internal.l.f(referenceType, "referenceType");
        kotlin.jvm.internal.l.f(keepingObject, "keepingObject");
        synchronized (f35162c) {
            Set set = (Set) this.f35164a.get(referenceType);
            if (set != null) {
                set.remove(keepingObject);
            }
        }
    }

    public /* synthetic */ x22(int i) {
        this();
    }
}

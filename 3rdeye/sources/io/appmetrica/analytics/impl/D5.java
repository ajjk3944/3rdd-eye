package io.appmetrica.analytics.impl;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class D5 implements I9 {

    /* renamed from: a, reason: collision with root package name */
    public final N9 f39284a;

    /* renamed from: b, reason: collision with root package name */
    public final List f39285b;

    /* renamed from: c, reason: collision with root package name */
    public final List f39286c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f39287d;

    public D5(N9 n9, List<? extends V8> list, List<? extends V8> list2, C4759l5 c4759l5) {
        this.f39284a = n9;
        this.f39285b = list;
        this.f39286c = list2;
        Objects.toString(c4759l5);
        this.f39287d = new AtomicBoolean(true);
    }

    public final boolean a() {
        List list = this.f39286c;
        if (!list.isEmpty() && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (!((V8) it.next()).b()) {
                    return false;
                }
            }
        }
        List list2 = this.f39285b;
        if (list2.isEmpty() || list2.isEmpty()) {
            return false;
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            if (((V8) it2.next()).b()) {
                return true;
            }
        }
        return false;
    }

    public final void b() {
        this.f39287d.set(false);
    }

    public final void c() {
        this.f39287d.set(true);
    }

    public final void d() {
        if (this.f39287d.get()) {
            List list = this.f39286c;
            if (!list.isEmpty() && !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (!((V8) it.next()).b()) {
                        return;
                    }
                }
            }
            ((C4648gn) this.f39284a).c();
        }
    }

    public final void e() {
        if (this.f39287d.get() && a()) {
            ((C4648gn) this.f39284a).c();
        }
    }

    public final void f() {
        if (this.f39287d.get() && a()) {
            ((C4648gn) this.f39284a).b();
        }
    }
}

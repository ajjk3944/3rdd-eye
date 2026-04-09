package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class Z2 {

    /* renamed from: a, reason: collision with root package name */
    private final Z2 f35165a;

    /* renamed from: b, reason: collision with root package name */
    private E f35166b;

    /* renamed from: c, reason: collision with root package name */
    private Map f35167c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private Map f35168d = new HashMap();

    public Z2(Z2 z22, E e10) {
        this.f35165a = z22;
        this.f35166b = e10;
    }

    public final InterfaceC4449s a(C4351g c4351g) {
        InterfaceC4449s interfaceC4449sA = InterfaceC4449s.f35450e0;
        Iterator itV = c4351g.v();
        while (itV.hasNext()) {
            interfaceC4449sA = this.f35166b.a(this, c4351g.i(((Integer) itV.next()).intValue()));
            if (interfaceC4449sA instanceof C4394l) {
                break;
            }
        }
        return interfaceC4449sA;
    }

    public final InterfaceC4449s b(InterfaceC4449s interfaceC4449s) {
        return this.f35166b.a(this, interfaceC4449s);
    }

    public final InterfaceC4449s c(String str) {
        Z2 z22 = this;
        while (!z22.f35167c.containsKey(str)) {
            z22 = z22.f35165a;
            if (z22 == null) {
                throw new IllegalArgumentException(String.format("%s is not defined", str));
            }
        }
        return (InterfaceC4449s) z22.f35167c.get(str);
    }

    public final Z2 d() {
        return new Z2(this, this.f35166b);
    }

    public final void e(String str, InterfaceC4449s interfaceC4449s) {
        if (this.f35168d.containsKey(str)) {
            return;
        }
        if (interfaceC4449s == null) {
            this.f35167c.remove(str);
        } else {
            this.f35167c.put(str, interfaceC4449s);
        }
    }

    public final void f(String str, InterfaceC4449s interfaceC4449s) {
        e(str, interfaceC4449s);
        this.f35168d.put(str, Boolean.TRUE);
    }

    public final boolean g(String str) {
        Z2 z22 = this;
        while (!z22.f35167c.containsKey(str)) {
            z22 = z22.f35165a;
            if (z22 == null) {
                return false;
            }
        }
        return true;
    }

    public final void h(String str, InterfaceC4449s interfaceC4449s) {
        Z2 z22;
        Z2 z23 = this;
        while (!z23.f35167c.containsKey(str) && (z22 = z23.f35165a) != null && z22.g(str)) {
            z23 = z23.f35165a;
        }
        if (z23.f35168d.containsKey(str)) {
            return;
        }
        if (interfaceC4449s == null) {
            z23.f35167c.remove(str);
        } else {
            z23.f35167c.put(str, interfaceC4449s);
        }
    }
}

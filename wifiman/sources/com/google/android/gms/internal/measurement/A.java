package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class A {

    /* renamed from: a, reason: collision with root package name */
    final List f34919a = new ArrayList();

    protected A() {
    }

    final InterfaceC4449s a(String str) {
        if (!this.f34919a.contains(AbstractC4354g2.c(str))) {
            throw new IllegalArgumentException("Command not supported");
        }
        throw new UnsupportedOperationException("Command not implemented: " + str);
    }

    public abstract InterfaceC4449s b(String str, Z2 z22, List list);
}

package com.mbridge.msdk.thrid.okhttp.internal.connection;

import com.mbridge.msdk.thrid.okhttp.c0;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final Set<c0> f17680a = new LinkedHashSet();

    public synchronized void a(c0 c0Var) {
        this.f17680a.remove(c0Var);
    }

    public synchronized void b(c0 c0Var) {
        this.f17680a.add(c0Var);
    }

    public synchronized boolean c(c0 c0Var) {
        return this.f17680a.contains(c0Var);
    }
}

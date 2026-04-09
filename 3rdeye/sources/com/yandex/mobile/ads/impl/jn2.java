package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* loaded from: classes3.dex */
public final class jn2 {

    /* renamed from: c, reason: collision with root package name */
    private static jn2 f29223c = new jn2();

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList<in2> f29224a = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList<in2> f29225b = new ArrayList<>();

    private jn2() {
    }

    public static jn2 a() {
        return f29223c;
    }

    public final Collection<in2> b() {
        return Collections.unmodifiableCollection(this.f29224a);
    }

    public final Collection<in2> c() {
        return Collections.unmodifiableCollection(this.f29225b);
    }

    public final void a(in2 in2Var) {
        this.f29224a.add(in2Var);
    }

    public final void b(in2 in2Var) {
        boolean z10 = this.f29225b.size() > 0;
        this.f29225b.add(in2Var);
        if (z10) {
            return;
        }
        po2.a().b();
    }

    public final void c(in2 in2Var) {
        boolean z10 = this.f29225b.size() > 0;
        this.f29224a.remove(in2Var);
        this.f29225b.remove(in2Var);
        if (!z10 || this.f29225b.size() > 0) {
            return;
        }
        po2.a().c();
    }
}

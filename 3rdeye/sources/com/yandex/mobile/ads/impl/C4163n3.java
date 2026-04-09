package com.yandex.mobile.ads.impl;

import c9.C2097r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.yandex.mobile.ads.impl.n3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4163n3 {

    /* renamed from: a, reason: collision with root package name */
    private final List<C4225w3> f30746a;

    /* renamed from: b, reason: collision with root package name */
    private int f30747b;

    public C4163n3(ArrayList adGroupPlaybackItems) {
        kotlin.jvm.internal.l.f(adGroupPlaybackItems, "adGroupPlaybackItems");
        this.f30746a = adGroupPlaybackItems;
    }

    public final void a() {
        this.f30747b = this.f30746a.size();
    }

    public final mb2<tn0> b() {
        C4225w3 c4225w3 = (C4225w3) C2097r.r0(this.f30747b, this.f30746a);
        if (c4225w3 != null) {
            return c4225w3.c();
        }
        return null;
    }

    public final qn0 c() {
        C4225w3 c4225w3 = (C4225w3) C2097r.r0(this.f30747b, this.f30746a);
        if (c4225w3 != null) {
            return c4225w3.a();
        }
        return null;
    }

    public final zf2 d() {
        C4225w3 c4225w3 = (C4225w3) C2097r.r0(this.f30747b, this.f30746a);
        if (c4225w3 != null) {
            return c4225w3.d();
        }
        return null;
    }

    public final C4225w3 e() {
        return (C4225w3) C2097r.r0(this.f30747b + 1, this.f30746a);
    }

    public final C4225w3 f() {
        int i = this.f30747b + 1;
        this.f30747b = i;
        return (C4225w3) C2097r.r0(i, this.f30746a);
    }

    public final C4225w3 a(mb2<tn0> videoAdInfo) {
        Object next;
        kotlin.jvm.internal.l.f(videoAdInfo, "videoAdInfo");
        Iterator<T> it = this.f30746a.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (kotlin.jvm.internal.l.b(((C4225w3) next).c(), videoAdInfo)) {
                break;
            }
        }
        return (C4225w3) next;
    }
}

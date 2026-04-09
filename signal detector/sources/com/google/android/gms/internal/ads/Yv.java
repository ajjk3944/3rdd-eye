package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class Yv implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f12732a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Fu f12733b;

    public Yv(Fu fu, float f2) {
        this.f12732a = f2;
        this.f12733b = fu;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1340iw c1340iw = ((Zv) this.f12733b.f8219b).f12987g;
        float f2 = this.f12732a;
        c1340iw.f14826a = f2;
        if (c1340iw.f14828c == null) {
            c1340iw.f14828c = C1016cw.f13696c;
        }
        Iterator it = Collections.unmodifiableCollection(c1340iw.f14828c.f13698b).iterator();
        while (it.hasNext()) {
            AbstractC1502lw abstractC1502lw = ((Rv) it.next()).f11081d;
            C1994v2.f17210g.D(abstractC1502lw.c(), "setDeviceVolume", Float.valueOf(f2), abstractC1502lw.f15488a);
        }
    }
}

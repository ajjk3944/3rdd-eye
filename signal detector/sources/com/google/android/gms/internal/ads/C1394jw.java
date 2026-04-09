package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.jw, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1394jw {

    /* renamed from: d, reason: collision with root package name */
    public static final C1394jw f15017d;

    /* renamed from: a, reason: collision with root package name */
    public WeakReference f15018a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f15019b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f15020c;

    static {
        C1394jw c1394jw = new C1394jw();
        c1394jw.f15019b = false;
        c1394jw.f15020c = false;
        f15017d = c1394jw;
    }

    public final void a(boolean z6, boolean z7) {
        if ((z7 || z6) == (this.f15020c || this.f15019b)) {
            return;
        }
        Iterator it = Collections.unmodifiableCollection(C1016cw.f13696c.f13697a).iterator();
        while (it.hasNext()) {
            AbstractC1502lw abstractC1502lw = ((Rv) it.next()).f11081d;
            boolean z8 = z7 || z6;
            if (abstractC1502lw.f15489b.get() != 0) {
                C1994v2.f17210g.D(abstractC1502lw.c(), "setDeviceLockState", true != z8 ? "unlocked" : "locked");
            }
        }
    }
}

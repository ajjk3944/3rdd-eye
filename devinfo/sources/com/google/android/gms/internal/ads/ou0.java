package com.google.android.gms.internal.ads;

import j$.util.DesugarCollections;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ou0 {

    /* renamed from: d, reason: collision with root package name */
    public static final ou0 f14802d;

    /* renamed from: a, reason: collision with root package name */
    public WeakReference f14803a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f14804b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f14805c;

    static {
        ou0 ou0Var = new ou0();
        ou0Var.f14804b = false;
        ou0Var.f14805c = false;
        f14802d = ou0Var;
    }

    public final void a(boolean z3, boolean z10) {
        if ((z10 || z3) == (this.f14805c || this.f14804b)) {
            return;
        }
        Iterator it = DesugarCollections.unmodifiableCollection(hu0.f11974c.f11975a).iterator();
        while (it.hasNext()) {
            pu0 pu0Var = ((vt0) it.next()).f17702d;
            boolean z11 = z10 || z3;
            if (pu0Var.f15109b.get() != 0) {
                w5.g.C(pu0Var.c(), "setDeviceLockState", true != z11 ? "unlocked" : "locked");
            }
        }
    }
}

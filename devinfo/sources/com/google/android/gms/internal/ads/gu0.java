package com.google.android.gms.internal.ads;

import android.view.View;
import j$.util.DesugarCollections;
import java.util.Iterator;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class gu0 extends ju0 {

    /* renamed from: d, reason: collision with root package name */
    public static final gu0 f11610d = new gu0();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.ju0
    public final boolean a() {
        Iterator it = DesugarCollections.unmodifiableCollection(hu0.f11974c.f11976b).iterator();
        while (it.hasNext()) {
            View view = (View) ((vt0) it.next()).f17701c.get();
            if (view != null && view.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.ju0
    public final void b(boolean z3) {
        Iterator it = DesugarCollections.unmodifiableCollection(hu0.f11974c.f11975a).iterator();
        while (it.hasNext()) {
            pu0 pu0Var = ((vt0) it.next()).f17702d;
            if (pu0Var.f15109b.get() != 0) {
                w5.g.C(pu0Var.c(), "setState", true != z3 ? "backgrounded" : "foregrounded", pu0Var.f15108a);
            }
        }
    }
}

package com.google.android.gms.internal.ads;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class f81 extends z71 {

    /* renamed from: p, reason: collision with root package name */
    public List f11058p;

    public f81(x41 x41Var, boolean z3) {
        List arrayList;
        super(x41Var, z3, true);
        if (x41Var.isEmpty()) {
            arrayList = Collections.EMPTY_LIST;
        } else {
            int size = x41Var.size();
            yr1.u(size, "initialArraySize");
            arrayList = new ArrayList(size);
        }
        for (int i4 = 0; i4 < x41Var.size(); i4++) {
            arrayList.add(null);
        }
        this.f11058p = arrayList;
        w();
    }

    @Override // com.google.android.gms.internal.ads.z71
    public final void s(int i4) {
        this.f19034l = null;
        this.f11058p = null;
    }

    @Override // com.google.android.gms.internal.ads.z71
    public final void x(int i4, Object obj) {
        List list = this.f11058p;
        if (list != null) {
            list.set(i4, new g81(obj));
        }
    }

    @Override // com.google.android.gms.internal.ads.z71
    public final void y() {
        List<g81> list = this.f11058p;
        if (list != null) {
            int size = list.size();
            yr1.u(size, "initialArraySize");
            ArrayList arrayList = new ArrayList(size);
            for (g81 g81Var : list) {
                arrayList.add(g81Var != null ? g81Var.f11401a : null);
            }
            e(DesugarCollections.unmodifiableList(arrayList));
        }
    }
}

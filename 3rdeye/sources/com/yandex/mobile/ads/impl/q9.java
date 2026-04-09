package com.yandex.mobile.ads.impl;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class q9 {

    /* renamed from: a, reason: collision with root package name */
    private final zk f32106a;

    public q9(zk biddingSettings) {
        kotlin.jvm.internal.l.f(biddingSettings, "biddingSettings");
        this.f32106a = biddingSettings;
    }

    public final tz0 a(String str) {
        vz0 vz0VarD;
        List<sz0> listE;
        Object next;
        vz0 vz0VarD2 = this.f32106a.d();
        if (vz0VarD2 != null && (vz0VarD = this.f32106a.d()) != null && (listE = vz0VarD.e()) != null) {
            Iterator<T> it = listE.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (kotlin.jvm.internal.l.b(((sz0) next).d(), str)) {
                    break;
                }
            }
            sz0 sz0Var = (sz0) next;
            if (sz0Var != null) {
                return new tz0(vz0VarD2.d(), sz0Var.d(), sz0Var.e());
            }
        }
        return null;
    }
}

package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class dd0 {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f10435a = new HashMap();

    public final synchronized void a(String str, qq0 qq0Var) {
        kq0 kq0Var;
        os osVarT;
        if (this.f10435a.containsKey(str)) {
            return;
        }
        os osVarA0 = null;
        if (qq0Var == null) {
            osVarT = null;
        } else {
            try {
                osVarT = qq0Var.f15399a.t();
            } finally {
                try {
                } catch (kq0 unused) {
                }
            }
        }
        if (qq0Var != null) {
            try {
                osVarA0 = qq0Var.f15399a.a0();
            } finally {
                try {
                } catch (kq0 unused2) {
                }
            }
        }
        boolean z3 = true;
        if (((Boolean) va.s.f36163e.f36166c.a(sk.Ea)).booleanValue()) {
            if (qq0Var == null) {
                z3 = false;
            } else {
                try {
                    qq0Var.a();
                } catch (kq0 unused3) {
                }
            }
        }
        this.f10435a.put(str, new cd0(str, osVarT, osVarA0, z3));
    }

    public final synchronized cd0 b(String str) {
        return (cd0) this.f10435a.get(str);
    }
}

package defpackage;

import android.location.Location;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class l83 {
    public final ih3 a;
    public final f52 b;
    public final s23 c;
    public final pc4 d;
    public final Bundle e;
    public final xe4 f;
    public final String g;
    public final ArrayList h;
    public final ArrayList i;
    public final r12 j;
    public final vi4 k;
    public final int l;
    public final z2 m;
    public final vm0 n;
    public final wi2 o;
    public final h80 p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final Bundle t;
    public final AtomicLong u;
    public final pk2 v;

    public l83(k83 k83Var) {
        this.f = k83Var.b;
        this.g = k83Var.c;
        this.v = k83Var.v;
        pc4 pc4Var = k83Var.a;
        this.e = pc4Var.G;
        int i = pc4Var.f;
        long j = pc4Var.g;
        Bundle bundle = pc4Var.h;
        int i2 = pc4Var.i;
        List list = pc4Var.j;
        boolean z = pc4Var.k;
        int i3 = pc4Var.l;
        boolean z2 = true;
        if (!pc4Var.m && !k83Var.e) {
            z2 = false;
        }
        String str = pc4Var.n;
        qf3 qf3Var = pc4Var.o;
        Location location = pc4Var.p;
        String str2 = pc4Var.q;
        Bundle bundle2 = pc4Var.r;
        Bundle bundle3 = pc4Var.s;
        List list2 = pc4Var.t;
        String str3 = pc4Var.u;
        String str4 = pc4Var.v;
        boolean z3 = pc4Var.w;
        ec2 ec2Var = pc4Var.x;
        int i4 = pc4Var.y;
        String str5 = pc4Var.z;
        List list3 = pc4Var.A;
        int iT = lf4.t(pc4Var.B);
        pc4 pc4Var2 = k83Var.a;
        pc4 pc4Var3 = new pc4(i, j, bundle, i2, list, z, i3, z2, str, qf3Var, location, str2, bundle2, bundle3, list2, str3, str4, z3, ec2Var, i4, str5, list3, iT, pc4Var2.C, pc4Var2.D, pc4Var2.E, pc4Var2.F);
        this.d = pc4Var3;
        ih3 ih3Var = k83Var.d;
        r12 r12Var = null;
        if (ih3Var == null) {
            r12 r12Var2 = k83Var.h;
            ih3Var = r12Var2 != null ? r12Var2.k : null;
        }
        this.a = ih3Var;
        ArrayList arrayList = k83Var.f;
        this.h = arrayList;
        this.i = k83Var.g;
        if (arrayList != null && (r12Var = k83Var.h) == null) {
            r12Var = new r12(new kg0(new kg0()));
        }
        this.j = r12Var;
        this.k = k83Var.i;
        this.l = k83Var.m;
        this.m = k83Var.j;
        this.n = k83Var.k;
        this.o = k83Var.l;
        this.b = k83Var.n;
        this.p = new h80(k83Var.o);
        this.q = k83Var.p;
        this.r = k83Var.q;
        this.c = k83Var.r;
        this.s = k83Var.s;
        this.t = k83Var.t;
        long j2 = pc4Var3.F;
        this.u = j2 != 0 ? new AtomicLong(j2) : k83Var.u;
    }

    public final boolean a() {
        return this.g.matches((String) tw1.e.c.a(mz1.A3));
    }
}

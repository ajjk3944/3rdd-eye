package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class oi4 extends oz1 {
    public static final Object g = new Object();
    public final long b;
    public final long c;
    public final boolean d;
    public final fk1 e;
    public final qg1 f;

    static {
        vm3 vm3Var = xm3.g;
        sn3 sn3Var = sn3.j;
        List list = Collections.EMPTY_LIST;
        sn3 sn3Var2 = sn3.j;
        zi1 zi1Var = zi1.a;
        Uri uri = Uri.EMPTY;
        if (uri != null) {
            new kh1(uri, sn3Var2);
        }
        new se1();
        rm1 rm1Var = rm1.B;
    }

    public oi4(long j, long j2, boolean z, fk1 fk1Var, qg1 qg1Var) {
        this.b = j;
        this.c = j2;
        this.d = z;
        fk1Var.getClass();
        this.e = fk1Var;
        this.f = qg1Var;
    }

    @Override // defpackage.oz1
    public final int a() {
        return 1;
    }

    @Override // defpackage.oz1
    public final ez1 b(int i, ez1 ez1Var, long j) {
        zt0.e0(i, 1);
        Object obj = ez1.m;
        ez1Var.a(this.e, this.d, false, this.f, this.c);
        return ez1Var;
    }

    @Override // defpackage.oz1
    public final int c() {
        return 1;
    }

    @Override // defpackage.oz1
    public final sw1 d(int i, sw1 sw1Var, boolean z) {
        zt0.e0(i, 1);
        Object obj = z ? g : null;
        zb2 zb2Var = zb2.b;
        sw1Var.a(null, obj, 0, this.b, false);
        return sw1Var;
    }

    @Override // defpackage.oz1
    public final int e(Object obj) {
        return g.equals(obj) ? 0 : -1;
    }

    @Override // defpackage.oz1
    public final Object f(int i) {
        zt0.e0(i, 1);
        return g;
    }
}

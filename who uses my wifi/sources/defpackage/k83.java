package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class k83 {
    public pc4 a;
    public xe4 b;
    public String c;
    public ih3 d;
    public boolean e;
    public ArrayList f;
    public ArrayList g;
    public r12 h;
    public vi4 i;
    public z2 j;
    public vm0 k;
    public wi2 l;
    public int m = 1;
    public f52 n;
    public final h80 o;
    public boolean p;
    public boolean q;
    public s23 r;
    public boolean s;
    public Bundle t;
    public final AtomicLong u;
    public pk2 v;

    public k83() {
        h80 h80Var = new h80(7);
        h80Var.g = 2;
        this.o = h80Var;
        this.p = false;
        this.q = false;
        this.s = false;
        this.u = new AtomicLong();
    }

    public final l83 a() {
        ou1.k(this.c, "ad unit must not be null");
        ou1.k(this.b, "ad size must not be null");
        ou1.k(this.a, "ad request must not be null");
        return new l83(this);
    }
}

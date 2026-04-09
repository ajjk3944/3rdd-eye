package androidx.media3.common;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class e0 implements i {
    public static final e0 B;
    public static final String D;
    public static final String E;
    public static final String F;
    public static final String G;
    public static final String H;
    public static final ab.c I;

    /* renamed from: a, reason: collision with root package name */
    public final String f1607a;

    /* renamed from: d, reason: collision with root package name */
    public final b0 f1608d;

    /* renamed from: g, reason: collision with root package name */
    public final z f1609g;

    /* renamed from: r, reason: collision with root package name */
    public final g0 f1610r;

    /* renamed from: x, reason: collision with root package name */
    public final x f1611x;

    /* renamed from: y, reason: collision with root package name */
    public final c0 f1612y;

    static {
        v vVar = new v();
        oe.f0 f0Var = oe.h0.f19336d;
        oe.u0 u0Var = oe.u0.f19383x;
        List list = Collections.EMPTY_LIST;
        oe.u0 u0Var2 = oe.u0.f19383x;
        B = new e0("", new x(vVar), null, new z(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), g0.f1655e0, c0.f1577g);
        int i10 = a5.d0.f105a;
        D = Integer.toString(0, 36);
        E = Integer.toString(1, 36);
        F = Integer.toString(2, 36);
        G = Integer.toString(3, 36);
        H = Integer.toString(4, 36);
        I = new ab.c(6);
    }

    public e0(String str, x xVar, b0 b0Var, z zVar, g0 g0Var, c0 c0Var) {
        this.f1607a = str;
        this.f1608d = b0Var;
        this.f1609g = zVar;
        this.f1610r = g0Var;
        this.f1611x = xVar;
        this.f1612y = c0Var;
    }

    public static e0 b(Uri uri) {
        v vVar = new v();
        oe.f0 f0Var = oe.h0.f19336d;
        oe.u0 u0Var = oe.u0.f19383x;
        List list = Collections.EMPTY_LIST;
        oe.u0 u0Var2 = oe.u0.f19383x;
        return new e0("", new x(vVar), uri != null ? new b0(uri, null, null, list, u0Var2) : null, new z(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), g0.f1655e0, c0.f1577g);
    }

    public final al.c a() {
        al.c cVar = new al.c(3);
        cVar.f823e = new v();
        cVar.f824f = new df.c(2);
        cVar.f825g = Collections.EMPTY_LIST;
        cVar.f826h = oe.u0.f19383x;
        cVar.j = new y();
        cVar.k = c0.f1577g;
        v vVar = new v();
        x xVar = this.f1611x;
        vVar.f1803a = xVar.f1813a;
        vVar.f1804b = xVar.f1814d;
        vVar.f1805c = xVar.f1815g;
        vVar.f1806d = xVar.f1816r;
        vVar.f1807e = xVar.f1817x;
        cVar.f823e = vVar;
        cVar.f820b = this.f1607a;
        cVar.f827i = this.f1610r;
        cVar.j = this.f1609g.a();
        cVar.k = this.f1612y;
        b0 b0Var = this.f1608d;
        if (b0Var != null) {
            cVar.f822d = b0Var.f1561b;
            cVar.f821c = b0Var.f1560a;
            cVar.f825g = b0Var.f1562c;
            cVar.f826h = b0Var.f1563d;
            cVar.f824f = new df.c(2);
        }
        return cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return a5.d0.a(this.f1607a, e0Var.f1607a) && this.f1611x.equals(e0Var.f1611x) && a5.d0.a(this.f1608d, e0Var.f1608d) && a5.d0.a(this.f1609g, e0Var.f1609g) && a5.d0.a(this.f1610r, e0Var.f1610r) && a5.d0.a(this.f1612y, e0Var.f1612y);
    }

    public final int hashCode() {
        int iHashCode = this.f1607a.hashCode() * 31;
        b0 b0Var = this.f1608d;
        return this.f1612y.hashCode() + ((this.f1610r.hashCode() + ((this.f1611x.hashCode() + ((this.f1609g.hashCode() + ((iHashCode + (b0Var != null ? b0Var.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }
}

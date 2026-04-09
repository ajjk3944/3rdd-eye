package defpackage;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class b23 implements zz2 {
    public final /* synthetic */ int a;
    public final pq3 b;
    public final u93 c;
    public final Object d;
    public final Object e;

    public /* synthetic */ b23(u93 u93Var, pq3 pq3Var, Object obj, Object obj2, int i) {
        this.a = i;
        this.c = u93Var;
        this.b = pq3Var;
        this.e = obj2;
        this.d = obj;
    }

    public static final String c(String str, int i) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 20 + String.valueOf(i).length());
        sb.append("Error from: ");
        sb.append(str);
        sb.append(", code: ");
        sb.append(i);
        return sb.toString();
    }

    @Override // defpackage.zz2
    public final boolean a(h83 h83Var, a83 a83Var) {
        e83 e83Var;
        switch (this.a) {
            case 0:
                return !a83Var.t.isEmpty();
            default:
                return (((vz1) this.d) == null || (e83Var = a83Var.s) == null || e83Var.a == null) ? false : true;
        }
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [hn2, hv1] */
    @Override // defpackage.zz2
    public final n70 b(h83 h83Var, a83 a83Var) {
        c03 c03VarA;
        switch (this.a) {
            case 0:
                Iterator it = a83Var.t.iterator();
                while (true) {
                    if (it.hasNext()) {
                        try {
                            c03VarA = ((b03) this.d).a((String) it.next(), a83Var.v);
                        } catch (n83 unused) {
                        }
                    } else {
                        c03VarA = null;
                    }
                }
                if (c03VarA == null) {
                    return pu1.B(new g13("Unable to instantiate mediation adapter class.", 3));
                }
                pd2 pd2Var = new pd2();
                wy0 wy0Var = new wy0();
                wy0Var.g = c03VarA;
                wy0Var.h = pd2Var;
                wy0Var.f = false;
                c03VarA.c.l1(wy0Var);
                if (a83Var.M) {
                    Bundle bundle = ((l83) h83Var.a.g).d.r;
                    Bundle bundle2 = bundle.getBundle(AdMobAdapter.class.getName());
                    if (bundle2 == null) {
                        bundle2 = new Bundle();
                        bundle.putBundle(AdMobAdapter.class.getName(), bundle2);
                    }
                    bundle2.putBoolean("render_test_ad_label", true);
                }
                u93 u93Var = this.c;
                s93 s93Var = s93.s;
                Objects.requireNonNull(u93Var);
                mc2 mc2Var = new mc2(this, h83Var, a83Var, c03VarA, 18, false);
                pq3 pq3Var = this.b;
                bu1 bu1Var = new bu1(u93Var, s93Var, null, u93.d, Collections.EMPTY_LIST, ((ld2) pq3Var).c(new w53(3, mc2Var)));
                bu1 bu1VarA = ((u93) bu1Var.l).a(bu1Var.A(), s93.t);
                p62 p62Var = new p62(1, pd2Var);
                ld2 ld2Var = md2.g;
                bu1 bu1Var2 = new bu1((u93) bu1VarA.l, bu1VarA.g, (String) bu1VarA.h, (n70) bu1VarA.i, (List) bu1VarA.j, pu1.O((n70) bu1VarA.k, p62Var, ld2Var));
                return ((u93) bu1Var2.l).a(bu1Var2.A(), s93.u).q(new p21(this, h83Var, a83Var, c03VarA)).A();
            default:
                pd2 pd2Var2 = new pd2();
                sq0 sq0Var = new sq0(18);
                g4 g4Var = new g4(this, pd2Var2, h83Var, a83Var, sq0Var, 11, false);
                synchronized (sq0Var) {
                    sq0Var.g = g4Var;
                }
                e83 e83Var = a83Var.s;
                uz1 uz1Var = new uz1(sq0Var, e83Var.b, e83Var.a);
                s93 s93Var2 = s93.v;
                u93 u93Var2 = this.c;
                Objects.requireNonNull(u93Var2);
                lv2 lv2Var = new lv2(this, uz1Var, 4);
                pq3 pq3Var2 = this.b;
                bu1 bu1Var3 = new bu1(u93Var2, s93Var2, null, u93.d, Collections.EMPTY_LIST, ((ld2) pq3Var2).c(new w53(3, lv2Var)));
                bu1 bu1VarA2 = ((u93) bu1Var3.l).a(bu1Var3.A(), s93.w);
                p62 p62Var2 = new p62(1, pd2Var2);
                ld2 ld2Var2 = md2.g;
                return new bu1((u93) bu1VarA2.l, bu1VarA2.g, (String) bu1VarA2.h, (n70) bu1VarA2.i, (List) bu1VarA2.j, pu1.O((n70) bu1VarA2.k, p62Var2, ld2Var2)).A();
        }
    }
}

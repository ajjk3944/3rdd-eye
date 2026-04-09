package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class hq1 {
    public static final HashMap a;

    static {
        fn3 fn3Var;
        f20 f20Var = new f20(29, false);
        f20Var.n(wp1.f, -42L, -64L);
        f20Var.n(wp1.g, -6L, -53L);
        f20Var.n(wp1.h, -41L, -31L);
        f20Var.n(wp1.i, -40L, -28L);
        f20Var.n(wp1.j, -29L, -37L);
        f20Var.n(wp1.k, -80L, -32L);
        f20Var.n(wp1.l, -17L, -36L);
        f20Var.n(wp1.m, -82L, -35L);
        f20Var.n(wp1.n, -63L, -52L);
        f20Var.n(wp1.o, -23L, -11L);
        f20Var.n(wp1.p, -69L, -68L);
        f20Var.n(wp1.q, -62L, -55L);
        f20Var.n(wp1.r, -78L, -25L);
        f20Var.n(wp1.s, -71L, -3L);
        f20Var.n(wp1.t, -18L, -4L);
        f20Var.n(wp1.u, -67L, -19L);
        f20Var.n(wp1.v, -58L);
        f20Var.n(wp1.w, -2L);
        f20Var.n(wp1.x, -34L);
        f20Var.n(wp1.y, -30L);
        f20Var.n(wp1.z, -56L);
        f20Var.n(wp1.B, -57L);
        f20Var.n(wp1.C, -66L);
        f20Var.n(wp1.D, -60L);
        f20Var.n(wp1.E, -27L);
        f20Var.n(wp1.F, -26L);
        f20Var.n(wp1.G, -74L);
        f20Var.n(wp1.H, -77L);
        f20Var.n(wp1.J, -38L);
        f20Var.n(wp1.L, -79L);
        f20Var.n(wp1.M, -7L);
        f20Var.n(wp1.N, -51L);
        f20Var.n(wp1.O, -9L);
        f20Var.n(wp1.P, -47L);
        f20Var.n(wp1.Q, -70L);
        f20Var.n(wp1.R, -14L);
        f20Var.n(wp1.S, -5L);
        f20Var.n(wp1.T, -39L);
        f20Var.n(wp1.U, -8L);
        f20Var.n(wp1.V, -54L);
        f20Var.n(wp1.W, -15L);
        f20Var.n(wp1.X, -12L);
        f20Var.n(wp1.Y, -21L);
        f20Var.n(wp1.Z, -43L);
        f20Var.n(wp1.K, -20L);
        f20Var.n(wp1.I, -81L);
        f20Var.n(wp1.a0, -46L);
        f20Var.n(wp1.b0, -61L);
        f20Var.n(wp1.c0, -44L);
        f20Var.n(wp1.A, -59L);
        f20Var.n(wp1.d0, -49L);
        f20Var.n(wp1.e0, -75L);
        f20Var.n(wp1.f0, -24L);
        f20Var.n(wp1.k0, -13L);
        f20Var.n(wp1.l0, -1L);
        f20Var.n(wp1.g0, -33L);
        f20Var.n(wp1.h0, -45L);
        f20Var.n(wp1.i0, -50L);
        f20Var.n(wp1.j0, -65L);
        f20Var.n(wp1.m0, -16L);
        f20Var.n(wp1.n0, -73L);
        f20Var.n(wp1.o0, -10L);
        f20Var.n(wp1.p0, -48L);
        f20Var.n(wp1.q0, -22L);
        f20Var.n(wp1.r0, -76L);
        f20Var.n(wp1.s0, -72L);
        lm3 lm3Var = (lm3) f20Var.g;
        if (lm3Var == null) {
            fn3Var = qm3.l;
        } else {
            Collection collectionEntrySet = lm3Var.entrySet();
            if (((AbstractCollection) collectionEntrySet).isEmpty()) {
                fn3Var = qm3.l;
            } else {
                jm3 jm3Var = (jm3) collectionEntrySet;
                so1 so1Var = new so1(jm3Var.g.size());
                Iterator it = jm3Var.iterator();
                int size = 0;
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    Object key = entry.getKey();
                    dn3 dn3VarJ = dn3.j(((cn3) entry.getValue()).h());
                    if (!dn3VarJ.isEmpty()) {
                        so1Var.p(key, dn3VarJ);
                        size += dn3VarJ.size();
                    }
                }
                fn3Var = new fn3(so1Var.u(), size);
            }
        }
        en3 en3Var = fn3Var.k;
        if (en3Var == null) {
            en3Var = new en3(fn3Var);
            fn3Var.k = en3Var;
        }
        yq2 yq2VarA = en3Var.a();
        while (yq2VarA.hasNext()) {
            Map.Entry entry2 = (Map.Entry) yq2VarA.next();
            if (((Long) entry2.getValue()).longValue() > -1 || ((Long) entry2.getValue()).longValue() < -82) {
                throw new rg(up1.a("DkWkogARIjm8VAqEzyEdNWdUqAjIW8EtmA==").concat(String.valueOf(entry2.getValue())));
            }
        }
        HashMap map = new HashMap();
        en3 en3Var2 = fn3Var.k;
        if (en3Var2 == null) {
            en3Var2 = new en3(fn3Var);
            fn3Var.k = en3Var2;
        }
        yq2 yq2VarA2 = en3Var2.a();
        while (yq2VarA2.hasNext()) {
            Map.Entry entry3 = (Map.Entry) yq2VarA2.next();
            wp1 wp1Var = (wp1) entry3.getKey();
            Long l = (Long) entry3.getValue();
            long jLongValue = l.longValue();
            if (map.containsKey(l)) {
                String strValueOf = String.valueOf(map.get(l));
                String strValueOf2 = String.valueOf(wp1Var);
                StringBuilder sb = new StringBuilder(strValueOf.length() + String.valueOf(jLongValue).length() + 27 + 5 + strValueOf2.length());
                sb.append(up1.a("H16u7wATM3S4Tl6egTYIeX5f+xfdXtsmmA=="));
                sb.append(jLongValue);
                sb.append(up1.a("cQk="));
                sb.append(strValueOf);
                sb.append(up1.a("a0ivq0U="));
                sb.append(strValueOf2);
                throw new rg(sb.toString());
            }
            map.put(l, wp1Var);
        }
        a = map;
    }
}

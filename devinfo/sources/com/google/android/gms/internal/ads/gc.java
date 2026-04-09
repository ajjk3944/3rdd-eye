package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class gc {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f11484a;

    static {
        g51 g51Var;
        int size = 0;
        kh0 kh0Var = new kh0((byte) 0, 14);
        kh0Var.v(sb.f15942a, -42L, -64L);
        kh0Var.v(sb.f15944b, -6L, -53L);
        kh0Var.v(sb.f15946c, -41L, -31L);
        kh0Var.v(sb.f15948d, -40L, -28L);
        kh0Var.v(sb.f15950e, -29L, -37L);
        kh0Var.v(sb.f15952f, -80L, -32L);
        kh0Var.v(sb.g, -17L, -36L);
        kh0Var.v(sb.f15955h, -82L, -35L);
        kh0Var.v(sb.f15957i, -63L, -52L);
        kh0Var.v(sb.j, -23L, -11L);
        kh0Var.v(sb.f15960k, -69L, -68L);
        kh0Var.v(sb.f15962l, -62L, -55L);
        kh0Var.v(sb.f15964m, -78L, -25L);
        kh0Var.v(sb.f15966n, -71L, -3L);
        kh0Var.v(sb.f15968o, -18L, -4L);
        kh0Var.v(sb.f15969p, -67L, -19L);
        kh0Var.v(sb.f15970q, -58L);
        kh0Var.v(sb.f15971r, -2L);
        kh0Var.v(sb.f15972s, -34L);
        kh0Var.v(sb.f15973t, -30L);
        kh0Var.v(sb.f15974u, -56L);
        kh0Var.v(sb.f15976w, -57L);
        kh0Var.v(sb.f15977x, -66L);
        kh0Var.v(sb.f15978y, -60L);
        kh0Var.v(sb.f15979z, -27L);
        kh0Var.v(sb.A, -26L);
        kh0Var.v(sb.B, -74L);
        kh0Var.v(sb.C, -77L);
        kh0Var.v(sb.E, -38L);
        kh0Var.v(sb.G, -79L);
        kh0Var.v(sb.H, -7L);
        kh0Var.v(sb.I, -51L);
        kh0Var.v(sb.J, -9L);
        kh0Var.v(sb.K, -47L);
        kh0Var.v(sb.L, -70L);
        kh0Var.v(sb.M, -14L);
        kh0Var.v(sb.N, -5L);
        kh0Var.v(sb.O, -39L);
        kh0Var.v(sb.P, -8L);
        kh0Var.v(sb.Q, -54L);
        kh0Var.v(sb.R, -15L);
        kh0Var.v(sb.S, -12L);
        kh0Var.v(sb.T, -21L);
        kh0Var.v(sb.U, -43L);
        kh0Var.v(sb.F, -20L);
        kh0Var.v(sb.D, -81L);
        kh0Var.v(sb.V, -46L);
        kh0Var.v(sb.W, -61L);
        kh0Var.v(sb.X, -44L);
        kh0Var.v(sb.f15975v, -59L);
        kh0Var.v(sb.Y, -49L);
        kh0Var.v(sb.Z, -75L);
        kh0Var.v(sb.f15943a0, -24L);
        kh0Var.v(sb.f15953f0, -13L);
        kh0Var.v(sb.f15954g0, -1L);
        kh0Var.v(sb.f15945b0, -33L);
        kh0Var.v(sb.f15947c0, -45L);
        kh0Var.v(sb.f15949d0, -50L);
        kh0Var.v(sb.f15951e0, -65L);
        kh0Var.v(sb.f15956h0, -16L);
        kh0Var.v(sb.f15958i0, -73L);
        kh0Var.v(sb.f15959j0, -10L);
        kh0Var.v(sb.f15961k0, -48L);
        kh0Var.v(sb.f15963l0, -22L);
        kh0Var.v(sb.f15965m0, -76L);
        kh0Var.v(sb.f15967n0, -72L);
        m41 m41Var = (m41) kh0Var.f13160b;
        if (m41Var == null) {
            g51Var = r41.g;
        } else {
            Collection collectionEntrySet = m41Var.entrySet();
            if (((AbstractCollection) collectionEntrySet).isEmpty()) {
                g51Var = r41.g;
            } else {
                k41 k41Var = (k41) collectionEntrySet;
                oa oaVar = new oa(k41Var.f13027b.size());
                Iterator it = k41Var.iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    Object key = entry.getKey();
                    e51 e51VarM = e51.m(((d51) entry.getValue()).h());
                    if (!e51VarM.isEmpty()) {
                        oaVar.i(key, e51VarM);
                        size += e51VarM.size();
                    }
                }
                g51Var = new g51(oaVar.v(true), size);
            }
        }
        f51 f51Var = g51Var.f11383f;
        if (f51Var == null) {
            f51Var = new f51(g51Var);
            g51Var.f11383f = f51Var;
        }
        h61 h61VarA = f51Var.a();
        while (h61VarA.hasNext()) {
            Map.Entry entry2 = (Map.Entry) h61VarA.next();
            if (((Long) entry2.getValue()).longValue() > -1 || ((Long) entry2.getValue()).longValue() < -82) {
                throw new ac.m(qb.a("DkWkogARIjm8VAqEzyEdNWdUqAjIW8EtmA==").concat(String.valueOf(entry2.getValue())));
            }
        }
        HashMap map = new HashMap();
        f51 f51Var2 = g51Var.f11383f;
        if (f51Var2 == null) {
            f51Var2 = new f51(g51Var);
            g51Var.f11383f = f51Var2;
        }
        h61 h61VarA2 = f51Var2.a();
        while (h61VarA2.hasNext()) {
            Map.Entry entry3 = (Map.Entry) h61VarA2.next();
            sb sbVar = (sb) entry3.getKey();
            Long l10 = (Long) entry3.getValue();
            long jLongValue = l10.longValue();
            if (map.containsKey(l10)) {
                String strValueOf = String.valueOf(map.get(l10));
                String strValueOf2 = String.valueOf(sbVar);
                StringBuilder sb2 = new StringBuilder(strValueOf.length() + String.valueOf(jLongValue).length() + 27 + 5 + strValueOf2.length());
                sb2.append(qb.a("H16u7wATM3S4Tl6egTYIeX5f+xfdXtsmmA=="));
                sb2.append(jLongValue);
                sb2.append(qb.a("cQk="));
                sb2.append(strValueOf);
                sb2.append(qb.a("a0ivq0U="));
                sb2.append(strValueOf2);
                throw new ac.m(sb2.toString());
            }
            map.put(l10, sbVar);
        }
        f11484a = map;
    }
}

package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.z5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2213z5 {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f17829a;

    static {
        TB tb;
        C2255zu c2255zu = new C2255zu();
        int size = 0;
        c2255zu.g(EnumC1512m5.f15552a, -42L, -64L);
        c2255zu.g(EnumC1512m5.f15554b, -6L, -53L);
        c2255zu.g(EnumC1512m5.f15555c, -41L, -31L);
        c2255zu.g(EnumC1512m5.f15557d, -40L, -28L);
        c2255zu.g(EnumC1512m5.f15559e, -29L, -37L);
        c2255zu.g(EnumC1512m5.f15561f, -80L, -32L);
        c2255zu.g(EnumC1512m5.f15563g, -17L, -36L);
        c2255zu.g(EnumC1512m5.f15565h, -82L, -35L);
        c2255zu.g(EnumC1512m5.i, -63L, -52L);
        c2255zu.g(EnumC1512m5.f15568j, -23L, -11L);
        c2255zu.g(EnumC1512m5.f15570k, -69L, -68L);
        c2255zu.g(EnumC1512m5.f15572l, -62L, -55L);
        c2255zu.g(EnumC1512m5.f15574m, -78L, -25L);
        c2255zu.g(EnumC1512m5.f15576n, -71L, -3L);
        c2255zu.g(EnumC1512m5.f15529C, -18L, -4L);
        c2255zu.g(EnumC1512m5.f15530D, -67L, -19L);
        c2255zu.g(EnumC1512m5.f15531E, -58L);
        c2255zu.g(EnumC1512m5.f15532F, -2L);
        c2255zu.g(EnumC1512m5.f15533G, -34L);
        c2255zu.g(EnumC1512m5.f15534H, -30L);
        c2255zu.g(EnumC1512m5.f15535I, -56L);
        c2255zu.g(EnumC1512m5.f15537K, -57L);
        c2255zu.g(EnumC1512m5.f15538L, -66L);
        c2255zu.g(EnumC1512m5.M, -60L);
        c2255zu.g(EnumC1512m5.f15539N, -27L);
        c2255zu.g(EnumC1512m5.f15540O, -26L);
        c2255zu.g(EnumC1512m5.f15541P, -74L);
        c2255zu.g(EnumC1512m5.f15542Q, -77L);
        c2255zu.g(EnumC1512m5.f15544S, -38L);
        c2255zu.g(EnumC1512m5.f15546U, -79L);
        c2255zu.g(EnumC1512m5.f15547V, -7L);
        c2255zu.g(EnumC1512m5.f15548W, -51L);
        c2255zu.g(EnumC1512m5.f15549X, -9L);
        c2255zu.g(EnumC1512m5.f15550Y, -47L);
        c2255zu.g(EnumC1512m5.f15551Z, -70L);
        c2255zu.g(EnumC1512m5.f15553a0, -14L);
        c2255zu.g(EnumC1512m5.b0, -5L);
        c2255zu.g(EnumC1512m5.f15556c0, -39L);
        c2255zu.g(EnumC1512m5.f15558d0, -8L);
        c2255zu.g(EnumC1512m5.f15560e0, -54L);
        c2255zu.g(EnumC1512m5.f15562f0, -15L);
        c2255zu.g(EnumC1512m5.f15564g0, -12L);
        c2255zu.g(EnumC1512m5.f15566h0, -21L);
        c2255zu.g(EnumC1512m5.f15567i0, -43L);
        c2255zu.g(EnumC1512m5.f15545T, -20L);
        c2255zu.g(EnumC1512m5.f15543R, -81L);
        c2255zu.g(EnumC1512m5.f15569j0, -46L);
        c2255zu.g(EnumC1512m5.f15571k0, -61L);
        c2255zu.g(EnumC1512m5.f15573l0, -44L);
        c2255zu.g(EnumC1512m5.f15536J, -59L);
        c2255zu.g(EnumC1512m5.f15575m0, -49L);
        c2255zu.g(EnumC1512m5.f15577n0, -75L);
        c2255zu.g(EnumC1512m5.f15578o0, -24L);
        c2255zu.g(EnumC1512m5.f15583t0, -13L);
        c2255zu.g(EnumC1512m5.f15584u0, -1L);
        c2255zu.g(EnumC1512m5.f15579p0, -33L);
        c2255zu.g(EnumC1512m5.f15580q0, -45L);
        c2255zu.g(EnumC1512m5.f15581r0, -50L);
        c2255zu.g(EnumC1512m5.f15582s0, -65L);
        c2255zu.g(EnumC1512m5.v0, -16L);
        c2255zu.g(EnumC1512m5.f15585w0, -73L);
        c2255zu.g(EnumC1512m5.f15586x0, -10L);
        c2255zu.g(EnumC1512m5.f15587y0, -48L);
        c2255zu.g(EnumC1512m5.f15588z0, -22L);
        c2255zu.g(EnumC1512m5.f15527A0, -76L);
        c2255zu.g(EnumC1512m5.f15528B0, -72L);
        AB ab = (AB) c2255zu.f17990b;
        if (ab == null) {
            tb = FB.f8068g;
        } else {
            Collection collectionEntrySet = ab.entrySet();
            if (((AbstractCollection) collectionEntrySet).isEmpty()) {
                tb = FB.f8068g;
            } else {
                C2165yB c2165yB = (C2165yB) collectionEntrySet;
                J4 j42 = new J4(c2165yB.f17690b.size());
                Iterator it = c2165yB.iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    Object key = entry.getKey();
                    RB rbJ = RB.j(((QB) entry.getValue()).h());
                    if (!rbJ.isEmpty()) {
                        j42.k(key, rbJ);
                        size += rbJ.size();
                    }
                }
                tb = new TB(j42.w(true), size);
            }
        }
        SB sb = tb.f11358f;
        if (sb == null) {
            sb = new SB(tb);
            tb.f11358f = sb;
        }
        AbstractC1896tC abstractC1896tCA = sb.a();
        while (abstractC1896tCA.hasNext()) {
            Map.Entry entry2 = (Map.Entry) abstractC1896tCA.next();
            if (((Long) entry2.getValue()).longValue() > -1 || ((Long) entry2.getValue()).longValue() < -82) {
                throw new J0.c(AbstractC1404k5.a("DkWkogARIjm8VAqEzyEdNWdUqAjIW8EtmA==").concat(String.valueOf(entry2.getValue())));
            }
        }
        HashMap map = new HashMap();
        SB sb2 = tb.f11358f;
        if (sb2 == null) {
            sb2 = new SB(tb);
            tb.f11358f = sb2;
        }
        AbstractC1896tC abstractC1896tCA2 = sb2.a();
        while (abstractC1896tCA2.hasNext()) {
            Map.Entry entry3 = (Map.Entry) abstractC1896tCA2.next();
            EnumC1512m5 enumC1512m5 = (EnumC1512m5) entry3.getKey();
            Long l2 = (Long) entry3.getValue();
            long jLongValue = l2.longValue();
            if (map.containsKey(l2)) {
                String strValueOf = String.valueOf(map.get(l2));
                String strValueOf2 = String.valueOf(enumC1512m5);
                StringBuilder sb3 = new StringBuilder(strValueOf.length() + String.valueOf(jLongValue).length() + 27 + 5 + strValueOf2.length());
                sb3.append(AbstractC1404k5.a("H16u7wATM3S4Tl6egTYIeX5f+xfdXtsmmA=="));
                sb3.append(jLongValue);
                sb3.append(AbstractC1404k5.a("cQk="));
                sb3.append(strValueOf);
                sb3.append(AbstractC1404k5.a("a0ivq0U="));
                sb3.append(strValueOf2);
                throw new J0.c(sb3.toString());
            }
            map.put(l2, enumC1512m5);
        }
        f17829a = map;
    }
}

package com.google.android.gms.internal.measurement;

import j$.util.DesugarCollections;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b5 {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f19619c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final k6 f19620a = new k6();

    /* renamed from: b, reason: collision with root package name */
    public boolean f19621b;

    static {
        new b5(0);
    }

    public b5() {
    }

    public static void b(y4 y4Var, u6 u6Var, int i4, Object obj) {
        if (u6Var == u6.f19953d) {
            Charset charset = n5.f19843a;
            y4Var.S(i4, 3);
            ((g5) ((s4) obj)).d(y4Var);
            y4Var.S(i4, 4);
            return;
        }
        y4Var.S(i4, u6Var.f19956b);
        v6 v6Var = v6.f19971a;
        switch (u6Var.ordinal()) {
            case 0:
                y4Var.e0(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                y4Var.c0(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                y4Var.d0(((Long) obj).longValue());
                break;
            case 3:
                y4Var.d0(((Long) obj).longValue());
                break;
            case 4:
                y4Var.a0(((Integer) obj).intValue());
                break;
            case 5:
                y4Var.e0(((Long) obj).longValue());
                break;
            case 6:
                y4Var.c0(((Integer) obj).intValue());
                break;
            case 7:
                y4Var.Z(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof x4)) {
                    y4Var.g0((String) obj);
                    break;
                } else {
                    y4Var.Y((x4) obj);
                    break;
                }
            case 9:
                ((g5) ((s4) obj)).d(y4Var);
                break;
            case 10:
                y4Var.getClass();
                g5 g5Var = (g5) ((s4) obj);
                y4Var.b0(g5Var.k());
                g5Var.d(y4Var);
                break;
            case 11:
                if (!(obj instanceof x4)) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    y4Var.b0(length);
                    y4Var.f0(length, bArr);
                    break;
                } else {
                    y4Var.Y((x4) obj);
                    break;
                }
            case 12:
                y4Var.b0(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof i5)) {
                    y4Var.a0(((Integer) obj).intValue());
                    break;
                } else {
                    y4Var.a0(((i5) obj).b());
                    break;
                }
            case 14:
                y4Var.c0(((Integer) obj).intValue());
                break;
            case 15:
                y4Var.e0(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                y4Var.b0((iIntValue >> 31) ^ (iIntValue + iIntValue));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                y4Var.d0((jLongValue >> 63) ^ (jLongValue + jLongValue));
                break;
        }
    }

    public final void a() {
        if (this.f19621b) {
            return;
        }
        k6 k6Var = this.f19620a;
        int i4 = k6Var.f19803b;
        for (int i10 = 0; i10 < i4; i10++) {
            Object obj = k6Var.a(i10).f19815b;
            if (obj instanceof g5) {
                ((g5) obj).g();
            }
        }
        Iterator it = k6Var.b().iterator();
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            if (value instanceof g5) {
                ((g5) value).g();
            }
        }
        if (!k6Var.f19805d) {
            if (k6Var.f19803b > 0) {
                k6Var.a(0).f19814a.getClass();
                throw new ClassCastException();
            }
            Iterator it2 = k6Var.b().iterator();
            if (it2.hasNext()) {
                ((Map.Entry) it2.next()).getKey().getClass();
                throw new ClassCastException();
            }
        }
        if (!k6Var.f19805d) {
            k6Var.f19804c = k6Var.f19804c.isEmpty() ? Collections.EMPTY_MAP : DesugarCollections.unmodifiableMap(k6Var.f19804c);
            k6Var.f19807f = k6Var.f19807f.isEmpty() ? Collections.EMPTY_MAP : DesugarCollections.unmodifiableMap(k6Var.f19807f);
            k6Var.f19805d = true;
        }
        this.f19621b = true;
    }

    public final Object clone() {
        b5 b5Var = new b5();
        k6 k6Var = this.f19620a;
        if (k6Var.f19803b > 0) {
            k6Var.a(0).f19814a.getClass();
            throw new ClassCastException();
        }
        Iterator it = k6Var.b().iterator();
        if (!it.hasNext()) {
            return b5Var;
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (entry.getKey() != null) {
            throw new ClassCastException();
        }
        entry.getValue();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b5) {
            return this.f19620a.equals(((b5) obj).f19620a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f19620a.hashCode();
    }

    public b5(int i4) {
        a();
        a();
    }
}

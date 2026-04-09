package com.google.android.gms.internal.ads;

import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ln1 {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f13558c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final zo1 f13559a = new zo1();

    /* renamed from: b, reason: collision with root package name */
    public boolean f13560b;

    static {
        new ln1(0);
    }

    public ln1() {
    }

    public static void b(hn1 hn1Var, lp1 lp1Var, int i4, Object obj) {
        if (lp1Var == lp1.f13575d) {
            hn1Var.M(i4, 3);
            ((qn1) ((qm1) obj)).v(hn1Var);
            hn1Var.M(i4, 4);
            return;
        }
        hn1Var.M(i4, lp1Var.f13579b);
        mp1 mp1Var = mp1.f13985a;
        switch (lp1Var.ordinal()) {
            case 0:
                hn1Var.e0(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                hn1Var.c0(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                hn1Var.d0(((Long) obj).longValue());
                break;
            case 3:
                hn1Var.d0(((Long) obj).longValue());
                break;
            case 4:
                hn1Var.a0(((Integer) obj).intValue());
                break;
            case 5:
                hn1Var.e0(((Long) obj).longValue());
                break;
            case 6:
                hn1Var.c0(((Integer) obj).intValue());
                break;
            case 7:
                hn1Var.Z(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof bn1)) {
                    hn1Var.f0((String) obj);
                    break;
                } else {
                    hn1Var.W((bn1) obj);
                    break;
                }
            case 9:
                ((qn1) ((qm1) obj)).v(hn1Var);
                break;
            case 10:
                hn1Var.Y((qm1) obj);
                break;
            case 11:
                if (!(obj instanceof bn1)) {
                    byte[] bArr = (byte[]) obj;
                    hn1Var.X(bArr.length, bArr);
                    break;
                } else {
                    hn1Var.W((bn1) obj);
                    break;
                }
            case 12:
                hn1Var.b0(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof sn1)) {
                    hn1Var.a0(((Integer) obj).intValue());
                    break;
                } else {
                    hn1Var.a0(((sn1) obj).b());
                    break;
                }
            case 14:
                hn1Var.c0(((Integer) obj).intValue());
                break;
            case 15:
                hn1Var.e0(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                hn1Var.b0((iIntValue >> 31) ^ (iIntValue + iIntValue));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                hn1Var.d0((jLongValue >> 63) ^ (jLongValue + jLongValue));
                break;
        }
    }

    public final void a() {
        if (this.f13560b) {
            return;
        }
        zo1 zo1Var = this.f13559a;
        int i4 = zo1Var.f19137b;
        for (int i10 = 0; i10 < i4; i10++) {
            Object obj = zo1Var.a(i10).f9384b;
            if (obj instanceof qn1) {
                ((qn1) obj).q();
            }
        }
        Iterator it = zo1Var.b().iterator();
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            if (value instanceof qn1) {
                ((qn1) value).q();
            }
        }
        if (!zo1Var.f19139d) {
            if (zo1Var.f19137b > 0) {
                zo1Var.a(0).f9383a.getClass();
                throw new ClassCastException();
            }
            Iterator it2 = zo1Var.b().iterator();
            if (it2.hasNext()) {
                ((Map.Entry) it2.next()).getKey().getClass();
                throw new ClassCastException();
            }
        }
        if (!zo1Var.f19139d) {
            zo1Var.f19138c = zo1Var.f19138c.isEmpty() ? Collections.EMPTY_MAP : DesugarCollections.unmodifiableMap(zo1Var.f19138c);
            zo1Var.f19141f = zo1Var.f19141f.isEmpty() ? Collections.EMPTY_MAP : DesugarCollections.unmodifiableMap(zo1Var.f19141f);
            zo1Var.f19139d = true;
        }
        this.f13560b = true;
    }

    public final Object clone() {
        ln1 ln1Var = new ln1();
        zo1 zo1Var = this.f13559a;
        if (zo1Var.f19137b > 0) {
            zo1Var.a(0).f9383a.getClass();
            throw new ClassCastException();
        }
        Iterator it = zo1Var.b().iterator();
        if (!it.hasNext()) {
            return ln1Var;
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
        if (obj instanceof ln1) {
            return this.f13559a.equals(((ln1) obj).f13559a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f13559a.hashCode();
    }

    public ln1(int i4) {
        a();
        a();
    }
}

package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class c5 {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f4930c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final l6 f4931a = new l6();

    /* renamed from: b, reason: collision with root package name */
    public boolean f4932b;

    static {
        new c5(0);
    }

    public c5() {
    }

    public static void b(z4 z4Var, v6 v6Var, int i10, Object obj) throws androidx.datastore.preferences.protobuf.m {
        if (v6Var == v6.zzj) {
            Charset charset = o5.f5148a;
            z4Var.m0(i10, 3);
            ((h5) ((s4) obj)).d(z4Var);
            z4Var.m0(i10, 4);
            return;
        }
        z4Var.m0(i10, v6Var.zzb());
        w6 w6Var = w6.INT;
        switch (v6Var.ordinal()) {
            case 0:
                z4Var.y0(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                z4Var.w0(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                z4Var.x0(((Long) obj).longValue());
                break;
            case 3:
                z4Var.x0(((Long) obj).longValue());
                break;
            case 4:
                z4Var.u0(((Integer) obj).intValue());
                break;
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                z4Var.y0(((Long) obj).longValue());
                break;
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                z4Var.w0(((Integer) obj).intValue());
                break;
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                z4Var.t0(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                if (!(obj instanceof y4)) {
                    z4Var.A0((String) obj);
                    break;
                } else {
                    z4Var.s0((y4) obj);
                    break;
                }
            case 9:
                ((h5) ((s4) obj)).d(z4Var);
                break;
            case 10:
                z4Var.getClass();
                h5 h5Var = (h5) ((s4) obj);
                z4Var.v0(h5Var.k());
                h5Var.d(z4Var);
                break;
            case 11:
                if (!(obj instanceof y4)) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    z4Var.v0(length);
                    z4Var.z0(length, bArr);
                    break;
                } else {
                    z4Var.s0((y4) obj);
                    break;
                }
            case 12:
                z4Var.v0(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof j5)) {
                    z4Var.u0(((Integer) obj).intValue());
                    break;
                } else {
                    z4Var.u0(((j5) obj).zza());
                    break;
                }
            case 14:
                z4Var.w0(((Integer) obj).intValue());
                break;
            case 15:
                z4Var.y0(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                z4Var.v0((iIntValue >> 31) ^ (iIntValue + iIntValue));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                z4Var.x0((jLongValue >> 63) ^ (jLongValue + jLongValue));
                break;
        }
    }

    public final void a() {
        if (this.f4932b) {
            return;
        }
        l6 l6Var = this.f4931a;
        int i10 = l6Var.f5102d;
        for (int i11 = 0; i11 < i10; i11++) {
            Object obj = l6Var.a(i11).f5124d;
            if (obj instanceof h5) {
                ((h5) obj).g();
            }
        }
        Iterator it = l6Var.b().iterator();
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            if (value instanceof h5) {
                ((h5) value).g();
            }
        }
        if (!l6Var.f5104r) {
            if (l6Var.f5102d > 0) {
                l6Var.a(0).f5123a.getClass();
                throw new ClassCastException();
            }
            Iterator it2 = l6Var.b().iterator();
            if (it2.hasNext()) {
                ((Map.Entry) it2.next()).getKey().getClass();
                throw new ClassCastException();
            }
        }
        if (!l6Var.f5104r) {
            l6Var.f5103g = l6Var.f5103g.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(l6Var.f5103g);
            l6Var.f5106y = l6Var.f5106y.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(l6Var.f5106y);
            l6Var.f5104r = true;
        }
        this.f4932b = true;
    }

    public final Object clone() {
        c5 c5Var = new c5();
        l6 l6Var = this.f4931a;
        if (l6Var.f5102d > 0) {
            l6Var.a(0).f5123a.getClass();
            throw new ClassCastException();
        }
        Iterator it = l6Var.b().iterator();
        if (!it.hasNext()) {
            return c5Var;
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
        if (obj instanceof c5) {
            return this.f4931a.equals(((c5) obj).f4931a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4931a.hashCode();
    }

    public c5(int i10) {
        a();
        a();
    }
}

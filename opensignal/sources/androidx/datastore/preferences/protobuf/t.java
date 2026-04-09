package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f1350c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final f1 f1351a = f1.f();

    /* renamed from: b, reason: collision with root package name */
    public boolean f1352b;

    static {
        new t(0);
    }

    public t() {
    }

    public static void b(n nVar, v1 v1Var, int i10, Object obj) {
        if (v1Var == v1.GROUP) {
            nVar.o0(i10, 3);
            ((a) obj).b(nVar);
            nVar.o0(i10, 4);
        }
        nVar.o0(i10, v1Var.getWireType());
        switch (s.f1348b[v1Var.ordinal()]) {
            case 1:
                nVar.i0(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 2:
                nVar.g0(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 3:
                nVar.s0(((Long) obj).longValue());
                break;
            case 4:
                nVar.s0(((Long) obj).longValue());
                break;
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                nVar.k0(((Integer) obj).intValue());
                break;
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                nVar.i0(((Long) obj).longValue());
                break;
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                nVar.g0(((Integer) obj).intValue());
                break;
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                nVar.a0(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 9:
                ((a) obj).b(nVar);
                break;
            case 10:
                a aVar = (a) obj;
                nVar.getClass();
                nVar.q0(((a0) aVar).a(null));
                aVar.b(nVar);
                break;
            case 11:
                if (!(obj instanceof g)) {
                    nVar.n0((String) obj);
                    break;
                } else {
                    nVar.e0((g) obj);
                    break;
                }
            case 12:
                if (!(obj instanceof g)) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    nVar.q0(length);
                    nVar.b0(bArr, 0, length);
                    break;
                } else {
                    nVar.e0((g) obj);
                    break;
                }
            case 13:
                nVar.q0(((Integer) obj).intValue());
                break;
            case 14:
                nVar.g0(((Integer) obj).intValue());
                break;
            case 15:
                nVar.i0(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                nVar.q0((iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                nVar.s0((jLongValue >> 63) ^ (jLongValue << 1));
                break;
            case 18:
                nVar.k0(((Integer) obj).intValue());
                break;
        }
    }

    public final void a() {
        if (this.f1352b) {
            return;
        }
        f1 f1Var = this.f1351a;
        int size = f1Var.f1271a.size();
        for (int i10 = 0; i10 < size; i10++) {
            Map.Entry entryC = f1Var.c(i10);
            if (entryC.getValue() instanceof a0) {
                a0 a0Var = (a0) entryC.getValue();
                a0Var.getClass();
                a1 a1Var = a1.f1244c;
                a1Var.getClass();
                a1Var.a(a0Var.getClass()).c(a0Var);
                a0Var.h();
            }
        }
        if (!f1Var.f1273g) {
            if (f1Var.f1271a.size() > 0) {
                f1Var.c(0).getKey().getClass();
                throw new ClassCastException();
            }
            Iterator it = f1Var.d().iterator();
            if (it.hasNext()) {
                ((Map.Entry) it.next()).getKey().getClass();
                throw new ClassCastException();
            }
        }
        if (!f1Var.f1273g) {
            f1Var.f1272d = f1Var.f1272d.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(f1Var.f1272d);
            f1Var.f1275x = f1Var.f1275x.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(f1Var.f1275x);
            f1Var.f1273g = true;
        }
        this.f1352b = true;
    }

    public final Object clone() {
        t tVar = new t();
        f1 f1Var = this.f1351a;
        if (f1Var.f1271a.size() > 0) {
            Map.Entry entryC = f1Var.c(0);
            if (entryC.getKey() != null) {
                throw new ClassCastException();
            }
            entryC.getValue();
            throw null;
        }
        Iterator it = f1Var.d().iterator();
        if (!it.hasNext()) {
            return tVar;
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
        if (obj instanceof t) {
            return this.f1351a.equals(((t) obj).f1351a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1351a.hashCode();
    }

    public t(int i10) {
        a();
        a();
    }
}

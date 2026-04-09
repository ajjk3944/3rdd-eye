package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class k54 {
    public static final /* synthetic */ int c = 0;
    public final x64 a = new x64();
    public boolean b;

    static {
        new k54(0);
    }

    public k54() {
    }

    public static void b(g54 g54Var, j74 j74Var, int i, Object obj) {
        if (j74Var == j74.i) {
            g54Var.I(i, 3);
            ((p54) ((s44) obj)).v(g54Var);
            g54Var.I(i, 4);
            return;
        }
        g54Var.I(i, j74Var.g);
        k74 k74Var = k74.f;
        switch (j74Var.ordinal()) {
            case 0:
                g54Var.a0(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                g54Var.Y(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                g54Var.Z(((Long) obj).longValue());
                break;
            case 3:
                g54Var.Z(((Long) obj).longValue());
                break;
            case 4:
                g54Var.W(((Integer) obj).intValue());
                break;
            case 5:
                g54Var.a0(((Long) obj).longValue());
                break;
            case 6:
                g54Var.Y(((Integer) obj).intValue());
                break;
            case 7:
                g54Var.V(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof a54)) {
                    g54Var.b0((String) obj);
                    break;
                } else {
                    g54Var.S((a54) obj);
                    break;
                }
            case 9:
                ((p54) ((s44) obj)).v(g54Var);
                break;
            case 10:
                g54Var.U((s44) obj);
                break;
            case 11:
                if (!(obj instanceof a54)) {
                    byte[] bArr = (byte[]) obj;
                    g54Var.T(bArr.length, bArr);
                    break;
                } else {
                    g54Var.S((a54) obj);
                    break;
                }
            case 12:
                g54Var.X(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof r54)) {
                    g54Var.W(((Integer) obj).intValue());
                    break;
                } else {
                    g54Var.W(((r54) obj).a());
                    break;
                }
            case 14:
                g54Var.Y(((Integer) obj).intValue());
                break;
            case 15:
                g54Var.a0(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                g54Var.X((iIntValue >> 31) ^ (iIntValue + iIntValue));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                g54Var.Z((jLongValue >> 63) ^ (jLongValue + jLongValue));
                break;
        }
    }

    public final void a() {
        if (this.b) {
            return;
        }
        x64 x64Var = this.a;
        int i = x64Var.g;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = x64Var.a(i2).g;
            if (obj instanceof p54) {
                ((p54) obj).q();
            }
        }
        Iterator it = x64Var.b().iterator();
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            if (value instanceof p54) {
                ((p54) value).q();
            }
        }
        if (!x64Var.i) {
            if (x64Var.g > 0) {
                x64Var.a(0).f.getClass();
                throw new ClassCastException();
            }
            Iterator it2 = x64Var.b().iterator();
            if (it2.hasNext()) {
                ((Map.Entry) it2.next()).getKey().getClass();
                throw new ClassCastException();
            }
        }
        if (!x64Var.i) {
            x64Var.h = x64Var.h.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(x64Var.h);
            x64Var.k = x64Var.k.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(x64Var.k);
            x64Var.i = true;
        }
        this.b = true;
    }

    public final Object clone() {
        k54 k54Var = new k54();
        x64 x64Var = this.a;
        if (x64Var.g > 0) {
            x64Var.a(0).f.getClass();
            throw new ClassCastException();
        }
        Iterator it = x64Var.b().iterator();
        if (!it.hasNext()) {
            return k54Var;
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
        if (obj instanceof k54) {
            return this.a.equals(((k54) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public k54(int i) {
        a();
        a();
    }
}

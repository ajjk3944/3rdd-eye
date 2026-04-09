package androidx.datastore.preferences.protobuf;

import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f1042c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final z0 f1043a = z0.f();

    /* renamed from: b, reason: collision with root package name */
    public boolean f1044b;

    static {
        new r(0);
    }

    public r() {
    }

    public static void b(m mVar, s1 s1Var, int i4, Object obj) {
        if (s1Var == s1.f1053d) {
            mVar.e0(i4, 3);
            ((a) obj).b(mVar);
            mVar.e0(i4, 4);
        }
        mVar.e0(i4, s1Var.f1057b);
        switch (s1Var.ordinal()) {
            case 0:
                mVar.Y(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                mVar.W(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                mVar.i0(((Long) obj).longValue());
                break;
            case 3:
                mVar.i0(((Long) obj).longValue());
                break;
            case 4:
                mVar.a0(((Integer) obj).intValue());
                break;
            case 5:
                mVar.Y(((Long) obj).longValue());
                break;
            case 6:
                mVar.W(((Integer) obj).intValue());
                break;
            case 7:
                mVar.Q(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof g)) {
                    mVar.d0((String) obj);
                    break;
                } else {
                    mVar.U((g) obj);
                    break;
                }
            case 9:
                ((a) obj).b(mVar);
                break;
            case 10:
                a aVar = (a) obj;
                mVar.getClass();
                mVar.g0(((w) aVar).a(null));
                aVar.b(mVar);
                break;
            case 11:
                if (!(obj instanceof g)) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    mVar.g0(length);
                    mVar.R(bArr, 0, length);
                    break;
                } else {
                    mVar.U((g) obj);
                    break;
                }
            case 12:
                mVar.g0(((Integer) obj).intValue());
                break;
            case 13:
                mVar.a0(((Integer) obj).intValue());
                break;
            case 14:
                mVar.W(((Integer) obj).intValue());
                break;
            case 15:
                mVar.Y(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                mVar.g0((iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                mVar.i0((jLongValue >> 63) ^ (jLongValue << 1));
                break;
        }
    }

    public final void a() {
        if (this.f1044b) {
            return;
        }
        z0 z0Var = this.f1043a;
        int size = z0Var.f1087a.size();
        for (int i4 = 0; i4 < size; i4++) {
            Map.Entry entryC = z0Var.c(i4);
            if (entryC.getValue() instanceof w) {
                w wVar = (w) entryC.getValue();
                wVar.getClass();
                u0 u0Var = u0.f1071c;
                u0Var.getClass();
                u0Var.a(wVar.getClass()).c(wVar);
                wVar.h();
            }
        }
        if (!z0Var.f1089c) {
            if (z0Var.f1087a.size() > 0) {
                z0Var.c(0).getKey().getClass();
                throw new ClassCastException();
            }
            Iterator it = z0Var.d().iterator();
            if (it.hasNext()) {
                ((Map.Entry) it.next()).getKey().getClass();
                throw new ClassCastException();
            }
        }
        if (!z0Var.f1089c) {
            z0Var.f1088b = z0Var.f1088b.isEmpty() ? Collections.EMPTY_MAP : DesugarCollections.unmodifiableMap(z0Var.f1088b);
            z0Var.f1091e = z0Var.f1091e.isEmpty() ? Collections.EMPTY_MAP : DesugarCollections.unmodifiableMap(z0Var.f1091e);
            z0Var.f1089c = true;
        }
        this.f1044b = true;
    }

    public final Object clone() {
        r rVar = new r();
        z0 z0Var = this.f1043a;
        if (z0Var.f1087a.size() > 0) {
            Map.Entry entryC = z0Var.c(0);
            if (entryC.getKey() != null) {
                throw new ClassCastException();
            }
            entryC.getValue();
            throw null;
        }
        Iterator it = z0Var.d().iterator();
        if (!it.hasNext()) {
            return rVar;
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
        if (obj instanceof r) {
            return this.f1043a.equals(((r) obj).f1043a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1043a.hashCode();
    }

    public r(int i4) {
        a();
        a();
    }
}

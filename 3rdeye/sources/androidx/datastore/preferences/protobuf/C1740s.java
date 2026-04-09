package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.B;
import androidx.datastore.preferences.protobuf.C1740s.b;
import androidx.datastore.preferences.protobuf.C1746y;
import androidx.datastore.preferences.protobuf.i0;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Logger;

/* compiled from: FieldSet.java */
/* renamed from: androidx.datastore.preferences.protobuf.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1740s<T extends b<T>> {

    /* renamed from: d, reason: collision with root package name */
    public static final C1740s f15691d = new C1740s(0);

    /* renamed from: a, reason: collision with root package name */
    public final h0 f15692a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f15693b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f15694c;

    /* compiled from: FieldSet.java */
    /* renamed from: androidx.datastore.preferences.protobuf.s$a */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15695a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f15696b;

        static {
            int[] iArr = new int[r0.values().length];
            f15696b = iArr;
            try {
                iArr[r0.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15696b[r0.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15696b[r0.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15696b[r0.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15696b[r0.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15696b[r0.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15696b[r0.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f15696b[r0.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f15696b[r0.GROUP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f15696b[r0.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f15696b[r0.STRING.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f15696b[r0.BYTES.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f15696b[r0.UINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f15696b[r0.SFIXED32.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f15696b[r0.SFIXED64.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f15696b[r0.SINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f15696b[r0.SINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f15696b[r0.ENUM.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[s0.values().length];
            f15695a = iArr2;
            try {
                iArr2[s0.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f15695a[s0.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f15695a[s0.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f15695a[s0.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f15695a[s0.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f15695a[s0.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f15695a[s0.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f15695a[s0.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f15695a[s0.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* compiled from: FieldSet.java */
    /* renamed from: androidx.datastore.preferences.protobuf.s$b */
    public interface b<T extends b<T>> extends Comparable<T> {
        s0 getLiteJavaType();
    }

    public C1740s() {
        this.f15692a = new h0(16);
    }

    public static int b(r0 r0Var, int i, Object obj) {
        int serializedSize;
        int iL;
        int iM = 1;
        int iJ = AbstractC1733k.j(i);
        if (r0Var == r0.GROUP) {
            iJ *= 2;
        }
        switch (a.f15696b[r0Var.ordinal()]) {
            case 1:
                ((Double) obj).getClass();
                Logger logger = AbstractC1733k.f15650b;
                iM = 8;
                return iM + iJ;
            case 2:
                ((Float) obj).getClass();
                Logger logger2 = AbstractC1733k.f15650b;
                iM = 4;
                return iM + iJ;
            case 3:
                iM = AbstractC1733k.m(((Long) obj).longValue());
                return iM + iJ;
            case 4:
                iM = AbstractC1733k.m(((Long) obj).longValue());
                return iM + iJ;
            case 5:
                iM = AbstractC1733k.g(((Integer) obj).intValue());
                return iM + iJ;
            case 6:
                ((Long) obj).getClass();
                Logger logger3 = AbstractC1733k.f15650b;
                iM = 8;
                return iM + iJ;
            case 7:
                ((Integer) obj).getClass();
                Logger logger4 = AbstractC1733k.f15650b;
                iM = 4;
                return iM + iJ;
            case 8:
                ((Boolean) obj).getClass();
                Logger logger5 = AbstractC1733k.f15650b;
                return iM + iJ;
            case 9:
                Logger logger6 = AbstractC1733k.f15650b;
                iM = ((P) obj).getSerializedSize();
                return iM + iJ;
            case 10:
                if (obj instanceof B) {
                    iM = AbstractC1733k.h((B) obj);
                    return iM + iJ;
                }
                Logger logger7 = AbstractC1733k.f15650b;
                serializedSize = ((P) obj).getSerializedSize();
                iL = AbstractC1733k.l(serializedSize);
                iM = iL + serializedSize;
                return iM + iJ;
            case 11:
                iM = obj instanceof AbstractC1730h ? AbstractC1733k.c((AbstractC1730h) obj) : AbstractC1733k.i((String) obj);
                return iM + iJ;
            case 12:
                if (obj instanceof AbstractC1730h) {
                    iM = AbstractC1733k.c((AbstractC1730h) obj);
                    return iM + iJ;
                }
                Logger logger8 = AbstractC1733k.f15650b;
                serializedSize = ((byte[]) obj).length;
                iL = AbstractC1733k.l(serializedSize);
                iM = iL + serializedSize;
                return iM + iJ;
            case 13:
                iM = AbstractC1733k.l(((Integer) obj).intValue());
                return iM + iJ;
            case 14:
                ((Integer) obj).getClass();
                Logger logger9 = AbstractC1733k.f15650b;
                iM = 4;
                return iM + iJ;
            case 15:
                ((Long) obj).getClass();
                Logger logger10 = AbstractC1733k.f15650b;
                iM = 8;
                return iM + iJ;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                iM = AbstractC1733k.l((iIntValue >> 31) ^ (iIntValue << 1));
                return iM + iJ;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                iM = AbstractC1733k.m((jLongValue >> 63) ^ (jLongValue << 1));
                return iM + iJ;
            case 18:
                iM = obj instanceof C1746y.a ? AbstractC1733k.g(((C1746y.a) obj).getNumber()) : AbstractC1733k.g(((Integer) obj).intValue());
                return iM + iJ;
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int c(b<?> bVar, Object obj) {
        bVar.getClass();
        return b(null, 0, obj);
    }

    public static int d(Map.Entry entry) {
        b bVar = (b) entry.getKey();
        entry.getValue();
        bVar.getLiteJavaType();
        throw null;
    }

    public static <T extends b<T>> boolean f(Map.Entry<T, Object> entry) {
        entry.getKey().getLiteJavaType();
        throw null;
    }

    public static void j(AbstractC1733k abstractC1733k, r0 r0Var, int i, Object obj) throws IOException {
        if (r0Var == r0.GROUP) {
            abstractC1733k.F(i, 3);
            ((P) obj).b(abstractC1733k);
            abstractC1733k.F(i, 4);
        }
        abstractC1733k.F(i, r0Var.getWireType());
        switch (a.f15696b[r0Var.ordinal()]) {
            case 1:
                abstractC1733k.w(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 2:
                abstractC1733k.u(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 3:
                abstractC1733k.J(((Long) obj).longValue());
                break;
            case 4:
                abstractC1733k.J(((Long) obj).longValue());
                break;
            case 5:
                abstractC1733k.y(((Integer) obj).intValue());
                break;
            case 6:
                abstractC1733k.w(((Long) obj).longValue());
                break;
            case 7:
                abstractC1733k.u(((Integer) obj).intValue());
                break;
            case 8:
                abstractC1733k.o(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 9:
                ((P) obj).b(abstractC1733k);
                break;
            case 10:
                abstractC1733k.A((P) obj);
                break;
            case 11:
                if (!(obj instanceof AbstractC1730h)) {
                    abstractC1733k.E((String) obj);
                    break;
                } else {
                    abstractC1733k.s((AbstractC1730h) obj);
                    break;
                }
            case 12:
                if (!(obj instanceof AbstractC1730h)) {
                    byte[] bArr = (byte[]) obj;
                    abstractC1733k.q(bArr.length, bArr);
                    break;
                } else {
                    abstractC1733k.s((AbstractC1730h) obj);
                    break;
                }
            case 13:
                abstractC1733k.H(((Integer) obj).intValue());
                break;
            case 14:
                abstractC1733k.u(((Integer) obj).intValue());
                break;
            case 15:
                abstractC1733k.w(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                abstractC1733k.H((iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                abstractC1733k.J((jLongValue >> 63) ^ (jLongValue << 1));
                break;
            case 18:
                if (!(obj instanceof C1746y.a)) {
                    abstractC1733k.y(((Integer) obj).intValue());
                    break;
                } else {
                    abstractC1733k.y(((C1746y.a) obj).getNumber());
                    break;
                }
        }
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1740s<T> clone() {
        h0 h0Var;
        C1740s<T> c1740s = new C1740s<>();
        int i = 0;
        while (true) {
            h0Var = this.f15692a;
            if (i >= h0Var.f15625c.size()) {
                break;
            }
            Map.Entry<Object, Object> entryD = h0Var.d(i);
            c1740s.i((b) entryD.getKey(), entryD.getValue());
            i++;
        }
        for (Map.Entry<Object, Object> entry : h0Var.e()) {
            c1740s.i((b) entry.getKey(), entry.getValue());
        }
        c1740s.f15694c = this.f15694c;
        return c1740s;
    }

    public final boolean e() {
        h0 h0Var = this.f15692a;
        if (h0Var.f15625c.size() > 0) {
            f(h0Var.d(0));
            throw null;
        }
        Iterator<Map.Entry<Object, Object>> it = h0Var.e().iterator();
        if (!it.hasNext()) {
            return true;
        }
        f(it.next());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1740s) {
            return this.f15692a.equals(((C1740s) obj).f15692a);
        }
        return false;
    }

    public final Iterator<Map.Entry<T, Object>> g() {
        boolean z10 = this.f15694c;
        h0 h0Var = this.f15692a;
        return z10 ? new B.b(((i0.f) h0Var.entrySet()).iterator()) : ((i0.f) h0Var.entrySet()).iterator();
    }

    public final void h(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof B) {
            ((B) value).a(null);
        }
        key.getClass();
        key.getLiteJavaType();
        throw null;
    }

    public final int hashCode() {
        return this.f15692a.hashCode();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(T r4, java.lang.Object r5) {
        /*
            r3 = this;
            r0 = 1
            r4.getClass()
            r1 = 0
            java.nio.charset.Charset r2 = androidx.datastore.preferences.protobuf.C1746y.f15707a
            r5.getClass()
            int[] r2 = androidx.datastore.preferences.protobuf.C1740s.a.f15695a
            androidx.datastore.preferences.protobuf.s0 r1 = r1.getJavaType()
            int r1 = r1.ordinal()
            r1 = r2[r1]
            r2 = 0
            switch(r1) {
                case 1: goto L46;
                case 2: goto L43;
                case 3: goto L40;
                case 4: goto L3d;
                case 5: goto L3a;
                case 6: goto L37;
                case 7: goto L2e;
                case 8: goto L25;
                case 9: goto L1b;
                default: goto L1a;
            }
        L1a:
            goto L48
        L1b:
            boolean r1 = r5 instanceof androidx.datastore.preferences.protobuf.P
            if (r1 != 0) goto L23
            boolean r1 = r5 instanceof androidx.datastore.preferences.protobuf.B
            if (r1 == 0) goto L48
        L23:
            r2 = r0
            goto L48
        L25:
            boolean r1 = r5 instanceof java.lang.Integer
            if (r1 != 0) goto L23
            boolean r1 = r5 instanceof androidx.datastore.preferences.protobuf.C1746y.a
            if (r1 == 0) goto L48
            goto L23
        L2e:
            boolean r1 = r5 instanceof androidx.datastore.preferences.protobuf.AbstractC1730h
            if (r1 != 0) goto L23
            boolean r1 = r5 instanceof byte[]
            if (r1 == 0) goto L48
            goto L23
        L37:
            boolean r2 = r5 instanceof java.lang.String
            goto L48
        L3a:
            boolean r2 = r5 instanceof java.lang.Boolean
            goto L48
        L3d:
            boolean r2 = r5 instanceof java.lang.Double
            goto L48
        L40:
            boolean r2 = r5 instanceof java.lang.Float
            goto L48
        L43:
            boolean r2 = r5 instanceof java.lang.Long
            goto L48
        L46:
            boolean r2 = r5 instanceof java.lang.Integer
        L48:
            if (r2 == 0) goto L56
            boolean r1 = r5 instanceof androidx.datastore.preferences.protobuf.B
            if (r1 == 0) goto L50
            r3.f15694c = r0
        L50:
            androidx.datastore.preferences.protobuf.h0 r0 = r3.f15692a
            r0.put(r4, r5)
            return
        L56:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Wrong object type used with protocol message reflection."
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C1740s.i(androidx.datastore.preferences.protobuf.s$b, java.lang.Object):void");
    }

    public C1740s(int i) {
        int i10 = i0.i;
        h0 h0Var = new h0(0);
        this.f15692a = h0Var;
        if (!this.f15693b) {
            h0Var.g();
            this.f15693b = true;
        }
        if (this.f15693b) {
            return;
        }
        h0Var.g();
        this.f15693b = true;
    }
}

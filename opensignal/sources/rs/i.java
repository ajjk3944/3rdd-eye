package rs;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: c, reason: collision with root package name */
    public static final i f21759c = new i(0);

    /* renamed from: a, reason: collision with root package name */
    public final b0 f21760a = new b0(16);

    /* renamed from: b, reason: collision with root package name */
    public boolean f21761b;

    public i() {
    }

    public static int c(j0 j0Var, Object obj) throws UnsupportedEncodingException {
        switch (h.f21757b[j0Var.ordinal()]) {
            case 1:
                ((Double) obj).getClass();
                return 8;
            case 2:
                ((Float) obj).getClass();
                return 4;
            case 3:
                return b5.m.q(((Long) obj).longValue());
            case 4:
                return b5.m.q(((Long) obj).longValue());
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                return b5.m.m(((Integer) obj).intValue());
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                ((Long) obj).getClass();
                return 8;
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                ((Integer) obj).getClass();
                return 4;
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                ((Boolean) obj).getClass();
                return 1;
            case 9:
                try {
                    byte[] bytes = ((String) obj).getBytes("UTF-8");
                    return b5.m.p(bytes.length) + bytes.length;
                } catch (UnsupportedEncodingException e4) {
                    throw new RuntimeException("UTF-8 not supported.", e4);
                }
            case 10:
                if (obj instanceof e) {
                    e eVar = (e) obj;
                    return eVar.size() + b5.m.p(eVar.size());
                }
                byte[] bArr = (byte[]) obj;
                return b5.m.p(bArr.length) + bArr.length;
            case 11:
                return b5.m.p(((Integer) obj).intValue());
            case 12:
                ((Integer) obj).getClass();
                return 4;
            case 13:
                ((Long) obj).getClass();
                return 8;
            case 14:
                int iIntValue = ((Integer) obj).intValue();
                return b5.m.p((iIntValue >> 31) ^ (iIntValue << 1));
            case 15:
                long jLongValue = ((Long) obj).longValue();
                return b5.m.q((jLongValue >> 63) ^ (jLongValue << 1));
            case 16:
                return ((b) obj).c();
            case 17:
                return b5.m.o((b) obj);
            case 18:
                return obj instanceof q ? b5.m.m(((q) obj).getNumber()) : b5.m.m(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int d(n nVar, Object obj) {
        j0 j0Var = nVar.f21768d;
        int i10 = nVar.f21767a;
        if (!nVar.f21769g) {
            int iR = b5.m.r(i10);
            if (j0Var == j0.GROUP) {
                iR *= 2;
            }
            return c(j0Var, obj) + iR;
        }
        int iC = 0;
        for (Object obj2 : (List) obj) {
            int iR2 = b5.m.r(i10);
            if (j0Var == j0.GROUP) {
                iR2 *= 2;
            }
            iC += c(j0Var, obj2) + iR2;
        }
        return iC;
    }

    public static boolean e(Map.Entry entry) {
        n nVar = (n) entry.getKey();
        if (nVar.f21768d.getJavaType() != k0.MESSAGE) {
            return true;
        }
        if (!nVar.f21769g) {
            Object value = entry.getValue();
            if (value instanceof b) {
                return ((b) value).b();
            }
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        Iterator it = ((List) entry.getValue()).iterator();
        while (it.hasNext()) {
            if (!((b) it.next()).b()) {
                return false;
            }
        }
        return true;
    }

    public static Object h(f5.u uVar, j0 j0Var) {
        switch (h.f21757b[j0Var.ordinal()]) {
            case 1:
                return Double.valueOf(Double.longBitsToDouble(uVar.p()));
            case 2:
                return Float.valueOf(Float.intBitsToFloat(uVar.o()));
            case 3:
                return Long.valueOf(uVar.r());
            case 4:
                return Long.valueOf(uVar.r());
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                return Integer.valueOf(uVar.q());
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                return Long.valueOf(uVar.p());
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                return Integer.valueOf(uVar.o());
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                return Boolean.valueOf(uVar.r() != 0);
            case 9:
                int iQ = uVar.q();
                int i10 = uVar.f8582a;
                int i11 = uVar.f8584c;
                if (iQ > i10 - i11 || iQ <= 0) {
                    return iQ == 0 ? "" : new String(uVar.n(iQ), "UTF-8");
                }
                String str = new String((byte[]) uVar.f8589h, i11, iQ, "UTF-8");
                uVar.f8584c += iQ;
                return str;
            case 10:
                return uVar.k();
            case 11:
                return Integer.valueOf(uVar.q());
            case 12:
                return Integer.valueOf(uVar.o());
            case 13:
                return Long.valueOf(uVar.p());
            case 14:
                int iQ2 = uVar.q();
                return Integer.valueOf((-(iQ2 & 1)) ^ (iQ2 >>> 1));
            case 15:
                long jR = uVar.r();
                return Long.valueOf((-(jR & 1)) ^ (jR >>> 1));
            case 16:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case 17:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case 18:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void j(rs.j0 r2, java.lang.Object r3) {
        /*
            r3.getClass()
            int[] r0 = rs.h.f21756a
            rs.k0 r2 = r2.getJavaType()
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            r1 = 0
            switch(r2) {
                case 1: goto L3c;
                case 2: goto L39;
                case 3: goto L36;
                case 4: goto L33;
                case 5: goto L30;
                case 6: goto L2d;
                case 7: goto L24;
                case 8: goto L18;
                case 9: goto L15;
                default: goto L14;
            }
        L14:
            goto L3e
        L15:
            boolean r1 = r3 instanceof rs.b
            goto L3e
        L18:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L22
            boolean r2 = r3 instanceof rs.q
            if (r2 == 0) goto L21
            goto L22
        L21:
            r0 = r1
        L22:
            r1 = r0
            goto L3e
        L24:
            boolean r2 = r3 instanceof rs.e
            if (r2 != 0) goto L22
            boolean r2 = r3 instanceof byte[]
            if (r2 == 0) goto L21
            goto L22
        L2d:
            boolean r1 = r3 instanceof java.lang.String
            goto L3e
        L30:
            boolean r1 = r3 instanceof java.lang.Boolean
            goto L3e
        L33:
            boolean r1 = r3 instanceof java.lang.Double
            goto L3e
        L36:
            boolean r1 = r3 instanceof java.lang.Float
            goto L3e
        L39:
            boolean r1 = r3 instanceof java.lang.Long
            goto L3e
        L3c:
            boolean r1 = r3 instanceof java.lang.Integer
        L3e:
            if (r1 == 0) goto L41
            return
        L41:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Wrong object type used with protocol message reflection."
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: rs.i.j(rs.j0, java.lang.Object):void");
    }

    public static void k(b5.m mVar, j0 j0Var, Object obj) {
        switch (h.f21757b[j0Var.ordinal()]) {
            case 1:
                double dDoubleValue = ((Double) obj).doubleValue();
                mVar.getClass();
                mVar.U(Double.doubleToRawLongBits(dDoubleValue));
                break;
            case 2:
                float fFloatValue = ((Float) obj).floatValue();
                mVar.getClass();
                mVar.T(Float.floatToRawIntBits(fFloatValue));
                break;
            case 3:
                mVar.W(((Long) obj).longValue());
                break;
            case 4:
                mVar.W(((Long) obj).longValue());
                break;
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                mVar.N(((Integer) obj).intValue());
                break;
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                mVar.U(((Long) obj).longValue());
                break;
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                mVar.T(((Integer) obj).intValue());
                break;
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                mVar.Q(((Boolean) obj).booleanValue() ? 1 : 0);
                break;
            case 9:
                mVar.getClass();
                byte[] bytes = ((String) obj).getBytes("UTF-8");
                mVar.V(bytes.length);
                mVar.S(bytes);
                break;
            case 10:
                if (!(obj instanceof e)) {
                    byte[] bArr = (byte[]) obj;
                    mVar.getClass();
                    mVar.V(bArr.length);
                    mVar.S(bArr);
                    break;
                } else {
                    e eVar = (e) obj;
                    mVar.getClass();
                    mVar.V(eVar.size());
                    mVar.R(eVar);
                    break;
                }
            case 11:
                mVar.V(((Integer) obj).intValue());
                break;
            case 12:
                mVar.T(((Integer) obj).intValue());
                break;
            case 13:
                mVar.U(((Long) obj).longValue());
                break;
            case 14:
                int iIntValue = ((Integer) obj).intValue();
                mVar.V((iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case 15:
                long jLongValue = ((Long) obj).longValue();
                mVar.W((jLongValue >> 63) ^ (jLongValue << 1));
                break;
            case 16:
                mVar.getClass();
                ((b) obj).f(mVar);
                break;
            case 17:
                mVar.P((b) obj);
                break;
            case 18:
                if (!(obj instanceof q)) {
                    mVar.N(((Integer) obj).intValue());
                    break;
                } else {
                    mVar.N(((q) obj).getNumber());
                    break;
                }
        }
    }

    public final void a(n nVar, Object obj) {
        List arrayList;
        if (!nVar.f21769g) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        j(nVar.f21768d, obj);
        b0 b0Var = this.f21760a;
        Object obj2 = b0Var.get(nVar);
        if (obj2 == null) {
            arrayList = new ArrayList();
            b0Var.put(nVar, arrayList);
        } else {
            arrayList = (List) obj2;
        }
        arrayList.add(obj);
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final i clone() {
        b0 b0Var;
        i iVar = new i();
        int i10 = 0;
        while (true) {
            b0Var = this.f21760a;
            if (i10 >= b0Var.f21735d.size()) {
                break;
            }
            Map.Entry entry = (Map.Entry) b0Var.f21735d.get(i10);
            iVar.i((n) entry.getKey(), entry.getValue());
            i10++;
        }
        for (Map.Entry entry2 : b0Var.c()) {
            iVar.i((n) entry2.getKey(), entry2.getValue());
        }
        return iVar;
    }

    public final void f() {
        if (this.f21761b) {
            return;
        }
        b0 b0Var = this.f21760a;
        if (!b0Var.f21737r) {
            for (int i10 = 0; i10 < b0Var.f21735d.size(); i10++) {
                Map.Entry entry = (Map.Entry) b0Var.f21735d.get(i10);
                if (((n) entry.getKey()).f21769g) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
            for (Map.Entry entry2 : b0Var.c()) {
                if (((n) entry2.getKey()).f21769g) {
                    entry2.setValue(Collections.unmodifiableList((List) entry2.getValue()));
                }
            }
        }
        if (!b0Var.f21737r) {
            b0Var.f21736g = b0Var.f21736g.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(b0Var.f21736g);
            b0Var.f21737r = true;
        }
        this.f21761b = true;
    }

    public final void g(Map.Entry entry) {
        n nVar = (n) entry.getKey();
        Object value = entry.getValue();
        boolean z10 = nVar.f21769g;
        b0 b0Var = this.f21760a;
        if (z10) {
            Object arrayList = b0Var.get(nVar);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            for (Object obj : (List) value) {
                List list = (List) arrayList;
                if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    byte[] bArr2 = new byte[bArr.length];
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    obj = bArr2;
                }
                list.add(obj);
            }
            b0Var.put(nVar, arrayList);
            return;
        }
        if (nVar.f21768d.getJavaType() != k0.MESSAGE) {
            if (value instanceof byte[]) {
                byte[] bArr3 = (byte[]) value;
                byte[] bArr4 = new byte[bArr3.length];
                System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
                value = bArr4;
            }
            b0Var.put(nVar, value);
            return;
        }
        Object obj2 = b0Var.get(nVar);
        if (obj2 != null) {
            b0Var.put(nVar, ((b) obj2).e().e((p) ((b) value)).c());
            return;
        }
        if (value instanceof byte[]) {
            byte[] bArr5 = (byte[]) value;
            byte[] bArr6 = new byte[bArr5.length];
            System.arraycopy(bArr5, 0, bArr6, 0, bArr5.length);
            value = bArr6;
        }
        b0Var.put(nVar, value);
    }

    public final void i(n nVar, Object obj) {
        boolean z10 = nVar.f21769g;
        j0 j0Var = nVar.f21768d;
        if (!z10) {
            j(j0Var, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                j(j0Var, it.next());
            }
            obj = arrayList;
        }
        this.f21760a.put(nVar, obj);
    }

    public i(int i10) {
        f();
    }
}

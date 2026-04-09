package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.protobuf.i;
import kotlin.reflect.jvm.internal.impl.protobuf.n;
import kotlin.reflect.jvm.internal.impl.protobuf.v;

/* loaded from: classes4.dex */
final class g {

    /* renamed from: d, reason: collision with root package name */
    private static final g f51969d = new g(true);

    /* renamed from: b, reason: collision with root package name */
    private boolean f51971b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f51972c = false;

    /* renamed from: a, reason: collision with root package name */
    private final s f51970a = s.r(16);

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f51973a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f51974b;

        static {
            int[] iArr = new int[v.b.values().length];
            f51974b = iArr;
            try {
                iArr[v.b.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f51974b[v.b.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f51974b[v.b.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f51974b[v.b.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f51974b[v.b.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f51974b[v.b.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f51974b[v.b.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f51974b[v.b.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f51974b[v.b.STRING.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f51974b[v.b.BYTES.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f51974b[v.b.UINT32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f51974b[v.b.SFIXED32.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f51974b[v.b.SFIXED64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f51974b[v.b.SINT32.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f51974b[v.b.SINT64.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f51974b[v.b.GROUP.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f51974b[v.b.MESSAGE.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f51974b[v.b.ENUM.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[v.c.values().length];
            f51973a = iArr2;
            try {
                iArr2[v.c.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f51973a[v.c.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f51973a[v.c.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f51973a[v.c.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f51973a[v.c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f51973a[v.c.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f51973a[v.c.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f51973a[v.c.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f51973a[v.c.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    public interface b extends Comparable {
        n.a F(n.a aVar, n nVar);

        v.c M0();

        int getNumber();

        boolean isPacked();

        boolean m();

        v.b o();
    }

    private g() {
    }

    private Object c(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    private static int d(v.b bVar, int i10, Object obj) {
        int iC = CodedOutputStream.C(i10);
        if (bVar == v.b.GROUP) {
            iC *= 2;
        }
        return iC + e(bVar, obj);
    }

    private static int e(v.b bVar, Object obj) {
        switch (a.f51974b[bVar.ordinal()]) {
            case 1:
                return CodedOutputStream.g(((Double) obj).doubleValue());
            case 2:
                return CodedOutputStream.m(((Float) obj).floatValue());
            case 3:
                return CodedOutputStream.q(((Long) obj).longValue());
            case 4:
                return CodedOutputStream.E(((Long) obj).longValue());
            case 5:
                return CodedOutputStream.p(((Integer) obj).intValue());
            case 6:
                return CodedOutputStream.k(((Long) obj).longValue());
            case 7:
                return CodedOutputStream.j(((Integer) obj).intValue());
            case 8:
                return CodedOutputStream.b(((Boolean) obj).booleanValue());
            case 9:
                return CodedOutputStream.B((String) obj);
            case 10:
                return obj instanceof d ? CodedOutputStream.e((d) obj) : CodedOutputStream.c((byte[]) obj);
            case 11:
                return CodedOutputStream.D(((Integer) obj).intValue());
            case 12:
                return CodedOutputStream.w(((Integer) obj).intValue());
            case 13:
                return CodedOutputStream.x(((Long) obj).longValue());
            case 14:
                return CodedOutputStream.y(((Integer) obj).intValue());
            case 15:
                return CodedOutputStream.A(((Long) obj).longValue());
            case 16:
                return CodedOutputStream.n((n) obj);
            case 17:
                return CodedOutputStream.s((n) obj);
            case 18:
                return obj instanceof i.a ? CodedOutputStream.i(((i.a) obj).getNumber()) : CodedOutputStream.i(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int f(b bVar, Object obj) {
        v.b bVarO = bVar.o();
        int number = bVar.getNumber();
        if (!bVar.m()) {
            return d(bVarO, number, obj);
        }
        int iD = 0;
        if (bVar.isPacked()) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                iD += e(bVarO, it.next());
            }
            return CodedOutputStream.C(number) + iD + CodedOutputStream.u(iD);
        }
        Iterator it2 = ((List) obj).iterator();
        while (it2.hasNext()) {
            iD += d(bVarO, number, it2.next());
        }
        return iD;
    }

    public static g g() {
        return f51969d;
    }

    static int l(v.b bVar, boolean z10) {
        if (z10) {
            return 2;
        }
        return bVar.getWireType();
    }

    private boolean o(Map.Entry entry) {
        b bVar = (b) entry.getKey();
        if (bVar.M0() != v.c.MESSAGE) {
            return true;
        }
        if (!bVar.m()) {
            Object value = entry.getValue();
            if (value instanceof n) {
                return ((n) value).m();
            }
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        Iterator it = ((List) entry.getValue()).iterator();
        while (it.hasNext()) {
            if (!((n) it.next()).m()) {
                return false;
            }
        }
        return true;
    }

    private void s(Map.Entry entry) {
        b bVar = (b) entry.getKey();
        Object value = entry.getValue();
        if (bVar.m()) {
            Object objH = h(bVar);
            if (objH == null) {
                objH = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) objH).add(c(it.next()));
            }
            this.f51970a.s(bVar, objH);
            return;
        }
        if (bVar.M0() != v.c.MESSAGE) {
            this.f51970a.s(bVar, c(value));
            return;
        }
        Object objH2 = h(bVar);
        if (objH2 == null) {
            this.f51970a.s(bVar, c(value));
        } else {
            this.f51970a.s(bVar, bVar.F(((n) objH2).l(), (n) value).a());
        }
    }

    public static g t() {
        return new g();
    }

    public static Object u(e eVar, v.b bVar, boolean z10) {
        switch (a.f51974b[bVar.ordinal()]) {
            case 1:
                return Double.valueOf(eVar.l());
            case 2:
                return Float.valueOf(eVar.p());
            case 3:
                return Long.valueOf(eVar.s());
            case 4:
                return Long.valueOf(eVar.L());
            case 5:
                return Integer.valueOf(eVar.r());
            case 6:
                return Long.valueOf(eVar.o());
            case 7:
                return Integer.valueOf(eVar.n());
            case 8:
                return Boolean.valueOf(eVar.j());
            case 9:
                return z10 ? eVar.I() : eVar.H();
            case 10:
                return eVar.k();
            case 11:
                return Integer.valueOf(eVar.K());
            case 12:
                return Integer.valueOf(eVar.D());
            case 13:
                return Long.valueOf(eVar.E());
            case 14:
                return Integer.valueOf(eVar.F());
            case 15:
                return Long.valueOf(eVar.G());
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
    private static void w(kotlin.reflect.jvm.internal.impl.protobuf.v.b r2, java.lang.Object r3) {
        /*
            r3.getClass()
            int[] r0 = kotlin.reflect.jvm.internal.impl.protobuf.g.a.f51973a
            kotlin.reflect.jvm.internal.impl.protobuf.v$c r2 = r2.getJavaType()
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
            boolean r1 = r3 instanceof kotlin.reflect.jvm.internal.impl.protobuf.n
            goto L3e
        L18:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L22
            boolean r2 = r3 instanceof kotlin.reflect.jvm.internal.impl.protobuf.i.a
            if (r2 == 0) goto L21
            goto L22
        L21:
            r0 = r1
        L22:
            r1 = r0
            goto L3e
        L24:
            boolean r2 = r3 instanceof kotlin.reflect.jvm.internal.impl.protobuf.d
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
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.g.w(kotlin.reflect.jvm.internal.impl.protobuf.v$b, java.lang.Object):void");
    }

    private static void x(CodedOutputStream codedOutputStream, v.b bVar, int i10, Object obj) throws IOException {
        if (bVar == v.b.GROUP) {
            codedOutputStream.X(i10, (n) obj);
        } else {
            codedOutputStream.v0(i10, l(bVar, false));
            y(codedOutputStream, bVar, obj);
        }
    }

    private static void y(CodedOutputStream codedOutputStream, v.b bVar, Object obj) throws IOException {
        switch (a.f51974b[bVar.ordinal()]) {
            case 1:
                codedOutputStream.Q(((Double) obj).doubleValue());
                break;
            case 2:
                codedOutputStream.W(((Float) obj).floatValue());
                break;
            case 3:
                codedOutputStream.b0(((Long) obj).longValue());
                break;
            case 4:
                codedOutputStream.y0(((Long) obj).longValue());
                break;
            case 5:
                codedOutputStream.a0(((Integer) obj).intValue());
                break;
            case 6:
                codedOutputStream.U(((Long) obj).longValue());
                break;
            case 7:
                codedOutputStream.T(((Integer) obj).intValue());
                break;
            case 8:
                codedOutputStream.L(((Boolean) obj).booleanValue());
                break;
            case 9:
                codedOutputStream.u0((String) obj);
                break;
            case 10:
                if (!(obj instanceof d)) {
                    codedOutputStream.M((byte[]) obj);
                    break;
                } else {
                    codedOutputStream.O((d) obj);
                    break;
                }
            case 11:
                codedOutputStream.x0(((Integer) obj).intValue());
                break;
            case 12:
                codedOutputStream.p0(((Integer) obj).intValue());
                break;
            case 13:
                codedOutputStream.q0(((Long) obj).longValue());
                break;
            case 14:
                codedOutputStream.r0(((Integer) obj).intValue());
                break;
            case 15:
                codedOutputStream.t0(((Long) obj).longValue());
                break;
            case 16:
                codedOutputStream.Y((n) obj);
                break;
            case 17:
                codedOutputStream.d0((n) obj);
                break;
            case 18:
                if (!(obj instanceof i.a)) {
                    codedOutputStream.S(((Integer) obj).intValue());
                    break;
                } else {
                    codedOutputStream.S(((i.a) obj).getNumber());
                    break;
                }
        }
    }

    public static void z(b bVar, Object obj, CodedOutputStream codedOutputStream) throws IOException {
        v.b bVarO = bVar.o();
        int number = bVar.getNumber();
        if (!bVar.m()) {
            x(codedOutputStream, bVarO, number, obj);
            return;
        }
        List list = (List) obj;
        if (!bVar.isPacked()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                x(codedOutputStream, bVarO, number, it.next());
            }
            return;
        }
        codedOutputStream.v0(number, 2);
        Iterator it2 = list.iterator();
        int iE = 0;
        while (it2.hasNext()) {
            iE += e(bVarO, it2.next());
        }
        codedOutputStream.n0(iE);
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            y(codedOutputStream, bVarO, it3.next());
        }
    }

    public void a(b bVar, Object obj) {
        List arrayList;
        if (!bVar.m()) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        w(bVar.o(), obj);
        Object objH = h(bVar);
        if (objH == null) {
            arrayList = new ArrayList();
            this.f51970a.s(bVar, arrayList);
        } else {
            arrayList = (List) objH;
        }
        arrayList.add(obj);
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public g clone() {
        g gVarT = t();
        for (int i10 = 0; i10 < this.f51970a.k(); i10++) {
            Map.Entry entryJ = this.f51970a.j(i10);
            gVarT.v((b) entryJ.getKey(), entryJ.getValue());
        }
        for (Map.Entry entry : this.f51970a.l()) {
            gVarT.v((b) entry.getKey(), entry.getValue());
        }
        gVarT.f51972c = this.f51972c;
        return gVarT;
    }

    public Object h(b bVar) {
        return this.f51970a.get(bVar);
    }

    public Object i(b bVar, int i10) {
        if (!bVar.m()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object objH = h(bVar);
        if (objH != null) {
            return ((List) objH).get(i10);
        }
        throw new IndexOutOfBoundsException();
    }

    public int j(b bVar) {
        if (!bVar.m()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object objH = h(bVar);
        if (objH == null) {
            return 0;
        }
        return ((List) objH).size();
    }

    public int k() {
        int iF = 0;
        for (int i10 = 0; i10 < this.f51970a.k(); i10++) {
            Map.Entry entryJ = this.f51970a.j(i10);
            iF += f((b) entryJ.getKey(), entryJ.getValue());
        }
        for (Map.Entry entry : this.f51970a.l()) {
            iF += f((b) entry.getKey(), entry.getValue());
        }
        return iF;
    }

    public boolean m(b bVar) {
        if (bVar.m()) {
            throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }
        return this.f51970a.get(bVar) != null;
    }

    public boolean n() {
        for (int i10 = 0; i10 < this.f51970a.k(); i10++) {
            if (!o(this.f51970a.j(i10))) {
                return false;
            }
        }
        Iterator it = this.f51970a.l().iterator();
        while (it.hasNext()) {
            if (!o((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public Iterator p() {
        return this.f51972c ? new j(this.f51970a.entrySet().iterator()) : this.f51970a.entrySet().iterator();
    }

    public void q() {
        if (this.f51971b) {
            return;
        }
        this.f51970a.q();
        this.f51971b = true;
    }

    public void r(g gVar) {
        for (int i10 = 0; i10 < gVar.f51970a.k(); i10++) {
            s(gVar.f51970a.j(i10));
        }
        Iterator it = gVar.f51970a.l().iterator();
        while (it.hasNext()) {
            s((Map.Entry) it.next());
        }
    }

    public void v(b bVar, Object obj) {
        if (!bVar.m()) {
            w(bVar.o(), obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                w(bVar.o(), it.next());
            }
            obj = arrayList;
        }
        this.f51970a.s(bVar, obj);
    }

    private g(boolean z10) {
        q();
    }
}
